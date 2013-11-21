import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.Token;

import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * Minificador de código JavaScript.
 * 
 * @since 1.0
 * @author André Werlang
 * @author Cassiano Mendes
 *
 */
public class JsMin {

	/**
	 * 
	 */
	private final TreeAdaptor adaptor;
	
	/**
	 * Variáveis do código com suas respectivas substituições.
	 */
	private static HashMap<String, String> memory = new HashMap<String, String>();
	
	/**
	 * Se o parser encontrou o trecho de código
	 * que representa o(s) parâmetro(s) de uma função.
	 */
	private boolean ehParamFunction = false;
	
	/**
	 * Utilizado para verificar se o token corrente é uma variável.
	 */
	private boolean ehVar = false;
	
	/**
	 * Utilizado para verificar se o trecho analisado representa
	 * uma declaração de variável.
	 */
	private boolean varDef = false;
	
	/**
	 * Determina o nível do bloco (escopo)
	 */
	private int nivelBloco = 0;
	
	/**
	 * Determina o nível do bloco durante a declaração de variável
	 */
	private int nivelVar = 0;
	
	/**
	 * Determina o escopo
	 */
	public static int nivel = 0;
	
	/**
	 * Índice utilizado para criação de identificadores.
	 */
	int idn = 0;
	
	/**
	 * Construtor da classe. Inicializa variáveis utilizadas.
	 */
	public JsMin() {
		this.adaptor = new CommonTreeAdaptor() {
			public Object create(Token payload) {
				return new JsAST(payload);
			}
		};
		
		memory = new HashMap<String, String>();
	}
	
	/**
	 * Cria um novo identificador.
	 * 
	 * @param id Índice auxiliar para criação.
	 * @return Identificador gerado.
	 */
	private String criarId(int id)
	{
		String result = "";
		do
		{
			int dif = 'z' - 'a' + 1;
			result += (char)('a' + id % dif);
			id /= dif;
		} while (id > 0);
		return result;
	}
	
	/**
	 * Verifica se o token é identificador.
	 * 
	 * @param tokenType Tipo do token a ser verificado.
	 * @return Se o token é identificador.
	 */
	public static boolean tokenEhId(int tokenType) {
		return tokenType == JavaScriptParser.Identifier
				|| tokenType >= JavaScriptParser.T__74 && tokenType <= JavaScriptParser.T__101;
	}
	
	/**
	 * 
	 */
	class JsAST extends CommonTree {
		
		/**
		 * Texto do token.
		 */
		public String text;

		/**
		 * Construtor da classe.
		 * 
		 * @param t Token.
		 */
		public JsAST(Token t) {
			super(t);
			this.text = (t != null? t.getText(): "[]");
		}
		
		@Override
		public String toString() {
			if (getType() == 82) return "!1"; // false
			if (getType() == 95) return "!0"; // true

			/* Atualiza a variável que indica o trecho de código 
			 * que corresponde aos parâmetros da função.
			 * 
			 * function  (a, b, c)
			 * function a(b, c)
			 */
			if (text.equals("function")) {
				ehParamFunction = true;
			} else if (text.equals(")")) {
				ehParamFunction = false;
			}
			
			/*
			 * var a, b;
			 * var a = x, b = y;
			 */
			if (nivel > 0)
			{
				if (this.text.equals("var")) {
					ehVar = true;
					varDef = true;
					nivelVar = nivelBloco;
				} else if (getType() == JavaScriptParser.Identifier) {
					// propositalmente do nothing
				} else if (this.text.equals("=")) {
					varDef = false;
				} else if (ehVar && this.text.equals(",") && nivelBloco == nivelVar) {
					varDef = true;
				} else if (this.text.equals(";")) {
					ehVar = false;
					varDef = false;
				}
			}
			
			if (this.text.equals("{")) {
				nivelBloco++;
			} else if (this.text.equals("}")) {
				nivelBloco--;
			}

			if (getType() == JavaScriptParser.Identifier && parent != null && getChildIndex() > 0) { //* Identifier
				boolean criarNovaVariavel = false;
				if (varDef || ehParamFunction && nivel > 0) {
					criarNovaVariavel = true;
				}

				JsAST prev = (JsAST)parent.getChild(getChildIndex()-1);	
				String strp = prev.text;

				boolean objLiteralProp = ehVar && 
										 nivelBloco > nivelVar && 
										 parent.getChildCount() > getChildIndex() + 1 && 
										 ((JsAST)parent.getChild(getChildIndex()+1)).text.equals(":");
				
				if (criarNovaVariavel) {
					String ren = memory.get(this.text);
					if (ren == null) {
						ren = criarId(idn++); //* a
						memory.put(this.text, ren);
					}
					return ren;
				}
				else if (!".".equals(strp) && !objLiteralProp) {
					/*
					 * Não substitui se:
					 * - this.prop
					 * - { prop: val}
					 */ 
					String ren = memory.get(this.text);
					if (ren != null)
						return ren;
				}
			}
			return this.text;
		}
	}
	
	public static void printTree(CommonTree t, int indent, PrintStream out) {
		if ( t != null ) {
			StringBuffer sb = new StringBuffer(indent);
			int tokenAnterior = -1;
			
			for ( int i = 0; i < indent; i++ )
				sb = sb.append("   ");
			for ( int i = 0; i < t.getChildCount(); i++ ) {
				String token = t.getChild(i).toString();
				if (token.equals("(") || token.equals("{"))
					nivel++;
				if (token.equals(")") || token.equals("}"))
					nivel--;
				
				if (tokenEhId(tokenAnterior)
					&& token != null 
					&& token.length() != 0 
					&& (Character.isLetter(token.charAt(0)) ||token.charAt(0) == '_')) out.print(" ");
				if (tokenAnterior == JavaScriptParser.T__44 && t.getChild(i).getType() == JavaScriptParser.T__45) out.print(" "); // + ++
				if (tokenAnterior == JavaScriptParser.T__48 && t.getChild(i).getType() == JavaScriptParser.T__49) out.print(" "); // - --
				
				if (i + 3 < t.getChildCount() 
					&& t.getChild(i+0).getType() == JavaScriptParser.Identifier
					&& t.getChild(i+1).getType() == JavaScriptParser.T__60 // =
					&& token.equals(((JsAST)t.getChild(i+2)).text)
					&& t.getChild(i+3).getType() == JavaScriptParser.T__44) // +
				{
					out.print(token + "+=");
					i+=3;
				}
				else
				{
					out.print(sb.toString() + token);
					tokenAnterior = t.getChild(i).getType();
				}
				
				printTree((CommonTree)t.getChild(i), indent+1, out);
			}
		}
	}

	/**
	 * Roda o parser.
	 * 
	 * @param args Argumentos.
	 */
	public void run(String[] args)
	{
		CharStream stream = null;
		
		try {
			if (args.length == 0) {
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				stream = new ANTLRStringStream(in.readLine());
			} else {
				stream = new ANTLRFileStream(args[0]);
			}
		} catch (IOException ex) {
			System.out.println("Erro ao ler o arquivo " + args[0]);
			System.exit(1);
		}

		Lexer lexer = new JavaScriptLexer(stream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		JavaScriptParser parser = new JavaScriptParser(tokenStream);
		parser.setTreeAdaptor(this.adaptor);
		
		JavaScriptParser.program_return result = null;
		
		try {
			result = parser.program();
		} catch (RecognitionException ex) {
			System.out.println("Erro no parser.\nExceção: " + ex.getMessage());
			System.exit(1);
		} catch (Exception ex) {
			if ("".equals(ex.getMessage()))
				System.out.println("Erro no parser.\nExceção: " + ex);
			else
				System.out.println("Erro no parser.\nExceção: " + ex.getMessage());
			System.exit(1);
		}
		
		CommonTree ast = (CommonTree) result.getTree();
		
		PrintStream out = null;
		try {
			out = args.length >= 2 ? new PrintStream(args[1]) : System.out;
		} catch (FileNotFoundException ex) {
			System.out.println("O arquivo de saída não foi encontrado.");
		}
		
		printTree(ast, 0, out);
	}
	
	/**
	 * Método executado quando roda a classe.
	 * 
	 * @param args Argumentos.
	 */
	public static void main(String[] args) {
		new JsMin().run(args);
	}
	
}


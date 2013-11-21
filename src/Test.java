import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;

import org.antlr.runtime.tree.*;
import org.antlr.runtime.Token;

import java.util.HashMap;
import java.io.PrintStream;

public class Test {

	static HashMap<String, String> memory = new HashMap<String, String>();
	int idn = 0;

	private boolean ehParamFunction = false;
	private boolean ehVar = false;
	private boolean varDef = false;
	private int nivelBloco = 0;
	private int nivelVar = 0;
	public static int nivel = 0;
	
	class JsAST extends CommonTree {
		public String text; 

		public JsAST(Token t) {
			super(t);
			text = (t != null? t.getText(): "[]");
		}

		private String converterId(int id)
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

		public String toString() {
			if (getType() == 82) return "!1"; // false
			if (getType() == 95) return "!0"; // true

			String str = text;

			// function  (a, b, c)
			// function a(b, c)
			if (str.equals("function")) {
				ehParamFunction = true;
			} else if (str.equals(")")) {
				ehParamFunction = false;
			}
			
			// var a, b;
			// var a = x, b = y;
			if (nivel > 0)
			{
				if (str.equals("var")) {
					ehVar = true;
					varDef = true;
					nivelVar = nivelBloco;
				} else if (getType() == 15) {

				} else if (str.equals("=")) {
					varDef = false;
				} else if (ehVar && str.equals(",") && nivelBloco == nivelVar) {
					varDef = true;
				} else if (str.equals(";")) {
					ehVar = false;
					varDef = false;
				} 
			}
			
			if (str.equals("{")) {
				nivelBloco++;
			} else if (str.equals("}")) {
				nivelBloco--;
			}

			if (getType() == 15 && parent != null && getChildIndex() > 0) { //* Identifier
				boolean criarNovaVariavel = false;
				if (varDef || ehParamFunction && nivel > 0) {
					criarNovaVariavel = true;
				}

				JsAST prev = (JsAST)parent.getChild(getChildIndex()-1);	
				String strp = prev.text;

				boolean objLiteralProp = ehVar && nivelBloco > nivelVar && parent.getChildCount() > getChildIndex() + 1 && ((JsAST)parent.getChild(getChildIndex()+1)).text.equals(":");
				if (criarNovaVariavel) {
					String ren = memory.get(str);
					if (ren == null) {
						ren = converterId(idn++); //* a
						memory.put(str, ren);
					}
					return ren;
				}
				else if (!".".equals(strp) && !objLiteralProp) {
					// nao substituir se:
					// - this.prop
					// - { prop: val} 
					String ren = memory.get(str);
					if (ren != null)
						return ren;
				}
			}
			return /*text + */str;
		}
	}

	TreeAdaptor adaptor = new CommonTreeAdaptor() {
			public Object create(Token payload) {
				return new JsAST(payload);
			}
		};
		
	public static boolean tokenEhId(int tokenType) {
		return tokenType == 15 
			|| tokenType >= 74 && tokenType <= 101;
	}
	public static void printTree(CommonTree t, int indent, PrintStream out) {
		if ( t != null ) {
			StringBuffer sb = new StringBuffer(indent);
			int tokenAnterior = -1;
			
			/*if (t.getParent() == null){
				out.println(sb.toString() + t.getText().toString());	
			}*/
			for ( int i = 0; i < indent; i++ )
				sb = sb.append("   ");
			for ( int i = 0; i < t.getChildCount(); i++ ) {
				String str = t.getChild(i).toString();
				if (str.equals("(") || str.equals("{"))
					nivel++;
				if (str.equals(")") || str.equals("}"))
					nivel--;
				
				if (tokenEhId(tokenAnterior)
					&& str != null 
					&& str.length() != 0 
					&& (Character.isLetter(str.charAt(0)) || str.charAt(0) == '_')) out.print(" ");
				if (tokenAnterior == 44 && t.getChild(i).getType() == 45) out.print(" "); // + ++
				if (tokenAnterior == 48 && t.getChild(i).getType() == 49) out.print(" "); // - --
				
				if (i + 3 < t.getChildCount() 
					&& t.getChild(i+0).getType() == 15 
					&& t.getChild(i+1).getType() == 60 // =
					&& str.equals(((JsAST)t.getChild(i+2)).text)
					&& t.getChild(i+3).getType() == 44) // +
				{
					out.print(str + "+=");
					i+=3;
				}
				else
				{
					out.print(sb.toString() + str);
					tokenAnterior = t.getChild(i).getType();
				}
				printTree((CommonTree)t.getChild(i), indent+1, out);
			}
		}
	}

	public static void main(String[] args) { new Test().run(args);}
	public void run(String[] args)
	{
		//String input = "function message() { var item =\"fdfsd\"; alert('teste'); ;}";
		
		// http://javascript-minifier.com/
		// function message(){var e="fdfsd",t=e;alert("teste"),alert(t)}
		// function message(){var item='fdfsd';var item2=item;alert('teste');alert(item2);}
		String input = "function message(input) { \r\n" +
						"	var item ='fdfsd'; \r\n" +
						"   var item2 = item;\r\n" +
						"   alert('teste');\r\n" +
						"   alert(item2);\r\n" +
						"}";
						
		String input2 = "function e(){var b=1,c=2; writeln(b+c);} " +
						"function t(){e();}" +
						"t();";
						
		try
		{
			ANTLRFileStream stream = new ANTLRFileStream(args[0]);
			JavaScriptLexer lexer = new JavaScriptLexer(stream);
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			JavaScriptParser parser = new JavaScriptParser(tokenStream);
			parser.setTreeAdaptor(adaptor);
			JavaScriptParser.program_return result = parser.program();
			CommonTree ast = (CommonTree) result.getTree();
			//System.out.println(ast.toStringTree());
			PrintStream out = args.length >= 2 ? new PrintStream(args[1]) : System.out;
			printTree(ast, 0, out);
		}
		catch (Exception ex)
		{
			System.out.println("Erro " + ex);
		}
	}

}


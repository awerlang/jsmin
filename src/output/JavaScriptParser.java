// $ANTLR 3.4 D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3 2013-11-19 23:44:44

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class JavaScriptParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CharacterEscapeSequence", "Comment", "DecimalDigit", "DecimalLiteral", "DoubleStringCharacter", "EscapeCharacter", "EscapeSequence", "ExponentPart", "HexDigit", "HexEscapeSequence", "HexIntegerLiteral", "Identifier", "IdentifierPart", "IdentifierStart", "LT", "LineComment", "NonEscapeCharacter", "NumericLiteral", "RegexpLiteral", "SingleEscapeCharacter", "SingleStringCharacter", "StringLiteral", "UnicodeCombiningMark", "UnicodeConnectorPunctuation", "UnicodeDigit", "UnicodeEscapeSequence", "UnicodeLetter", "WhiteSpace", "'!'", "'!='", "'!=='", "'%'", "'%='", "'&&'", "'&'", "'&='", "'('", "')'", "'*'", "'*='", "'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'.'", "'/'", "'/='", "':'", "';'", "'<'", "'<<'", "'<<='", "'<='", "'='", "'=='", "'==='", "'>'", "'>='", "'>>'", "'>>='", "'>>>'", "'>>>='", "'?'", "'['", "']'", "'^'", "'^='", "'break'", "'case'", "'catch'", "'continue'", "'default'", "'delete'", "'do'", "'else'", "'false'", "'finally'", "'for'", "'function'", "'if'", "'in'", "'instanceof'", "'new'", "'null'", "'return'", "'switch'", "'this'", "'throw'", "'true'", "'try'", "'typeof'", "'var'", "'void'", "'while'", "'with'", "'{'", "'|'", "'|='", "'||'", "'}'", "'~'"
    };

    public static final int EOF=-1;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int T__100=100;
    public static final int T__101=101;
    public static final int T__102=102;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__107=107;
    public static final int CharacterEscapeSequence=4;
    public static final int Comment=5;
    public static final int DecimalDigit=6;
    public static final int DecimalLiteral=7;
    public static final int DoubleStringCharacter=8;
    public static final int EscapeCharacter=9;
    public static final int EscapeSequence=10;
    public static final int ExponentPart=11;
    public static final int HexDigit=12;
    public static final int HexEscapeSequence=13;
    public static final int HexIntegerLiteral=14;
    public static final int Identifier=15;
    public static final int IdentifierPart=16;
    public static final int IdentifierStart=17;
    public static final int LT=18;
    public static final int LineComment=19;
    public static final int NonEscapeCharacter=20;
    public static final int NumericLiteral=21;
    public static final int RegexpLiteral=22;
    public static final int SingleEscapeCharacter=23;
    public static final int SingleStringCharacter=24;
    public static final int StringLiteral=25;
    public static final int UnicodeCombiningMark=26;
    public static final int UnicodeConnectorPunctuation=27;
    public static final int UnicodeDigit=28;
    public static final int UnicodeEscapeSequence=29;
    public static final int UnicodeLetter=30;
    public static final int WhiteSpace=31;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public JavaScriptParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public JavaScriptParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[383+1];
         

    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return JavaScriptParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3"; }


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:15:1: program : ( LT !)* sourceElements ( LT !)* EOF !;
    public final JavaScriptParser.program_return program() throws RecognitionException {
        JavaScriptParser.program_return retval = new JavaScriptParser.program_return();
        retval.start = input.LT(1);

        int program_StartIndex = input.index();

        Object root_0 = null;

        Token LT1=null;
        Token LT3=null;
        Token EOF4=null;
        JavaScriptParser.sourceElements_return sourceElements2 =null;


        Object LT1_tree=null;
        Object LT3_tree=null;
        Object EOF4_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:16:2: ( ( LT !)* sourceElements ( LT !)* EOF !)
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:16:4: ( LT !)* sourceElements ( LT !)* EOF !
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:16:6: ( LT !)*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==LT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:16:6: LT !
            	    {
            	    LT1=(Token)match(input,LT,FOLLOW_LT_in_program37); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            pushFollow(FOLLOW_sourceElements_in_program41);
            sourceElements2=sourceElements();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sourceElements2.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:16:26: ( LT !)*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==LT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:16:26: LT !
            	    {
            	    LT3=(Token)match(input,LT,FOLLOW_LT_in_program43); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_program47); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, program_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "program"


    public static class sourceElements_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sourceElements"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:19:1: sourceElements : sourceElement ( ( LT !)* sourceElement )* ;
    public final JavaScriptParser.sourceElements_return sourceElements() throws RecognitionException {
        JavaScriptParser.sourceElements_return retval = new JavaScriptParser.sourceElements_return();
        retval.start = input.LT(1);

        int sourceElements_StartIndex = input.index();

        Object root_0 = null;

        Token LT6=null;
        JavaScriptParser.sourceElement_return sourceElement5 =null;

        JavaScriptParser.sourceElement_return sourceElement7 =null;


        Object LT6_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:20:2: ( sourceElement ( ( LT !)* sourceElement )* )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:20:4: sourceElement ( ( LT !)* sourceElement )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_sourceElement_in_sourceElements60);
            sourceElement5=sourceElement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sourceElement5.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:20:18: ( ( LT !)* sourceElement )*
            loop4:
            do {
                int alt4=2;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:20:19: ( LT !)* sourceElement
            	    {
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:20:21: ( LT !)*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==LT) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:20:21: LT !
            	    	    {
            	    	    LT6=(Token)match(input,LT,FOLLOW_LT_in_sourceElements63); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_sourceElement_in_sourceElements67);
            	    sourceElement7=sourceElement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, sourceElement7.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, sourceElements_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "sourceElements"


    public static class sourceElement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sourceElement"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:23:1: sourceElement : ( functionDeclaration | statement );
    public final JavaScriptParser.sourceElement_return sourceElement() throws RecognitionException {
        JavaScriptParser.sourceElement_return retval = new JavaScriptParser.sourceElement_return();
        retval.start = input.LT(1);

        int sourceElement_StartIndex = input.index();

        Object root_0 = null;

        JavaScriptParser.functionDeclaration_return functionDeclaration8 =null;

        JavaScriptParser.statement_return statement9 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:24:2: ( functionDeclaration | statement )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==85) ) {
                int LA5_1 = input.LA(2);

                if ( (synpred5_JavaScript()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA5_0==Identifier||(LA5_0 >= NumericLiteral && LA5_0 <= RegexpLiteral)||LA5_0==StringLiteral||LA5_0==32||LA5_0==40||(LA5_0 >= 44 && LA5_0 <= 45)||(LA5_0 >= 48 && LA5_0 <= 49)||LA5_0==55||LA5_0==70||LA5_0==74||LA5_0==77||(LA5_0 >= 79 && LA5_0 <= 80)||LA5_0==82||LA5_0==84||LA5_0==86||(LA5_0 >= 89 && LA5_0 <= 102)||LA5_0==107) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:24:4: functionDeclaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_functionDeclaration_in_sourceElement81);
                    functionDeclaration8=functionDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclaration8.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:25:4: statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statement_in_sourceElement86);
                    statement9=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement9.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, sourceElement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "sourceElement"


    public static class functionDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionDeclaration"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:29:1: functionDeclaration : 'function' ( LT !)* Identifier ( LT !)* formalParameterList ( LT !)* functionBody ;
    public final JavaScriptParser.functionDeclaration_return functionDeclaration() throws RecognitionException {
        JavaScriptParser.functionDeclaration_return retval = new JavaScriptParser.functionDeclaration_return();
        retval.start = input.LT(1);

        int functionDeclaration_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal10=null;
        Token LT11=null;
        Token Identifier12=null;
        Token LT13=null;
        Token LT15=null;
        JavaScriptParser.formalParameterList_return formalParameterList14 =null;

        JavaScriptParser.functionBody_return functionBody16 =null;


        Object string_literal10_tree=null;
        Object LT11_tree=null;
        Object Identifier12_tree=null;
        Object LT13_tree=null;
        Object LT15_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:30:2: ( 'function' ( LT !)* Identifier ( LT !)* formalParameterList ( LT !)* functionBody )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:30:4: 'function' ( LT !)* Identifier ( LT !)* formalParameterList ( LT !)* functionBody
            {
            root_0 = (Object)adaptor.nil();


            string_literal10=(Token)match(input,85,FOLLOW_85_in_functionDeclaration99); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal10_tree = 
            (Object)adaptor.create(string_literal10)
            ;
            adaptor.addChild(root_0, string_literal10_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:30:17: ( LT !)*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==LT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:30:17: LT !
            	    {
            	    LT11=(Token)match(input,LT,FOLLOW_LT_in_functionDeclaration101); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            Identifier12=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDeclaration105); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier12_tree = 
            (Object)adaptor.create(Identifier12)
            ;
            adaptor.addChild(root_0, Identifier12_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:30:33: ( LT !)*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==LT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:30:33: LT !
            	    {
            	    LT13=(Token)match(input,LT,FOLLOW_LT_in_functionDeclaration107); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            pushFollow(FOLLOW_formalParameterList_in_functionDeclaration111);
            formalParameterList14=formalParameterList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameterList14.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:30:58: ( LT !)*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==LT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:30:58: LT !
            	    {
            	    LT15=(Token)match(input,LT,FOLLOW_LT_in_functionDeclaration113); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            pushFollow(FOLLOW_functionBody_in_functionDeclaration117);
            functionBody16=functionBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, functionBody16.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, functionDeclaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "functionDeclaration"


    public static class functionExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionExpression"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:33:1: functionExpression : 'function' ( LT !)* ( Identifier )? ( LT !)* formalParameterList ( LT !)* functionBody ;
    public final JavaScriptParser.functionExpression_return functionExpression() throws RecognitionException {
        JavaScriptParser.functionExpression_return retval = new JavaScriptParser.functionExpression_return();
        retval.start = input.LT(1);

        int functionExpression_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal17=null;
        Token LT18=null;
        Token Identifier19=null;
        Token LT20=null;
        Token LT22=null;
        JavaScriptParser.formalParameterList_return formalParameterList21 =null;

        JavaScriptParser.functionBody_return functionBody23 =null;


        Object string_literal17_tree=null;
        Object LT18_tree=null;
        Object Identifier19_tree=null;
        Object LT20_tree=null;
        Object LT22_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:34:2: ( 'function' ( LT !)* ( Identifier )? ( LT !)* formalParameterList ( LT !)* functionBody )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:34:4: 'function' ( LT !)* ( Identifier )? ( LT !)* formalParameterList ( LT !)* functionBody
            {
            root_0 = (Object)adaptor.nil();


            string_literal17=(Token)match(input,85,FOLLOW_85_in_functionExpression129); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal17_tree = 
            (Object)adaptor.create(string_literal17)
            ;
            adaptor.addChild(root_0, string_literal17_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:34:17: ( LT !)*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==LT) ) {
                    int LA9_2 = input.LA(2);

                    if ( (synpred9_JavaScript()) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:34:17: LT !
            	    {
            	    LT18=(Token)match(input,LT,FOLLOW_LT_in_functionExpression131); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:34:20: ( Identifier )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Identifier) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:34:20: Identifier
                    {
                    Identifier19=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionExpression135); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier19_tree = 
                    (Object)adaptor.create(Identifier19)
                    ;
                    adaptor.addChild(root_0, Identifier19_tree);
                    }

                    }
                    break;

            }


            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:34:34: ( LT !)*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==LT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:34:34: LT !
            	    {
            	    LT20=(Token)match(input,LT,FOLLOW_LT_in_functionExpression138); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            pushFollow(FOLLOW_formalParameterList_in_functionExpression142);
            formalParameterList21=formalParameterList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, formalParameterList21.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:34:59: ( LT !)*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==LT) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:34:59: LT !
            	    {
            	    LT22=(Token)match(input,LT,FOLLOW_LT_in_functionExpression144); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            pushFollow(FOLLOW_functionBody_in_functionExpression148);
            functionBody23=functionBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, functionBody23.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, functionExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "functionExpression"


    public static class formalParameterList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "formalParameterList"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:37:1: formalParameterList : '(' ( ( LT !)* Identifier ( ( LT !)* ',' ( LT !)* Identifier )* )? ( LT !)* ')' ;
    public final JavaScriptParser.formalParameterList_return formalParameterList() throws RecognitionException {
        JavaScriptParser.formalParameterList_return retval = new JavaScriptParser.formalParameterList_return();
        retval.start = input.LT(1);

        int formalParameterList_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal24=null;
        Token LT25=null;
        Token Identifier26=null;
        Token LT27=null;
        Token char_literal28=null;
        Token LT29=null;
        Token Identifier30=null;
        Token LT31=null;
        Token char_literal32=null;

        Object char_literal24_tree=null;
        Object LT25_tree=null;
        Object Identifier26_tree=null;
        Object LT27_tree=null;
        Object char_literal28_tree=null;
        Object LT29_tree=null;
        Object Identifier30_tree=null;
        Object LT31_tree=null;
        Object char_literal32_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:38:2: ( '(' ( ( LT !)* Identifier ( ( LT !)* ',' ( LT !)* Identifier )* )? ( LT !)* ')' )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:38:4: '(' ( ( LT !)* Identifier ( ( LT !)* ',' ( LT !)* Identifier )* )? ( LT !)* ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal24=(Token)match(input,40,FOLLOW_40_in_formalParameterList160); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal24_tree = 
            (Object)adaptor.create(char_literal24)
            ;
            adaptor.addChild(root_0, char_literal24_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:38:8: ( ( LT !)* Identifier ( ( LT !)* ',' ( LT !)* Identifier )* )?
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:38:9: ( LT !)* Identifier ( ( LT !)* ',' ( LT !)* Identifier )*
                    {
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:38:11: ( LT !)*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==LT) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:38:11: LT !
                    	    {
                    	    LT25=(Token)match(input,LT,FOLLOW_LT_in_formalParameterList163); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    Identifier26=(Token)match(input,Identifier,FOLLOW_Identifier_in_formalParameterList167); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier26_tree = 
                    (Object)adaptor.create(Identifier26)
                    ;
                    adaptor.addChild(root_0, Identifier26_tree);
                    }

                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:38:25: ( ( LT !)* ',' ( LT !)* Identifier )*
                    loop16:
                    do {
                        int alt16=2;
                        alt16 = dfa16.predict(input);
                        switch (alt16) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:38:26: ( LT !)* ',' ( LT !)* Identifier
                    	    {
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:38:28: ( LT !)*
                    	    loop14:
                    	    do {
                    	        int alt14=2;
                    	        int LA14_0 = input.LA(1);

                    	        if ( (LA14_0==LT) ) {
                    	            alt14=1;
                    	        }


                    	        switch (alt14) {
                    	    	case 1 :
                    	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:38:28: LT !
                    	    	    {
                    	    	    LT27=(Token)match(input,LT,FOLLOW_LT_in_formalParameterList170); if (state.failed) return retval;

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop14;
                    	        }
                    	    } while (true);


                    	    char_literal28=(Token)match(input,47,FOLLOW_47_in_formalParameterList174); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal28_tree = 
                    	    (Object)adaptor.create(char_literal28)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal28_tree);
                    	    }

                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:38:37: ( LT !)*
                    	    loop15:
                    	    do {
                    	        int alt15=2;
                    	        int LA15_0 = input.LA(1);

                    	        if ( (LA15_0==LT) ) {
                    	            alt15=1;
                    	        }


                    	        switch (alt15) {
                    	    	case 1 :
                    	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:38:37: LT !
                    	    	    {
                    	    	    LT29=(Token)match(input,LT,FOLLOW_LT_in_formalParameterList176); if (state.failed) return retval;

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop15;
                    	        }
                    	    } while (true);


                    	    Identifier30=(Token)match(input,Identifier,FOLLOW_Identifier_in_formalParameterList180); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    Identifier30_tree = 
                    	    (Object)adaptor.create(Identifier30)
                    	    ;
                    	    adaptor.addChild(root_0, Identifier30_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }


            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:38:57: ( LT !)*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==LT) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:38:57: LT !
            	    {
            	    LT31=(Token)match(input,LT,FOLLOW_LT_in_formalParameterList186); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            char_literal32=(Token)match(input,41,FOLLOW_41_in_formalParameterList190); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal32_tree = 
            (Object)adaptor.create(char_literal32)
            ;
            adaptor.addChild(root_0, char_literal32_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, formalParameterList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "formalParameterList"


    public static class functionBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionBody"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:41:1: functionBody : '{' ( LT !)* sourceElements ( LT !)* '}' ;
    public final JavaScriptParser.functionBody_return functionBody() throws RecognitionException {
        JavaScriptParser.functionBody_return retval = new JavaScriptParser.functionBody_return();
        retval.start = input.LT(1);

        int functionBody_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal33=null;
        Token LT34=null;
        Token LT36=null;
        Token char_literal37=null;
        JavaScriptParser.sourceElements_return sourceElements35 =null;


        Object char_literal33_tree=null;
        Object LT34_tree=null;
        Object LT36_tree=null;
        Object char_literal37_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:42:2: ( '{' ( LT !)* sourceElements ( LT !)* '}' )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:42:4: '{' ( LT !)* sourceElements ( LT !)* '}'
            {
            root_0 = (Object)adaptor.nil();


            char_literal33=(Token)match(input,102,FOLLOW_102_in_functionBody201); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal33_tree = 
            (Object)adaptor.create(char_literal33)
            ;
            adaptor.addChild(root_0, char_literal33_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:42:10: ( LT !)*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==LT) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:42:10: LT !
            	    {
            	    LT34=(Token)match(input,LT,FOLLOW_LT_in_functionBody203); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            pushFollow(FOLLOW_sourceElements_in_functionBody207);
            sourceElements35=sourceElements();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sourceElements35.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:42:30: ( LT !)*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==LT) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:42:30: LT !
            	    {
            	    LT36=(Token)match(input,LT,FOLLOW_LT_in_functionBody209); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            char_literal37=(Token)match(input,106,FOLLOW_106_in_functionBody213); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal37_tree = 
            (Object)adaptor.create(char_literal37)
            ;
            adaptor.addChild(root_0, char_literal37_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, functionBody_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "functionBody"


    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:46:1: statement : ( statementBlock | variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement );
    public final JavaScriptParser.statement_return statement() throws RecognitionException {
        JavaScriptParser.statement_return retval = new JavaScriptParser.statement_return();
        retval.start = input.LT(1);

        int statement_StartIndex = input.index();

        Object root_0 = null;

        JavaScriptParser.statementBlock_return statementBlock38 =null;

        JavaScriptParser.variableStatement_return variableStatement39 =null;

        JavaScriptParser.emptyStatement_return emptyStatement40 =null;

        JavaScriptParser.expressionStatement_return expressionStatement41 =null;

        JavaScriptParser.ifStatement_return ifStatement42 =null;

        JavaScriptParser.iterationStatement_return iterationStatement43 =null;

        JavaScriptParser.continueStatement_return continueStatement44 =null;

        JavaScriptParser.breakStatement_return breakStatement45 =null;

        JavaScriptParser.returnStatement_return returnStatement46 =null;

        JavaScriptParser.withStatement_return withStatement47 =null;

        JavaScriptParser.labelledStatement_return labelledStatement48 =null;

        JavaScriptParser.switchStatement_return switchStatement49 =null;

        JavaScriptParser.throwStatement_return throwStatement50 =null;

        JavaScriptParser.tryStatement_return tryStatement51 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:47:2: ( statementBlock | variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement )
            int alt21=14;
            switch ( input.LA(1) ) {
            case 102:
                {
                int LA21_1 = input.LA(2);

                if ( (synpred21_JavaScript()) ) {
                    alt21=1;
                }
                else if ( (synpred24_JavaScript()) ) {
                    alt21=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;

                }
                }
                break;
            case 98:
                {
                alt21=2;
                }
                break;
            case 55:
                {
                alt21=3;
                }
                break;
            case NumericLiteral:
            case RegexpLiteral:
            case StringLiteral:
            case 32:
            case 40:
            case 44:
            case 45:
            case 48:
            case 49:
            case 70:
            case 79:
            case 82:
            case 85:
            case 89:
            case 90:
            case 93:
            case 95:
            case 97:
            case 99:
            case 107:
                {
                alt21=4;
                }
                break;
            case Identifier:
                {
                int LA21_5 = input.LA(2);

                if ( (synpred24_JavaScript()) ) {
                    alt21=4;
                }
                else if ( (synpred31_JavaScript()) ) {
                    alt21=11;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 5, input);

                    throw nvae;

                }
                }
                break;
            case 86:
                {
                alt21=5;
                }
                break;
            case 80:
            case 84:
            case 100:
                {
                alt21=6;
                }
                break;
            case 77:
                {
                alt21=7;
                }
                break;
            case 74:
                {
                alt21=8;
                }
                break;
            case 91:
                {
                alt21=9;
                }
                break;
            case 101:
                {
                alt21=10;
                }
                break;
            case 92:
                {
                alt21=12;
                }
                break;
            case 94:
                {
                alt21=13;
                }
                break;
            case 96:
                {
                alt21=14;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:47:4: statementBlock
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statementBlock_in_statement225);
                    statementBlock38=statementBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementBlock38.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:48:4: variableStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_variableStatement_in_statement230);
                    variableStatement39=variableStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableStatement39.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:49:4: emptyStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_emptyStatement_in_statement235);
                    emptyStatement40=emptyStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, emptyStatement40.getTree());

                    }
                    break;
                case 4 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:50:4: expressionStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expressionStatement_in_statement240);
                    expressionStatement41=expressionStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStatement41.getTree());

                    }
                    break;
                case 5 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:51:4: ifStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ifStatement_in_statement245);
                    ifStatement42=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement42.getTree());

                    }
                    break;
                case 6 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:52:4: iterationStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_iterationStatement_in_statement250);
                    iterationStatement43=iterationStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterationStatement43.getTree());

                    }
                    break;
                case 7 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:53:4: continueStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_continueStatement_in_statement255);
                    continueStatement44=continueStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, continueStatement44.getTree());

                    }
                    break;
                case 8 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:54:4: breakStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_breakStatement_in_statement260);
                    breakStatement45=breakStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, breakStatement45.getTree());

                    }
                    break;
                case 9 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:55:4: returnStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_returnStatement_in_statement265);
                    returnStatement46=returnStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, returnStatement46.getTree());

                    }
                    break;
                case 10 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:56:4: withStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_withStatement_in_statement270);
                    withStatement47=withStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, withStatement47.getTree());

                    }
                    break;
                case 11 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:57:4: labelledStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_labelledStatement_in_statement275);
                    labelledStatement48=labelledStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, labelledStatement48.getTree());

                    }
                    break;
                case 12 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:58:4: switchStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_switchStatement_in_statement280);
                    switchStatement49=switchStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, switchStatement49.getTree());

                    }
                    break;
                case 13 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:59:4: throwStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_throwStatement_in_statement285);
                    throwStatement50=throwStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, throwStatement50.getTree());

                    }
                    break;
                case 14 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:60:4: tryStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_tryStatement_in_statement290);
                    tryStatement51=tryStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tryStatement51.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, statement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class statementBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statementBlock"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:63:1: statementBlock : '{' ( LT !)* ( statementList )? ( LT !)* '}' ;
    public final JavaScriptParser.statementBlock_return statementBlock() throws RecognitionException {
        JavaScriptParser.statementBlock_return retval = new JavaScriptParser.statementBlock_return();
        retval.start = input.LT(1);

        int statementBlock_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal52=null;
        Token LT53=null;
        Token LT55=null;
        Token char_literal56=null;
        JavaScriptParser.statementList_return statementList54 =null;


        Object char_literal52_tree=null;
        Object LT53_tree=null;
        Object LT55_tree=null;
        Object char_literal56_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:64:2: ( '{' ( LT !)* ( statementList )? ( LT !)* '}' )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:64:4: '{' ( LT !)* ( statementList )? ( LT !)* '}'
            {
            root_0 = (Object)adaptor.nil();


            char_literal52=(Token)match(input,102,FOLLOW_102_in_statementBlock302); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal52_tree = 
            (Object)adaptor.create(char_literal52)
            ;
            adaptor.addChild(root_0, char_literal52_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:64:10: ( LT !)*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==LT) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred34_JavaScript()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:64:10: LT !
            	    {
            	    LT53=(Token)match(input,LT,FOLLOW_LT_in_statementBlock304); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:64:13: ( statementList )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Identifier||(LA23_0 >= NumericLiteral && LA23_0 <= RegexpLiteral)||LA23_0==StringLiteral||LA23_0==32||LA23_0==40||(LA23_0 >= 44 && LA23_0 <= 45)||(LA23_0 >= 48 && LA23_0 <= 49)||LA23_0==55||LA23_0==70||LA23_0==74||LA23_0==77||(LA23_0 >= 79 && LA23_0 <= 80)||LA23_0==82||(LA23_0 >= 84 && LA23_0 <= 86)||(LA23_0 >= 89 && LA23_0 <= 102)||LA23_0==107) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:64:13: statementList
                    {
                    pushFollow(FOLLOW_statementList_in_statementBlock308);
                    statementList54=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList54.getTree());

                    }
                    break;

            }


            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:64:30: ( LT !)*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==LT) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:64:30: LT !
            	    {
            	    LT55=(Token)match(input,LT,FOLLOW_LT_in_statementBlock311); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            char_literal56=(Token)match(input,106,FOLLOW_106_in_statementBlock315); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal56_tree = 
            (Object)adaptor.create(char_literal56)
            ;
            adaptor.addChild(root_0, char_literal56_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, statementBlock_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "statementBlock"


    public static class statementList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statementList"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:67:1: statementList : statement ( ( LT !)* statement )* ;
    public final JavaScriptParser.statementList_return statementList() throws RecognitionException {
        JavaScriptParser.statementList_return retval = new JavaScriptParser.statementList_return();
        retval.start = input.LT(1);

        int statementList_StartIndex = input.index();

        Object root_0 = null;

        Token LT58=null;
        JavaScriptParser.statement_return statement57 =null;

        JavaScriptParser.statement_return statement59 =null;


        Object LT58_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:68:2: ( statement ( ( LT !)* statement )* )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:68:4: statement ( ( LT !)* statement )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_statement_in_statementList327);
            statement57=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement57.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:68:14: ( ( LT !)* statement )*
            loop26:
            do {
                int alt26=2;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:68:15: ( LT !)* statement
            	    {
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:68:17: ( LT !)*
            	    loop25:
            	    do {
            	        int alt25=2;
            	        int LA25_0 = input.LA(1);

            	        if ( (LA25_0==LT) ) {
            	            alt25=1;
            	        }


            	        switch (alt25) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:68:17: LT !
            	    	    {
            	    	    LT58=(Token)match(input,LT,FOLLOW_LT_in_statementList330); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop25;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_statement_in_statementList334);
            	    statement59=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement59.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, statementList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "statementList"


    public static class variableStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variableStatement"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:71:1: variableStatement : 'var' ( LT !)* variableDeclarationList ( LT !| ';' ) ;
    public final JavaScriptParser.variableStatement_return variableStatement() throws RecognitionException {
        JavaScriptParser.variableStatement_return retval = new JavaScriptParser.variableStatement_return();
        retval.start = input.LT(1);

        int variableStatement_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal60=null;
        Token LT61=null;
        Token LT63=null;
        Token char_literal64=null;
        JavaScriptParser.variableDeclarationList_return variableDeclarationList62 =null;


        Object string_literal60_tree=null;
        Object LT61_tree=null;
        Object LT63_tree=null;
        Object char_literal64_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:72:2: ( 'var' ( LT !)* variableDeclarationList ( LT !| ';' ) )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:72:4: 'var' ( LT !)* variableDeclarationList ( LT !| ';' )
            {
            root_0 = (Object)adaptor.nil();


            string_literal60=(Token)match(input,98,FOLLOW_98_in_variableStatement348); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal60_tree = 
            (Object)adaptor.create(string_literal60)
            ;
            adaptor.addChild(root_0, string_literal60_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:72:12: ( LT !)*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==LT) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:72:12: LT !
            	    {
            	    LT61=(Token)match(input,LT,FOLLOW_LT_in_variableStatement350); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            pushFollow(FOLLOW_variableDeclarationList_in_variableStatement354);
            variableDeclarationList62=variableDeclarationList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarationList62.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:72:39: ( LT !| ';' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==LT) ) {
                alt28=1;
            }
            else if ( (LA28_0==55) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:72:40: LT !
                    {
                    LT63=(Token)match(input,LT,FOLLOW_LT_in_variableStatement357); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:72:46: ';'
                    {
                    char_literal64=(Token)match(input,55,FOLLOW_55_in_variableStatement362); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal64_tree = 
                    (Object)adaptor.create(char_literal64)
                    ;
                    adaptor.addChild(root_0, char_literal64_tree);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, variableStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "variableStatement"


    public static class variableDeclarationList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variableDeclarationList"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:75:1: variableDeclarationList : variableDeclaration ( ( LT !)* ',' ( LT !)* variableDeclaration )* ;
    public final JavaScriptParser.variableDeclarationList_return variableDeclarationList() throws RecognitionException {
        JavaScriptParser.variableDeclarationList_return retval = new JavaScriptParser.variableDeclarationList_return();
        retval.start = input.LT(1);

        int variableDeclarationList_StartIndex = input.index();

        Object root_0 = null;

        Token LT66=null;
        Token char_literal67=null;
        Token LT68=null;
        JavaScriptParser.variableDeclaration_return variableDeclaration65 =null;

        JavaScriptParser.variableDeclaration_return variableDeclaration69 =null;


        Object LT66_tree=null;
        Object char_literal67_tree=null;
        Object LT68_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:76:2: ( variableDeclaration ( ( LT !)* ',' ( LT !)* variableDeclaration )* )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:76:4: variableDeclaration ( ( LT !)* ',' ( LT !)* variableDeclaration )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationList375);
            variableDeclaration65=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration65.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:76:24: ( ( LT !)* ',' ( LT !)* variableDeclaration )*
            loop31:
            do {
                int alt31=2;
                alt31 = dfa31.predict(input);
                switch (alt31) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:76:25: ( LT !)* ',' ( LT !)* variableDeclaration
            	    {
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:76:27: ( LT !)*
            	    loop29:
            	    do {
            	        int alt29=2;
            	        int LA29_0 = input.LA(1);

            	        if ( (LA29_0==LT) ) {
            	            alt29=1;
            	        }


            	        switch (alt29) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:76:27: LT !
            	    	    {
            	    	    LT66=(Token)match(input,LT,FOLLOW_LT_in_variableDeclarationList378); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop29;
            	        }
            	    } while (true);


            	    char_literal67=(Token)match(input,47,FOLLOW_47_in_variableDeclarationList382); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal67_tree = 
            	    (Object)adaptor.create(char_literal67)
            	    ;
            	    adaptor.addChild(root_0, char_literal67_tree);
            	    }

            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:76:36: ( LT !)*
            	    loop30:
            	    do {
            	        int alt30=2;
            	        int LA30_0 = input.LA(1);

            	        if ( (LA30_0==LT) ) {
            	            alt30=1;
            	        }


            	        switch (alt30) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:76:36: LT !
            	    	    {
            	    	    LT68=(Token)match(input,LT,FOLLOW_LT_in_variableDeclarationList384); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop30;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationList388);
            	    variableDeclaration69=variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration69.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, variableDeclarationList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "variableDeclarationList"


    public static class variableDeclarationListNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variableDeclarationListNoIn"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:79:1: variableDeclarationListNoIn : variableDeclarationNoIn ( ( LT !)* ',' ( LT !)* variableDeclarationNoIn )* ;
    public final JavaScriptParser.variableDeclarationListNoIn_return variableDeclarationListNoIn() throws RecognitionException {
        JavaScriptParser.variableDeclarationListNoIn_return retval = new JavaScriptParser.variableDeclarationListNoIn_return();
        retval.start = input.LT(1);

        int variableDeclarationListNoIn_StartIndex = input.index();

        Object root_0 = null;

        Token LT71=null;
        Token char_literal72=null;
        Token LT73=null;
        JavaScriptParser.variableDeclarationNoIn_return variableDeclarationNoIn70 =null;

        JavaScriptParser.variableDeclarationNoIn_return variableDeclarationNoIn74 =null;


        Object LT71_tree=null;
        Object char_literal72_tree=null;
        Object LT73_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:80:2: ( variableDeclarationNoIn ( ( LT !)* ',' ( LT !)* variableDeclarationNoIn )* )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:80:4: variableDeclarationNoIn ( ( LT !)* ',' ( LT !)* variableDeclarationNoIn )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_variableDeclarationNoIn_in_variableDeclarationListNoIn402);
            variableDeclarationNoIn70=variableDeclarationNoIn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarationNoIn70.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:80:28: ( ( LT !)* ',' ( LT !)* variableDeclarationNoIn )*
            loop34:
            do {
                int alt34=2;
                alt34 = dfa34.predict(input);
                switch (alt34) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:80:29: ( LT !)* ',' ( LT !)* variableDeclarationNoIn
            	    {
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:80:31: ( LT !)*
            	    loop32:
            	    do {
            	        int alt32=2;
            	        int LA32_0 = input.LA(1);

            	        if ( (LA32_0==LT) ) {
            	            alt32=1;
            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:80:31: LT !
            	    	    {
            	    	    LT71=(Token)match(input,LT,FOLLOW_LT_in_variableDeclarationListNoIn405); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop32;
            	        }
            	    } while (true);


            	    char_literal72=(Token)match(input,47,FOLLOW_47_in_variableDeclarationListNoIn409); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal72_tree = 
            	    (Object)adaptor.create(char_literal72)
            	    ;
            	    adaptor.addChild(root_0, char_literal72_tree);
            	    }

            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:80:40: ( LT !)*
            	    loop33:
            	    do {
            	        int alt33=2;
            	        int LA33_0 = input.LA(1);

            	        if ( (LA33_0==LT) ) {
            	            alt33=1;
            	        }


            	        switch (alt33) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:80:40: LT !
            	    	    {
            	    	    LT73=(Token)match(input,LT,FOLLOW_LT_in_variableDeclarationListNoIn411); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop33;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_variableDeclarationNoIn_in_variableDeclarationListNoIn415);
            	    variableDeclarationNoIn74=variableDeclarationNoIn();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarationNoIn74.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, variableDeclarationListNoIn_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "variableDeclarationListNoIn"


    public static class variableDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variableDeclaration"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:83:1: variableDeclaration : Identifier ( LT !)* ( initialiser )? ;
    public final JavaScriptParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
        JavaScriptParser.variableDeclaration_return retval = new JavaScriptParser.variableDeclaration_return();
        retval.start = input.LT(1);

        int variableDeclaration_StartIndex = input.index();

        Object root_0 = null;

        Token Identifier75=null;
        Token LT76=null;
        JavaScriptParser.initialiser_return initialiser77 =null;


        Object Identifier75_tree=null;
        Object LT76_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:84:2: ( Identifier ( LT !)* ( initialiser )? )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:84:4: Identifier ( LT !)* ( initialiser )?
            {
            root_0 = (Object)adaptor.nil();


            Identifier75=(Token)match(input,Identifier,FOLLOW_Identifier_in_variableDeclaration429); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier75_tree = 
            (Object)adaptor.create(Identifier75)
            ;
            adaptor.addChild(root_0, Identifier75_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:84:17: ( LT !)*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==LT) ) {
                    int LA35_2 = input.LA(2);

                    if ( (synpred47_JavaScript()) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:84:17: LT !
            	    {
            	    LT76=(Token)match(input,LT,FOLLOW_LT_in_variableDeclaration431); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:84:20: ( initialiser )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==60) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:84:20: initialiser
                    {
                    pushFollow(FOLLOW_initialiser_in_variableDeclaration435);
                    initialiser77=initialiser();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, initialiser77.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, variableDeclaration_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "variableDeclaration"


    public static class variableDeclarationNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variableDeclarationNoIn"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:87:1: variableDeclarationNoIn : Identifier ( LT !)* ( initialiserNoIn )? ;
    public final JavaScriptParser.variableDeclarationNoIn_return variableDeclarationNoIn() throws RecognitionException {
        JavaScriptParser.variableDeclarationNoIn_return retval = new JavaScriptParser.variableDeclarationNoIn_return();
        retval.start = input.LT(1);

        int variableDeclarationNoIn_StartIndex = input.index();

        Object root_0 = null;

        Token Identifier78=null;
        Token LT79=null;
        JavaScriptParser.initialiserNoIn_return initialiserNoIn80 =null;


        Object Identifier78_tree=null;
        Object LT79_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:88:2: ( Identifier ( LT !)* ( initialiserNoIn )? )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:88:4: Identifier ( LT !)* ( initialiserNoIn )?
            {
            root_0 = (Object)adaptor.nil();


            Identifier78=(Token)match(input,Identifier,FOLLOW_Identifier_in_variableDeclarationNoIn448); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier78_tree = 
            (Object)adaptor.create(Identifier78)
            ;
            adaptor.addChild(root_0, Identifier78_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:88:17: ( LT !)*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==LT) ) {
                    int LA37_2 = input.LA(2);

                    if ( (synpred49_JavaScript()) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:88:17: LT !
            	    {
            	    LT79=(Token)match(input,LT,FOLLOW_LT_in_variableDeclarationNoIn450); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:88:20: ( initialiserNoIn )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==60) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:88:20: initialiserNoIn
                    {
                    pushFollow(FOLLOW_initialiserNoIn_in_variableDeclarationNoIn454);
                    initialiserNoIn80=initialiserNoIn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, initialiserNoIn80.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, variableDeclarationNoIn_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "variableDeclarationNoIn"


    public static class initialiser_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "initialiser"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:91:1: initialiser : '=' ( LT !)* assignmentExpression ;
    public final JavaScriptParser.initialiser_return initialiser() throws RecognitionException {
        JavaScriptParser.initialiser_return retval = new JavaScriptParser.initialiser_return();
        retval.start = input.LT(1);

        int initialiser_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal81=null;
        Token LT82=null;
        JavaScriptParser.assignmentExpression_return assignmentExpression83 =null;


        Object char_literal81_tree=null;
        Object LT82_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:92:2: ( '=' ( LT !)* assignmentExpression )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:92:4: '=' ( LT !)* assignmentExpression
            {
            root_0 = (Object)adaptor.nil();


            char_literal81=(Token)match(input,60,FOLLOW_60_in_initialiser467); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal81_tree = 
            (Object)adaptor.create(char_literal81)
            ;
            adaptor.addChild(root_0, char_literal81_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:92:10: ( LT !)*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==LT) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:92:10: LT !
            	    {
            	    LT82=(Token)match(input,LT,FOLLOW_LT_in_initialiser469); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            pushFollow(FOLLOW_assignmentExpression_in_initialiser473);
            assignmentExpression83=assignmentExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression83.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, initialiser_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "initialiser"


    public static class initialiserNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "initialiserNoIn"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:95:1: initialiserNoIn : '=' ( LT !)* assignmentExpressionNoIn ;
    public final JavaScriptParser.initialiserNoIn_return initialiserNoIn() throws RecognitionException {
        JavaScriptParser.initialiserNoIn_return retval = new JavaScriptParser.initialiserNoIn_return();
        retval.start = input.LT(1);

        int initialiserNoIn_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal84=null;
        Token LT85=null;
        JavaScriptParser.assignmentExpressionNoIn_return assignmentExpressionNoIn86 =null;


        Object char_literal84_tree=null;
        Object LT85_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:96:2: ( '=' ( LT !)* assignmentExpressionNoIn )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:96:4: '=' ( LT !)* assignmentExpressionNoIn
            {
            root_0 = (Object)adaptor.nil();


            char_literal84=(Token)match(input,60,FOLLOW_60_in_initialiserNoIn485); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal84_tree = 
            (Object)adaptor.create(char_literal84)
            ;
            adaptor.addChild(root_0, char_literal84_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:96:10: ( LT !)*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==LT) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:96:10: LT !
            	    {
            	    LT85=(Token)match(input,LT,FOLLOW_LT_in_initialiserNoIn487); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            pushFollow(FOLLOW_assignmentExpressionNoIn_in_initialiserNoIn491);
            assignmentExpressionNoIn86=assignmentExpressionNoIn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpressionNoIn86.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, initialiserNoIn_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "initialiserNoIn"


    public static class emptyStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "emptyStatement"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:99:1: emptyStatement : ';' ;
    public final JavaScriptParser.emptyStatement_return emptyStatement() throws RecognitionException {
        JavaScriptParser.emptyStatement_return retval = new JavaScriptParser.emptyStatement_return();
        retval.start = input.LT(1);

        int emptyStatement_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal87=null;

        Object char_literal87_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:100:2: ( ';' )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:100:4: ';'
            {
            root_0 = (Object)adaptor.nil();


            char_literal87=(Token)match(input,55,FOLLOW_55_in_emptyStatement503); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal87_tree = 
            (Object)adaptor.create(char_literal87)
            ;
            adaptor.addChild(root_0, char_literal87_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, emptyStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "emptyStatement"


    public static class expressionStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressionStatement"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:103:1: expressionStatement : expression ( LT !| ';' ) ;
    public final JavaScriptParser.expressionStatement_return expressionStatement() throws RecognitionException {
        JavaScriptParser.expressionStatement_return retval = new JavaScriptParser.expressionStatement_return();
        retval.start = input.LT(1);

        int expressionStatement_StartIndex = input.index();

        Object root_0 = null;

        Token LT89=null;
        Token char_literal90=null;
        JavaScriptParser.expression_return expression88 =null;


        Object LT89_tree=null;
        Object char_literal90_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:104:2: ( expression ( LT !| ';' ) )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:104:4: expression ( LT !| ';' )
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expression_in_expressionStatement515);
            expression88=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression88.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:104:15: ( LT !| ';' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==LT) ) {
                alt41=1;
            }
            else if ( (LA41_0==55) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }
            switch (alt41) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:104:16: LT !
                    {
                    LT89=(Token)match(input,LT,FOLLOW_LT_in_expressionStatement518); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:104:22: ';'
                    {
                    char_literal90=(Token)match(input,55,FOLLOW_55_in_expressionStatement523); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal90_tree = 
                    (Object)adaptor.create(char_literal90)
                    ;
                    adaptor.addChild(root_0, char_literal90_tree);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, expressionStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "expressionStatement"


    public static class ifStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifStatement"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:107:1: ifStatement : 'if' ( LT !)* '(' ( LT !)* expression ( LT !)* ')' ( LT !)* statement ( ( LT !)* 'else' ( LT !)* statement )? ;
    public final JavaScriptParser.ifStatement_return ifStatement() throws RecognitionException {
        JavaScriptParser.ifStatement_return retval = new JavaScriptParser.ifStatement_return();
        retval.start = input.LT(1);

        int ifStatement_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal91=null;
        Token LT92=null;
        Token char_literal93=null;
        Token LT94=null;
        Token LT96=null;
        Token char_literal97=null;
        Token LT98=null;
        Token LT100=null;
        Token string_literal101=null;
        Token LT102=null;
        JavaScriptParser.expression_return expression95 =null;

        JavaScriptParser.statement_return statement99 =null;

        JavaScriptParser.statement_return statement103 =null;


        Object string_literal91_tree=null;
        Object LT92_tree=null;
        Object char_literal93_tree=null;
        Object LT94_tree=null;
        Object LT96_tree=null;
        Object char_literal97_tree=null;
        Object LT98_tree=null;
        Object LT100_tree=null;
        Object string_literal101_tree=null;
        Object LT102_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:108:2: ( 'if' ( LT !)* '(' ( LT !)* expression ( LT !)* ')' ( LT !)* statement ( ( LT !)* 'else' ( LT !)* statement )? )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:108:4: 'if' ( LT !)* '(' ( LT !)* expression ( LT !)* ')' ( LT !)* statement ( ( LT !)* 'else' ( LT !)* statement )?
            {
            root_0 = (Object)adaptor.nil();


            string_literal91=(Token)match(input,86,FOLLOW_86_in_ifStatement536); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal91_tree = 
            (Object)adaptor.create(string_literal91)
            ;
            adaptor.addChild(root_0, string_literal91_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:108:11: ( LT !)*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==LT) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:108:11: LT !
            	    {
            	    LT92=(Token)match(input,LT,FOLLOW_LT_in_ifStatement538); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            char_literal93=(Token)match(input,40,FOLLOW_40_in_ifStatement542); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal93_tree = 
            (Object)adaptor.create(char_literal93)
            ;
            adaptor.addChild(root_0, char_literal93_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:108:20: ( LT !)*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==LT) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:108:20: LT !
            	    {
            	    LT94=(Token)match(input,LT,FOLLOW_LT_in_ifStatement544); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            pushFollow(FOLLOW_expression_in_ifStatement548);
            expression95=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression95.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:108:36: ( LT !)*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==LT) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:108:36: LT !
            	    {
            	    LT96=(Token)match(input,LT,FOLLOW_LT_in_ifStatement550); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            char_literal97=(Token)match(input,41,FOLLOW_41_in_ifStatement554); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal97_tree = 
            (Object)adaptor.create(char_literal97)
            ;
            adaptor.addChild(root_0, char_literal97_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:108:45: ( LT !)*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==LT) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:108:45: LT !
            	    {
            	    LT98=(Token)match(input,LT,FOLLOW_LT_in_ifStatement556); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            pushFollow(FOLLOW_statement_in_ifStatement560);
            statement99=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement99.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:108:58: ( ( LT !)* 'else' ( LT !)* statement )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==LT) ) {
                int LA48_1 = input.LA(2);

                if ( (synpred60_JavaScript()) ) {
                    alt48=1;
                }
            }
            else if ( (LA48_0==81) ) {
                int LA48_2 = input.LA(2);

                if ( (synpred60_JavaScript()) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:108:59: ( LT !)* 'else' ( LT !)* statement
                    {
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:108:61: ( LT !)*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==LT) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:108:61: LT !
                    	    {
                    	    LT100=(Token)match(input,LT,FOLLOW_LT_in_ifStatement563); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    string_literal101=(Token)match(input,81,FOLLOW_81_in_ifStatement567); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal101_tree = 
                    (Object)adaptor.create(string_literal101)
                    ;
                    adaptor.addChild(root_0, string_literal101_tree);
                    }

                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:108:73: ( LT !)*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==LT) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:108:73: LT !
                    	    {
                    	    LT102=(Token)match(input,LT,FOLLOW_LT_in_ifStatement569); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);


                    pushFollow(FOLLOW_statement_in_ifStatement573);
                    statement103=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement103.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 20, ifStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "ifStatement"


    public static class iterationStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "iterationStatement"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:111:1: iterationStatement : ( doWhileStatement | whileStatement | forStatement | forInStatement );
    public final JavaScriptParser.iterationStatement_return iterationStatement() throws RecognitionException {
        JavaScriptParser.iterationStatement_return retval = new JavaScriptParser.iterationStatement_return();
        retval.start = input.LT(1);

        int iterationStatement_StartIndex = input.index();

        Object root_0 = null;

        JavaScriptParser.doWhileStatement_return doWhileStatement104 =null;

        JavaScriptParser.whileStatement_return whileStatement105 =null;

        JavaScriptParser.forStatement_return forStatement106 =null;

        JavaScriptParser.forInStatement_return forInStatement107 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:112:2: ( doWhileStatement | whileStatement | forStatement | forInStatement )
            int alt49=4;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt49=1;
                }
                break;
            case 100:
                {
                alt49=2;
                }
                break;
            case 84:
                {
                int LA49_3 = input.LA(2);

                if ( (synpred63_JavaScript()) ) {
                    alt49=3;
                }
                else if ( (true) ) {
                    alt49=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;

            }

            switch (alt49) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:112:4: doWhileStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_doWhileStatement_in_iterationStatement587);
                    doWhileStatement104=doWhileStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doWhileStatement104.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:113:4: whileStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_whileStatement_in_iterationStatement592);
                    whileStatement105=whileStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStatement105.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:114:4: forStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_forStatement_in_iterationStatement597);
                    forStatement106=forStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forStatement106.getTree());

                    }
                    break;
                case 4 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:115:4: forInStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_forInStatement_in_iterationStatement602);
                    forInStatement107=forInStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forInStatement107.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 21, iterationStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "iterationStatement"


    public static class doWhileStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "doWhileStatement"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:118:1: doWhileStatement : 'do' ( LT !)* statement ( LT !)* 'while' ( LT !)* '(' expression ')' ( LT !| ';' ) ;
    public final JavaScriptParser.doWhileStatement_return doWhileStatement() throws RecognitionException {
        JavaScriptParser.doWhileStatement_return retval = new JavaScriptParser.doWhileStatement_return();
        retval.start = input.LT(1);

        int doWhileStatement_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal108=null;
        Token LT109=null;
        Token LT111=null;
        Token string_literal112=null;
        Token LT113=null;
        Token char_literal114=null;
        Token char_literal116=null;
        Token LT117=null;
        Token char_literal118=null;
        JavaScriptParser.statement_return statement110 =null;

        JavaScriptParser.expression_return expression115 =null;


        Object string_literal108_tree=null;
        Object LT109_tree=null;
        Object LT111_tree=null;
        Object string_literal112_tree=null;
        Object LT113_tree=null;
        Object char_literal114_tree=null;
        Object char_literal116_tree=null;
        Object LT117_tree=null;
        Object char_literal118_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:119:2: ( 'do' ( LT !)* statement ( LT !)* 'while' ( LT !)* '(' expression ')' ( LT !| ';' ) )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:119:4: 'do' ( LT !)* statement ( LT !)* 'while' ( LT !)* '(' expression ')' ( LT !| ';' )
            {
            root_0 = (Object)adaptor.nil();


            string_literal108=(Token)match(input,80,FOLLOW_80_in_doWhileStatement614); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal108_tree = 
            (Object)adaptor.create(string_literal108)
            ;
            adaptor.addChild(root_0, string_literal108_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:119:11: ( LT !)*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==LT) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:119:11: LT !
            	    {
            	    LT109=(Token)match(input,LT,FOLLOW_LT_in_doWhileStatement616); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            pushFollow(FOLLOW_statement_in_doWhileStatement620);
            statement110=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement110.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:119:26: ( LT !)*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==LT) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:119:26: LT !
            	    {
            	    LT111=(Token)match(input,LT,FOLLOW_LT_in_doWhileStatement622); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            string_literal112=(Token)match(input,100,FOLLOW_100_in_doWhileStatement626); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal112_tree = 
            (Object)adaptor.create(string_literal112)
            ;
            adaptor.addChild(root_0, string_literal112_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:119:39: ( LT !)*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==LT) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:119:39: LT !
            	    {
            	    LT113=(Token)match(input,LT,FOLLOW_LT_in_doWhileStatement628); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            char_literal114=(Token)match(input,40,FOLLOW_40_in_doWhileStatement632); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal114_tree = 
            (Object)adaptor.create(char_literal114)
            ;
            adaptor.addChild(root_0, char_literal114_tree);
            }

            pushFollow(FOLLOW_expression_in_doWhileStatement634);
            expression115=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression115.getTree());

            char_literal116=(Token)match(input,41,FOLLOW_41_in_doWhileStatement636); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal116_tree = 
            (Object)adaptor.create(char_literal116)
            ;
            adaptor.addChild(root_0, char_literal116_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:119:61: ( LT !| ';' )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==LT) ) {
                alt53=1;
            }
            else if ( (LA53_0==55) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;

            }
            switch (alt53) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:119:62: LT !
                    {
                    LT117=(Token)match(input,LT,FOLLOW_LT_in_doWhileStatement639); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:119:68: ';'
                    {
                    char_literal118=(Token)match(input,55,FOLLOW_55_in_doWhileStatement644); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal118_tree = 
                    (Object)adaptor.create(char_literal118)
                    ;
                    adaptor.addChild(root_0, char_literal118_tree);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 22, doWhileStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "doWhileStatement"


    public static class whileStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whileStatement"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:122:1: whileStatement : 'while' ( LT !)* '(' ( LT !)* expression ( LT !)* ')' ( LT !)* statement ;
    public final JavaScriptParser.whileStatement_return whileStatement() throws RecognitionException {
        JavaScriptParser.whileStatement_return retval = new JavaScriptParser.whileStatement_return();
        retval.start = input.LT(1);

        int whileStatement_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal119=null;
        Token LT120=null;
        Token char_literal121=null;
        Token LT122=null;
        Token LT124=null;
        Token char_literal125=null;
        Token LT126=null;
        JavaScriptParser.expression_return expression123 =null;

        JavaScriptParser.statement_return statement127 =null;


        Object string_literal119_tree=null;
        Object LT120_tree=null;
        Object char_literal121_tree=null;
        Object LT122_tree=null;
        Object LT124_tree=null;
        Object char_literal125_tree=null;
        Object LT126_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:123:2: ( 'while' ( LT !)* '(' ( LT !)* expression ( LT !)* ')' ( LT !)* statement )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:123:4: 'while' ( LT !)* '(' ( LT !)* expression ( LT !)* ')' ( LT !)* statement
            {
            root_0 = (Object)adaptor.nil();


            string_literal119=(Token)match(input,100,FOLLOW_100_in_whileStatement657); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal119_tree = 
            (Object)adaptor.create(string_literal119)
            ;
            adaptor.addChild(root_0, string_literal119_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:123:14: ( LT !)*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==LT) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:123:14: LT !
            	    {
            	    LT120=(Token)match(input,LT,FOLLOW_LT_in_whileStatement659); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            char_literal121=(Token)match(input,40,FOLLOW_40_in_whileStatement663); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal121_tree = 
            (Object)adaptor.create(char_literal121)
            ;
            adaptor.addChild(root_0, char_literal121_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:123:23: ( LT !)*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==LT) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:123:23: LT !
            	    {
            	    LT122=(Token)match(input,LT,FOLLOW_LT_in_whileStatement665); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            pushFollow(FOLLOW_expression_in_whileStatement669);
            expression123=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression123.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:123:39: ( LT !)*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==LT) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:123:39: LT !
            	    {
            	    LT124=(Token)match(input,LT,FOLLOW_LT_in_whileStatement671); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            char_literal125=(Token)match(input,41,FOLLOW_41_in_whileStatement675); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal125_tree = 
            (Object)adaptor.create(char_literal125)
            ;
            adaptor.addChild(root_0, char_literal125_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:123:48: ( LT !)*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==LT) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:123:48: LT !
            	    {
            	    LT126=(Token)match(input,LT,FOLLOW_LT_in_whileStatement677); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            pushFollow(FOLLOW_statement_in_whileStatement681);
            statement127=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement127.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 23, whileStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "whileStatement"


    public static class forStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forStatement"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:126:1: forStatement : 'for' ( LT !)* '(' ( ( LT !)* forStatementInitialiserPart )? ( LT !)* ';' ( ( LT !)* expression )? ( LT !)* ';' ( ( LT !)* expression )? ( LT !)* ')' ( LT !)* statement ;
    public final JavaScriptParser.forStatement_return forStatement() throws RecognitionException {
        JavaScriptParser.forStatement_return retval = new JavaScriptParser.forStatement_return();
        retval.start = input.LT(1);

        int forStatement_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal128=null;
        Token LT129=null;
        Token char_literal130=null;
        Token LT131=null;
        Token LT133=null;
        Token char_literal134=null;
        Token LT135=null;
        Token LT137=null;
        Token char_literal138=null;
        Token LT139=null;
        Token LT141=null;
        Token char_literal142=null;
        Token LT143=null;
        JavaScriptParser.forStatementInitialiserPart_return forStatementInitialiserPart132 =null;

        JavaScriptParser.expression_return expression136 =null;

        JavaScriptParser.expression_return expression140 =null;

        JavaScriptParser.statement_return statement144 =null;


        Object string_literal128_tree=null;
        Object LT129_tree=null;
        Object char_literal130_tree=null;
        Object LT131_tree=null;
        Object LT133_tree=null;
        Object char_literal134_tree=null;
        Object LT135_tree=null;
        Object LT137_tree=null;
        Object char_literal138_tree=null;
        Object LT139_tree=null;
        Object LT141_tree=null;
        Object char_literal142_tree=null;
        Object LT143_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:127:2: ( 'for' ( LT !)* '(' ( ( LT !)* forStatementInitialiserPart )? ( LT !)* ';' ( ( LT !)* expression )? ( LT !)* ';' ( ( LT !)* expression )? ( LT !)* ')' ( LT !)* statement )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:127:4: 'for' ( LT !)* '(' ( ( LT !)* forStatementInitialiserPart )? ( LT !)* ';' ( ( LT !)* expression )? ( LT !)* ';' ( ( LT !)* expression )? ( LT !)* ')' ( LT !)* statement
            {
            root_0 = (Object)adaptor.nil();


            string_literal128=(Token)match(input,84,FOLLOW_84_in_forStatement693); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal128_tree = 
            (Object)adaptor.create(string_literal128)
            ;
            adaptor.addChild(root_0, string_literal128_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:127:12: ( LT !)*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==LT) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:127:12: LT !
            	    {
            	    LT129=(Token)match(input,LT,FOLLOW_LT_in_forStatement695); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            char_literal130=(Token)match(input,40,FOLLOW_40_in_forStatement699); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal130_tree = 
            (Object)adaptor.create(char_literal130)
            ;
            adaptor.addChild(root_0, char_literal130_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:127:19: ( ( LT !)* forStatementInitialiserPart )?
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:127:20: ( LT !)* forStatementInitialiserPart
                    {
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:127:22: ( LT !)*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==LT) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:127:22: LT !
                    	    {
                    	    LT131=(Token)match(input,LT,FOLLOW_LT_in_forStatement702); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);


                    pushFollow(FOLLOW_forStatementInitialiserPart_in_forStatement706);
                    forStatementInitialiserPart132=forStatementInitialiserPart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forStatementInitialiserPart132.getTree());

                    }
                    break;

            }


            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:127:57: ( LT !)*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==LT) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:127:57: LT !
            	    {
            	    LT133=(Token)match(input,LT,FOLLOW_LT_in_forStatement710); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            char_literal134=(Token)match(input,55,FOLLOW_55_in_forStatement714); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal134_tree = 
            (Object)adaptor.create(char_literal134)
            ;
            adaptor.addChild(root_0, char_literal134_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:127:64: ( ( LT !)* expression )?
            int alt63=2;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:127:65: ( LT !)* expression
                    {
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:127:67: ( LT !)*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==LT) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:127:67: LT !
                    	    {
                    	    LT135=(Token)match(input,LT,FOLLOW_LT_in_forStatement717); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);


                    pushFollow(FOLLOW_expression_in_forStatement721);
                    expression136=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression136.getTree());

                    }
                    break;

            }


            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:127:85: ( LT !)*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==LT) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:127:85: LT !
            	    {
            	    LT137=(Token)match(input,LT,FOLLOW_LT_in_forStatement725); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);


            char_literal138=(Token)match(input,55,FOLLOW_55_in_forStatement729); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal138_tree = 
            (Object)adaptor.create(char_literal138)
            ;
            adaptor.addChild(root_0, char_literal138_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:127:92: ( ( LT !)* expression )?
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:127:93: ( LT !)* expression
                    {
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:127:95: ( LT !)*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==LT) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:127:95: LT !
                    	    {
                    	    LT139=(Token)match(input,LT,FOLLOW_LT_in_forStatement732); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);


                    pushFollow(FOLLOW_expression_in_forStatement736);
                    expression140=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression140.getTree());

                    }
                    break;

            }


            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:127:113: ( LT !)*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==LT) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:127:113: LT !
            	    {
            	    LT141=(Token)match(input,LT,FOLLOW_LT_in_forStatement740); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            char_literal142=(Token)match(input,41,FOLLOW_41_in_forStatement744); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal142_tree = 
            (Object)adaptor.create(char_literal142)
            ;
            adaptor.addChild(root_0, char_literal142_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:127:122: ( LT !)*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==LT) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:127:122: LT !
            	    {
            	    LT143=(Token)match(input,LT,FOLLOW_LT_in_forStatement746); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            pushFollow(FOLLOW_statement_in_forStatement750);
            statement144=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement144.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 24, forStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "forStatement"


    public static class forStatementInitialiserPart_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forStatementInitialiserPart"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:130:1: forStatementInitialiserPart : ( expressionNoIn | 'var' ( LT !)* variableDeclarationListNoIn );
    public final JavaScriptParser.forStatementInitialiserPart_return forStatementInitialiserPart() throws RecognitionException {
        JavaScriptParser.forStatementInitialiserPart_return retval = new JavaScriptParser.forStatementInitialiserPart_return();
        retval.start = input.LT(1);

        int forStatementInitialiserPart_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal146=null;
        Token LT147=null;
        JavaScriptParser.expressionNoIn_return expressionNoIn145 =null;

        JavaScriptParser.variableDeclarationListNoIn_return variableDeclarationListNoIn148 =null;


        Object string_literal146_tree=null;
        Object LT147_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:131:2: ( expressionNoIn | 'var' ( LT !)* variableDeclarationListNoIn )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==Identifier||(LA70_0 >= NumericLiteral && LA70_0 <= RegexpLiteral)||LA70_0==StringLiteral||LA70_0==32||LA70_0==40||(LA70_0 >= 44 && LA70_0 <= 45)||(LA70_0 >= 48 && LA70_0 <= 49)||LA70_0==70||LA70_0==79||LA70_0==82||LA70_0==85||(LA70_0 >= 89 && LA70_0 <= 90)||LA70_0==93||LA70_0==95||LA70_0==97||LA70_0==99||LA70_0==102||LA70_0==107) ) {
                alt70=1;
            }
            else if ( (LA70_0==98) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;

            }
            switch (alt70) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:131:4: expressionNoIn
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expressionNoIn_in_forStatementInitialiserPart762);
                    expressionNoIn145=expressionNoIn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionNoIn145.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:132:4: 'var' ( LT !)* variableDeclarationListNoIn
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal146=(Token)match(input,98,FOLLOW_98_in_forStatementInitialiserPart767); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal146_tree = 
                    (Object)adaptor.create(string_literal146)
                    ;
                    adaptor.addChild(root_0, string_literal146_tree);
                    }

                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:132:12: ( LT !)*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==LT) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:132:12: LT !
                    	    {
                    	    LT147=(Token)match(input,LT,FOLLOW_LT_in_forStatementInitialiserPart769); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);


                    pushFollow(FOLLOW_variableDeclarationListNoIn_in_forStatementInitialiserPart773);
                    variableDeclarationListNoIn148=variableDeclarationListNoIn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarationListNoIn148.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 25, forStatementInitialiserPart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "forStatementInitialiserPart"


    public static class forInStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forInStatement"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:135:1: forInStatement : 'for' ( LT !)* '(' ( LT !)* forInStatementInitialiserPart ( LT !)* 'in' ( LT !)* expression ( LT !)* ')' ( LT !)* statement ;
    public final JavaScriptParser.forInStatement_return forInStatement() throws RecognitionException {
        JavaScriptParser.forInStatement_return retval = new JavaScriptParser.forInStatement_return();
        retval.start = input.LT(1);

        int forInStatement_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal149=null;
        Token LT150=null;
        Token char_literal151=null;
        Token LT152=null;
        Token LT154=null;
        Token string_literal155=null;
        Token LT156=null;
        Token LT158=null;
        Token char_literal159=null;
        Token LT160=null;
        JavaScriptParser.forInStatementInitialiserPart_return forInStatementInitialiserPart153 =null;

        JavaScriptParser.expression_return expression157 =null;

        JavaScriptParser.statement_return statement161 =null;


        Object string_literal149_tree=null;
        Object LT150_tree=null;
        Object char_literal151_tree=null;
        Object LT152_tree=null;
        Object LT154_tree=null;
        Object string_literal155_tree=null;
        Object LT156_tree=null;
        Object LT158_tree=null;
        Object char_literal159_tree=null;
        Object LT160_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:136:2: ( 'for' ( LT !)* '(' ( LT !)* forInStatementInitialiserPart ( LT !)* 'in' ( LT !)* expression ( LT !)* ')' ( LT !)* statement )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:136:4: 'for' ( LT !)* '(' ( LT !)* forInStatementInitialiserPart ( LT !)* 'in' ( LT !)* expression ( LT !)* ')' ( LT !)* statement
            {
            root_0 = (Object)adaptor.nil();


            string_literal149=(Token)match(input,84,FOLLOW_84_in_forInStatement785); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal149_tree = 
            (Object)adaptor.create(string_literal149)
            ;
            adaptor.addChild(root_0, string_literal149_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:136:12: ( LT !)*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==LT) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:136:12: LT !
            	    {
            	    LT150=(Token)match(input,LT,FOLLOW_LT_in_forInStatement787); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            char_literal151=(Token)match(input,40,FOLLOW_40_in_forInStatement791); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal151_tree = 
            (Object)adaptor.create(char_literal151)
            ;
            adaptor.addChild(root_0, char_literal151_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:136:21: ( LT !)*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==LT) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:136:21: LT !
            	    {
            	    LT152=(Token)match(input,LT,FOLLOW_LT_in_forInStatement793); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            pushFollow(FOLLOW_forInStatementInitialiserPart_in_forInStatement797);
            forInStatementInitialiserPart153=forInStatementInitialiserPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, forInStatementInitialiserPart153.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:136:56: ( LT !)*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==LT) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:136:56: LT !
            	    {
            	    LT154=(Token)match(input,LT,FOLLOW_LT_in_forInStatement799); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);


            string_literal155=(Token)match(input,87,FOLLOW_87_in_forInStatement803); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal155_tree = 
            (Object)adaptor.create(string_literal155)
            ;
            adaptor.addChild(root_0, string_literal155_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:136:66: ( LT !)*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==LT) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:136:66: LT !
            	    {
            	    LT156=(Token)match(input,LT,FOLLOW_LT_in_forInStatement805); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            pushFollow(FOLLOW_expression_in_forInStatement809);
            expression157=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression157.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:136:82: ( LT !)*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==LT) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:136:82: LT !
            	    {
            	    LT158=(Token)match(input,LT,FOLLOW_LT_in_forInStatement811); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


            char_literal159=(Token)match(input,41,FOLLOW_41_in_forInStatement815); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal159_tree = 
            (Object)adaptor.create(char_literal159)
            ;
            adaptor.addChild(root_0, char_literal159_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:136:91: ( LT !)*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==LT) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:136:91: LT !
            	    {
            	    LT160=(Token)match(input,LT,FOLLOW_LT_in_forInStatement817); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);


            pushFollow(FOLLOW_statement_in_forInStatement821);
            statement161=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement161.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 26, forInStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "forInStatement"


    public static class forInStatementInitialiserPart_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forInStatementInitialiserPart"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:139:1: forInStatementInitialiserPart : ( leftHandSideExpression | 'var' ( LT !)* variableDeclarationNoIn );
    public final JavaScriptParser.forInStatementInitialiserPart_return forInStatementInitialiserPart() throws RecognitionException {
        JavaScriptParser.forInStatementInitialiserPart_return retval = new JavaScriptParser.forInStatementInitialiserPart_return();
        retval.start = input.LT(1);

        int forInStatementInitialiserPart_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal163=null;
        Token LT164=null;
        JavaScriptParser.leftHandSideExpression_return leftHandSideExpression162 =null;

        JavaScriptParser.variableDeclarationNoIn_return variableDeclarationNoIn165 =null;


        Object string_literal163_tree=null;
        Object LT164_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:140:2: ( leftHandSideExpression | 'var' ( LT !)* variableDeclarationNoIn )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==Identifier||(LA78_0 >= NumericLiteral && LA78_0 <= RegexpLiteral)||LA78_0==StringLiteral||LA78_0==40||LA78_0==70||LA78_0==82||LA78_0==85||(LA78_0 >= 89 && LA78_0 <= 90)||LA78_0==93||LA78_0==95||LA78_0==102) ) {
                alt78=1;
            }
            else if ( (LA78_0==98) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;

            }
            switch (alt78) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:140:4: leftHandSideExpression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_leftHandSideExpression_in_forInStatementInitialiserPart833);
                    leftHandSideExpression162=leftHandSideExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, leftHandSideExpression162.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:141:4: 'var' ( LT !)* variableDeclarationNoIn
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal163=(Token)match(input,98,FOLLOW_98_in_forInStatementInitialiserPart838); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal163_tree = 
                    (Object)adaptor.create(string_literal163)
                    ;
                    adaptor.addChild(root_0, string_literal163_tree);
                    }

                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:141:12: ( LT !)*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==LT) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:141:12: LT !
                    	    {
                    	    LT164=(Token)match(input,LT,FOLLOW_LT_in_forInStatementInitialiserPart840); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);


                    pushFollow(FOLLOW_variableDeclarationNoIn_in_forInStatementInitialiserPart844);
                    variableDeclarationNoIn165=variableDeclarationNoIn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclarationNoIn165.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 27, forInStatementInitialiserPart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "forInStatementInitialiserPart"


    public static class continueStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "continueStatement"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:144:1: continueStatement : 'continue' ( Identifier )? ( LT !| ';' ) ;
    public final JavaScriptParser.continueStatement_return continueStatement() throws RecognitionException {
        JavaScriptParser.continueStatement_return retval = new JavaScriptParser.continueStatement_return();
        retval.start = input.LT(1);

        int continueStatement_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal166=null;
        Token Identifier167=null;
        Token LT168=null;
        Token char_literal169=null;

        Object string_literal166_tree=null;
        Object Identifier167_tree=null;
        Object LT168_tree=null;
        Object char_literal169_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:145:2: ( 'continue' ( Identifier )? ( LT !| ';' ) )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:145:4: 'continue' ( Identifier )? ( LT !| ';' )
            {
            root_0 = (Object)adaptor.nil();


            string_literal166=(Token)match(input,77,FOLLOW_77_in_continueStatement855); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal166_tree = 
            (Object)adaptor.create(string_literal166)
            ;
            adaptor.addChild(root_0, string_literal166_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:145:15: ( Identifier )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==Identifier) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:145:15: Identifier
                    {
                    Identifier167=(Token)match(input,Identifier,FOLLOW_Identifier_in_continueStatement857); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier167_tree = 
                    (Object)adaptor.create(Identifier167)
                    ;
                    adaptor.addChild(root_0, Identifier167_tree);
                    }

                    }
                    break;

            }


            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:145:27: ( LT !| ';' )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==LT) ) {
                alt80=1;
            }
            else if ( (LA80_0==55) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;

            }
            switch (alt80) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:145:28: LT !
                    {
                    LT168=(Token)match(input,LT,FOLLOW_LT_in_continueStatement861); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:145:34: ';'
                    {
                    char_literal169=(Token)match(input,55,FOLLOW_55_in_continueStatement866); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal169_tree = 
                    (Object)adaptor.create(char_literal169)
                    ;
                    adaptor.addChild(root_0, char_literal169_tree);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 28, continueStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "continueStatement"


    public static class breakStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "breakStatement"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:148:1: breakStatement : 'break' ( Identifier )? ( LT !| ';' ) ;
    public final JavaScriptParser.breakStatement_return breakStatement() throws RecognitionException {
        JavaScriptParser.breakStatement_return retval = new JavaScriptParser.breakStatement_return();
        retval.start = input.LT(1);

        int breakStatement_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal170=null;
        Token Identifier171=null;
        Token LT172=null;
        Token char_literal173=null;

        Object string_literal170_tree=null;
        Object Identifier171_tree=null;
        Object LT172_tree=null;
        Object char_literal173_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:149:2: ( 'break' ( Identifier )? ( LT !| ';' ) )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:149:4: 'break' ( Identifier )? ( LT !| ';' )
            {
            root_0 = (Object)adaptor.nil();


            string_literal170=(Token)match(input,74,FOLLOW_74_in_breakStatement878); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal170_tree = 
            (Object)adaptor.create(string_literal170)
            ;
            adaptor.addChild(root_0, string_literal170_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:149:12: ( Identifier )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==Identifier) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:149:12: Identifier
                    {
                    Identifier171=(Token)match(input,Identifier,FOLLOW_Identifier_in_breakStatement880); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier171_tree = 
                    (Object)adaptor.create(Identifier171)
                    ;
                    adaptor.addChild(root_0, Identifier171_tree);
                    }

                    }
                    break;

            }


            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:149:24: ( LT !| ';' )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==LT) ) {
                alt82=1;
            }
            else if ( (LA82_0==55) ) {
                alt82=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;

            }
            switch (alt82) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:149:25: LT !
                    {
                    LT172=(Token)match(input,LT,FOLLOW_LT_in_breakStatement884); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:149:31: ';'
                    {
                    char_literal173=(Token)match(input,55,FOLLOW_55_in_breakStatement889); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal173_tree = 
                    (Object)adaptor.create(char_literal173)
                    ;
                    adaptor.addChild(root_0, char_literal173_tree);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 29, breakStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "breakStatement"


    public static class returnStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "returnStatement"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:152:1: returnStatement : 'return' ( expression )? ( LT !| ';' ) ;
    public final JavaScriptParser.returnStatement_return returnStatement() throws RecognitionException {
        JavaScriptParser.returnStatement_return retval = new JavaScriptParser.returnStatement_return();
        retval.start = input.LT(1);

        int returnStatement_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal174=null;
        Token LT176=null;
        Token char_literal177=null;
        JavaScriptParser.expression_return expression175 =null;


        Object string_literal174_tree=null;
        Object LT176_tree=null;
        Object char_literal177_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:153:2: ( 'return' ( expression )? ( LT !| ';' ) )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:153:4: 'return' ( expression )? ( LT !| ';' )
            {
            root_0 = (Object)adaptor.nil();


            string_literal174=(Token)match(input,91,FOLLOW_91_in_returnStatement901); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal174_tree = 
            (Object)adaptor.create(string_literal174)
            ;
            adaptor.addChild(root_0, string_literal174_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:153:13: ( expression )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==Identifier||(LA83_0 >= NumericLiteral && LA83_0 <= RegexpLiteral)||LA83_0==StringLiteral||LA83_0==32||LA83_0==40||(LA83_0 >= 44 && LA83_0 <= 45)||(LA83_0 >= 48 && LA83_0 <= 49)||LA83_0==70||LA83_0==79||LA83_0==82||LA83_0==85||(LA83_0 >= 89 && LA83_0 <= 90)||LA83_0==93||LA83_0==95||LA83_0==97||LA83_0==99||LA83_0==102||LA83_0==107) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:153:13: expression
                    {
                    pushFollow(FOLLOW_expression_in_returnStatement903);
                    expression175=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression175.getTree());

                    }
                    break;

            }


            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:153:25: ( LT !| ';' )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==LT) ) {
                alt84=1;
            }
            else if ( (LA84_0==55) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;

            }
            switch (alt84) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:153:26: LT !
                    {
                    LT176=(Token)match(input,LT,FOLLOW_LT_in_returnStatement907); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:153:32: ';'
                    {
                    char_literal177=(Token)match(input,55,FOLLOW_55_in_returnStatement912); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal177_tree = 
                    (Object)adaptor.create(char_literal177)
                    ;
                    adaptor.addChild(root_0, char_literal177_tree);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 30, returnStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "returnStatement"


    public static class withStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "withStatement"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:156:1: withStatement : 'with' ( LT !)* '(' ( LT !)* expression ( LT !)* ')' ( LT !)* statement ;
    public final JavaScriptParser.withStatement_return withStatement() throws RecognitionException {
        JavaScriptParser.withStatement_return retval = new JavaScriptParser.withStatement_return();
        retval.start = input.LT(1);

        int withStatement_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal178=null;
        Token LT179=null;
        Token char_literal180=null;
        Token LT181=null;
        Token LT183=null;
        Token char_literal184=null;
        Token LT185=null;
        JavaScriptParser.expression_return expression182 =null;

        JavaScriptParser.statement_return statement186 =null;


        Object string_literal178_tree=null;
        Object LT179_tree=null;
        Object char_literal180_tree=null;
        Object LT181_tree=null;
        Object LT183_tree=null;
        Object char_literal184_tree=null;
        Object LT185_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:157:2: ( 'with' ( LT !)* '(' ( LT !)* expression ( LT !)* ')' ( LT !)* statement )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:157:4: 'with' ( LT !)* '(' ( LT !)* expression ( LT !)* ')' ( LT !)* statement
            {
            root_0 = (Object)adaptor.nil();


            string_literal178=(Token)match(input,101,FOLLOW_101_in_withStatement925); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal178_tree = 
            (Object)adaptor.create(string_literal178)
            ;
            adaptor.addChild(root_0, string_literal178_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:157:13: ( LT !)*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==LT) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:157:13: LT !
            	    {
            	    LT179=(Token)match(input,LT,FOLLOW_LT_in_withStatement927); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);


            char_literal180=(Token)match(input,40,FOLLOW_40_in_withStatement931); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal180_tree = 
            (Object)adaptor.create(char_literal180)
            ;
            adaptor.addChild(root_0, char_literal180_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:157:22: ( LT !)*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==LT) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:157:22: LT !
            	    {
            	    LT181=(Token)match(input,LT,FOLLOW_LT_in_withStatement933); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);


            pushFollow(FOLLOW_expression_in_withStatement937);
            expression182=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression182.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:157:38: ( LT !)*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==LT) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:157:38: LT !
            	    {
            	    LT183=(Token)match(input,LT,FOLLOW_LT_in_withStatement939); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);


            char_literal184=(Token)match(input,41,FOLLOW_41_in_withStatement943); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal184_tree = 
            (Object)adaptor.create(char_literal184)
            ;
            adaptor.addChild(root_0, char_literal184_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:157:47: ( LT !)*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==LT) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:157:47: LT !
            	    {
            	    LT185=(Token)match(input,LT,FOLLOW_LT_in_withStatement945); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);


            pushFollow(FOLLOW_statement_in_withStatement949);
            statement186=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement186.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 31, withStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "withStatement"


    public static class labelledStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "labelledStatement"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:160:1: labelledStatement : Identifier ( LT !)* ':' ( LT !)* statement ;
    public final JavaScriptParser.labelledStatement_return labelledStatement() throws RecognitionException {
        JavaScriptParser.labelledStatement_return retval = new JavaScriptParser.labelledStatement_return();
        retval.start = input.LT(1);

        int labelledStatement_StartIndex = input.index();

        Object root_0 = null;

        Token Identifier187=null;
        Token LT188=null;
        Token char_literal189=null;
        Token LT190=null;
        JavaScriptParser.statement_return statement191 =null;


        Object Identifier187_tree=null;
        Object LT188_tree=null;
        Object char_literal189_tree=null;
        Object LT190_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:161:2: ( Identifier ( LT !)* ':' ( LT !)* statement )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:161:4: Identifier ( LT !)* ':' ( LT !)* statement
            {
            root_0 = (Object)adaptor.nil();


            Identifier187=(Token)match(input,Identifier,FOLLOW_Identifier_in_labelledStatement960); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier187_tree = 
            (Object)adaptor.create(Identifier187)
            ;
            adaptor.addChild(root_0, Identifier187_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:161:17: ( LT !)*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==LT) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:161:17: LT !
            	    {
            	    LT188=(Token)match(input,LT,FOLLOW_LT_in_labelledStatement962); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);


            char_literal189=(Token)match(input,54,FOLLOW_54_in_labelledStatement966); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal189_tree = 
            (Object)adaptor.create(char_literal189)
            ;
            adaptor.addChild(root_0, char_literal189_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:161:26: ( LT !)*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==LT) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:161:26: LT !
            	    {
            	    LT190=(Token)match(input,LT,FOLLOW_LT_in_labelledStatement968); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);


            pushFollow(FOLLOW_statement_in_labelledStatement972);
            statement191=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement191.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 32, labelledStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "labelledStatement"


    public static class switchStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "switchStatement"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:164:1: switchStatement : 'switch' ( LT !)* '(' ( LT !)* expression ( LT !)* ')' ( LT !)* caseBlock ;
    public final JavaScriptParser.switchStatement_return switchStatement() throws RecognitionException {
        JavaScriptParser.switchStatement_return retval = new JavaScriptParser.switchStatement_return();
        retval.start = input.LT(1);

        int switchStatement_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal192=null;
        Token LT193=null;
        Token char_literal194=null;
        Token LT195=null;
        Token LT197=null;
        Token char_literal198=null;
        Token LT199=null;
        JavaScriptParser.expression_return expression196 =null;

        JavaScriptParser.caseBlock_return caseBlock200 =null;


        Object string_literal192_tree=null;
        Object LT193_tree=null;
        Object char_literal194_tree=null;
        Object LT195_tree=null;
        Object LT197_tree=null;
        Object char_literal198_tree=null;
        Object LT199_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:165:2: ( 'switch' ( LT !)* '(' ( LT !)* expression ( LT !)* ')' ( LT !)* caseBlock )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:165:4: 'switch' ( LT !)* '(' ( LT !)* expression ( LT !)* ')' ( LT !)* caseBlock
            {
            root_0 = (Object)adaptor.nil();


            string_literal192=(Token)match(input,92,FOLLOW_92_in_switchStatement984); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal192_tree = 
            (Object)adaptor.create(string_literal192)
            ;
            adaptor.addChild(root_0, string_literal192_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:165:15: ( LT !)*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==LT) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:165:15: LT !
            	    {
            	    LT193=(Token)match(input,LT,FOLLOW_LT_in_switchStatement986); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);


            char_literal194=(Token)match(input,40,FOLLOW_40_in_switchStatement990); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal194_tree = 
            (Object)adaptor.create(char_literal194)
            ;
            adaptor.addChild(root_0, char_literal194_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:165:24: ( LT !)*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==LT) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:165:24: LT !
            	    {
            	    LT195=(Token)match(input,LT,FOLLOW_LT_in_switchStatement992); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);


            pushFollow(FOLLOW_expression_in_switchStatement996);
            expression196=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression196.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:165:40: ( LT !)*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==LT) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:165:40: LT !
            	    {
            	    LT197=(Token)match(input,LT,FOLLOW_LT_in_switchStatement998); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);


            char_literal198=(Token)match(input,41,FOLLOW_41_in_switchStatement1002); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal198_tree = 
            (Object)adaptor.create(char_literal198)
            ;
            adaptor.addChild(root_0, char_literal198_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:165:49: ( LT !)*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==LT) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:165:49: LT !
            	    {
            	    LT199=(Token)match(input,LT,FOLLOW_LT_in_switchStatement1004); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);


            pushFollow(FOLLOW_caseBlock_in_switchStatement1008);
            caseBlock200=caseBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, caseBlock200.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 33, switchStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "switchStatement"


    public static class caseBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "caseBlock"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:168:1: caseBlock : '{' ( ( LT !)* caseClause )* ( ( LT !)* defaultClause ( ( LT !)* caseClause )* )? ( LT !)* '}' ;
    public final JavaScriptParser.caseBlock_return caseBlock() throws RecognitionException {
        JavaScriptParser.caseBlock_return retval = new JavaScriptParser.caseBlock_return();
        retval.start = input.LT(1);

        int caseBlock_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal201=null;
        Token LT202=null;
        Token LT204=null;
        Token LT206=null;
        Token LT208=null;
        Token char_literal209=null;
        JavaScriptParser.caseClause_return caseClause203 =null;

        JavaScriptParser.defaultClause_return defaultClause205 =null;

        JavaScriptParser.caseClause_return caseClause207 =null;


        Object char_literal201_tree=null;
        Object LT202_tree=null;
        Object LT204_tree=null;
        Object LT206_tree=null;
        Object LT208_tree=null;
        Object char_literal209_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:169:2: ( '{' ( ( LT !)* caseClause )* ( ( LT !)* defaultClause ( ( LT !)* caseClause )* )? ( LT !)* '}' )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:169:4: '{' ( ( LT !)* caseClause )* ( ( LT !)* defaultClause ( ( LT !)* caseClause )* )? ( LT !)* '}'
            {
            root_0 = (Object)adaptor.nil();


            char_literal201=(Token)match(input,102,FOLLOW_102_in_caseBlock1020); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal201_tree = 
            (Object)adaptor.create(char_literal201)
            ;
            adaptor.addChild(root_0, char_literal201_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:169:8: ( ( LT !)* caseClause )*
            loop96:
            do {
                int alt96=2;
                alt96 = dfa96.predict(input);
                switch (alt96) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:169:9: ( LT !)* caseClause
            	    {
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:169:11: ( LT !)*
            	    loop95:
            	    do {
            	        int alt95=2;
            	        int LA95_0 = input.LA(1);

            	        if ( (LA95_0==LT) ) {
            	            alt95=1;
            	        }


            	        switch (alt95) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:169:11: LT !
            	    	    {
            	    	    LT202=(Token)match(input,LT,FOLLOW_LT_in_caseBlock1023); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop95;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_caseClause_in_caseBlock1027);
            	    caseClause203=caseClause();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, caseClause203.getTree());

            	    }
            	    break;

            	default :
            	    break loop96;
                }
            } while (true);


            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:169:27: ( ( LT !)* defaultClause ( ( LT !)* caseClause )* )?
            int alt100=2;
            alt100 = dfa100.predict(input);
            switch (alt100) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:169:28: ( LT !)* defaultClause ( ( LT !)* caseClause )*
                    {
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:169:30: ( LT !)*
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==LT) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:169:30: LT !
                    	    {
                    	    LT204=(Token)match(input,LT,FOLLOW_LT_in_caseBlock1032); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop97;
                        }
                    } while (true);


                    pushFollow(FOLLOW_defaultClause_in_caseBlock1036);
                    defaultClause205=defaultClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultClause205.getTree());

                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:169:47: ( ( LT !)* caseClause )*
                    loop99:
                    do {
                        int alt99=2;
                        alt99 = dfa99.predict(input);
                        switch (alt99) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:169:48: ( LT !)* caseClause
                    	    {
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:169:50: ( LT !)*
                    	    loop98:
                    	    do {
                    	        int alt98=2;
                    	        int LA98_0 = input.LA(1);

                    	        if ( (LA98_0==LT) ) {
                    	            alt98=1;
                    	        }


                    	        switch (alt98) {
                    	    	case 1 :
                    	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:169:50: LT !
                    	    	    {
                    	    	    LT206=(Token)match(input,LT,FOLLOW_LT_in_caseBlock1039); if (state.failed) return retval;

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop98;
                    	        }
                    	    } while (true);


                    	    pushFollow(FOLLOW_caseClause_in_caseBlock1043);
                    	    caseClause207=caseClause();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, caseClause207.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop99;
                        }
                    } while (true);


                    }
                    break;

            }


            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:169:70: ( LT !)*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==LT) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:169:70: LT !
            	    {
            	    LT208=(Token)match(input,LT,FOLLOW_LT_in_caseBlock1049); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop101;
                }
            } while (true);


            char_literal209=(Token)match(input,106,FOLLOW_106_in_caseBlock1053); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal209_tree = 
            (Object)adaptor.create(char_literal209)
            ;
            adaptor.addChild(root_0, char_literal209_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 34, caseBlock_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "caseBlock"


    public static class caseClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "caseClause"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:172:1: caseClause : 'case' ( LT !)* expression ( LT !)* ':' ( LT !)* ( statementList )? ;
    public final JavaScriptParser.caseClause_return caseClause() throws RecognitionException {
        JavaScriptParser.caseClause_return retval = new JavaScriptParser.caseClause_return();
        retval.start = input.LT(1);

        int caseClause_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal210=null;
        Token LT211=null;
        Token LT213=null;
        Token char_literal214=null;
        Token LT215=null;
        JavaScriptParser.expression_return expression212 =null;

        JavaScriptParser.statementList_return statementList216 =null;


        Object string_literal210_tree=null;
        Object LT211_tree=null;
        Object LT213_tree=null;
        Object char_literal214_tree=null;
        Object LT215_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:173:2: ( 'case' ( LT !)* expression ( LT !)* ':' ( LT !)* ( statementList )? )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:173:4: 'case' ( LT !)* expression ( LT !)* ':' ( LT !)* ( statementList )?
            {
            root_0 = (Object)adaptor.nil();


            string_literal210=(Token)match(input,75,FOLLOW_75_in_caseClause1064); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal210_tree = 
            (Object)adaptor.create(string_literal210)
            ;
            adaptor.addChild(root_0, string_literal210_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:173:13: ( LT !)*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==LT) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:173:13: LT !
            	    {
            	    LT211=(Token)match(input,LT,FOLLOW_LT_in_caseClause1066); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop102;
                }
            } while (true);


            pushFollow(FOLLOW_expression_in_caseClause1070);
            expression212=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression212.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:173:29: ( LT !)*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==LT) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:173:29: LT !
            	    {
            	    LT213=(Token)match(input,LT,FOLLOW_LT_in_caseClause1072); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop103;
                }
            } while (true);


            char_literal214=(Token)match(input,54,FOLLOW_54_in_caseClause1076); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal214_tree = 
            (Object)adaptor.create(char_literal214)
            ;
            adaptor.addChild(root_0, char_literal214_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:173:38: ( LT !)*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==LT) ) {
                    int LA104_2 = input.LA(2);

                    if ( (synpred118_JavaScript()) ) {
                        alt104=1;
                    }


                }


                switch (alt104) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:173:38: LT !
            	    {
            	    LT215=(Token)match(input,LT,FOLLOW_LT_in_caseClause1078); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop104;
                }
            } while (true);


            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:173:41: ( statementList )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==Identifier||(LA105_0 >= NumericLiteral && LA105_0 <= RegexpLiteral)||LA105_0==StringLiteral||LA105_0==32||LA105_0==40||(LA105_0 >= 44 && LA105_0 <= 45)||(LA105_0 >= 48 && LA105_0 <= 49)||LA105_0==55||LA105_0==70||LA105_0==74||LA105_0==77||(LA105_0 >= 79 && LA105_0 <= 80)||LA105_0==82||(LA105_0 >= 84 && LA105_0 <= 86)||(LA105_0 >= 89 && LA105_0 <= 102)||LA105_0==107) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:173:41: statementList
                    {
                    pushFollow(FOLLOW_statementList_in_caseClause1082);
                    statementList216=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList216.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 35, caseClause_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "caseClause"


    public static class defaultClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "defaultClause"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:176:1: defaultClause : 'default' ( LT !)* ':' ( LT !)* ( statementList )? ;
    public final JavaScriptParser.defaultClause_return defaultClause() throws RecognitionException {
        JavaScriptParser.defaultClause_return retval = new JavaScriptParser.defaultClause_return();
        retval.start = input.LT(1);

        int defaultClause_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal217=null;
        Token LT218=null;
        Token char_literal219=null;
        Token LT220=null;
        JavaScriptParser.statementList_return statementList221 =null;


        Object string_literal217_tree=null;
        Object LT218_tree=null;
        Object char_literal219_tree=null;
        Object LT220_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:177:2: ( 'default' ( LT !)* ':' ( LT !)* ( statementList )? )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:177:4: 'default' ( LT !)* ':' ( LT !)* ( statementList )?
            {
            root_0 = (Object)adaptor.nil();


            string_literal217=(Token)match(input,78,FOLLOW_78_in_defaultClause1095); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal217_tree = 
            (Object)adaptor.create(string_literal217)
            ;
            adaptor.addChild(root_0, string_literal217_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:177:16: ( LT !)*
            loop106:
            do {
                int alt106=2;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==LT) ) {
                    alt106=1;
                }


                switch (alt106) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:177:16: LT !
            	    {
            	    LT218=(Token)match(input,LT,FOLLOW_LT_in_defaultClause1097); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop106;
                }
            } while (true);


            char_literal219=(Token)match(input,54,FOLLOW_54_in_defaultClause1101); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal219_tree = 
            (Object)adaptor.create(char_literal219)
            ;
            adaptor.addChild(root_0, char_literal219_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:177:25: ( LT !)*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==LT) ) {
                    int LA107_2 = input.LA(2);

                    if ( (synpred121_JavaScript()) ) {
                        alt107=1;
                    }


                }


                switch (alt107) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:177:25: LT !
            	    {
            	    LT220=(Token)match(input,LT,FOLLOW_LT_in_defaultClause1103); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop107;
                }
            } while (true);


            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:177:28: ( statementList )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==Identifier||(LA108_0 >= NumericLiteral && LA108_0 <= RegexpLiteral)||LA108_0==StringLiteral||LA108_0==32||LA108_0==40||(LA108_0 >= 44 && LA108_0 <= 45)||(LA108_0 >= 48 && LA108_0 <= 49)||LA108_0==55||LA108_0==70||LA108_0==74||LA108_0==77||(LA108_0 >= 79 && LA108_0 <= 80)||LA108_0==82||(LA108_0 >= 84 && LA108_0 <= 86)||(LA108_0 >= 89 && LA108_0 <= 102)||LA108_0==107) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:177:28: statementList
                    {
                    pushFollow(FOLLOW_statementList_in_defaultClause1107);
                    statementList221=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementList221.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 36, defaultClause_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "defaultClause"


    public static class throwStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "throwStatement"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:180:1: throwStatement : 'throw' expression ( LT | ';' ) !;
    public final JavaScriptParser.throwStatement_return throwStatement() throws RecognitionException {
        JavaScriptParser.throwStatement_return retval = new JavaScriptParser.throwStatement_return();
        retval.start = input.LT(1);

        int throwStatement_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal222=null;
        Token set224=null;
        JavaScriptParser.expression_return expression223 =null;


        Object string_literal222_tree=null;
        Object set224_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:181:2: ( 'throw' expression ( LT | ';' ) !)
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:181:4: 'throw' expression ( LT | ';' ) !
            {
            root_0 = (Object)adaptor.nil();


            string_literal222=(Token)match(input,94,FOLLOW_94_in_throwStatement1120); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal222_tree = 
            (Object)adaptor.create(string_literal222)
            ;
            adaptor.addChild(root_0, string_literal222_tree);
            }

            pushFollow(FOLLOW_expression_in_throwStatement1122);
            expression223=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression223.getTree());

            set224=(Token)input.LT(1);

            if ( input.LA(1)==LT||input.LA(1)==55 ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 37, throwStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "throwStatement"


    public static class tryStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tryStatement"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:184:1: tryStatement : 'try' ( LT !)* statementBlock ( LT !)* ( finallyClause | catchClause ( ( LT !)* finallyClause )? ) ;
    public final JavaScriptParser.tryStatement_return tryStatement() throws RecognitionException {
        JavaScriptParser.tryStatement_return retval = new JavaScriptParser.tryStatement_return();
        retval.start = input.LT(1);

        int tryStatement_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal225=null;
        Token LT226=null;
        Token LT228=null;
        Token LT231=null;
        JavaScriptParser.statementBlock_return statementBlock227 =null;

        JavaScriptParser.finallyClause_return finallyClause229 =null;

        JavaScriptParser.catchClause_return catchClause230 =null;

        JavaScriptParser.finallyClause_return finallyClause232 =null;


        Object string_literal225_tree=null;
        Object LT226_tree=null;
        Object LT228_tree=null;
        Object LT231_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:185:2: ( 'try' ( LT !)* statementBlock ( LT !)* ( finallyClause | catchClause ( ( LT !)* finallyClause )? ) )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:185:4: 'try' ( LT !)* statementBlock ( LT !)* ( finallyClause | catchClause ( ( LT !)* finallyClause )? )
            {
            root_0 = (Object)adaptor.nil();


            string_literal225=(Token)match(input,96,FOLLOW_96_in_tryStatement1142); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal225_tree = 
            (Object)adaptor.create(string_literal225)
            ;
            adaptor.addChild(root_0, string_literal225_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:185:12: ( LT !)*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==LT) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:185:12: LT !
            	    {
            	    LT226=(Token)match(input,LT,FOLLOW_LT_in_tryStatement1144); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop109;
                }
            } while (true);


            pushFollow(FOLLOW_statementBlock_in_tryStatement1148);
            statementBlock227=statementBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementBlock227.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:185:32: ( LT !)*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==LT) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:185:32: LT !
            	    {
            	    LT228=(Token)match(input,LT,FOLLOW_LT_in_tryStatement1150); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop110;
                }
            } while (true);


            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:185:35: ( finallyClause | catchClause ( ( LT !)* finallyClause )? )
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==83) ) {
                alt113=1;
            }
            else if ( (LA113_0==76) ) {
                alt113=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;

            }
            switch (alt113) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:185:36: finallyClause
                    {
                    pushFollow(FOLLOW_finallyClause_in_tryStatement1155);
                    finallyClause229=finallyClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, finallyClause229.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:185:52: catchClause ( ( LT !)* finallyClause )?
                    {
                    pushFollow(FOLLOW_catchClause_in_tryStatement1159);
                    catchClause230=catchClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchClause230.getTree());

                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:185:64: ( ( LT !)* finallyClause )?
                    int alt112=2;
                    alt112 = dfa112.predict(input);
                    switch (alt112) {
                        case 1 :
                            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:185:65: ( LT !)* finallyClause
                            {
                            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:185:67: ( LT !)*
                            loop111:
                            do {
                                int alt111=2;
                                int LA111_0 = input.LA(1);

                                if ( (LA111_0==LT) ) {
                                    alt111=1;
                                }


                                switch (alt111) {
                            	case 1 :
                            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:185:67: LT !
                            	    {
                            	    LT231=(Token)match(input,LT,FOLLOW_LT_in_tryStatement1162); if (state.failed) return retval;

                            	    }
                            	    break;

                            	default :
                            	    break loop111;
                                }
                            } while (true);


                            pushFollow(FOLLOW_finallyClause_in_tryStatement1166);
                            finallyClause232=finallyClause();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, finallyClause232.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 38, tryStatement_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "tryStatement"


    public static class catchClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "catchClause"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:188:1: catchClause : 'catch' ( LT !)* '(' ( LT !)* Identifier ( LT !)* ')' ( LT !)* statementBlock ;
    public final JavaScriptParser.catchClause_return catchClause() throws RecognitionException {
        JavaScriptParser.catchClause_return retval = new JavaScriptParser.catchClause_return();
        retval.start = input.LT(1);

        int catchClause_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal233=null;
        Token LT234=null;
        Token char_literal235=null;
        Token LT236=null;
        Token Identifier237=null;
        Token LT238=null;
        Token char_literal239=null;
        Token LT240=null;
        JavaScriptParser.statementBlock_return statementBlock241 =null;


        Object string_literal233_tree=null;
        Object LT234_tree=null;
        Object char_literal235_tree=null;
        Object LT236_tree=null;
        Object Identifier237_tree=null;
        Object LT238_tree=null;
        Object char_literal239_tree=null;
        Object LT240_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:189:2: ( 'catch' ( LT !)* '(' ( LT !)* Identifier ( LT !)* ')' ( LT !)* statementBlock )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:189:4: 'catch' ( LT !)* '(' ( LT !)* Identifier ( LT !)* ')' ( LT !)* statementBlock
            {
            root_0 = (Object)adaptor.nil();


            string_literal233=(Token)match(input,76,FOLLOW_76_in_catchClause1187); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal233_tree = 
            (Object)adaptor.create(string_literal233)
            ;
            adaptor.addChild(root_0, string_literal233_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:189:14: ( LT !)*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==LT) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:189:14: LT !
            	    {
            	    LT234=(Token)match(input,LT,FOLLOW_LT_in_catchClause1189); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop114;
                }
            } while (true);


            char_literal235=(Token)match(input,40,FOLLOW_40_in_catchClause1193); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal235_tree = 
            (Object)adaptor.create(char_literal235)
            ;
            adaptor.addChild(root_0, char_literal235_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:189:23: ( LT !)*
            loop115:
            do {
                int alt115=2;
                int LA115_0 = input.LA(1);

                if ( (LA115_0==LT) ) {
                    alt115=1;
                }


                switch (alt115) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:189:23: LT !
            	    {
            	    LT236=(Token)match(input,LT,FOLLOW_LT_in_catchClause1195); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop115;
                }
            } while (true);


            Identifier237=(Token)match(input,Identifier,FOLLOW_Identifier_in_catchClause1199); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier237_tree = 
            (Object)adaptor.create(Identifier237)
            ;
            adaptor.addChild(root_0, Identifier237_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:189:39: ( LT !)*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==LT) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:189:39: LT !
            	    {
            	    LT238=(Token)match(input,LT,FOLLOW_LT_in_catchClause1201); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop116;
                }
            } while (true);


            char_literal239=(Token)match(input,41,FOLLOW_41_in_catchClause1205); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal239_tree = 
            (Object)adaptor.create(char_literal239)
            ;
            adaptor.addChild(root_0, char_literal239_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:189:48: ( LT !)*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==LT) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:189:48: LT !
            	    {
            	    LT240=(Token)match(input,LT,FOLLOW_LT_in_catchClause1207); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop117;
                }
            } while (true);


            pushFollow(FOLLOW_statementBlock_in_catchClause1211);
            statementBlock241=statementBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementBlock241.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 39, catchClause_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "catchClause"


    public static class finallyClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "finallyClause"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:192:1: finallyClause : 'finally' ( LT !)* statementBlock ;
    public final JavaScriptParser.finallyClause_return finallyClause() throws RecognitionException {
        JavaScriptParser.finallyClause_return retval = new JavaScriptParser.finallyClause_return();
        retval.start = input.LT(1);

        int finallyClause_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal242=null;
        Token LT243=null;
        JavaScriptParser.statementBlock_return statementBlock244 =null;


        Object string_literal242_tree=null;
        Object LT243_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:193:2: ( 'finally' ( LT !)* statementBlock )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:193:4: 'finally' ( LT !)* statementBlock
            {
            root_0 = (Object)adaptor.nil();


            string_literal242=(Token)match(input,83,FOLLOW_83_in_finallyClause1223); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal242_tree = 
            (Object)adaptor.create(string_literal242)
            ;
            adaptor.addChild(root_0, string_literal242_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:193:16: ( LT !)*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==LT) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:193:16: LT !
            	    {
            	    LT243=(Token)match(input,LT,FOLLOW_LT_in_finallyClause1225); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop118;
                }
            } while (true);


            pushFollow(FOLLOW_statementBlock_in_finallyClause1229);
            statementBlock244=statementBlock();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementBlock244.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 40, finallyClause_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "finallyClause"


    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:197:1: expression : assignmentExpression ( ( LT !)* ',' ( LT !)* assignmentExpression )* ;
    public final JavaScriptParser.expression_return expression() throws RecognitionException {
        JavaScriptParser.expression_return retval = new JavaScriptParser.expression_return();
        retval.start = input.LT(1);

        int expression_StartIndex = input.index();

        Object root_0 = null;

        Token LT246=null;
        Token char_literal247=null;
        Token LT248=null;
        JavaScriptParser.assignmentExpression_return assignmentExpression245 =null;

        JavaScriptParser.assignmentExpression_return assignmentExpression249 =null;


        Object LT246_tree=null;
        Object char_literal247_tree=null;
        Object LT248_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:198:2: ( assignmentExpression ( ( LT !)* ',' ( LT !)* assignmentExpression )* )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:198:4: assignmentExpression ( ( LT !)* ',' ( LT !)* assignmentExpression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assignmentExpression_in_expression1241);
            assignmentExpression245=assignmentExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression245.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:198:25: ( ( LT !)* ',' ( LT !)* assignmentExpression )*
            loop121:
            do {
                int alt121=2;
                alt121 = dfa121.predict(input);
                switch (alt121) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:198:26: ( LT !)* ',' ( LT !)* assignmentExpression
            	    {
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:198:28: ( LT !)*
            	    loop119:
            	    do {
            	        int alt119=2;
            	        int LA119_0 = input.LA(1);

            	        if ( (LA119_0==LT) ) {
            	            alt119=1;
            	        }


            	        switch (alt119) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:198:28: LT !
            	    	    {
            	    	    LT246=(Token)match(input,LT,FOLLOW_LT_in_expression1244); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop119;
            	        }
            	    } while (true);


            	    char_literal247=(Token)match(input,47,FOLLOW_47_in_expression1248); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal247_tree = 
            	    (Object)adaptor.create(char_literal247)
            	    ;
            	    adaptor.addChild(root_0, char_literal247_tree);
            	    }

            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:198:37: ( LT !)*
            	    loop120:
            	    do {
            	        int alt120=2;
            	        int LA120_0 = input.LA(1);

            	        if ( (LA120_0==LT) ) {
            	            alt120=1;
            	        }


            	        switch (alt120) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:198:37: LT !
            	    	    {
            	    	    LT248=(Token)match(input,LT,FOLLOW_LT_in_expression1250); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop120;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_assignmentExpression_in_expression1254);
            	    assignmentExpression249=assignmentExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression249.getTree());

            	    }
            	    break;

            	default :
            	    break loop121;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 41, expression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class expressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressionNoIn"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:201:1: expressionNoIn : assignmentExpressionNoIn ( ( LT !)* ',' ( LT !)* assignmentExpressionNoIn )* ;
    public final JavaScriptParser.expressionNoIn_return expressionNoIn() throws RecognitionException {
        JavaScriptParser.expressionNoIn_return retval = new JavaScriptParser.expressionNoIn_return();
        retval.start = input.LT(1);

        int expressionNoIn_StartIndex = input.index();

        Object root_0 = null;

        Token LT251=null;
        Token char_literal252=null;
        Token LT253=null;
        JavaScriptParser.assignmentExpressionNoIn_return assignmentExpressionNoIn250 =null;

        JavaScriptParser.assignmentExpressionNoIn_return assignmentExpressionNoIn254 =null;


        Object LT251_tree=null;
        Object char_literal252_tree=null;
        Object LT253_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:202:2: ( assignmentExpressionNoIn ( ( LT !)* ',' ( LT !)* assignmentExpressionNoIn )* )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:202:4: assignmentExpressionNoIn ( ( LT !)* ',' ( LT !)* assignmentExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn1268);
            assignmentExpressionNoIn250=assignmentExpressionNoIn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpressionNoIn250.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:202:29: ( ( LT !)* ',' ( LT !)* assignmentExpressionNoIn )*
            loop124:
            do {
                int alt124=2;
                alt124 = dfa124.predict(input);
                switch (alt124) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:202:30: ( LT !)* ',' ( LT !)* assignmentExpressionNoIn
            	    {
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:202:32: ( LT !)*
            	    loop122:
            	    do {
            	        int alt122=2;
            	        int LA122_0 = input.LA(1);

            	        if ( (LA122_0==LT) ) {
            	            alt122=1;
            	        }


            	        switch (alt122) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:202:32: LT !
            	    	    {
            	    	    LT251=(Token)match(input,LT,FOLLOW_LT_in_expressionNoIn1271); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop122;
            	        }
            	    } while (true);


            	    char_literal252=(Token)match(input,47,FOLLOW_47_in_expressionNoIn1275); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal252_tree = 
            	    (Object)adaptor.create(char_literal252)
            	    ;
            	    adaptor.addChild(root_0, char_literal252_tree);
            	    }

            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:202:41: ( LT !)*
            	    loop123:
            	    do {
            	        int alt123=2;
            	        int LA123_0 = input.LA(1);

            	        if ( (LA123_0==LT) ) {
            	            alt123=1;
            	        }


            	        switch (alt123) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:202:41: LT !
            	    	    {
            	    	    LT253=(Token)match(input,LT,FOLLOW_LT_in_expressionNoIn1277); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop123;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn1281);
            	    assignmentExpressionNoIn254=assignmentExpressionNoIn();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpressionNoIn254.getTree());

            	    }
            	    break;

            	default :
            	    break loop124;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 42, expressionNoIn_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "expressionNoIn"


    public static class assignmentExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignmentExpression"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:205:1: assignmentExpression : ( conditionalExpression | leftHandSideExpression ( LT !)* assignmentOperator ( LT !)* assignmentExpression );
    public final JavaScriptParser.assignmentExpression_return assignmentExpression() throws RecognitionException {
        JavaScriptParser.assignmentExpression_return retval = new JavaScriptParser.assignmentExpression_return();
        retval.start = input.LT(1);

        int assignmentExpression_StartIndex = input.index();

        Object root_0 = null;

        Token LT257=null;
        Token LT259=null;
        JavaScriptParser.conditionalExpression_return conditionalExpression255 =null;

        JavaScriptParser.leftHandSideExpression_return leftHandSideExpression256 =null;

        JavaScriptParser.assignmentOperator_return assignmentOperator258 =null;

        JavaScriptParser.assignmentExpression_return assignmentExpression260 =null;


        Object LT257_tree=null;
        Object LT259_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:206:2: ( conditionalExpression | leftHandSideExpression ( LT !)* assignmentOperator ( LT !)* assignmentExpression )
            int alt127=2;
            switch ( input.LA(1) ) {
            case 93:
                {
                int LA127_1 = input.LA(2);

                if ( (synpred140_JavaScript()) ) {
                    alt127=1;
                }
                else if ( (true) ) {
                    alt127=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 127, 1, input);

                    throw nvae;

                }
                }
                break;
            case Identifier:
                {
                int LA127_2 = input.LA(2);

                if ( (synpred140_JavaScript()) ) {
                    alt127=1;
                }
                else if ( (true) ) {
                    alt127=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 127, 2, input);

                    throw nvae;

                }
                }
                break;
            case NumericLiteral:
            case RegexpLiteral:
            case StringLiteral:
            case 82:
            case 90:
            case 95:
                {
                int LA127_3 = input.LA(2);

                if ( (synpred140_JavaScript()) ) {
                    alt127=1;
                }
                else if ( (true) ) {
                    alt127=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 127, 3, input);

                    throw nvae;

                }
                }
                break;
            case 70:
                {
                int LA127_4 = input.LA(2);

                if ( (synpred140_JavaScript()) ) {
                    alt127=1;
                }
                else if ( (true) ) {
                    alt127=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 127, 4, input);

                    throw nvae;

                }
                }
                break;
            case 102:
                {
                int LA127_5 = input.LA(2);

                if ( (synpred140_JavaScript()) ) {
                    alt127=1;
                }
                else if ( (true) ) {
                    alt127=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 127, 5, input);

                    throw nvae;

                }
                }
                break;
            case 40:
                {
                int LA127_6 = input.LA(2);

                if ( (synpred140_JavaScript()) ) {
                    alt127=1;
                }
                else if ( (true) ) {
                    alt127=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 127, 6, input);

                    throw nvae;

                }
                }
                break;
            case 85:
                {
                int LA127_7 = input.LA(2);

                if ( (synpred140_JavaScript()) ) {
                    alt127=1;
                }
                else if ( (true) ) {
                    alt127=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 127, 7, input);

                    throw nvae;

                }
                }
                break;
            case 89:
                {
                int LA127_8 = input.LA(2);

                if ( (synpred140_JavaScript()) ) {
                    alt127=1;
                }
                else if ( (true) ) {
                    alt127=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 127, 8, input);

                    throw nvae;

                }
                }
                break;
            case 32:
            case 44:
            case 45:
            case 48:
            case 49:
            case 79:
            case 97:
            case 99:
            case 107:
                {
                alt127=1;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;

            }

            switch (alt127) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:206:4: conditionalExpression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_conditionalExpression_in_assignmentExpression1295);
                    conditionalExpression255=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression255.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:207:4: leftHandSideExpression ( LT !)* assignmentOperator ( LT !)* assignmentExpression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_leftHandSideExpression_in_assignmentExpression1300);
                    leftHandSideExpression256=leftHandSideExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, leftHandSideExpression256.getTree());

                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:207:29: ( LT !)*
                    loop125:
                    do {
                        int alt125=2;
                        int LA125_0 = input.LA(1);

                        if ( (LA125_0==LT) ) {
                            alt125=1;
                        }


                        switch (alt125) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:207:29: LT !
                    	    {
                    	    LT257=(Token)match(input,LT,FOLLOW_LT_in_assignmentExpression1302); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop125;
                        }
                    } while (true);


                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpression1306);
                    assignmentOperator258=assignmentOperator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentOperator258.getTree());

                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:207:53: ( LT !)*
                    loop126:
                    do {
                        int alt126=2;
                        int LA126_0 = input.LA(1);

                        if ( (LA126_0==LT) ) {
                            alt126=1;
                        }


                        switch (alt126) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:207:53: LT !
                    	    {
                    	    LT259=(Token)match(input,LT,FOLLOW_LT_in_assignmentExpression1308); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop126;
                        }
                    } while (true);


                    pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression1312);
                    assignmentExpression260=assignmentExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression260.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 43, assignmentExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "assignmentExpression"


    public static class assignmentExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignmentExpressionNoIn"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:210:1: assignmentExpressionNoIn : ( conditionalExpressionNoIn | leftHandSideExpression ( LT !)* assignmentOperator ( LT !)* assignmentExpressionNoIn );
    public final JavaScriptParser.assignmentExpressionNoIn_return assignmentExpressionNoIn() throws RecognitionException {
        JavaScriptParser.assignmentExpressionNoIn_return retval = new JavaScriptParser.assignmentExpressionNoIn_return();
        retval.start = input.LT(1);

        int assignmentExpressionNoIn_StartIndex = input.index();

        Object root_0 = null;

        Token LT263=null;
        Token LT265=null;
        JavaScriptParser.conditionalExpressionNoIn_return conditionalExpressionNoIn261 =null;

        JavaScriptParser.leftHandSideExpression_return leftHandSideExpression262 =null;

        JavaScriptParser.assignmentOperator_return assignmentOperator264 =null;

        JavaScriptParser.assignmentExpressionNoIn_return assignmentExpressionNoIn266 =null;


        Object LT263_tree=null;
        Object LT265_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:211:2: ( conditionalExpressionNoIn | leftHandSideExpression ( LT !)* assignmentOperator ( LT !)* assignmentExpressionNoIn )
            int alt130=2;
            switch ( input.LA(1) ) {
            case 93:
                {
                int LA130_1 = input.LA(2);

                if ( (synpred143_JavaScript()) ) {
                    alt130=1;
                }
                else if ( (true) ) {
                    alt130=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 130, 1, input);

                    throw nvae;

                }
                }
                break;
            case Identifier:
                {
                int LA130_2 = input.LA(2);

                if ( (synpred143_JavaScript()) ) {
                    alt130=1;
                }
                else if ( (true) ) {
                    alt130=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 130, 2, input);

                    throw nvae;

                }
                }
                break;
            case NumericLiteral:
            case RegexpLiteral:
            case StringLiteral:
            case 82:
            case 90:
            case 95:
                {
                int LA130_3 = input.LA(2);

                if ( (synpred143_JavaScript()) ) {
                    alt130=1;
                }
                else if ( (true) ) {
                    alt130=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 130, 3, input);

                    throw nvae;

                }
                }
                break;
            case 70:
                {
                int LA130_4 = input.LA(2);

                if ( (synpred143_JavaScript()) ) {
                    alt130=1;
                }
                else if ( (true) ) {
                    alt130=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 130, 4, input);

                    throw nvae;

                }
                }
                break;
            case 102:
                {
                int LA130_5 = input.LA(2);

                if ( (synpred143_JavaScript()) ) {
                    alt130=1;
                }
                else if ( (true) ) {
                    alt130=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 130, 5, input);

                    throw nvae;

                }
                }
                break;
            case 40:
                {
                int LA130_6 = input.LA(2);

                if ( (synpred143_JavaScript()) ) {
                    alt130=1;
                }
                else if ( (true) ) {
                    alt130=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 130, 6, input);

                    throw nvae;

                }
                }
                break;
            case 85:
                {
                int LA130_7 = input.LA(2);

                if ( (synpred143_JavaScript()) ) {
                    alt130=1;
                }
                else if ( (true) ) {
                    alt130=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 130, 7, input);

                    throw nvae;

                }
                }
                break;
            case 89:
                {
                int LA130_8 = input.LA(2);

                if ( (synpred143_JavaScript()) ) {
                    alt130=1;
                }
                else if ( (true) ) {
                    alt130=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 130, 8, input);

                    throw nvae;

                }
                }
                break;
            case 32:
            case 44:
            case 45:
            case 48:
            case 49:
            case 79:
            case 97:
            case 99:
            case 107:
                {
                alt130=1;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;

            }

            switch (alt130) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:211:4: conditionalExpressionNoIn
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn1324);
                    conditionalExpressionNoIn261=conditionalExpressionNoIn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpressionNoIn261.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:212:4: leftHandSideExpression ( LT !)* assignmentOperator ( LT !)* assignmentExpressionNoIn
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_leftHandSideExpression_in_assignmentExpressionNoIn1329);
                    leftHandSideExpression262=leftHandSideExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, leftHandSideExpression262.getTree());

                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:212:29: ( LT !)*
                    loop128:
                    do {
                        int alt128=2;
                        int LA128_0 = input.LA(1);

                        if ( (LA128_0==LT) ) {
                            alt128=1;
                        }


                        switch (alt128) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:212:29: LT !
                    	    {
                    	    LT263=(Token)match(input,LT,FOLLOW_LT_in_assignmentExpressionNoIn1331); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop128;
                        }
                    } while (true);


                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpressionNoIn1335);
                    assignmentOperator264=assignmentOperator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentOperator264.getTree());

                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:212:53: ( LT !)*
                    loop129:
                    do {
                        int alt129=2;
                        int LA129_0 = input.LA(1);

                        if ( (LA129_0==LT) ) {
                            alt129=1;
                        }


                        switch (alt129) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:212:53: LT !
                    	    {
                    	    LT265=(Token)match(input,LT,FOLLOW_LT_in_assignmentExpressionNoIn1337); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop129;
                        }
                    } while (true);


                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn1341);
                    assignmentExpressionNoIn266=assignmentExpressionNoIn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpressionNoIn266.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 44, assignmentExpressionNoIn_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "assignmentExpressionNoIn"


    public static class leftHandSideExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "leftHandSideExpression"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:215:1: leftHandSideExpression : ( callExpression | newExpression );
    public final JavaScriptParser.leftHandSideExpression_return leftHandSideExpression() throws RecognitionException {
        JavaScriptParser.leftHandSideExpression_return retval = new JavaScriptParser.leftHandSideExpression_return();
        retval.start = input.LT(1);

        int leftHandSideExpression_StartIndex = input.index();

        Object root_0 = null;

        JavaScriptParser.callExpression_return callExpression267 =null;

        JavaScriptParser.newExpression_return newExpression268 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:216:2: ( callExpression | newExpression )
            int alt131=2;
            switch ( input.LA(1) ) {
            case 93:
                {
                int LA131_1 = input.LA(2);

                if ( (synpred146_JavaScript()) ) {
                    alt131=1;
                }
                else if ( (true) ) {
                    alt131=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 131, 1, input);

                    throw nvae;

                }
                }
                break;
            case Identifier:
                {
                int LA131_2 = input.LA(2);

                if ( (synpred146_JavaScript()) ) {
                    alt131=1;
                }
                else if ( (true) ) {
                    alt131=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 131, 2, input);

                    throw nvae;

                }
                }
                break;
            case NumericLiteral:
            case RegexpLiteral:
            case StringLiteral:
            case 82:
            case 90:
            case 95:
                {
                int LA131_3 = input.LA(2);

                if ( (synpred146_JavaScript()) ) {
                    alt131=1;
                }
                else if ( (true) ) {
                    alt131=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 131, 3, input);

                    throw nvae;

                }
                }
                break;
            case 70:
                {
                int LA131_4 = input.LA(2);

                if ( (synpred146_JavaScript()) ) {
                    alt131=1;
                }
                else if ( (true) ) {
                    alt131=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 131, 4, input);

                    throw nvae;

                }
                }
                break;
            case 102:
                {
                int LA131_5 = input.LA(2);

                if ( (synpred146_JavaScript()) ) {
                    alt131=1;
                }
                else if ( (true) ) {
                    alt131=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 131, 5, input);

                    throw nvae;

                }
                }
                break;
            case 40:
                {
                int LA131_6 = input.LA(2);

                if ( (synpred146_JavaScript()) ) {
                    alt131=1;
                }
                else if ( (true) ) {
                    alt131=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 131, 6, input);

                    throw nvae;

                }
                }
                break;
            case 85:
                {
                int LA131_7 = input.LA(2);

                if ( (synpred146_JavaScript()) ) {
                    alt131=1;
                }
                else if ( (true) ) {
                    alt131=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 131, 7, input);

                    throw nvae;

                }
                }
                break;
            case 89:
                {
                int LA131_8 = input.LA(2);

                if ( (synpred146_JavaScript()) ) {
                    alt131=1;
                }
                else if ( (true) ) {
                    alt131=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 131, 8, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 131, 0, input);

                throw nvae;

            }

            switch (alt131) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:216:4: callExpression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_callExpression_in_leftHandSideExpression1353);
                    callExpression267=callExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, callExpression267.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:217:4: newExpression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_newExpression_in_leftHandSideExpression1358);
                    newExpression268=newExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, newExpression268.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 45, leftHandSideExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "leftHandSideExpression"


    public static class newExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "newExpression"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:220:1: newExpression : ( memberExpression | 'new' ( LT !)* newExpression );
    public final JavaScriptParser.newExpression_return newExpression() throws RecognitionException {
        JavaScriptParser.newExpression_return retval = new JavaScriptParser.newExpression_return();
        retval.start = input.LT(1);

        int newExpression_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal270=null;
        Token LT271=null;
        JavaScriptParser.memberExpression_return memberExpression269 =null;

        JavaScriptParser.newExpression_return newExpression272 =null;


        Object string_literal270_tree=null;
        Object LT271_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:221:2: ( memberExpression | 'new' ( LT !)* newExpression )
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==Identifier||(LA133_0 >= NumericLiteral && LA133_0 <= RegexpLiteral)||LA133_0==StringLiteral||LA133_0==40||LA133_0==70||LA133_0==82||LA133_0==85||LA133_0==90||LA133_0==93||LA133_0==95||LA133_0==102) ) {
                alt133=1;
            }
            else if ( (LA133_0==89) ) {
                int LA133_8 = input.LA(2);

                if ( (synpred147_JavaScript()) ) {
                    alt133=1;
                }
                else if ( (true) ) {
                    alt133=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 133, 8, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 133, 0, input);

                throw nvae;

            }
            switch (alt133) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:221:4: memberExpression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_memberExpression_in_newExpression1370);
                    memberExpression269=memberExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, memberExpression269.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:222:4: 'new' ( LT !)* newExpression
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal270=(Token)match(input,89,FOLLOW_89_in_newExpression1375); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal270_tree = 
                    (Object)adaptor.create(string_literal270)
                    ;
                    adaptor.addChild(root_0, string_literal270_tree);
                    }

                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:222:12: ( LT !)*
                    loop132:
                    do {
                        int alt132=2;
                        int LA132_0 = input.LA(1);

                        if ( (LA132_0==LT) ) {
                            alt132=1;
                        }


                        switch (alt132) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:222:12: LT !
                    	    {
                    	    LT271=(Token)match(input,LT,FOLLOW_LT_in_newExpression1377); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop132;
                        }
                    } while (true);


                    pushFollow(FOLLOW_newExpression_in_newExpression1381);
                    newExpression272=newExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, newExpression272.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 46, newExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "newExpression"


    public static class memberExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "memberExpression"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:225:1: memberExpression : ( primaryExpression | functionExpression | 'new' ( LT !)* memberExpression ( LT !)* arguments ) ( ( LT !)* memberExpressionSuffix )* ;
    public final JavaScriptParser.memberExpression_return memberExpression() throws RecognitionException {
        JavaScriptParser.memberExpression_return retval = new JavaScriptParser.memberExpression_return();
        retval.start = input.LT(1);

        int memberExpression_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal275=null;
        Token LT276=null;
        Token LT278=null;
        Token LT280=null;
        JavaScriptParser.primaryExpression_return primaryExpression273 =null;

        JavaScriptParser.functionExpression_return functionExpression274 =null;

        JavaScriptParser.memberExpression_return memberExpression277 =null;

        JavaScriptParser.arguments_return arguments279 =null;

        JavaScriptParser.memberExpressionSuffix_return memberExpressionSuffix281 =null;


        Object string_literal275_tree=null;
        Object LT276_tree=null;
        Object LT278_tree=null;
        Object LT280_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:226:2: ( ( primaryExpression | functionExpression | 'new' ( LT !)* memberExpression ( LT !)* arguments ) ( ( LT !)* memberExpressionSuffix )* )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:226:4: ( primaryExpression | functionExpression | 'new' ( LT !)* memberExpression ( LT !)* arguments ) ( ( LT !)* memberExpressionSuffix )*
            {
            root_0 = (Object)adaptor.nil();


            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:226:4: ( primaryExpression | functionExpression | 'new' ( LT !)* memberExpression ( LT !)* arguments )
            int alt136=3;
            switch ( input.LA(1) ) {
            case Identifier:
            case NumericLiteral:
            case RegexpLiteral:
            case StringLiteral:
            case 40:
            case 70:
            case 82:
            case 90:
            case 93:
            case 95:
            case 102:
                {
                alt136=1;
                }
                break;
            case 85:
                {
                alt136=2;
                }
                break;
            case 89:
                {
                alt136=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 136, 0, input);

                throw nvae;

            }

            switch (alt136) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:226:5: primaryExpression
                    {
                    pushFollow(FOLLOW_primaryExpression_in_memberExpression1394);
                    primaryExpression273=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primaryExpression273.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:226:25: functionExpression
                    {
                    pushFollow(FOLLOW_functionExpression_in_memberExpression1398);
                    functionExpression274=functionExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionExpression274.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:226:46: 'new' ( LT !)* memberExpression ( LT !)* arguments
                    {
                    string_literal275=(Token)match(input,89,FOLLOW_89_in_memberExpression1402); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal275_tree = 
                    (Object)adaptor.create(string_literal275)
                    ;
                    adaptor.addChild(root_0, string_literal275_tree);
                    }

                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:226:54: ( LT !)*
                    loop134:
                    do {
                        int alt134=2;
                        int LA134_0 = input.LA(1);

                        if ( (LA134_0==LT) ) {
                            alt134=1;
                        }


                        switch (alt134) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:226:54: LT !
                    	    {
                    	    LT276=(Token)match(input,LT,FOLLOW_LT_in_memberExpression1404); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop134;
                        }
                    } while (true);


                    pushFollow(FOLLOW_memberExpression_in_memberExpression1408);
                    memberExpression277=memberExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, memberExpression277.getTree());

                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:226:76: ( LT !)*
                    loop135:
                    do {
                        int alt135=2;
                        int LA135_0 = input.LA(1);

                        if ( (LA135_0==LT) ) {
                            alt135=1;
                        }


                        switch (alt135) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:226:76: LT !
                    	    {
                    	    LT278=(Token)match(input,LT,FOLLOW_LT_in_memberExpression1410); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop135;
                        }
                    } while (true);


                    pushFollow(FOLLOW_arguments_in_memberExpression1414);
                    arguments279=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments279.getTree());

                    }
                    break;

            }


            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:226:90: ( ( LT !)* memberExpressionSuffix )*
            loop138:
            do {
                int alt138=2;
                int LA138_0 = input.LA(1);

                if ( (LA138_0==LT) ) {
                    int LA138_1 = input.LA(2);

                    if ( (synpred154_JavaScript()) ) {
                        alt138=1;
                    }


                }
                else if ( (LA138_0==51||LA138_0==70) ) {
                    alt138=1;
                }


                switch (alt138) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:226:91: ( LT !)* memberExpressionSuffix
            	    {
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:226:93: ( LT !)*
            	    loop137:
            	    do {
            	        int alt137=2;
            	        int LA137_0 = input.LA(1);

            	        if ( (LA137_0==LT) ) {
            	            alt137=1;
            	        }


            	        switch (alt137) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:226:93: LT !
            	    	    {
            	    	    LT280=(Token)match(input,LT,FOLLOW_LT_in_memberExpression1418); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop137;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_memberExpressionSuffix_in_memberExpression1422);
            	    memberExpressionSuffix281=memberExpressionSuffix();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, memberExpressionSuffix281.getTree());

            	    }
            	    break;

            	default :
            	    break loop138;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 47, memberExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "memberExpression"


    public static class memberExpressionSuffix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "memberExpressionSuffix"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:229:1: memberExpressionSuffix : ( indexSuffix | propertyReferenceSuffix );
    public final JavaScriptParser.memberExpressionSuffix_return memberExpressionSuffix() throws RecognitionException {
        JavaScriptParser.memberExpressionSuffix_return retval = new JavaScriptParser.memberExpressionSuffix_return();
        retval.start = input.LT(1);

        int memberExpressionSuffix_StartIndex = input.index();

        Object root_0 = null;

        JavaScriptParser.indexSuffix_return indexSuffix282 =null;

        JavaScriptParser.propertyReferenceSuffix_return propertyReferenceSuffix283 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:230:2: ( indexSuffix | propertyReferenceSuffix )
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==70) ) {
                alt139=1;
            }
            else if ( (LA139_0==51) ) {
                alt139=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 139, 0, input);

                throw nvae;

            }
            switch (alt139) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:230:4: indexSuffix
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_indexSuffix_in_memberExpressionSuffix1436);
                    indexSuffix282=indexSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, indexSuffix282.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:231:4: propertyReferenceSuffix
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_propertyReferenceSuffix_in_memberExpressionSuffix1441);
                    propertyReferenceSuffix283=propertyReferenceSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, propertyReferenceSuffix283.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 48, memberExpressionSuffix_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "memberExpressionSuffix"


    public static class callExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "callExpression"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:234:1: callExpression : memberExpression ( LT !)* arguments ( ( LT !)* callExpressionSuffix )* ;
    public final JavaScriptParser.callExpression_return callExpression() throws RecognitionException {
        JavaScriptParser.callExpression_return retval = new JavaScriptParser.callExpression_return();
        retval.start = input.LT(1);

        int callExpression_StartIndex = input.index();

        Object root_0 = null;

        Token LT285=null;
        Token LT287=null;
        JavaScriptParser.memberExpression_return memberExpression284 =null;

        JavaScriptParser.arguments_return arguments286 =null;

        JavaScriptParser.callExpressionSuffix_return callExpressionSuffix288 =null;


        Object LT285_tree=null;
        Object LT287_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:235:2: ( memberExpression ( LT !)* arguments ( ( LT !)* callExpressionSuffix )* )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:235:4: memberExpression ( LT !)* arguments ( ( LT !)* callExpressionSuffix )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_memberExpression_in_callExpression1452);
            memberExpression284=memberExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, memberExpression284.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:235:23: ( LT !)*
            loop140:
            do {
                int alt140=2;
                int LA140_0 = input.LA(1);

                if ( (LA140_0==LT) ) {
                    alt140=1;
                }


                switch (alt140) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:235:23: LT !
            	    {
            	    LT285=(Token)match(input,LT,FOLLOW_LT_in_callExpression1454); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop140;
                }
            } while (true);


            pushFollow(FOLLOW_arguments_in_callExpression1458);
            arguments286=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments286.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:235:36: ( ( LT !)* callExpressionSuffix )*
            loop142:
            do {
                int alt142=2;
                int LA142_0 = input.LA(1);

                if ( (LA142_0==LT) ) {
                    int LA142_1 = input.LA(2);

                    if ( (synpred158_JavaScript()) ) {
                        alt142=1;
                    }


                }
                else if ( (LA142_0==40||LA142_0==51||LA142_0==70) ) {
                    alt142=1;
                }


                switch (alt142) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:235:37: ( LT !)* callExpressionSuffix
            	    {
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:235:39: ( LT !)*
            	    loop141:
            	    do {
            	        int alt141=2;
            	        int LA141_0 = input.LA(1);

            	        if ( (LA141_0==LT) ) {
            	            alt141=1;
            	        }


            	        switch (alt141) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:235:39: LT !
            	    	    {
            	    	    LT287=(Token)match(input,LT,FOLLOW_LT_in_callExpression1461); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop141;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_callExpressionSuffix_in_callExpression1465);
            	    callExpressionSuffix288=callExpressionSuffix();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, callExpressionSuffix288.getTree());

            	    }
            	    break;

            	default :
            	    break loop142;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 49, callExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "callExpression"


    public static class callExpressionSuffix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "callExpressionSuffix"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:238:1: callExpressionSuffix : ( arguments | indexSuffix | propertyReferenceSuffix );
    public final JavaScriptParser.callExpressionSuffix_return callExpressionSuffix() throws RecognitionException {
        JavaScriptParser.callExpressionSuffix_return retval = new JavaScriptParser.callExpressionSuffix_return();
        retval.start = input.LT(1);

        int callExpressionSuffix_StartIndex = input.index();

        Object root_0 = null;

        JavaScriptParser.arguments_return arguments289 =null;

        JavaScriptParser.indexSuffix_return indexSuffix290 =null;

        JavaScriptParser.propertyReferenceSuffix_return propertyReferenceSuffix291 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:239:2: ( arguments | indexSuffix | propertyReferenceSuffix )
            int alt143=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt143=1;
                }
                break;
            case 70:
                {
                alt143=2;
                }
                break;
            case 51:
                {
                alt143=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;

            }

            switch (alt143) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:239:4: arguments
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_arguments_in_callExpressionSuffix1479);
                    arguments289=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments289.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:240:4: indexSuffix
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_indexSuffix_in_callExpressionSuffix1484);
                    indexSuffix290=indexSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, indexSuffix290.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:241:4: propertyReferenceSuffix
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_propertyReferenceSuffix_in_callExpressionSuffix1489);
                    propertyReferenceSuffix291=propertyReferenceSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, propertyReferenceSuffix291.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 50, callExpressionSuffix_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "callExpressionSuffix"


    public static class arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arguments"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:244:1: arguments : '(' ( ( LT !)* assignmentExpression ( ( LT !)* ',' ( LT !)* assignmentExpression )* )? ( LT !)* ')' ;
    public final JavaScriptParser.arguments_return arguments() throws RecognitionException {
        JavaScriptParser.arguments_return retval = new JavaScriptParser.arguments_return();
        retval.start = input.LT(1);

        int arguments_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal292=null;
        Token LT293=null;
        Token LT295=null;
        Token char_literal296=null;
        Token LT297=null;
        Token LT299=null;
        Token char_literal300=null;
        JavaScriptParser.assignmentExpression_return assignmentExpression294 =null;

        JavaScriptParser.assignmentExpression_return assignmentExpression298 =null;


        Object char_literal292_tree=null;
        Object LT293_tree=null;
        Object LT295_tree=null;
        Object char_literal296_tree=null;
        Object LT297_tree=null;
        Object LT299_tree=null;
        Object char_literal300_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:245:2: ( '(' ( ( LT !)* assignmentExpression ( ( LT !)* ',' ( LT !)* assignmentExpression )* )? ( LT !)* ')' )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:245:4: '(' ( ( LT !)* assignmentExpression ( ( LT !)* ',' ( LT !)* assignmentExpression )* )? ( LT !)* ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal292=(Token)match(input,40,FOLLOW_40_in_arguments1500); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal292_tree = 
            (Object)adaptor.create(char_literal292)
            ;
            adaptor.addChild(root_0, char_literal292_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:245:8: ( ( LT !)* assignmentExpression ( ( LT !)* ',' ( LT !)* assignmentExpression )* )?
            int alt148=2;
            alt148 = dfa148.predict(input);
            switch (alt148) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:245:9: ( LT !)* assignmentExpression ( ( LT !)* ',' ( LT !)* assignmentExpression )*
                    {
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:245:11: ( LT !)*
                    loop144:
                    do {
                        int alt144=2;
                        int LA144_0 = input.LA(1);

                        if ( (LA144_0==LT) ) {
                            alt144=1;
                        }


                        switch (alt144) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:245:11: LT !
                    	    {
                    	    LT293=(Token)match(input,LT,FOLLOW_LT_in_arguments1503); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop144;
                        }
                    } while (true);


                    pushFollow(FOLLOW_assignmentExpression_in_arguments1507);
                    assignmentExpression294=assignmentExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression294.getTree());

                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:245:35: ( ( LT !)* ',' ( LT !)* assignmentExpression )*
                    loop147:
                    do {
                        int alt147=2;
                        alt147 = dfa147.predict(input);
                        switch (alt147) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:245:36: ( LT !)* ',' ( LT !)* assignmentExpression
                    	    {
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:245:38: ( LT !)*
                    	    loop145:
                    	    do {
                    	        int alt145=2;
                    	        int LA145_0 = input.LA(1);

                    	        if ( (LA145_0==LT) ) {
                    	            alt145=1;
                    	        }


                    	        switch (alt145) {
                    	    	case 1 :
                    	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:245:38: LT !
                    	    	    {
                    	    	    LT295=(Token)match(input,LT,FOLLOW_LT_in_arguments1510); if (state.failed) return retval;

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop145;
                    	        }
                    	    } while (true);


                    	    char_literal296=(Token)match(input,47,FOLLOW_47_in_arguments1514); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal296_tree = 
                    	    (Object)adaptor.create(char_literal296)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal296_tree);
                    	    }

                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:245:47: ( LT !)*
                    	    loop146:
                    	    do {
                    	        int alt146=2;
                    	        int LA146_0 = input.LA(1);

                    	        if ( (LA146_0==LT) ) {
                    	            alt146=1;
                    	        }


                    	        switch (alt146) {
                    	    	case 1 :
                    	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:245:47: LT !
                    	    	    {
                    	    	    LT297=(Token)match(input,LT,FOLLOW_LT_in_arguments1516); if (state.failed) return retval;

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop146;
                    	        }
                    	    } while (true);


                    	    pushFollow(FOLLOW_assignmentExpression_in_arguments1520);
                    	    assignmentExpression298=assignmentExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression298.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop147;
                        }
                    } while (true);


                    }
                    break;

            }


            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:245:77: ( LT !)*
            loop149:
            do {
                int alt149=2;
                int LA149_0 = input.LA(1);

                if ( (LA149_0==LT) ) {
                    alt149=1;
                }


                switch (alt149) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:245:77: LT !
            	    {
            	    LT299=(Token)match(input,LT,FOLLOW_LT_in_arguments1526); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop149;
                }
            } while (true);


            char_literal300=(Token)match(input,41,FOLLOW_41_in_arguments1530); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal300_tree = 
            (Object)adaptor.create(char_literal300)
            ;
            adaptor.addChild(root_0, char_literal300_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 51, arguments_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arguments"


    public static class indexSuffix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "indexSuffix"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:248:1: indexSuffix : '[' ( LT !)* expression ( LT !)* ']' ;
    public final JavaScriptParser.indexSuffix_return indexSuffix() throws RecognitionException {
        JavaScriptParser.indexSuffix_return retval = new JavaScriptParser.indexSuffix_return();
        retval.start = input.LT(1);

        int indexSuffix_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal301=null;
        Token LT302=null;
        Token LT304=null;
        Token char_literal305=null;
        JavaScriptParser.expression_return expression303 =null;


        Object char_literal301_tree=null;
        Object LT302_tree=null;
        Object LT304_tree=null;
        Object char_literal305_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:249:2: ( '[' ( LT !)* expression ( LT !)* ']' )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:249:4: '[' ( LT !)* expression ( LT !)* ']'
            {
            root_0 = (Object)adaptor.nil();


            char_literal301=(Token)match(input,70,FOLLOW_70_in_indexSuffix1542); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal301_tree = 
            (Object)adaptor.create(char_literal301)
            ;
            adaptor.addChild(root_0, char_literal301_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:249:10: ( LT !)*
            loop150:
            do {
                int alt150=2;
                int LA150_0 = input.LA(1);

                if ( (LA150_0==LT) ) {
                    alt150=1;
                }


                switch (alt150) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:249:10: LT !
            	    {
            	    LT302=(Token)match(input,LT,FOLLOW_LT_in_indexSuffix1544); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop150;
                }
            } while (true);


            pushFollow(FOLLOW_expression_in_indexSuffix1548);
            expression303=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression303.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:249:26: ( LT !)*
            loop151:
            do {
                int alt151=2;
                int LA151_0 = input.LA(1);

                if ( (LA151_0==LT) ) {
                    alt151=1;
                }


                switch (alt151) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:249:26: LT !
            	    {
            	    LT304=(Token)match(input,LT,FOLLOW_LT_in_indexSuffix1550); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop151;
                }
            } while (true);


            char_literal305=(Token)match(input,71,FOLLOW_71_in_indexSuffix1554); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal305_tree = 
            (Object)adaptor.create(char_literal305)
            ;
            adaptor.addChild(root_0, char_literal305_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 52, indexSuffix_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "indexSuffix"


    public static class propertyReferenceSuffix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "propertyReferenceSuffix"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:252:1: propertyReferenceSuffix : '.' ( LT !)* Identifier ;
    public final JavaScriptParser.propertyReferenceSuffix_return propertyReferenceSuffix() throws RecognitionException {
        JavaScriptParser.propertyReferenceSuffix_return retval = new JavaScriptParser.propertyReferenceSuffix_return();
        retval.start = input.LT(1);

        int propertyReferenceSuffix_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal306=null;
        Token LT307=null;
        Token Identifier308=null;

        Object char_literal306_tree=null;
        Object LT307_tree=null;
        Object Identifier308_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:253:2: ( '.' ( LT !)* Identifier )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:253:4: '.' ( LT !)* Identifier
            {
            root_0 = (Object)adaptor.nil();


            char_literal306=(Token)match(input,51,FOLLOW_51_in_propertyReferenceSuffix1567); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal306_tree = 
            (Object)adaptor.create(char_literal306)
            ;
            adaptor.addChild(root_0, char_literal306_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:253:10: ( LT !)*
            loop152:
            do {
                int alt152=2;
                int LA152_0 = input.LA(1);

                if ( (LA152_0==LT) ) {
                    alt152=1;
                }


                switch (alt152) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:253:10: LT !
            	    {
            	    LT307=(Token)match(input,LT,FOLLOW_LT_in_propertyReferenceSuffix1569); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop152;
                }
            } while (true);


            Identifier308=(Token)match(input,Identifier,FOLLOW_Identifier_in_propertyReferenceSuffix1573); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier308_tree = 
            (Object)adaptor.create(Identifier308)
            ;
            adaptor.addChild(root_0, Identifier308_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 53, propertyReferenceSuffix_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "propertyReferenceSuffix"


    public static class assignmentOperator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignmentOperator"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:256:1: assignmentOperator : ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '>>>=' | '&=' | '^=' | '|=' );
    public final JavaScriptParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
        JavaScriptParser.assignmentOperator_return retval = new JavaScriptParser.assignmentOperator_return();
        retval.start = input.LT(1);

        int assignmentOperator_StartIndex = input.index();

        Object root_0 = null;

        Token set309=null;

        Object set309_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:257:2: ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '>>>=' | '&=' | '^=' | '|=' )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:
            {
            root_0 = (Object)adaptor.nil();


            set309=(Token)input.LT(1);

            if ( input.LA(1)==36||input.LA(1)==39||input.LA(1)==43||input.LA(1)==46||input.LA(1)==50||input.LA(1)==53||input.LA(1)==58||input.LA(1)==60||input.LA(1)==66||input.LA(1)==68||input.LA(1)==73||input.LA(1)==104 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set309)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 54, assignmentOperator_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "assignmentOperator"


    public static class conditionalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionalExpression"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:260:1: conditionalExpression : logicalORExpression ( ( LT !)* '?' ( LT !)* assignmentExpression ( LT !)* ':' ( LT !)* assignmentExpression )? ;
    public final JavaScriptParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
        JavaScriptParser.conditionalExpression_return retval = new JavaScriptParser.conditionalExpression_return();
        retval.start = input.LT(1);

        int conditionalExpression_StartIndex = input.index();

        Object root_0 = null;

        Token LT311=null;
        Token char_literal312=null;
        Token LT313=null;
        Token LT315=null;
        Token char_literal316=null;
        Token LT317=null;
        JavaScriptParser.logicalORExpression_return logicalORExpression310 =null;

        JavaScriptParser.assignmentExpression_return assignmentExpression314 =null;

        JavaScriptParser.assignmentExpression_return assignmentExpression318 =null;


        Object LT311_tree=null;
        Object char_literal312_tree=null;
        Object LT313_tree=null;
        Object LT315_tree=null;
        Object char_literal316_tree=null;
        Object LT317_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:261:2: ( logicalORExpression ( ( LT !)* '?' ( LT !)* assignmentExpression ( LT !)* ':' ( LT !)* assignmentExpression )? )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:261:4: logicalORExpression ( ( LT !)* '?' ( LT !)* assignmentExpression ( LT !)* ':' ( LT !)* assignmentExpression )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logicalORExpression_in_conditionalExpression1640);
            logicalORExpression310=logicalORExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalORExpression310.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:261:24: ( ( LT !)* '?' ( LT !)* assignmentExpression ( LT !)* ':' ( LT !)* assignmentExpression )?
            int alt157=2;
            alt157 = dfa157.predict(input);
            switch (alt157) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:261:25: ( LT !)* '?' ( LT !)* assignmentExpression ( LT !)* ':' ( LT !)* assignmentExpression
                    {
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:261:27: ( LT !)*
                    loop153:
                    do {
                        int alt153=2;
                        int LA153_0 = input.LA(1);

                        if ( (LA153_0==LT) ) {
                            alt153=1;
                        }


                        switch (alt153) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:261:27: LT !
                    	    {
                    	    LT311=(Token)match(input,LT,FOLLOW_LT_in_conditionalExpression1643); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop153;
                        }
                    } while (true);


                    char_literal312=(Token)match(input,69,FOLLOW_69_in_conditionalExpression1647); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal312_tree = 
                    (Object)adaptor.create(char_literal312)
                    ;
                    adaptor.addChild(root_0, char_literal312_tree);
                    }

                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:261:36: ( LT !)*
                    loop154:
                    do {
                        int alt154=2;
                        int LA154_0 = input.LA(1);

                        if ( (LA154_0==LT) ) {
                            alt154=1;
                        }


                        switch (alt154) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:261:36: LT !
                    	    {
                    	    LT313=(Token)match(input,LT,FOLLOW_LT_in_conditionalExpression1649); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop154;
                        }
                    } while (true);


                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression1653);
                    assignmentExpression314=assignmentExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression314.getTree());

                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:261:62: ( LT !)*
                    loop155:
                    do {
                        int alt155=2;
                        int LA155_0 = input.LA(1);

                        if ( (LA155_0==LT) ) {
                            alt155=1;
                        }


                        switch (alt155) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:261:62: LT !
                    	    {
                    	    LT315=(Token)match(input,LT,FOLLOW_LT_in_conditionalExpression1655); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop155;
                        }
                    } while (true);


                    char_literal316=(Token)match(input,54,FOLLOW_54_in_conditionalExpression1659); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal316_tree = 
                    (Object)adaptor.create(char_literal316)
                    ;
                    adaptor.addChild(root_0, char_literal316_tree);
                    }

                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:261:71: ( LT !)*
                    loop156:
                    do {
                        int alt156=2;
                        int LA156_0 = input.LA(1);

                        if ( (LA156_0==LT) ) {
                            alt156=1;
                        }


                        switch (alt156) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:261:71: LT !
                    	    {
                    	    LT317=(Token)match(input,LT,FOLLOW_LT_in_conditionalExpression1661); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop156;
                        }
                    } while (true);


                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression1665);
                    assignmentExpression318=assignmentExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression318.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 55, conditionalExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "conditionalExpression"


    public static class conditionalExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionalExpressionNoIn"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:264:1: conditionalExpressionNoIn : logicalORExpressionNoIn ( ( LT !)* '?' ( LT !)* assignmentExpressionNoIn ( LT !)* ':' ( LT !)* assignmentExpressionNoIn )? ;
    public final JavaScriptParser.conditionalExpressionNoIn_return conditionalExpressionNoIn() throws RecognitionException {
        JavaScriptParser.conditionalExpressionNoIn_return retval = new JavaScriptParser.conditionalExpressionNoIn_return();
        retval.start = input.LT(1);

        int conditionalExpressionNoIn_StartIndex = input.index();

        Object root_0 = null;

        Token LT320=null;
        Token char_literal321=null;
        Token LT322=null;
        Token LT324=null;
        Token char_literal325=null;
        Token LT326=null;
        JavaScriptParser.logicalORExpressionNoIn_return logicalORExpressionNoIn319 =null;

        JavaScriptParser.assignmentExpressionNoIn_return assignmentExpressionNoIn323 =null;

        JavaScriptParser.assignmentExpressionNoIn_return assignmentExpressionNoIn327 =null;


        Object LT320_tree=null;
        Object char_literal321_tree=null;
        Object LT322_tree=null;
        Object LT324_tree=null;
        Object char_literal325_tree=null;
        Object LT326_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:265:2: ( logicalORExpressionNoIn ( ( LT !)* '?' ( LT !)* assignmentExpressionNoIn ( LT !)* ':' ( LT !)* assignmentExpressionNoIn )? )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:265:4: logicalORExpressionNoIn ( ( LT !)* '?' ( LT !)* assignmentExpressionNoIn ( LT !)* ':' ( LT !)* assignmentExpressionNoIn )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn1678);
            logicalORExpressionNoIn319=logicalORExpressionNoIn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalORExpressionNoIn319.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:265:28: ( ( LT !)* '?' ( LT !)* assignmentExpressionNoIn ( LT !)* ':' ( LT !)* assignmentExpressionNoIn )?
            int alt162=2;
            alt162 = dfa162.predict(input);
            switch (alt162) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:265:29: ( LT !)* '?' ( LT !)* assignmentExpressionNoIn ( LT !)* ':' ( LT !)* assignmentExpressionNoIn
                    {
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:265:31: ( LT !)*
                    loop158:
                    do {
                        int alt158=2;
                        int LA158_0 = input.LA(1);

                        if ( (LA158_0==LT) ) {
                            alt158=1;
                        }


                        switch (alt158) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:265:31: LT !
                    	    {
                    	    LT320=(Token)match(input,LT,FOLLOW_LT_in_conditionalExpressionNoIn1681); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop158;
                        }
                    } while (true);


                    char_literal321=(Token)match(input,69,FOLLOW_69_in_conditionalExpressionNoIn1685); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal321_tree = 
                    (Object)adaptor.create(char_literal321)
                    ;
                    adaptor.addChild(root_0, char_literal321_tree);
                    }

                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:265:40: ( LT !)*
                    loop159:
                    do {
                        int alt159=2;
                        int LA159_0 = input.LA(1);

                        if ( (LA159_0==LT) ) {
                            alt159=1;
                        }


                        switch (alt159) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:265:40: LT !
                    	    {
                    	    LT322=(Token)match(input,LT,FOLLOW_LT_in_conditionalExpressionNoIn1687); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop159;
                        }
                    } while (true);


                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn1691);
                    assignmentExpressionNoIn323=assignmentExpressionNoIn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpressionNoIn323.getTree());

                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:265:70: ( LT !)*
                    loop160:
                    do {
                        int alt160=2;
                        int LA160_0 = input.LA(1);

                        if ( (LA160_0==LT) ) {
                            alt160=1;
                        }


                        switch (alt160) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:265:70: LT !
                    	    {
                    	    LT324=(Token)match(input,LT,FOLLOW_LT_in_conditionalExpressionNoIn1693); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop160;
                        }
                    } while (true);


                    char_literal325=(Token)match(input,54,FOLLOW_54_in_conditionalExpressionNoIn1697); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal325_tree = 
                    (Object)adaptor.create(char_literal325)
                    ;
                    adaptor.addChild(root_0, char_literal325_tree);
                    }

                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:265:79: ( LT !)*
                    loop161:
                    do {
                        int alt161=2;
                        int LA161_0 = input.LA(1);

                        if ( (LA161_0==LT) ) {
                            alt161=1;
                        }


                        switch (alt161) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:265:79: LT !
                    	    {
                    	    LT326=(Token)match(input,LT,FOLLOW_LT_in_conditionalExpressionNoIn1699); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop161;
                        }
                    } while (true);


                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn1703);
                    assignmentExpressionNoIn327=assignmentExpressionNoIn();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpressionNoIn327.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 56, conditionalExpressionNoIn_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "conditionalExpressionNoIn"


    public static class logicalORExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logicalORExpression"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:268:1: logicalORExpression : logicalANDExpression ( ( LT !)* '||' ( LT !)* logicalANDExpression )* ;
    public final JavaScriptParser.logicalORExpression_return logicalORExpression() throws RecognitionException {
        JavaScriptParser.logicalORExpression_return retval = new JavaScriptParser.logicalORExpression_return();
        retval.start = input.LT(1);

        int logicalORExpression_StartIndex = input.index();

        Object root_0 = null;

        Token LT329=null;
        Token string_literal330=null;
        Token LT331=null;
        JavaScriptParser.logicalANDExpression_return logicalANDExpression328 =null;

        JavaScriptParser.logicalANDExpression_return logicalANDExpression332 =null;


        Object LT329_tree=null;
        Object string_literal330_tree=null;
        Object LT331_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:269:2: ( logicalANDExpression ( ( LT !)* '||' ( LT !)* logicalANDExpression )* )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:269:4: logicalANDExpression ( ( LT !)* '||' ( LT !)* logicalANDExpression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression1716);
            logicalANDExpression328=logicalANDExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalANDExpression328.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:269:25: ( ( LT !)* '||' ( LT !)* logicalANDExpression )*
            loop165:
            do {
                int alt165=2;
                alt165 = dfa165.predict(input);
                switch (alt165) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:269:26: ( LT !)* '||' ( LT !)* logicalANDExpression
            	    {
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:269:28: ( LT !)*
            	    loop163:
            	    do {
            	        int alt163=2;
            	        int LA163_0 = input.LA(1);

            	        if ( (LA163_0==LT) ) {
            	            alt163=1;
            	        }


            	        switch (alt163) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:269:28: LT !
            	    	    {
            	    	    LT329=(Token)match(input,LT,FOLLOW_LT_in_logicalORExpression1719); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop163;
            	        }
            	    } while (true);


            	    string_literal330=(Token)match(input,105,FOLLOW_105_in_logicalORExpression1723); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal330_tree = 
            	    (Object)adaptor.create(string_literal330)
            	    ;
            	    adaptor.addChild(root_0, string_literal330_tree);
            	    }

            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:269:38: ( LT !)*
            	    loop164:
            	    do {
            	        int alt164=2;
            	        int LA164_0 = input.LA(1);

            	        if ( (LA164_0==LT) ) {
            	            alt164=1;
            	        }


            	        switch (alt164) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:269:38: LT !
            	    	    {
            	    	    LT331=(Token)match(input,LT,FOLLOW_LT_in_logicalORExpression1725); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop164;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression1729);
            	    logicalANDExpression332=logicalANDExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalANDExpression332.getTree());

            	    }
            	    break;

            	default :
            	    break loop165;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 57, logicalORExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "logicalORExpression"


    public static class logicalORExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logicalORExpressionNoIn"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:272:1: logicalORExpressionNoIn : logicalANDExpressionNoIn ( ( LT !)* '||' ( LT !)* logicalANDExpressionNoIn )* ;
    public final JavaScriptParser.logicalORExpressionNoIn_return logicalORExpressionNoIn() throws RecognitionException {
        JavaScriptParser.logicalORExpressionNoIn_return retval = new JavaScriptParser.logicalORExpressionNoIn_return();
        retval.start = input.LT(1);

        int logicalORExpressionNoIn_StartIndex = input.index();

        Object root_0 = null;

        Token LT334=null;
        Token string_literal335=null;
        Token LT336=null;
        JavaScriptParser.logicalANDExpressionNoIn_return logicalANDExpressionNoIn333 =null;

        JavaScriptParser.logicalANDExpressionNoIn_return logicalANDExpressionNoIn337 =null;


        Object LT334_tree=null;
        Object string_literal335_tree=null;
        Object LT336_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:273:2: ( logicalANDExpressionNoIn ( ( LT !)* '||' ( LT !)* logicalANDExpressionNoIn )* )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:273:4: logicalANDExpressionNoIn ( ( LT !)* '||' ( LT !)* logicalANDExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn1743);
            logicalANDExpressionNoIn333=logicalANDExpressionNoIn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalANDExpressionNoIn333.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:273:29: ( ( LT !)* '||' ( LT !)* logicalANDExpressionNoIn )*
            loop168:
            do {
                int alt168=2;
                alt168 = dfa168.predict(input);
                switch (alt168) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:273:30: ( LT !)* '||' ( LT !)* logicalANDExpressionNoIn
            	    {
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:273:32: ( LT !)*
            	    loop166:
            	    do {
            	        int alt166=2;
            	        int LA166_0 = input.LA(1);

            	        if ( (LA166_0==LT) ) {
            	            alt166=1;
            	        }


            	        switch (alt166) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:273:32: LT !
            	    	    {
            	    	    LT334=(Token)match(input,LT,FOLLOW_LT_in_logicalORExpressionNoIn1746); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop166;
            	        }
            	    } while (true);


            	    string_literal335=(Token)match(input,105,FOLLOW_105_in_logicalORExpressionNoIn1750); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal335_tree = 
            	    (Object)adaptor.create(string_literal335)
            	    ;
            	    adaptor.addChild(root_0, string_literal335_tree);
            	    }

            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:273:42: ( LT !)*
            	    loop167:
            	    do {
            	        int alt167=2;
            	        int LA167_0 = input.LA(1);

            	        if ( (LA167_0==LT) ) {
            	            alt167=1;
            	        }


            	        switch (alt167) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:273:42: LT !
            	    	    {
            	    	    LT336=(Token)match(input,LT,FOLLOW_LT_in_logicalORExpressionNoIn1752); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop167;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn1756);
            	    logicalANDExpressionNoIn337=logicalANDExpressionNoIn();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalANDExpressionNoIn337.getTree());

            	    }
            	    break;

            	default :
            	    break loop168;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 58, logicalORExpressionNoIn_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "logicalORExpressionNoIn"


    public static class logicalANDExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logicalANDExpression"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:276:1: logicalANDExpression : bitwiseORExpression ( ( LT !)* '&&' ( LT !)* bitwiseORExpression )* ;
    public final JavaScriptParser.logicalANDExpression_return logicalANDExpression() throws RecognitionException {
        JavaScriptParser.logicalANDExpression_return retval = new JavaScriptParser.logicalANDExpression_return();
        retval.start = input.LT(1);

        int logicalANDExpression_StartIndex = input.index();

        Object root_0 = null;

        Token LT339=null;
        Token string_literal340=null;
        Token LT341=null;
        JavaScriptParser.bitwiseORExpression_return bitwiseORExpression338 =null;

        JavaScriptParser.bitwiseORExpression_return bitwiseORExpression342 =null;


        Object LT339_tree=null;
        Object string_literal340_tree=null;
        Object LT341_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:277:2: ( bitwiseORExpression ( ( LT !)* '&&' ( LT !)* bitwiseORExpression )* )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:277:4: bitwiseORExpression ( ( LT !)* '&&' ( LT !)* bitwiseORExpression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression1770);
            bitwiseORExpression338=bitwiseORExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseORExpression338.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:277:24: ( ( LT !)* '&&' ( LT !)* bitwiseORExpression )*
            loop171:
            do {
                int alt171=2;
                alt171 = dfa171.predict(input);
                switch (alt171) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:277:25: ( LT !)* '&&' ( LT !)* bitwiseORExpression
            	    {
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:277:27: ( LT !)*
            	    loop169:
            	    do {
            	        int alt169=2;
            	        int LA169_0 = input.LA(1);

            	        if ( (LA169_0==LT) ) {
            	            alt169=1;
            	        }


            	        switch (alt169) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:277:27: LT !
            	    	    {
            	    	    LT339=(Token)match(input,LT,FOLLOW_LT_in_logicalANDExpression1773); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop169;
            	        }
            	    } while (true);


            	    string_literal340=(Token)match(input,37,FOLLOW_37_in_logicalANDExpression1777); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal340_tree = 
            	    (Object)adaptor.create(string_literal340)
            	    ;
            	    adaptor.addChild(root_0, string_literal340_tree);
            	    }

            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:277:37: ( LT !)*
            	    loop170:
            	    do {
            	        int alt170=2;
            	        int LA170_0 = input.LA(1);

            	        if ( (LA170_0==LT) ) {
            	            alt170=1;
            	        }


            	        switch (alt170) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:277:37: LT !
            	    	    {
            	    	    LT341=(Token)match(input,LT,FOLLOW_LT_in_logicalANDExpression1779); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop170;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression1783);
            	    bitwiseORExpression342=bitwiseORExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseORExpression342.getTree());

            	    }
            	    break;

            	default :
            	    break loop171;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 59, logicalANDExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "logicalANDExpression"


    public static class logicalANDExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logicalANDExpressionNoIn"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:280:1: logicalANDExpressionNoIn : bitwiseORExpressionNoIn ( ( LT !)* '&&' ( LT !)* bitwiseORExpressionNoIn )* ;
    public final JavaScriptParser.logicalANDExpressionNoIn_return logicalANDExpressionNoIn() throws RecognitionException {
        JavaScriptParser.logicalANDExpressionNoIn_return retval = new JavaScriptParser.logicalANDExpressionNoIn_return();
        retval.start = input.LT(1);

        int logicalANDExpressionNoIn_StartIndex = input.index();

        Object root_0 = null;

        Token LT344=null;
        Token string_literal345=null;
        Token LT346=null;
        JavaScriptParser.bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn343 =null;

        JavaScriptParser.bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn347 =null;


        Object LT344_tree=null;
        Object string_literal345_tree=null;
        Object LT346_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:281:2: ( bitwiseORExpressionNoIn ( ( LT !)* '&&' ( LT !)* bitwiseORExpressionNoIn )* )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:281:4: bitwiseORExpressionNoIn ( ( LT !)* '&&' ( LT !)* bitwiseORExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn1797);
            bitwiseORExpressionNoIn343=bitwiseORExpressionNoIn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseORExpressionNoIn343.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:281:28: ( ( LT !)* '&&' ( LT !)* bitwiseORExpressionNoIn )*
            loop174:
            do {
                int alt174=2;
                alt174 = dfa174.predict(input);
                switch (alt174) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:281:29: ( LT !)* '&&' ( LT !)* bitwiseORExpressionNoIn
            	    {
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:281:31: ( LT !)*
            	    loop172:
            	    do {
            	        int alt172=2;
            	        int LA172_0 = input.LA(1);

            	        if ( (LA172_0==LT) ) {
            	            alt172=1;
            	        }


            	        switch (alt172) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:281:31: LT !
            	    	    {
            	    	    LT344=(Token)match(input,LT,FOLLOW_LT_in_logicalANDExpressionNoIn1800); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop172;
            	        }
            	    } while (true);


            	    string_literal345=(Token)match(input,37,FOLLOW_37_in_logicalANDExpressionNoIn1804); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal345_tree = 
            	    (Object)adaptor.create(string_literal345)
            	    ;
            	    adaptor.addChild(root_0, string_literal345_tree);
            	    }

            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:281:41: ( LT !)*
            	    loop173:
            	    do {
            	        int alt173=2;
            	        int LA173_0 = input.LA(1);

            	        if ( (LA173_0==LT) ) {
            	            alt173=1;
            	        }


            	        switch (alt173) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:281:41: LT !
            	    	    {
            	    	    LT346=(Token)match(input,LT,FOLLOW_LT_in_logicalANDExpressionNoIn1806); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop173;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn1810);
            	    bitwiseORExpressionNoIn347=bitwiseORExpressionNoIn();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseORExpressionNoIn347.getTree());

            	    }
            	    break;

            	default :
            	    break loop174;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 60, logicalANDExpressionNoIn_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "logicalANDExpressionNoIn"


    public static class bitwiseORExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bitwiseORExpression"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:284:1: bitwiseORExpression : bitwiseXORExpression ( ( LT !)* '|' ( LT !)* bitwiseXORExpression )* ;
    public final JavaScriptParser.bitwiseORExpression_return bitwiseORExpression() throws RecognitionException {
        JavaScriptParser.bitwiseORExpression_return retval = new JavaScriptParser.bitwiseORExpression_return();
        retval.start = input.LT(1);

        int bitwiseORExpression_StartIndex = input.index();

        Object root_0 = null;

        Token LT349=null;
        Token char_literal350=null;
        Token LT351=null;
        JavaScriptParser.bitwiseXORExpression_return bitwiseXORExpression348 =null;

        JavaScriptParser.bitwiseXORExpression_return bitwiseXORExpression352 =null;


        Object LT349_tree=null;
        Object char_literal350_tree=null;
        Object LT351_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:285:2: ( bitwiseXORExpression ( ( LT !)* '|' ( LT !)* bitwiseXORExpression )* )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:285:4: bitwiseXORExpression ( ( LT !)* '|' ( LT !)* bitwiseXORExpression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression1824);
            bitwiseXORExpression348=bitwiseXORExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXORExpression348.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:285:25: ( ( LT !)* '|' ( LT !)* bitwiseXORExpression )*
            loop177:
            do {
                int alt177=2;
                alt177 = dfa177.predict(input);
                switch (alt177) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:285:26: ( LT !)* '|' ( LT !)* bitwiseXORExpression
            	    {
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:285:28: ( LT !)*
            	    loop175:
            	    do {
            	        int alt175=2;
            	        int LA175_0 = input.LA(1);

            	        if ( (LA175_0==LT) ) {
            	            alt175=1;
            	        }


            	        switch (alt175) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:285:28: LT !
            	    	    {
            	    	    LT349=(Token)match(input,LT,FOLLOW_LT_in_bitwiseORExpression1827); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop175;
            	        }
            	    } while (true);


            	    char_literal350=(Token)match(input,103,FOLLOW_103_in_bitwiseORExpression1831); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal350_tree = 
            	    (Object)adaptor.create(char_literal350)
            	    ;
            	    adaptor.addChild(root_0, char_literal350_tree);
            	    }

            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:285:37: ( LT !)*
            	    loop176:
            	    do {
            	        int alt176=2;
            	        int LA176_0 = input.LA(1);

            	        if ( (LA176_0==LT) ) {
            	            alt176=1;
            	        }


            	        switch (alt176) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:285:37: LT !
            	    	    {
            	    	    LT351=(Token)match(input,LT,FOLLOW_LT_in_bitwiseORExpression1833); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop176;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression1837);
            	    bitwiseXORExpression352=bitwiseXORExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXORExpression352.getTree());

            	    }
            	    break;

            	default :
            	    break loop177;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 61, bitwiseORExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "bitwiseORExpression"


    public static class bitwiseORExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bitwiseORExpressionNoIn"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:288:1: bitwiseORExpressionNoIn : bitwiseXORExpressionNoIn ( ( LT !)* '|' ( LT !)* bitwiseXORExpressionNoIn )* ;
    public final JavaScriptParser.bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn() throws RecognitionException {
        JavaScriptParser.bitwiseORExpressionNoIn_return retval = new JavaScriptParser.bitwiseORExpressionNoIn_return();
        retval.start = input.LT(1);

        int bitwiseORExpressionNoIn_StartIndex = input.index();

        Object root_0 = null;

        Token LT354=null;
        Token char_literal355=null;
        Token LT356=null;
        JavaScriptParser.bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn353 =null;

        JavaScriptParser.bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn357 =null;


        Object LT354_tree=null;
        Object char_literal355_tree=null;
        Object LT356_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:289:2: ( bitwiseXORExpressionNoIn ( ( LT !)* '|' ( LT !)* bitwiseXORExpressionNoIn )* )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:289:4: bitwiseXORExpressionNoIn ( ( LT !)* '|' ( LT !)* bitwiseXORExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn1851);
            bitwiseXORExpressionNoIn353=bitwiseXORExpressionNoIn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXORExpressionNoIn353.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:289:29: ( ( LT !)* '|' ( LT !)* bitwiseXORExpressionNoIn )*
            loop180:
            do {
                int alt180=2;
                alt180 = dfa180.predict(input);
                switch (alt180) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:289:30: ( LT !)* '|' ( LT !)* bitwiseXORExpressionNoIn
            	    {
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:289:32: ( LT !)*
            	    loop178:
            	    do {
            	        int alt178=2;
            	        int LA178_0 = input.LA(1);

            	        if ( (LA178_0==LT) ) {
            	            alt178=1;
            	        }


            	        switch (alt178) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:289:32: LT !
            	    	    {
            	    	    LT354=(Token)match(input,LT,FOLLOW_LT_in_bitwiseORExpressionNoIn1854); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop178;
            	        }
            	    } while (true);


            	    char_literal355=(Token)match(input,103,FOLLOW_103_in_bitwiseORExpressionNoIn1858); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal355_tree = 
            	    (Object)adaptor.create(char_literal355)
            	    ;
            	    adaptor.addChild(root_0, char_literal355_tree);
            	    }

            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:289:41: ( LT !)*
            	    loop179:
            	    do {
            	        int alt179=2;
            	        int LA179_0 = input.LA(1);

            	        if ( (LA179_0==LT) ) {
            	            alt179=1;
            	        }


            	        switch (alt179) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:289:41: LT !
            	    	    {
            	    	    LT356=(Token)match(input,LT,FOLLOW_LT_in_bitwiseORExpressionNoIn1860); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop179;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn1864);
            	    bitwiseXORExpressionNoIn357=bitwiseXORExpressionNoIn();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseXORExpressionNoIn357.getTree());

            	    }
            	    break;

            	default :
            	    break loop180;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 62, bitwiseORExpressionNoIn_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "bitwiseORExpressionNoIn"


    public static class bitwiseXORExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bitwiseXORExpression"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:292:1: bitwiseXORExpression : bitwiseANDExpression ( ( LT !)* '^' ( LT !)* bitwiseANDExpression )* ;
    public final JavaScriptParser.bitwiseXORExpression_return bitwiseXORExpression() throws RecognitionException {
        JavaScriptParser.bitwiseXORExpression_return retval = new JavaScriptParser.bitwiseXORExpression_return();
        retval.start = input.LT(1);

        int bitwiseXORExpression_StartIndex = input.index();

        Object root_0 = null;

        Token LT359=null;
        Token char_literal360=null;
        Token LT361=null;
        JavaScriptParser.bitwiseANDExpression_return bitwiseANDExpression358 =null;

        JavaScriptParser.bitwiseANDExpression_return bitwiseANDExpression362 =null;


        Object LT359_tree=null;
        Object char_literal360_tree=null;
        Object LT361_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:293:2: ( bitwiseANDExpression ( ( LT !)* '^' ( LT !)* bitwiseANDExpression )* )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:293:4: bitwiseANDExpression ( ( LT !)* '^' ( LT !)* bitwiseANDExpression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression1878);
            bitwiseANDExpression358=bitwiseANDExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseANDExpression358.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:293:25: ( ( LT !)* '^' ( LT !)* bitwiseANDExpression )*
            loop183:
            do {
                int alt183=2;
                alt183 = dfa183.predict(input);
                switch (alt183) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:293:26: ( LT !)* '^' ( LT !)* bitwiseANDExpression
            	    {
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:293:28: ( LT !)*
            	    loop181:
            	    do {
            	        int alt181=2;
            	        int LA181_0 = input.LA(1);

            	        if ( (LA181_0==LT) ) {
            	            alt181=1;
            	        }


            	        switch (alt181) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:293:28: LT !
            	    	    {
            	    	    LT359=(Token)match(input,LT,FOLLOW_LT_in_bitwiseXORExpression1881); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop181;
            	        }
            	    } while (true);


            	    char_literal360=(Token)match(input,72,FOLLOW_72_in_bitwiseXORExpression1885); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal360_tree = 
            	    (Object)adaptor.create(char_literal360)
            	    ;
            	    adaptor.addChild(root_0, char_literal360_tree);
            	    }

            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:293:37: ( LT !)*
            	    loop182:
            	    do {
            	        int alt182=2;
            	        int LA182_0 = input.LA(1);

            	        if ( (LA182_0==LT) ) {
            	            alt182=1;
            	        }


            	        switch (alt182) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:293:37: LT !
            	    	    {
            	    	    LT361=(Token)match(input,LT,FOLLOW_LT_in_bitwiseXORExpression1887); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop182;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression1891);
            	    bitwiseANDExpression362=bitwiseANDExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseANDExpression362.getTree());

            	    }
            	    break;

            	default :
            	    break loop183;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 63, bitwiseXORExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "bitwiseXORExpression"


    public static class bitwiseXORExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bitwiseXORExpressionNoIn"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:296:1: bitwiseXORExpressionNoIn : bitwiseANDExpressionNoIn ( ( LT !)* '^' ( LT !)* bitwiseANDExpressionNoIn )* ;
    public final JavaScriptParser.bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn() throws RecognitionException {
        JavaScriptParser.bitwiseXORExpressionNoIn_return retval = new JavaScriptParser.bitwiseXORExpressionNoIn_return();
        retval.start = input.LT(1);

        int bitwiseXORExpressionNoIn_StartIndex = input.index();

        Object root_0 = null;

        Token LT364=null;
        Token char_literal365=null;
        Token LT366=null;
        JavaScriptParser.bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn363 =null;

        JavaScriptParser.bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn367 =null;


        Object LT364_tree=null;
        Object char_literal365_tree=null;
        Object LT366_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:297:2: ( bitwiseANDExpressionNoIn ( ( LT !)* '^' ( LT !)* bitwiseANDExpressionNoIn )* )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:297:4: bitwiseANDExpressionNoIn ( ( LT !)* '^' ( LT !)* bitwiseANDExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn1905);
            bitwiseANDExpressionNoIn363=bitwiseANDExpressionNoIn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseANDExpressionNoIn363.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:297:29: ( ( LT !)* '^' ( LT !)* bitwiseANDExpressionNoIn )*
            loop186:
            do {
                int alt186=2;
                alt186 = dfa186.predict(input);
                switch (alt186) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:297:30: ( LT !)* '^' ( LT !)* bitwiseANDExpressionNoIn
            	    {
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:297:32: ( LT !)*
            	    loop184:
            	    do {
            	        int alt184=2;
            	        int LA184_0 = input.LA(1);

            	        if ( (LA184_0==LT) ) {
            	            alt184=1;
            	        }


            	        switch (alt184) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:297:32: LT !
            	    	    {
            	    	    LT364=(Token)match(input,LT,FOLLOW_LT_in_bitwiseXORExpressionNoIn1908); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop184;
            	        }
            	    } while (true);


            	    char_literal365=(Token)match(input,72,FOLLOW_72_in_bitwiseXORExpressionNoIn1912); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal365_tree = 
            	    (Object)adaptor.create(char_literal365)
            	    ;
            	    adaptor.addChild(root_0, char_literal365_tree);
            	    }

            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:297:41: ( LT !)*
            	    loop185:
            	    do {
            	        int alt185=2;
            	        int LA185_0 = input.LA(1);

            	        if ( (LA185_0==LT) ) {
            	            alt185=1;
            	        }


            	        switch (alt185) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:297:41: LT !
            	    	    {
            	    	    LT366=(Token)match(input,LT,FOLLOW_LT_in_bitwiseXORExpressionNoIn1914); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop185;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn1918);
            	    bitwiseANDExpressionNoIn367=bitwiseANDExpressionNoIn();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseANDExpressionNoIn367.getTree());

            	    }
            	    break;

            	default :
            	    break loop186;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 64, bitwiseXORExpressionNoIn_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "bitwiseXORExpressionNoIn"


    public static class bitwiseANDExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bitwiseANDExpression"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:300:1: bitwiseANDExpression : equalityExpression ( ( LT !)* '&' ( LT !)* equalityExpression )* ;
    public final JavaScriptParser.bitwiseANDExpression_return bitwiseANDExpression() throws RecognitionException {
        JavaScriptParser.bitwiseANDExpression_return retval = new JavaScriptParser.bitwiseANDExpression_return();
        retval.start = input.LT(1);

        int bitwiseANDExpression_StartIndex = input.index();

        Object root_0 = null;

        Token LT369=null;
        Token char_literal370=null;
        Token LT371=null;
        JavaScriptParser.equalityExpression_return equalityExpression368 =null;

        JavaScriptParser.equalityExpression_return equalityExpression372 =null;


        Object LT369_tree=null;
        Object char_literal370_tree=null;
        Object LT371_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:301:2: ( equalityExpression ( ( LT !)* '&' ( LT !)* equalityExpression )* )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:301:4: equalityExpression ( ( LT !)* '&' ( LT !)* equalityExpression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression1932);
            equalityExpression368=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression368.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:301:23: ( ( LT !)* '&' ( LT !)* equalityExpression )*
            loop189:
            do {
                int alt189=2;
                alt189 = dfa189.predict(input);
                switch (alt189) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:301:24: ( LT !)* '&' ( LT !)* equalityExpression
            	    {
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:301:26: ( LT !)*
            	    loop187:
            	    do {
            	        int alt187=2;
            	        int LA187_0 = input.LA(1);

            	        if ( (LA187_0==LT) ) {
            	            alt187=1;
            	        }


            	        switch (alt187) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:301:26: LT !
            	    	    {
            	    	    LT369=(Token)match(input,LT,FOLLOW_LT_in_bitwiseANDExpression1935); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop187;
            	        }
            	    } while (true);


            	    char_literal370=(Token)match(input,38,FOLLOW_38_in_bitwiseANDExpression1939); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal370_tree = 
            	    (Object)adaptor.create(char_literal370)
            	    ;
            	    adaptor.addChild(root_0, char_literal370_tree);
            	    }

            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:301:35: ( LT !)*
            	    loop188:
            	    do {
            	        int alt188=2;
            	        int LA188_0 = input.LA(1);

            	        if ( (LA188_0==LT) ) {
            	            alt188=1;
            	        }


            	        switch (alt188) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:301:35: LT !
            	    	    {
            	    	    LT371=(Token)match(input,LT,FOLLOW_LT_in_bitwiseANDExpression1941); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop188;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression1945);
            	    equalityExpression372=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression372.getTree());

            	    }
            	    break;

            	default :
            	    break loop189;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 65, bitwiseANDExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "bitwiseANDExpression"


    public static class bitwiseANDExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bitwiseANDExpressionNoIn"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:304:1: bitwiseANDExpressionNoIn : equalityExpressionNoIn ( ( LT !)* '&' ( LT !)* equalityExpressionNoIn )* ;
    public final JavaScriptParser.bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn() throws RecognitionException {
        JavaScriptParser.bitwiseANDExpressionNoIn_return retval = new JavaScriptParser.bitwiseANDExpressionNoIn_return();
        retval.start = input.LT(1);

        int bitwiseANDExpressionNoIn_StartIndex = input.index();

        Object root_0 = null;

        Token LT374=null;
        Token char_literal375=null;
        Token LT376=null;
        JavaScriptParser.equalityExpressionNoIn_return equalityExpressionNoIn373 =null;

        JavaScriptParser.equalityExpressionNoIn_return equalityExpressionNoIn377 =null;


        Object LT374_tree=null;
        Object char_literal375_tree=null;
        Object LT376_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:305:2: ( equalityExpressionNoIn ( ( LT !)* '&' ( LT !)* equalityExpressionNoIn )* )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:305:4: equalityExpressionNoIn ( ( LT !)* '&' ( LT !)* equalityExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn1959);
            equalityExpressionNoIn373=equalityExpressionNoIn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpressionNoIn373.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:305:27: ( ( LT !)* '&' ( LT !)* equalityExpressionNoIn )*
            loop192:
            do {
                int alt192=2;
                alt192 = dfa192.predict(input);
                switch (alt192) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:305:28: ( LT !)* '&' ( LT !)* equalityExpressionNoIn
            	    {
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:305:30: ( LT !)*
            	    loop190:
            	    do {
            	        int alt190=2;
            	        int LA190_0 = input.LA(1);

            	        if ( (LA190_0==LT) ) {
            	            alt190=1;
            	        }


            	        switch (alt190) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:305:30: LT !
            	    	    {
            	    	    LT374=(Token)match(input,LT,FOLLOW_LT_in_bitwiseANDExpressionNoIn1962); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop190;
            	        }
            	    } while (true);


            	    char_literal375=(Token)match(input,38,FOLLOW_38_in_bitwiseANDExpressionNoIn1966); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal375_tree = 
            	    (Object)adaptor.create(char_literal375)
            	    ;
            	    adaptor.addChild(root_0, char_literal375_tree);
            	    }

            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:305:39: ( LT !)*
            	    loop191:
            	    do {
            	        int alt191=2;
            	        int LA191_0 = input.LA(1);

            	        if ( (LA191_0==LT) ) {
            	            alt191=1;
            	        }


            	        switch (alt191) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:305:39: LT !
            	    	    {
            	    	    LT376=(Token)match(input,LT,FOLLOW_LT_in_bitwiseANDExpressionNoIn1968); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop191;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn1972);
            	    equalityExpressionNoIn377=equalityExpressionNoIn();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpressionNoIn377.getTree());

            	    }
            	    break;

            	default :
            	    break loop192;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 66, bitwiseANDExpressionNoIn_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "bitwiseANDExpressionNoIn"


    public static class equalityExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equalityExpression"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:308:1: equalityExpression : relationalExpression ( ( LT !)* ( '==' | '!=' | '===' | '!==' ) ( LT !)* relationalExpression )* ;
    public final JavaScriptParser.equalityExpression_return equalityExpression() throws RecognitionException {
        JavaScriptParser.equalityExpression_return retval = new JavaScriptParser.equalityExpression_return();
        retval.start = input.LT(1);

        int equalityExpression_StartIndex = input.index();

        Object root_0 = null;

        Token LT379=null;
        Token set380=null;
        Token LT381=null;
        JavaScriptParser.relationalExpression_return relationalExpression378 =null;

        JavaScriptParser.relationalExpression_return relationalExpression382 =null;


        Object LT379_tree=null;
        Object set380_tree=null;
        Object LT381_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:309:2: ( relationalExpression ( ( LT !)* ( '==' | '!=' | '===' | '!==' ) ( LT !)* relationalExpression )* )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:309:4: relationalExpression ( ( LT !)* ( '==' | '!=' | '===' | '!==' ) ( LT !)* relationalExpression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1986);
            relationalExpression378=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression378.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:309:25: ( ( LT !)* ( '==' | '!=' | '===' | '!==' ) ( LT !)* relationalExpression )*
            loop195:
            do {
                int alt195=2;
                alt195 = dfa195.predict(input);
                switch (alt195) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:309:26: ( LT !)* ( '==' | '!=' | '===' | '!==' ) ( LT !)* relationalExpression
            	    {
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:309:28: ( LT !)*
            	    loop193:
            	    do {
            	        int alt193=2;
            	        int LA193_0 = input.LA(1);

            	        if ( (LA193_0==LT) ) {
            	            alt193=1;
            	        }


            	        switch (alt193) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:309:28: LT !
            	    	    {
            	    	    LT379=(Token)match(input,LT,FOLLOW_LT_in_equalityExpression1989); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop193;
            	        }
            	    } while (true);


            	    set380=(Token)input.LT(1);

            	    if ( (input.LA(1) >= 33 && input.LA(1) <= 34)||(input.LA(1) >= 61 && input.LA(1) <= 62) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set380)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:309:63: ( LT !)*
            	    loop194:
            	    do {
            	        int alt194=2;
            	        int LA194_0 = input.LA(1);

            	        if ( (LA194_0==LT) ) {
            	            alt194=1;
            	        }


            	        switch (alt194) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:309:63: LT !
            	    	    {
            	    	    LT381=(Token)match(input,LT,FOLLOW_LT_in_equalityExpression2009); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop194;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression2013);
            	    relationalExpression382=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression382.getTree());

            	    }
            	    break;

            	default :
            	    break loop195;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 67, equalityExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "equalityExpression"


    public static class equalityExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equalityExpressionNoIn"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:312:1: equalityExpressionNoIn : relationalExpressionNoIn ( ( LT !)* ( '==' | '!=' | '===' | '!==' ) ( LT !)* relationalExpressionNoIn )* ;
    public final JavaScriptParser.equalityExpressionNoIn_return equalityExpressionNoIn() throws RecognitionException {
        JavaScriptParser.equalityExpressionNoIn_return retval = new JavaScriptParser.equalityExpressionNoIn_return();
        retval.start = input.LT(1);

        int equalityExpressionNoIn_StartIndex = input.index();

        Object root_0 = null;

        Token LT384=null;
        Token set385=null;
        Token LT386=null;
        JavaScriptParser.relationalExpressionNoIn_return relationalExpressionNoIn383 =null;

        JavaScriptParser.relationalExpressionNoIn_return relationalExpressionNoIn387 =null;


        Object LT384_tree=null;
        Object set385_tree=null;
        Object LT386_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:313:2: ( relationalExpressionNoIn ( ( LT !)* ( '==' | '!=' | '===' | '!==' ) ( LT !)* relationalExpressionNoIn )* )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:313:4: relationalExpressionNoIn ( ( LT !)* ( '==' | '!=' | '===' | '!==' ) ( LT !)* relationalExpressionNoIn )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn2026);
            relationalExpressionNoIn383=relationalExpressionNoIn();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpressionNoIn383.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:313:29: ( ( LT !)* ( '==' | '!=' | '===' | '!==' ) ( LT !)* relationalExpressionNoIn )*
            loop198:
            do {
                int alt198=2;
                alt198 = dfa198.predict(input);
                switch (alt198) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:313:30: ( LT !)* ( '==' | '!=' | '===' | '!==' ) ( LT !)* relationalExpressionNoIn
            	    {
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:313:32: ( LT !)*
            	    loop196:
            	    do {
            	        int alt196=2;
            	        int LA196_0 = input.LA(1);

            	        if ( (LA196_0==LT) ) {
            	            alt196=1;
            	        }


            	        switch (alt196) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:313:32: LT !
            	    	    {
            	    	    LT384=(Token)match(input,LT,FOLLOW_LT_in_equalityExpressionNoIn2029); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop196;
            	        }
            	    } while (true);


            	    set385=(Token)input.LT(1);

            	    if ( (input.LA(1) >= 33 && input.LA(1) <= 34)||(input.LA(1) >= 61 && input.LA(1) <= 62) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set385)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:313:67: ( LT !)*
            	    loop197:
            	    do {
            	        int alt197=2;
            	        int LA197_0 = input.LA(1);

            	        if ( (LA197_0==LT) ) {
            	            alt197=1;
            	        }


            	        switch (alt197) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:313:67: LT !
            	    	    {
            	    	    LT386=(Token)match(input,LT,FOLLOW_LT_in_equalityExpressionNoIn2049); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop197;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn2053);
            	    relationalExpressionNoIn387=relationalExpressionNoIn();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpressionNoIn387.getTree());

            	    }
            	    break;

            	default :
            	    break loop198;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 68, equalityExpressionNoIn_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "equalityExpressionNoIn"


    public static class relationalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relationalExpression"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:316:1: relationalExpression : shiftExpression ( ( LT !)* ( '<' | '>' | '<=' | '>=' | 'instanceof' | 'in' ) ( LT !)* shiftExpression )* ;
    public final JavaScriptParser.relationalExpression_return relationalExpression() throws RecognitionException {
        JavaScriptParser.relationalExpression_return retval = new JavaScriptParser.relationalExpression_return();
        retval.start = input.LT(1);

        int relationalExpression_StartIndex = input.index();

        Object root_0 = null;

        Token LT389=null;
        Token set390=null;
        Token LT391=null;
        JavaScriptParser.shiftExpression_return shiftExpression388 =null;

        JavaScriptParser.shiftExpression_return shiftExpression392 =null;


        Object LT389_tree=null;
        Object set390_tree=null;
        Object LT391_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:317:2: ( shiftExpression ( ( LT !)* ( '<' | '>' | '<=' | '>=' | 'instanceof' | 'in' ) ( LT !)* shiftExpression )* )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:317:4: shiftExpression ( ( LT !)* ( '<' | '>' | '<=' | '>=' | 'instanceof' | 'in' ) ( LT !)* shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_shiftExpression_in_relationalExpression2067);
            shiftExpression388=shiftExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpression388.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:317:20: ( ( LT !)* ( '<' | '>' | '<=' | '>=' | 'instanceof' | 'in' ) ( LT !)* shiftExpression )*
            loop201:
            do {
                int alt201=2;
                alt201 = dfa201.predict(input);
                switch (alt201) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:317:21: ( LT !)* ( '<' | '>' | '<=' | '>=' | 'instanceof' | 'in' ) ( LT !)* shiftExpression
            	    {
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:317:23: ( LT !)*
            	    loop199:
            	    do {
            	        int alt199=2;
            	        int LA199_0 = input.LA(1);

            	        if ( (LA199_0==LT) ) {
            	            alt199=1;
            	        }


            	        switch (alt199) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:317:23: LT !
            	    	    {
            	    	    LT389=(Token)match(input,LT,FOLLOW_LT_in_relationalExpression2070); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop199;
            	        }
            	    } while (true);


            	    set390=(Token)input.LT(1);

            	    if ( input.LA(1)==56||input.LA(1)==59||(input.LA(1) >= 63 && input.LA(1) <= 64)||(input.LA(1) >= 87 && input.LA(1) <= 88) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set390)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:317:76: ( LT !)*
            	    loop200:
            	    do {
            	        int alt200=2;
            	        int LA200_0 = input.LA(1);

            	        if ( (LA200_0==LT) ) {
            	            alt200=1;
            	        }


            	        switch (alt200) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:317:76: LT !
            	    	    {
            	    	    LT391=(Token)match(input,LT,FOLLOW_LT_in_relationalExpression2098); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop200;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpression2102);
            	    shiftExpression392=shiftExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpression392.getTree());

            	    }
            	    break;

            	default :
            	    break loop201;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 69, relationalExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "relationalExpression"


    public static class relationalExpressionNoIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relationalExpressionNoIn"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:320:1: relationalExpressionNoIn : shiftExpression ( ( LT !)* ( '<' | '>' | '<=' | '>=' | 'instanceof' ) ( LT !)* shiftExpression )* ;
    public final JavaScriptParser.relationalExpressionNoIn_return relationalExpressionNoIn() throws RecognitionException {
        JavaScriptParser.relationalExpressionNoIn_return retval = new JavaScriptParser.relationalExpressionNoIn_return();
        retval.start = input.LT(1);

        int relationalExpressionNoIn_StartIndex = input.index();

        Object root_0 = null;

        Token LT394=null;
        Token set395=null;
        Token LT396=null;
        JavaScriptParser.shiftExpression_return shiftExpression393 =null;

        JavaScriptParser.shiftExpression_return shiftExpression397 =null;


        Object LT394_tree=null;
        Object set395_tree=null;
        Object LT396_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:321:2: ( shiftExpression ( ( LT !)* ( '<' | '>' | '<=' | '>=' | 'instanceof' ) ( LT !)* shiftExpression )* )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:321:4: shiftExpression ( ( LT !)* ( '<' | '>' | '<=' | '>=' | 'instanceof' ) ( LT !)* shiftExpression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn2115);
            shiftExpression393=shiftExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpression393.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:321:20: ( ( LT !)* ( '<' | '>' | '<=' | '>=' | 'instanceof' ) ( LT !)* shiftExpression )*
            loop204:
            do {
                int alt204=2;
                alt204 = dfa204.predict(input);
                switch (alt204) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:321:21: ( LT !)* ( '<' | '>' | '<=' | '>=' | 'instanceof' ) ( LT !)* shiftExpression
            	    {
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:321:23: ( LT !)*
            	    loop202:
            	    do {
            	        int alt202=2;
            	        int LA202_0 = input.LA(1);

            	        if ( (LA202_0==LT) ) {
            	            alt202=1;
            	        }


            	        switch (alt202) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:321:23: LT !
            	    	    {
            	    	    LT394=(Token)match(input,LT,FOLLOW_LT_in_relationalExpressionNoIn2118); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop202;
            	        }
            	    } while (true);


            	    set395=(Token)input.LT(1);

            	    if ( input.LA(1)==56||input.LA(1)==59||(input.LA(1) >= 63 && input.LA(1) <= 64)||input.LA(1)==88 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set395)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:321:69: ( LT !)*
            	    loop203:
            	    do {
            	        int alt203=2;
            	        int LA203_0 = input.LA(1);

            	        if ( (LA203_0==LT) ) {
            	            alt203=1;
            	        }


            	        switch (alt203) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:321:69: LT !
            	    	    {
            	    	    LT396=(Token)match(input,LT,FOLLOW_LT_in_relationalExpressionNoIn2142); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop203;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn2146);
            	    shiftExpression397=shiftExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpression397.getTree());

            	    }
            	    break;

            	default :
            	    break loop204;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 70, relationalExpressionNoIn_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "relationalExpressionNoIn"


    public static class shiftExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "shiftExpression"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:324:1: shiftExpression : additiveExpression ( ( LT !)* ( '<<' | '>>' | '>>>' ) ( LT !)* additiveExpression )* ;
    public final JavaScriptParser.shiftExpression_return shiftExpression() throws RecognitionException {
        JavaScriptParser.shiftExpression_return retval = new JavaScriptParser.shiftExpression_return();
        retval.start = input.LT(1);

        int shiftExpression_StartIndex = input.index();

        Object root_0 = null;

        Token LT399=null;
        Token set400=null;
        Token LT401=null;
        JavaScriptParser.additiveExpression_return additiveExpression398 =null;

        JavaScriptParser.additiveExpression_return additiveExpression402 =null;


        Object LT399_tree=null;
        Object set400_tree=null;
        Object LT401_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:325:2: ( additiveExpression ( ( LT !)* ( '<<' | '>>' | '>>>' ) ( LT !)* additiveExpression )* )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:325:4: additiveExpression ( ( LT !)* ( '<<' | '>>' | '>>>' ) ( LT !)* additiveExpression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_additiveExpression_in_shiftExpression2159);
            additiveExpression398=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression398.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:325:23: ( ( LT !)* ( '<<' | '>>' | '>>>' ) ( LT !)* additiveExpression )*
            loop207:
            do {
                int alt207=2;
                alt207 = dfa207.predict(input);
                switch (alt207) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:325:24: ( LT !)* ( '<<' | '>>' | '>>>' ) ( LT !)* additiveExpression
            	    {
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:325:26: ( LT !)*
            	    loop205:
            	    do {
            	        int alt205=2;
            	        int LA205_0 = input.LA(1);

            	        if ( (LA205_0==LT) ) {
            	            alt205=1;
            	        }


            	        switch (alt205) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:325:26: LT !
            	    	    {
            	    	    LT399=(Token)match(input,LT,FOLLOW_LT_in_shiftExpression2162); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop205;
            	        }
            	    } while (true);


            	    set400=(Token)input.LT(1);

            	    if ( input.LA(1)==57||input.LA(1)==65||input.LA(1)==67 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set400)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:325:53: ( LT !)*
            	    loop206:
            	    do {
            	        int alt206=2;
            	        int LA206_0 = input.LA(1);

            	        if ( (LA206_0==LT) ) {
            	            alt206=1;
            	        }


            	        switch (alt206) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:325:53: LT !
            	    	    {
            	    	    LT401=(Token)match(input,LT,FOLLOW_LT_in_shiftExpression2178); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop206;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression2182);
            	    additiveExpression402=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression402.getTree());

            	    }
            	    break;

            	default :
            	    break loop207;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 71, shiftExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "shiftExpression"


    public static class additiveExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "additiveExpression"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:328:1: additiveExpression : multiplicativeExpression ( ( LT !)* ( '+' | '-' ) ( LT !)* multiplicativeExpression )* ;
    public final JavaScriptParser.additiveExpression_return additiveExpression() throws RecognitionException {
        JavaScriptParser.additiveExpression_return retval = new JavaScriptParser.additiveExpression_return();
        retval.start = input.LT(1);

        int additiveExpression_StartIndex = input.index();

        Object root_0 = null;

        Token LT404=null;
        Token set405=null;
        Token LT406=null;
        JavaScriptParser.multiplicativeExpression_return multiplicativeExpression403 =null;

        JavaScriptParser.multiplicativeExpression_return multiplicativeExpression407 =null;


        Object LT404_tree=null;
        Object set405_tree=null;
        Object LT406_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:329:2: ( multiplicativeExpression ( ( LT !)* ( '+' | '-' ) ( LT !)* multiplicativeExpression )* )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:329:4: multiplicativeExpression ( ( LT !)* ( '+' | '-' ) ( LT !)* multiplicativeExpression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2195);
            multiplicativeExpression403=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression403.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:329:29: ( ( LT !)* ( '+' | '-' ) ( LT !)* multiplicativeExpression )*
            loop210:
            do {
                int alt210=2;
                int LA210_0 = input.LA(1);

                if ( (LA210_0==LT) ) {
                    int LA210_1 = input.LA(2);

                    if ( (synpred256_JavaScript()) ) {
                        alt210=1;
                    }


                }
                else if ( (LA210_0==44||LA210_0==48) ) {
                    alt210=1;
                }


                switch (alt210) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:329:30: ( LT !)* ( '+' | '-' ) ( LT !)* multiplicativeExpression
            	    {
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:329:32: ( LT !)*
            	    loop208:
            	    do {
            	        int alt208=2;
            	        int LA208_0 = input.LA(1);

            	        if ( (LA208_0==LT) ) {
            	            alt208=1;
            	        }


            	        switch (alt208) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:329:32: LT !
            	    	    {
            	    	    LT404=(Token)match(input,LT,FOLLOW_LT_in_additiveExpression2198); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop208;
            	        }
            	    } while (true);


            	    set405=(Token)input.LT(1);

            	    if ( input.LA(1)==44||input.LA(1)==48 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set405)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:329:49: ( LT !)*
            	    loop209:
            	    do {
            	        int alt209=2;
            	        int LA209_0 = input.LA(1);

            	        if ( (LA209_0==LT) ) {
            	            alt209=1;
            	        }


            	        switch (alt209) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:329:49: LT !
            	    	    {
            	    	    LT406=(Token)match(input,LT,FOLLOW_LT_in_additiveExpression2210); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop209;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2214);
            	    multiplicativeExpression407=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression407.getTree());

            	    }
            	    break;

            	default :
            	    break loop210;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 72, additiveExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "additiveExpression"


    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multiplicativeExpression"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:332:1: multiplicativeExpression : unaryExpression ( ( LT !)* ( '*' | '/' | '%' ) ( LT !)* unaryExpression )* ;
    public final JavaScriptParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        JavaScriptParser.multiplicativeExpression_return retval = new JavaScriptParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        int multiplicativeExpression_StartIndex = input.index();

        Object root_0 = null;

        Token LT409=null;
        Token set410=null;
        Token LT411=null;
        JavaScriptParser.unaryExpression_return unaryExpression408 =null;

        JavaScriptParser.unaryExpression_return unaryExpression412 =null;


        Object LT409_tree=null;
        Object set410_tree=null;
        Object LT411_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:333:2: ( unaryExpression ( ( LT !)* ( '*' | '/' | '%' ) ( LT !)* unaryExpression )* )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:333:4: unaryExpression ( ( LT !)* ( '*' | '/' | '%' ) ( LT !)* unaryExpression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2227);
            unaryExpression408=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression408.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:333:20: ( ( LT !)* ( '*' | '/' | '%' ) ( LT !)* unaryExpression )*
            loop213:
            do {
                int alt213=2;
                alt213 = dfa213.predict(input);
                switch (alt213) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:333:21: ( LT !)* ( '*' | '/' | '%' ) ( LT !)* unaryExpression
            	    {
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:333:23: ( LT !)*
            	    loop211:
            	    do {
            	        int alt211=2;
            	        int LA211_0 = input.LA(1);

            	        if ( (LA211_0==LT) ) {
            	            alt211=1;
            	        }


            	        switch (alt211) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:333:23: LT !
            	    	    {
            	    	    LT409=(Token)match(input,LT,FOLLOW_LT_in_multiplicativeExpression2230); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop211;
            	        }
            	    } while (true);


            	    set410=(Token)input.LT(1);

            	    if ( input.LA(1)==35||input.LA(1)==42||input.LA(1)==52 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set410)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:333:46: ( LT !)*
            	    loop212:
            	    do {
            	        int alt212=2;
            	        int LA212_0 = input.LA(1);

            	        if ( (LA212_0==LT) ) {
            	            alt212=1;
            	        }


            	        switch (alt212) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:333:46: LT !
            	    	    {
            	    	    LT411=(Token)match(input,LT,FOLLOW_LT_in_multiplicativeExpression2246); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop212;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2250);
            	    unaryExpression412=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression412.getTree());

            	    }
            	    break;

            	default :
            	    break loop213;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 73, multiplicativeExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpression"


    public static class unaryExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unaryExpression"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:336:1: unaryExpression : ( postfixExpression | ( 'delete' | 'void' | 'typeof' | '++' | '--' | '+' | '-' | '~' | '!' ) unaryExpression );
    public final JavaScriptParser.unaryExpression_return unaryExpression() throws RecognitionException {
        JavaScriptParser.unaryExpression_return retval = new JavaScriptParser.unaryExpression_return();
        retval.start = input.LT(1);

        int unaryExpression_StartIndex = input.index();

        Object root_0 = null;

        Token set414=null;
        JavaScriptParser.postfixExpression_return postfixExpression413 =null;

        JavaScriptParser.unaryExpression_return unaryExpression415 =null;


        Object set414_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:337:2: ( postfixExpression | ( 'delete' | 'void' | 'typeof' | '++' | '--' | '+' | '-' | '~' | '!' ) unaryExpression )
            int alt214=2;
            int LA214_0 = input.LA(1);

            if ( (LA214_0==Identifier||(LA214_0 >= NumericLiteral && LA214_0 <= RegexpLiteral)||LA214_0==StringLiteral||LA214_0==40||LA214_0==70||LA214_0==82||LA214_0==85||(LA214_0 >= 89 && LA214_0 <= 90)||LA214_0==93||LA214_0==95||LA214_0==102) ) {
                alt214=1;
            }
            else if ( (LA214_0==32||(LA214_0 >= 44 && LA214_0 <= 45)||(LA214_0 >= 48 && LA214_0 <= 49)||LA214_0==79||LA214_0==97||LA214_0==99||LA214_0==107) ) {
                alt214=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 214, 0, input);

                throw nvae;

            }
            switch (alt214) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:337:4: postfixExpression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression2263);
                    postfixExpression413=postfixExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfixExpression413.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:338:4: ( 'delete' | 'void' | 'typeof' | '++' | '--' | '+' | '-' | '~' | '!' ) unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();


                    set414=(Token)input.LT(1);

                    if ( input.LA(1)==32||(input.LA(1) >= 44 && input.LA(1) <= 45)||(input.LA(1) >= 48 && input.LA(1) <= 49)||input.LA(1)==79||input.LA(1)==97||input.LA(1)==99||input.LA(1)==107 ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set414)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression2304);
                    unaryExpression415=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression415.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 74, unaryExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "unaryExpression"


    public static class postfixExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "postfixExpression"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:341:1: postfixExpression : leftHandSideExpression ( '++' | '--' )? ;
    public final JavaScriptParser.postfixExpression_return postfixExpression() throws RecognitionException {
        JavaScriptParser.postfixExpression_return retval = new JavaScriptParser.postfixExpression_return();
        retval.start = input.LT(1);

        int postfixExpression_StartIndex = input.index();

        Object root_0 = null;

        Token set417=null;
        JavaScriptParser.leftHandSideExpression_return leftHandSideExpression416 =null;


        Object set417_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:342:2: ( leftHandSideExpression ( '++' | '--' )? )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:342:4: leftHandSideExpression ( '++' | '--' )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_leftHandSideExpression_in_postfixExpression2316);
            leftHandSideExpression416=leftHandSideExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, leftHandSideExpression416.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:342:27: ( '++' | '--' )?
            int alt215=2;
            int LA215_0 = input.LA(1);

            if ( (LA215_0==45||LA215_0==49) ) {
                alt215=1;
            }
            switch (alt215) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:
                    {
                    set417=(Token)input.LT(1);

                    if ( input.LA(1)==45||input.LA(1)==49 ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set417)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 75, postfixExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "postfixExpression"


    public static class primaryExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primaryExpression"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:345:1: primaryExpression : ( 'this' | Identifier | literal | arrayLiteral | objectLiteral | '(' ( LT !)* expression ( LT !)* ')' );
    public final JavaScriptParser.primaryExpression_return primaryExpression() throws RecognitionException {
        JavaScriptParser.primaryExpression_return retval = new JavaScriptParser.primaryExpression_return();
        retval.start = input.LT(1);

        int primaryExpression_StartIndex = input.index();

        Object root_0 = null;

        Token string_literal418=null;
        Token Identifier419=null;
        Token char_literal423=null;
        Token LT424=null;
        Token LT426=null;
        Token char_literal427=null;
        JavaScriptParser.literal_return literal420 =null;

        JavaScriptParser.arrayLiteral_return arrayLiteral421 =null;

        JavaScriptParser.objectLiteral_return objectLiteral422 =null;

        JavaScriptParser.expression_return expression425 =null;


        Object string_literal418_tree=null;
        Object Identifier419_tree=null;
        Object char_literal423_tree=null;
        Object LT424_tree=null;
        Object LT426_tree=null;
        Object char_literal427_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:346:2: ( 'this' | Identifier | literal | arrayLiteral | objectLiteral | '(' ( LT !)* expression ( LT !)* ')' )
            int alt218=6;
            switch ( input.LA(1) ) {
            case 93:
                {
                alt218=1;
                }
                break;
            case Identifier:
                {
                alt218=2;
                }
                break;
            case NumericLiteral:
            case RegexpLiteral:
            case StringLiteral:
            case 82:
            case 90:
            case 95:
                {
                alt218=3;
                }
                break;
            case 70:
                {
                alt218=4;
                }
                break;
            case 102:
                {
                alt218=5;
                }
                break;
            case 40:
                {
                alt218=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 218, 0, input);

                throw nvae;

            }

            switch (alt218) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:346:4: 'this'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal418=(Token)match(input,93,FOLLOW_93_in_primaryExpression2336); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal418_tree = 
                    (Object)adaptor.create(string_literal418)
                    ;
                    adaptor.addChild(root_0, string_literal418_tree);
                    }

                    }
                    break;
                case 2 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:347:4: Identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    Identifier419=(Token)match(input,Identifier,FOLLOW_Identifier_in_primaryExpression2341); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier419_tree = 
                    (Object)adaptor.create(Identifier419)
                    ;
                    adaptor.addChild(root_0, Identifier419_tree);
                    }

                    }
                    break;
                case 3 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:348:4: literal
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_literal_in_primaryExpression2346);
                    literal420=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal420.getTree());

                    }
                    break;
                case 4 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:349:4: arrayLiteral
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_arrayLiteral_in_primaryExpression2351);
                    arrayLiteral421=arrayLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayLiteral421.getTree());

                    }
                    break;
                case 5 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:350:4: objectLiteral
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_objectLiteral_in_primaryExpression2356);
                    objectLiteral422=objectLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objectLiteral422.getTree());

                    }
                    break;
                case 6 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:351:4: '(' ( LT !)* expression ( LT !)* ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal423=(Token)match(input,40,FOLLOW_40_in_primaryExpression2361); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal423_tree = 
                    (Object)adaptor.create(char_literal423)
                    ;
                    adaptor.addChild(root_0, char_literal423_tree);
                    }

                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:351:10: ( LT !)*
                    loop216:
                    do {
                        int alt216=2;
                        int LA216_0 = input.LA(1);

                        if ( (LA216_0==LT) ) {
                            alt216=1;
                        }


                        switch (alt216) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:351:10: LT !
                    	    {
                    	    LT424=(Token)match(input,LT,FOLLOW_LT_in_primaryExpression2363); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop216;
                        }
                    } while (true);


                    pushFollow(FOLLOW_expression_in_primaryExpression2367);
                    expression425=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression425.getTree());

                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:351:26: ( LT !)*
                    loop217:
                    do {
                        int alt217=2;
                        int LA217_0 = input.LA(1);

                        if ( (LA217_0==LT) ) {
                            alt217=1;
                        }


                        switch (alt217) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:351:26: LT !
                    	    {
                    	    LT426=(Token)match(input,LT,FOLLOW_LT_in_primaryExpression2369); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop217;
                        }
                    } while (true);


                    char_literal427=(Token)match(input,41,FOLLOW_41_in_primaryExpression2373); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal427_tree = 
                    (Object)adaptor.create(char_literal427)
                    ;
                    adaptor.addChild(root_0, char_literal427_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 76, primaryExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "primaryExpression"


    public static class arrayLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayLiteral"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:355:1: arrayLiteral : '[' ( LT !)* ( assignmentExpression )? ( ( LT !)* ',' ( ( LT !)* assignmentExpression )? )* ( LT !)* ']' ;
    public final JavaScriptParser.arrayLiteral_return arrayLiteral() throws RecognitionException {
        JavaScriptParser.arrayLiteral_return retval = new JavaScriptParser.arrayLiteral_return();
        retval.start = input.LT(1);

        int arrayLiteral_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal428=null;
        Token LT429=null;
        Token LT431=null;
        Token char_literal432=null;
        Token LT433=null;
        Token LT435=null;
        Token char_literal436=null;
        JavaScriptParser.assignmentExpression_return assignmentExpression430 =null;

        JavaScriptParser.assignmentExpression_return assignmentExpression434 =null;


        Object char_literal428_tree=null;
        Object LT429_tree=null;
        Object LT431_tree=null;
        Object char_literal432_tree=null;
        Object LT433_tree=null;
        Object LT435_tree=null;
        Object char_literal436_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:356:2: ( '[' ( LT !)* ( assignmentExpression )? ( ( LT !)* ',' ( ( LT !)* assignmentExpression )? )* ( LT !)* ']' )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:356:4: '[' ( LT !)* ( assignmentExpression )? ( ( LT !)* ',' ( ( LT !)* assignmentExpression )? )* ( LT !)* ']'
            {
            root_0 = (Object)adaptor.nil();


            char_literal428=(Token)match(input,70,FOLLOW_70_in_arrayLiteral2386); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal428_tree = 
            (Object)adaptor.create(char_literal428)
            ;
            adaptor.addChild(root_0, char_literal428_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:356:10: ( LT !)*
            loop219:
            do {
                int alt219=2;
                int LA219_0 = input.LA(1);

                if ( (LA219_0==LT) ) {
                    int LA219_2 = input.LA(2);

                    if ( (synpred280_JavaScript()) ) {
                        alt219=1;
                    }


                }


                switch (alt219) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:356:10: LT !
            	    {
            	    LT429=(Token)match(input,LT,FOLLOW_LT_in_arrayLiteral2388); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop219;
                }
            } while (true);


            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:356:13: ( assignmentExpression )?
            int alt220=2;
            int LA220_0 = input.LA(1);

            if ( (LA220_0==Identifier||(LA220_0 >= NumericLiteral && LA220_0 <= RegexpLiteral)||LA220_0==StringLiteral||LA220_0==32||LA220_0==40||(LA220_0 >= 44 && LA220_0 <= 45)||(LA220_0 >= 48 && LA220_0 <= 49)||LA220_0==70||LA220_0==79||LA220_0==82||LA220_0==85||(LA220_0 >= 89 && LA220_0 <= 90)||LA220_0==93||LA220_0==95||LA220_0==97||LA220_0==99||LA220_0==102||LA220_0==107) ) {
                alt220=1;
            }
            switch (alt220) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:356:13: assignmentExpression
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_arrayLiteral2392);
                    assignmentExpression430=assignmentExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression430.getTree());

                    }
                    break;

            }


            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:356:35: ( ( LT !)* ',' ( ( LT !)* assignmentExpression )? )*
            loop224:
            do {
                int alt224=2;
                alt224 = dfa224.predict(input);
                switch (alt224) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:356:36: ( LT !)* ',' ( ( LT !)* assignmentExpression )?
            	    {
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:356:38: ( LT !)*
            	    loop221:
            	    do {
            	        int alt221=2;
            	        int LA221_0 = input.LA(1);

            	        if ( (LA221_0==LT) ) {
            	            alt221=1;
            	        }


            	        switch (alt221) {
            	    	case 1 :
            	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:356:38: LT !
            	    	    {
            	    	    LT431=(Token)match(input,LT,FOLLOW_LT_in_arrayLiteral2396); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop221;
            	        }
            	    } while (true);


            	    char_literal432=(Token)match(input,47,FOLLOW_47_in_arrayLiteral2400); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal432_tree = 
            	    (Object)adaptor.create(char_literal432)
            	    ;
            	    adaptor.addChild(root_0, char_literal432_tree);
            	    }

            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:356:45: ( ( LT !)* assignmentExpression )?
            	    int alt223=2;
            	    alt223 = dfa223.predict(input);
            	    switch (alt223) {
            	        case 1 :
            	            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:356:46: ( LT !)* assignmentExpression
            	            {
            	            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:356:48: ( LT !)*
            	            loop222:
            	            do {
            	                int alt222=2;
            	                int LA222_0 = input.LA(1);

            	                if ( (LA222_0==LT) ) {
            	                    alt222=1;
            	                }


            	                switch (alt222) {
            	            	case 1 :
            	            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:356:48: LT !
            	            	    {
            	            	    LT433=(Token)match(input,LT,FOLLOW_LT_in_arrayLiteral2403); if (state.failed) return retval;

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop222;
            	                }
            	            } while (true);


            	            pushFollow(FOLLOW_assignmentExpression_in_arrayLiteral2407);
            	            assignmentExpression434=assignmentExpression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression434.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop224;
                }
            } while (true);


            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:356:78: ( LT !)*
            loop225:
            do {
                int alt225=2;
                int LA225_0 = input.LA(1);

                if ( (LA225_0==LT) ) {
                    alt225=1;
                }


                switch (alt225) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:356:78: LT !
            	    {
            	    LT435=(Token)match(input,LT,FOLLOW_LT_in_arrayLiteral2413); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop225;
                }
            } while (true);


            char_literal436=(Token)match(input,71,FOLLOW_71_in_arrayLiteral2417); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal436_tree = 
            (Object)adaptor.create(char_literal436)
            ;
            adaptor.addChild(root_0, char_literal436_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 77, arrayLiteral_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arrayLiteral"


    public static class objectLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "objectLiteral"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:360:1: objectLiteral : ( '{' ( LT !)* '}' | '{' ( LT !)* propertyNameAndValue ( ( LT !)* ',' ( LT !)* propertyNameAndValue )* ( LT !)* '}' );
    public final JavaScriptParser.objectLiteral_return objectLiteral() throws RecognitionException {
        JavaScriptParser.objectLiteral_return retval = new JavaScriptParser.objectLiteral_return();
        retval.start = input.LT(1);

        int objectLiteral_StartIndex = input.index();

        Object root_0 = null;

        Token char_literal437=null;
        Token LT438=null;
        Token char_literal439=null;
        Token char_literal440=null;
        Token LT441=null;
        Token LT443=null;
        Token char_literal444=null;
        Token LT445=null;
        Token LT447=null;
        Token char_literal448=null;
        JavaScriptParser.propertyNameAndValue_return propertyNameAndValue442 =null;

        JavaScriptParser.propertyNameAndValue_return propertyNameAndValue446 =null;


        Object char_literal437_tree=null;
        Object LT438_tree=null;
        Object char_literal439_tree=null;
        Object char_literal440_tree=null;
        Object LT441_tree=null;
        Object LT443_tree=null;
        Object char_literal444_tree=null;
        Object LT445_tree=null;
        Object LT447_tree=null;
        Object char_literal448_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:361:2: ( '{' ( LT !)* '}' | '{' ( LT !)* propertyNameAndValue ( ( LT !)* ',' ( LT !)* propertyNameAndValue )* ( LT !)* '}' )
            int alt232=2;
            alt232 = dfa232.predict(input);
            switch (alt232) {
                case 1 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:361:4: '{' ( LT !)* '}'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal437=(Token)match(input,102,FOLLOW_102_in_objectLiteral2436); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal437_tree = 
                    (Object)adaptor.create(char_literal437)
                    ;
                    adaptor.addChild(root_0, char_literal437_tree);
                    }

                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:361:10: ( LT !)*
                    loop226:
                    do {
                        int alt226=2;
                        int LA226_0 = input.LA(1);

                        if ( (LA226_0==LT) ) {
                            alt226=1;
                        }


                        switch (alt226) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:361:10: LT !
                    	    {
                    	    LT438=(Token)match(input,LT,FOLLOW_LT_in_objectLiteral2438); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop226;
                        }
                    } while (true);


                    char_literal439=(Token)match(input,106,FOLLOW_106_in_objectLiteral2442); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal439_tree = 
                    (Object)adaptor.create(char_literal439)
                    ;
                    adaptor.addChild(root_0, char_literal439_tree);
                    }

                    }
                    break;
                case 2 :
                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:362:4: '{' ( LT !)* propertyNameAndValue ( ( LT !)* ',' ( LT !)* propertyNameAndValue )* ( LT !)* '}'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal440=(Token)match(input,102,FOLLOW_102_in_objectLiteral2447); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal440_tree = 
                    (Object)adaptor.create(char_literal440)
                    ;
                    adaptor.addChild(root_0, char_literal440_tree);
                    }

                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:362:10: ( LT !)*
                    loop227:
                    do {
                        int alt227=2;
                        int LA227_0 = input.LA(1);

                        if ( (LA227_0==LT) ) {
                            alt227=1;
                        }


                        switch (alt227) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:362:10: LT !
                    	    {
                    	    LT441=(Token)match(input,LT,FOLLOW_LT_in_objectLiteral2449); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop227;
                        }
                    } while (true);


                    pushFollow(FOLLOW_propertyNameAndValue_in_objectLiteral2453);
                    propertyNameAndValue442=propertyNameAndValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, propertyNameAndValue442.getTree());

                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:362:34: ( ( LT !)* ',' ( LT !)* propertyNameAndValue )*
                    loop230:
                    do {
                        int alt230=2;
                        alt230 = dfa230.predict(input);
                        switch (alt230) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:362:35: ( LT !)* ',' ( LT !)* propertyNameAndValue
                    	    {
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:362:37: ( LT !)*
                    	    loop228:
                    	    do {
                    	        int alt228=2;
                    	        int LA228_0 = input.LA(1);

                    	        if ( (LA228_0==LT) ) {
                    	            alt228=1;
                    	        }


                    	        switch (alt228) {
                    	    	case 1 :
                    	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:362:37: LT !
                    	    	    {
                    	    	    LT443=(Token)match(input,LT,FOLLOW_LT_in_objectLiteral2456); if (state.failed) return retval;

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop228;
                    	        }
                    	    } while (true);


                    	    char_literal444=(Token)match(input,47,FOLLOW_47_in_objectLiteral2460); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal444_tree = 
                    	    (Object)adaptor.create(char_literal444)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal444_tree);
                    	    }

                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:362:46: ( LT !)*
                    	    loop229:
                    	    do {
                    	        int alt229=2;
                    	        int LA229_0 = input.LA(1);

                    	        if ( (LA229_0==LT) ) {
                    	            alt229=1;
                    	        }


                    	        switch (alt229) {
                    	    	case 1 :
                    	    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:362:46: LT !
                    	    	    {
                    	    	    LT445=(Token)match(input,LT,FOLLOW_LT_in_objectLiteral2462); if (state.failed) return retval;

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop229;
                    	        }
                    	    } while (true);


                    	    pushFollow(FOLLOW_propertyNameAndValue_in_objectLiteral2466);
                    	    propertyNameAndValue446=propertyNameAndValue();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, propertyNameAndValue446.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop230;
                        }
                    } while (true);


                    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:362:74: ( LT !)*
                    loop231:
                    do {
                        int alt231=2;
                        int LA231_0 = input.LA(1);

                        if ( (LA231_0==LT) ) {
                            alt231=1;
                        }


                        switch (alt231) {
                    	case 1 :
                    	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:362:74: LT !
                    	    {
                    	    LT447=(Token)match(input,LT,FOLLOW_LT_in_objectLiteral2470); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop231;
                        }
                    } while (true);


                    char_literal448=(Token)match(input,106,FOLLOW_106_in_objectLiteral2474); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal448_tree = 
                    (Object)adaptor.create(char_literal448)
                    ;
                    adaptor.addChild(root_0, char_literal448_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 78, objectLiteral_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "objectLiteral"


    public static class propertyNameAndValue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "propertyNameAndValue"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:365:1: propertyNameAndValue : propertyName ( LT !)* ':' ( LT !)* assignmentExpression ;
    public final JavaScriptParser.propertyNameAndValue_return propertyNameAndValue() throws RecognitionException {
        JavaScriptParser.propertyNameAndValue_return retval = new JavaScriptParser.propertyNameAndValue_return();
        retval.start = input.LT(1);

        int propertyNameAndValue_StartIndex = input.index();

        Object root_0 = null;

        Token LT450=null;
        Token char_literal451=null;
        Token LT452=null;
        JavaScriptParser.propertyName_return propertyName449 =null;

        JavaScriptParser.assignmentExpression_return assignmentExpression453 =null;


        Object LT450_tree=null;
        Object char_literal451_tree=null;
        Object LT452_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:366:2: ( propertyName ( LT !)* ':' ( LT !)* assignmentExpression )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:366:4: propertyName ( LT !)* ':' ( LT !)* assignmentExpression
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_propertyName_in_propertyNameAndValue2486);
            propertyName449=propertyName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, propertyName449.getTree());

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:366:19: ( LT !)*
            loop233:
            do {
                int alt233=2;
                int LA233_0 = input.LA(1);

                if ( (LA233_0==LT) ) {
                    alt233=1;
                }


                switch (alt233) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:366:19: LT !
            	    {
            	    LT450=(Token)match(input,LT,FOLLOW_LT_in_propertyNameAndValue2488); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop233;
                }
            } while (true);


            char_literal451=(Token)match(input,54,FOLLOW_54_in_propertyNameAndValue2492); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal451_tree = 
            (Object)adaptor.create(char_literal451)
            ;
            adaptor.addChild(root_0, char_literal451_tree);
            }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:366:28: ( LT !)*
            loop234:
            do {
                int alt234=2;
                int LA234_0 = input.LA(1);

                if ( (LA234_0==LT) ) {
                    alt234=1;
                }


                switch (alt234) {
            	case 1 :
            	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:366:28: LT !
            	    {
            	    LT452=(Token)match(input,LT,FOLLOW_LT_in_propertyNameAndValue2494); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop234;
                }
            } while (true);


            pushFollow(FOLLOW_assignmentExpression_in_propertyNameAndValue2498);
            assignmentExpression453=assignmentExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression453.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 79, propertyNameAndValue_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "propertyNameAndValue"


    public static class propertyName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "propertyName"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:369:1: propertyName : ( Identifier | StringLiteral | NumericLiteral );
    public final JavaScriptParser.propertyName_return propertyName() throws RecognitionException {
        JavaScriptParser.propertyName_return retval = new JavaScriptParser.propertyName_return();
        retval.start = input.LT(1);

        int propertyName_StartIndex = input.index();

        Object root_0 = null;

        Token set454=null;

        Object set454_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:370:2: ( Identifier | StringLiteral | NumericLiteral )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:
            {
            root_0 = (Object)adaptor.nil();


            set454=(Token)input.LT(1);

            if ( input.LA(1)==Identifier||input.LA(1)==NumericLiteral||input.LA(1)==StringLiteral ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set454)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 80, propertyName_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "propertyName"


    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "literal"
    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:376:1: literal : ( 'null' | 'true' | 'false' | StringLiteral | NumericLiteral | RegexpLiteral );
    public final JavaScriptParser.literal_return literal() throws RecognitionException {
        JavaScriptParser.literal_return retval = new JavaScriptParser.literal_return();
        retval.start = input.LT(1);

        int literal_StartIndex = input.index();

        Object root_0 = null;

        Token set455=null;

        Object set455_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:377:2: ( 'null' | 'true' | 'false' | StringLiteral | NumericLiteral | RegexpLiteral )
            // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:
            {
            root_0 = (Object)adaptor.nil();


            set455=(Token)input.LT(1);

            if ( (input.LA(1) >= NumericLiteral && input.LA(1) <= RegexpLiteral)||input.LA(1)==StringLiteral||input.LA(1)==82||input.LA(1)==90||input.LA(1)==95 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set455)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 81, literal_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "literal"

    // $ANTLR start synpred5_JavaScript
    public final void synpred5_JavaScript_fragment() throws RecognitionException {
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:24:4: ( functionDeclaration )
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:24:4: functionDeclaration
        {
        pushFollow(FOLLOW_functionDeclaration_in_synpred5_JavaScript81);
        functionDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_JavaScript

    // $ANTLR start synpred9_JavaScript
    public final void synpred9_JavaScript_fragment() throws RecognitionException {
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:34:17: ( LT )
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:34:17: LT
        {
        match(input,LT,FOLLOW_LT_in_synpred9_JavaScript131); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred9_JavaScript

    // $ANTLR start synpred21_JavaScript
    public final void synpred21_JavaScript_fragment() throws RecognitionException {
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:47:4: ( statementBlock )
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:47:4: statementBlock
        {
        pushFollow(FOLLOW_statementBlock_in_synpred21_JavaScript225);
        statementBlock();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred21_JavaScript

    // $ANTLR start synpred24_JavaScript
    public final void synpred24_JavaScript_fragment() throws RecognitionException {
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:50:4: ( expressionStatement )
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:50:4: expressionStatement
        {
        pushFollow(FOLLOW_expressionStatement_in_synpred24_JavaScript240);
        expressionStatement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred24_JavaScript

    // $ANTLR start synpred31_JavaScript
    public final void synpred31_JavaScript_fragment() throws RecognitionException {
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:57:4: ( labelledStatement )
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:57:4: labelledStatement
        {
        pushFollow(FOLLOW_labelledStatement_in_synpred31_JavaScript275);
        labelledStatement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred31_JavaScript

    // $ANTLR start synpred34_JavaScript
    public final void synpred34_JavaScript_fragment() throws RecognitionException {
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:64:10: ( LT )
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:64:10: LT
        {
        match(input,LT,FOLLOW_LT_in_synpred34_JavaScript304); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred34_JavaScript

    // $ANTLR start synpred47_JavaScript
    public final void synpred47_JavaScript_fragment() throws RecognitionException {
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:84:17: ( LT )
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:84:17: LT
        {
        match(input,LT,FOLLOW_LT_in_synpred47_JavaScript431); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred47_JavaScript

    // $ANTLR start synpred49_JavaScript
    public final void synpred49_JavaScript_fragment() throws RecognitionException {
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:88:17: ( LT )
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:88:17: LT
        {
        match(input,LT,FOLLOW_LT_in_synpred49_JavaScript450); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred49_JavaScript

    // $ANTLR start synpred60_JavaScript
    public final void synpred60_JavaScript_fragment() throws RecognitionException {
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:108:59: ( ( LT )* 'else' ( LT )* statement )
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:108:59: ( LT )* 'else' ( LT )* statement
        {
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:108:61: ( LT )*
        loop247:
        do {
            int alt247=2;
            int LA247_0 = input.LA(1);

            if ( (LA247_0==LT) ) {
                alt247=1;
            }


            switch (alt247) {
        	case 1 :
        	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:108:61: LT
        	    {
        	    match(input,LT,FOLLOW_LT_in_synpred60_JavaScript563); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop247;
            }
        } while (true);


        match(input,81,FOLLOW_81_in_synpred60_JavaScript567); if (state.failed) return ;

        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:108:73: ( LT )*
        loop248:
        do {
            int alt248=2;
            int LA248_0 = input.LA(1);

            if ( (LA248_0==LT) ) {
                alt248=1;
            }


            switch (alt248) {
        	case 1 :
        	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:108:73: LT
        	    {
        	    match(input,LT,FOLLOW_LT_in_synpred60_JavaScript569); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop248;
            }
        } while (true);


        pushFollow(FOLLOW_statement_in_synpred60_JavaScript573);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred60_JavaScript

    // $ANTLR start synpred63_JavaScript
    public final void synpred63_JavaScript_fragment() throws RecognitionException {
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:114:4: ( forStatement )
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:114:4: forStatement
        {
        pushFollow(FOLLOW_forStatement_in_synpred63_JavaScript597);
        forStatement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred63_JavaScript

    // $ANTLR start synpred118_JavaScript
    public final void synpred118_JavaScript_fragment() throws RecognitionException {
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:173:38: ( LT )
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:173:38: LT
        {
        match(input,LT,FOLLOW_LT_in_synpred118_JavaScript1078); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred118_JavaScript

    // $ANTLR start synpred121_JavaScript
    public final void synpred121_JavaScript_fragment() throws RecognitionException {
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:177:25: ( LT )
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:177:25: LT
        {
        match(input,LT,FOLLOW_LT_in_synpred121_JavaScript1103); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred121_JavaScript

    // $ANTLR start synpred140_JavaScript
    public final void synpred140_JavaScript_fragment() throws RecognitionException {
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:206:4: ( conditionalExpression )
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:206:4: conditionalExpression
        {
        pushFollow(FOLLOW_conditionalExpression_in_synpred140_JavaScript1295);
        conditionalExpression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred140_JavaScript

    // $ANTLR start synpred143_JavaScript
    public final void synpred143_JavaScript_fragment() throws RecognitionException {
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:211:4: ( conditionalExpressionNoIn )
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:211:4: conditionalExpressionNoIn
        {
        pushFollow(FOLLOW_conditionalExpressionNoIn_in_synpred143_JavaScript1324);
        conditionalExpressionNoIn();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred143_JavaScript

    // $ANTLR start synpred146_JavaScript
    public final void synpred146_JavaScript_fragment() throws RecognitionException {
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:216:4: ( callExpression )
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:216:4: callExpression
        {
        pushFollow(FOLLOW_callExpression_in_synpred146_JavaScript1353);
        callExpression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred146_JavaScript

    // $ANTLR start synpred147_JavaScript
    public final void synpred147_JavaScript_fragment() throws RecognitionException {
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:221:4: ( memberExpression )
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:221:4: memberExpression
        {
        pushFollow(FOLLOW_memberExpression_in_synpred147_JavaScript1370);
        memberExpression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred147_JavaScript

    // $ANTLR start synpred154_JavaScript
    public final void synpred154_JavaScript_fragment() throws RecognitionException {
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:226:91: ( ( LT )* memberExpressionSuffix )
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:226:91: ( LT )* memberExpressionSuffix
        {
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:226:93: ( LT )*
        loop262:
        do {
            int alt262=2;
            int LA262_0 = input.LA(1);

            if ( (LA262_0==LT) ) {
                alt262=1;
            }


            switch (alt262) {
        	case 1 :
        	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:226:93: LT
        	    {
        	    match(input,LT,FOLLOW_LT_in_synpred154_JavaScript1418); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop262;
            }
        } while (true);


        pushFollow(FOLLOW_memberExpressionSuffix_in_synpred154_JavaScript1422);
        memberExpressionSuffix();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred154_JavaScript

    // $ANTLR start synpred158_JavaScript
    public final void synpred158_JavaScript_fragment() throws RecognitionException {
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:235:37: ( ( LT )* callExpressionSuffix )
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:235:37: ( LT )* callExpressionSuffix
        {
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:235:39: ( LT )*
        loop263:
        do {
            int alt263=2;
            int LA263_0 = input.LA(1);

            if ( (LA263_0==LT) ) {
                alt263=1;
            }


            switch (alt263) {
        	case 1 :
        	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:235:39: LT
        	    {
        	    match(input,LT,FOLLOW_LT_in_synpred158_JavaScript1461); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop263;
            }
        } while (true);


        pushFollow(FOLLOW_callExpressionSuffix_in_synpred158_JavaScript1465);
        callExpressionSuffix();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred158_JavaScript

    // $ANTLR start synpred256_JavaScript
    public final void synpred256_JavaScript_fragment() throws RecognitionException {
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:329:30: ( ( LT )* ( '+' | '-' ) ( LT )* multiplicativeExpression )
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:329:30: ( LT )* ( '+' | '-' ) ( LT )* multiplicativeExpression
        {
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:329:32: ( LT )*
        loop308:
        do {
            int alt308=2;
            int LA308_0 = input.LA(1);

            if ( (LA308_0==LT) ) {
                alt308=1;
            }


            switch (alt308) {
        	case 1 :
        	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:329:32: LT
        	    {
        	    match(input,LT,FOLLOW_LT_in_synpred256_JavaScript2198); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop308;
            }
        } while (true);


        if ( input.LA(1)==44||input.LA(1)==48 ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:329:49: ( LT )*
        loop309:
        do {
            int alt309=2;
            int LA309_0 = input.LA(1);

            if ( (LA309_0==LT) ) {
                alt309=1;
            }


            switch (alt309) {
        	case 1 :
        	    // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:329:49: LT
        	    {
        	    match(input,LT,FOLLOW_LT_in_synpred256_JavaScript2210); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop309;
            }
        } while (true);


        pushFollow(FOLLOW_multiplicativeExpression_in_synpred256_JavaScript2214);
        multiplicativeExpression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred256_JavaScript

    // $ANTLR start synpred280_JavaScript
    public final void synpred280_JavaScript_fragment() throws RecognitionException {
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:356:10: ( LT )
        // D:\\Pessoal\\Lexar\\Unisinos\\Cadeiras\\Tradutores\\ant\\gram\\output\\JavaScript.g3:356:10: LT
        {
        match(input,LT,FOLLOW_LT_in_synpred280_JavaScript2388); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred280_JavaScript

    // Delegated rules

    public final boolean synpred60_JavaScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_JavaScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred121_JavaScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred121_JavaScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred146_JavaScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred146_JavaScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred154_JavaScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred154_JavaScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_JavaScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_JavaScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred147_JavaScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred147_JavaScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_JavaScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_JavaScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_JavaScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_JavaScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred256_JavaScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred256_JavaScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred280_JavaScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred280_JavaScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred118_JavaScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred118_JavaScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred158_JavaScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred158_JavaScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_JavaScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_JavaScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_JavaScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_JavaScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_JavaScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_JavaScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_JavaScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_JavaScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_JavaScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_JavaScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred143_JavaScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred143_JavaScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred140_JavaScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred140_JavaScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_JavaScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_JavaScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA96 dfa96 = new DFA96(this);
    protected DFA100 dfa100 = new DFA100(this);
    protected DFA99 dfa99 = new DFA99(this);
    protected DFA112 dfa112 = new DFA112(this);
    protected DFA121 dfa121 = new DFA121(this);
    protected DFA124 dfa124 = new DFA124(this);
    protected DFA148 dfa148 = new DFA148(this);
    protected DFA147 dfa147 = new DFA147(this);
    protected DFA157 dfa157 = new DFA157(this);
    protected DFA162 dfa162 = new DFA162(this);
    protected DFA165 dfa165 = new DFA165(this);
    protected DFA168 dfa168 = new DFA168(this);
    protected DFA171 dfa171 = new DFA171(this);
    protected DFA174 dfa174 = new DFA174(this);
    protected DFA177 dfa177 = new DFA177(this);
    protected DFA180 dfa180 = new DFA180(this);
    protected DFA183 dfa183 = new DFA183(this);
    protected DFA186 dfa186 = new DFA186(this);
    protected DFA189 dfa189 = new DFA189(this);
    protected DFA192 dfa192 = new DFA192(this);
    protected DFA195 dfa195 = new DFA195(this);
    protected DFA198 dfa198 = new DFA198(this);
    protected DFA201 dfa201 = new DFA201(this);
    protected DFA204 dfa204 = new DFA204(this);
    protected DFA207 dfa207 = new DFA207(this);
    protected DFA213 dfa213 = new DFA213(this);
    protected DFA224 dfa224 = new DFA224(this);
    protected DFA223 dfa223 = new DFA223(this);
    protected DFA232 dfa232 = new DFA232(this);
    protected DFA230 dfa230 = new DFA230(this);
    static final String DFA4_eotS =
        "\4\uffff";
    static final String DFA4_eofS =
        "\2\2\2\uffff";
    static final String DFA4_minS =
        "\2\17\2\uffff";
    static final String DFA4_maxS =
        "\2\153\2\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA4_specialS =
        "\4\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\3\2\uffff\1\1\2\uffff\2\3\2\uffff\1\3\6\uffff\1\3\7\uffff"+
            "\1\3\3\uffff\2\3\2\uffff\2\3\5\uffff\1\3\16\uffff\1\3\3\uffff"+
            "\1\3\2\uffff\1\3\1\uffff\2\3\1\uffff\1\3\1\uffff\3\3\2\uffff"+
            "\16\3\3\uffff\1\2\1\3",
            "\1\3\2\uffff\1\1\2\uffff\2\3\2\uffff\1\3\6\uffff\1\3\7\uffff"+
            "\1\3\3\uffff\2\3\2\uffff\2\3\5\uffff\1\3\16\uffff\1\3\3\uffff"+
            "\1\3\2\uffff\1\3\1\uffff\2\3\1\uffff\1\3\1\uffff\3\3\2\uffff"+
            "\16\3\3\uffff\1\2\1\3",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "()* loopback of 20:18: ( ( LT !)* sourceElement )*";
        }
    }
    static final String DFA17_eotS =
        "\4\uffff";
    static final String DFA17_eofS =
        "\4\uffff";
    static final String DFA17_minS =
        "\2\17\2\uffff";
    static final String DFA17_maxS =
        "\2\51\2\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA17_specialS =
        "\4\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\2\2\uffff\1\1\26\uffff\1\3",
            "\1\2\2\uffff\1\1\26\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "38:8: ( ( LT !)* Identifier ( ( LT !)* ',' ( LT !)* Identifier )* )?";
        }
    }
    static final String DFA16_eotS =
        "\4\uffff";
    static final String DFA16_eofS =
        "\4\uffff";
    static final String DFA16_minS =
        "\2\22\2\uffff";
    static final String DFA16_maxS =
        "\2\57\2\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA16_specialS =
        "\4\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1\26\uffff\1\2\5\uffff\1\3",
            "\1\1\26\uffff\1\2\5\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "()* loopback of 38:25: ( ( LT !)* ',' ( LT !)* Identifier )*";
        }
    }
    static final String DFA26_eotS =
        "\4\uffff";
    static final String DFA26_eofS =
        "\1\2\3\uffff";
    static final String DFA26_minS =
        "\2\17\2\uffff";
    static final String DFA26_maxS =
        "\2\153\2\uffff";
    static final String DFA26_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA26_specialS =
        "\4\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\3\2\uffff\1\1\2\uffff\2\3\2\uffff\1\3\6\uffff\1\3\7\uffff"+
            "\1\3\3\uffff\2\3\2\uffff\2\3\5\uffff\1\3\16\uffff\1\3\3\uffff"+
            "\1\3\1\2\1\uffff\1\3\1\2\2\3\1\uffff\1\3\1\uffff\3\3\2\uffff"+
            "\16\3\3\uffff\1\2\1\3",
            "\1\3\2\uffff\1\1\2\uffff\2\3\2\uffff\1\3\6\uffff\1\3\7\uffff"+
            "\1\3\3\uffff\2\3\2\uffff\2\3\5\uffff\1\3\16\uffff\1\3\3\uffff"+
            "\1\3\1\2\1\uffff\1\3\1\2\2\3\1\uffff\1\3\1\uffff\3\3\2\uffff"+
            "\16\3\3\uffff\1\2\1\3",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "()* loopback of 68:14: ( ( LT !)* statement )*";
        }
    }
    static final String DFA31_eotS =
        "\5\uffff";
    static final String DFA31_eofS =
        "\1\uffff\1\2\2\uffff\1\2";
    static final String DFA31_minS =
        "\1\22\1\17\2\uffff\1\17";
    static final String DFA31_maxS =
        "\1\67\1\153\2\uffff\1\153";
    static final String DFA31_acceptS =
        "\2\uffff\1\2\1\1\1\uffff";
    static final String DFA31_specialS =
        "\5\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\1\34\uffff\1\3\7\uffff\1\2",
            "\1\2\2\uffff\1\4\2\uffff\2\2\2\uffff\1\2\6\uffff\1\2\7\uffff"+
            "\1\2\3\uffff\2\2\1\uffff\1\3\2\2\5\uffff\1\2\16\uffff\1\2\3"+
            "\uffff\2\2\1\uffff\6\2\1\uffff\3\2\2\uffff\16\2\3\uffff\2\2",
            "",
            "",
            "\1\2\2\uffff\1\4\2\uffff\2\2\2\uffff\1\2\6\uffff\1\2\7\uffff"+
            "\1\2\3\uffff\2\2\1\uffff\1\3\2\2\5\uffff\1\2\16\uffff\1\2\3"+
            "\uffff\2\2\1\uffff\6\2\1\uffff\3\2\2\uffff\16\2\3\uffff\2\2"
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "()* loopback of 76:24: ( ( LT !)* ',' ( LT !)* variableDeclaration )*";
        }
    }
    static final String DFA34_eotS =
        "\4\uffff";
    static final String DFA34_eofS =
        "\1\2\3\uffff";
    static final String DFA34_minS =
        "\2\22\2\uffff";
    static final String DFA34_maxS =
        "\2\67\2\uffff";
    static final String DFA34_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA34_specialS =
        "\4\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\1\34\uffff\1\3\7\uffff\1\2",
            "\1\1\34\uffff\1\3\7\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "()* loopback of 80:28: ( ( LT !)* ',' ( LT !)* variableDeclarationNoIn )*";
        }
    }
    static final String DFA60_eotS =
        "\4\uffff";
    static final String DFA60_eofS =
        "\4\uffff";
    static final String DFA60_minS =
        "\2\17\2\uffff";
    static final String DFA60_maxS =
        "\2\153\2\uffff";
    static final String DFA60_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA60_specialS =
        "\4\uffff}>";
    static final String[] DFA60_transitionS = {
            "\1\2\2\uffff\1\1\2\uffff\2\2\2\uffff\1\2\6\uffff\1\2\7\uffff"+
            "\1\2\3\uffff\2\2\2\uffff\2\2\5\uffff\1\3\16\uffff\1\2\10\uffff"+
            "\1\2\2\uffff\1\2\2\uffff\1\2\3\uffff\2\2\2\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\3\2\2\uffff\1\2\4\uffff\1\2",
            "\1\2\2\uffff\1\1\2\uffff\2\2\2\uffff\1\2\6\uffff\1\2\7\uffff"+
            "\1\2\3\uffff\2\2\2\uffff\2\2\5\uffff\1\3\16\uffff\1\2\10\uffff"+
            "\1\2\2\uffff\1\2\2\uffff\1\2\3\uffff\2\2\2\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\3\2\2\uffff\1\2\4\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "127:19: ( ( LT !)* forStatementInitialiserPart )?";
        }
    }
    static final String DFA63_eotS =
        "\4\uffff";
    static final String DFA63_eofS =
        "\4\uffff";
    static final String DFA63_minS =
        "\2\17\2\uffff";
    static final String DFA63_maxS =
        "\2\153\2\uffff";
    static final String DFA63_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA63_specialS =
        "\4\uffff}>";
    static final String[] DFA63_transitionS = {
            "\1\2\2\uffff\1\1\2\uffff\2\2\2\uffff\1\2\6\uffff\1\2\7\uffff"+
            "\1\2\3\uffff\2\2\2\uffff\2\2\5\uffff\1\3\16\uffff\1\2\10\uffff"+
            "\1\2\2\uffff\1\2\2\uffff\1\2\3\uffff\2\2\2\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2\4\uffff\1\2",
            "\1\2\2\uffff\1\1\2\uffff\2\2\2\uffff\1\2\6\uffff\1\2\7\uffff"+
            "\1\2\3\uffff\2\2\2\uffff\2\2\5\uffff\1\3\16\uffff\1\2\10\uffff"+
            "\1\2\2\uffff\1\2\2\uffff\1\2\3\uffff\2\2\2\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2\4\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "127:64: ( ( LT !)* expression )?";
        }
    }
    static final String DFA66_eotS =
        "\4\uffff";
    static final String DFA66_eofS =
        "\4\uffff";
    static final String DFA66_minS =
        "\2\17\2\uffff";
    static final String DFA66_maxS =
        "\2\153\2\uffff";
    static final String DFA66_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA66_specialS =
        "\4\uffff}>";
    static final String[] DFA66_transitionS = {
            "\1\2\2\uffff\1\1\2\uffff\2\2\2\uffff\1\2\6\uffff\1\2\7\uffff"+
            "\1\2\1\3\2\uffff\2\2\2\uffff\2\2\24\uffff\1\2\10\uffff\1\2\2"+
            "\uffff\1\2\2\uffff\1\2\3\uffff\2\2\2\uffff\1\2\1\uffff\1\2\1"+
            "\uffff\1\2\1\uffff\1\2\2\uffff\1\2\4\uffff\1\2",
            "\1\2\2\uffff\1\1\2\uffff\2\2\2\uffff\1\2\6\uffff\1\2\7\uffff"+
            "\1\2\1\3\2\uffff\2\2\2\uffff\2\2\24\uffff\1\2\10\uffff\1\2\2"+
            "\uffff\1\2\2\uffff\1\2\3\uffff\2\2\2\uffff\1\2\1\uffff\1\2\1"+
            "\uffff\1\2\1\uffff\1\2\2\uffff\1\2\4\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "127:92: ( ( LT !)* expression )?";
        }
    }
    static final String DFA96_eotS =
        "\4\uffff";
    static final String DFA96_eofS =
        "\4\uffff";
    static final String DFA96_minS =
        "\2\22\2\uffff";
    static final String DFA96_maxS =
        "\2\152\2\uffff";
    static final String DFA96_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA96_specialS =
        "\4\uffff}>";
    static final String[] DFA96_transitionS = {
            "\1\1\70\uffff\1\3\2\uffff\1\2\33\uffff\1\2",
            "\1\1\70\uffff\1\3\2\uffff\1\2\33\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA96_eot = DFA.unpackEncodedString(DFA96_eotS);
    static final short[] DFA96_eof = DFA.unpackEncodedString(DFA96_eofS);
    static final char[] DFA96_min = DFA.unpackEncodedStringToUnsignedChars(DFA96_minS);
    static final char[] DFA96_max = DFA.unpackEncodedStringToUnsignedChars(DFA96_maxS);
    static final short[] DFA96_accept = DFA.unpackEncodedString(DFA96_acceptS);
    static final short[] DFA96_special = DFA.unpackEncodedString(DFA96_specialS);
    static final short[][] DFA96_transition;

    static {
        int numStates = DFA96_transitionS.length;
        DFA96_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA96_transition[i] = DFA.unpackEncodedString(DFA96_transitionS[i]);
        }
    }

    class DFA96 extends DFA {

        public DFA96(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 96;
            this.eot = DFA96_eot;
            this.eof = DFA96_eof;
            this.min = DFA96_min;
            this.max = DFA96_max;
            this.accept = DFA96_accept;
            this.special = DFA96_special;
            this.transition = DFA96_transition;
        }
        public String getDescription() {
            return "()* loopback of 169:8: ( ( LT !)* caseClause )*";
        }
    }
    static final String DFA100_eotS =
        "\4\uffff";
    static final String DFA100_eofS =
        "\4\uffff";
    static final String DFA100_minS =
        "\2\22\2\uffff";
    static final String DFA100_maxS =
        "\2\152\2\uffff";
    static final String DFA100_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA100_specialS =
        "\4\uffff}>";
    static final String[] DFA100_transitionS = {
            "\1\1\73\uffff\1\2\33\uffff\1\3",
            "\1\1\73\uffff\1\2\33\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA100_eot = DFA.unpackEncodedString(DFA100_eotS);
    static final short[] DFA100_eof = DFA.unpackEncodedString(DFA100_eofS);
    static final char[] DFA100_min = DFA.unpackEncodedStringToUnsignedChars(DFA100_minS);
    static final char[] DFA100_max = DFA.unpackEncodedStringToUnsignedChars(DFA100_maxS);
    static final short[] DFA100_accept = DFA.unpackEncodedString(DFA100_acceptS);
    static final short[] DFA100_special = DFA.unpackEncodedString(DFA100_specialS);
    static final short[][] DFA100_transition;

    static {
        int numStates = DFA100_transitionS.length;
        DFA100_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA100_transition[i] = DFA.unpackEncodedString(DFA100_transitionS[i]);
        }
    }

    class DFA100 extends DFA {

        public DFA100(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 100;
            this.eot = DFA100_eot;
            this.eof = DFA100_eof;
            this.min = DFA100_min;
            this.max = DFA100_max;
            this.accept = DFA100_accept;
            this.special = DFA100_special;
            this.transition = DFA100_transition;
        }
        public String getDescription() {
            return "169:27: ( ( LT !)* defaultClause ( ( LT !)* caseClause )* )?";
        }
    }
    static final String DFA99_eotS =
        "\4\uffff";
    static final String DFA99_eofS =
        "\4\uffff";
    static final String DFA99_minS =
        "\2\22\2\uffff";
    static final String DFA99_maxS =
        "\2\152\2\uffff";
    static final String DFA99_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA99_specialS =
        "\4\uffff}>";
    static final String[] DFA99_transitionS = {
            "\1\1\70\uffff\1\3\36\uffff\1\2",
            "\1\1\70\uffff\1\3\36\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA99_eot = DFA.unpackEncodedString(DFA99_eotS);
    static final short[] DFA99_eof = DFA.unpackEncodedString(DFA99_eofS);
    static final char[] DFA99_min = DFA.unpackEncodedStringToUnsignedChars(DFA99_minS);
    static final char[] DFA99_max = DFA.unpackEncodedStringToUnsignedChars(DFA99_maxS);
    static final short[] DFA99_accept = DFA.unpackEncodedString(DFA99_acceptS);
    static final short[] DFA99_special = DFA.unpackEncodedString(DFA99_specialS);
    static final short[][] DFA99_transition;

    static {
        int numStates = DFA99_transitionS.length;
        DFA99_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA99_transition[i] = DFA.unpackEncodedString(DFA99_transitionS[i]);
        }
    }

    class DFA99 extends DFA {

        public DFA99(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 99;
            this.eot = DFA99_eot;
            this.eof = DFA99_eof;
            this.min = DFA99_min;
            this.max = DFA99_max;
            this.accept = DFA99_accept;
            this.special = DFA99_special;
            this.transition = DFA99_transition;
        }
        public String getDescription() {
            return "()* loopback of 169:47: ( ( LT !)* caseClause )*";
        }
    }
    static final String DFA112_eotS =
        "\4\uffff";
    static final String DFA112_eofS =
        "\2\3\2\uffff";
    static final String DFA112_minS =
        "\2\17\2\uffff";
    static final String DFA112_maxS =
        "\2\153\2\uffff";
    static final String DFA112_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA112_specialS =
        "\4\uffff}>";
    static final String[] DFA112_transitionS = {
            "\1\3\2\uffff\1\1\2\uffff\2\3\2\uffff\1\3\6\uffff\1\3\7\uffff"+
            "\1\3\3\uffff\2\3\2\uffff\2\3\5\uffff\1\3\16\uffff\1\3\3\uffff"+
            "\2\3\1\uffff\6\3\1\2\3\3\2\uffff\16\3\3\uffff\2\3",
            "\1\3\2\uffff\1\1\2\uffff\2\3\2\uffff\1\3\6\uffff\1\3\7\uffff"+
            "\1\3\3\uffff\2\3\2\uffff\2\3\5\uffff\1\3\16\uffff\1\3\3\uffff"+
            "\2\3\1\uffff\6\3\1\2\3\3\2\uffff\16\3\3\uffff\2\3",
            "",
            ""
    };

    static final short[] DFA112_eot = DFA.unpackEncodedString(DFA112_eotS);
    static final short[] DFA112_eof = DFA.unpackEncodedString(DFA112_eofS);
    static final char[] DFA112_min = DFA.unpackEncodedStringToUnsignedChars(DFA112_minS);
    static final char[] DFA112_max = DFA.unpackEncodedStringToUnsignedChars(DFA112_maxS);
    static final short[] DFA112_accept = DFA.unpackEncodedString(DFA112_acceptS);
    static final short[] DFA112_special = DFA.unpackEncodedString(DFA112_specialS);
    static final short[][] DFA112_transition;

    static {
        int numStates = DFA112_transitionS.length;
        DFA112_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA112_transition[i] = DFA.unpackEncodedString(DFA112_transitionS[i]);
        }
    }

    class DFA112 extends DFA {

        public DFA112(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 112;
            this.eot = DFA112_eot;
            this.eof = DFA112_eof;
            this.min = DFA112_min;
            this.max = DFA112_max;
            this.accept = DFA112_accept;
            this.special = DFA112_special;
            this.transition = DFA112_transition;
        }
        public String getDescription() {
            return "185:64: ( ( LT !)* finallyClause )?";
        }
    }
    static final String DFA121_eotS =
        "\5\uffff";
    static final String DFA121_eofS =
        "\2\2\2\uffff\1\2";
    static final String DFA121_minS =
        "\1\22\1\17\2\uffff\1\17";
    static final String DFA121_maxS =
        "\1\107\1\153\2\uffff\1\153";
    static final String DFA121_acceptS =
        "\2\uffff\1\2\1\1\1\uffff";
    static final String DFA121_specialS =
        "\5\uffff}>";
    static final String[] DFA121_transitionS = {
            "\1\1\26\uffff\1\2\5\uffff\1\3\6\uffff\2\2\17\uffff\1\2",
            "\1\2\2\uffff\1\4\2\uffff\2\2\2\uffff\1\2\6\uffff\1\2\7\uffff"+
            "\2\2\2\uffff\2\2\1\uffff\1\3\2\2\4\uffff\2\2\16\uffff\2\2\2"+
            "\uffff\2\2\1\uffff\6\2\1\uffff\3\2\2\uffff\16\2\3\uffff\2\2",
            "",
            "",
            "\1\2\2\uffff\1\4\2\uffff\2\2\2\uffff\1\2\6\uffff\1\2\7\uffff"+
            "\2\2\2\uffff\2\2\1\uffff\1\3\2\2\4\uffff\2\2\16\uffff\2\2\2"+
            "\uffff\2\2\1\uffff\6\2\1\uffff\3\2\2\uffff\16\2\3\uffff\2\2"
    };

    static final short[] DFA121_eot = DFA.unpackEncodedString(DFA121_eotS);
    static final short[] DFA121_eof = DFA.unpackEncodedString(DFA121_eofS);
    static final char[] DFA121_min = DFA.unpackEncodedStringToUnsignedChars(DFA121_minS);
    static final char[] DFA121_max = DFA.unpackEncodedStringToUnsignedChars(DFA121_maxS);
    static final short[] DFA121_accept = DFA.unpackEncodedString(DFA121_acceptS);
    static final short[] DFA121_special = DFA.unpackEncodedString(DFA121_specialS);
    static final short[][] DFA121_transition;

    static {
        int numStates = DFA121_transitionS.length;
        DFA121_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA121_transition[i] = DFA.unpackEncodedString(DFA121_transitionS[i]);
        }
    }

    class DFA121 extends DFA {

        public DFA121(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 121;
            this.eot = DFA121_eot;
            this.eof = DFA121_eof;
            this.min = DFA121_min;
            this.max = DFA121_max;
            this.accept = DFA121_accept;
            this.special = DFA121_special;
            this.transition = DFA121_transition;
        }
        public String getDescription() {
            return "()* loopback of 198:25: ( ( LT !)* ',' ( LT !)* assignmentExpression )*";
        }
    }
    static final String DFA124_eotS =
        "\4\uffff";
    static final String DFA124_eofS =
        "\1\2\3\uffff";
    static final String DFA124_minS =
        "\2\22\2\uffff";
    static final String DFA124_maxS =
        "\2\67\2\uffff";
    static final String DFA124_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA124_specialS =
        "\4\uffff}>";
    static final String[] DFA124_transitionS = {
            "\1\1\34\uffff\1\3\7\uffff\1\2",
            "\1\1\34\uffff\1\3\7\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA124_eot = DFA.unpackEncodedString(DFA124_eotS);
    static final short[] DFA124_eof = DFA.unpackEncodedString(DFA124_eofS);
    static final char[] DFA124_min = DFA.unpackEncodedStringToUnsignedChars(DFA124_minS);
    static final char[] DFA124_max = DFA.unpackEncodedStringToUnsignedChars(DFA124_maxS);
    static final short[] DFA124_accept = DFA.unpackEncodedString(DFA124_acceptS);
    static final short[] DFA124_special = DFA.unpackEncodedString(DFA124_specialS);
    static final short[][] DFA124_transition;

    static {
        int numStates = DFA124_transitionS.length;
        DFA124_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA124_transition[i] = DFA.unpackEncodedString(DFA124_transitionS[i]);
        }
    }

    class DFA124 extends DFA {

        public DFA124(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 124;
            this.eot = DFA124_eot;
            this.eof = DFA124_eof;
            this.min = DFA124_min;
            this.max = DFA124_max;
            this.accept = DFA124_accept;
            this.special = DFA124_special;
            this.transition = DFA124_transition;
        }
        public String getDescription() {
            return "()* loopback of 202:29: ( ( LT !)* ',' ( LT !)* assignmentExpressionNoIn )*";
        }
    }
    static final String DFA148_eotS =
        "\4\uffff";
    static final String DFA148_eofS =
        "\4\uffff";
    static final String DFA148_minS =
        "\2\17\2\uffff";
    static final String DFA148_maxS =
        "\2\153\2\uffff";
    static final String DFA148_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA148_specialS =
        "\4\uffff}>";
    static final String[] DFA148_transitionS = {
            "\1\2\2\uffff\1\1\2\uffff\2\2\2\uffff\1\2\6\uffff\1\2\7\uffff"+
            "\1\2\1\3\2\uffff\2\2\2\uffff\2\2\24\uffff\1\2\10\uffff\1\2\2"+
            "\uffff\1\2\2\uffff\1\2\3\uffff\2\2\2\uffff\1\2\1\uffff\1\2\1"+
            "\uffff\1\2\1\uffff\1\2\2\uffff\1\2\4\uffff\1\2",
            "\1\2\2\uffff\1\1\2\uffff\2\2\2\uffff\1\2\6\uffff\1\2\7\uffff"+
            "\1\2\1\3\2\uffff\2\2\2\uffff\2\2\24\uffff\1\2\10\uffff\1\2\2"+
            "\uffff\1\2\2\uffff\1\2\3\uffff\2\2\2\uffff\1\2\1\uffff\1\2\1"+
            "\uffff\1\2\1\uffff\1\2\2\uffff\1\2\4\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA148_eot = DFA.unpackEncodedString(DFA148_eotS);
    static final short[] DFA148_eof = DFA.unpackEncodedString(DFA148_eofS);
    static final char[] DFA148_min = DFA.unpackEncodedStringToUnsignedChars(DFA148_minS);
    static final char[] DFA148_max = DFA.unpackEncodedStringToUnsignedChars(DFA148_maxS);
    static final short[] DFA148_accept = DFA.unpackEncodedString(DFA148_acceptS);
    static final short[] DFA148_special = DFA.unpackEncodedString(DFA148_specialS);
    static final short[][] DFA148_transition;

    static {
        int numStates = DFA148_transitionS.length;
        DFA148_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA148_transition[i] = DFA.unpackEncodedString(DFA148_transitionS[i]);
        }
    }

    class DFA148 extends DFA {

        public DFA148(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 148;
            this.eot = DFA148_eot;
            this.eof = DFA148_eof;
            this.min = DFA148_min;
            this.max = DFA148_max;
            this.accept = DFA148_accept;
            this.special = DFA148_special;
            this.transition = DFA148_transition;
        }
        public String getDescription() {
            return "245:8: ( ( LT !)* assignmentExpression ( ( LT !)* ',' ( LT !)* assignmentExpression )* )?";
        }
    }
    static final String DFA147_eotS =
        "\4\uffff";
    static final String DFA147_eofS =
        "\4\uffff";
    static final String DFA147_minS =
        "\2\22\2\uffff";
    static final String DFA147_maxS =
        "\2\57\2\uffff";
    static final String DFA147_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA147_specialS =
        "\4\uffff}>";
    static final String[] DFA147_transitionS = {
            "\1\1\26\uffff\1\2\5\uffff\1\3",
            "\1\1\26\uffff\1\2\5\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA147_eot = DFA.unpackEncodedString(DFA147_eotS);
    static final short[] DFA147_eof = DFA.unpackEncodedString(DFA147_eofS);
    static final char[] DFA147_min = DFA.unpackEncodedStringToUnsignedChars(DFA147_minS);
    static final char[] DFA147_max = DFA.unpackEncodedStringToUnsignedChars(DFA147_maxS);
    static final short[] DFA147_accept = DFA.unpackEncodedString(DFA147_acceptS);
    static final short[] DFA147_special = DFA.unpackEncodedString(DFA147_specialS);
    static final short[][] DFA147_transition;

    static {
        int numStates = DFA147_transitionS.length;
        DFA147_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA147_transition[i] = DFA.unpackEncodedString(DFA147_transitionS[i]);
        }
    }

    class DFA147 extends DFA {

        public DFA147(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 147;
            this.eot = DFA147_eot;
            this.eof = DFA147_eof;
            this.min = DFA147_min;
            this.max = DFA147_max;
            this.accept = DFA147_accept;
            this.special = DFA147_special;
            this.transition = DFA147_transition;
        }
        public String getDescription() {
            return "()* loopback of 245:35: ( ( LT !)* ',' ( LT !)* assignmentExpression )*";
        }
    }
    static final String DFA157_eotS =
        "\5\uffff";
    static final String DFA157_eofS =
        "\2\3\2\uffff\1\3";
    static final String DFA157_minS =
        "\1\22\1\17\2\uffff\1\17";
    static final String DFA157_maxS =
        "\1\152\1\153\2\uffff\1\153";
    static final String DFA157_acceptS =
        "\2\uffff\1\1\1\2\1\uffff";
    static final String DFA157_specialS =
        "\5\uffff}>";
    static final String[] DFA157_transitionS = {
            "\1\1\26\uffff\1\3\5\uffff\1\3\6\uffff\2\3\15\uffff\1\2\1\uffff"+
            "\1\3\42\uffff\1\3",
            "\1\3\2\uffff\1\4\2\uffff\2\3\2\uffff\1\3\6\uffff\1\3\7\uffff"+
            "\2\3\2\uffff\2\3\1\uffff\3\3\4\uffff\2\3\15\uffff\1\2\2\3\2"+
            "\uffff\2\3\1\uffff\6\3\1\uffff\3\3\2\uffff\16\3\3\uffff\2\3",
            "",
            "",
            "\1\3\2\uffff\1\4\2\uffff\2\3\2\uffff\1\3\6\uffff\1\3\7\uffff"+
            "\2\3\2\uffff\2\3\1\uffff\3\3\4\uffff\2\3\15\uffff\1\2\2\3\2"+
            "\uffff\2\3\1\uffff\6\3\1\uffff\3\3\2\uffff\16\3\3\uffff\2\3"
    };

    static final short[] DFA157_eot = DFA.unpackEncodedString(DFA157_eotS);
    static final short[] DFA157_eof = DFA.unpackEncodedString(DFA157_eofS);
    static final char[] DFA157_min = DFA.unpackEncodedStringToUnsignedChars(DFA157_minS);
    static final char[] DFA157_max = DFA.unpackEncodedStringToUnsignedChars(DFA157_maxS);
    static final short[] DFA157_accept = DFA.unpackEncodedString(DFA157_acceptS);
    static final short[] DFA157_special = DFA.unpackEncodedString(DFA157_specialS);
    static final short[][] DFA157_transition;

    static {
        int numStates = DFA157_transitionS.length;
        DFA157_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA157_transition[i] = DFA.unpackEncodedString(DFA157_transitionS[i]);
        }
    }

    class DFA157 extends DFA {

        public DFA157(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 157;
            this.eot = DFA157_eot;
            this.eof = DFA157_eof;
            this.min = DFA157_min;
            this.max = DFA157_max;
            this.accept = DFA157_accept;
            this.special = DFA157_special;
            this.transition = DFA157_transition;
        }
        public String getDescription() {
            return "261:24: ( ( LT !)* '?' ( LT !)* assignmentExpression ( LT !)* ':' ( LT !)* assignmentExpression )?";
        }
    }
    static final String DFA162_eotS =
        "\4\uffff";
    static final String DFA162_eofS =
        "\1\3\3\uffff";
    static final String DFA162_minS =
        "\2\22\2\uffff";
    static final String DFA162_maxS =
        "\2\127\2\uffff";
    static final String DFA162_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA162_specialS =
        "\4\uffff}>";
    static final String[] DFA162_transitionS = {
            "\1\1\34\uffff\1\3\6\uffff\2\3\15\uffff\1\2\21\uffff\1\3",
            "\1\1\34\uffff\1\3\6\uffff\2\3\15\uffff\1\2\21\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA162_eot = DFA.unpackEncodedString(DFA162_eotS);
    static final short[] DFA162_eof = DFA.unpackEncodedString(DFA162_eofS);
    static final char[] DFA162_min = DFA.unpackEncodedStringToUnsignedChars(DFA162_minS);
    static final char[] DFA162_max = DFA.unpackEncodedStringToUnsignedChars(DFA162_maxS);
    static final short[] DFA162_accept = DFA.unpackEncodedString(DFA162_acceptS);
    static final short[] DFA162_special = DFA.unpackEncodedString(DFA162_specialS);
    static final short[][] DFA162_transition;

    static {
        int numStates = DFA162_transitionS.length;
        DFA162_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA162_transition[i] = DFA.unpackEncodedString(DFA162_transitionS[i]);
        }
    }

    class DFA162 extends DFA {

        public DFA162(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 162;
            this.eot = DFA162_eot;
            this.eof = DFA162_eof;
            this.min = DFA162_min;
            this.max = DFA162_max;
            this.accept = DFA162_accept;
            this.special = DFA162_special;
            this.transition = DFA162_transition;
        }
        public String getDescription() {
            return "265:28: ( ( LT !)* '?' ( LT !)* assignmentExpressionNoIn ( LT !)* ':' ( LT !)* assignmentExpressionNoIn )?";
        }
    }
    static final String DFA165_eotS =
        "\5\uffff";
    static final String DFA165_eofS =
        "\2\2\2\uffff\1\2";
    static final String DFA165_minS =
        "\1\22\1\17\2\uffff\1\17";
    static final String DFA165_maxS =
        "\1\152\1\153\2\uffff\1\153";
    static final String DFA165_acceptS =
        "\2\uffff\1\2\1\1\1\uffff";
    static final String DFA165_specialS =
        "\5\uffff}>";
    static final String[] DFA165_transitionS = {
            "\1\1\26\uffff\1\2\5\uffff\1\2\6\uffff\2\2\15\uffff\1\2\1\uffff"+
            "\1\2\41\uffff\1\3\1\2",
            "\1\2\2\uffff\1\4\2\uffff\2\2\2\uffff\1\2\6\uffff\1\2\7\uffff"+
            "\2\2\2\uffff\2\2\1\uffff\3\2\4\uffff\2\2\15\uffff\3\2\2\uffff"+
            "\2\2\1\uffff\6\2\1\uffff\3\2\2\uffff\16\2\2\uffff\1\3\2\2",
            "",
            "",
            "\1\2\2\uffff\1\4\2\uffff\2\2\2\uffff\1\2\6\uffff\1\2\7\uffff"+
            "\2\2\2\uffff\2\2\1\uffff\3\2\4\uffff\2\2\15\uffff\3\2\2\uffff"+
            "\2\2\1\uffff\6\2\1\uffff\3\2\2\uffff\16\2\2\uffff\1\3\2\2"
    };

    static final short[] DFA165_eot = DFA.unpackEncodedString(DFA165_eotS);
    static final short[] DFA165_eof = DFA.unpackEncodedString(DFA165_eofS);
    static final char[] DFA165_min = DFA.unpackEncodedStringToUnsignedChars(DFA165_minS);
    static final char[] DFA165_max = DFA.unpackEncodedStringToUnsignedChars(DFA165_maxS);
    static final short[] DFA165_accept = DFA.unpackEncodedString(DFA165_acceptS);
    static final short[] DFA165_special = DFA.unpackEncodedString(DFA165_specialS);
    static final short[][] DFA165_transition;

    static {
        int numStates = DFA165_transitionS.length;
        DFA165_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA165_transition[i] = DFA.unpackEncodedString(DFA165_transitionS[i]);
        }
    }

    class DFA165 extends DFA {

        public DFA165(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 165;
            this.eot = DFA165_eot;
            this.eof = DFA165_eof;
            this.min = DFA165_min;
            this.max = DFA165_max;
            this.accept = DFA165_accept;
            this.special = DFA165_special;
            this.transition = DFA165_transition;
        }
        public String getDescription() {
            return "()* loopback of 269:25: ( ( LT !)* '||' ( LT !)* logicalANDExpression )*";
        }
    }
    static final String DFA168_eotS =
        "\4\uffff";
    static final String DFA168_eofS =
        "\1\2\3\uffff";
    static final String DFA168_minS =
        "\2\22\2\uffff";
    static final String DFA168_maxS =
        "\2\151\2\uffff";
    static final String DFA168_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA168_specialS =
        "\4\uffff}>";
    static final String[] DFA168_transitionS = {
            "\1\1\34\uffff\1\2\6\uffff\2\2\15\uffff\1\2\21\uffff\1\2\21\uffff"+
            "\1\3",
            "\1\1\34\uffff\1\2\6\uffff\2\2\15\uffff\1\2\21\uffff\1\2\21"+
            "\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA168_eot = DFA.unpackEncodedString(DFA168_eotS);
    static final short[] DFA168_eof = DFA.unpackEncodedString(DFA168_eofS);
    static final char[] DFA168_min = DFA.unpackEncodedStringToUnsignedChars(DFA168_minS);
    static final char[] DFA168_max = DFA.unpackEncodedStringToUnsignedChars(DFA168_maxS);
    static final short[] DFA168_accept = DFA.unpackEncodedString(DFA168_acceptS);
    static final short[] DFA168_special = DFA.unpackEncodedString(DFA168_specialS);
    static final short[][] DFA168_transition;

    static {
        int numStates = DFA168_transitionS.length;
        DFA168_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA168_transition[i] = DFA.unpackEncodedString(DFA168_transitionS[i]);
        }
    }

    class DFA168 extends DFA {

        public DFA168(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 168;
            this.eot = DFA168_eot;
            this.eof = DFA168_eof;
            this.min = DFA168_min;
            this.max = DFA168_max;
            this.accept = DFA168_accept;
            this.special = DFA168_special;
            this.transition = DFA168_transition;
        }
        public String getDescription() {
            return "()* loopback of 273:29: ( ( LT !)* '||' ( LT !)* logicalANDExpressionNoIn )*";
        }
    }
    static final String DFA171_eotS =
        "\5\uffff";
    static final String DFA171_eofS =
        "\2\2\2\uffff\1\2";
    static final String DFA171_minS =
        "\1\22\1\17\2\uffff\1\17";
    static final String DFA171_maxS =
        "\1\152\1\153\2\uffff\1\153";
    static final String DFA171_acceptS =
        "\2\uffff\1\2\1\1\1\uffff";
    static final String DFA171_specialS =
        "\5\uffff}>";
    static final String[] DFA171_transitionS = {
            "\1\1\22\uffff\1\3\3\uffff\1\2\5\uffff\1\2\6\uffff\2\2\15\uffff"+
            "\1\2\1\uffff\1\2\41\uffff\2\2",
            "\1\2\2\uffff\1\4\2\uffff\2\2\2\uffff\1\2\6\uffff\1\2\4\uffff"+
            "\1\3\2\uffff\2\2\2\uffff\2\2\1\uffff\3\2\4\uffff\2\2\15\uffff"+
            "\3\2\2\uffff\2\2\1\uffff\6\2\1\uffff\3\2\2\uffff\16\2\2\uffff"+
            "\3\2",
            "",
            "",
            "\1\2\2\uffff\1\4\2\uffff\2\2\2\uffff\1\2\6\uffff\1\2\4\uffff"+
            "\1\3\2\uffff\2\2\2\uffff\2\2\1\uffff\3\2\4\uffff\2\2\15\uffff"+
            "\3\2\2\uffff\2\2\1\uffff\6\2\1\uffff\3\2\2\uffff\16\2\2\uffff"+
            "\3\2"
    };

    static final short[] DFA171_eot = DFA.unpackEncodedString(DFA171_eotS);
    static final short[] DFA171_eof = DFA.unpackEncodedString(DFA171_eofS);
    static final char[] DFA171_min = DFA.unpackEncodedStringToUnsignedChars(DFA171_minS);
    static final char[] DFA171_max = DFA.unpackEncodedStringToUnsignedChars(DFA171_maxS);
    static final short[] DFA171_accept = DFA.unpackEncodedString(DFA171_acceptS);
    static final short[] DFA171_special = DFA.unpackEncodedString(DFA171_specialS);
    static final short[][] DFA171_transition;

    static {
        int numStates = DFA171_transitionS.length;
        DFA171_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA171_transition[i] = DFA.unpackEncodedString(DFA171_transitionS[i]);
        }
    }

    class DFA171 extends DFA {

        public DFA171(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 171;
            this.eot = DFA171_eot;
            this.eof = DFA171_eof;
            this.min = DFA171_min;
            this.max = DFA171_max;
            this.accept = DFA171_accept;
            this.special = DFA171_special;
            this.transition = DFA171_transition;
        }
        public String getDescription() {
            return "()* loopback of 277:24: ( ( LT !)* '&&' ( LT !)* bitwiseORExpression )*";
        }
    }
    static final String DFA174_eotS =
        "\4\uffff";
    static final String DFA174_eofS =
        "\1\2\3\uffff";
    static final String DFA174_minS =
        "\2\22\2\uffff";
    static final String DFA174_maxS =
        "\2\151\2\uffff";
    static final String DFA174_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA174_specialS =
        "\4\uffff}>";
    static final String[] DFA174_transitionS = {
            "\1\1\22\uffff\1\3\11\uffff\1\2\6\uffff\2\2\15\uffff\1\2\21\uffff"+
            "\1\2\21\uffff\1\2",
            "\1\1\22\uffff\1\3\11\uffff\1\2\6\uffff\2\2\15\uffff\1\2\21"+
            "\uffff\1\2\21\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA174_eot = DFA.unpackEncodedString(DFA174_eotS);
    static final short[] DFA174_eof = DFA.unpackEncodedString(DFA174_eofS);
    static final char[] DFA174_min = DFA.unpackEncodedStringToUnsignedChars(DFA174_minS);
    static final char[] DFA174_max = DFA.unpackEncodedStringToUnsignedChars(DFA174_maxS);
    static final short[] DFA174_accept = DFA.unpackEncodedString(DFA174_acceptS);
    static final short[] DFA174_special = DFA.unpackEncodedString(DFA174_specialS);
    static final short[][] DFA174_transition;

    static {
        int numStates = DFA174_transitionS.length;
        DFA174_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA174_transition[i] = DFA.unpackEncodedString(DFA174_transitionS[i]);
        }
    }

    class DFA174 extends DFA {

        public DFA174(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 174;
            this.eot = DFA174_eot;
            this.eof = DFA174_eof;
            this.min = DFA174_min;
            this.max = DFA174_max;
            this.accept = DFA174_accept;
            this.special = DFA174_special;
            this.transition = DFA174_transition;
        }
        public String getDescription() {
            return "()* loopback of 281:28: ( ( LT !)* '&&' ( LT !)* bitwiseORExpressionNoIn )*";
        }
    }
    static final String DFA177_eotS =
        "\5\uffff";
    static final String DFA177_eofS =
        "\2\2\2\uffff\1\2";
    static final String DFA177_minS =
        "\1\22\1\17\2\uffff\1\17";
    static final String DFA177_maxS =
        "\1\152\1\153\2\uffff\1\153";
    static final String DFA177_acceptS =
        "\2\uffff\1\2\1\1\1\uffff";
    static final String DFA177_specialS =
        "\5\uffff}>";
    static final String[] DFA177_transitionS = {
            "\1\1\22\uffff\1\2\3\uffff\1\2\5\uffff\1\2\6\uffff\2\2\15\uffff"+
            "\1\2\1\uffff\1\2\37\uffff\1\3\1\uffff\2\2",
            "\1\2\2\uffff\1\4\2\uffff\2\2\2\uffff\1\2\6\uffff\1\2\4\uffff"+
            "\1\2\2\uffff\2\2\2\uffff\2\2\1\uffff\3\2\4\uffff\2\2\15\uffff"+
            "\3\2\2\uffff\2\2\1\uffff\6\2\1\uffff\3\2\2\uffff\16\2\1\3\1"+
            "\uffff\3\2",
            "",
            "",
            "\1\2\2\uffff\1\4\2\uffff\2\2\2\uffff\1\2\6\uffff\1\2\4\uffff"+
            "\1\2\2\uffff\2\2\2\uffff\2\2\1\uffff\3\2\4\uffff\2\2\15\uffff"+
            "\3\2\2\uffff\2\2\1\uffff\6\2\1\uffff\3\2\2\uffff\16\2\1\3\1"+
            "\uffff\3\2"
    };

    static final short[] DFA177_eot = DFA.unpackEncodedString(DFA177_eotS);
    static final short[] DFA177_eof = DFA.unpackEncodedString(DFA177_eofS);
    static final char[] DFA177_min = DFA.unpackEncodedStringToUnsignedChars(DFA177_minS);
    static final char[] DFA177_max = DFA.unpackEncodedStringToUnsignedChars(DFA177_maxS);
    static final short[] DFA177_accept = DFA.unpackEncodedString(DFA177_acceptS);
    static final short[] DFA177_special = DFA.unpackEncodedString(DFA177_specialS);
    static final short[][] DFA177_transition;

    static {
        int numStates = DFA177_transitionS.length;
        DFA177_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA177_transition[i] = DFA.unpackEncodedString(DFA177_transitionS[i]);
        }
    }

    class DFA177 extends DFA {

        public DFA177(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 177;
            this.eot = DFA177_eot;
            this.eof = DFA177_eof;
            this.min = DFA177_min;
            this.max = DFA177_max;
            this.accept = DFA177_accept;
            this.special = DFA177_special;
            this.transition = DFA177_transition;
        }
        public String getDescription() {
            return "()* loopback of 285:25: ( ( LT !)* '|' ( LT !)* bitwiseXORExpression )*";
        }
    }
    static final String DFA180_eotS =
        "\4\uffff";
    static final String DFA180_eofS =
        "\1\2\3\uffff";
    static final String DFA180_minS =
        "\2\22\2\uffff";
    static final String DFA180_maxS =
        "\2\151\2\uffff";
    static final String DFA180_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA180_specialS =
        "\4\uffff}>";
    static final String[] DFA180_transitionS = {
            "\1\1\22\uffff\1\2\11\uffff\1\2\6\uffff\2\2\15\uffff\1\2\21\uffff"+
            "\1\2\17\uffff\1\3\1\uffff\1\2",
            "\1\1\22\uffff\1\2\11\uffff\1\2\6\uffff\2\2\15\uffff\1\2\21"+
            "\uffff\1\2\17\uffff\1\3\1\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA180_eot = DFA.unpackEncodedString(DFA180_eotS);
    static final short[] DFA180_eof = DFA.unpackEncodedString(DFA180_eofS);
    static final char[] DFA180_min = DFA.unpackEncodedStringToUnsignedChars(DFA180_minS);
    static final char[] DFA180_max = DFA.unpackEncodedStringToUnsignedChars(DFA180_maxS);
    static final short[] DFA180_accept = DFA.unpackEncodedString(DFA180_acceptS);
    static final short[] DFA180_special = DFA.unpackEncodedString(DFA180_specialS);
    static final short[][] DFA180_transition;

    static {
        int numStates = DFA180_transitionS.length;
        DFA180_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA180_transition[i] = DFA.unpackEncodedString(DFA180_transitionS[i]);
        }
    }

    class DFA180 extends DFA {

        public DFA180(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 180;
            this.eot = DFA180_eot;
            this.eof = DFA180_eof;
            this.min = DFA180_min;
            this.max = DFA180_max;
            this.accept = DFA180_accept;
            this.special = DFA180_special;
            this.transition = DFA180_transition;
        }
        public String getDescription() {
            return "()* loopback of 289:29: ( ( LT !)* '|' ( LT !)* bitwiseXORExpressionNoIn )*";
        }
    }
    static final String DFA183_eotS =
        "\5\uffff";
    static final String DFA183_eofS =
        "\2\2\2\uffff\1\2";
    static final String DFA183_minS =
        "\1\22\1\17\2\uffff\1\17";
    static final String DFA183_maxS =
        "\1\152\1\153\2\uffff\1\153";
    static final String DFA183_acceptS =
        "\2\uffff\1\2\1\1\1\uffff";
    static final String DFA183_specialS =
        "\5\uffff}>";
    static final String[] DFA183_transitionS = {
            "\1\1\22\uffff\1\2\3\uffff\1\2\5\uffff\1\2\6\uffff\2\2\15\uffff"+
            "\1\2\1\uffff\1\2\1\3\36\uffff\1\2\1\uffff\2\2",
            "\1\2\2\uffff\1\4\2\uffff\2\2\2\uffff\1\2\6\uffff\1\2\4\uffff"+
            "\1\2\2\uffff\2\2\2\uffff\2\2\1\uffff\3\2\4\uffff\2\2\15\uffff"+
            "\3\2\1\3\1\uffff\2\2\1\uffff\6\2\1\uffff\3\2\2\uffff\17\2\1"+
            "\uffff\3\2",
            "",
            "",
            "\1\2\2\uffff\1\4\2\uffff\2\2\2\uffff\1\2\6\uffff\1\2\4\uffff"+
            "\1\2\2\uffff\2\2\2\uffff\2\2\1\uffff\3\2\4\uffff\2\2\15\uffff"+
            "\3\2\1\3\1\uffff\2\2\1\uffff\6\2\1\uffff\3\2\2\uffff\17\2\1"+
            "\uffff\3\2"
    };

    static final short[] DFA183_eot = DFA.unpackEncodedString(DFA183_eotS);
    static final short[] DFA183_eof = DFA.unpackEncodedString(DFA183_eofS);
    static final char[] DFA183_min = DFA.unpackEncodedStringToUnsignedChars(DFA183_minS);
    static final char[] DFA183_max = DFA.unpackEncodedStringToUnsignedChars(DFA183_maxS);
    static final short[] DFA183_accept = DFA.unpackEncodedString(DFA183_acceptS);
    static final short[] DFA183_special = DFA.unpackEncodedString(DFA183_specialS);
    static final short[][] DFA183_transition;

    static {
        int numStates = DFA183_transitionS.length;
        DFA183_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA183_transition[i] = DFA.unpackEncodedString(DFA183_transitionS[i]);
        }
    }

    class DFA183 extends DFA {

        public DFA183(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 183;
            this.eot = DFA183_eot;
            this.eof = DFA183_eof;
            this.min = DFA183_min;
            this.max = DFA183_max;
            this.accept = DFA183_accept;
            this.special = DFA183_special;
            this.transition = DFA183_transition;
        }
        public String getDescription() {
            return "()* loopback of 293:25: ( ( LT !)* '^' ( LT !)* bitwiseANDExpression )*";
        }
    }
    static final String DFA186_eotS =
        "\4\uffff";
    static final String DFA186_eofS =
        "\1\2\3\uffff";
    static final String DFA186_minS =
        "\2\22\2\uffff";
    static final String DFA186_maxS =
        "\2\151\2\uffff";
    static final String DFA186_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA186_specialS =
        "\4\uffff}>";
    static final String[] DFA186_transitionS = {
            "\1\1\22\uffff\1\2\11\uffff\1\2\6\uffff\2\2\15\uffff\1\2\2\uffff"+
            "\1\3\16\uffff\1\2\17\uffff\1\2\1\uffff\1\2",
            "\1\1\22\uffff\1\2\11\uffff\1\2\6\uffff\2\2\15\uffff\1\2\2\uffff"+
            "\1\3\16\uffff\1\2\17\uffff\1\2\1\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA186_eot = DFA.unpackEncodedString(DFA186_eotS);
    static final short[] DFA186_eof = DFA.unpackEncodedString(DFA186_eofS);
    static final char[] DFA186_min = DFA.unpackEncodedStringToUnsignedChars(DFA186_minS);
    static final char[] DFA186_max = DFA.unpackEncodedStringToUnsignedChars(DFA186_maxS);
    static final short[] DFA186_accept = DFA.unpackEncodedString(DFA186_acceptS);
    static final short[] DFA186_special = DFA.unpackEncodedString(DFA186_specialS);
    static final short[][] DFA186_transition;

    static {
        int numStates = DFA186_transitionS.length;
        DFA186_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA186_transition[i] = DFA.unpackEncodedString(DFA186_transitionS[i]);
        }
    }

    class DFA186 extends DFA {

        public DFA186(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 186;
            this.eot = DFA186_eot;
            this.eof = DFA186_eof;
            this.min = DFA186_min;
            this.max = DFA186_max;
            this.accept = DFA186_accept;
            this.special = DFA186_special;
            this.transition = DFA186_transition;
        }
        public String getDescription() {
            return "()* loopback of 297:29: ( ( LT !)* '^' ( LT !)* bitwiseANDExpressionNoIn )*";
        }
    }
    static final String DFA189_eotS =
        "\5\uffff";
    static final String DFA189_eofS =
        "\2\2\2\uffff\1\2";
    static final String DFA189_minS =
        "\1\22\1\17\2\uffff\1\17";
    static final String DFA189_maxS =
        "\1\152\1\153\2\uffff\1\153";
    static final String DFA189_acceptS =
        "\2\uffff\1\2\1\1\1\uffff";
    static final String DFA189_specialS =
        "\5\uffff}>";
    static final String[] DFA189_transitionS = {
            "\1\1\22\uffff\1\2\1\3\2\uffff\1\2\5\uffff\1\2\6\uffff\2\2\15"+
            "\uffff\1\2\1\uffff\2\2\36\uffff\1\2\1\uffff\2\2",
            "\1\2\2\uffff\1\4\2\uffff\2\2\2\uffff\1\2\6\uffff\1\2\4\uffff"+
            "\1\2\1\3\1\uffff\2\2\2\uffff\2\2\1\uffff\3\2\4\uffff\2\2\15"+
            "\uffff\4\2\1\uffff\2\2\1\uffff\6\2\1\uffff\3\2\2\uffff\17\2"+
            "\1\uffff\3\2",
            "",
            "",
            "\1\2\2\uffff\1\4\2\uffff\2\2\2\uffff\1\2\6\uffff\1\2\4\uffff"+
            "\1\2\1\3\1\uffff\2\2\2\uffff\2\2\1\uffff\3\2\4\uffff\2\2\15"+
            "\uffff\4\2\1\uffff\2\2\1\uffff\6\2\1\uffff\3\2\2\uffff\17\2"+
            "\1\uffff\3\2"
    };

    static final short[] DFA189_eot = DFA.unpackEncodedString(DFA189_eotS);
    static final short[] DFA189_eof = DFA.unpackEncodedString(DFA189_eofS);
    static final char[] DFA189_min = DFA.unpackEncodedStringToUnsignedChars(DFA189_minS);
    static final char[] DFA189_max = DFA.unpackEncodedStringToUnsignedChars(DFA189_maxS);
    static final short[] DFA189_accept = DFA.unpackEncodedString(DFA189_acceptS);
    static final short[] DFA189_special = DFA.unpackEncodedString(DFA189_specialS);
    static final short[][] DFA189_transition;

    static {
        int numStates = DFA189_transitionS.length;
        DFA189_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA189_transition[i] = DFA.unpackEncodedString(DFA189_transitionS[i]);
        }
    }

    class DFA189 extends DFA {

        public DFA189(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 189;
            this.eot = DFA189_eot;
            this.eof = DFA189_eof;
            this.min = DFA189_min;
            this.max = DFA189_max;
            this.accept = DFA189_accept;
            this.special = DFA189_special;
            this.transition = DFA189_transition;
        }
        public String getDescription() {
            return "()* loopback of 301:23: ( ( LT !)* '&' ( LT !)* equalityExpression )*";
        }
    }
    static final String DFA192_eotS =
        "\4\uffff";
    static final String DFA192_eofS =
        "\1\2\3\uffff";
    static final String DFA192_minS =
        "\2\22\2\uffff";
    static final String DFA192_maxS =
        "\2\151\2\uffff";
    static final String DFA192_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA192_specialS =
        "\4\uffff}>";
    static final String[] DFA192_transitionS = {
            "\1\1\22\uffff\1\2\1\3\10\uffff\1\2\6\uffff\2\2\15\uffff\1\2"+
            "\2\uffff\1\2\16\uffff\1\2\17\uffff\1\2\1\uffff\1\2",
            "\1\1\22\uffff\1\2\1\3\10\uffff\1\2\6\uffff\2\2\15\uffff\1\2"+
            "\2\uffff\1\2\16\uffff\1\2\17\uffff\1\2\1\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA192_eot = DFA.unpackEncodedString(DFA192_eotS);
    static final short[] DFA192_eof = DFA.unpackEncodedString(DFA192_eofS);
    static final char[] DFA192_min = DFA.unpackEncodedStringToUnsignedChars(DFA192_minS);
    static final char[] DFA192_max = DFA.unpackEncodedStringToUnsignedChars(DFA192_maxS);
    static final short[] DFA192_accept = DFA.unpackEncodedString(DFA192_acceptS);
    static final short[] DFA192_special = DFA.unpackEncodedString(DFA192_specialS);
    static final short[][] DFA192_transition;

    static {
        int numStates = DFA192_transitionS.length;
        DFA192_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA192_transition[i] = DFA.unpackEncodedString(DFA192_transitionS[i]);
        }
    }

    class DFA192 extends DFA {

        public DFA192(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 192;
            this.eot = DFA192_eot;
            this.eof = DFA192_eof;
            this.min = DFA192_min;
            this.max = DFA192_max;
            this.accept = DFA192_accept;
            this.special = DFA192_special;
            this.transition = DFA192_transition;
        }
        public String getDescription() {
            return "()* loopback of 305:27: ( ( LT !)* '&' ( LT !)* equalityExpressionNoIn )*";
        }
    }
    static final String DFA195_eotS =
        "\5\uffff";
    static final String DFA195_eofS =
        "\2\2\2\uffff\1\2";
    static final String DFA195_minS =
        "\1\22\1\17\2\uffff\1\17";
    static final String DFA195_maxS =
        "\1\152\1\153\2\uffff\1\153";
    static final String DFA195_acceptS =
        "\2\uffff\1\2\1\1\1\uffff";
    static final String DFA195_specialS =
        "\5\uffff}>";
    static final String[] DFA195_transitionS = {
            "\1\1\16\uffff\2\3\2\uffff\2\2\2\uffff\1\2\5\uffff\1\2\6\uffff"+
            "\2\2\5\uffff\2\3\6\uffff\1\2\1\uffff\2\2\36\uffff\1\2\1\uffff"+
            "\2\2",
            "\1\2\2\uffff\1\4\2\uffff\2\2\2\uffff\1\2\6\uffff\1\2\2\3\2"+
            "\uffff\2\2\1\uffff\2\2\2\uffff\2\2\1\uffff\3\2\4\uffff\2\2\5"+
            "\uffff\2\3\6\uffff\4\2\1\uffff\2\2\1\uffff\6\2\1\uffff\3\2\2"+
            "\uffff\17\2\1\uffff\3\2",
            "",
            "",
            "\1\2\2\uffff\1\4\2\uffff\2\2\2\uffff\1\2\6\uffff\1\2\2\3\2"+
            "\uffff\2\2\1\uffff\2\2\2\uffff\2\2\1\uffff\3\2\4\uffff\2\2\5"+
            "\uffff\2\3\6\uffff\4\2\1\uffff\2\2\1\uffff\6\2\1\uffff\3\2\2"+
            "\uffff\17\2\1\uffff\3\2"
    };

    static final short[] DFA195_eot = DFA.unpackEncodedString(DFA195_eotS);
    static final short[] DFA195_eof = DFA.unpackEncodedString(DFA195_eofS);
    static final char[] DFA195_min = DFA.unpackEncodedStringToUnsignedChars(DFA195_minS);
    static final char[] DFA195_max = DFA.unpackEncodedStringToUnsignedChars(DFA195_maxS);
    static final short[] DFA195_accept = DFA.unpackEncodedString(DFA195_acceptS);
    static final short[] DFA195_special = DFA.unpackEncodedString(DFA195_specialS);
    static final short[][] DFA195_transition;

    static {
        int numStates = DFA195_transitionS.length;
        DFA195_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA195_transition[i] = DFA.unpackEncodedString(DFA195_transitionS[i]);
        }
    }

    class DFA195 extends DFA {

        public DFA195(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 195;
            this.eot = DFA195_eot;
            this.eof = DFA195_eof;
            this.min = DFA195_min;
            this.max = DFA195_max;
            this.accept = DFA195_accept;
            this.special = DFA195_special;
            this.transition = DFA195_transition;
        }
        public String getDescription() {
            return "()* loopback of 309:25: ( ( LT !)* ( '==' | '!=' | '===' | '!==' ) ( LT !)* relationalExpression )*";
        }
    }
    static final String DFA198_eotS =
        "\4\uffff";
    static final String DFA198_eofS =
        "\1\2\3\uffff";
    static final String DFA198_minS =
        "\2\22\2\uffff";
    static final String DFA198_maxS =
        "\2\151\2\uffff";
    static final String DFA198_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA198_specialS =
        "\4\uffff}>";
    static final String[] DFA198_transitionS = {
            "\1\1\16\uffff\2\3\2\uffff\2\2\10\uffff\1\2\6\uffff\2\2\5\uffff"+
            "\2\3\6\uffff\1\2\2\uffff\1\2\16\uffff\1\2\17\uffff\1\2\1\uffff"+
            "\1\2",
            "\1\1\16\uffff\2\3\2\uffff\2\2\10\uffff\1\2\6\uffff\2\2\5\uffff"+
            "\2\3\6\uffff\1\2\2\uffff\1\2\16\uffff\1\2\17\uffff\1\2\1\uffff"+
            "\1\2",
            "",
            ""
    };

    static final short[] DFA198_eot = DFA.unpackEncodedString(DFA198_eotS);
    static final short[] DFA198_eof = DFA.unpackEncodedString(DFA198_eofS);
    static final char[] DFA198_min = DFA.unpackEncodedStringToUnsignedChars(DFA198_minS);
    static final char[] DFA198_max = DFA.unpackEncodedStringToUnsignedChars(DFA198_maxS);
    static final short[] DFA198_accept = DFA.unpackEncodedString(DFA198_acceptS);
    static final short[] DFA198_special = DFA.unpackEncodedString(DFA198_specialS);
    static final short[][] DFA198_transition;

    static {
        int numStates = DFA198_transitionS.length;
        DFA198_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA198_transition[i] = DFA.unpackEncodedString(DFA198_transitionS[i]);
        }
    }

    class DFA198 extends DFA {

        public DFA198(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 198;
            this.eot = DFA198_eot;
            this.eof = DFA198_eof;
            this.min = DFA198_min;
            this.max = DFA198_max;
            this.accept = DFA198_accept;
            this.special = DFA198_special;
            this.transition = DFA198_transition;
        }
        public String getDescription() {
            return "()* loopback of 313:29: ( ( LT !)* ( '==' | '!=' | '===' | '!==' ) ( LT !)* relationalExpressionNoIn )*";
        }
    }
    static final String DFA201_eotS =
        "\5\uffff";
    static final String DFA201_eofS =
        "\2\2\2\uffff\1\2";
    static final String DFA201_minS =
        "\1\22\1\17\2\uffff\1\17";
    static final String DFA201_maxS =
        "\1\152\1\153\2\uffff\1\153";
    static final String DFA201_acceptS =
        "\2\uffff\1\2\1\1\1\uffff";
    static final String DFA201_specialS =
        "\5\uffff}>";
    static final String[] DFA201_transitionS = {
            "\1\1\16\uffff\2\2\2\uffff\2\2\2\uffff\1\2\5\uffff\1\2\6\uffff"+
            "\2\2\1\3\2\uffff\1\3\1\uffff\2\2\2\3\4\uffff\1\2\1\uffff\2\2"+
            "\16\uffff\2\3\16\uffff\1\2\1\uffff\2\2",
            "\1\2\2\uffff\1\4\2\uffff\2\2\2\uffff\1\2\6\uffff\3\2\2\uffff"+
            "\2\2\1\uffff\2\2\2\uffff\2\2\1\uffff\3\2\4\uffff\2\2\1\3\2\uffff"+
            "\1\3\1\uffff\2\2\2\3\4\uffff\4\2\1\uffff\2\2\1\uffff\6\2\1\uffff"+
            "\3\2\2\3\17\2\1\uffff\3\2",
            "",
            "",
            "\1\2\2\uffff\1\4\2\uffff\2\2\2\uffff\1\2\6\uffff\3\2\2\uffff"+
            "\2\2\1\uffff\2\2\2\uffff\2\2\1\uffff\3\2\4\uffff\2\2\1\3\2\uffff"+
            "\1\3\1\uffff\2\2\2\3\4\uffff\4\2\1\uffff\2\2\1\uffff\6\2\1\uffff"+
            "\3\2\2\3\17\2\1\uffff\3\2"
    };

    static final short[] DFA201_eot = DFA.unpackEncodedString(DFA201_eotS);
    static final short[] DFA201_eof = DFA.unpackEncodedString(DFA201_eofS);
    static final char[] DFA201_min = DFA.unpackEncodedStringToUnsignedChars(DFA201_minS);
    static final char[] DFA201_max = DFA.unpackEncodedStringToUnsignedChars(DFA201_maxS);
    static final short[] DFA201_accept = DFA.unpackEncodedString(DFA201_acceptS);
    static final short[] DFA201_special = DFA.unpackEncodedString(DFA201_specialS);
    static final short[][] DFA201_transition;

    static {
        int numStates = DFA201_transitionS.length;
        DFA201_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA201_transition[i] = DFA.unpackEncodedString(DFA201_transitionS[i]);
        }
    }

    class DFA201 extends DFA {

        public DFA201(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 201;
            this.eot = DFA201_eot;
            this.eof = DFA201_eof;
            this.min = DFA201_min;
            this.max = DFA201_max;
            this.accept = DFA201_accept;
            this.special = DFA201_special;
            this.transition = DFA201_transition;
        }
        public String getDescription() {
            return "()* loopback of 317:20: ( ( LT !)* ( '<' | '>' | '<=' | '>=' | 'instanceof' | 'in' ) ( LT !)* shiftExpression )*";
        }
    }
    static final String DFA204_eotS =
        "\4\uffff";
    static final String DFA204_eofS =
        "\1\2\3\uffff";
    static final String DFA204_minS =
        "\2\22\2\uffff";
    static final String DFA204_maxS =
        "\2\151\2\uffff";
    static final String DFA204_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA204_specialS =
        "\4\uffff}>";
    static final String[] DFA204_transitionS = {
            "\1\1\16\uffff\2\2\2\uffff\2\2\10\uffff\1\2\6\uffff\2\2\1\3\2"+
            "\uffff\1\3\1\uffff\2\2\2\3\4\uffff\1\2\2\uffff\1\2\16\uffff"+
            "\1\2\1\3\16\uffff\1\2\1\uffff\1\2",
            "\1\1\16\uffff\2\2\2\uffff\2\2\10\uffff\1\2\6\uffff\2\2\1\3"+
            "\2\uffff\1\3\1\uffff\2\2\2\3\4\uffff\1\2\2\uffff\1\2\16\uffff"+
            "\1\2\1\3\16\uffff\1\2\1\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA204_eot = DFA.unpackEncodedString(DFA204_eotS);
    static final short[] DFA204_eof = DFA.unpackEncodedString(DFA204_eofS);
    static final char[] DFA204_min = DFA.unpackEncodedStringToUnsignedChars(DFA204_minS);
    static final char[] DFA204_max = DFA.unpackEncodedStringToUnsignedChars(DFA204_maxS);
    static final short[] DFA204_accept = DFA.unpackEncodedString(DFA204_acceptS);
    static final short[] DFA204_special = DFA.unpackEncodedString(DFA204_specialS);
    static final short[][] DFA204_transition;

    static {
        int numStates = DFA204_transitionS.length;
        DFA204_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA204_transition[i] = DFA.unpackEncodedString(DFA204_transitionS[i]);
        }
    }

    class DFA204 extends DFA {

        public DFA204(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 204;
            this.eot = DFA204_eot;
            this.eof = DFA204_eof;
            this.min = DFA204_min;
            this.max = DFA204_max;
            this.accept = DFA204_accept;
            this.special = DFA204_special;
            this.transition = DFA204_transition;
        }
        public String getDescription() {
            return "()* loopback of 321:20: ( ( LT !)* ( '<' | '>' | '<=' | '>=' | 'instanceof' ) ( LT !)* shiftExpression )*";
        }
    }
    static final String DFA207_eotS =
        "\5\uffff";
    static final String DFA207_eofS =
        "\2\2\2\uffff\1\2";
    static final String DFA207_minS =
        "\1\22\1\17\2\uffff\1\17";
    static final String DFA207_maxS =
        "\1\152\1\153\2\uffff\1\153";
    static final String DFA207_acceptS =
        "\2\uffff\1\2\1\1\1\uffff";
    static final String DFA207_specialS =
        "\5\uffff}>";
    static final String[] DFA207_transitionS = {
            "\1\1\16\uffff\2\2\2\uffff\2\2\2\uffff\1\2\5\uffff\1\2\6\uffff"+
            "\3\2\1\3\1\uffff\1\2\1\uffff\4\2\1\3\1\uffff\1\3\1\uffff\1\2"+
            "\1\uffff\2\2\16\uffff\2\2\16\uffff\1\2\1\uffff\2\2",
            "\1\2\2\uffff\1\4\2\uffff\2\2\2\uffff\1\2\6\uffff\3\2\2\uffff"+
            "\2\2\1\uffff\2\2\2\uffff\2\2\1\uffff\3\2\4\uffff\3\2\1\3\1\uffff"+
            "\1\2\1\uffff\4\2\1\3\1\uffff\1\3\1\uffff\4\2\1\uffff\2\2\1\uffff"+
            "\6\2\1\uffff\24\2\1\uffff\3\2",
            "",
            "",
            "\1\2\2\uffff\1\4\2\uffff\2\2\2\uffff\1\2\6\uffff\3\2\2\uffff"+
            "\2\2\1\uffff\2\2\2\uffff\2\2\1\uffff\3\2\4\uffff\3\2\1\3\1\uffff"+
            "\1\2\1\uffff\4\2\1\3\1\uffff\1\3\1\uffff\4\2\1\uffff\2\2\1\uffff"+
            "\6\2\1\uffff\24\2\1\uffff\3\2"
    };

    static final short[] DFA207_eot = DFA.unpackEncodedString(DFA207_eotS);
    static final short[] DFA207_eof = DFA.unpackEncodedString(DFA207_eofS);
    static final char[] DFA207_min = DFA.unpackEncodedStringToUnsignedChars(DFA207_minS);
    static final char[] DFA207_max = DFA.unpackEncodedStringToUnsignedChars(DFA207_maxS);
    static final short[] DFA207_accept = DFA.unpackEncodedString(DFA207_acceptS);
    static final short[] DFA207_special = DFA.unpackEncodedString(DFA207_specialS);
    static final short[][] DFA207_transition;

    static {
        int numStates = DFA207_transitionS.length;
        DFA207_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA207_transition[i] = DFA.unpackEncodedString(DFA207_transitionS[i]);
        }
    }

    class DFA207 extends DFA {

        public DFA207(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 207;
            this.eot = DFA207_eot;
            this.eof = DFA207_eof;
            this.min = DFA207_min;
            this.max = DFA207_max;
            this.accept = DFA207_accept;
            this.special = DFA207_special;
            this.transition = DFA207_transition;
        }
        public String getDescription() {
            return "()* loopback of 325:23: ( ( LT !)* ( '<<' | '>>' | '>>>' ) ( LT !)* additiveExpression )*";
        }
    }
    static final String DFA213_eotS =
        "\5\uffff";
    static final String DFA213_eofS =
        "\2\2\2\uffff\1\2";
    static final String DFA213_minS =
        "\1\22\1\17\2\uffff\1\17";
    static final String DFA213_maxS =
        "\1\152\1\153\2\uffff\1\153";
    static final String DFA213_acceptS =
        "\2\uffff\1\2\1\1\1\uffff";
    static final String DFA213_specialS =
        "\5\uffff}>";
    static final String[] DFA213_transitionS = {
            "\1\1\16\uffff\2\2\1\3\1\uffff\2\2\2\uffff\1\2\1\3\1\uffff\1"+
            "\2\2\uffff\2\2\3\uffff\1\3\1\uffff\4\2\1\uffff\1\2\1\uffff\5"+
            "\2\1\uffff\1\2\1\uffff\1\2\1\uffff\2\2\16\uffff\2\2\16\uffff"+
            "\1\2\1\uffff\2\2",
            "\1\2\2\uffff\1\4\2\uffff\2\2\2\uffff\1\2\6\uffff\3\2\1\3\1"+
            "\uffff\2\2\1\uffff\2\2\1\3\1\uffff\2\2\1\uffff\3\2\2\uffff\1"+
            "\3\1\uffff\4\2\1\uffff\1\2\1\uffff\5\2\1\uffff\1\2\1\uffff\4"+
            "\2\1\uffff\2\2\1\uffff\6\2\1\uffff\24\2\1\uffff\3\2",
            "",
            "",
            "\1\2\2\uffff\1\4\2\uffff\2\2\2\uffff\1\2\6\uffff\3\2\1\3\1"+
            "\uffff\2\2\1\uffff\2\2\1\3\1\uffff\2\2\1\uffff\3\2\2\uffff\1"+
            "\3\1\uffff\4\2\1\uffff\1\2\1\uffff\5\2\1\uffff\1\2\1\uffff\4"+
            "\2\1\uffff\2\2\1\uffff\6\2\1\uffff\24\2\1\uffff\3\2"
    };

    static final short[] DFA213_eot = DFA.unpackEncodedString(DFA213_eotS);
    static final short[] DFA213_eof = DFA.unpackEncodedString(DFA213_eofS);
    static final char[] DFA213_min = DFA.unpackEncodedStringToUnsignedChars(DFA213_minS);
    static final char[] DFA213_max = DFA.unpackEncodedStringToUnsignedChars(DFA213_maxS);
    static final short[] DFA213_accept = DFA.unpackEncodedString(DFA213_acceptS);
    static final short[] DFA213_special = DFA.unpackEncodedString(DFA213_specialS);
    static final short[][] DFA213_transition;

    static {
        int numStates = DFA213_transitionS.length;
        DFA213_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA213_transition[i] = DFA.unpackEncodedString(DFA213_transitionS[i]);
        }
    }

    class DFA213 extends DFA {

        public DFA213(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 213;
            this.eot = DFA213_eot;
            this.eof = DFA213_eof;
            this.min = DFA213_min;
            this.max = DFA213_max;
            this.accept = DFA213_accept;
            this.special = DFA213_special;
            this.transition = DFA213_transition;
        }
        public String getDescription() {
            return "()* loopback of 333:20: ( ( LT !)* ( '*' | '/' | '%' ) ( LT !)* unaryExpression )*";
        }
    }
    static final String DFA224_eotS =
        "\4\uffff";
    static final String DFA224_eofS =
        "\4\uffff";
    static final String DFA224_minS =
        "\2\22\2\uffff";
    static final String DFA224_maxS =
        "\2\107\2\uffff";
    static final String DFA224_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA224_specialS =
        "\4\uffff}>";
    static final String[] DFA224_transitionS = {
            "\1\1\34\uffff\1\3\27\uffff\1\2",
            "\1\1\34\uffff\1\3\27\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA224_eot = DFA.unpackEncodedString(DFA224_eotS);
    static final short[] DFA224_eof = DFA.unpackEncodedString(DFA224_eofS);
    static final char[] DFA224_min = DFA.unpackEncodedStringToUnsignedChars(DFA224_minS);
    static final char[] DFA224_max = DFA.unpackEncodedStringToUnsignedChars(DFA224_maxS);
    static final short[] DFA224_accept = DFA.unpackEncodedString(DFA224_acceptS);
    static final short[] DFA224_special = DFA.unpackEncodedString(DFA224_specialS);
    static final short[][] DFA224_transition;

    static {
        int numStates = DFA224_transitionS.length;
        DFA224_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA224_transition[i] = DFA.unpackEncodedString(DFA224_transitionS[i]);
        }
    }

    class DFA224 extends DFA {

        public DFA224(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 224;
            this.eot = DFA224_eot;
            this.eof = DFA224_eof;
            this.min = DFA224_min;
            this.max = DFA224_max;
            this.accept = DFA224_accept;
            this.special = DFA224_special;
            this.transition = DFA224_transition;
        }
        public String getDescription() {
            return "()* loopback of 356:35: ( ( LT !)* ',' ( ( LT !)* assignmentExpression )? )*";
        }
    }
    static final String DFA223_eotS =
        "\4\uffff";
    static final String DFA223_eofS =
        "\4\uffff";
    static final String DFA223_minS =
        "\2\17\2\uffff";
    static final String DFA223_maxS =
        "\2\153\2\uffff";
    static final String DFA223_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA223_specialS =
        "\4\uffff}>";
    static final String[] DFA223_transitionS = {
            "\1\2\2\uffff\1\1\2\uffff\2\2\2\uffff\1\2\6\uffff\1\2\7\uffff"+
            "\1\2\3\uffff\2\2\1\uffff\1\3\2\2\24\uffff\1\2\1\3\7\uffff\1"+
            "\2\2\uffff\1\2\2\uffff\1\2\3\uffff\2\2\2\uffff\1\2\1\uffff\1"+
            "\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2\4\uffff\1\2",
            "\1\2\2\uffff\1\1\2\uffff\2\2\2\uffff\1\2\6\uffff\1\2\7\uffff"+
            "\1\2\3\uffff\2\2\1\uffff\1\3\2\2\24\uffff\1\2\1\3\7\uffff\1"+
            "\2\2\uffff\1\2\2\uffff\1\2\3\uffff\2\2\2\uffff\1\2\1\uffff\1"+
            "\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2\4\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA223_eot = DFA.unpackEncodedString(DFA223_eotS);
    static final short[] DFA223_eof = DFA.unpackEncodedString(DFA223_eofS);
    static final char[] DFA223_min = DFA.unpackEncodedStringToUnsignedChars(DFA223_minS);
    static final char[] DFA223_max = DFA.unpackEncodedStringToUnsignedChars(DFA223_maxS);
    static final short[] DFA223_accept = DFA.unpackEncodedString(DFA223_acceptS);
    static final short[] DFA223_special = DFA.unpackEncodedString(DFA223_specialS);
    static final short[][] DFA223_transition;

    static {
        int numStates = DFA223_transitionS.length;
        DFA223_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA223_transition[i] = DFA.unpackEncodedString(DFA223_transitionS[i]);
        }
    }

    class DFA223 extends DFA {

        public DFA223(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 223;
            this.eot = DFA223_eot;
            this.eof = DFA223_eof;
            this.min = DFA223_min;
            this.max = DFA223_max;
            this.accept = DFA223_accept;
            this.special = DFA223_special;
            this.transition = DFA223_transition;
        }
        public String getDescription() {
            return "356:45: ( ( LT !)* assignmentExpression )?";
        }
    }
    static final String DFA232_eotS =
        "\5\uffff";
    static final String DFA232_eofS =
        "\5\uffff";
    static final String DFA232_minS =
        "\1\146\2\17\2\uffff";
    static final String DFA232_maxS =
        "\1\146\2\152\2\uffff";
    static final String DFA232_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA232_specialS =
        "\5\uffff}>";
    static final String[] DFA232_transitionS = {
            "\1\1",
            "\1\4\2\uffff\1\2\2\uffff\1\4\3\uffff\1\4\120\uffff\1\3",
            "\1\4\2\uffff\1\2\2\uffff\1\4\3\uffff\1\4\120\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA232_eot = DFA.unpackEncodedString(DFA232_eotS);
    static final short[] DFA232_eof = DFA.unpackEncodedString(DFA232_eofS);
    static final char[] DFA232_min = DFA.unpackEncodedStringToUnsignedChars(DFA232_minS);
    static final char[] DFA232_max = DFA.unpackEncodedStringToUnsignedChars(DFA232_maxS);
    static final short[] DFA232_accept = DFA.unpackEncodedString(DFA232_acceptS);
    static final short[] DFA232_special = DFA.unpackEncodedString(DFA232_specialS);
    static final short[][] DFA232_transition;

    static {
        int numStates = DFA232_transitionS.length;
        DFA232_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA232_transition[i] = DFA.unpackEncodedString(DFA232_transitionS[i]);
        }
    }

    class DFA232 extends DFA {

        public DFA232(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 232;
            this.eot = DFA232_eot;
            this.eof = DFA232_eof;
            this.min = DFA232_min;
            this.max = DFA232_max;
            this.accept = DFA232_accept;
            this.special = DFA232_special;
            this.transition = DFA232_transition;
        }
        public String getDescription() {
            return "360:1: objectLiteral : ( '{' ( LT !)* '}' | '{' ( LT !)* propertyNameAndValue ( ( LT !)* ',' ( LT !)* propertyNameAndValue )* ( LT !)* '}' );";
        }
    }
    static final String DFA230_eotS =
        "\4\uffff";
    static final String DFA230_eofS =
        "\4\uffff";
    static final String DFA230_minS =
        "\2\22\2\uffff";
    static final String DFA230_maxS =
        "\2\152\2\uffff";
    static final String DFA230_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA230_specialS =
        "\4\uffff}>";
    static final String[] DFA230_transitionS = {
            "\1\1\34\uffff\1\3\72\uffff\1\2",
            "\1\1\34\uffff\1\3\72\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA230_eot = DFA.unpackEncodedString(DFA230_eotS);
    static final short[] DFA230_eof = DFA.unpackEncodedString(DFA230_eofS);
    static final char[] DFA230_min = DFA.unpackEncodedStringToUnsignedChars(DFA230_minS);
    static final char[] DFA230_max = DFA.unpackEncodedStringToUnsignedChars(DFA230_maxS);
    static final short[] DFA230_accept = DFA.unpackEncodedString(DFA230_acceptS);
    static final short[] DFA230_special = DFA.unpackEncodedString(DFA230_specialS);
    static final short[][] DFA230_transition;

    static {
        int numStates = DFA230_transitionS.length;
        DFA230_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA230_transition[i] = DFA.unpackEncodedString(DFA230_transitionS[i]);
        }
    }

    class DFA230 extends DFA {

        public DFA230(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 230;
            this.eot = DFA230_eot;
            this.eof = DFA230_eof;
            this.min = DFA230_min;
            this.max = DFA230_max;
            this.accept = DFA230_accept;
            this.special = DFA230_special;
            this.transition = DFA230_transition;
        }
        public String getDescription() {
            return "()* loopback of 362:34: ( ( LT !)* ',' ( LT !)* propertyNameAndValue )*";
        }
    }
 

    public static final BitSet FOLLOW_LT_in_program37 = new BitSet(new long[]{0x0083310102648000L,0x0000087FFE75A440L});
    public static final BitSet FOLLOW_sourceElements_in_program41 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_LT_in_program43 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EOF_in_program47 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sourceElement_in_sourceElements60 = new BitSet(new long[]{0x0083310102648002L,0x0000087FFE75A440L});
    public static final BitSet FOLLOW_LT_in_sourceElements63 = new BitSet(new long[]{0x0083310102648000L,0x0000087FFE75A440L});
    public static final BitSet FOLLOW_sourceElement_in_sourceElements67 = new BitSet(new long[]{0x0083310102648002L,0x0000087FFE75A440L});
    public static final BitSet FOLLOW_functionDeclaration_in_sourceElement81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_sourceElement86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_functionDeclaration99 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_LT_in_functionDeclaration101 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_Identifier_in_functionDeclaration105 = new BitSet(new long[]{0x0000010000040000L});
    public static final BitSet FOLLOW_LT_in_functionDeclaration107 = new BitSet(new long[]{0x0000010000040000L});
    public static final BitSet FOLLOW_formalParameterList_in_functionDeclaration111 = new BitSet(new long[]{0x0000000000040000L,0x0000004000000000L});
    public static final BitSet FOLLOW_LT_in_functionDeclaration113 = new BitSet(new long[]{0x0000000000040000L,0x0000004000000000L});
    public static final BitSet FOLLOW_functionBody_in_functionDeclaration117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_functionExpression129 = new BitSet(new long[]{0x0000010000048000L});
    public static final BitSet FOLLOW_LT_in_functionExpression131 = new BitSet(new long[]{0x0000010000048000L});
    public static final BitSet FOLLOW_Identifier_in_functionExpression135 = new BitSet(new long[]{0x0000010000040000L});
    public static final BitSet FOLLOW_LT_in_functionExpression138 = new BitSet(new long[]{0x0000010000040000L});
    public static final BitSet FOLLOW_formalParameterList_in_functionExpression142 = new BitSet(new long[]{0x0000000000040000L,0x0000004000000000L});
    public static final BitSet FOLLOW_LT_in_functionExpression144 = new BitSet(new long[]{0x0000000000040000L,0x0000004000000000L});
    public static final BitSet FOLLOW_functionBody_in_functionExpression148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_formalParameterList160 = new BitSet(new long[]{0x0000020000048000L});
    public static final BitSet FOLLOW_LT_in_formalParameterList163 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_Identifier_in_formalParameterList167 = new BitSet(new long[]{0x0000820000040000L});
    public static final BitSet FOLLOW_LT_in_formalParameterList170 = new BitSet(new long[]{0x0000800000040000L});
    public static final BitSet FOLLOW_47_in_formalParameterList174 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_LT_in_formalParameterList176 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_Identifier_in_formalParameterList180 = new BitSet(new long[]{0x0000820000040000L});
    public static final BitSet FOLLOW_LT_in_formalParameterList186 = new BitSet(new long[]{0x0000020000040000L});
    public static final BitSet FOLLOW_41_in_formalParameterList190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_functionBody201 = new BitSet(new long[]{0x0083310102648000L,0x0000087FFE75A440L});
    public static final BitSet FOLLOW_LT_in_functionBody203 = new BitSet(new long[]{0x0083310102648000L,0x0000087FFE75A440L});
    public static final BitSet FOLLOW_sourceElements_in_functionBody207 = new BitSet(new long[]{0x0000000000040000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LT_in_functionBody209 = new BitSet(new long[]{0x0000000000040000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_functionBody213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementBlock_in_statement225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableStatement_in_statement230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStatement_in_statement235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStatement_in_statement240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterationStatement_in_statement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueStatement_in_statement255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakStatement_in_statement260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatement_in_statement265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withStatement_in_statement270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelledStatement_in_statement275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStatement_in_statement280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throwStatement_in_statement285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryStatement_in_statement290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_statementBlock302 = new BitSet(new long[]{0x0083310102648000L,0x00000C7FFE75A440L});
    public static final BitSet FOLLOW_LT_in_statementBlock304 = new BitSet(new long[]{0x0083310102648000L,0x00000C7FFE75A440L});
    public static final BitSet FOLLOW_statementList_in_statementBlock308 = new BitSet(new long[]{0x0000000000040000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LT_in_statementBlock311 = new BitSet(new long[]{0x0000000000040000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_statementBlock315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementList327 = new BitSet(new long[]{0x0083310102648002L,0x0000087FFE75A440L});
    public static final BitSet FOLLOW_LT_in_statementList330 = new BitSet(new long[]{0x0083310102648000L,0x0000087FFE75A440L});
    public static final BitSet FOLLOW_statement_in_statementList334 = new BitSet(new long[]{0x0083310102648002L,0x0000087FFE75A440L});
    public static final BitSet FOLLOW_98_in_variableStatement348 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_LT_in_variableStatement350 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_variableDeclarationList_in_variableStatement354 = new BitSet(new long[]{0x0080000000040000L});
    public static final BitSet FOLLOW_LT_in_variableStatement357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_variableStatement362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationList375 = new BitSet(new long[]{0x0000800000040002L});
    public static final BitSet FOLLOW_LT_in_variableDeclarationList378 = new BitSet(new long[]{0x0000800000040000L});
    public static final BitSet FOLLOW_47_in_variableDeclarationList382 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_LT_in_variableDeclarationList384 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationList388 = new BitSet(new long[]{0x0000800000040002L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_variableDeclarationListNoIn402 = new BitSet(new long[]{0x0000800000040002L});
    public static final BitSet FOLLOW_LT_in_variableDeclarationListNoIn405 = new BitSet(new long[]{0x0000800000040000L});
    public static final BitSet FOLLOW_47_in_variableDeclarationListNoIn409 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_LT_in_variableDeclarationListNoIn411 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_variableDeclarationListNoIn415 = new BitSet(new long[]{0x0000800000040002L});
    public static final BitSet FOLLOW_Identifier_in_variableDeclaration429 = new BitSet(new long[]{0x1000000000040002L});
    public static final BitSet FOLLOW_LT_in_variableDeclaration431 = new BitSet(new long[]{0x1000000000040002L});
    public static final BitSet FOLLOW_initialiser_in_variableDeclaration435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_variableDeclarationNoIn448 = new BitSet(new long[]{0x1000000000040002L});
    public static final BitSet FOLLOW_LT_in_variableDeclarationNoIn450 = new BitSet(new long[]{0x1000000000040002L});
    public static final BitSet FOLLOW_initialiserNoIn_in_variableDeclarationNoIn454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_initialiser467 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_initialiser469 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_assignmentExpression_in_initialiser473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_initialiserNoIn485 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_initialiserNoIn487 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_initialiserNoIn491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_emptyStatement503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionStatement515 = new BitSet(new long[]{0x0080000000040000L});
    public static final BitSet FOLLOW_LT_in_expressionStatement518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_expressionStatement523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ifStatement536 = new BitSet(new long[]{0x0000010000040000L});
    public static final BitSet FOLLOW_LT_in_ifStatement538 = new BitSet(new long[]{0x0000010000040000L});
    public static final BitSet FOLLOW_40_in_ifStatement542 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_ifStatement544 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_expression_in_ifStatement548 = new BitSet(new long[]{0x0000020000040000L});
    public static final BitSet FOLLOW_LT_in_ifStatement550 = new BitSet(new long[]{0x0000020000040000L});
    public static final BitSet FOLLOW_41_in_ifStatement554 = new BitSet(new long[]{0x0083310102648000L,0x0000087FFE75A440L});
    public static final BitSet FOLLOW_LT_in_ifStatement556 = new BitSet(new long[]{0x0083310102648000L,0x0000087FFE75A440L});
    public static final BitSet FOLLOW_statement_in_ifStatement560 = new BitSet(new long[]{0x0000000000040002L,0x0000000000020000L});
    public static final BitSet FOLLOW_LT_in_ifStatement563 = new BitSet(new long[]{0x0000000000040000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_ifStatement567 = new BitSet(new long[]{0x0083310102648000L,0x0000087FFE75A440L});
    public static final BitSet FOLLOW_LT_in_ifStatement569 = new BitSet(new long[]{0x0083310102648000L,0x0000087FFE75A440L});
    public static final BitSet FOLLOW_statement_in_ifStatement573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doWhileStatement_in_iterationStatement587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_iterationStatement592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_iterationStatement597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forInStatement_in_iterationStatement602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_doWhileStatement614 = new BitSet(new long[]{0x0083310102648000L,0x0000087FFE75A440L});
    public static final BitSet FOLLOW_LT_in_doWhileStatement616 = new BitSet(new long[]{0x0083310102648000L,0x0000087FFE75A440L});
    public static final BitSet FOLLOW_statement_in_doWhileStatement620 = new BitSet(new long[]{0x0000000000040000L,0x0000001000000000L});
    public static final BitSet FOLLOW_LT_in_doWhileStatement622 = new BitSet(new long[]{0x0000000000040000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_doWhileStatement626 = new BitSet(new long[]{0x0000010000040000L});
    public static final BitSet FOLLOW_LT_in_doWhileStatement628 = new BitSet(new long[]{0x0000010000040000L});
    public static final BitSet FOLLOW_40_in_doWhileStatement632 = new BitSet(new long[]{0x0003310102608000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_expression_in_doWhileStatement634 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_doWhileStatement636 = new BitSet(new long[]{0x0080000000040000L});
    public static final BitSet FOLLOW_LT_in_doWhileStatement639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_doWhileStatement644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_whileStatement657 = new BitSet(new long[]{0x0000010000040000L});
    public static final BitSet FOLLOW_LT_in_whileStatement659 = new BitSet(new long[]{0x0000010000040000L});
    public static final BitSet FOLLOW_40_in_whileStatement663 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_whileStatement665 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_expression_in_whileStatement669 = new BitSet(new long[]{0x0000020000040000L});
    public static final BitSet FOLLOW_LT_in_whileStatement671 = new BitSet(new long[]{0x0000020000040000L});
    public static final BitSet FOLLOW_41_in_whileStatement675 = new BitSet(new long[]{0x0083310102648000L,0x0000087FFE75A440L});
    public static final BitSet FOLLOW_LT_in_whileStatement677 = new BitSet(new long[]{0x0083310102648000L,0x0000087FFE75A440L});
    public static final BitSet FOLLOW_statement_in_whileStatement681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_forStatement693 = new BitSet(new long[]{0x0000010000040000L});
    public static final BitSet FOLLOW_LT_in_forStatement695 = new BitSet(new long[]{0x0000010000040000L});
    public static final BitSet FOLLOW_40_in_forStatement699 = new BitSet(new long[]{0x0083310102648000L,0x0000084EA6248040L});
    public static final BitSet FOLLOW_LT_in_forStatement702 = new BitSet(new long[]{0x0003310102648000L,0x0000084EA6248040L});
    public static final BitSet FOLLOW_forStatementInitialiserPart_in_forStatement706 = new BitSet(new long[]{0x0080000000040000L});
    public static final BitSet FOLLOW_LT_in_forStatement710 = new BitSet(new long[]{0x0080000000040000L});
    public static final BitSet FOLLOW_55_in_forStatement714 = new BitSet(new long[]{0x0083310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_forStatement717 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_expression_in_forStatement721 = new BitSet(new long[]{0x0080000000040000L});
    public static final BitSet FOLLOW_LT_in_forStatement725 = new BitSet(new long[]{0x0080000000040000L});
    public static final BitSet FOLLOW_55_in_forStatement729 = new BitSet(new long[]{0x0003330102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_forStatement732 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_expression_in_forStatement736 = new BitSet(new long[]{0x0000020000040000L});
    public static final BitSet FOLLOW_LT_in_forStatement740 = new BitSet(new long[]{0x0000020000040000L});
    public static final BitSet FOLLOW_41_in_forStatement744 = new BitSet(new long[]{0x0083310102648000L,0x0000087FFE75A440L});
    public static final BitSet FOLLOW_LT_in_forStatement746 = new BitSet(new long[]{0x0083310102648000L,0x0000087FFE75A440L});
    public static final BitSet FOLLOW_statement_in_forStatement750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoIn_in_forStatementInitialiserPart762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_forStatementInitialiserPart767 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_LT_in_forStatementInitialiserPart769 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_variableDeclarationListNoIn_in_forStatementInitialiserPart773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_forInStatement785 = new BitSet(new long[]{0x0000010000040000L});
    public static final BitSet FOLLOW_LT_in_forInStatement787 = new BitSet(new long[]{0x0000010000040000L});
    public static final BitSet FOLLOW_40_in_forInStatement791 = new BitSet(new long[]{0x0000010002648000L,0x00000044A6240040L});
    public static final BitSet FOLLOW_LT_in_forInStatement793 = new BitSet(new long[]{0x0000010002648000L,0x00000044A6240040L});
    public static final BitSet FOLLOW_forInStatementInitialiserPart_in_forInStatement797 = new BitSet(new long[]{0x0000000000040000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LT_in_forInStatement799 = new BitSet(new long[]{0x0000000000040000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_forInStatement803 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_forInStatement805 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_expression_in_forInStatement809 = new BitSet(new long[]{0x0000020000040000L});
    public static final BitSet FOLLOW_LT_in_forInStatement811 = new BitSet(new long[]{0x0000020000040000L});
    public static final BitSet FOLLOW_41_in_forInStatement815 = new BitSet(new long[]{0x0083310102648000L,0x0000087FFE75A440L});
    public static final BitSet FOLLOW_LT_in_forInStatement817 = new BitSet(new long[]{0x0083310102648000L,0x0000087FFE75A440L});
    public static final BitSet FOLLOW_statement_in_forInStatement821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftHandSideExpression_in_forInStatementInitialiserPart833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_forInStatementInitialiserPart838 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_LT_in_forInStatementInitialiserPart840 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forInStatementInitialiserPart844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_continueStatement855 = new BitSet(new long[]{0x0080000000048000L});
    public static final BitSet FOLLOW_Identifier_in_continueStatement857 = new BitSet(new long[]{0x0080000000040000L});
    public static final BitSet FOLLOW_LT_in_continueStatement861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_continueStatement866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_breakStatement878 = new BitSet(new long[]{0x0080000000048000L});
    public static final BitSet FOLLOW_Identifier_in_breakStatement880 = new BitSet(new long[]{0x0080000000040000L});
    public static final BitSet FOLLOW_LT_in_breakStatement884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_breakStatement889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_returnStatement901 = new BitSet(new long[]{0x0083310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_expression_in_returnStatement903 = new BitSet(new long[]{0x0080000000040000L});
    public static final BitSet FOLLOW_LT_in_returnStatement907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_returnStatement912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_withStatement925 = new BitSet(new long[]{0x0000010000040000L});
    public static final BitSet FOLLOW_LT_in_withStatement927 = new BitSet(new long[]{0x0000010000040000L});
    public static final BitSet FOLLOW_40_in_withStatement931 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_withStatement933 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_expression_in_withStatement937 = new BitSet(new long[]{0x0000020000040000L});
    public static final BitSet FOLLOW_LT_in_withStatement939 = new BitSet(new long[]{0x0000020000040000L});
    public static final BitSet FOLLOW_41_in_withStatement943 = new BitSet(new long[]{0x0083310102648000L,0x0000087FFE75A440L});
    public static final BitSet FOLLOW_LT_in_withStatement945 = new BitSet(new long[]{0x0083310102648000L,0x0000087FFE75A440L});
    public static final BitSet FOLLOW_statement_in_withStatement949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_labelledStatement960 = new BitSet(new long[]{0x0040000000040000L});
    public static final BitSet FOLLOW_LT_in_labelledStatement962 = new BitSet(new long[]{0x0040000000040000L});
    public static final BitSet FOLLOW_54_in_labelledStatement966 = new BitSet(new long[]{0x0083310102648000L,0x0000087FFE75A440L});
    public static final BitSet FOLLOW_LT_in_labelledStatement968 = new BitSet(new long[]{0x0083310102648000L,0x0000087FFE75A440L});
    public static final BitSet FOLLOW_statement_in_labelledStatement972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_switchStatement984 = new BitSet(new long[]{0x0000010000040000L});
    public static final BitSet FOLLOW_LT_in_switchStatement986 = new BitSet(new long[]{0x0000010000040000L});
    public static final BitSet FOLLOW_40_in_switchStatement990 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_switchStatement992 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_expression_in_switchStatement996 = new BitSet(new long[]{0x0000020000040000L});
    public static final BitSet FOLLOW_LT_in_switchStatement998 = new BitSet(new long[]{0x0000020000040000L});
    public static final BitSet FOLLOW_41_in_switchStatement1002 = new BitSet(new long[]{0x0000000000040000L,0x0000004000000000L});
    public static final BitSet FOLLOW_LT_in_switchStatement1004 = new BitSet(new long[]{0x0000000000040000L,0x0000004000000000L});
    public static final BitSet FOLLOW_caseBlock_in_switchStatement1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_caseBlock1020 = new BitSet(new long[]{0x0000000000040000L,0x0000040000004800L});
    public static final BitSet FOLLOW_LT_in_caseBlock1023 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000800L});
    public static final BitSet FOLLOW_caseClause_in_caseBlock1027 = new BitSet(new long[]{0x0000000000040000L,0x0000040000004800L});
    public static final BitSet FOLLOW_LT_in_caseBlock1032 = new BitSet(new long[]{0x0000000000040000L,0x0000000000004000L});
    public static final BitSet FOLLOW_defaultClause_in_caseBlock1036 = new BitSet(new long[]{0x0000000000040000L,0x0000040000000800L});
    public static final BitSet FOLLOW_LT_in_caseBlock1039 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000800L});
    public static final BitSet FOLLOW_caseClause_in_caseBlock1043 = new BitSet(new long[]{0x0000000000040000L,0x0000040000000800L});
    public static final BitSet FOLLOW_LT_in_caseBlock1049 = new BitSet(new long[]{0x0000000000040000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_caseBlock1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_caseClause1064 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_caseClause1066 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_expression_in_caseClause1070 = new BitSet(new long[]{0x0040000000040000L});
    public static final BitSet FOLLOW_LT_in_caseClause1072 = new BitSet(new long[]{0x0040000000040000L});
    public static final BitSet FOLLOW_54_in_caseClause1076 = new BitSet(new long[]{0x0083310102648002L,0x0000087FFE75A440L});
    public static final BitSet FOLLOW_LT_in_caseClause1078 = new BitSet(new long[]{0x0083310102648002L,0x0000087FFE75A440L});
    public static final BitSet FOLLOW_statementList_in_caseClause1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_defaultClause1095 = new BitSet(new long[]{0x0040000000040000L});
    public static final BitSet FOLLOW_LT_in_defaultClause1097 = new BitSet(new long[]{0x0040000000040000L});
    public static final BitSet FOLLOW_54_in_defaultClause1101 = new BitSet(new long[]{0x0083310102648002L,0x0000087FFE75A440L});
    public static final BitSet FOLLOW_LT_in_defaultClause1103 = new BitSet(new long[]{0x0083310102648002L,0x0000087FFE75A440L});
    public static final BitSet FOLLOW_statementList_in_defaultClause1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_throwStatement1120 = new BitSet(new long[]{0x0003310102608000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_expression_in_throwStatement1122 = new BitSet(new long[]{0x0080000000040000L});
    public static final BitSet FOLLOW_set_in_throwStatement1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_tryStatement1142 = new BitSet(new long[]{0x0000000000040000L,0x0000004000000000L});
    public static final BitSet FOLLOW_LT_in_tryStatement1144 = new BitSet(new long[]{0x0000000000040000L,0x0000004000000000L});
    public static final BitSet FOLLOW_statementBlock_in_tryStatement1148 = new BitSet(new long[]{0x0000000000040000L,0x0000000000081000L});
    public static final BitSet FOLLOW_LT_in_tryStatement1150 = new BitSet(new long[]{0x0000000000040000L,0x0000000000081000L});
    public static final BitSet FOLLOW_finallyClause_in_tryStatement1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchClause_in_tryStatement1159 = new BitSet(new long[]{0x0000000000040002L,0x0000000000080000L});
    public static final BitSet FOLLOW_LT_in_tryStatement1162 = new BitSet(new long[]{0x0000000000040000L,0x0000000000080000L});
    public static final BitSet FOLLOW_finallyClause_in_tryStatement1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_catchClause1187 = new BitSet(new long[]{0x0000010000040000L});
    public static final BitSet FOLLOW_LT_in_catchClause1189 = new BitSet(new long[]{0x0000010000040000L});
    public static final BitSet FOLLOW_40_in_catchClause1193 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_LT_in_catchClause1195 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_Identifier_in_catchClause1199 = new BitSet(new long[]{0x0000020000040000L});
    public static final BitSet FOLLOW_LT_in_catchClause1201 = new BitSet(new long[]{0x0000020000040000L});
    public static final BitSet FOLLOW_41_in_catchClause1205 = new BitSet(new long[]{0x0000000000040000L,0x0000004000000000L});
    public static final BitSet FOLLOW_LT_in_catchClause1207 = new BitSet(new long[]{0x0000000000040000L,0x0000004000000000L});
    public static final BitSet FOLLOW_statementBlock_in_catchClause1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_finallyClause1223 = new BitSet(new long[]{0x0000000000040000L,0x0000004000000000L});
    public static final BitSet FOLLOW_LT_in_finallyClause1225 = new BitSet(new long[]{0x0000000000040000L,0x0000004000000000L});
    public static final BitSet FOLLOW_statementBlock_in_finallyClause1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression1241 = new BitSet(new long[]{0x0000800000040002L});
    public static final BitSet FOLLOW_LT_in_expression1244 = new BitSet(new long[]{0x0000800000040000L});
    public static final BitSet FOLLOW_47_in_expression1248 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_expression1250 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression1254 = new BitSet(new long[]{0x0000800000040002L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn1268 = new BitSet(new long[]{0x0000800000040002L});
    public static final BitSet FOLLOW_LT_in_expressionNoIn1271 = new BitSet(new long[]{0x0000800000040000L});
    public static final BitSet FOLLOW_47_in_expressionNoIn1275 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_expressionNoIn1277 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn1281 = new BitSet(new long[]{0x0000800000040002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignmentExpression1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftHandSideExpression_in_assignmentExpression1300 = new BitSet(new long[]{0x1424489000040000L,0x0000010000000214L});
    public static final BitSet FOLLOW_LT_in_assignmentExpression1302 = new BitSet(new long[]{0x1424489000040000L,0x0000010000000214L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpression1306 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_assignmentExpression1308 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftHandSideExpression_in_assignmentExpressionNoIn1329 = new BitSet(new long[]{0x1424489000040000L,0x0000010000000214L});
    public static final BitSet FOLLOW_LT_in_assignmentExpressionNoIn1331 = new BitSet(new long[]{0x1424489000040000L,0x0000010000000214L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpressionNoIn1335 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_assignmentExpressionNoIn1337 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callExpression_in_leftHandSideExpression1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_leftHandSideExpression1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberExpression_in_newExpression1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_newExpression1375 = new BitSet(new long[]{0x0000010002648000L,0x00000040A6240040L});
    public static final BitSet FOLLOW_LT_in_newExpression1377 = new BitSet(new long[]{0x0000010002648000L,0x00000040A6240040L});
    public static final BitSet FOLLOW_newExpression_in_newExpression1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_memberExpression1394 = new BitSet(new long[]{0x0008000000040002L,0x0000000000000040L});
    public static final BitSet FOLLOW_functionExpression_in_memberExpression1398 = new BitSet(new long[]{0x0008000000040002L,0x0000000000000040L});
    public static final BitSet FOLLOW_89_in_memberExpression1402 = new BitSet(new long[]{0x0000010002648000L,0x00000040A6240040L});
    public static final BitSet FOLLOW_LT_in_memberExpression1404 = new BitSet(new long[]{0x0000010002648000L,0x00000040A6240040L});
    public static final BitSet FOLLOW_memberExpression_in_memberExpression1408 = new BitSet(new long[]{0x0000010000040000L});
    public static final BitSet FOLLOW_LT_in_memberExpression1410 = new BitSet(new long[]{0x0000010000040000L});
    public static final BitSet FOLLOW_arguments_in_memberExpression1414 = new BitSet(new long[]{0x0008000000040002L,0x0000000000000040L});
    public static final BitSet FOLLOW_LT_in_memberExpression1418 = new BitSet(new long[]{0x0008000000040000L,0x0000000000000040L});
    public static final BitSet FOLLOW_memberExpressionSuffix_in_memberExpression1422 = new BitSet(new long[]{0x0008000000040002L,0x0000000000000040L});
    public static final BitSet FOLLOW_indexSuffix_in_memberExpressionSuffix1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyReferenceSuffix_in_memberExpressionSuffix1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberExpression_in_callExpression1452 = new BitSet(new long[]{0x0000010000040000L});
    public static final BitSet FOLLOW_LT_in_callExpression1454 = new BitSet(new long[]{0x0000010000040000L});
    public static final BitSet FOLLOW_arguments_in_callExpression1458 = new BitSet(new long[]{0x0008010000040002L,0x0000000000000040L});
    public static final BitSet FOLLOW_LT_in_callExpression1461 = new BitSet(new long[]{0x0008010000040000L,0x0000000000000040L});
    public static final BitSet FOLLOW_callExpressionSuffix_in_callExpression1465 = new BitSet(new long[]{0x0008010000040002L,0x0000000000000040L});
    public static final BitSet FOLLOW_arguments_in_callExpressionSuffix1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indexSuffix_in_callExpressionSuffix1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyReferenceSuffix_in_callExpressionSuffix1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_arguments1500 = new BitSet(new long[]{0x0003330102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_arguments1503 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments1507 = new BitSet(new long[]{0x0000820000040000L});
    public static final BitSet FOLLOW_LT_in_arguments1510 = new BitSet(new long[]{0x0000800000040000L});
    public static final BitSet FOLLOW_47_in_arguments1514 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_arguments1516 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments1520 = new BitSet(new long[]{0x0000820000040000L});
    public static final BitSet FOLLOW_LT_in_arguments1526 = new BitSet(new long[]{0x0000020000040000L});
    public static final BitSet FOLLOW_41_in_arguments1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_indexSuffix1542 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_indexSuffix1544 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_expression_in_indexSuffix1548 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LT_in_indexSuffix1550 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_indexSuffix1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_propertyReferenceSuffix1567 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_LT_in_propertyReferenceSuffix1569 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_Identifier_in_propertyReferenceSuffix1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpression_in_conditionalExpression1640 = new BitSet(new long[]{0x0000000000040002L,0x0000000000000020L});
    public static final BitSet FOLLOW_LT_in_conditionalExpression1643 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_conditionalExpression1647 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_conditionalExpression1649 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression1653 = new BitSet(new long[]{0x0040000000040000L});
    public static final BitSet FOLLOW_LT_in_conditionalExpression1655 = new BitSet(new long[]{0x0040000000040000L});
    public static final BitSet FOLLOW_54_in_conditionalExpression1659 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_conditionalExpression1661 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn1678 = new BitSet(new long[]{0x0000000000040002L,0x0000000000000020L});
    public static final BitSet FOLLOW_LT_in_conditionalExpressionNoIn1681 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_conditionalExpressionNoIn1685 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_conditionalExpressionNoIn1687 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn1691 = new BitSet(new long[]{0x0040000000040000L});
    public static final BitSet FOLLOW_LT_in_conditionalExpressionNoIn1693 = new BitSet(new long[]{0x0040000000040000L});
    public static final BitSet FOLLOW_54_in_conditionalExpressionNoIn1697 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_conditionalExpressionNoIn1699 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression1716 = new BitSet(new long[]{0x0000000000040002L,0x0000020000000000L});
    public static final BitSet FOLLOW_LT_in_logicalORExpression1719 = new BitSet(new long[]{0x0000000000040000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_logicalORExpression1723 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_logicalORExpression1725 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression1729 = new BitSet(new long[]{0x0000000000040002L,0x0000020000000000L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn1743 = new BitSet(new long[]{0x0000000000040002L,0x0000020000000000L});
    public static final BitSet FOLLOW_LT_in_logicalORExpressionNoIn1746 = new BitSet(new long[]{0x0000000000040000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_logicalORExpressionNoIn1750 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_logicalORExpressionNoIn1752 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn1756 = new BitSet(new long[]{0x0000000000040002L,0x0000020000000000L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression1770 = new BitSet(new long[]{0x0000002000040002L});
    public static final BitSet FOLLOW_LT_in_logicalANDExpression1773 = new BitSet(new long[]{0x0000002000040000L});
    public static final BitSet FOLLOW_37_in_logicalANDExpression1777 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_logicalANDExpression1779 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression1783 = new BitSet(new long[]{0x0000002000040002L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn1797 = new BitSet(new long[]{0x0000002000040002L});
    public static final BitSet FOLLOW_LT_in_logicalANDExpressionNoIn1800 = new BitSet(new long[]{0x0000002000040000L});
    public static final BitSet FOLLOW_37_in_logicalANDExpressionNoIn1804 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_logicalANDExpressionNoIn1806 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn1810 = new BitSet(new long[]{0x0000002000040002L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression1824 = new BitSet(new long[]{0x0000000000040002L,0x0000008000000000L});
    public static final BitSet FOLLOW_LT_in_bitwiseORExpression1827 = new BitSet(new long[]{0x0000000000040000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_bitwiseORExpression1831 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_bitwiseORExpression1833 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression1837 = new BitSet(new long[]{0x0000000000040002L,0x0000008000000000L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn1851 = new BitSet(new long[]{0x0000000000040002L,0x0000008000000000L});
    public static final BitSet FOLLOW_LT_in_bitwiseORExpressionNoIn1854 = new BitSet(new long[]{0x0000000000040000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_bitwiseORExpressionNoIn1858 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_bitwiseORExpressionNoIn1860 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn1864 = new BitSet(new long[]{0x0000000000040002L,0x0000008000000000L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression1878 = new BitSet(new long[]{0x0000000000040002L,0x0000000000000100L});
    public static final BitSet FOLLOW_LT_in_bitwiseXORExpression1881 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_bitwiseXORExpression1885 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_bitwiseXORExpression1887 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression1891 = new BitSet(new long[]{0x0000000000040002L,0x0000000000000100L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn1905 = new BitSet(new long[]{0x0000000000040002L,0x0000000000000100L});
    public static final BitSet FOLLOW_LT_in_bitwiseXORExpressionNoIn1908 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_bitwiseXORExpressionNoIn1912 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_bitwiseXORExpressionNoIn1914 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn1918 = new BitSet(new long[]{0x0000000000040002L,0x0000000000000100L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression1932 = new BitSet(new long[]{0x0000004000040002L});
    public static final BitSet FOLLOW_LT_in_bitwiseANDExpression1935 = new BitSet(new long[]{0x0000004000040000L});
    public static final BitSet FOLLOW_38_in_bitwiseANDExpression1939 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_bitwiseANDExpression1941 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression1945 = new BitSet(new long[]{0x0000004000040002L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn1959 = new BitSet(new long[]{0x0000004000040002L});
    public static final BitSet FOLLOW_LT_in_bitwiseANDExpressionNoIn1962 = new BitSet(new long[]{0x0000004000040000L});
    public static final BitSet FOLLOW_38_in_bitwiseANDExpressionNoIn1966 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_bitwiseANDExpressionNoIn1968 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn1972 = new BitSet(new long[]{0x0000004000040002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1986 = new BitSet(new long[]{0x6000000600040002L});
    public static final BitSet FOLLOW_LT_in_equalityExpression1989 = new BitSet(new long[]{0x6000000600040000L});
    public static final BitSet FOLLOW_set_in_equalityExpression1993 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_equalityExpression2009 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression2013 = new BitSet(new long[]{0x6000000600040002L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn2026 = new BitSet(new long[]{0x6000000600040002L});
    public static final BitSet FOLLOW_LT_in_equalityExpressionNoIn2029 = new BitSet(new long[]{0x6000000600040000L});
    public static final BitSet FOLLOW_set_in_equalityExpressionNoIn2033 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_equalityExpressionNoIn2049 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn2053 = new BitSet(new long[]{0x6000000600040002L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression2067 = new BitSet(new long[]{0x8900000000040002L,0x0000000001800001L});
    public static final BitSet FOLLOW_LT_in_relationalExpression2070 = new BitSet(new long[]{0x8900000000040000L,0x0000000001800001L});
    public static final BitSet FOLLOW_set_in_relationalExpression2074 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_relationalExpression2098 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression2102 = new BitSet(new long[]{0x8900000000040002L,0x0000000001800001L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn2115 = new BitSet(new long[]{0x8900000000040002L,0x0000000001000001L});
    public static final BitSet FOLLOW_LT_in_relationalExpressionNoIn2118 = new BitSet(new long[]{0x8900000000040000L,0x0000000001000001L});
    public static final BitSet FOLLOW_set_in_relationalExpressionNoIn2122 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_relationalExpressionNoIn2142 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn2146 = new BitSet(new long[]{0x8900000000040002L,0x0000000001000001L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression2159 = new BitSet(new long[]{0x0200000000040002L,0x000000000000000AL});
    public static final BitSet FOLLOW_LT_in_shiftExpression2162 = new BitSet(new long[]{0x0200000000040000L,0x000000000000000AL});
    public static final BitSet FOLLOW_set_in_shiftExpression2166 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_shiftExpression2178 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression2182 = new BitSet(new long[]{0x0200000000040002L,0x000000000000000AL});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2195 = new BitSet(new long[]{0x0001100000040002L});
    public static final BitSet FOLLOW_LT_in_additiveExpression2198 = new BitSet(new long[]{0x0001100000040000L});
    public static final BitSet FOLLOW_set_in_additiveExpression2202 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_additiveExpression2210 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2214 = new BitSet(new long[]{0x0001100000040002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2227 = new BitSet(new long[]{0x0010040800040002L});
    public static final BitSet FOLLOW_LT_in_multiplicativeExpression2230 = new BitSet(new long[]{0x0010040800040000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression2234 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_multiplicativeExpression2246 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2250 = new BitSet(new long[]{0x0010040800040002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unaryExpression2268 = new BitSet(new long[]{0x0003310102608000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftHandSideExpression_in_postfixExpression2316 = new BitSet(new long[]{0x0002200000000002L});
    public static final BitSet FOLLOW_93_in_primaryExpression2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_primaryExpression2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpression2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLiteral_in_primaryExpression2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_primaryExpression2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_primaryExpression2361 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_primaryExpression2363 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_expression_in_primaryExpression2367 = new BitSet(new long[]{0x0000020000040000L});
    public static final BitSet FOLLOW_LT_in_primaryExpression2369 = new BitSet(new long[]{0x0000020000040000L});
    public static final BitSet FOLLOW_41_in_primaryExpression2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_arrayLiteral2386 = new BitSet(new long[]{0x0003B10102648000L,0x0000084AA62480C0L});
    public static final BitSet FOLLOW_LT_in_arrayLiteral2388 = new BitSet(new long[]{0x0003B10102648000L,0x0000084AA62480C0L});
    public static final BitSet FOLLOW_assignmentExpression_in_arrayLiteral2392 = new BitSet(new long[]{0x0000800000040000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LT_in_arrayLiteral2396 = new BitSet(new long[]{0x0000800000040000L});
    public static final BitSet FOLLOW_47_in_arrayLiteral2400 = new BitSet(new long[]{0x0003B10102648000L,0x0000084AA62480C0L});
    public static final BitSet FOLLOW_LT_in_arrayLiteral2403 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_assignmentExpression_in_arrayLiteral2407 = new BitSet(new long[]{0x0000800000040000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LT_in_arrayLiteral2413 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_arrayLiteral2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_objectLiteral2436 = new BitSet(new long[]{0x0000000000040000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LT_in_objectLiteral2438 = new BitSet(new long[]{0x0000000000040000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_objectLiteral2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_objectLiteral2447 = new BitSet(new long[]{0x0000000002248000L});
    public static final BitSet FOLLOW_LT_in_objectLiteral2449 = new BitSet(new long[]{0x0000000002248000L});
    public static final BitSet FOLLOW_propertyNameAndValue_in_objectLiteral2453 = new BitSet(new long[]{0x0000800000040000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LT_in_objectLiteral2456 = new BitSet(new long[]{0x0000800000040000L});
    public static final BitSet FOLLOW_47_in_objectLiteral2460 = new BitSet(new long[]{0x0000000002248000L});
    public static final BitSet FOLLOW_LT_in_objectLiteral2462 = new BitSet(new long[]{0x0000000002248000L});
    public static final BitSet FOLLOW_propertyNameAndValue_in_objectLiteral2466 = new BitSet(new long[]{0x0000800000040000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LT_in_objectLiteral2470 = new BitSet(new long[]{0x0000000000040000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_objectLiteral2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyName_in_propertyNameAndValue2486 = new BitSet(new long[]{0x0040000000040000L});
    public static final BitSet FOLLOW_LT_in_propertyNameAndValue2488 = new BitSet(new long[]{0x0040000000040000L});
    public static final BitSet FOLLOW_54_in_propertyNameAndValue2492 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_propertyNameAndValue2494 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_assignmentExpression_in_propertyNameAndValue2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclaration_in_synpred5_JavaScript81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred9_JavaScript131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementBlock_in_synpred21_JavaScript225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStatement_in_synpred24_JavaScript240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelledStatement_in_synpred31_JavaScript275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred34_JavaScript304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred47_JavaScript431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred49_JavaScript450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred60_JavaScript563 = new BitSet(new long[]{0x0000000000040000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_synpred60_JavaScript567 = new BitSet(new long[]{0x0083310102648000L,0x0000087FFE75A440L});
    public static final BitSet FOLLOW_LT_in_synpred60_JavaScript569 = new BitSet(new long[]{0x0083310102648000L,0x0000087FFE75A440L});
    public static final BitSet FOLLOW_statement_in_synpred60_JavaScript573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_synpred63_JavaScript597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred118_JavaScript1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred121_JavaScript1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_synpred140_JavaScript1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpressionNoIn_in_synpred143_JavaScript1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callExpression_in_synpred146_JavaScript1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberExpression_in_synpred147_JavaScript1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred154_JavaScript1418 = new BitSet(new long[]{0x0008000000040000L,0x0000000000000040L});
    public static final BitSet FOLLOW_memberExpressionSuffix_in_synpred154_JavaScript1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred158_JavaScript1461 = new BitSet(new long[]{0x0008010000040000L,0x0000000000000040L});
    public static final BitSet FOLLOW_callExpressionSuffix_in_synpred158_JavaScript1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred256_JavaScript2198 = new BitSet(new long[]{0x0001100000040000L});
    public static final BitSet FOLLOW_set_in_synpred256_JavaScript2202 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_LT_in_synpred256_JavaScript2210 = new BitSet(new long[]{0x0003310102648000L,0x0000084AA6248040L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_synpred256_JavaScript2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred280_JavaScript2388 = new BitSet(new long[]{0x0000000000000002L});

}
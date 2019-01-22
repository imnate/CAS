// $ANTLR 3.3 Nov 30, 2010 12:50:56 CPP.g 2016-07-19 17:37:02
package analysis;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class CPPParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ROOT", "PREPROCESSOR", "USING_DECLARATION", "FUNCTION", "FUNCTIONNAME", "BODY", "DECLARE", "JUMP", "IF", "SWITCH", "FOR", "WHILE", "DOWHILE", "ASSIGNMENT", "CIN", "COUT", "SYSTEM", "RETURN", "STARTBLOCK", "ENDBLOCK", "ELSE", "CONDITION", "FORINITAL", "STEP", "ID", "STRING", "INT", "FLOAT", "CHAR", "BOOLEAN_", "EXPONENT", "COMMENT", "WS", "ESC_SEQ", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "';'", "'#'", "'include'", "'<'", "'>'", "'\"'", "'iostream'", "'cmath'", "'stdio.h'", "'stdlib.h'", "'iomanip'", "'math.h'", "'cstdio'", "'cstdlib'", "'conio.h'", "'using'", "'std'", "'::'", "'cin'", "'endl'", "'cout'", "'namespace'", "','", "'='", "'{'", "'}'", "'('", "')'", "'unsigned'", "'int'", "'char'", "'double'", "'bool'", "'short'", "'long'", "'float'", "'void'", "'long double'", "'*'", "'break'", "'continue'", "'goto'", "'>>'", "'<<'", "'setw('", "'if'", "'else'", "'switch'", "'case'", "':'", "'default'", "'for'", "'while'", "'do'", "'system'", "'return'", "'0'", "'['", "']'", "'++'", "'--'", "'.'", "'->'", "'-'", "'!'", "'~'", "'&'", "'/'", "'%'", "'+'", "'<='", "'>='", "'=='", "'!='", "'^'", "'|'", "'&&'", "'||'", "'+='", "'-='", "'*='", "'/='", "'%='"
    };
    public static final int EOF=-1;
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
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__110=110;
    public static final int T__111=111;
    public static final int T__112=112;
    public static final int T__113=113;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__120=120;
    public static final int T__121=121;
    public static final int T__122=122;
    public static final int T__123=123;
    public static final int ROOT=4;
    public static final int PREPROCESSOR=5;
    public static final int USING_DECLARATION=6;
    public static final int FUNCTION=7;
    public static final int FUNCTIONNAME=8;
    public static final int BODY=9;
    public static final int DECLARE=10;
    public static final int JUMP=11;
    public static final int IF=12;
    public static final int SWITCH=13;
    public static final int FOR=14;
    public static final int WHILE=15;
    public static final int DOWHILE=16;
    public static final int ASSIGNMENT=17;
    public static final int CIN=18;
    public static final int COUT=19;
    public static final int SYSTEM=20;
    public static final int RETURN=21;
    public static final int STARTBLOCK=22;
    public static final int ENDBLOCK=23;
    public static final int ELSE=24;
    public static final int CONDITION=25;
    public static final int FORINITAL=26;
    public static final int STEP=27;
    public static final int ID=28;
    public static final int STRING=29;
    public static final int INT=30;
    public static final int FLOAT=31;
    public static final int CHAR=32;
    public static final int BOOLEAN_=33;
    public static final int EXPONENT=34;
    public static final int COMMENT=35;
    public static final int WS=36;
    public static final int ESC_SEQ=37;
    public static final int HEX_DIGIT=38;
    public static final int UNICODE_ESC=39;
    public static final int OCTAL_ESC=40;

    // delegates
    // delegators


        public CPPParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CPPParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return CPPParser.tokenNames; }
    public String getGrammarFileName() { return "CPP.g"; }


    public static class cpp_root_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cpp_root"
    // CPP.g:22:1: cpp_root : ( preprocessor | ';' | using_declaration | declaration_statement )+ -> ^( ROOT ^( PREPROCESSOR ( preprocessor )+ ) ^( USING_DECLARATION ( using_declaration )+ ) ( declaration_statement )+ ) ;
    public final CPPParser.cpp_root_return cpp_root() throws RecognitionException {
        CPPParser.cpp_root_return retval = new CPPParser.cpp_root_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal2=null;
        CPPParser.preprocessor_return preprocessor1 = null;

        CPPParser.using_declaration_return using_declaration3 = null;

        CPPParser.declaration_statement_return declaration_statement4 = null;


        Object char_literal2_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleSubtreeStream stream_using_declaration=new RewriteRuleSubtreeStream(adaptor,"rule using_declaration");
        RewriteRuleSubtreeStream stream_declaration_statement=new RewriteRuleSubtreeStream(adaptor,"rule declaration_statement");
        RewriteRuleSubtreeStream stream_preprocessor=new RewriteRuleSubtreeStream(adaptor,"rule preprocessor");
        try {
            // CPP.g:23:2: ( ( preprocessor | ';' | using_declaration | declaration_statement )+ -> ^( ROOT ^( PREPROCESSOR ( preprocessor )+ ) ^( USING_DECLARATION ( using_declaration )+ ) ( declaration_statement )+ ) )
            // CPP.g:23:3: ( preprocessor | ';' | using_declaration | declaration_statement )+
            {
            // CPP.g:23:3: ( preprocessor | ';' | using_declaration | declaration_statement )+
            int cnt1=0;
            loop1:
            do {
                int alt1=5;
                switch ( input.LA(1) ) {
                case 42:
                    {
                    alt1=1;
                    }
                    break;
                case 41:
                    {
                    alt1=2;
                    }
                    break;
                case 56:
                    {
                    alt1=3;
                    }
                    break;
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                    {
                    alt1=4;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // CPP.g:23:4: preprocessor
            	    {
            	    pushFollow(FOLLOW_preprocessor_in_cpp_root97);
            	    preprocessor1=preprocessor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_preprocessor.add(preprocessor1.getTree());

            	    }
            	    break;
            	case 2 :
            	    // CPP.g:23:17: ';'
            	    {
            	    char_literal2=(Token)match(input,41,FOLLOW_41_in_cpp_root99); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_41.add(char_literal2);


            	    }
            	    break;
            	case 3 :
            	    // CPP.g:23:21: using_declaration
            	    {
            	    pushFollow(FOLLOW_using_declaration_in_cpp_root101);
            	    using_declaration3=using_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_using_declaration.add(using_declaration3.getTree());

            	    }
            	    break;
            	case 4 :
            	    // CPP.g:23:39: declaration_statement
            	    {
            	    pushFollow(FOLLOW_declaration_statement_in_cpp_root103);
            	    declaration_statement4=declaration_statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declaration_statement.add(declaration_statement4.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);



            // AST REWRITE
            // elements: declaration_statement, using_declaration, preprocessor
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 24:2: -> ^( ROOT ^( PREPROCESSOR ( preprocessor )+ ) ^( USING_DECLARATION ( using_declaration )+ ) ( declaration_statement )+ )
            {
                // CPP.g:24:5: ^( ROOT ^( PREPROCESSOR ( preprocessor )+ ) ^( USING_DECLARATION ( using_declaration )+ ) ( declaration_statement )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ROOT, "ROOT"), root_1);

                // CPP.g:24:13: ^( PREPROCESSOR ( preprocessor )+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PREPROCESSOR, "PREPROCESSOR"), root_2);

                if ( !(stream_preprocessor.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_preprocessor.hasNext() ) {
                    adaptor.addChild(root_2, stream_preprocessor.nextTree());

                }
                stream_preprocessor.reset();

                adaptor.addChild(root_1, root_2);
                }
                // CPP.g:24:43: ^( USING_DECLARATION ( using_declaration )+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(USING_DECLARATION, "USING_DECLARATION"), root_2);

                if ( !(stream_using_declaration.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_using_declaration.hasNext() ) {
                    adaptor.addChild(root_2, stream_using_declaration.nextTree());

                }
                stream_using_declaration.reset();

                adaptor.addChild(root_1, root_2);
                }
                if ( !(stream_declaration_statement.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_declaration_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_declaration_statement.nextTree());

                }
                stream_declaration_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
        }
        return retval;
    }
    // $ANTLR end "cpp_root"

    public static class preprocessor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "preprocessor"
    // CPP.g:26:1: preprocessor : '#' 'include' '<' header_file '>' ;
    public final CPPParser.preprocessor_return preprocessor() throws RecognitionException {
        CPPParser.preprocessor_return retval = new CPPParser.preprocessor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal5=null;
        Token string_literal6=null;
        Token char_literal7=null;
        Token char_literal9=null;
        CPPParser.header_file_return header_file8 = null;


        Object char_literal5_tree=null;
        Object string_literal6_tree=null;
        Object char_literal7_tree=null;
        Object char_literal9_tree=null;

        try {
            // CPP.g:27:2: ( '#' 'include' '<' header_file '>' )
            // CPP.g:27:3: '#' 'include' '<' header_file '>'
            {
            root_0 = (Object)adaptor.nil();

            char_literal5=(Token)match(input,42,FOLLOW_42_in_preprocessor140); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal5_tree = (Object)adaptor.create(char_literal5);
            adaptor.addChild(root_0, char_literal5_tree);
            }
            string_literal6=(Token)match(input,43,FOLLOW_43_in_preprocessor141); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal6_tree = (Object)adaptor.create(string_literal6);
            adaptor.addChild(root_0, string_literal6_tree);
            }
            char_literal7=(Token)match(input,44,FOLLOW_44_in_preprocessor142); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal7_tree = (Object)adaptor.create(char_literal7);
            adaptor.addChild(root_0, char_literal7_tree);
            }
            pushFollow(FOLLOW_header_file_in_preprocessor143);
            header_file8=header_file();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, header_file8.getTree());
            char_literal9=(Token)match(input,45,FOLLOW_45_in_preprocessor144); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal9_tree = (Object)adaptor.create(char_literal9);
            adaptor.addChild(root_0, char_literal9_tree);
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
        }
        return retval;
    }
    // $ANTLR end "preprocessor"

    public static class header_file_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "header_file"
    // CPP.g:29:1: header_file : ( '\"' )? ( 'iostream' | 'cmath' | 'stdio.h' | 'stdlib.h' | 'iomanip' | 'math.h' | 'cstdio' | 'cstdlib' | 'conio.h' ) ( '\"' )? ;
    public final CPPParser.header_file_return header_file() throws RecognitionException {
        CPPParser.header_file_return retval = new CPPParser.header_file_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal10=null;
        Token set11=null;
        Token char_literal12=null;

        Object char_literal10_tree=null;
        Object set11_tree=null;
        Object char_literal12_tree=null;

        try {
            // CPP.g:30:2: ( ( '\"' )? ( 'iostream' | 'cmath' | 'stdio.h' | 'stdlib.h' | 'iomanip' | 'math.h' | 'cstdio' | 'cstdlib' | 'conio.h' ) ( '\"' )? )
            // CPP.g:30:3: ( '\"' )? ( 'iostream' | 'cmath' | 'stdio.h' | 'stdlib.h' | 'iomanip' | 'math.h' | 'cstdio' | 'cstdlib' | 'conio.h' ) ( '\"' )?
            {
            root_0 = (Object)adaptor.nil();

            // CPP.g:30:3: ( '\"' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==46) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // CPP.g:30:3: '\"'
                    {
                    char_literal10=(Token)match(input,46,FOLLOW_46_in_header_file153); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal10_tree = (Object)adaptor.create(char_literal10);
                    adaptor.addChild(root_0, char_literal10_tree);
                    }

                    }
                    break;

            }

            set11=(Token)input.LT(1);
            if ( (input.LA(1)>=47 && input.LA(1)<=55) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set11));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // CPP.g:30:96: ( '\"' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==46) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // CPP.g:30:96: '\"'
                    {
                    char_literal12=(Token)match(input,46,FOLLOW_46_in_header_file174); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal12_tree = (Object)adaptor.create(char_literal12);
                    adaptor.addChild(root_0, char_literal12_tree);
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
        }
        return retval;
    }
    // $ANTLR end "header_file"

    public static class using_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "using_declaration"
    // CPP.g:32:1: using_declaration : 'using' ( namespace | 'std' '::' ( 'cin' | 'endl' | 'cout' ) ) ';' ;
    public final CPPParser.using_declaration_return using_declaration() throws RecognitionException {
        CPPParser.using_declaration_return retval = new CPPParser.using_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal13=null;
        Token string_literal15=null;
        Token string_literal16=null;
        Token set17=null;
        Token char_literal18=null;
        CPPParser.namespace_return namespace14 = null;


        Object string_literal13_tree=null;
        Object string_literal15_tree=null;
        Object string_literal16_tree=null;
        Object set17_tree=null;
        Object char_literal18_tree=null;

        try {
            // CPP.g:33:2: ( 'using' ( namespace | 'std' '::' ( 'cin' | 'endl' | 'cout' ) ) ';' )
            // CPP.g:33:3: 'using' ( namespace | 'std' '::' ( 'cin' | 'endl' | 'cout' ) ) ';'
            {
            root_0 = (Object)adaptor.nil();

            string_literal13=(Token)match(input,56,FOLLOW_56_in_using_declaration184); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal13_tree = (Object)adaptor.create(string_literal13);
            adaptor.addChild(root_0, string_literal13_tree);
            }
            // CPP.g:33:11: ( namespace | 'std' '::' ( 'cin' | 'endl' | 'cout' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==62) ) {
                alt4=1;
            }
            else if ( (LA4_0==57) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // CPP.g:33:12: namespace
                    {
                    pushFollow(FOLLOW_namespace_in_using_declaration187);
                    namespace14=namespace();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, namespace14.getTree());

                    }
                    break;
                case 2 :
                    // CPP.g:33:22: 'std' '::' ( 'cin' | 'endl' | 'cout' )
                    {
                    string_literal15=(Token)match(input,57,FOLLOW_57_in_using_declaration189); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal15_tree = (Object)adaptor.create(string_literal15);
                    adaptor.addChild(root_0, string_literal15_tree);
                    }
                    string_literal16=(Token)match(input,58,FOLLOW_58_in_using_declaration190); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal16_tree = (Object)adaptor.create(string_literal16);
                    adaptor.addChild(root_0, string_literal16_tree);
                    }
                    set17=(Token)input.LT(1);
                    if ( (input.LA(1)>=59 && input.LA(1)<=61) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set17));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            char_literal18=(Token)match(input,41,FOLLOW_41_in_using_declaration200); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal18_tree = (Object)adaptor.create(char_literal18);
            adaptor.addChild(root_0, char_literal18_tree);
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
        }
        return retval;
    }
    // $ANTLR end "using_declaration"

    public static class namespace_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "namespace"
    // CPP.g:35:1: namespace : 'namespace' ( '::' )? 'std' ;
    public final CPPParser.namespace_return namespace() throws RecognitionException {
        CPPParser.namespace_return retval = new CPPParser.namespace_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal19=null;
        Token string_literal20=null;
        Token string_literal21=null;

        Object string_literal19_tree=null;
        Object string_literal20_tree=null;
        Object string_literal21_tree=null;

        try {
            // CPP.g:36:2: ( 'namespace' ( '::' )? 'std' )
            // CPP.g:36:3: 'namespace' ( '::' )? 'std'
            {
            root_0 = (Object)adaptor.nil();

            string_literal19=(Token)match(input,62,FOLLOW_62_in_namespace209); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal19_tree = (Object)adaptor.create(string_literal19);
            adaptor.addChild(root_0, string_literal19_tree);
            }
            // CPP.g:36:14: ( '::' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==58) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // CPP.g:36:14: '::'
                    {
                    string_literal20=(Token)match(input,58,FOLLOW_58_in_namespace210); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal20_tree = (Object)adaptor.create(string_literal20);
                    adaptor.addChild(root_0, string_literal20_tree);
                    }

                    }
                    break;

            }

            string_literal21=(Token)match(input,57,FOLLOW_57_in_namespace212); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal21_tree = (Object)adaptor.create(string_literal21);
            adaptor.addChild(root_0, string_literal21_tree);
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
        }
        return retval;
    }
    // $ANTLR end "namespace"

    public static class declaration_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration_statement"
    // CPP.g:38:1: declaration_statement : ( type declare ( ',' declare )* ';' -> ^( DECLARE type declare ( ',' declare )* ';' ) | function -> ^( FUNCTION function ) );
    public final CPPParser.declaration_statement_return declaration_statement() throws RecognitionException {
        CPPParser.declaration_statement_return retval = new CPPParser.declaration_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal24=null;
        Token char_literal26=null;
        CPPParser.type_return type22 = null;

        CPPParser.declare_return declare23 = null;

        CPPParser.declare_return declare25 = null;

        CPPParser.function_return function27 = null;


        Object char_literal24_tree=null;
        Object char_literal26_tree=null;
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleSubtreeStream stream_declare=new RewriteRuleSubtreeStream(adaptor,"rule declare");
        RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // CPP.g:39:2: ( type declare ( ',' declare )* ';' -> ^( DECLARE type declare ( ',' declare )* ';' ) | function -> ^( FUNCTION function ) )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // CPP.g:39:3: type declare ( ',' declare )* ';'
                    {
                    pushFollow(FOLLOW_type_in_declaration_statement221);
                    type22=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type22.getTree());
                    pushFollow(FOLLOW_declare_in_declaration_statement223);
                    declare23=declare();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declare.add(declare23.getTree());
                    // CPP.g:39:15: ( ',' declare )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==63) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // CPP.g:39:16: ',' declare
                    	    {
                    	    char_literal24=(Token)match(input,63,FOLLOW_63_in_declaration_statement225); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_63.add(char_literal24);

                    	    pushFollow(FOLLOW_declare_in_declaration_statement226);
                    	    declare25=declare();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_declare.add(declare25.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    char_literal26=(Token)match(input,41,FOLLOW_41_in_declaration_statement229); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_41.add(char_literal26);



                    // AST REWRITE
                    // elements: 63, declare, declare, 41, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 39:32: -> ^( DECLARE type declare ( ',' declare )* ';' )
                    {
                        // CPP.g:39:35: ^( DECLARE type declare ( ',' declare )* ';' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECLARE, "DECLARE"), root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());
                        adaptor.addChild(root_1, stream_declare.nextTree());
                        // CPP.g:39:57: ( ',' declare )*
                        while ( stream_63.hasNext()||stream_declare.hasNext() ) {
                            adaptor.addChild(root_1, stream_63.nextNode());
                            adaptor.addChild(root_1, stream_declare.nextTree());

                        }
                        stream_63.reset();
                        stream_declare.reset();
                        adaptor.addChild(root_1, stream_41.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // CPP.g:40:3: function
                    {
                    pushFollow(FOLLOW_function_in_declaration_statement250);
                    function27=function();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_function.add(function27.getTree());


                    // AST REWRITE
                    // elements: function
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 40:12: -> ^( FUNCTION function )
                    {
                        // CPP.g:40:15: ^( FUNCTION function )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                        adaptor.addChild(root_1, stream_function.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
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
        }
        return retval;
    }
    // $ANTLR end "declaration_statement"

    public static class declare_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declare"
    // CPP.g:42:1: declare : operator2 ( '=' operator14 | '=' '{' operator14 ( ',' operator14 )* '}' )? ;
    public final CPPParser.declare_return declare() throws RecognitionException {
        CPPParser.declare_return retval = new CPPParser.declare_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal29=null;
        Token char_literal31=null;
        Token char_literal32=null;
        Token char_literal34=null;
        Token char_literal36=null;
        CPPParser.operator2_return operator228 = null;

        CPPParser.operator14_return operator1430 = null;

        CPPParser.operator14_return operator1433 = null;

        CPPParser.operator14_return operator1435 = null;


        Object char_literal29_tree=null;
        Object char_literal31_tree=null;
        Object char_literal32_tree=null;
        Object char_literal34_tree=null;
        Object char_literal36_tree=null;

        try {
            // CPP.g:43:2: ( operator2 ( '=' operator14 | '=' '{' operator14 ( ',' operator14 )* '}' )? )
            // CPP.g:43:3: operator2 ( '=' operator14 | '=' '{' operator14 ( ',' operator14 )* '}' )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_operator2_in_declare267);
            operator228=operator2();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, operator228.getTree());
            // CPP.g:43:12: ( '=' operator14 | '=' '{' operator14 ( ',' operator14 )* '}' )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==64) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==65) ) {
                    alt9=2;
                }
                else if ( (LA9_1==ID||(LA9_1>=INT && LA9_1<=BOOLEAN_)||LA9_1==58||LA9_1==67||LA9_1==79||LA9_1==97||(LA9_1>=100 && LA9_1<=101)||(LA9_1>=104 && LA9_1<=107)) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // CPP.g:43:13: '=' operator14
                    {
                    char_literal29=(Token)match(input,64,FOLLOW_64_in_declare269); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal29_tree = (Object)adaptor.create(char_literal29);
                    adaptor.addChild(root_0, char_literal29_tree);
                    }
                    pushFollow(FOLLOW_operator14_in_declare270);
                    operator1430=operator14();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, operator1430.getTree());

                    }
                    break;
                case 2 :
                    // CPP.g:43:27: '=' '{' operator14 ( ',' operator14 )* '}'
                    {
                    char_literal31=(Token)match(input,64,FOLLOW_64_in_declare272); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal31_tree = (Object)adaptor.create(char_literal31);
                    adaptor.addChild(root_0, char_literal31_tree);
                    }
                    char_literal32=(Token)match(input,65,FOLLOW_65_in_declare273); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal32_tree = (Object)adaptor.create(char_literal32);
                    adaptor.addChild(root_0, char_literal32_tree);
                    }
                    pushFollow(FOLLOW_operator14_in_declare274);
                    operator1433=operator14();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, operator1433.getTree());
                    // CPP.g:43:43: ( ',' operator14 )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==63) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // CPP.g:43:44: ',' operator14
                    	    {
                    	    char_literal34=(Token)match(input,63,FOLLOW_63_in_declare276); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal34_tree = (Object)adaptor.create(char_literal34);
                    	    adaptor.addChild(root_0, char_literal34_tree);
                    	    }
                    	    pushFollow(FOLLOW_operator14_in_declare277);
                    	    operator1435=operator14();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, operator1435.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    char_literal36=(Token)match(input,66,FOLLOW_66_in_declare280); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal36_tree = (Object)adaptor.create(char_literal36);
                    adaptor.addChild(root_0, char_literal36_tree);
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
        }
        return retval;
    }
    // $ANTLR end "declare"

    public static class function_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function"
    // CPP.g:45:1: function : returnType functionName '(' parameterList ')' body -> ^( FUNCTIONNAME functionName ) ^( BODY body ) ;
    public final CPPParser.function_return function() throws RecognitionException {
        CPPParser.function_return retval = new CPPParser.function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal39=null;
        Token char_literal41=null;
        CPPParser.returnType_return returnType37 = null;

        CPPParser.functionName_return functionName38 = null;

        CPPParser.parameterList_return parameterList40 = null;

        CPPParser.body_return body42 = null;


        Object char_literal39_tree=null;
        Object char_literal41_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleSubtreeStream stream_functionName=new RewriteRuleSubtreeStream(adaptor,"rule functionName");
        RewriteRuleSubtreeStream stream_parameterList=new RewriteRuleSubtreeStream(adaptor,"rule parameterList");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_returnType=new RewriteRuleSubtreeStream(adaptor,"rule returnType");
        try {
            // CPP.g:46:2: ( returnType functionName '(' parameterList ')' body -> ^( FUNCTIONNAME functionName ) ^( BODY body ) )
            // CPP.g:46:3: returnType functionName '(' parameterList ')' body
            {
            pushFollow(FOLLOW_returnType_in_function291);
            returnType37=returnType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_returnType.add(returnType37.getTree());
            pushFollow(FOLLOW_functionName_in_function293);
            functionName38=functionName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_functionName.add(functionName38.getTree());
            char_literal39=(Token)match(input,67,FOLLOW_67_in_function294); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_67.add(char_literal39);

            pushFollow(FOLLOW_parameterList_in_function295);
            parameterList40=parameterList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parameterList.add(parameterList40.getTree());
            char_literal41=(Token)match(input,68,FOLLOW_68_in_function296); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_68.add(char_literal41);

            pushFollow(FOLLOW_body_in_function297);
            body42=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_body.add(body42.getTree());


            // AST REWRITE
            // elements: functionName, body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 46:50: -> ^( FUNCTIONNAME functionName ) ^( BODY body )
            {
                // CPP.g:46:53: ^( FUNCTIONNAME functionName )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTIONNAME, "FUNCTIONNAME"), root_1);

                adaptor.addChild(root_1, stream_functionName.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // CPP.g:46:82: ^( BODY body )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BODY, "BODY"), root_1);

                adaptor.addChild(root_1, stream_body.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
        }
        return retval;
    }
    // $ANTLR end "function"

    public static class returnType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "returnType"
    // CPP.g:48:1: returnType : type ;
    public final CPPParser.returnType_return returnType() throws RecognitionException {
        CPPParser.returnType_return retval = new CPPParser.returnType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CPPParser.type_return type43 = null;



        try {
            // CPP.g:49:2: ( type )
            // CPP.g:49:3: type
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_returnType320);
            type43=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type43.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "returnType"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // CPP.g:51:1: type : ( 'unsigned' )? ( 'int' | 'char' | 'double' | 'bool' | 'short' | 'long' | 'float' | 'void' | 'long double' ) ( '*' )? ;
    public final CPPParser.type_return type() throws RecognitionException {
        CPPParser.type_return retval = new CPPParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal44=null;
        Token set45=null;
        Token char_literal46=null;

        Object string_literal44_tree=null;
        Object set45_tree=null;
        Object char_literal46_tree=null;

        try {
            // CPP.g:52:2: ( ( 'unsigned' )? ( 'int' | 'char' | 'double' | 'bool' | 'short' | 'long' | 'float' | 'void' | 'long double' ) ( '*' )? )
            // CPP.g:52:3: ( 'unsigned' )? ( 'int' | 'char' | 'double' | 'bool' | 'short' | 'long' | 'float' | 'void' | 'long double' ) ( '*' )?
            {
            root_0 = (Object)adaptor.nil();

            // CPP.g:52:3: ( 'unsigned' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==69) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // CPP.g:52:3: 'unsigned'
                    {
                    string_literal44=(Token)match(input,69,FOLLOW_69_in_type329); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal44_tree = (Object)adaptor.create(string_literal44);
                    adaptor.addChild(root_0, string_literal44_tree);
                    }

                    }
                    break;

            }

            set45=(Token)input.LT(1);
            if ( (input.LA(1)>=70 && input.LA(1)<=78) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set45));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // CPP.g:52:89: ( '*' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==79) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // CPP.g:52:90: '*'
                    {
                    char_literal46=(Token)match(input,79,FOLLOW_79_in_type352); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal46_tree = (Object)adaptor.create(char_literal46);
                    adaptor.addChild(root_0, char_literal46_tree);
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
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class functionName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionName"
    // CPP.g:54:1: functionName : ID ;
    public final CPPParser.functionName_return functionName() throws RecognitionException {
        CPPParser.functionName_return retval = new CPPParser.functionName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID47=null;

        Object ID47_tree=null;

        try {
            // CPP.g:55:2: ( ID )
            // CPP.g:55:3: ID
            {
            root_0 = (Object)adaptor.nil();

            ID47=(Token)match(input,ID,FOLLOW_ID_in_functionName363); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID47_tree = (Object)adaptor.create(ID47);
            adaptor.addChild(root_0, ID47_tree);
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
        }
        return retval;
    }
    // $ANTLR end "functionName"

    public static class parameterList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameterList"
    // CPP.g:57:1: parameterList : ( parameter ( ',' parameter )* )? ;
    public final CPPParser.parameterList_return parameterList() throws RecognitionException {
        CPPParser.parameterList_return retval = new CPPParser.parameterList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal49=null;
        CPPParser.parameter_return parameter48 = null;

        CPPParser.parameter_return parameter50 = null;


        Object char_literal49_tree=null;

        try {
            // CPP.g:58:2: ( ( parameter ( ',' parameter )* )? )
            // CPP.g:58:3: ( parameter ( ',' parameter )* )?
            {
            root_0 = (Object)adaptor.nil();

            // CPP.g:58:3: ( parameter ( ',' parameter )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=69 && LA13_0<=78)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // CPP.g:58:4: parameter ( ',' parameter )*
                    {
                    pushFollow(FOLLOW_parameter_in_parameterList373);
                    parameter48=parameter();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter48.getTree());
                    // CPP.g:58:13: ( ',' parameter )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==63) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // CPP.g:58:14: ',' parameter
                    	    {
                    	    char_literal49=(Token)match(input,63,FOLLOW_63_in_parameterList375); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal49_tree = (Object)adaptor.create(char_literal49);
                    	    adaptor.addChild(root_0, char_literal49_tree);
                    	    }
                    	    pushFollow(FOLLOW_parameter_in_parameterList376);
                    	    parameter50=parameter();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter50.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


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
        }
        return retval;
    }
    // $ANTLR end "parameterList"

    public static class parameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter"
    // CPP.g:60:1: parameter : type ( ID )? ;
    public final CPPParser.parameter_return parameter() throws RecognitionException {
        CPPParser.parameter_return retval = new CPPParser.parameter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID52=null;
        CPPParser.type_return type51 = null;


        Object ID52_tree=null;

        try {
            // CPP.g:61:2: ( type ( ID )? )
            // CPP.g:61:3: type ( ID )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_parameter389);
            type51=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type51.getTree());
            // CPP.g:61:8: ( ID )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // CPP.g:61:8: ID
                    {
                    ID52=(Token)match(input,ID,FOLLOW_ID_in_parameter391); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID52_tree = (Object)adaptor.create(ID52);
                    adaptor.addChild(root_0, ID52_tree);
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
        }
        return retval;
    }
    // $ANTLR end "parameter"

    public static class body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "body"
    // CPP.g:63:1: body : ( '{' ( statement )* '}' -> ^( STARTBLOCK '{' ) ( statement )* ^( ENDBLOCK '}' ) | statement -> ^( STARTBLOCK ) statement ^( ENDBLOCK ) );
    public final CPPParser.body_return body() throws RecognitionException {
        CPPParser.body_return retval = new CPPParser.body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal53=null;
        Token char_literal55=null;
        CPPParser.statement_return statement54 = null;

        CPPParser.statement_return statement56 = null;


        Object char_literal53_tree=null;
        Object char_literal55_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // CPP.g:64:2: ( '{' ( statement )* '}' -> ^( STARTBLOCK '{' ) ( statement )* ^( ENDBLOCK '}' ) | statement -> ^( STARTBLOCK ) statement ^( ENDBLOCK ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==65) ) {
                alt16=1;
            }
            else if ( (LA16_0==ID||(LA16_0>=INT && LA16_0<=BOOLEAN_)||LA16_0==41||(LA16_0>=57 && LA16_0<=59)||LA16_0==61||LA16_0==67||(LA16_0>=69 && LA16_0<=82)||LA16_0==86||LA16_0==88||(LA16_0>=92 && LA16_0<=97)||(LA16_0>=100 && LA16_0<=101)||(LA16_0>=104 && LA16_0<=107)) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // CPP.g:64:3: '{' ( statement )* '}'
                    {
                    char_literal53=(Token)match(input,65,FOLLOW_65_in_body401); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_65.add(char_literal53);

                    // CPP.g:64:6: ( statement )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==ID||(LA15_0>=INT && LA15_0<=BOOLEAN_)||LA15_0==41||(LA15_0>=57 && LA15_0<=59)||LA15_0==61||LA15_0==67||(LA15_0>=69 && LA15_0<=82)||LA15_0==86||LA15_0==88||(LA15_0>=92 && LA15_0<=97)||(LA15_0>=100 && LA15_0<=101)||(LA15_0>=104 && LA15_0<=107)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // CPP.g:64:6: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_body402);
                    	    statement54=statement();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statement.add(statement54.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    char_literal55=(Token)match(input,66,FOLLOW_66_in_body404); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_66.add(char_literal55);



                    // AST REWRITE
                    // elements: 66, 65, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 64:20: -> ^( STARTBLOCK '{' ) ( statement )* ^( ENDBLOCK '}' )
                    {
                        // CPP.g:64:23: ^( STARTBLOCK '{' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STARTBLOCK, "STARTBLOCK"), root_1);

                        adaptor.addChild(root_1, stream_65.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }
                        // CPP.g:64:41: ( statement )*
                        while ( stream_statement.hasNext() ) {
                            adaptor.addChild(root_0, stream_statement.nextTree());

                        }
                        stream_statement.reset();
                        // CPP.g:64:52: ^( ENDBLOCK '}' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ENDBLOCK, "ENDBLOCK"), root_1);

                        adaptor.addChild(root_1, stream_66.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // CPP.g:65:3: statement
                    {
                    pushFollow(FOLLOW_statement_in_body425);
                    statement56=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement56.getTree());


                    // AST REWRITE
                    // elements: statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 65:13: -> ^( STARTBLOCK ) statement ^( ENDBLOCK )
                    {
                        // CPP.g:65:16: ^( STARTBLOCK )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STARTBLOCK, "STARTBLOCK"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }
                        adaptor.addChild(root_0, stream_statement.nextTree());
                        // CPP.g:65:40: ^( ENDBLOCK )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ENDBLOCK, "ENDBLOCK"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
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
        }
        return retval;
    }
    // $ANTLR end "body"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // CPP.g:67:1: statement : ( jump_statement ';' -> ^( JUMP jump_statement ) | ( expression_statement )? ';' | declaration_statement | if_statement -> ^( IF if_statement ) | switch_statement -> ^( SWITCH switch_statement ) | for_statement -> ^( FOR for_statement ) | while_statement -> ^( WHILE while_statement ) | dowhile_statement -> ^( DOWHILE dowhile_statement ) );
    public final CPPParser.statement_return statement() throws RecognitionException {
        CPPParser.statement_return retval = new CPPParser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal58=null;
        Token char_literal60=null;
        CPPParser.jump_statement_return jump_statement57 = null;

        CPPParser.expression_statement_return expression_statement59 = null;

        CPPParser.declaration_statement_return declaration_statement61 = null;

        CPPParser.if_statement_return if_statement62 = null;

        CPPParser.switch_statement_return switch_statement63 = null;

        CPPParser.for_statement_return for_statement64 = null;

        CPPParser.while_statement_return while_statement65 = null;

        CPPParser.dowhile_statement_return dowhile_statement66 = null;


        Object char_literal58_tree=null;
        Object char_literal60_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleSubtreeStream stream_for_statement=new RewriteRuleSubtreeStream(adaptor,"rule for_statement");
        RewriteRuleSubtreeStream stream_dowhile_statement=new RewriteRuleSubtreeStream(adaptor,"rule dowhile_statement");
        RewriteRuleSubtreeStream stream_if_statement=new RewriteRuleSubtreeStream(adaptor,"rule if_statement");
        RewriteRuleSubtreeStream stream_switch_statement=new RewriteRuleSubtreeStream(adaptor,"rule switch_statement");
        RewriteRuleSubtreeStream stream_while_statement=new RewriteRuleSubtreeStream(adaptor,"rule while_statement");
        RewriteRuleSubtreeStream stream_jump_statement=new RewriteRuleSubtreeStream(adaptor,"rule jump_statement");
        try {
            // CPP.g:68:2: ( jump_statement ';' -> ^( JUMP jump_statement ) | ( expression_statement )? ';' | declaration_statement | if_statement -> ^( IF if_statement ) | switch_statement -> ^( SWITCH switch_statement ) | for_statement -> ^( FOR for_statement ) | while_statement -> ^( WHILE while_statement ) | dowhile_statement -> ^( DOWHILE dowhile_statement ) )
            int alt18=8;
            switch ( input.LA(1) ) {
            case 80:
            case 81:
            case 82:
                {
                alt18=1;
                }
                break;
            case ID:
            case INT:
            case FLOAT:
            case CHAR:
            case BOOLEAN_:
            case 41:
            case 57:
            case 58:
            case 59:
            case 61:
            case 67:
            case 79:
            case 95:
            case 96:
            case 97:
            case 100:
            case 101:
            case 104:
            case 105:
            case 106:
            case 107:
                {
                alt18=2;
                }
                break;
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
                {
                alt18=3;
                }
                break;
            case 86:
                {
                alt18=4;
                }
                break;
            case 88:
                {
                alt18=5;
                }
                break;
            case 92:
                {
                alt18=6;
                }
                break;
            case 93:
                {
                alt18=7;
                }
                break;
            case 94:
                {
                alt18=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // CPP.g:68:3: jump_statement ';'
                    {
                    pushFollow(FOLLOW_jump_statement_in_statement446);
                    jump_statement57=jump_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_jump_statement.add(jump_statement57.getTree());
                    char_literal58=(Token)match(input,41,FOLLOW_41_in_statement448); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_41.add(char_literal58);



                    // AST REWRITE
                    // elements: jump_statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 68:22: -> ^( JUMP jump_statement )
                    {
                        // CPP.g:68:25: ^( JUMP jump_statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(JUMP, "JUMP"), root_1);

                        adaptor.addChild(root_1, stream_jump_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // CPP.g:69:3: ( expression_statement )? ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    // CPP.g:69:3: ( expression_statement )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==ID||(LA17_0>=INT && LA17_0<=BOOLEAN_)||(LA17_0>=57 && LA17_0<=59)||LA17_0==61||LA17_0==67||LA17_0==79||(LA17_0>=95 && LA17_0<=97)||(LA17_0>=100 && LA17_0<=101)||(LA17_0>=104 && LA17_0<=107)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // CPP.g:69:3: expression_statement
                            {
                            pushFollow(FOLLOW_expression_statement_in_statement460);
                            expression_statement59=expression_statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_statement59.getTree());

                            }
                            break;

                    }

                    char_literal60=(Token)match(input,41,FOLLOW_41_in_statement462); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal60_tree = (Object)adaptor.create(char_literal60);
                    adaptor.addChild(root_0, char_literal60_tree);
                    }

                    }
                    break;
                case 3 :
                    // CPP.g:70:3: declaration_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_declaration_statement_in_statement466);
                    declaration_statement61=declaration_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration_statement61.getTree());

                    }
                    break;
                case 4 :
                    // CPP.g:71:3: if_statement
                    {
                    pushFollow(FOLLOW_if_statement_in_statement470);
                    if_statement62=if_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_if_statement.add(if_statement62.getTree());


                    // AST REWRITE
                    // elements: if_statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 71:16: -> ^( IF if_statement )
                    {
                        // CPP.g:71:19: ^( IF if_statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);

                        adaptor.addChild(root_1, stream_if_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // CPP.g:72:3: switch_statement
                    {
                    pushFollow(FOLLOW_switch_statement_in_statement482);
                    switch_statement63=switch_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_switch_statement.add(switch_statement63.getTree());


                    // AST REWRITE
                    // elements: switch_statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 72:20: -> ^( SWITCH switch_statement )
                    {
                        // CPP.g:72:23: ^( SWITCH switch_statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SWITCH, "SWITCH"), root_1);

                        adaptor.addChild(root_1, stream_switch_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // CPP.g:73:3: for_statement
                    {
                    pushFollow(FOLLOW_for_statement_in_statement494);
                    for_statement64=for_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_for_statement.add(for_statement64.getTree());


                    // AST REWRITE
                    // elements: for_statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 73:17: -> ^( FOR for_statement )
                    {
                        // CPP.g:73:20: ^( FOR for_statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);

                        adaptor.addChild(root_1, stream_for_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // CPP.g:74:3: while_statement
                    {
                    pushFollow(FOLLOW_while_statement_in_statement506);
                    while_statement65=while_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_while_statement.add(while_statement65.getTree());


                    // AST REWRITE
                    // elements: while_statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 74:19: -> ^( WHILE while_statement )
                    {
                        // CPP.g:74:22: ^( WHILE while_statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);

                        adaptor.addChild(root_1, stream_while_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // CPP.g:75:3: dowhile_statement
                    {
                    pushFollow(FOLLOW_dowhile_statement_in_statement518);
                    dowhile_statement66=dowhile_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dowhile_statement.add(dowhile_statement66.getTree());


                    // AST REWRITE
                    // elements: dowhile_statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 75:21: -> ^( DOWHILE dowhile_statement )
                    {
                        // CPP.g:75:24: ^( DOWHILE dowhile_statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOWHILE, "DOWHILE"), root_1);

                        adaptor.addChild(root_1, stream_dowhile_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
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
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class jump_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "jump_statement"
    // CPP.g:77:1: jump_statement : ( 'break' | 'continue' | 'goto' ID );
    public final CPPParser.jump_statement_return jump_statement() throws RecognitionException {
        CPPParser.jump_statement_return retval = new CPPParser.jump_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal67=null;
        Token string_literal68=null;
        Token string_literal69=null;
        Token ID70=null;

        Object string_literal67_tree=null;
        Object string_literal68_tree=null;
        Object string_literal69_tree=null;
        Object ID70_tree=null;

        try {
            // CPP.g:78:2: ( 'break' | 'continue' | 'goto' ID )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt19=1;
                }
                break;
            case 81:
                {
                alt19=2;
                }
                break;
            case 82:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // CPP.g:78:3: 'break'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal67=(Token)match(input,80,FOLLOW_80_in_jump_statement535); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal67_tree = (Object)adaptor.create(string_literal67);
                    adaptor.addChild(root_0, string_literal67_tree);
                    }

                    }
                    break;
                case 2 :
                    // CPP.g:79:3: 'continue'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal68=(Token)match(input,81,FOLLOW_81_in_jump_statement539); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal68_tree = (Object)adaptor.create(string_literal68);
                    adaptor.addChild(root_0, string_literal68_tree);
                    }

                    }
                    break;
                case 3 :
                    // CPP.g:80:3: 'goto' ID
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal69=(Token)match(input,82,FOLLOW_82_in_jump_statement543); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal69_tree = (Object)adaptor.create(string_literal69);
                    adaptor.addChild(root_0, string_literal69_tree);
                    }
                    ID70=(Token)match(input,ID,FOLLOW_ID_in_jump_statement545); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID70_tree = (Object)adaptor.create(ID70);
                    adaptor.addChild(root_0, ID70_tree);
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
        }
        return retval;
    }
    // $ANTLR end "jump_statement"

    public static class expression_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression_statement"
    // CPP.g:82:1: expression_statement : ( assignment -> ^( ASSIGNMENT assignment ) | cin -> ^( CIN cin ) | cout -> ^( COUT cout ) | system -> ^( SYSTEM system ) | return_ -> ^( RETURN return_ ) );
    public final CPPParser.expression_statement_return expression_statement() throws RecognitionException {
        CPPParser.expression_statement_return retval = new CPPParser.expression_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CPPParser.assignment_return assignment71 = null;

        CPPParser.cin_return cin72 = null;

        CPPParser.cout_return cout73 = null;

        CPPParser.system_return system74 = null;

        CPPParser.return__return return_75 = null;


        RewriteRuleSubtreeStream stream_system=new RewriteRuleSubtreeStream(adaptor,"rule system");
        RewriteRuleSubtreeStream stream_cout=new RewriteRuleSubtreeStream(adaptor,"rule cout");
        RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
        RewriteRuleSubtreeStream stream_return_=new RewriteRuleSubtreeStream(adaptor,"rule return_");
        RewriteRuleSubtreeStream stream_cin=new RewriteRuleSubtreeStream(adaptor,"rule cin");
        try {
            // CPP.g:83:2: ( assignment -> ^( ASSIGNMENT assignment ) | cin -> ^( CIN cin ) | cout -> ^( COUT cout ) | system -> ^( SYSTEM system ) | return_ -> ^( RETURN return_ ) )
            int alt20=5;
            switch ( input.LA(1) ) {
            case ID:
            case INT:
            case FLOAT:
            case CHAR:
            case BOOLEAN_:
            case 58:
            case 67:
            case 79:
            case 97:
            case 100:
            case 101:
            case 104:
            case 105:
            case 106:
            case 107:
                {
                alt20=1;
                }
                break;
            case 57:
                {
                int LA20_2 = input.LA(2);

                if ( (LA20_2==58) ) {
                    int LA20_7 = input.LA(3);

                    if ( (LA20_7==59) ) {
                        alt20=2;
                    }
                    else if ( (LA20_7==61) ) {
                        alt20=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 7, input);

                        throw nvae;
                    }
                }
                else if ( (LA20_2==ID||(LA20_2>=INT && LA20_2<=CHAR)||LA20_2==67||LA20_2==97) ) {
                    alt20=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    throw nvae;
                }
                }
                break;
            case 59:
                {
                alt20=2;
                }
                break;
            case 61:
                {
                alt20=3;
                }
                break;
            case 95:
                {
                alt20=4;
                }
                break;
            case 96:
                {
                alt20=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // CPP.g:83:3: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_expression_statement554);
                    assignment71=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignment.add(assignment71.getTree());


                    // AST REWRITE
                    // elements: assignment
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 83:14: -> ^( ASSIGNMENT assignment )
                    {
                        // CPP.g:83:17: ^( ASSIGNMENT assignment )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_1);

                        adaptor.addChild(root_1, stream_assignment.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // CPP.g:84:3: cin
                    {
                    pushFollow(FOLLOW_cin_in_expression_statement566);
                    cin72=cin();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_cin.add(cin72.getTree());


                    // AST REWRITE
                    // elements: cin
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 84:7: -> ^( CIN cin )
                    {
                        // CPP.g:84:10: ^( CIN cin )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CIN, "CIN"), root_1);

                        adaptor.addChild(root_1, stream_cin.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // CPP.g:85:3: cout
                    {
                    pushFollow(FOLLOW_cout_in_expression_statement578);
                    cout73=cout();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_cout.add(cout73.getTree());


                    // AST REWRITE
                    // elements: cout
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 85:8: -> ^( COUT cout )
                    {
                        // CPP.g:85:11: ^( COUT cout )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COUT, "COUT"), root_1);

                        adaptor.addChild(root_1, stream_cout.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // CPP.g:86:3: system
                    {
                    pushFollow(FOLLOW_system_in_expression_statement590);
                    system74=system();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_system.add(system74.getTree());


                    // AST REWRITE
                    // elements: system
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 86:10: -> ^( SYSTEM system )
                    {
                        // CPP.g:86:13: ^( SYSTEM system )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SYSTEM, "SYSTEM"), root_1);

                        adaptor.addChild(root_1, stream_system.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // CPP.g:87:3: return_
                    {
                    pushFollow(FOLLOW_return__in_expression_statement602);
                    return_75=return_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_return_.add(return_75.getTree());


                    // AST REWRITE
                    // elements: return_
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 87:11: -> ^( RETURN return_ )
                    {
                        // CPP.g:87:14: ^( RETURN return_ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_1);

                        adaptor.addChild(root_1, stream_return_.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
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
        }
        return retval;
    }
    // $ANTLR end "expression_statement"

    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // CPP.g:89:1: assignment : operator18 ;
    public final CPPParser.assignment_return assignment() throws RecognitionException {
        CPPParser.assignment_return retval = new CPPParser.assignment_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CPPParser.operator18_return operator1876 = null;



        try {
            // CPP.g:90:2: ( operator18 )
            // CPP.g:90:3: operator18
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_operator18_in_assignment619);
            operator1876=operator18();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, operator1876.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "assignment"

    public static class cin_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cin"
    // CPP.g:92:1: cin : ( 'std' '::' )? 'cin' ( '>>' ID )+ ;
    public final CPPParser.cin_return cin() throws RecognitionException {
        CPPParser.cin_return retval = new CPPParser.cin_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal77=null;
        Token string_literal78=null;
        Token string_literal79=null;
        Token string_literal80=null;
        Token ID81=null;

        Object string_literal77_tree=null;
        Object string_literal78_tree=null;
        Object string_literal79_tree=null;
        Object string_literal80_tree=null;
        Object ID81_tree=null;

        try {
            // CPP.g:93:2: ( ( 'std' '::' )? 'cin' ( '>>' ID )+ )
            // CPP.g:93:3: ( 'std' '::' )? 'cin' ( '>>' ID )+
            {
            root_0 = (Object)adaptor.nil();

            // CPP.g:93:3: ( 'std' '::' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==57) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // CPP.g:93:4: 'std' '::'
                    {
                    string_literal77=(Token)match(input,57,FOLLOW_57_in_cin629); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal77_tree = (Object)adaptor.create(string_literal77);
                    adaptor.addChild(root_0, string_literal77_tree);
                    }
                    string_literal78=(Token)match(input,58,FOLLOW_58_in_cin630); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal78_tree = (Object)adaptor.create(string_literal78);
                    adaptor.addChild(root_0, string_literal78_tree);
                    }

                    }
                    break;

            }

            string_literal79=(Token)match(input,59,FOLLOW_59_in_cin633); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal79_tree = (Object)adaptor.create(string_literal79);
            adaptor.addChild(root_0, string_literal79_tree);
            }
            // CPP.g:93:20: ( '>>' ID )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==83) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // CPP.g:93:21: '>>' ID
            	    {
            	    string_literal80=(Token)match(input,83,FOLLOW_83_in_cin635); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal80_tree = (Object)adaptor.create(string_literal80);
            	    adaptor.addChild(root_0, string_literal80_tree);
            	    }
            	    ID81=(Token)match(input,ID,FOLLOW_ID_in_cin636); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ID81_tree = (Object)adaptor.create(ID81);
            	    adaptor.addChild(root_0, ID81_tree);
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
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
        }
        return retval;
    }
    // $ANTLR end "cin"

    public static class cout_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cout"
    // CPP.g:95:1: cout : ( 'std' operator1 )? 'cout' ( '<<' ( STRING | operator14 | 'std' operator1 'endl' | 'endl' | 'setw(' INT ')' ) )+ ;
    public final CPPParser.cout_return cout() throws RecognitionException {
        CPPParser.cout_return retval = new CPPParser.cout_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal82=null;
        Token string_literal84=null;
        Token string_literal85=null;
        Token STRING86=null;
        Token string_literal88=null;
        Token string_literal90=null;
        Token string_literal91=null;
        Token string_literal92=null;
        Token INT93=null;
        Token char_literal94=null;
        CPPParser.operator1_return operator183 = null;

        CPPParser.operator14_return operator1487 = null;

        CPPParser.operator1_return operator189 = null;


        Object string_literal82_tree=null;
        Object string_literal84_tree=null;
        Object string_literal85_tree=null;
        Object STRING86_tree=null;
        Object string_literal88_tree=null;
        Object string_literal90_tree=null;
        Object string_literal91_tree=null;
        Object string_literal92_tree=null;
        Object INT93_tree=null;
        Object char_literal94_tree=null;

        try {
            // CPP.g:96:2: ( ( 'std' operator1 )? 'cout' ( '<<' ( STRING | operator14 | 'std' operator1 'endl' | 'endl' | 'setw(' INT ')' ) )+ )
            // CPP.g:96:3: ( 'std' operator1 )? 'cout' ( '<<' ( STRING | operator14 | 'std' operator1 'endl' | 'endl' | 'setw(' INT ')' ) )+
            {
            root_0 = (Object)adaptor.nil();

            // CPP.g:96:3: ( 'std' operator1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==57) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // CPP.g:96:4: 'std' operator1
                    {
                    string_literal82=(Token)match(input,57,FOLLOW_57_in_cout648); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal82_tree = (Object)adaptor.create(string_literal82);
                    adaptor.addChild(root_0, string_literal82_tree);
                    }
                    pushFollow(FOLLOW_operator1_in_cout649);
                    operator183=operator1();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, operator183.getTree());

                    }
                    break;

            }

            string_literal84=(Token)match(input,61,FOLLOW_61_in_cout652); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal84_tree = (Object)adaptor.create(string_literal84);
            adaptor.addChild(root_0, string_literal84_tree);
            }
            // CPP.g:96:26: ( '<<' ( STRING | operator14 | 'std' operator1 'endl' | 'endl' | 'setw(' INT ')' ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==84) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // CPP.g:96:27: '<<' ( STRING | operator14 | 'std' operator1 'endl' | 'endl' | 'setw(' INT ')' )
            	    {
            	    string_literal85=(Token)match(input,84,FOLLOW_84_in_cout654); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal85_tree = (Object)adaptor.create(string_literal85);
            	    adaptor.addChild(root_0, string_literal85_tree);
            	    }
            	    // CPP.g:96:31: ( STRING | operator14 | 'std' operator1 'endl' | 'endl' | 'setw(' INT ')' )
            	    int alt24=5;
            	    switch ( input.LA(1) ) {
            	    case STRING:
            	        {
            	        alt24=1;
            	        }
            	        break;
            	    case ID:
            	    case INT:
            	    case FLOAT:
            	    case CHAR:
            	    case BOOLEAN_:
            	    case 58:
            	    case 67:
            	    case 79:
            	    case 97:
            	    case 100:
            	    case 101:
            	    case 104:
            	    case 105:
            	    case 106:
            	    case 107:
            	        {
            	        alt24=2;
            	        }
            	        break;
            	    case 57:
            	        {
            	        alt24=3;
            	        }
            	        break;
            	    case 60:
            	        {
            	        alt24=4;
            	        }
            	        break;
            	    case 85:
            	        {
            	        alt24=5;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt24) {
            	        case 1 :
            	            // CPP.g:96:32: STRING
            	            {
            	            STRING86=(Token)match(input,STRING,FOLLOW_STRING_in_cout656); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STRING86_tree = (Object)adaptor.create(STRING86);
            	            adaptor.addChild(root_0, STRING86_tree);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // CPP.g:96:39: operator14
            	            {
            	            pushFollow(FOLLOW_operator14_in_cout658);
            	            operator1487=operator14();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, operator1487.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // CPP.g:96:50: 'std' operator1 'endl'
            	            {
            	            string_literal88=(Token)match(input,57,FOLLOW_57_in_cout660); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal88_tree = (Object)adaptor.create(string_literal88);
            	            adaptor.addChild(root_0, string_literal88_tree);
            	            }
            	            pushFollow(FOLLOW_operator1_in_cout661);
            	            operator189=operator1();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, operator189.getTree());
            	            string_literal90=(Token)match(input,60,FOLLOW_60_in_cout662); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal90_tree = (Object)adaptor.create(string_literal90);
            	            adaptor.addChild(root_0, string_literal90_tree);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // CPP.g:96:71: 'endl'
            	            {
            	            string_literal91=(Token)match(input,60,FOLLOW_60_in_cout664); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal91_tree = (Object)adaptor.create(string_literal91);
            	            adaptor.addChild(root_0, string_literal91_tree);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // CPP.g:96:78: 'setw(' INT ')'
            	            {
            	            string_literal92=(Token)match(input,85,FOLLOW_85_in_cout666); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            string_literal92_tree = (Object)adaptor.create(string_literal92);
            	            adaptor.addChild(root_0, string_literal92_tree);
            	            }
            	            INT93=(Token)match(input,INT,FOLLOW_INT_in_cout667); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            INT93_tree = (Object)adaptor.create(INT93);
            	            adaptor.addChild(root_0, INT93_tree);
            	            }
            	            char_literal94=(Token)match(input,68,FOLLOW_68_in_cout668); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal94_tree = (Object)adaptor.create(char_literal94);
            	            adaptor.addChild(root_0, char_literal94_tree);
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
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
        }
        return retval;
    }
    // $ANTLR end "cout"

    public static class if_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_statement"
    // CPP.g:98:1: if_statement : 'if' '(' condition ')' body ( ( 'else' )=> else_statement )? -> ^( CONDITION condition ) body ( ^( ELSE else_statement ) )? ;
    public final CPPParser.if_statement_return if_statement() throws RecognitionException {
        CPPParser.if_statement_return retval = new CPPParser.if_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal95=null;
        Token char_literal96=null;
        Token char_literal98=null;
        CPPParser.condition_return condition97 = null;

        CPPParser.body_return body99 = null;

        CPPParser.else_statement_return else_statement100 = null;


        Object string_literal95_tree=null;
        Object char_literal96_tree=null;
        Object char_literal98_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_else_statement=new RewriteRuleSubtreeStream(adaptor,"rule else_statement");
        try {
            // CPP.g:99:2: ( 'if' '(' condition ')' body ( ( 'else' )=> else_statement )? -> ^( CONDITION condition ) body ( ^( ELSE else_statement ) )? )
            // CPP.g:99:3: 'if' '(' condition ')' body ( ( 'else' )=> else_statement )?
            {
            string_literal95=(Token)match(input,86,FOLLOW_86_in_if_statement680); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_86.add(string_literal95);

            char_literal96=(Token)match(input,67,FOLLOW_67_in_if_statement681); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_67.add(char_literal96);

            pushFollow(FOLLOW_condition_in_if_statement682);
            condition97=condition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_condition.add(condition97.getTree());
            char_literal98=(Token)match(input,68,FOLLOW_68_in_if_statement683); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_68.add(char_literal98);

            pushFollow(FOLLOW_body_in_if_statement684);
            body99=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_body.add(body99.getTree());
            // CPP.g:99:27: ( ( 'else' )=> else_statement )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==87) ) {
                int LA26_1 = input.LA(2);

                if ( (synpred1_CPP()) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // CPP.g:99:28: ( 'else' )=> else_statement
                    {
                    pushFollow(FOLLOW_else_statement_in_if_statement691);
                    else_statement100=else_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_else_statement.add(else_statement100.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: body, else_statement, condition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 100:2: -> ^( CONDITION condition ) body ( ^( ELSE else_statement ) )?
            {
                // CPP.g:100:5: ^( CONDITION condition )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_1);

                adaptor.addChild(root_1, stream_condition.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                adaptor.addChild(root_0, stream_body.nextTree());
                // CPP.g:100:33: ( ^( ELSE else_statement ) )?
                if ( stream_else_statement.hasNext() ) {
                    // CPP.g:100:33: ^( ELSE else_statement )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSE, "ELSE"), root_1);

                    adaptor.addChild(root_1, stream_else_statement.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_else_statement.reset();

            }

            retval.tree = root_0;}
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
        }
        return retval;
    }
    // $ANTLR end "if_statement"

    public static class else_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "else_statement"
    // CPP.g:103:1: else_statement : 'else' body ;
    public final CPPParser.else_statement_return else_statement() throws RecognitionException {
        CPPParser.else_statement_return retval = new CPPParser.else_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal101=null;
        CPPParser.body_return body102 = null;


        Object string_literal101_tree=null;

        try {
            // CPP.g:104:2: ( 'else' body )
            // CPP.g:104:3: 'else' body
            {
            root_0 = (Object)adaptor.nil();

            string_literal101=(Token)match(input,87,FOLLOW_87_in_else_statement723); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal101_tree = (Object)adaptor.create(string_literal101);
            adaptor.addChild(root_0, string_literal101_tree);
            }
            pushFollow(FOLLOW_body_in_else_statement725);
            body102=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, body102.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "else_statement"

    public static class condition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condition"
    // CPP.g:106:1: condition : ( operator14 | cin );
    public final CPPParser.condition_return condition() throws RecognitionException {
        CPPParser.condition_return retval = new CPPParser.condition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        CPPParser.operator14_return operator14103 = null;

        CPPParser.cin_return cin104 = null;



        try {
            // CPP.g:107:2: ( operator14 | cin )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==ID||(LA27_0>=INT && LA27_0<=BOOLEAN_)||LA27_0==58||LA27_0==67||LA27_0==79||LA27_0==97||(LA27_0>=100 && LA27_0<=101)||(LA27_0>=104 && LA27_0<=107)) ) {
                alt27=1;
            }
            else if ( (LA27_0==57||LA27_0==59) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // CPP.g:107:3: operator14
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_operator14_in_condition734);
                    operator14103=operator14();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, operator14103.getTree());

                    }
                    break;
                case 2 :
                    // CPP.g:108:3: cin
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_cin_in_condition738);
                    cin104=cin();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cin104.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "condition"

    public static class switch_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "switch_statement"
    // CPP.g:110:1: switch_statement : 'switch' ( ID ) switchBody ;
    public final CPPParser.switch_statement_return switch_statement() throws RecognitionException {
        CPPParser.switch_statement_return retval = new CPPParser.switch_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal105=null;
        Token ID106=null;
        CPPParser.switchBody_return switchBody107 = null;


        Object string_literal105_tree=null;
        Object ID106_tree=null;

        try {
            // CPP.g:111:2: ( 'switch' ( ID ) switchBody )
            // CPP.g:111:3: 'switch' ( ID ) switchBody
            {
            root_0 = (Object)adaptor.nil();

            string_literal105=(Token)match(input,88,FOLLOW_88_in_switch_statement747); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal105_tree = (Object)adaptor.create(string_literal105);
            adaptor.addChild(root_0, string_literal105_tree);
            }
            // CPP.g:111:11: ( ID )
            // CPP.g:111:12: ID
            {
            ID106=(Token)match(input,ID,FOLLOW_ID_in_switch_statement749); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID106_tree = (Object)adaptor.create(ID106);
            adaptor.addChild(root_0, ID106_tree);
            }

            }

            pushFollow(FOLLOW_switchBody_in_switch_statement752);
            switchBody107=switchBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, switchBody107.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "switch_statement"

    public static class switchBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "switchBody"
    // CPP.g:113:1: switchBody : '{' ( 'case' ID ':' ( statement )* )+ ( 'default' ':' ( statement )* )? '}' -> ^( STARTBLOCK '{' ) ( ^( 'case' ( statement )* ) )+ ( ^( 'default' ( statement )* ) )? ^( ENDBLOCK '}' ) ;
    public final CPPParser.switchBody_return switchBody() throws RecognitionException {
        CPPParser.switchBody_return retval = new CPPParser.switchBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal108=null;
        Token string_literal109=null;
        Token ID110=null;
        Token char_literal111=null;
        Token string_literal113=null;
        Token char_literal114=null;
        Token char_literal116=null;
        CPPParser.statement_return statement112 = null;

        CPPParser.statement_return statement115 = null;


        Object char_literal108_tree=null;
        Object string_literal109_tree=null;
        Object ID110_tree=null;
        Object char_literal111_tree=null;
        Object string_literal113_tree=null;
        Object char_literal114_tree=null;
        Object char_literal116_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // CPP.g:114:2: ( '{' ( 'case' ID ':' ( statement )* )+ ( 'default' ':' ( statement )* )? '}' -> ^( STARTBLOCK '{' ) ( ^( 'case' ( statement )* ) )+ ( ^( 'default' ( statement )* ) )? ^( ENDBLOCK '}' ) )
            // CPP.g:114:3: '{' ( 'case' ID ':' ( statement )* )+ ( 'default' ':' ( statement )* )? '}'
            {
            char_literal108=(Token)match(input,65,FOLLOW_65_in_switchBody761); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_65.add(char_literal108);

            // CPP.g:114:6: ( 'case' ID ':' ( statement )* )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==89) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // CPP.g:114:7: 'case' ID ':' ( statement )*
            	    {
            	    string_literal109=(Token)match(input,89,FOLLOW_89_in_switchBody763); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_89.add(string_literal109);

            	    ID110=(Token)match(input,ID,FOLLOW_ID_in_switchBody765); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ID.add(ID110);

            	    char_literal111=(Token)match(input,90,FOLLOW_90_in_switchBody766); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_90.add(char_literal111);

            	    // CPP.g:114:19: ( statement )*
            	    loop28:
            	    do {
            	        int alt28=2;
            	        int LA28_0 = input.LA(1);

            	        if ( (LA28_0==ID||(LA28_0>=INT && LA28_0<=BOOLEAN_)||LA28_0==41||(LA28_0>=57 && LA28_0<=59)||LA28_0==61||LA28_0==67||(LA28_0>=69 && LA28_0<=82)||LA28_0==86||LA28_0==88||(LA28_0>=92 && LA28_0<=97)||(LA28_0>=100 && LA28_0<=101)||(LA28_0>=104 && LA28_0<=107)) ) {
            	            alt28=1;
            	        }


            	        switch (alt28) {
            	    	case 1 :
            	    	    // CPP.g:114:19: statement
            	    	    {
            	    	    pushFollow(FOLLOW_statement_in_switchBody767);
            	    	    statement112=statement();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) stream_statement.add(statement112.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop28;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);

            // CPP.g:114:31: ( 'default' ':' ( statement )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==91) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // CPP.g:114:32: 'default' ':' ( statement )*
                    {
                    string_literal113=(Token)match(input,91,FOLLOW_91_in_switchBody772); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_91.add(string_literal113);

                    char_literal114=(Token)match(input,90,FOLLOW_90_in_switchBody774); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_90.add(char_literal114);

                    // CPP.g:114:46: ( statement )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==ID||(LA30_0>=INT && LA30_0<=BOOLEAN_)||LA30_0==41||(LA30_0>=57 && LA30_0<=59)||LA30_0==61||LA30_0==67||(LA30_0>=69 && LA30_0<=82)||LA30_0==86||LA30_0==88||(LA30_0>=92 && LA30_0<=97)||(LA30_0>=100 && LA30_0<=101)||(LA30_0>=104 && LA30_0<=107)) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // CPP.g:114:46: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_switchBody776);
                    	    statement115=statement();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statement.add(statement115.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal116=(Token)match(input,66,FOLLOW_66_in_switchBody780); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_66.add(char_literal116);



            // AST REWRITE
            // elements: 65, 89, statement, 66, statement, 91
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 115:2: -> ^( STARTBLOCK '{' ) ( ^( 'case' ( statement )* ) )+ ( ^( 'default' ( statement )* ) )? ^( ENDBLOCK '}' )
            {
                // CPP.g:115:5: ^( STARTBLOCK '{' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STARTBLOCK, "STARTBLOCK"), root_1);

                adaptor.addChild(root_1, stream_65.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                if ( !(stream_89.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_89.hasNext() ) {
                    // CPP.g:115:23: ^( 'case' ( statement )* )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot(stream_89.nextNode(), root_1);

                    // CPP.g:115:32: ( statement )*
                    while ( stream_statement.hasNext() ) {
                        adaptor.addChild(root_1, stream_statement.nextTree());

                    }
                    stream_statement.reset();

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_89.reset();
                // CPP.g:115:45: ( ^( 'default' ( statement )* ) )?
                if ( stream_statement.hasNext()||stream_91.hasNext() ) {
                    // CPP.g:115:45: ^( 'default' ( statement )* )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    root_1 = (Object)adaptor.becomeRoot(stream_91.nextNode(), root_1);

                    // CPP.g:115:57: ( statement )*
                    while ( stream_statement.hasNext() ) {
                        adaptor.addChild(root_1, stream_statement.nextTree());

                    }
                    stream_statement.reset();

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_statement.reset();
                stream_91.reset();
                // CPP.g:115:70: ^( ENDBLOCK '}' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ENDBLOCK, "ENDBLOCK"), root_1);

                adaptor.addChild(root_1, stream_66.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
        }
        return retval;
    }
    // $ANTLR end "switchBody"

    public static class for_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "for_statement"
    // CPP.g:117:1: for_statement : 'for' '(' for_init condition ';' operator18 ')' body -> ^( FORINITAL for_init ) ^( CONDITION condition ) ^( STEP operator18 ) body ;
    public final CPPParser.for_statement_return for_statement() throws RecognitionException {
        CPPParser.for_statement_return retval = new CPPParser.for_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal117=null;
        Token char_literal118=null;
        Token char_literal121=null;
        Token char_literal123=null;
        CPPParser.for_init_return for_init119 = null;

        CPPParser.condition_return condition120 = null;

        CPPParser.operator18_return operator18122 = null;

        CPPParser.body_return body124 = null;


        Object string_literal117_tree=null;
        Object char_literal118_tree=null;
        Object char_literal121_tree=null;
        Object char_literal123_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_for_init=new RewriteRuleSubtreeStream(adaptor,"rule for_init");
        RewriteRuleSubtreeStream stream_operator18=new RewriteRuleSubtreeStream(adaptor,"rule operator18");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // CPP.g:118:2: ( 'for' '(' for_init condition ';' operator18 ')' body -> ^( FORINITAL for_init ) ^( CONDITION condition ) ^( STEP operator18 ) body )
            // CPP.g:118:3: 'for' '(' for_init condition ';' operator18 ')' body
            {
            string_literal117=(Token)match(input,92,FOLLOW_92_in_for_statement821); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_92.add(string_literal117);

            char_literal118=(Token)match(input,67,FOLLOW_67_in_for_statement822); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_67.add(char_literal118);

            pushFollow(FOLLOW_for_init_in_for_statement823);
            for_init119=for_init();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_for_init.add(for_init119.getTree());
            pushFollow(FOLLOW_condition_in_for_statement825);
            condition120=condition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_condition.add(condition120.getTree());
            char_literal121=(Token)match(input,41,FOLLOW_41_in_for_statement826); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_41.add(char_literal121);

            pushFollow(FOLLOW_operator18_in_for_statement827);
            operator18122=operator18();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_operator18.add(operator18122.getTree());
            char_literal123=(Token)match(input,68,FOLLOW_68_in_for_statement828); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_68.add(char_literal123);

            pushFollow(FOLLOW_body_in_for_statement829);
            body124=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_body.add(body124.getTree());


            // AST REWRITE
            // elements: operator18, for_init, body, condition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 118:50: -> ^( FORINITAL for_init ) ^( CONDITION condition ) ^( STEP operator18 ) body
            {
                // CPP.g:118:53: ^( FORINITAL for_init )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORINITAL, "FORINITAL"), root_1);

                adaptor.addChild(root_1, stream_for_init.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // CPP.g:118:75: ^( CONDITION condition )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_1);

                adaptor.addChild(root_1, stream_condition.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // CPP.g:118:98: ^( STEP operator18 )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STEP, "STEP"), root_1);

                adaptor.addChild(root_1, stream_operator18.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                adaptor.addChild(root_0, stream_body.nextTree());

            }

            retval.tree = root_0;}
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
        }
        return retval;
    }
    // $ANTLR end "for_statement"

    public static class for_init_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "for_init"
    // CPP.g:120:1: for_init : ( declaration_statement | operator18 ';' );
    public final CPPParser.for_init_return for_init() throws RecognitionException {
        CPPParser.for_init_return retval = new CPPParser.for_init_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal127=null;
        CPPParser.declaration_statement_return declaration_statement125 = null;

        CPPParser.operator18_return operator18126 = null;


        Object char_literal127_tree=null;

        try {
            // CPP.g:121:2: ( declaration_statement | operator18 ';' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=69 && LA32_0<=78)) ) {
                alt32=1;
            }
            else if ( (LA32_0==ID||(LA32_0>=INT && LA32_0<=BOOLEAN_)||LA32_0==58||LA32_0==67||LA32_0==79||LA32_0==97||(LA32_0>=100 && LA32_0<=101)||(LA32_0>=104 && LA32_0<=107)) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // CPP.g:121:3: declaration_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_declaration_statement_in_for_init861);
                    declaration_statement125=declaration_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration_statement125.getTree());

                    }
                    break;
                case 2 :
                    // CPP.g:122:3: operator18 ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_operator18_in_for_init865);
                    operator18126=operator18();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, operator18126.getTree());
                    char_literal127=(Token)match(input,41,FOLLOW_41_in_for_init866); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal127_tree = (Object)adaptor.create(char_literal127);
                    adaptor.addChild(root_0, char_literal127_tree);
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
        }
        return retval;
    }
    // $ANTLR end "for_init"

    public static class while_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "while_statement"
    // CPP.g:124:1: while_statement : 'while' '(' condition ')' body -> ^( CONDITION condition ) body ;
    public final CPPParser.while_statement_return while_statement() throws RecognitionException {
        CPPParser.while_statement_return retval = new CPPParser.while_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal128=null;
        Token char_literal129=null;
        Token char_literal131=null;
        CPPParser.condition_return condition130 = null;

        CPPParser.body_return body132 = null;


        Object string_literal128_tree=null;
        Object char_literal129_tree=null;
        Object char_literal131_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // CPP.g:125:2: ( 'while' '(' condition ')' body -> ^( CONDITION condition ) body )
            // CPP.g:125:3: 'while' '(' condition ')' body
            {
            string_literal128=(Token)match(input,93,FOLLOW_93_in_while_statement875); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_93.add(string_literal128);

            char_literal129=(Token)match(input,67,FOLLOW_67_in_while_statement876); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_67.add(char_literal129);

            pushFollow(FOLLOW_condition_in_while_statement877);
            condition130=condition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_condition.add(condition130.getTree());
            char_literal131=(Token)match(input,68,FOLLOW_68_in_while_statement878); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_68.add(char_literal131);

            pushFollow(FOLLOW_body_in_while_statement879);
            body132=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_body.add(body132.getTree());


            // AST REWRITE
            // elements: condition, body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 125:30: -> ^( CONDITION condition ) body
            {
                // CPP.g:125:33: ^( CONDITION condition )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_1);

                adaptor.addChild(root_1, stream_condition.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                adaptor.addChild(root_0, stream_body.nextTree());

            }

            retval.tree = root_0;}
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
        }
        return retval;
    }
    // $ANTLR end "while_statement"

    public static class dowhile_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dowhile_statement"
    // CPP.g:127:1: dowhile_statement : 'do' body 'while' '(' condition ')' ';' -> body ^( CONDITION condition ) ;
    public final CPPParser.dowhile_statement_return dowhile_statement() throws RecognitionException {
        CPPParser.dowhile_statement_return retval = new CPPParser.dowhile_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal133=null;
        Token string_literal135=null;
        Token char_literal136=null;
        Token char_literal138=null;
        Token char_literal139=null;
        CPPParser.body_return body134 = null;

        CPPParser.condition_return condition137 = null;


        Object string_literal133_tree=null;
        Object string_literal135_tree=null;
        Object char_literal136_tree=null;
        Object char_literal138_tree=null;
        Object char_literal139_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        try {
            // CPP.g:128:2: ( 'do' body 'while' '(' condition ')' ';' -> body ^( CONDITION condition ) )
            // CPP.g:128:3: 'do' body 'while' '(' condition ')' ';'
            {
            string_literal133=(Token)match(input,94,FOLLOW_94_in_dowhile_statement898); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_94.add(string_literal133);

            pushFollow(FOLLOW_body_in_dowhile_statement900);
            body134=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_body.add(body134.getTree());
            string_literal135=(Token)match(input,93,FOLLOW_93_in_dowhile_statement902); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_93.add(string_literal135);

            char_literal136=(Token)match(input,67,FOLLOW_67_in_dowhile_statement903); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_67.add(char_literal136);

            pushFollow(FOLLOW_condition_in_dowhile_statement904);
            condition137=condition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_condition.add(condition137.getTree());
            char_literal138=(Token)match(input,68,FOLLOW_68_in_dowhile_statement905); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_68.add(char_literal138);

            char_literal139=(Token)match(input,41,FOLLOW_41_in_dowhile_statement906); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_41.add(char_literal139);



            // AST REWRITE
            // elements: condition, body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 128:38: -> body ^( CONDITION condition )
            {
                adaptor.addChild(root_0, stream_body.nextTree());
                // CPP.g:128:46: ^( CONDITION condition )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_1);

                adaptor.addChild(root_1, stream_condition.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
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
        }
        return retval;
    }
    // $ANTLR end "dowhile_statement"

    public static class system_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "system"
    // CPP.g:130:1: system : 'system' '(' STRING ')' ;
    public final CPPParser.system_return system() throws RecognitionException {
        CPPParser.system_return retval = new CPPParser.system_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal140=null;
        Token char_literal141=null;
        Token STRING142=null;
        Token char_literal143=null;

        Object string_literal140_tree=null;
        Object char_literal141_tree=null;
        Object STRING142_tree=null;
        Object char_literal143_tree=null;

        try {
            // CPP.g:131:2: ( 'system' '(' STRING ')' )
            // CPP.g:131:3: 'system' '(' STRING ')'
            {
            root_0 = (Object)adaptor.nil();

            string_literal140=(Token)match(input,95,FOLLOW_95_in_system924); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal140_tree = (Object)adaptor.create(string_literal140);
            adaptor.addChild(root_0, string_literal140_tree);
            }
            char_literal141=(Token)match(input,67,FOLLOW_67_in_system925); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal141_tree = (Object)adaptor.create(char_literal141);
            adaptor.addChild(root_0, char_literal141_tree);
            }
            STRING142=(Token)match(input,STRING,FOLLOW_STRING_in_system926); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING142_tree = (Object)adaptor.create(STRING142);
            adaptor.addChild(root_0, STRING142_tree);
            }
            char_literal143=(Token)match(input,68,FOLLOW_68_in_system927); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal143_tree = (Object)adaptor.create(char_literal143);
            adaptor.addChild(root_0, char_literal143_tree);
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
        }
        return retval;
    }
    // $ANTLR end "system"

    public static class return__return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "return_"
    // CPP.g:133:1: return_ : 'return' return_value ;
    public final CPPParser.return__return return_() throws RecognitionException {
        CPPParser.return__return retval = new CPPParser.return__return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal144=null;
        CPPParser.return_value_return return_value145 = null;


        Object string_literal144_tree=null;

        try {
            // CPP.g:134:2: ( 'return' return_value )
            // CPP.g:134:3: 'return' return_value
            {
            root_0 = (Object)adaptor.nil();

            string_literal144=(Token)match(input,96,FOLLOW_96_in_return_936); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal144_tree = (Object)adaptor.create(string_literal144);
            adaptor.addChild(root_0, string_literal144_tree);
            }
            pushFollow(FOLLOW_return_value_in_return_938);
            return_value145=return_value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, return_value145.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "return_"

    public static class return_value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "return_value"
    // CPP.g:137:1: return_value : ( INT | FLOAT | STRING | CHAR | ID | BOOLEAN_ | '0' );
    public final CPPParser.return_value_return return_value() throws RecognitionException {
        CPPParser.return_value_return retval = new CPPParser.return_value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set146=null;

        Object set146_tree=null;

        try {
            // CPP.g:138:2: ( INT | FLOAT | STRING | CHAR | ID | BOOLEAN_ | '0' )
            // CPP.g:
            {
            root_0 = (Object)adaptor.nil();

            set146=(Token)input.LT(1);
            if ( (input.LA(1)>=ID && input.LA(1)<=BOOLEAN_)||input.LA(1)==97 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set146));
                state.errorRecovery=false;state.failed=false;
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
        }
        return retval;
    }
    // $ANTLR end "return_value"

    public static class operator1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator1"
    // CPP.g:146:1: operator1 : ( '(' operator16 ')' | ID | '0' | INT | FLOAT | CHAR | '::' );
    public final CPPParser.operator1_return operator1() throws RecognitionException {
        CPPParser.operator1_return retval = new CPPParser.operator1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal147=null;
        Token char_literal149=null;
        Token ID150=null;
        Token char_literal151=null;
        Token INT152=null;
        Token FLOAT153=null;
        Token CHAR154=null;
        Token string_literal155=null;
        CPPParser.operator16_return operator16148 = null;


        Object char_literal147_tree=null;
        Object char_literal149_tree=null;
        Object ID150_tree=null;
        Object char_literal151_tree=null;
        Object INT152_tree=null;
        Object FLOAT153_tree=null;
        Object CHAR154_tree=null;
        Object string_literal155_tree=null;

        try {
            // CPP.g:147:2: ( '(' operator16 ')' | ID | '0' | INT | FLOAT | CHAR | '::' )
            int alt33=7;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt33=1;
                }
                break;
            case ID:
                {
                alt33=2;
                }
                break;
            case 97:
                {
                alt33=3;
                }
                break;
            case INT:
                {
                alt33=4;
                }
                break;
            case FLOAT:
                {
                alt33=5;
                }
                break;
            case CHAR:
                {
                alt33=6;
                }
                break;
            case 58:
                {
                alt33=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // CPP.g:147:3: '(' operator16 ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal147=(Token)match(input,67,FOLLOW_67_in_operator1981); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal147_tree = (Object)adaptor.create(char_literal147);
                    adaptor.addChild(root_0, char_literal147_tree);
                    }
                    pushFollow(FOLLOW_operator16_in_operator1982);
                    operator16148=operator16();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, operator16148.getTree());
                    char_literal149=(Token)match(input,68,FOLLOW_68_in_operator1983); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal149_tree = (Object)adaptor.create(char_literal149);
                    adaptor.addChild(root_0, char_literal149_tree);
                    }

                    }
                    break;
                case 2 :
                    // CPP.g:148:3: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID150=(Token)match(input,ID,FOLLOW_ID_in_operator1987); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID150_tree = (Object)adaptor.create(ID150);
                    adaptor.addChild(root_0, ID150_tree);
                    }

                    }
                    break;
                case 3 :
                    // CPP.g:149:3: '0'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal151=(Token)match(input,97,FOLLOW_97_in_operator1991); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal151_tree = (Object)adaptor.create(char_literal151);
                    adaptor.addChild(root_0, char_literal151_tree);
                    }

                    }
                    break;
                case 4 :
                    // CPP.g:150:3: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT152=(Token)match(input,INT,FOLLOW_INT_in_operator1995); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT152_tree = (Object)adaptor.create(INT152);
                    adaptor.addChild(root_0, INT152_tree);
                    }

                    }
                    break;
                case 5 :
                    // CPP.g:151:3: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();

                    FLOAT153=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_operator1999); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOAT153_tree = (Object)adaptor.create(FLOAT153);
                    adaptor.addChild(root_0, FLOAT153_tree);
                    }

                    }
                    break;
                case 6 :
                    // CPP.g:152:3: CHAR
                    {
                    root_0 = (Object)adaptor.nil();

                    CHAR154=(Token)match(input,CHAR,FOLLOW_CHAR_in_operator11003); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CHAR154_tree = (Object)adaptor.create(CHAR154);
                    adaptor.addChild(root_0, CHAR154_tree);
                    }

                    }
                    break;
                case 7 :
                    // CPP.g:153:3: '::'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal155=(Token)match(input,58,FOLLOW_58_in_operator11007); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal155_tree = (Object)adaptor.create(string_literal155);
                    adaptor.addChild(root_0, string_literal155_tree);
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
        }
        return retval;
    }
    // $ANTLR end "operator1"

    public static class operator2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator2"
    // CPP.g:155:1: operator2 : operator1 ( ( '[' operator6 ']' | '++' | '--' | '.' ID | '->' ID )* | '(' ( operator18 )? ')' ) ;
    public final CPPParser.operator2_return operator2() throws RecognitionException {
        CPPParser.operator2_return retval = new CPPParser.operator2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal157=null;
        Token char_literal159=null;
        Token string_literal160=null;
        Token string_literal161=null;
        Token char_literal162=null;
        Token ID163=null;
        Token string_literal164=null;
        Token ID165=null;
        Token char_literal166=null;
        Token char_literal168=null;
        CPPParser.operator1_return operator1156 = null;

        CPPParser.operator6_return operator6158 = null;

        CPPParser.operator18_return operator18167 = null;


        Object char_literal157_tree=null;
        Object char_literal159_tree=null;
        Object string_literal160_tree=null;
        Object string_literal161_tree=null;
        Object char_literal162_tree=null;
        Object ID163_tree=null;
        Object string_literal164_tree=null;
        Object ID165_tree=null;
        Object char_literal166_tree=null;
        Object char_literal168_tree=null;

        try {
            // CPP.g:156:2: ( operator1 ( ( '[' operator6 ']' | '++' | '--' | '.' ID | '->' ID )* | '(' ( operator18 )? ')' ) )
            // CPP.g:156:3: operator1 ( ( '[' operator6 ']' | '++' | '--' | '.' ID | '->' ID )* | '(' ( operator18 )? ')' )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_operator1_in_operator21016);
            operator1156=operator1();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, operator1156.getTree());
            // CPP.g:156:12: ( ( '[' operator6 ']' | '++' | '--' | '.' ID | '->' ID )* | '(' ( operator18 )? ')' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==41||(LA36_0>=44 && LA36_0<=45)||(LA36_0>=63 && LA36_0<=64)||LA36_0==66||LA36_0==68||LA36_0==79||LA36_0==84||(LA36_0>=98 && LA36_0<=104)||(LA36_0>=107 && LA36_0<=123)) ) {
                alt36=1;
            }
            else if ( (LA36_0==67) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // CPP.g:156:13: ( '[' operator6 ']' | '++' | '--' | '.' ID | '->' ID )*
                    {
                    // CPP.g:156:13: ( '[' operator6 ']' | '++' | '--' | '.' ID | '->' ID )*
                    loop34:
                    do {
                        int alt34=6;
                        switch ( input.LA(1) ) {
                        case 98:
                            {
                            alt34=1;
                            }
                            break;
                        case 100:
                            {
                            alt34=2;
                            }
                            break;
                        case 101:
                            {
                            alt34=3;
                            }
                            break;
                        case 102:
                            {
                            alt34=4;
                            }
                            break;
                        case 103:
                            {
                            alt34=5;
                            }
                            break;

                        }

                        switch (alt34) {
                    	case 1 :
                    	    // CPP.g:156:14: '[' operator6 ']'
                    	    {
                    	    char_literal157=(Token)match(input,98,FOLLOW_98_in_operator21019); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal157_tree = (Object)adaptor.create(char_literal157);
                    	    adaptor.addChild(root_0, char_literal157_tree);
                    	    }
                    	    pushFollow(FOLLOW_operator6_in_operator21020);
                    	    operator6158=operator6();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, operator6158.getTree());
                    	    char_literal159=(Token)match(input,99,FOLLOW_99_in_operator21021); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal159_tree = (Object)adaptor.create(char_literal159);
                    	    adaptor.addChild(root_0, char_literal159_tree);
                    	    }

                    	    }
                    	    break;
                    	case 2 :
                    	    // CPP.g:156:30: '++'
                    	    {
                    	    string_literal160=(Token)match(input,100,FOLLOW_100_in_operator21023); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    string_literal160_tree = (Object)adaptor.create(string_literal160);
                    	    adaptor.addChild(root_0, string_literal160_tree);
                    	    }

                    	    }
                    	    break;
                    	case 3 :
                    	    // CPP.g:156:35: '--'
                    	    {
                    	    string_literal161=(Token)match(input,101,FOLLOW_101_in_operator21025); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    string_literal161_tree = (Object)adaptor.create(string_literal161);
                    	    adaptor.addChild(root_0, string_literal161_tree);
                    	    }

                    	    }
                    	    break;
                    	case 4 :
                    	    // CPP.g:156:40: '.' ID
                    	    {
                    	    char_literal162=(Token)match(input,102,FOLLOW_102_in_operator21027); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal162_tree = (Object)adaptor.create(char_literal162);
                    	    adaptor.addChild(root_0, char_literal162_tree);
                    	    }
                    	    ID163=(Token)match(input,ID,FOLLOW_ID_in_operator21028); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    ID163_tree = (Object)adaptor.create(ID163);
                    	    adaptor.addChild(root_0, ID163_tree);
                    	    }

                    	    }
                    	    break;
                    	case 5 :
                    	    // CPP.g:156:46: '->' ID
                    	    {
                    	    string_literal164=(Token)match(input,103,FOLLOW_103_in_operator21030); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    string_literal164_tree = (Object)adaptor.create(string_literal164);
                    	    adaptor.addChild(root_0, string_literal164_tree);
                    	    }
                    	    ID165=(Token)match(input,ID,FOLLOW_ID_in_operator21031); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    ID165_tree = (Object)adaptor.create(ID165);
                    	    adaptor.addChild(root_0, ID165_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // CPP.g:156:55: '(' ( operator18 )? ')'
                    {
                    char_literal166=(Token)match(input,67,FOLLOW_67_in_operator21035); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal166_tree = (Object)adaptor.create(char_literal166);
                    adaptor.addChild(root_0, char_literal166_tree);
                    }
                    // CPP.g:156:58: ( operator18 )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==ID||(LA35_0>=INT && LA35_0<=BOOLEAN_)||LA35_0==58||LA35_0==67||LA35_0==79||LA35_0==97||(LA35_0>=100 && LA35_0<=101)||(LA35_0>=104 && LA35_0<=107)) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // CPP.g:156:58: operator18
                            {
                            pushFollow(FOLLOW_operator18_in_operator21036);
                            operator18167=operator18();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, operator18167.getTree());

                            }
                            break;

                    }

                    char_literal168=(Token)match(input,68,FOLLOW_68_in_operator21038); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal168_tree = (Object)adaptor.create(char_literal168);
                    adaptor.addChild(root_0, char_literal168_tree);
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
        }
        return retval;
    }
    // $ANTLR end "operator2"

    public static class operator3_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator3"
    // CPP.g:158:1: operator3 : ( '++' | '--' | '-' | '!' | '~' | '(' type ')' | '*' | '&' )* operator2 ;
    public final CPPParser.operator3_return operator3() throws RecognitionException {
        CPPParser.operator3_return retval = new CPPParser.operator3_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal169=null;
        Token string_literal170=null;
        Token char_literal171=null;
        Token char_literal172=null;
        Token char_literal173=null;
        Token char_literal174=null;
        Token char_literal176=null;
        Token char_literal177=null;
        Token char_literal178=null;
        CPPParser.type_return type175 = null;

        CPPParser.operator2_return operator2179 = null;


        Object string_literal169_tree=null;
        Object string_literal170_tree=null;
        Object char_literal171_tree=null;
        Object char_literal172_tree=null;
        Object char_literal173_tree=null;
        Object char_literal174_tree=null;
        Object char_literal176_tree=null;
        Object char_literal177_tree=null;
        Object char_literal178_tree=null;

        try {
            // CPP.g:159:2: ( ( '++' | '--' | '-' | '!' | '~' | '(' type ')' | '*' | '&' )* operator2 )
            // CPP.g:159:3: ( '++' | '--' | '-' | '!' | '~' | '(' type ')' | '*' | '&' )* operator2
            {
            root_0 = (Object)adaptor.nil();

            // CPP.g:159:3: ( '++' | '--' | '-' | '!' | '~' | '(' type ')' | '*' | '&' )*
            loop37:
            do {
                int alt37=9;
                alt37 = dfa37.predict(input);
                switch (alt37) {
            	case 1 :
            	    // CPP.g:159:4: '++'
            	    {
            	    string_literal169=(Token)match(input,100,FOLLOW_100_in_operator31049); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal169_tree = (Object)adaptor.create(string_literal169);
            	    adaptor.addChild(root_0, string_literal169_tree);
            	    }

            	    }
            	    break;
            	case 2 :
            	    // CPP.g:159:9: '--'
            	    {
            	    string_literal170=(Token)match(input,101,FOLLOW_101_in_operator31051); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal170_tree = (Object)adaptor.create(string_literal170);
            	    adaptor.addChild(root_0, string_literal170_tree);
            	    }

            	    }
            	    break;
            	case 3 :
            	    // CPP.g:159:14: '-'
            	    {
            	    char_literal171=(Token)match(input,104,FOLLOW_104_in_operator31053); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal171_tree = (Object)adaptor.create(char_literal171);
            	    adaptor.addChild(root_0, char_literal171_tree);
            	    }

            	    }
            	    break;
            	case 4 :
            	    // CPP.g:159:18: '!'
            	    {
            	    char_literal172=(Token)match(input,105,FOLLOW_105_in_operator31055); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal172_tree = (Object)adaptor.create(char_literal172);
            	    adaptor.addChild(root_0, char_literal172_tree);
            	    }

            	    }
            	    break;
            	case 5 :
            	    // CPP.g:159:22: '~'
            	    {
            	    char_literal173=(Token)match(input,106,FOLLOW_106_in_operator31057); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal173_tree = (Object)adaptor.create(char_literal173);
            	    adaptor.addChild(root_0, char_literal173_tree);
            	    }

            	    }
            	    break;
            	case 6 :
            	    // CPP.g:159:26: '(' type ')'
            	    {
            	    char_literal174=(Token)match(input,67,FOLLOW_67_in_operator31059); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal174_tree = (Object)adaptor.create(char_literal174);
            	    adaptor.addChild(root_0, char_literal174_tree);
            	    }
            	    pushFollow(FOLLOW_type_in_operator31060);
            	    type175=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type175.getTree());
            	    char_literal176=(Token)match(input,68,FOLLOW_68_in_operator31061); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal176_tree = (Object)adaptor.create(char_literal176);
            	    adaptor.addChild(root_0, char_literal176_tree);
            	    }

            	    }
            	    break;
            	case 7 :
            	    // CPP.g:159:37: '*'
            	    {
            	    char_literal177=(Token)match(input,79,FOLLOW_79_in_operator31063); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal177_tree = (Object)adaptor.create(char_literal177);
            	    adaptor.addChild(root_0, char_literal177_tree);
            	    }

            	    }
            	    break;
            	case 8 :
            	    // CPP.g:159:41: '&'
            	    {
            	    char_literal178=(Token)match(input,107,FOLLOW_107_in_operator31065); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal178_tree = (Object)adaptor.create(char_literal178);
            	    adaptor.addChild(root_0, char_literal178_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            pushFollow(FOLLOW_operator2_in_operator31068);
            operator2179=operator2();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, operator2179.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "operator3"

    public static class operator5_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator5"
    // CPP.g:161:1: operator5 : operator3 ( ( '*' | '/' | '%' ) operator3 )* ;
    public final CPPParser.operator5_return operator5() throws RecognitionException {
        CPPParser.operator5_return retval = new CPPParser.operator5_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set181=null;
        CPPParser.operator3_return operator3180 = null;

        CPPParser.operator3_return operator3182 = null;


        Object set181_tree=null;

        try {
            // CPP.g:162:2: ( operator3 ( ( '*' | '/' | '%' ) operator3 )* )
            // CPP.g:162:3: operator3 ( ( '*' | '/' | '%' ) operator3 )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_operator3_in_operator51077);
            operator3180=operator3();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, operator3180.getTree());
            // CPP.g:162:12: ( ( '*' | '/' | '%' ) operator3 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==79||(LA38_0>=108 && LA38_0<=109)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // CPP.g:162:13: ( '*' | '/' | '%' ) operator3
            	    {
            	    set181=(Token)input.LT(1);
            	    if ( input.LA(1)==79||(input.LA(1)>=108 && input.LA(1)<=109) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set181));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_operator3_in_operator51086);
            	    operator3182=operator3();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, operator3182.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
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
        }
        return retval;
    }
    // $ANTLR end "operator5"

    public static class operator6_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator6"
    // CPP.g:164:1: operator6 : operator5 ( ( '+' | '-' ) operator5 )* ;
    public final CPPParser.operator6_return operator6() throws RecognitionException {
        CPPParser.operator6_return retval = new CPPParser.operator6_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set184=null;
        CPPParser.operator5_return operator5183 = null;

        CPPParser.operator5_return operator5185 = null;


        Object set184_tree=null;

        try {
            // CPP.g:165:2: ( operator5 ( ( '+' | '-' ) operator5 )* )
            // CPP.g:165:3: operator5 ( ( '+' | '-' ) operator5 )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_operator5_in_operator61097);
            operator5183=operator5();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, operator5183.getTree());
            // CPP.g:165:12: ( ( '+' | '-' ) operator5 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==104||LA39_0==110) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // CPP.g:165:13: ( '+' | '-' ) operator5
            	    {
            	    set184=(Token)input.LT(1);
            	    if ( input.LA(1)==104||input.LA(1)==110 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set184));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_operator5_in_operator61104);
            	    operator5185=operator5();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, operator5185.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
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
        }
        return retval;
    }
    // $ANTLR end "operator6"

    public static class operator8_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator8"
    // CPP.g:167:1: operator8 : ( operator6 ( ( '<' | '<=' | '>' | '>=' ) operator6 )? | BOOLEAN_ );
    public final CPPParser.operator8_return operator8() throws RecognitionException {
        CPPParser.operator8_return retval = new CPPParser.operator8_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set187=null;
        Token BOOLEAN_189=null;
        CPPParser.operator6_return operator6186 = null;

        CPPParser.operator6_return operator6188 = null;


        Object set187_tree=null;
        Object BOOLEAN_189_tree=null;

        try {
            // CPP.g:168:2: ( operator6 ( ( '<' | '<=' | '>' | '>=' ) operator6 )? | BOOLEAN_ )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==ID||(LA41_0>=INT && LA41_0<=CHAR)||LA41_0==58||LA41_0==67||LA41_0==79||LA41_0==97||(LA41_0>=100 && LA41_0<=101)||(LA41_0>=104 && LA41_0<=107)) ) {
                alt41=1;
            }
            else if ( (LA41_0==BOOLEAN_) ) {
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
                    // CPP.g:168:3: operator6 ( ( '<' | '<=' | '>' | '>=' ) operator6 )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_operator6_in_operator81115);
                    operator6186=operator6();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, operator6186.getTree());
                    // CPP.g:168:12: ( ( '<' | '<=' | '>' | '>=' ) operator6 )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( ((LA40_0>=44 && LA40_0<=45)||(LA40_0>=111 && LA40_0<=112)) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // CPP.g:168:13: ( '<' | '<=' | '>' | '>=' ) operator6
                            {
                            set187=(Token)input.LT(1);
                            if ( (input.LA(1)>=44 && input.LA(1)<=45)||(input.LA(1)>=111 && input.LA(1)<=112) ) {
                                input.consume();
                                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set187));
                                state.errorRecovery=false;state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }

                            pushFollow(FOLLOW_operator6_in_operator81126);
                            operator6188=operator6();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, operator6188.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // CPP.g:169:3: BOOLEAN_
                    {
                    root_0 = (Object)adaptor.nil();

                    BOOLEAN_189=(Token)match(input,BOOLEAN_,FOLLOW_BOOLEAN__in_operator81132); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BOOLEAN_189_tree = (Object)adaptor.create(BOOLEAN_189);
                    adaptor.addChild(root_0, BOOLEAN_189_tree);
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
        }
        return retval;
    }
    // $ANTLR end "operator8"

    public static class operator9_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator9"
    // CPP.g:171:1: operator9 : operator8 ( ( '==' | '!=' ) operator8 )? ;
    public final CPPParser.operator9_return operator9() throws RecognitionException {
        CPPParser.operator9_return retval = new CPPParser.operator9_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set191=null;
        CPPParser.operator8_return operator8190 = null;

        CPPParser.operator8_return operator8192 = null;


        Object set191_tree=null;

        try {
            // CPP.g:172:2: ( operator8 ( ( '==' | '!=' ) operator8 )? )
            // CPP.g:172:3: operator8 ( ( '==' | '!=' ) operator8 )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_operator8_in_operator91141);
            operator8190=operator8();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, operator8190.getTree());
            // CPP.g:172:12: ( ( '==' | '!=' ) operator8 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=113 && LA42_0<=114)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // CPP.g:172:13: ( '==' | '!=' ) operator8
                    {
                    set191=(Token)input.LT(1);
                    if ( (input.LA(1)>=113 && input.LA(1)<=114) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set191));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_operator8_in_operator91148);
                    operator8192=operator8();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, operator8192.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "operator9"

    public static class operator10_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator10"
    // CPP.g:174:1: operator10 : operator9 ( '&' operator9 )* ;
    public final CPPParser.operator10_return operator10() throws RecognitionException {
        CPPParser.operator10_return retval = new CPPParser.operator10_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal194=null;
        CPPParser.operator9_return operator9193 = null;

        CPPParser.operator9_return operator9195 = null;


        Object char_literal194_tree=null;

        try {
            // CPP.g:175:2: ( operator9 ( '&' operator9 )* )
            // CPP.g:175:3: operator9 ( '&' operator9 )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_operator9_in_operator101159);
            operator9193=operator9();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, operator9193.getTree());
            // CPP.g:175:12: ( '&' operator9 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==107) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // CPP.g:175:13: '&' operator9
            	    {
            	    char_literal194=(Token)match(input,107,FOLLOW_107_in_operator101161); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal194_tree = (Object)adaptor.create(char_literal194);
            	    adaptor.addChild(root_0, char_literal194_tree);
            	    }
            	    pushFollow(FOLLOW_operator9_in_operator101162);
            	    operator9195=operator9();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, operator9195.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
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
        }
        return retval;
    }
    // $ANTLR end "operator10"

    public static class operator11_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator11"
    // CPP.g:177:1: operator11 : operator10 ( '^' operator10 )* ;
    public final CPPParser.operator11_return operator11() throws RecognitionException {
        CPPParser.operator11_return retval = new CPPParser.operator11_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal197=null;
        CPPParser.operator10_return operator10196 = null;

        CPPParser.operator10_return operator10198 = null;


        Object char_literal197_tree=null;

        try {
            // CPP.g:178:2: ( operator10 ( '^' operator10 )* )
            // CPP.g:178:3: operator10 ( '^' operator10 )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_operator10_in_operator111173);
            operator10196=operator10();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, operator10196.getTree());
            // CPP.g:178:13: ( '^' operator10 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==115) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // CPP.g:178:14: '^' operator10
            	    {
            	    char_literal197=(Token)match(input,115,FOLLOW_115_in_operator111175); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal197_tree = (Object)adaptor.create(char_literal197);
            	    adaptor.addChild(root_0, char_literal197_tree);
            	    }
            	    pushFollow(FOLLOW_operator10_in_operator111176);
            	    operator10198=operator10();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, operator10198.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
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
        }
        return retval;
    }
    // $ANTLR end "operator11"

    public static class operator12_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator12"
    // CPP.g:180:1: operator12 : operator11 ( '|' operator11 )* ;
    public final CPPParser.operator12_return operator12() throws RecognitionException {
        CPPParser.operator12_return retval = new CPPParser.operator12_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal200=null;
        CPPParser.operator11_return operator11199 = null;

        CPPParser.operator11_return operator11201 = null;


        Object char_literal200_tree=null;

        try {
            // CPP.g:181:2: ( operator11 ( '|' operator11 )* )
            // CPP.g:181:3: operator11 ( '|' operator11 )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_operator11_in_operator121187);
            operator11199=operator11();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, operator11199.getTree());
            // CPP.g:181:13: ( '|' operator11 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==116) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // CPP.g:181:14: '|' operator11
            	    {
            	    char_literal200=(Token)match(input,116,FOLLOW_116_in_operator121189); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal200_tree = (Object)adaptor.create(char_literal200);
            	    adaptor.addChild(root_0, char_literal200_tree);
            	    }
            	    pushFollow(FOLLOW_operator11_in_operator121190);
            	    operator11201=operator11();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, operator11201.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
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
        }
        return retval;
    }
    // $ANTLR end "operator12"

    public static class operator13_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator13"
    // CPP.g:183:1: operator13 : operator12 ( '&&' operator12 )* ;
    public final CPPParser.operator13_return operator13() throws RecognitionException {
        CPPParser.operator13_return retval = new CPPParser.operator13_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal203=null;
        CPPParser.operator12_return operator12202 = null;

        CPPParser.operator12_return operator12204 = null;


        Object string_literal203_tree=null;

        try {
            // CPP.g:184:2: ( operator12 ( '&&' operator12 )* )
            // CPP.g:184:3: operator12 ( '&&' operator12 )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_operator12_in_operator131201);
            operator12202=operator12();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, operator12202.getTree());
            // CPP.g:184:13: ( '&&' operator12 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==117) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // CPP.g:184:14: '&&' operator12
            	    {
            	    string_literal203=(Token)match(input,117,FOLLOW_117_in_operator131203); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal203_tree = (Object)adaptor.create(string_literal203);
            	    adaptor.addChild(root_0, string_literal203_tree);
            	    }
            	    pushFollow(FOLLOW_operator12_in_operator131204);
            	    operator12204=operator12();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, operator12204.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
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
        }
        return retval;
    }
    // $ANTLR end "operator13"

    public static class operator14_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator14"
    // CPP.g:186:1: operator14 : operator13 ( '||' operator13 )* ;
    public final CPPParser.operator14_return operator14() throws RecognitionException {
        CPPParser.operator14_return retval = new CPPParser.operator14_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal206=null;
        CPPParser.operator13_return operator13205 = null;

        CPPParser.operator13_return operator13207 = null;


        Object string_literal206_tree=null;

        try {
            // CPP.g:187:2: ( operator13 ( '||' operator13 )* )
            // CPP.g:187:3: operator13 ( '||' operator13 )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_operator13_in_operator141215);
            operator13205=operator13();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, operator13205.getTree());
            // CPP.g:187:13: ( '||' operator13 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==118) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // CPP.g:187:14: '||' operator13
            	    {
            	    string_literal206=(Token)match(input,118,FOLLOW_118_in_operator141217); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal206_tree = (Object)adaptor.create(string_literal206);
            	    adaptor.addChild(root_0, string_literal206_tree);
            	    }
            	    pushFollow(FOLLOW_operator13_in_operator141218);
            	    operator13207=operator13();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, operator13207.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
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
        }
        return retval;
    }
    // $ANTLR end "operator14"

    public static class operator16_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator16"
    // CPP.g:189:1: operator16 : operator14 ( ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' ) operator14 )? ;
    public final CPPParser.operator16_return operator16() throws RecognitionException {
        CPPParser.operator16_return retval = new CPPParser.operator16_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set209=null;
        CPPParser.operator14_return operator14208 = null;

        CPPParser.operator14_return operator14210 = null;


        Object set209_tree=null;

        try {
            // CPP.g:190:2: ( operator14 ( ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' ) operator14 )? )
            // CPP.g:190:3: operator14 ( ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' ) operator14 )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_operator14_in_operator161229);
            operator14208=operator14();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, operator14208.getTree());
            // CPP.g:190:13: ( ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' ) operator14 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==64||(LA48_0>=119 && LA48_0<=123)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // CPP.g:190:14: ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' ) operator14
                    {
                    set209=(Token)input.LT(1);
                    if ( input.LA(1)==64||(input.LA(1)>=119 && input.LA(1)<=123) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set209));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_operator14_in_operator161244);
                    operator14210=operator14();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, operator14210.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "operator16"

    public static class operator18_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator18"
    // CPP.g:193:1: operator18 : operator16 ( ',' operator16 )* ;
    public final CPPParser.operator18_return operator18() throws RecognitionException {
        CPPParser.operator18_return retval = new CPPParser.operator18_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal212=null;
        CPPParser.operator16_return operator16211 = null;

        CPPParser.operator16_return operator16213 = null;


        Object char_literal212_tree=null;

        try {
            // CPP.g:194:2: ( operator16 ( ',' operator16 )* )
            // CPP.g:194:3: operator16 ( ',' operator16 )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_operator16_in_operator181256);
            operator16211=operator16();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, operator16211.getTree());
            // CPP.g:194:13: ( ',' operator16 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==63) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // CPP.g:194:14: ',' operator16
            	    {
            	    char_literal212=(Token)match(input,63,FOLLOW_63_in_operator181258); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal212_tree = (Object)adaptor.create(char_literal212);
            	    adaptor.addChild(root_0, char_literal212_tree);
            	    }
            	    pushFollow(FOLLOW_operator16_in_operator181259);
            	    operator16213=operator16();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, operator16213.getTree());

            	    }
            	    break;

            	default :
            	    break loop49;
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
        }
        return retval;
    }
    // $ANTLR end "operator18"

    // $ANTLR start synpred1_CPP
    public final void synpred1_CPP_fragment() throws RecognitionException {   
        // CPP.g:99:28: ( 'else' )
        // CPP.g:99:29: 'else'
        {
        match(input,87,FOLLOW_87_in_synpred1_CPP688); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_CPP

    // Delegated rules

    public final boolean synpred1_CPP() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_CPP_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA37 dfa37 = new DFA37(this);
    static final String DFA7_eotS =
        "\12\uffff";
    static final String DFA7_eofS =
        "\12\uffff";
    static final String DFA7_minS =
        "\1\105\1\106\2\34\1\uffff\1\51\2\34\2\uffff";
    static final String DFA7_maxS =
        "\2\116\2\141\1\uffff\1\147\2\153\2\uffff";
    static final String DFA7_acceptS =
        "\4\uffff\1\1\3\uffff\1\2\1\1";
    static final String DFA7_specialS =
        "\12\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1\11\2",
            "\11\2",
            "\1\5\1\uffff\3\4\31\uffff\1\4\10\uffff\1\4\13\uffff\1\3\21"+
            "\uffff\1\4",
            "\1\5\1\uffff\3\4\31\uffff\1\4\10\uffff\1\4\35\uffff\1\4",
            "",
            "\1\4\25\uffff\2\4\2\uffff\1\6\36\uffff\1\4\1\uffff\4\4",
            "\1\4\1\uffff\4\4\30\uffff\1\4\10\uffff\1\4\1\7\12\10\1\4\21"+
            "\uffff\1\4\2\uffff\2\4\2\uffff\4\4",
            "\1\10\1\uffff\4\10\7\uffff\1\11\17\uffff\3\10\1\uffff\1\10"+
            "\1\uffff\2\4\1\10\1\uffff\1\10\1\uffff\16\10\3\uffff\1\10\1"+
            "\uffff\1\10\3\uffff\6\10\2\uffff\2\10\2\uffff\4\10",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "38:1: declaration_statement : ( type declare ( ',' declare )* ';' -> ^( DECLARE type declare ( ',' declare )* ';' ) | function -> ^( FUNCTION function ) );";
        }
    }
    static final String DFA37_eotS =
        "\13\uffff";
    static final String DFA37_eofS =
        "\13\uffff";
    static final String DFA37_minS =
        "\2\34\11\uffff";
    static final String DFA37_maxS =
        "\2\153\11\uffff";
    static final String DFA37_acceptS =
        "\2\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\7\1\10\1\6";
    static final String DFA37_specialS =
        "\13\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\2\1\uffff\3\2\31\uffff\1\2\10\uffff\1\1\13\uffff\1\10\21"+
            "\uffff\1\2\2\uffff\1\3\1\4\2\uffff\1\5\1\6\1\7\1\11",
            "\1\2\1\uffff\4\2\30\uffff\1\2\10\uffff\1\2\1\uffff\12\12\1"+
            "\2\21\uffff\1\2\2\uffff\2\2\2\uffff\4\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "()* loopback of 159:3: ( '++' | '--' | '-' | '!' | '~' | '(' type ')' | '*' | '&' )*";
        }
    }
 

    public static final BitSet FOLLOW_preprocessor_in_cpp_root97 = new BitSet(new long[]{0x0100060000000002L,0x0000000000007FE0L});
    public static final BitSet FOLLOW_41_in_cpp_root99 = new BitSet(new long[]{0x0100060000000002L,0x0000000000007FE0L});
    public static final BitSet FOLLOW_using_declaration_in_cpp_root101 = new BitSet(new long[]{0x0100060000000002L,0x0000000000007FE0L});
    public static final BitSet FOLLOW_declaration_statement_in_cpp_root103 = new BitSet(new long[]{0x0100060000000002L,0x0000000000007FE0L});
    public static final BitSet FOLLOW_42_in_preprocessor140 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_preprocessor141 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_preprocessor142 = new BitSet(new long[]{0x00FFC00000000000L});
    public static final BitSet FOLLOW_header_file_in_preprocessor143 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_preprocessor144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_header_file153 = new BitSet(new long[]{0x00FF800000000000L});
    public static final BitSet FOLLOW_set_in_header_file155 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_header_file174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_using_declaration184 = new BitSet(new long[]{0x4200000000000000L});
    public static final BitSet FOLLOW_namespace_in_using_declaration187 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_57_in_using_declaration189 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_using_declaration190 = new BitSet(new long[]{0x3800000000000000L});
    public static final BitSet FOLLOW_set_in_using_declaration191 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_using_declaration200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_namespace209 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_58_in_namespace210 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_namespace212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_declaration_statement221 = new BitSet(new long[]{0x04000001D0000000L,0x0000000200000008L});
    public static final BitSet FOLLOW_declare_in_declaration_statement223 = new BitSet(new long[]{0x8000020000000000L});
    public static final BitSet FOLLOW_63_in_declaration_statement225 = new BitSet(new long[]{0x04000001D0000000L,0x0000000200000008L});
    public static final BitSet FOLLOW_declare_in_declaration_statement226 = new BitSet(new long[]{0x8000020000000000L});
    public static final BitSet FOLLOW_41_in_declaration_statement229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_declaration_statement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operator2_in_declare267 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_declare269 = new BitSet(new long[]{0x04000003D0000000L,0x00000F3200008008L});
    public static final BitSet FOLLOW_operator14_in_declare270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_declare272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_declare273 = new BitSet(new long[]{0x04000003D0000000L,0x00000F3200008008L});
    public static final BitSet FOLLOW_operator14_in_declare274 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_63_in_declare276 = new BitSet(new long[]{0x04000003D0000000L,0x00000F3200008008L});
    public static final BitSet FOLLOW_operator14_in_declare277 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_declare280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnType_in_function291 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_functionName_in_function293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_function294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007FF0L});
    public static final BitSet FOLLOW_parameterList_in_function295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_function296 = new BitSet(new long[]{0x2F000603D0000000L,0x00000F33F147FFEAL});
    public static final BitSet FOLLOW_body_in_function297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_returnType320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_type329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007FC0L});
    public static final BitSet FOLLOW_set_in_type332 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_type352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_functionName363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameterList373 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_parameterList375 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007FE0L});
    public static final BitSet FOLLOW_parameter_in_parameterList376 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_type_in_parameter389 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ID_in_parameter391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_body401 = new BitSet(new long[]{0x2F000603D0000000L,0x00000F33F147FFEEL});
    public static final BitSet FOLLOW_statement_in_body402 = new BitSet(new long[]{0x2F000603D0000000L,0x00000F33F147FFEEL});
    public static final BitSet FOLLOW_66_in_body404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_body425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_statement_in_statement446 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_statement448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_statement460 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_statement462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_statement_in_statement466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_statement470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switch_statement_in_statement482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_statement_in_statement494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_statement_in_statement506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dowhile_statement_in_statement518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_jump_statement535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_jump_statement539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_jump_statement543 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_jump_statement545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_expression_statement554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cin_in_expression_statement566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cout_in_expression_statement578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_system_in_expression_statement590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return__in_expression_statement602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operator18_in_assignment619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_cin629 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_cin630 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_cin633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_cin635 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_cin636 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_57_in_cout648 = new BitSet(new long[]{0x04000001D0000000L,0x0000000200000008L});
    public static final BitSet FOLLOW_operator1_in_cout649 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_cout652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_cout654 = new BitSet(new long[]{0x16000003F0000000L,0x00000F3200208008L});
    public static final BitSet FOLLOW_STRING_in_cout656 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_operator14_in_cout658 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_57_in_cout660 = new BitSet(new long[]{0x04000001D0000000L,0x0000000200000008L});
    public static final BitSet FOLLOW_operator1_in_cout661 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_cout662 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_60_in_cout664 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_85_in_cout666 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_INT_in_cout667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_cout668 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_86_in_if_statement680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_if_statement681 = new BitSet(new long[]{0x0E000003D0000000L,0x00000F3200008008L});
    public static final BitSet FOLLOW_condition_in_if_statement682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_if_statement683 = new BitSet(new long[]{0x2F000603D0000000L,0x00000F33F147FFEAL});
    public static final BitSet FOLLOW_body_in_if_statement684 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_else_statement_in_if_statement691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_else_statement723 = new BitSet(new long[]{0x2F000603D0000000L,0x00000F33F147FFEAL});
    public static final BitSet FOLLOW_body_in_else_statement725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operator14_in_condition734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cin_in_condition738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_switch_statement747 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_switch_statement749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_switchBody_in_switch_statement752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_switchBody761 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_switchBody763 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_switchBody765 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_switchBody766 = new BitSet(new long[]{0x2F000603D0000000L,0x00000F33FB47FFEEL});
    public static final BitSet FOLLOW_statement_in_switchBody767 = new BitSet(new long[]{0x2F000603D0000000L,0x00000F33FB47FFEEL});
    public static final BitSet FOLLOW_91_in_switchBody772 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_switchBody774 = new BitSet(new long[]{0x2F000603D0000000L,0x00000F33F147FFEEL});
    public static final BitSet FOLLOW_statement_in_switchBody776 = new BitSet(new long[]{0x2F000603D0000000L,0x00000F33F147FFEEL});
    public static final BitSet FOLLOW_66_in_switchBody780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_for_statement821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_for_statement822 = new BitSet(new long[]{0x05000603D0000000L,0x00000F320000FFE8L});
    public static final BitSet FOLLOW_for_init_in_for_statement823 = new BitSet(new long[]{0x0E000003D0000000L,0x00000F3200008008L});
    public static final BitSet FOLLOW_condition_in_for_statement825 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_for_statement826 = new BitSet(new long[]{0x04000003D0000000L,0x00000F3200008008L});
    public static final BitSet FOLLOW_operator18_in_for_statement827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_for_statement828 = new BitSet(new long[]{0x2F000603D0000000L,0x00000F33F147FFEAL});
    public static final BitSet FOLLOW_body_in_for_statement829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_statement_in_for_init861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operator18_in_for_init865 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_for_init866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_while_statement875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_while_statement876 = new BitSet(new long[]{0x0E000003D0000000L,0x00000F3200008008L});
    public static final BitSet FOLLOW_condition_in_while_statement877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_while_statement878 = new BitSet(new long[]{0x2F000603D0000000L,0x00000F33F147FFEAL});
    public static final BitSet FOLLOW_body_in_while_statement879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_dowhile_statement898 = new BitSet(new long[]{0x2F000603D0000000L,0x00000F33F147FFEAL});
    public static final BitSet FOLLOW_body_in_dowhile_statement900 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_dowhile_statement902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_dowhile_statement903 = new BitSet(new long[]{0x0E000003D0000000L,0x00000F3200008008L});
    public static final BitSet FOLLOW_condition_in_dowhile_statement904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_dowhile_statement905 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_dowhile_statement906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_system924 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_system925 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_STRING_in_system926 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_system927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_return_936 = new BitSet(new long[]{0x00000003F0000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_return_value_in_return_938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_return_value0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_operator1981 = new BitSet(new long[]{0x04000003D0000000L,0x00000F3200008008L});
    public static final BitSet FOLLOW_operator16_in_operator1982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_operator1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_operator1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_operator1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_operator1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_operator1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_operator11003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_operator11007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operator1_in_operator21016 = new BitSet(new long[]{0x0000000000000002L,0x000000F400000008L});
    public static final BitSet FOLLOW_98_in_operator21019 = new BitSet(new long[]{0x04000001D0000000L,0x00000F3200008008L});
    public static final BitSet FOLLOW_operator6_in_operator21020 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_operator21021 = new BitSet(new long[]{0x0000000000000002L,0x000000F400000000L});
    public static final BitSet FOLLOW_100_in_operator21023 = new BitSet(new long[]{0x0000000000000002L,0x000000F400000000L});
    public static final BitSet FOLLOW_101_in_operator21025 = new BitSet(new long[]{0x0000000000000002L,0x000000F400000000L});
    public static final BitSet FOLLOW_102_in_operator21027 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_operator21028 = new BitSet(new long[]{0x0000000000000002L,0x000000F400000000L});
    public static final BitSet FOLLOW_103_in_operator21030 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_operator21031 = new BitSet(new long[]{0x0000000000000002L,0x000000F400000000L});
    public static final BitSet FOLLOW_67_in_operator21035 = new BitSet(new long[]{0x04000003D0000000L,0x00000F3200008018L});
    public static final BitSet FOLLOW_operator18_in_operator21036 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_operator21038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_operator31049 = new BitSet(new long[]{0x04000001D0000000L,0x00000F3200008008L});
    public static final BitSet FOLLOW_101_in_operator31051 = new BitSet(new long[]{0x04000001D0000000L,0x00000F3200008008L});
    public static final BitSet FOLLOW_104_in_operator31053 = new BitSet(new long[]{0x04000001D0000000L,0x00000F3200008008L});
    public static final BitSet FOLLOW_105_in_operator31055 = new BitSet(new long[]{0x04000001D0000000L,0x00000F3200008008L});
    public static final BitSet FOLLOW_106_in_operator31057 = new BitSet(new long[]{0x04000001D0000000L,0x00000F3200008008L});
    public static final BitSet FOLLOW_67_in_operator31059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007FE0L});
    public static final BitSet FOLLOW_type_in_operator31060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_operator31061 = new BitSet(new long[]{0x04000001D0000000L,0x00000F3200008008L});
    public static final BitSet FOLLOW_79_in_operator31063 = new BitSet(new long[]{0x04000001D0000000L,0x00000F3200008008L});
    public static final BitSet FOLLOW_107_in_operator31065 = new BitSet(new long[]{0x04000001D0000000L,0x00000F3200008008L});
    public static final BitSet FOLLOW_operator2_in_operator31068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operator3_in_operator51077 = new BitSet(new long[]{0x0000000000000002L,0x0000300000008000L});
    public static final BitSet FOLLOW_set_in_operator51079 = new BitSet(new long[]{0x04000001D0000000L,0x00000F3200008008L});
    public static final BitSet FOLLOW_operator3_in_operator51086 = new BitSet(new long[]{0x0000000000000002L,0x0000300000008000L});
    public static final BitSet FOLLOW_operator5_in_operator61097 = new BitSet(new long[]{0x0000000000000002L,0x0000410000000000L});
    public static final BitSet FOLLOW_set_in_operator61099 = new BitSet(new long[]{0x04000001D0000000L,0x00000F3200008008L});
    public static final BitSet FOLLOW_operator5_in_operator61104 = new BitSet(new long[]{0x0000000000000002L,0x0000410000000000L});
    public static final BitSet FOLLOW_operator6_in_operator81115 = new BitSet(new long[]{0x0000300000000002L,0x0001800000000000L});
    public static final BitSet FOLLOW_set_in_operator81117 = new BitSet(new long[]{0x04000001D0000000L,0x00000F3200008008L});
    public static final BitSet FOLLOW_operator6_in_operator81126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN__in_operator81132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operator8_in_operator91141 = new BitSet(new long[]{0x0000000000000002L,0x0006000000000000L});
    public static final BitSet FOLLOW_set_in_operator91143 = new BitSet(new long[]{0x04000003D0000000L,0x00000F3200008008L});
    public static final BitSet FOLLOW_operator8_in_operator91148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operator9_in_operator101159 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_operator101161 = new BitSet(new long[]{0x04000003D0000000L,0x00000F3200008008L});
    public static final BitSet FOLLOW_operator9_in_operator101162 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_operator10_in_operator111173 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_operator111175 = new BitSet(new long[]{0x04000003D0000000L,0x00000F3200008008L});
    public static final BitSet FOLLOW_operator10_in_operator111176 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_operator11_in_operator121187 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_operator121189 = new BitSet(new long[]{0x04000003D0000000L,0x00000F3200008008L});
    public static final BitSet FOLLOW_operator11_in_operator121190 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_operator12_in_operator131201 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_operator131203 = new BitSet(new long[]{0x04000003D0000000L,0x00000F3200008008L});
    public static final BitSet FOLLOW_operator12_in_operator131204 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_operator13_in_operator141215 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_operator141217 = new BitSet(new long[]{0x04000003D0000000L,0x00000F3200008008L});
    public static final BitSet FOLLOW_operator13_in_operator141218 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_operator14_in_operator161229 = new BitSet(new long[]{0x0000000000000002L,0x0F80000000000001L});
    public static final BitSet FOLLOW_set_in_operator161231 = new BitSet(new long[]{0x04000003D0000000L,0x00000F3200008008L});
    public static final BitSet FOLLOW_operator14_in_operator161244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operator16_in_operator181256 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_operator181258 = new BitSet(new long[]{0x04000003D0000000L,0x00000F3200008008L});
    public static final BitSet FOLLOW_operator16_in_operator181259 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_87_in_synpred1_CPP688 = new BitSet(new long[]{0x0000000000000002L});

}
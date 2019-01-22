// $ANTLR 3.3 Nov 30, 2010 12:50:56 CPP.g 2016-07-19 17:37:02
package analysis;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CPPLexer extends Lexer {
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

    public CPPLexer() {;} 
    public CPPLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CPPLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "CPP.g"; }

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:3:7: ( ';' )
            // CPP.g:3:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:4:7: ( '#' )
            // CPP.g:4:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:5:7: ( 'include' )
            // CPP.g:5:9: 'include'
            {
            match("include"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:6:7: ( '<' )
            // CPP.g:6:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:7:7: ( '>' )
            // CPP.g:7:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:8:7: ( '\"' )
            // CPP.g:8:9: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:9:7: ( 'iostream' )
            // CPP.g:9:9: 'iostream'
            {
            match("iostream"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:10:7: ( 'cmath' )
            // CPP.g:10:9: 'cmath'
            {
            match("cmath"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:11:7: ( 'stdio.h' )
            // CPP.g:11:9: 'stdio.h'
            {
            match("stdio.h"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:12:7: ( 'stdlib.h' )
            // CPP.g:12:9: 'stdlib.h'
            {
            match("stdlib.h"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:13:7: ( 'iomanip' )
            // CPP.g:13:9: 'iomanip'
            {
            match("iomanip"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:14:7: ( 'math.h' )
            // CPP.g:14:9: 'math.h'
            {
            match("math.h"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:15:7: ( 'cstdio' )
            // CPP.g:15:9: 'cstdio'
            {
            match("cstdio"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:16:7: ( 'cstdlib' )
            // CPP.g:16:9: 'cstdlib'
            {
            match("cstdlib"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:17:7: ( 'conio.h' )
            // CPP.g:17:9: 'conio.h'
            {
            match("conio.h"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:18:7: ( 'using' )
            // CPP.g:18:9: 'using'
            {
            match("using"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:19:7: ( 'std' )
            // CPP.g:19:9: 'std'
            {
            match("std"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:20:7: ( '::' )
            // CPP.g:20:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:21:7: ( 'cin' )
            // CPP.g:21:9: 'cin'
            {
            match("cin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:22:7: ( 'endl' )
            // CPP.g:22:9: 'endl'
            {
            match("endl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:23:7: ( 'cout' )
            // CPP.g:23:9: 'cout'
            {
            match("cout"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:24:7: ( 'namespace' )
            // CPP.g:24:9: 'namespace'
            {
            match("namespace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:25:7: ( ',' )
            // CPP.g:25:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:26:7: ( '=' )
            // CPP.g:26:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:27:7: ( '{' )
            // CPP.g:27:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:28:7: ( '}' )
            // CPP.g:28:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:29:7: ( '(' )
            // CPP.g:29:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:30:7: ( ')' )
            // CPP.g:30:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:31:7: ( 'unsigned' )
            // CPP.g:31:9: 'unsigned'
            {
            match("unsigned"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:32:7: ( 'int' )
            // CPP.g:32:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:33:7: ( 'char' )
            // CPP.g:33:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:34:7: ( 'double' )
            // CPP.g:34:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:35:7: ( 'bool' )
            // CPP.g:35:9: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:36:7: ( 'short' )
            // CPP.g:36:9: 'short'
            {
            match("short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:37:7: ( 'long' )
            // CPP.g:37:9: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:38:7: ( 'float' )
            // CPP.g:38:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:39:7: ( 'void' )
            // CPP.g:39:9: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:40:7: ( 'long double' )
            // CPP.g:40:9: 'long double'
            {
            match("long double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:41:7: ( '*' )
            // CPP.g:41:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:42:7: ( 'break' )
            // CPP.g:42:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:43:7: ( 'continue' )
            // CPP.g:43:9: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:44:7: ( 'goto' )
            // CPP.g:44:9: 'goto'
            {
            match("goto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:45:7: ( '>>' )
            // CPP.g:45:9: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:46:7: ( '<<' )
            // CPP.g:46:9: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:47:7: ( 'setw(' )
            // CPP.g:47:9: 'setw('
            {
            match("setw("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:48:7: ( 'if' )
            // CPP.g:48:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:49:7: ( 'else' )
            // CPP.g:49:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:50:7: ( 'switch' )
            // CPP.g:50:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:51:7: ( 'case' )
            // CPP.g:51:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:52:7: ( ':' )
            // CPP.g:52:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:53:7: ( 'default' )
            // CPP.g:53:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:54:7: ( 'for' )
            // CPP.g:54:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:55:7: ( 'while' )
            // CPP.g:55:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:56:7: ( 'do' )
            // CPP.g:56:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:57:7: ( 'system' )
            // CPP.g:57:9: 'system'
            {
            match("system"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:58:7: ( 'return' )
            // CPP.g:58:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:59:7: ( '0' )
            // CPP.g:59:9: '0'
            {
            match('0'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:60:7: ( '[' )
            // CPP.g:60:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:61:7: ( ']' )
            // CPP.g:61:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:62:8: ( '++' )
            // CPP.g:62:10: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:63:8: ( '--' )
            // CPP.g:63:10: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:64:8: ( '.' )
            // CPP.g:64:10: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:65:8: ( '->' )
            // CPP.g:65:10: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:66:8: ( '-' )
            // CPP.g:66:10: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:67:8: ( '!' )
            // CPP.g:67:10: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:68:8: ( '~' )
            // CPP.g:68:10: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:69:8: ( '&' )
            // CPP.g:69:10: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:70:8: ( '/' )
            // CPP.g:70:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:71:8: ( '%' )
            // CPP.g:71:10: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:72:8: ( '+' )
            // CPP.g:72:10: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:73:8: ( '<=' )
            // CPP.g:73:10: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:74:8: ( '>=' )
            // CPP.g:74:10: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:75:8: ( '==' )
            // CPP.g:75:10: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:76:8: ( '!=' )
            // CPP.g:76:10: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:77:8: ( '^' )
            // CPP.g:77:10: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:78:8: ( '|' )
            // CPP.g:78:10: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:79:8: ( '&&' )
            // CPP.g:79:10: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:80:8: ( '||' )
            // CPP.g:80:10: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:81:8: ( '+=' )
            // CPP.g:81:10: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:82:8: ( '-=' )
            // CPP.g:82:10: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:83:8: ( '*=' )
            // CPP.g:83:10: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:84:8: ( '/=' )
            // CPP.g:84:10: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:85:8: ( '%=' )
            // CPP.g:85:10: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "BOOLEAN_"
    public final void mBOOLEAN_() throws RecognitionException {
        try {
            int _type = BOOLEAN_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:197:2: ( 'true' | 'True' | 'TRUE' | 'false' | 'False' | 'FALSE' )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 't':
                {
                alt1=1;
                }
                break;
            case 'T':
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2=='r') ) {
                    alt1=2;
                }
                else if ( (LA1_2=='R') ) {
                    alt1=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 'f':
                {
                alt1=4;
                }
                break;
            case 'F':
                {
                int LA1_4 = input.LA(2);

                if ( (LA1_4=='a') ) {
                    alt1=5;
                }
                else if ( (LA1_4=='A') ) {
                    alt1=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // CPP.g:197:3: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // CPP.g:198:3: 'True'
                    {
                    match("True"); 


                    }
                    break;
                case 3 :
                    // CPP.g:199:3: 'TRUE'
                    {
                    match("TRUE"); 


                    }
                    break;
                case 4 :
                    // CPP.g:200:3: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 5 :
                    // CPP.g:201:3: 'False'
                    {
                    match("False"); 


                    }
                    break;
                case 6 :
                    // CPP.g:202:3: 'FALSE'
                    {
                    match("FALSE"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLEAN_"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:204:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // CPP.g:204:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // CPP.g:204:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // CPP.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:207:5: ( ( '0' .. '9' )+ )
            // CPP.g:207:7: ( '0' .. '9' )+
            {
            // CPP.g:207:7: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // CPP.g:207:8: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:212:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt10=3;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // CPP.g:212:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // CPP.g:212:9: ( '0' .. '9' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // CPP.g:212:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    match('.'); 
                    // CPP.g:212:25: ( '0' .. '9' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // CPP.g:212:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // CPP.g:212:37: ( EXPONENT )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='E'||LA6_0=='e') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // CPP.g:212:37: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // CPP.g:213:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 
                    // CPP.g:213:13: ( '0' .. '9' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // CPP.g:213:14: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    // CPP.g:213:25: ( EXPONENT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='E'||LA8_0=='e') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // CPP.g:213:25: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // CPP.g:214:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // CPP.g:214:9: ( '0' .. '9' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // CPP.g:214:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    mEXPONENT(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:218:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='/') ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1=='/') ) {
                    alt14=1;
                }
                else if ( (LA14_1=='*') ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // CPP.g:218:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // CPP.g:218:14: (~ ( '\\n' | '\\r' ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // CPP.g:218:14: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    // CPP.g:218:28: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // CPP.g:218:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // CPP.g:219:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // CPP.g:219:14: ( options {greedy=false; } : . )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='*') ) {
                            int LA13_1 = input.LA(2);

                            if ( (LA13_1=='/') ) {
                                alt13=2;
                            }
                            else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                                alt13=1;
                            }


                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // CPP.g:219:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    match("*/"); 

                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:222:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // CPP.g:222:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:229:5: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
            // CPP.g:229:8: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // CPP.g:229:12: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='\\') ) {
                    alt15=1;
                }
                else if ( ((LA15_0>='\u0000' && LA15_0<='!')||(LA15_0>='#' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // CPP.g:229:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // CPP.g:229:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPP.g:232:5: ( '\\'' ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) ) '\\'' )
            // CPP.g:232:8: '\\'' ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 
            // CPP.g:232:13: ( ESC_SEQ | ~ ( '\\'' | '\\\\' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\\') ) {
                alt16=1;
            }
            else if ( ((LA16_0>='\u0000' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // CPP.g:232:15: ESC_SEQ
                    {
                    mESC_SEQ(); 

                    }
                    break;
                case 2 :
                    // CPP.g:232:25: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // CPP.g:236:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // CPP.g:236:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // CPP.g:236:22: ( '+' | '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='+'||LA17_0=='-') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // CPP.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // CPP.g:236:33: ( '0' .. '9' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='9')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // CPP.g:236:34: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // CPP.g:239:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // CPP.g:239:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // CPP.g:243:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt19=1;
                    }
                    break;
                case 'u':
                    {
                    alt19=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt19=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // CPP.g:243:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // CPP.g:244:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // CPP.g:245:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // CPP.g:250:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\\') ) {
                int LA20_1 = input.LA(2);

                if ( ((LA20_1>='0' && LA20_1<='3')) ) {
                    int LA20_2 = input.LA(3);

                    if ( ((LA20_2>='0' && LA20_2<='7')) ) {
                        int LA20_4 = input.LA(4);

                        if ( ((LA20_4>='0' && LA20_4<='7')) ) {
                            alt20=1;
                        }
                        else {
                            alt20=2;}
                    }
                    else {
                        alt20=3;}
                }
                else if ( ((LA20_1>='4' && LA20_1<='7')) ) {
                    int LA20_3 = input.LA(3);

                    if ( ((LA20_3>='0' && LA20_3<='7')) ) {
                        alt20=2;
                    }
                    else {
                        alt20=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // CPP.g:250:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // CPP.g:250:14: ( '0' .. '3' )
                    // CPP.g:250:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // CPP.g:250:25: ( '0' .. '7' )
                    // CPP.g:250:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // CPP.g:250:36: ( '0' .. '7' )
                    // CPP.g:250:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // CPP.g:251:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // CPP.g:251:14: ( '0' .. '7' )
                    // CPP.g:251:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // CPP.g:251:25: ( '0' .. '7' )
                    // CPP.g:251:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // CPP.g:252:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // CPP.g:252:14: ( '0' .. '7' )
                    // CPP.g:252:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // CPP.g:257:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // CPP.g:257:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // CPP.g:1:8: ( T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | BOOLEAN_ | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR )
        int alt21=91;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // CPP.g:1:10: T__41
                {
                mT__41(); 

                }
                break;
            case 2 :
                // CPP.g:1:16: T__42
                {
                mT__42(); 

                }
                break;
            case 3 :
                // CPP.g:1:22: T__43
                {
                mT__43(); 

                }
                break;
            case 4 :
                // CPP.g:1:28: T__44
                {
                mT__44(); 

                }
                break;
            case 5 :
                // CPP.g:1:34: T__45
                {
                mT__45(); 

                }
                break;
            case 6 :
                // CPP.g:1:40: T__46
                {
                mT__46(); 

                }
                break;
            case 7 :
                // CPP.g:1:46: T__47
                {
                mT__47(); 

                }
                break;
            case 8 :
                // CPP.g:1:52: T__48
                {
                mT__48(); 

                }
                break;
            case 9 :
                // CPP.g:1:58: T__49
                {
                mT__49(); 

                }
                break;
            case 10 :
                // CPP.g:1:64: T__50
                {
                mT__50(); 

                }
                break;
            case 11 :
                // CPP.g:1:70: T__51
                {
                mT__51(); 

                }
                break;
            case 12 :
                // CPP.g:1:76: T__52
                {
                mT__52(); 

                }
                break;
            case 13 :
                // CPP.g:1:82: T__53
                {
                mT__53(); 

                }
                break;
            case 14 :
                // CPP.g:1:88: T__54
                {
                mT__54(); 

                }
                break;
            case 15 :
                // CPP.g:1:94: T__55
                {
                mT__55(); 

                }
                break;
            case 16 :
                // CPP.g:1:100: T__56
                {
                mT__56(); 

                }
                break;
            case 17 :
                // CPP.g:1:106: T__57
                {
                mT__57(); 

                }
                break;
            case 18 :
                // CPP.g:1:112: T__58
                {
                mT__58(); 

                }
                break;
            case 19 :
                // CPP.g:1:118: T__59
                {
                mT__59(); 

                }
                break;
            case 20 :
                // CPP.g:1:124: T__60
                {
                mT__60(); 

                }
                break;
            case 21 :
                // CPP.g:1:130: T__61
                {
                mT__61(); 

                }
                break;
            case 22 :
                // CPP.g:1:136: T__62
                {
                mT__62(); 

                }
                break;
            case 23 :
                // CPP.g:1:142: T__63
                {
                mT__63(); 

                }
                break;
            case 24 :
                // CPP.g:1:148: T__64
                {
                mT__64(); 

                }
                break;
            case 25 :
                // CPP.g:1:154: T__65
                {
                mT__65(); 

                }
                break;
            case 26 :
                // CPP.g:1:160: T__66
                {
                mT__66(); 

                }
                break;
            case 27 :
                // CPP.g:1:166: T__67
                {
                mT__67(); 

                }
                break;
            case 28 :
                // CPP.g:1:172: T__68
                {
                mT__68(); 

                }
                break;
            case 29 :
                // CPP.g:1:178: T__69
                {
                mT__69(); 

                }
                break;
            case 30 :
                // CPP.g:1:184: T__70
                {
                mT__70(); 

                }
                break;
            case 31 :
                // CPP.g:1:190: T__71
                {
                mT__71(); 

                }
                break;
            case 32 :
                // CPP.g:1:196: T__72
                {
                mT__72(); 

                }
                break;
            case 33 :
                // CPP.g:1:202: T__73
                {
                mT__73(); 

                }
                break;
            case 34 :
                // CPP.g:1:208: T__74
                {
                mT__74(); 

                }
                break;
            case 35 :
                // CPP.g:1:214: T__75
                {
                mT__75(); 

                }
                break;
            case 36 :
                // CPP.g:1:220: T__76
                {
                mT__76(); 

                }
                break;
            case 37 :
                // CPP.g:1:226: T__77
                {
                mT__77(); 

                }
                break;
            case 38 :
                // CPP.g:1:232: T__78
                {
                mT__78(); 

                }
                break;
            case 39 :
                // CPP.g:1:238: T__79
                {
                mT__79(); 

                }
                break;
            case 40 :
                // CPP.g:1:244: T__80
                {
                mT__80(); 

                }
                break;
            case 41 :
                // CPP.g:1:250: T__81
                {
                mT__81(); 

                }
                break;
            case 42 :
                // CPP.g:1:256: T__82
                {
                mT__82(); 

                }
                break;
            case 43 :
                // CPP.g:1:262: T__83
                {
                mT__83(); 

                }
                break;
            case 44 :
                // CPP.g:1:268: T__84
                {
                mT__84(); 

                }
                break;
            case 45 :
                // CPP.g:1:274: T__85
                {
                mT__85(); 

                }
                break;
            case 46 :
                // CPP.g:1:280: T__86
                {
                mT__86(); 

                }
                break;
            case 47 :
                // CPP.g:1:286: T__87
                {
                mT__87(); 

                }
                break;
            case 48 :
                // CPP.g:1:292: T__88
                {
                mT__88(); 

                }
                break;
            case 49 :
                // CPP.g:1:298: T__89
                {
                mT__89(); 

                }
                break;
            case 50 :
                // CPP.g:1:304: T__90
                {
                mT__90(); 

                }
                break;
            case 51 :
                // CPP.g:1:310: T__91
                {
                mT__91(); 

                }
                break;
            case 52 :
                // CPP.g:1:316: T__92
                {
                mT__92(); 

                }
                break;
            case 53 :
                // CPP.g:1:322: T__93
                {
                mT__93(); 

                }
                break;
            case 54 :
                // CPP.g:1:328: T__94
                {
                mT__94(); 

                }
                break;
            case 55 :
                // CPP.g:1:334: T__95
                {
                mT__95(); 

                }
                break;
            case 56 :
                // CPP.g:1:340: T__96
                {
                mT__96(); 

                }
                break;
            case 57 :
                // CPP.g:1:346: T__97
                {
                mT__97(); 

                }
                break;
            case 58 :
                // CPP.g:1:352: T__98
                {
                mT__98(); 

                }
                break;
            case 59 :
                // CPP.g:1:358: T__99
                {
                mT__99(); 

                }
                break;
            case 60 :
                // CPP.g:1:364: T__100
                {
                mT__100(); 

                }
                break;
            case 61 :
                // CPP.g:1:371: T__101
                {
                mT__101(); 

                }
                break;
            case 62 :
                // CPP.g:1:378: T__102
                {
                mT__102(); 

                }
                break;
            case 63 :
                // CPP.g:1:385: T__103
                {
                mT__103(); 

                }
                break;
            case 64 :
                // CPP.g:1:392: T__104
                {
                mT__104(); 

                }
                break;
            case 65 :
                // CPP.g:1:399: T__105
                {
                mT__105(); 

                }
                break;
            case 66 :
                // CPP.g:1:406: T__106
                {
                mT__106(); 

                }
                break;
            case 67 :
                // CPP.g:1:413: T__107
                {
                mT__107(); 

                }
                break;
            case 68 :
                // CPP.g:1:420: T__108
                {
                mT__108(); 

                }
                break;
            case 69 :
                // CPP.g:1:427: T__109
                {
                mT__109(); 

                }
                break;
            case 70 :
                // CPP.g:1:434: T__110
                {
                mT__110(); 

                }
                break;
            case 71 :
                // CPP.g:1:441: T__111
                {
                mT__111(); 

                }
                break;
            case 72 :
                // CPP.g:1:448: T__112
                {
                mT__112(); 

                }
                break;
            case 73 :
                // CPP.g:1:455: T__113
                {
                mT__113(); 

                }
                break;
            case 74 :
                // CPP.g:1:462: T__114
                {
                mT__114(); 

                }
                break;
            case 75 :
                // CPP.g:1:469: T__115
                {
                mT__115(); 

                }
                break;
            case 76 :
                // CPP.g:1:476: T__116
                {
                mT__116(); 

                }
                break;
            case 77 :
                // CPP.g:1:483: T__117
                {
                mT__117(); 

                }
                break;
            case 78 :
                // CPP.g:1:490: T__118
                {
                mT__118(); 

                }
                break;
            case 79 :
                // CPP.g:1:497: T__119
                {
                mT__119(); 

                }
                break;
            case 80 :
                // CPP.g:1:504: T__120
                {
                mT__120(); 

                }
                break;
            case 81 :
                // CPP.g:1:511: T__121
                {
                mT__121(); 

                }
                break;
            case 82 :
                // CPP.g:1:518: T__122
                {
                mT__122(); 

                }
                break;
            case 83 :
                // CPP.g:1:525: T__123
                {
                mT__123(); 

                }
                break;
            case 84 :
                // CPP.g:1:532: BOOLEAN_
                {
                mBOOLEAN_(); 

                }
                break;
            case 85 :
                // CPP.g:1:541: ID
                {
                mID(); 

                }
                break;
            case 86 :
                // CPP.g:1:544: INT
                {
                mINT(); 

                }
                break;
            case 87 :
                // CPP.g:1:548: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 88 :
                // CPP.g:1:554: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 89 :
                // CPP.g:1:562: WS
                {
                mWS(); 

                }
                break;
            case 90 :
                // CPP.g:1:565: STRING
                {
                mSTRING(); 

                }
                break;
            case 91 :
                // CPP.g:1:572: CHAR
                {
                mCHAR(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA10_eotS =
        "\5\uffff";
    static final String DFA10_eofS =
        "\5\uffff";
    static final String DFA10_minS =
        "\2\56\3\uffff";
    static final String DFA10_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA10_specialS =
        "\5\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "211:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA21_eotS =
        "\3\uffff\1\55\1\66\1\71\1\72\4\55\1\113\2\55\1\uffff\1\120\4\uffff"+
        "\5\55\1\133\3\55\1\137\2\uffff\1\143\1\147\1\150\1\152\1\uffff\1"+
        "\154\1\157\1\161\1\uffff\1\163\3\55\1\uffff\1\171\2\uffff\2\55\1"+
        "\176\10\uffff\16\55\2\uffff\3\55\2\uffff\1\u0092\10\55\2\uffff\3"+
        "\55\25\uffff\5\55\1\uffff\1\55\1\u00a4\2\55\1\uffff\4\55\1\u00ac"+
        "\2\55\1\u00b1\13\55\1\uffff\5\55\1\u00c2\13\55\1\uffff\6\55\1\u00d5"+
        "\1\uffff\1\u00d6\1\u00d7\2\55\1\uffff\7\55\1\u00e1\1\u00e2\3\55"+
        "\1\u00e6\1\55\1\u00e9\1\55\1\uffff\1\55\1\u00ec\1\u00ed\2\55\3\u00f0"+
        "\5\55\1\u00f6\4\55\3\uffff\2\55\1\u00fd\1\uffff\2\55\1\uffff\1\u0100"+
        "\1\55\2\uffff\3\55\1\uffff\1\u0105\2\uffff\1\u0106\1\u00f0\2\uffff"+
        "\1\u0107\1\55\1\uffff\2\u00f0\3\55\1\uffff\1\u010c\1\55\1\uffff"+
        "\1\55\1\uffff\1\55\1\uffff\1\u0110\1\u0111\1\uffff\2\55\1\u0114"+
        "\1\55\3\uffff\1\u0116\1\u0117\1\55\1\u0119\1\uffff\1\u011a\1\55"+
        "\3\uffff\2\55\1\uffff\1\u011e\2\uffff\1\u011f\2\uffff\1\u0120\1"+
        "\u0121\1\55\4\uffff\1\u0123\1\uffff";
    static final String DFA21_eofS =
        "\u0124\uffff";
    static final String DFA21_minS =
        "\1\11\2\uffff\1\146\1\74\1\75\1\0\1\141\1\145\1\141\1\156\1\72"+
        "\1\154\1\141\1\uffff\1\75\4\uffff\1\145\2\157\1\141\1\157\1\75\1"+
        "\157\1\150\1\145\1\56\2\uffff\1\53\1\55\1\60\1\75\1\uffff\1\46\1"+
        "\52\1\75\1\uffff\1\174\1\162\1\122\1\101\1\uffff\1\56\2\uffff\1"+
        "\143\1\155\1\60\10\uffff\1\141\1\164\2\156\1\141\1\163\1\144\1\157"+
        "\1\164\1\151\1\163\1\164\1\151\1\163\2\uffff\1\144\1\163\1\155\2"+
        "\uffff\1\60\1\146\1\157\1\145\1\156\1\157\1\162\1\154\1\151\2\uffff"+
        "\1\164\1\151\1\164\25\uffff\2\165\1\125\1\154\1\114\1\uffff\1\154"+
        "\1\60\1\164\1\141\1\uffff\1\164\1\144\1\151\1\164\1\60\1\162\1\145"+
        "\1\60\1\162\1\167\2\164\1\150\1\156\1\151\1\154\2\145\1\142\1\uffff"+
        "\1\141\1\154\1\141\1\147\1\141\1\60\1\163\1\144\1\157\1\154\1\165"+
        "\2\145\1\105\1\163\1\123\1\165\1\uffff\1\162\1\156\1\150\1\151\1"+
        "\157\1\151\1\60\1\uffff\2\60\1\157\1\151\1\uffff\1\164\1\50\1\143"+
        "\1\145\1\56\2\147\2\60\1\163\1\154\1\165\1\60\1\153\1\40\1\164\1"+
        "\uffff\1\145\2\60\1\145\1\162\3\60\1\145\1\105\1\144\1\145\1\151"+
        "\1\60\1\157\1\151\1\56\1\156\3\uffff\1\56\1\142\1\60\1\uffff\1\150"+
        "\1\155\1\uffff\1\60\1\156\2\uffff\1\160\1\145\1\154\1\uffff\1\60"+
        "\2\uffff\2\60\2\uffff\1\60\1\156\1\uffff\2\60\1\145\1\141\1\160"+
        "\1\uffff\1\60\1\142\1\uffff\1\165\1\uffff\1\56\1\uffff\2\60\1\uffff"+
        "\1\145\1\141\1\60\1\164\3\uffff\2\60\1\155\1\60\1\uffff\1\60\1\145"+
        "\3\uffff\1\144\1\143\1\uffff\1\60\2\uffff\1\60\2\uffff\2\60\1\145"+
        "\4\uffff\1\60\1\uffff";
    static final String DFA21_maxS =
        "\1\176\2\uffff\1\157\1\75\1\76\1\uffff\1\163\1\171\1\141\1\163"+
        "\1\72\1\156\1\141\1\uffff\1\75\4\uffff\1\157\1\162\3\157\1\75\1"+
        "\157\1\150\2\145\2\uffff\1\75\1\76\1\71\1\75\1\uffff\1\46\2\75\1"+
        "\uffff\1\174\2\162\1\141\1\uffff\1\145\2\uffff\1\164\1\163\1\172"+
        "\10\uffff\1\141\1\164\1\165\1\156\1\141\1\163\1\144\1\157\1\164"+
        "\1\151\1\163\1\164\1\151\1\163\2\uffff\1\144\1\163\1\155\2\uffff"+
        "\1\172\1\146\1\157\1\145\1\156\1\157\1\162\1\154\1\151\2\uffff\1"+
        "\164\1\151\1\164\25\uffff\2\165\1\125\1\154\1\114\1\uffff\1\154"+
        "\1\172\1\164\1\141\1\uffff\1\164\1\144\2\164\1\172\1\162\1\145\1"+
        "\172\1\162\1\167\2\164\1\150\1\156\1\151\1\154\2\145\1\142\1\uffff"+
        "\1\141\1\154\1\141\1\147\1\141\1\172\1\163\1\144\1\157\1\154\1\165"+
        "\2\145\1\105\1\163\1\123\1\165\1\uffff\1\162\1\156\1\150\1\154\1"+
        "\157\1\151\1\172\1\uffff\2\172\1\157\1\151\1\uffff\1\164\1\50\1"+
        "\143\1\145\1\56\2\147\2\172\1\163\1\154\1\165\1\172\1\153\1\172"+
        "\1\164\1\uffff\1\145\2\172\1\145\1\162\3\172\1\145\1\105\1\144\1"+
        "\145\1\151\1\172\1\157\1\151\1\56\1\156\3\uffff\1\56\1\142\1\172"+
        "\1\uffff\1\150\1\155\1\uffff\1\172\1\156\2\uffff\1\160\1\145\1\154"+
        "\1\uffff\1\172\2\uffff\2\172\2\uffff\1\172\1\156\1\uffff\2\172\1"+
        "\145\1\141\1\160\1\uffff\1\172\1\142\1\uffff\1\165\1\uffff\1\56"+
        "\1\uffff\2\172\1\uffff\1\145\1\141\1\172\1\164\3\uffff\2\172\1\155"+
        "\1\172\1\uffff\1\172\1\145\3\uffff\1\144\1\143\1\uffff\1\172\2\uffff"+
        "\1\172\2\uffff\2\172\1\145\4\uffff\1\172\1\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\1\1\2\13\uffff\1\27\1\uffff\1\31\1\32\1\33\1\34\12\uffff"+
        "\1\72\1\73\4\uffff\1\102\3\uffff\1\113\4\uffff\1\125\1\uffff\1\131"+
        "\1\133\3\uffff\1\54\1\107\1\4\1\53\1\110\1\5\1\6\1\132\16\uffff"+
        "\1\22\1\62\3\uffff\1\111\1\30\11\uffff\1\121\1\47\3\uffff\1\71\1"+
        "\127\1\74\1\117\1\106\1\75\1\77\1\120\1\100\1\76\1\112\1\101\1\115"+
        "\1\103\1\122\1\130\1\104\1\123\1\105\1\116\1\114\5\uffff\1\126\4"+
        "\uffff\1\56\23\uffff\1\66\21\uffff\1\36\7\uffff\1\23\4\uffff\1\21"+
        "\20\uffff\1\64\22\uffff\1\25\1\37\1\61\3\uffff\1\55\2\uffff\1\14"+
        "\2\uffff\1\24\1\57\3\uffff\1\41\1\uffff\1\46\1\43\2\uffff\1\45\1"+
        "\52\2\uffff\1\124\5\uffff\1\10\2\uffff\1\17\1\uffff\1\11\1\uffff"+
        "\1\42\2\uffff\1\20\4\uffff\1\50\1\44\1\65\4\uffff\1\15\2\uffff\1"+
        "\12\1\60\1\67\2\uffff\1\40\1\uffff\1\70\1\3\1\uffff\1\13\1\16\3"+
        "\uffff\1\63\1\7\1\51\1\35\1\uffff\1\26";
    static final String DFA21_specialS =
        "\6\uffff\1\0\u011d\uffff}>";
    static final String[] DFA21_transitionS = {
            "\2\57\2\uffff\1\57\22\uffff\1\57\1\43\1\6\1\2\1\uffff\1\47"+
            "\1\45\1\60\1\22\1\23\1\31\1\40\1\16\1\41\1\42\1\46\1\35\11\56"+
            "\1\13\1\1\1\4\1\17\1\5\2\uffff\5\55\1\54\15\55\1\53\6\55\1\36"+
            "\1\uffff\1\37\1\50\1\55\1\uffff\1\55\1\25\1\7\1\24\1\14\1\27"+
            "\1\32\1\55\1\3\2\55\1\26\1\11\1\15\3\55\1\34\1\10\1\52\1\12"+
            "\1\30\1\33\3\55\1\20\1\51\1\21\1\44",
            "",
            "",
            "\1\63\7\uffff\1\61\1\62",
            "\1\64\1\65",
            "\1\70\1\67",
            "\0\73",
            "\1\101\6\uffff\1\100\1\77\3\uffff\1\74\1\uffff\1\76\3\uffff"+
            "\1\75",
            "\1\104\2\uffff\1\103\13\uffff\1\102\2\uffff\1\105\1\uffff"+
            "\1\106",
            "\1\107",
            "\1\111\4\uffff\1\110",
            "\1\112",
            "\1\115\1\uffff\1\114",
            "\1\116",
            "",
            "\1\117",
            "",
            "",
            "",
            "",
            "\1\122\11\uffff\1\121",
            "\1\123\2\uffff\1\124",
            "\1\125",
            "\1\130\12\uffff\1\126\2\uffff\1\127",
            "\1\131",
            "\1\132",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\140\1\uffff\12\56\13\uffff\1\140\37\uffff\1\140",
            "",
            "",
            "\1\141\21\uffff\1\142",
            "\1\144\17\uffff\1\146\1\145",
            "\12\140",
            "\1\151",
            "",
            "\1\153",
            "\1\156\4\uffff\1\156\15\uffff\1\155",
            "\1\160",
            "",
            "\1\162",
            "\1\164",
            "\1\166\37\uffff\1\165",
            "\1\170\37\uffff\1\167",
            "",
            "\1\140\1\uffff\12\56\13\uffff\1\140\37\uffff\1\140",
            "",
            "",
            "\1\172\20\uffff\1\173",
            "\1\175\5\uffff\1\174",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\177",
            "\1\u0080",
            "\1\u0081\6\uffff\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "",
            "",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\24\55\1\u0091\5"+
            "\55",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "",
            "",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "\1\u00a3",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00a5",
            "\1\u00a6",
            "",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9\12\uffff\1\u00aa",
            "\1\u00ab",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00ad",
            "\1\u00ae",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\10\55\1\u00af\2"+
            "\55\1\u00b0\16\55",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1\2\uffff\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00d8",
            "\1\u00d9",
            "",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00e7",
            "\1\u00e8\17\uffff\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff"+
            "\32\55",
            "\1\u00ea",
            "",
            "\1\u00eb",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00ee",
            "\1\u00ef",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "",
            "",
            "",
            "\1\u00fb",
            "\1\u00fc",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u00fe",
            "\1\u00ff",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0101",
            "",
            "",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0108",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u010d",
            "",
            "\1\u010e",
            "",
            "\1\u010f",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u0112",
            "\1\u0113",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0115",
            "",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0118",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u011b",
            "",
            "",
            "",
            "\1\u011c",
            "\1\u011d",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0122",
            "",
            "",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | BOOLEAN_ | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_6 = input.LA(1);

                        s = -1;
                        if ( ((LA21_6>='\u0000' && LA21_6<='\uFFFF')) ) {s = 59;}

                        else s = 58;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
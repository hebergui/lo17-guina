import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        tal_sqlLexer lex = new tal_sqlLexer(new ANTLRFileStream("/Users/Nina/Documents/UV/UV(CURRENT)/LO17/lo17-guina/TD3/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        tal_sqlParser g = new tal_sqlParser(tokens, 49100, null);
        try {
            g.SELECT();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}
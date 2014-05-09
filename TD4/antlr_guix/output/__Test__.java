import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        Tal_simpleLexer lex = new Tal_simpleLexer(new ANTLRFileStream("/Users/Nina/Documents/UV/UV(CURRENT)/LO17/lo17-guina/TD4/antlr_simple/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        Tal_simpleParser g = new Tal_simpleParser(tokens, 49100, null);
        try {
            g.NOM();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}
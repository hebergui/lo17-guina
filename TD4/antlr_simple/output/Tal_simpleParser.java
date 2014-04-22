// $ANTLR 3.5.1 /Users/Nina/Documents/UV/UV(CURRENT)/LO17/lo17-guina/TD4/antlr_simple/Tal_simple.g 2014-04-21 12:44:37

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class Tal_simpleParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADJ", "CONJ", "DET", "NOM", "POINT", 
		"VERBE", "WS"
	};
	public static final int EOF=-1;
	public static final int ADJ=4;
	public static final int CONJ=5;
	public static final int DET=6;
	public static final int NOM=7;
	public static final int POINT=8;
	public static final int VERBE=9;
	public static final int WS=10;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "listephrases", "gn", "phrase", "gv", "gn_c"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public Tal_simpleParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public Tal_simpleParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public Tal_simpleParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return Tal_simpleParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/Nina/Documents/UV/UV(CURRENT)/LO17/lo17-guina/TD4/antlr_simple/Tal_simple.g"; }



	// $ANTLR start "listephrases"
	// /Users/Nina/Documents/UV/UV(CURRENT)/LO17/lo17-guina/TD4/antlr_simple/Tal_simple.g:16:1: listephrases returns [String arbresort = \"\"] : t= phrase POINT ;
	public final String listephrases() throws RecognitionException {
		String arbresort =  "";


		Arbre t =null;

		Arbre p;
		try { dbg.enterRule(getGrammarFileName(), "listephrases");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(16, 0);

		try {
			// /Users/Nina/Documents/UV/UV(CURRENT)/LO17/lo17-guina/TD4/antlr_simple/Tal_simple.g:17:24: (t= phrase POINT )
			dbg.enterAlt(1);

			// /Users/Nina/Documents/UV/UV(CURRENT)/LO17/lo17-guina/TD4/antlr_simple/Tal_simple.g:18:17: t= phrase POINT
			{
			dbg.location(18,19);
			pushFollow(FOLLOW_phrase_in_listephrases142);
			t=phrase();
			state._fsp--;
			dbg.location(18,28);
			match(input,POINT,FOLLOW_POINT_in_listephrases144); dbg.location(19,17);
			p = t;
			                arbresort = p.sortArbre();
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(21, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "listephrases");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return arbresort;
	}
	// $ANTLR end "listephrases"



	// $ANTLR start "phrase"
	// /Users/Nina/Documents/UV/UV(CURRENT)/LO17/lo17-guina/TD4/antlr_simple/Tal_simple.g:23:1: phrase returns [Arbre phrase = new Arbre(\"PHRASE\")] : agnc= gn_c agva= gv ;
	public final Arbre phrase() throws RecognitionException {
		Arbre phrase =  new Arbre("PHRASE");


		Arbre agnc =null;
		Arbre agva =null;


		// on declare les variables de type arbre
		// qui sont utilises dans cette regle
		        Arbre gnc, gva;
		        
		try { dbg.enterRule(getGrammarFileName(), "phrase");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(23, 0);

		try {
			// /Users/Nina/Documents/UV/UV(CURRENT)/LO17/lo17-guina/TD4/antlr_simple/Tal_simple.g:28:10: (agnc= gn_c agva= gv )
			dbg.enterAlt(1);

			// /Users/Nina/Documents/UV/UV(CURRENT)/LO17/lo17-guina/TD4/antlr_simple/Tal_simple.g:29:9: agnc= gn_c agva= gv
			{
			dbg.location(29,14);
			pushFollow(FOLLOW_gn_c_in_phrase198);
			agnc=gn_c();
			state._fsp--;
			dbg.location(29,26);
			pushFollow(FOLLOW_gv_in_phrase204);
			agva=gv();
			state._fsp--;
			dbg.location(30,9);

			                gnc = agnc;
			                gva = agva;
			                phrase.ajouteFils(gnc);
			                phrase.ajouteFils(gva);
			        
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(36, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "phrase");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return phrase;
	}
	// $ANTLR end "phrase"



	// $ANTLR start "gn_c"
	// /Users/Nina/Documents/UV/UV(CURRENT)/LO17/lo17-guina/TD4/antlr_simple/Tal_simple.g:37:1: gn_c returns [Arbre gnc = new Arbre(\"GNC\")] : agn1= gn (c= CONJ agn2= gn )* ;
	public final Arbre gn_c() throws RecognitionException {
		Arbre gnc =  new Arbre("GNC");


		Token c=null;
		Arbre agn1 =null;
		Arbre agn2 =null;

		Arbre gn1, gn2;
		try { dbg.enterRule(getGrammarFileName(), "gn_c");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(37, 0);

		try {
			// /Users/Nina/Documents/UV/UV(CURRENT)/LO17/lo17-guina/TD4/antlr_simple/Tal_simple.g:38:31: (agn1= gn (c= CONJ agn2= gn )* )
			dbg.enterAlt(1);

			// /Users/Nina/Documents/UV/UV(CURRENT)/LO17/lo17-guina/TD4/antlr_simple/Tal_simple.g:39:17: agn1= gn (c= CONJ agn2= gn )*
			{
			dbg.location(39,22);
			pushFollow(FOLLOW_gn_in_gn_c258);
			agn1=gn();
			state._fsp--;
			dbg.location(40,17);

			                        gn1 = agn1;
			                        gnc.ajouteFils(gn1);
			                dbg.location(44,17);
			// /Users/Nina/Documents/UV/UV(CURRENT)/LO17/lo17-guina/TD4/antlr_simple/Tal_simple.g:44:17: (c= CONJ agn2= gn )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==CONJ) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/Nina/Documents/UV/UV(CURRENT)/LO17/lo17-guina/TD4/antlr_simple/Tal_simple.g:44:18: c= CONJ agn2= gn
					{
					dbg.location(44,20);
					c=(Token)match(input,CONJ,FOLLOW_CONJ_in_gn_c300); dbg.location(44,32);
					pushFollow(FOLLOW_gn_in_gn_c306);
					agn2=gn();
					state._fsp--;
					dbg.location(45,17);

					                        gnc.ajouteFils(new Arbre("CONJ",c.getText()));
					                        gn2 =agn2;
					                        gnc.ajouteFils(gn2);
					                
					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(50, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "gn_c");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return gnc;
	}
	// $ANTLR end "gn_c"



	// $ANTLR start "gn"
	// /Users/Nina/Documents/UV/UV(CURRENT)/LO17/lo17-guina/TD4/antlr_simple/Tal_simple.g:51:1: gn returns [Arbre legn = new Arbre(\"GN\")] : (d= DET n1= NOM (a= ADJ )? |n2= NOM );
	public final Arbre gn() throws RecognitionException {
		Arbre legn =  new Arbre("GN");


		Token d=null;
		Token n1=null;
		Token a=null;
		Token n2=null;

		try { dbg.enterRule(getGrammarFileName(), "gn");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(51, 0);

		try {
			// /Users/Nina/Documents/UV/UV(CURRENT)/LO17/lo17-guina/TD4/antlr_simple/Tal_simple.g:51:42: (d= DET n1= NOM (a= ADJ )? |n2= NOM )
			int alt3=2;
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			int LA3_0 = input.LA(1);
			if ( (LA3_0==DET) ) {
				alt3=1;
			}
			else if ( (LA3_0==NOM) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/Nina/Documents/UV/UV(CURRENT)/LO17/lo17-guina/TD4/antlr_simple/Tal_simple.g:52:9: d= DET n1= NOM (a= ADJ )?
					{
					dbg.location(52,10);
					d=(Token)match(input,DET,FOLLOW_DET_in_gn347); dbg.location(52,17);
					n1=(Token)match(input,NOM,FOLLOW_NOM_in_gn351); dbg.location(53,9);

					                legn.ajouteFils(new Arbre("DET",d.getText()));
					                legn.ajouteFils(new Arbre("NOM",n1.getText()));
					        dbg.location(57,9);
					// /Users/Nina/Documents/UV/UV(CURRENT)/LO17/lo17-guina/TD4/antlr_simple/Tal_simple.g:57:9: (a= ADJ )?
					int alt2=2;
					try { dbg.enterSubRule(2);
					try { dbg.enterDecision(2, decisionCanBacktrack[2]);

					int LA2_0 = input.LA(1);
					if ( (LA2_0==ADJ) ) {
						alt2=1;
					}
					} finally {dbg.exitDecision(2);}

					switch (alt2) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/Nina/Documents/UV/UV(CURRENT)/LO17/lo17-guina/TD4/antlr_simple/Tal_simple.g:57:10: a= ADJ
							{
							dbg.location(57,11);
							a=(Token)match(input,ADJ,FOLLOW_ADJ_in_gn374); dbg.location(58,9);

							                legn.ajouteFils(new Arbre("ADJ",a.getText()));
							        
							}
							break;

					}
					} finally {dbg.exitSubRule(2);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/Nina/Documents/UV/UV(CURRENT)/LO17/lo17-guina/TD4/antlr_simple/Tal_simple.g:61:11: n2= NOM
					{
					dbg.location(61,13);
					n2=(Token)match(input,NOM,FOLLOW_NOM_in_gn401); dbg.location(62,9);

					                legn.ajouteFils(new Arbre("NOM",n2.getText()));
					        
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(65, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "gn");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return legn;
	}
	// $ANTLR end "gn"



	// $ANTLR start "gv"
	// /Users/Nina/Documents/UV/UV(CURRENT)/LO17/lo17-guina/TD4/antlr_simple/Tal_simple.g:67:1: gv returns [Arbre legv = new Arbre(\"GV\")] : v= VERBE (agnc= gn_c )? ;
	public final Arbre gv() throws RecognitionException {
		Arbre legv =  new Arbre("GV");


		Token v=null;
		Arbre agnc =null;

		Arbre gnc;
		try { dbg.enterRule(getGrammarFileName(), "gv");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(67, 0);

		try {
			// /Users/Nina/Documents/UV/UV(CURRENT)/LO17/lo17-guina/TD4/antlr_simple/Tal_simple.g:68:26: (v= VERBE (agnc= gn_c )? )
			dbg.enterAlt(1);

			// /Users/Nina/Documents/UV/UV(CURRENT)/LO17/lo17-guina/TD4/antlr_simple/Tal_simple.g:69:9: v= VERBE (agnc= gn_c )?
			{
			dbg.location(69,10);
			v=(Token)match(input,VERBE,FOLLOW_VERBE_in_gv445); dbg.location(70,9);

			                legv.ajouteFils(new Arbre("VERBE",v.getText()));
			        dbg.location(73,9);
			// /Users/Nina/Documents/UV/UV(CURRENT)/LO17/lo17-guina/TD4/antlr_simple/Tal_simple.g:73:9: (agnc= gn_c )?
			int alt4=2;
			try { dbg.enterSubRule(4);
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= DET && LA4_0 <= NOM)) ) {
				alt4=1;
			}
			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/Nina/Documents/UV/UV(CURRENT)/LO17/lo17-guina/TD4/antlr_simple/Tal_simple.g:73:10: agnc= gn_c
					{
					dbg.location(73,15);
					pushFollow(FOLLOW_gn_c_in_gv470);
					agnc=gn_c();
					state._fsp--;
					dbg.location(74,9);

					                gnc = agnc;
					                legv.ajouteFils(gnc);
					        
					}
					break;

			}
			} finally {dbg.exitSubRule(4);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(78, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "gv");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return legv;
	}
	// $ANTLR end "gv"

	// Delegated rules



	public static final BitSet FOLLOW_phrase_in_listephrases142 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_POINT_in_listephrases144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gn_c_in_phrase198 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_gv_in_phrase204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_gn_in_gn_c258 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_CONJ_in_gn_c300 = new BitSet(new long[]{0x00000000000000C0L});
	public static final BitSet FOLLOW_gn_in_gn_c306 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_DET_in_gn347 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_NOM_in_gn351 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_ADJ_in_gn374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOM_in_gn401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VERBE_in_gv445 = new BitSet(new long[]{0x00000000000000C2L});
	public static final BitSet FOLLOW_gn_c_in_gv470 = new BitSet(new long[]{0x0000000000000002L});
}

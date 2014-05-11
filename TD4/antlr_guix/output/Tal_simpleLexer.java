// $ANTLR 3.5 /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g 2014-05-11 14:55:16
package antlr.output;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Tal_simpleLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ARTICLE=4;
	public static final int AT=5;
	public static final int AUTEUR=6;
	public static final int COMBIEN=7;
	public static final int DATE=8;
	public static final int EMAIL=9;
	public static final int ENTRE=10;
	public static final int ET=11;
	public static final int JOURS=12;
	public static final int MOIS=13;
	public static final int MOT=14;
	public static final int NBR=15;
	public static final int OU=16;
	public static final int PAGE=17;
	public static final int PARLER=18;
	public static final int POINT=19;
	public static final int PUBLIE=20;
	public static final int RESUME=21;
	public static final int RUBRIQUE=22;
	public static final int SELECT=23;
	public static final int TITRE=24;
	public static final int VAR=25;
	public static final int WS=26;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public Tal_simpleLexer() {} 
	public Tal_simpleLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public Tal_simpleLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g"; }

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:5:8: ( 'vouloir' )
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:5:10: 'vouloir'
			{
			match("vouloir"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT"

	// $ANTLR start "COMBIEN"
	public final void mCOMBIEN() throws RecognitionException {
		try {
			int _type = COMBIEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:6:9: ( 'combien' )
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:6:11: 'combien'
			{
			match("combien"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMBIEN"

	// $ANTLR start "ET"
	public final void mET() throws RecognitionException {
		try {
			int _type = ET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:7:4: ( 'et' )
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:7:6: 'et'
			{
			match("et"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ET"

	// $ANTLR start "OU"
	public final void mOU() throws RecognitionException {
		try {
			int _type = OU;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:8:4: ( 'ou' )
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:8:6: 'ou'
			{
			match("ou"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OU"

	// $ANTLR start "PARLER"
	public final void mPARLER() throws RecognitionException {
		try {
			int _type = PARLER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:9:8: ( ( 'parler' )+ )
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:9:10: ( 'parler' )+
			{
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:9:10: ( 'parler' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='p') ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:9:10: 'parler'
					{
					match("parler"); 

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PARLER"

	// $ANTLR start "ENTRE"
	public final void mENTRE() throws RecognitionException {
		try {
			int _type = ENTRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:10:7: ( 'entre' )
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:10:8: 'entre'
			{
			match("entre"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENTRE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:11:4: ( ( ' ' | '\\t' | '\\r' | 'stop' ) | '\\n' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='\t'||LA3_0=='\r'||LA3_0==' '||LA3_0=='s') ) {
				alt3=1;
			}
			else if ( (LA3_0=='\n') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:11:6: ( ' ' | '\\t' | '\\r' | 'stop' )
					{
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:11:6: ( ' ' | '\\t' | '\\r' | 'stop' )
					int alt2=4;
					switch ( input.LA(1) ) {
					case ' ':
						{
						alt2=1;
						}
						break;
					case '\t':
						{
						alt2=2;
						}
						break;
					case '\r':
						{
						alt2=3;
						}
						break;
					case 's':
						{
						alt2=4;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}
					switch (alt2) {
						case 1 :
							// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:11:7: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:11:13: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:11:20: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:11:27: 'stop'
							{
							match("stop"); 

							}
							break;

					}

					 skip(); 
					}
					break;
				case 2 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:11:49: '\\n'
					{
					match('\n'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "MOIS"
	public final void mMOIS() throws RecognitionException {
		try {
			int _type = MOIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:12:6: ( 'janvier' | 'fevrier' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'aout' | 'septembre' | 'octobre' | 'novembre' | 'décembre' )
			int alt4=12;
			switch ( input.LA(1) ) {
			case 'j':
				{
				int LA4_1 = input.LA(2);
				if ( (LA4_1=='a') ) {
					alt4=1;
				}
				else if ( (LA4_1=='u') ) {
					int LA4_10 = input.LA(3);
					if ( (LA4_10=='i') ) {
						int LA4_14 = input.LA(4);
						if ( (LA4_14=='n') ) {
							alt4=6;
						}
						else if ( (LA4_14=='l') ) {
							alt4=7;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 4, 14, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'f':
				{
				alt4=2;
				}
				break;
			case 'm':
				{
				int LA4_3 = input.LA(2);
				if ( (LA4_3=='a') ) {
					int LA4_11 = input.LA(3);
					if ( (LA4_11=='r') ) {
						alt4=3;
					}
					else if ( (LA4_11=='i') ) {
						alt4=5;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'a':
				{
				int LA4_4 = input.LA(2);
				if ( (LA4_4=='v') ) {
					alt4=4;
				}
				else if ( (LA4_4=='o') ) {
					alt4=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 's':
				{
				alt4=9;
				}
				break;
			case 'o':
				{
				alt4=10;
				}
				break;
			case 'n':
				{
				alt4=11;
				}
				break;
			case 'd':
				{
				alt4=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:12:8: 'janvier'
					{
					match("janvier"); 

					}
					break;
				case 2 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:12:18: 'fevrier'
					{
					match("fevrier"); 

					}
					break;
				case 3 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:12:28: 'mars'
					{
					match("mars"); 

					}
					break;
				case 4 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:12:35: 'avril'
					{
					match("avril"); 

					}
					break;
				case 5 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:12:43: 'mai'
					{
					match("mai"); 

					}
					break;
				case 6 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:12:49: 'juin'
					{
					match("juin"); 

					}
					break;
				case 7 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:12:56: 'juillet'
					{
					match("juillet"); 

					}
					break;
				case 8 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:12:66: 'aout'
					{
					match("aout"); 

					}
					break;
				case 9 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:12:73: 'septembre'
					{
					match("septembre"); 

					}
					break;
				case 10 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:12:85: 'octobre'
					{
					match("octobre"); 

					}
					break;
				case 11 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:12:95: 'novembre'
					{
					match("novembre"); 

					}
					break;
				case 12 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:12:106: 'décembre'
					{
					match("décembre"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOIS"

	// $ANTLR start "MOT"
	public final void mMOT() throws RecognitionException {
		try {
			int _type = MOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:13:5: ( 'mot' )
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:13:7: 'mot'
			{
			match("mot"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOT"

	// $ANTLR start "RUBRIQUE"
	public final void mRUBRIQUE() throws RecognitionException {
		try {
			int _type = RUBRIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:15:10: ( 'une' | 'gros titre' | 'focus' | 'rappels' | 'voiraussi' )
			int alt5=5;
			switch ( input.LA(1) ) {
			case 'u':
				{
				alt5=1;
				}
				break;
			case 'g':
				{
				alt5=2;
				}
				break;
			case 'f':
				{
				alt5=3;
				}
				break;
			case 'r':
				{
				alt5=4;
				}
				break;
			case 'v':
				{
				alt5=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:15:12: 'une'
					{
					match("une"); 

					}
					break;
				case 2 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:15:18: 'gros titre'
					{
					match("gros titre"); 

					}
					break;
				case 3 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:15:31: 'focus'
					{
					match("focus"); 

					}
					break;
				case 4 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:15:39: 'rappels'
					{
					match("rappels"); 

					}
					break;
				case 5 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:15:49: 'voiraussi'
					{
					match("voiraussi"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RUBRIQUE"

	// $ANTLR start "ARTICLE"
	public final void mARTICLE() throws RecognitionException {
		try {
			int _type = ARTICLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:17:9: ( 'article' )
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:17:11: 'article'
			{
			match("article"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARTICLE"

	// $ANTLR start "AUTEUR"
	public final void mAUTEUR() throws RecognitionException {
		try {
			int _type = AUTEUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:18:8: ( 'auteur' )
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:18:10: 'auteur'
			{
			match("auteur"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AUTEUR"

	// $ANTLR start "DATE"
	public final void mDATE() throws RecognitionException {
		try {
			int _type = DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:19:6: ( 'date' )
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:19:8: 'date'
			{
			match("date"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE"

	// $ANTLR start "EMAIL"
	public final void mEMAIL() throws RecognitionException {
		try {
			int _type = EMAIL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:20:7: ( 'email' )
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:20:9: 'email'
			{
			match("email"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EMAIL"

	// $ANTLR start "JOURS"
	public final void mJOURS() throws RecognitionException {
		try {
			int _type = JOURS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:21:7: ( 'jours' )
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:21:9: 'jours'
			{
			match("jours"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JOURS"

	// $ANTLR start "PAGE"
	public final void mPAGE() throws RecognitionException {
		try {
			int _type = PAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:22:6: ( 'page' )
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:22:8: 'page'
			{
			match("page"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PAGE"

	// $ANTLR start "PUBLIE"
	public final void mPUBLIE() throws RecognitionException {
		try {
			int _type = PUBLIE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:23:8: ( 'publie' )
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:23:10: 'publie'
			{
			match("publie"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PUBLIE"

	// $ANTLR start "RESUME"
	public final void mRESUME() throws RecognitionException {
		try {
			int _type = RESUME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:24:8: ( 'resume' )
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:24:10: 'resume'
			{
			match("resume"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RESUME"

	// $ANTLR start "TITRE"
	public final void mTITRE() throws RecognitionException {
		try {
			int _type = TITRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:25:7: ( 'titre' )
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:25:9: 'titre'
			{
			match("titre"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TITRE"

	// $ANTLR start "NBR"
	public final void mNBR() throws RecognitionException {
		try {
			int _type = NBR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:27:5: ( ( '0' .. '9' )+ )
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:27:7: ( '0' .. '9' )+
			{
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:27:7: ( '0' .. '9' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NBR"

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:28:7: ( '.' )
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:28:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POINT"

	// $ANTLR start "AT"
	public final void mAT() throws RecognitionException {
		try {
			int _type = AT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:29:4: ( '@' )
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:29:5: '@'
			{
			match('@'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AT"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:30:5: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' | '-' | 'A' .. 'Z' )+ )
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:30:7: ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' | '-' | 'A' .. 'Z' )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:30:29: ( 'a' .. 'z' | '-' | 'A' .. 'Z' )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0=='-'||(LA7_0 >= 'A' && LA7_0 <= 'Z')||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:
					{
					if ( input.LA(1)=='-'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:1:8: ( SELECT | COMBIEN | ET | OU | PARLER | ENTRE | WS | MOIS | MOT | RUBRIQUE | ARTICLE | AUTEUR | DATE | EMAIL | JOURS | PAGE | PUBLIE | RESUME | TITRE | NBR | POINT | AT | VAR )
		int alt8=23;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:1:10: SELECT
				{
				mSELECT(); 

				}
				break;
			case 2 :
				// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:1:17: COMBIEN
				{
				mCOMBIEN(); 

				}
				break;
			case 3 :
				// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:1:25: ET
				{
				mET(); 

				}
				break;
			case 4 :
				// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:1:28: OU
				{
				mOU(); 

				}
				break;
			case 5 :
				// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:1:31: PARLER
				{
				mPARLER(); 

				}
				break;
			case 6 :
				// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:1:38: ENTRE
				{
				mENTRE(); 

				}
				break;
			case 7 :
				// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:1:44: WS
				{
				mWS(); 

				}
				break;
			case 8 :
				// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:1:47: MOIS
				{
				mMOIS(); 

				}
				break;
			case 9 :
				// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:1:52: MOT
				{
				mMOT(); 

				}
				break;
			case 10 :
				// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:1:56: RUBRIQUE
				{
				mRUBRIQUE(); 

				}
				break;
			case 11 :
				// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:1:65: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 12 :
				// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:1:73: AUTEUR
				{
				mAUTEUR(); 

				}
				break;
			case 13 :
				// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:1:80: DATE
				{
				mDATE(); 

				}
				break;
			case 14 :
				// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:1:85: EMAIL
				{
				mEMAIL(); 

				}
				break;
			case 15 :
				// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:1:91: JOURS
				{
				mJOURS(); 

				}
				break;
			case 16 :
				// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:1:97: PAGE
				{
				mPAGE(); 

				}
				break;
			case 17 :
				// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:1:102: PUBLIE
				{
				mPUBLIE(); 

				}
				break;
			case 18 :
				// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:1:109: RESUME
				{
				mRESUME(); 

				}
				break;
			case 19 :
				// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:1:116: TITRE
				{
				mTITRE(); 

				}
				break;
			case 20 :
				// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:1:122: NBR
				{
				mNBR(); 

				}
				break;
			case 21 :
				// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:1:126: POINT
				{
				mPOINT(); 

				}
				break;
			case 22 :
				// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:1:132: AT
				{
				mAT(); 

				}
				break;
			case 23 :
				// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:1:135: VAR
				{
				mVAR(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\26\uffff\2\25\1\67\2\25\1\72\21\25\1\uffff\11\25\1\uffff\2\25\1\uffff"+
		"\14\25\1\55\1\146\6\25\1\155\13\25\1\171\1\25\1\6\2\25\1\55\4\25\1\55"+
		"\1\uffff\1\25\1\55\3\25\1\u0085\1\uffff\7\25\1\u008c\1\u008d\2\25\1\uffff"+
		"\4\25\1\u0094\1\25\1\155\1\55\3\25\1\uffff\2\25\1\u009b\3\25\2\uffff\1"+
		"\25\1\u00a0\1\u00a2\3\25\1\uffff\2\25\1\u00a8\2\25\1\u00ab\1\uffff\1\u00ac"+
		"\1\25\1\u00ae\1\55\1\uffff\1\25\1\uffff\1\25\3\55\1\u00b1\1\uffff\1\25"+
		"\1\155\2\uffff\1\25\1\uffff\2\25\1\uffff\1\55\1\155\1\55";
	static final String DFA8_eofS =
		"\u00b5\uffff";
	static final String DFA8_minS =
		"\1\11\5\55\1\uffff\13\55\4\uffff\1\151\1\155\1\55\1\164\1\141\1\55\1\164"+
		"\1\147\1\142\1\157\1\160\1\156\1\151\1\165\1\166\1\143\1\151\1\164\1\162"+
		"\1\165\2\164\1\166\1\uffff\1\164\1\145\1\157\1\160\1\163\1\164\1\154\1"+
		"\162\1\142\1\uffff\1\162\1\151\1\uffff\1\157\1\154\1\145\1\154\1\160\1"+
		"\164\1\166\1\154\2\162\1\165\1\163\2\55\1\151\1\164\1\151\3\145\1\55\1"+
		"\163\1\160\1\165\1\162\1\157\1\141\1\151\1\145\1\154\1\142\1\145\1\55"+
		"\1\151\1\55\1\145\1\151\1\55\1\154\1\163\1\151\1\163\1\55\1\uffff\1\154"+
		"\1\55\1\143\1\165\1\155\1\55\1\uffff\1\40\1\145\1\155\1\145\1\151\1\165"+
		"\1\145\2\55\2\162\1\uffff\1\145\1\155\2\145\1\55\1\145\2\55\1\154\1\162"+
		"\1\142\1\uffff\1\154\1\145\1\55\1\162\1\163\1\156\2\uffff\1\145\2\55\1"+
		"\142\1\162\1\164\1\uffff\1\162\1\145\1\55\1\162\1\163\1\55\1\uffff\1\55"+
		"\1\163\2\55\1\uffff\1\141\1\uffff\1\162\4\55\1\uffff\1\145\1\55\2\uffff"+
		"\1\151\1\uffff\1\162\1\145\1\uffff\3\55";
	static final String DFA8_maxS =
		"\6\172\1\uffff\6\172\1\u00e9\4\172\4\uffff\1\165\1\155\1\172\1\164\1\141"+
		"\1\172\1\164\1\162\1\142\1\157\1\160\1\156\1\151\1\165\1\166\1\143\1\162"+
		"\1\164\1\162\1\165\2\164\1\166\1\uffff\1\164\1\145\1\157\1\160\1\163\1"+
		"\164\1\154\1\162\1\142\1\uffff\1\162\1\151\1\uffff\1\157\1\154\1\145\1"+
		"\154\1\160\1\164\1\166\1\156\2\162\1\165\1\163\2\172\1\151\1\164\1\151"+
		"\3\145\1\172\1\163\1\160\1\165\1\162\1\157\1\141\1\151\1\145\1\154\1\142"+
		"\1\145\1\172\1\151\1\172\1\145\1\151\1\172\1\154\1\163\1\151\1\163\1\172"+
		"\1\uffff\1\154\1\172\1\143\1\165\1\155\1\172\1\uffff\1\40\1\145\1\155"+
		"\1\145\1\151\1\165\1\145\2\172\2\162\1\uffff\1\145\1\155\2\145\1\172\1"+
		"\145\2\172\1\154\1\162\1\142\1\uffff\1\154\1\145\1\172\1\162\1\163\1\156"+
		"\2\uffff\1\145\2\172\1\142\1\162\1\164\1\uffff\1\162\1\145\1\172\1\162"+
		"\1\163\1\172\1\uffff\1\172\1\163\2\172\1\uffff\1\141\1\uffff\1\162\4\172"+
		"\1\uffff\1\145\1\172\2\uffff\1\151\1\uffff\1\162\1\145\1\uffff\3\172";
	static final String DFA8_acceptS =
		"\6\uffff\1\7\13\uffff\1\24\1\25\1\26\1\27\27\uffff\1\10\11\uffff\1\3\2"+
		"\uffff\1\4\53\uffff\1\11\6\uffff\1\12\13\uffff\1\20\13\uffff\1\15\6\uffff"+
		"\1\6\1\16\6\uffff\1\17\6\uffff\1\23\4\uffff\1\5\1\uffff\1\21\5\uffff\1"+
		"\14\2\uffff\1\22\1\1\1\uffff\1\2\2\uffff\1\13\3\uffff";
	static final String DFA8_specialS =
		"\u00b5\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\6\2\uffff\1\6\22\uffff\1\6\15\uffff\1\23\1\uffff\12\22\6\uffff\1\24"+
			"\32\25\6\uffff\1\13\1\25\1\2\1\15\1\3\1\11\1\17\2\25\1\10\2\25\1\12\1"+
			"\14\1\4\1\5\1\25\1\20\1\7\1\21\1\16\1\1\4\25",
			"\1\25\23\uffff\32\25\6\uffff\16\25\1\26\13\25",
			"\1\25\23\uffff\32\25\6\uffff\16\25\1\27\13\25",
			"\1\25\23\uffff\32\25\6\uffff\14\25\1\32\1\31\5\25\1\30\6\25",
			"\1\25\23\uffff\32\25\6\uffff\2\25\1\34\21\25\1\33\5\25",
			"\1\25\23\uffff\32\25\6\uffff\1\35\23\25\1\36\5\25",
			"",
			"\1\25\23\uffff\32\25\6\uffff\4\25\1\40\16\25\1\37\6\25",
			"\1\25\23\uffff\32\25\6\uffff\1\41\15\25\1\43\5\25\1\42\5\25",
			"\1\25\23\uffff\32\25\6\uffff\4\25\1\44\11\25\1\45\13\25",
			"\1\25\23\uffff\32\25\6\uffff\1\46\15\25\1\47\13\25",
			"\1\25\23\uffff\32\25\6\uffff\16\25\1\51\2\25\1\52\2\25\1\53\1\50\4\25",
			"\1\25\23\uffff\32\25\6\uffff\16\25\1\54\13\25",
			"\1\25\23\uffff\32\25\6\uffff\1\56\31\25\156\uffff\1\55",
			"\1\25\23\uffff\32\25\6\uffff\15\25\1\57\14\25",
			"\1\25\23\uffff\32\25\6\uffff\21\25\1\60\10\25",
			"\1\25\23\uffff\32\25\6\uffff\1\61\3\25\1\62\25\25",
			"\1\25\23\uffff\32\25\6\uffff\10\25\1\63\21\25",
			"",
			"",
			"",
			"",
			"\1\65\13\uffff\1\64",
			"\1\66",
			"\1\25\23\uffff\32\25\6\uffff\32\25",
			"\1\70",
			"\1\71",
			"\1\25\23\uffff\32\25\6\uffff\32\25",
			"\1\73",
			"\1\75\12\uffff\1\74",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\107\10\uffff\1\106",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"",
			"\1\127",
			"\1\130",
			"",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\141\1\uffff\1\140",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\25\23\uffff\32\25\6\uffff\32\25",
			"\1\25\23\uffff\32\25\6\uffff\32\25",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\25\23\uffff\32\25\6\uffff\32\25",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\25\23\uffff\32\25\6\uffff\32\25",
			"\1\172",
			"\1\25\23\uffff\32\25\6\uffff\32\25",
			"\1\173",
			"\1\174",
			"\1\25\23\uffff\32\25\6\uffff\32\25",
			"\1\175",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\25\23\uffff\32\25\6\uffff\32\25",
			"",
			"\1\u0081",
			"\1\25\23\uffff\32\25\6\uffff\32\25",
			"\1\u0082",
			"\1\u0083",
			"\1\u0084",
			"\1\25\23\uffff\32\25\6\uffff\32\25",
			"",
			"\1\155",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\1\25\23\uffff\32\25\6\uffff\32\25",
			"\1\25\23\uffff\32\25\6\uffff\32\25",
			"\1\u008e",
			"\1\u008f",
			"",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"\1\25\23\uffff\32\25\6\uffff\32\25",
			"\1\u0095",
			"\1\25\23\uffff\32\25\6\uffff\32\25",
			"\1\25\23\uffff\32\25\6\uffff\32\25",
			"\1\u0096",
			"\1\u0097",
			"\1\u0098",
			"",
			"\1\u0099",
			"\1\u009a",
			"\1\25\23\uffff\32\25\6\uffff\32\25",
			"\1\u009c",
			"\1\u009d",
			"\1\u009e",
			"",
			"",
			"\1\u009f",
			"\1\25\23\uffff\32\25\6\uffff\17\25\1\u00a1\12\25",
			"\1\25\23\uffff\32\25\6\uffff\32\25",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"",
			"\1\u00a6",
			"\1\u00a7",
			"\1\25\23\uffff\32\25\6\uffff\32\25",
			"\1\u00a9",
			"\1\u00aa",
			"\1\25\23\uffff\32\25\6\uffff\32\25",
			"",
			"\1\25\23\uffff\32\25\6\uffff\32\25",
			"\1\u00ad",
			"\1\25\23\uffff\32\25\6\uffff\32\25",
			"\1\25\23\uffff\32\25\6\uffff\32\25",
			"",
			"\1\u00af",
			"",
			"\1\u00b0",
			"\1\25\23\uffff\32\25\6\uffff\32\25",
			"\1\25\23\uffff\32\25\6\uffff\32\25",
			"\1\25\23\uffff\32\25\6\uffff\32\25",
			"\1\25\23\uffff\32\25\6\uffff\32\25",
			"",
			"\1\u00b2",
			"\1\25\23\uffff\32\25\6\uffff\32\25",
			"",
			"",
			"\1\u00b3",
			"",
			"\1\74",
			"\1\u00b4",
			"",
			"\1\25\23\uffff\32\25\6\uffff\32\25",
			"\1\25\23\uffff\32\25\6\uffff\32\25",
			"\1\25\23\uffff\32\25\6\uffff\32\25"
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SELECT | COMBIEN | ET | OU | PARLER | ENTRE | WS | MOIS | MOT | RUBRIQUE | ARTICLE | AUTEUR | DATE | EMAIL | JOURS | PAGE | PUBLIE | RESUME | TITRE | NBR | POINT | AT | VAR );";
		}
	}

}

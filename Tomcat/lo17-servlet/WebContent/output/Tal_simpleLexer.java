// $ANTLR 3.5.1 C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g 2014-06-15 12:52:47
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
	public static final int CONTACTER=8;
	public static final int DATE=9;
	public static final int DERNIER=10;
	public static final int EMAIL=11;
	public static final int ENTRE=12;
	public static final int ET=13;
	public static final int JOURS=14;
	public static final int MOIS=15;
	public static final int MOT=16;
	public static final int NBR=17;
	public static final int OU=18;
	public static final int PAGE=19;
	public static final int PARLER=20;
	public static final int POINT=21;
	public static final int PREMIER=22;
	public static final int PUBLIE=23;
	public static final int RESUME=24;
	public static final int RUBRIQUE=25;
	public static final int SELECT=26;
	public static final int TITRE=27;
	public static final int TODAY=28;
	public static final int VAR=29;
	public static final int WS=30;

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
	@Override public String getGrammarFileName() { return "C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g"; }

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:5:8: ( 'vouloir' )
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:5:10: 'vouloir'
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
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:6:9: ( 'combien' )
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:6:11: 'combien'
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
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:7:4: ( 'et' )
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:7:6: 'et'
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
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:8:4: ( 'ou' )
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:8:6: 'ou'
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
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:9:8: ( ( 'parler' )+ )
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:9:10: ( 'parler' )+
			{
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:9:10: ( 'parler' )+
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:9:10: 'parler'
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
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:10:7: ( 'entre' )
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:10:8: 'entre'
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
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:11:4: ( ( ' ' | '\\t' | '\\r' | 'stop' ) | '\\n' )
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:11:6: ( ' ' | '\\t' | '\\r' | 'stop' )
					{
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:11:6: ( ' ' | '\\t' | '\\r' | 'stop' )
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
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:11:7: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:11:13: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:11:20: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:11:27: 'stop'
							{
							match("stop"); 

							}
							break;

					}

					 skip(); 
					}
					break;
				case 2 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:11:49: '\\n'
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
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:12:6: ( 'janvier' | 'fevrier' | 'f�vrier' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'aout' | 'aot' | 'sept' | 'octobre' | 'novembre' | 'decembre' | 'd�cembre' )
			int alt4=15;
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
						int LA4_18 = input.LA(4);
						if ( (LA4_18=='n') ) {
							alt4=7;
						}
						else if ( (LA4_18=='l') ) {
							alt4=8;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 4, 18, input);
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
				int LA4_2 = input.LA(2);
				if ( (LA4_2=='e') ) {
					alt4=2;
				}
				else if ( (LA4_2=='\u00E9') ) {
					alt4=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'm':
				{
				int LA4_3 = input.LA(2);
				if ( (LA4_3=='a') ) {
					int LA4_13 = input.LA(3);
					if ( (LA4_13=='r') ) {
						alt4=4;
					}
					else if ( (LA4_13=='i') ) {
						alt4=6;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 13, input);
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
					alt4=5;
				}
				else if ( (LA4_4=='o') ) {
					int LA4_15 = input.LA(3);
					if ( (LA4_15=='u') ) {
						alt4=9;
					}
					else if ( (LA4_15=='t') ) {
						alt4=10;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 15, input);
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
				alt4=11;
				}
				break;
			case 'o':
				{
				alt4=12;
				}
				break;
			case 'n':
				{
				alt4=13;
				}
				break;
			case 'd':
				{
				int LA4_8 = input.LA(2);
				if ( (LA4_8=='e') ) {
					alt4=14;
				}
				else if ( (LA4_8=='\u00E9') ) {
					alt4=15;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:12:8: 'janvier'
					{
					match("janvier"); 

					}
					break;
				case 2 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:12:18: 'fevrier'
					{
					match("fevrier"); 

					}
					break;
				case 3 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:12:28: 'f�vrier'
					{
					match("f�vrier"); 

					}
					break;
				case 4 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:12:38: 'mars'
					{
					match("mars"); 

					}
					break;
				case 5 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:12:45: 'avril'
					{
					match("avril"); 

					}
					break;
				case 6 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:12:53: 'mai'
					{
					match("mai"); 

					}
					break;
				case 7 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:12:59: 'juin'
					{
					match("juin"); 

					}
					break;
				case 8 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:12:66: 'juillet'
					{
					match("juillet"); 

					}
					break;
				case 9 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:12:76: 'aout'
					{
					match("aout"); 

					}
					break;
				case 10 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:12:83: 'aot'
					{
					match("aot"); 

					}
					break;
				case 11 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:12:89: 'sept'
					{
					match("sept"); 

					}
					break;
				case 12 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:12:96: 'octobre'
					{
					match("octobre"); 

					}
					break;
				case 13 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:12:106: 'novembre'
					{
					match("novembre"); 

					}
					break;
				case 14 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:12:117: 'decembre'
					{
					match("decembre"); 

					}
					break;
				case 15 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:12:128: 'd�cembre'
					{
					match("d�cembre"); 

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
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:13:5: ( 'mot' )
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:13:7: 'mot'
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

	// $ANTLR start "TODAY"
	public final void mTODAY() throws RecognitionException {
		try {
			int _type = TODAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:14:7: ( 'aujourd' )
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:14:9: 'aujourd'
			{
			match("aujourd"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TODAY"

	// $ANTLR start "PREMIER"
	public final void mPREMIER() throws RecognitionException {
		try {
			int _type = PREMIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:15:9: ( 'premier' )
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:15:11: 'premier'
			{
			match("premier"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PREMIER"

	// $ANTLR start "DERNIER"
	public final void mDERNIER() throws RecognitionException {
		try {
			int _type = DERNIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:16:9: ( 'dernier' )
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:16:11: 'dernier'
			{
			match("dernier"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DERNIER"

	// $ANTLR start "CONTACTER"
	public final void mCONTACTER() throws RecognitionException {
		try {
			int _type = CONTACTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:17:11: ( 'contacter' )
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:17:13: 'contacter'
			{
			match("contacter"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTACTER"

	// $ANTLR start "RUBRIQUE"
	public final void mRUBRIQUE() throws RecognitionException {
		try {
			int _type = RUBRIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:19:10: ( 'une' | 'grostitre' | 'focus' | 'rappels' | 'voiraussi' )
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:19:12: 'une'
					{
					match("une"); 

					}
					break;
				case 2 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:19:18: 'grostitre'
					{
					match("grostitre"); 

					}
					break;
				case 3 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:19:30: 'focus'
					{
					match("focus"); 

					}
					break;
				case 4 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:19:38: 'rappels'
					{
					match("rappels"); 

					}
					break;
				case 5 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:19:48: 'voiraussi'
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
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:21:9: ( 'article' )
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:21:11: 'article'
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
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:22:8: ( 'auteur' )
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:22:10: 'auteur'
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
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:23:6: ( 'date' )
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:23:8: 'date'
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
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:24:7: ( 'email' )
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:24:9: 'email'
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
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:25:7: ( 'jours' )
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:25:9: 'jours'
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
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:26:6: ( 'page' )
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:26:8: 'page'
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
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:27:8: ( 'publie' )
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:27:10: 'publie'
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
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:28:8: ( 'resume' )
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:28:10: 'resume'
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
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:29:7: ( 'titre' )
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:29:9: 'titre'
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
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:31:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:31:7: ( '0' .. '9' )+
			{
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:31:7: ( '0' .. '9' )+
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:
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
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:32:7: ( '.' )
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:32:9: '.'
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
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:33:4: ( '@' )
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:33:5: '@'
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
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:34:5: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' | '-' | 'A' .. 'Z' | '\\u00a0' .. '\\u00ff' )+ )
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:34:7: ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' | '-' | 'A' .. 'Z' | '\\u00a0' .. '\\u00ff' )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:34:29: ( 'a' .. 'z' | '-' | 'A' .. 'Z' | '\\u00a0' .. '\\u00ff' )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0=='-'||(LA7_0 >= 'A' && LA7_0 <= 'Z')||(LA7_0 >= 'a' && LA7_0 <= 'z')||(LA7_0 >= '\u00A0' && LA7_0 <= '\u00FF')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:
					{
					if ( input.LA(1)=='-'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00A0' && input.LA(1) <= '\u00FF') ) {
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
		// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:1:8: ( SELECT | COMBIEN | ET | OU | PARLER | ENTRE | WS | MOIS | MOT | TODAY | PREMIER | DERNIER | CONTACTER | RUBRIQUE | ARTICLE | AUTEUR | DATE | EMAIL | JOURS | PAGE | PUBLIE | RESUME | TITRE | NBR | POINT | AT | VAR )
		int alt8=27;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:1:10: SELECT
				{
				mSELECT(); 

				}
				break;
			case 2 :
				// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:1:17: COMBIEN
				{
				mCOMBIEN(); 

				}
				break;
			case 3 :
				// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:1:25: ET
				{
				mET(); 

				}
				break;
			case 4 :
				// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:1:28: OU
				{
				mOU(); 

				}
				break;
			case 5 :
				// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:1:31: PARLER
				{
				mPARLER(); 

				}
				break;
			case 6 :
				// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:1:38: ENTRE
				{
				mENTRE(); 

				}
				break;
			case 7 :
				// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:1:44: WS
				{
				mWS(); 

				}
				break;
			case 8 :
				// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:1:47: MOIS
				{
				mMOIS(); 

				}
				break;
			case 9 :
				// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:1:52: MOT
				{
				mMOT(); 

				}
				break;
			case 10 :
				// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:1:56: TODAY
				{
				mTODAY(); 

				}
				break;
			case 11 :
				// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:1:62: PREMIER
				{
				mPREMIER(); 

				}
				break;
			case 12 :
				// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:1:70: DERNIER
				{
				mDERNIER(); 

				}
				break;
			case 13 :
				// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:1:78: CONTACTER
				{
				mCONTACTER(); 

				}
				break;
			case 14 :
				// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:1:88: RUBRIQUE
				{
				mRUBRIQUE(); 

				}
				break;
			case 15 :
				// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:1:97: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 16 :
				// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:1:105: AUTEUR
				{
				mAUTEUR(); 

				}
				break;
			case 17 :
				// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:1:112: DATE
				{
				mDATE(); 

				}
				break;
			case 18 :
				// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:1:117: EMAIL
				{
				mEMAIL(); 

				}
				break;
			case 19 :
				// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:1:123: JOURS
				{
				mJOURS(); 

				}
				break;
			case 20 :
				// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:1:129: PAGE
				{
				mPAGE(); 

				}
				break;
			case 21 :
				// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:1:134: PUBLIE
				{
				mPUBLIE(); 

				}
				break;
			case 22 :
				// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:1:141: RESUME
				{
				mRESUME(); 

				}
				break;
			case 23 :
				// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:1:148: TITRE
				{
				mTITRE(); 

				}
				break;
			case 24 :
				// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:1:154: NBR
				{
				mNBR(); 

				}
				break;
			case 25 :
				// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:1:158: POINT
				{
				mPOINT(); 

				}
				break;
			case 26 :
				// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:1:164: AT
				{
				mAT(); 

				}
				break;
			case 27 :
				// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:1:167: VAR
				{
				mVAR(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\26\uffff\2\25\1\73\2\25\1\76\37\25\1\uffff\2\25\1\uffff\16\25\1\164\1"+
		"\165\2\25\1\164\10\25\1\u0080\14\25\1\u008d\2\25\1\6\1\164\1\25\1\164"+
		"\5\25\1\164\2\uffff\1\25\1\164\7\25\1\u009e\1\uffff\10\25\1\u00a7\1\u00a8"+
		"\2\25\1\uffff\4\25\1\u00af\2\25\1\u0080\1\164\7\25\1\uffff\3\25\1\u00bc"+
		"\4\25\2\uffff\1\25\1\u00c2\1\25\1\u00c5\2\25\1\uffff\3\25\1\u00cb\7\25"+
		"\1\u00d3\1\uffff\1\u00d4\1\25\1\u00d6\1\25\1\164\1\uffff\1\25\1\u00d9"+
		"\1\uffff\4\164\1\u00da\1\uffff\1\u00db\2\25\1\u00de\2\25\1\u0080\2\uffff"+
		"\1\25\1\uffff\2\25\3\uffff\2\164\1\uffff\1\164\1\25\1\u0080\1\u00e4\1"+
		"\u0080\1\uffff";
	static final String DFA8_eofS =
		"\u00e5\uffff";
	static final String DFA8_minS =
		"\1\11\5\55\1\uffff\13\55\4\uffff\1\151\1\155\1\55\1\164\1\141\1\55\1\164"+
		"\1\147\1\145\1\142\1\157\1\160\1\156\1\151\1\165\2\166\1\143\1\151\1\164"+
		"\1\162\1\164\1\152\1\164\1\166\2\143\1\164\1\145\1\157\1\160\1\163\1\164"+
		"\1\154\1\162\1\142\1\164\1\uffff\1\162\1\151\1\uffff\1\157\1\154\1\145"+
		"\1\155\1\154\1\160\1\164\1\166\1\154\3\162\1\165\1\163\2\55\1\151\1\164"+
		"\1\55\1\157\1\145\1\151\2\145\1\156\2\145\1\55\1\163\1\160\1\165\1\162"+
		"\1\157\1\141\1\151\1\141\1\145\1\154\1\142\1\145\1\55\2\151\2\55\1\151"+
		"\1\55\1\154\1\163\2\151\1\163\1\55\2\uffff\1\154\1\55\2\165\1\143\2\155"+
		"\1\151\1\155\1\55\1\uffff\1\164\1\145\1\155\1\145\1\151\1\165\1\145\1"+
		"\143\2\55\2\162\1\uffff\4\145\1\55\2\145\2\55\2\162\1\154\2\142\1\145"+
		"\1\142\1\uffff\1\151\1\154\1\145\1\55\1\162\1\163\1\156\1\164\2\uffff"+
		"\1\145\1\55\1\162\1\55\1\162\1\164\1\uffff\2\162\1\144\1\55\1\145\4\162"+
		"\1\164\1\163\1\55\1\uffff\1\55\1\163\1\55\1\145\1\55\1\uffff\1\141\1\55"+
		"\1\uffff\5\55\1\uffff\1\55\2\145\1\55\1\145\1\162\1\55\2\uffff\1\151\1"+
		"\uffff\2\162\3\uffff\2\55\1\uffff\1\55\1\145\3\55\1\uffff";
	static final String DFA8_maxS =
		"\1\172\5\u00ff\1\uffff\13\u00ff\4\uffff\1\165\1\156\1\u00ff\1\164\1\141"+
		"\1\u00ff\1\164\1\162\1\145\1\142\1\157\1\160\1\156\1\151\1\165\2\166\1"+
		"\143\1\162\1\164\1\162\1\165\2\164\1\166\1\162\1\143\1\164\1\145\1\157"+
		"\1\160\1\163\1\164\1\154\1\162\1\142\1\164\1\uffff\1\162\1\151\1\uffff"+
		"\1\157\1\154\1\145\1\155\1\154\1\160\1\164\1\166\1\156\3\162\1\165\1\163"+
		"\2\u00ff\1\151\1\164\1\u00ff\1\157\1\145\1\151\2\145\1\156\2\145\1\u00ff"+
		"\1\163\1\160\1\165\1\162\1\157\1\141\1\151\1\141\1\145\1\154\1\142\1\145"+
		"\1\u00ff\2\151\2\u00ff\1\151\1\u00ff\1\154\1\163\2\151\1\163\1\u00ff\2"+
		"\uffff\1\154\1\u00ff\2\165\1\143\2\155\1\151\1\155\1\u00ff\1\uffff\1\164"+
		"\1\145\1\155\1\145\1\151\1\165\1\145\1\143\2\u00ff\2\162\1\uffff\4\145"+
		"\1\u00ff\2\145\2\u00ff\2\162\1\154\2\142\1\145\1\142\1\uffff\1\151\1\154"+
		"\1\145\1\u00ff\1\162\1\163\1\156\1\164\2\uffff\1\145\1\u00ff\1\162\1\u00ff"+
		"\1\162\1\164\1\uffff\2\162\1\144\1\u00ff\1\145\4\162\1\164\1\163\1\u00ff"+
		"\1\uffff\1\u00ff\1\163\1\u00ff\1\145\1\u00ff\1\uffff\1\141\1\u00ff\1\uffff"+
		"\5\u00ff\1\uffff\1\u00ff\2\145\1\u00ff\1\145\1\162\1\u00ff\2\uffff\1\151"+
		"\1\uffff\2\162\3\uffff\2\u00ff\1\uffff\1\u00ff\1\145\3\u00ff\1\uffff";
	static final String DFA8_acceptS =
		"\6\uffff\1\7\13\uffff\1\30\1\31\1\32\1\33\45\uffff\1\3\2\uffff\1\4\65"+
		"\uffff\1\10\1\11\12\uffff\1\16\14\uffff\1\24\20\uffff\1\21\10\uffff\1"+
		"\6\1\22\6\uffff\1\23\14\uffff\1\27\5\uffff\1\5\2\uffff\1\25\5\uffff\1"+
		"\20\7\uffff\1\26\1\1\1\uffff\1\2\2\uffff\1\13\1\12\1\17\2\uffff\1\14\5"+
		"\uffff\1\15";
	static final String DFA8_specialS =
		"\u00e5\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\6\2\uffff\1\6\22\uffff\1\6\15\uffff\1\23\1\uffff\12\22\6\uffff\1\24"+
			"\32\25\6\uffff\1\13\1\25\1\2\1\15\1\3\1\11\1\17\2\25\1\10\2\25\1\12\1"+
			"\14\1\4\1\5\1\25\1\20\1\7\1\21\1\16\1\1\4\25",
			"\1\25\23\uffff\32\25\6\uffff\16\25\1\26\13\25\45\uffff\140\25",
			"\1\25\23\uffff\32\25\6\uffff\16\25\1\27\13\25\45\uffff\140\25",
			"\1\25\23\uffff\32\25\6\uffff\14\25\1\32\1\31\5\25\1\30\6\25\45\uffff"+
			"\140\25",
			"\1\25\23\uffff\32\25\6\uffff\2\25\1\34\21\25\1\33\5\25\45\uffff\140"+
			"\25",
			"\1\25\23\uffff\32\25\6\uffff\1\35\20\25\1\36\2\25\1\37\5\25\45\uffff"+
			"\140\25",
			"",
			"\1\25\23\uffff\32\25\6\uffff\4\25\1\41\16\25\1\40\6\25\45\uffff\140"+
			"\25",
			"\1\25\23\uffff\32\25\6\uffff\1\42\15\25\1\44\5\25\1\43\5\25\45\uffff"+
			"\140\25",
			"\1\25\23\uffff\32\25\6\uffff\4\25\1\45\11\25\1\47\13\25\45\uffff\111"+
			"\25\1\46\26\25",
			"\1\25\23\uffff\32\25\6\uffff\1\50\15\25\1\51\13\25\45\uffff\140\25",
			"\1\25\23\uffff\32\25\6\uffff\16\25\1\53\2\25\1\55\2\25\1\54\1\52\4\25"+
			"\45\uffff\140\25",
			"\1\25\23\uffff\32\25\6\uffff\16\25\1\56\13\25\45\uffff\140\25",
			"\1\25\23\uffff\32\25\6\uffff\1\61\3\25\1\57\25\25\45\uffff\111\25\1"+
			"\60\26\25",
			"\1\25\23\uffff\32\25\6\uffff\15\25\1\62\14\25\45\uffff\140\25",
			"\1\25\23\uffff\32\25\6\uffff\21\25\1\63\10\25\45\uffff\140\25",
			"\1\25\23\uffff\32\25\6\uffff\1\64\3\25\1\65\25\25\45\uffff\140\25",
			"\1\25\23\uffff\32\25\6\uffff\10\25\1\66\21\25\45\uffff\140\25",
			"",
			"",
			"",
			"",
			"\1\70\13\uffff\1\67",
			"\1\71\1\72",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"\1\74",
			"\1\75",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"\1\77",
			"\1\101\12\uffff\1\100",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\115\10\uffff\1\114",
			"\1\116",
			"\1\117",
			"\1\121\1\120",
			"\1\122\11\uffff\1\123",
			"\1\124",
			"\1\125",
			"\1\126\16\uffff\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"",
			"\1\143",
			"\1\144",
			"",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\156\1\uffff\1\155",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"\1\166",
			"\1\167",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"\1\170",
			"\1\171",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\177",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"\1\u0081",
			"\1\u0082",
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
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"\1\u008e",
			"\1\u008f",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"\1\u0090",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"",
			"",
			"\1\u0096",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"\1\u0097",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\1\u009d",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"",
			"\1\u009f",
			"\1\u00a0",
			"\1\u00a1",
			"\1\u00a2",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"\1\u00a9",
			"\1\u00aa",
			"",
			"\1\u00ab",
			"\1\u00ac",
			"\1\u00ad",
			"\1\u00ae",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"\1\u00b0",
			"\1\u00b1",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\1\u00b5",
			"\1\u00b6",
			"\1\u00b7",
			"\1\u00b8",
			"",
			"\1\u00b9",
			"\1\u00ba",
			"\1\u00bb",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"\1\u00bd",
			"\1\u00be",
			"\1\u00bf",
			"\1\u00c0",
			"",
			"",
			"\1\u00c1",
			"\1\25\23\uffff\32\25\6\uffff\17\25\1\u00c3\12\25\45\uffff\140\25",
			"\1\u00c4",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"\1\u00c6",
			"\1\u00c7",
			"",
			"\1\u00c8",
			"\1\u00c9",
			"\1\u00ca",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"\1\u00cc",
			"\1\u00cd",
			"\1\u00ce",
			"\1\u00cf",
			"\1\u00d0",
			"\1\u00d1",
			"\1\u00d2",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"\1\u00d5",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"\1\u00d7",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"",
			"\1\u00d8",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"\1\u00dc",
			"\1\u00dd",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"\1\u00df",
			"\1\u00e0",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"",
			"",
			"\1\u00e1",
			"",
			"\1\u00e2",
			"\1\100",
			"",
			"",
			"",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"\1\u00e3",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			"\1\25\23\uffff\32\25\6\uffff\32\25\45\uffff\140\25",
			""
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
			return "1:1: Tokens : ( SELECT | COMBIEN | ET | OU | PARLER | ENTRE | WS | MOIS | MOT | TODAY | PREMIER | DERNIER | CONTACTER | RUBRIQUE | ARTICLE | AUTEUR | DATE | EMAIL | JOURS | PAGE | PUBLIE | RESUME | TITRE | NBR | POINT | AT | VAR );";
		}
	}

}

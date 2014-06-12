// $ANTLR 3.5.1 C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g 2014-06-12 10:38:24
package antlr.output;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Tal_simpleParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARTICLE", "AT", "AUTEUR", "COMBIEN", 
		"CONTACTER", "DATE", "DERNIER", "EMAIL", "ENTRE", "ET", "JOURS", "MOIS", 
		"MOT", "NBR", "OU", "PAGE", "PARLER", "POINT", "PREMIER", "PUBLIE", "RESUME", 
		"RUBRIQUE", "SELECT", "TITRE", "TODAY", "VAR", "WS"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public Tal_simpleParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public Tal_simpleParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return Tal_simpleParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g"; }



	// $ANTLR start "requete"
	// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:36:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( ARTICLE d= dat ( PARLER )+ ps= params | ARTICLE ( PARLER )+ ps= params | COMBIEN ARTICLE ( PARLER )+ ps= params | COMBIEN ARTICLE ps1= params ( PARLER )+ ps2= params | COMBIEN ARTICLE ( PARLER )+ ps1= params PARLER ps2= params | COMBIEN ARTICLE ( PARLER )+ ps= params d= dat | COMBIEN ARTICLE d= dat | COMBIEN AUTEUR ARTICLE ENTRE d1= dat ET d2= dat | COMBIEN AUTEUR d= dat | COMBIEN AUTEUR ARTICLE ( PARLER )+ ps= params | COMBIEN AUTEUR e= email | COMBIEN AUTEUR e= email ( PARLER )+ ps= params | COMBIEN JOURS ( PARLER )+ ps= params | COMBIEN MOT ps= params ET SELECT ARTICLE | COMBIEN MOT ps= params r= RUBRIQUE | COMBIEN PAGE ( PARLER )+ ps= params | COMBIEN PAGE ( PARLER )+ ps= params d= dat | COMBIEN r= RUBRIQUE ( PARLER )+ ps= params ENTRE d1= dat ET d2= dat | COMBIEN r= RUBRIQUE ( PARLER )+ ps= params | COMBIEN r= RUBRIQUE ENTRE d1= dat ET d2= dat ( PARLER )+ ps= params | COMBIEN r= RUBRIQUE ps= params | EMAIL AUTEUR ps= params | SELECT ARTICLE ( PARLER )+ ps= params ENTRE d1= dat ET d2= dat | SELECT ARTICLE ( PARLER )+ ps= params ( DATE )? d= dat | SELECT ARTICLE ( DATE )? d= dat | SELECT ARTICLE ps1= params ( PARLER )+ ps2= params | SELECT ARTICLE ( PARLER )+ ps= params | SELECT ARTICLE d= dat AUTEUR e= email | SELECT ARTICLE AUTEUR e= email ET ( PARLER )+ r= RUBRIQUE | SELECT ARTICLE AUTEUR ps= params | SELECT ARTICLE AUTEUR e= email | SELECT ARTICLE ps1= params AUTEUR ps2= params | SELECT ARTICLE d= dat ET ( PARLER )+ ps= params | SELECT AUTEUR ARTICLE ( PARLER )+ ps= params | SELECT AUTEUR ARTICLE ps= params | SELECT COMBIEN r= RUBRIQUE ( PARLER )+ ps= params | SELECT DATE ( ARTICLE )? ( PARLER )+ ps= params | SELECT EMAIL AUTEUR ps= params | SELECT PAGE ARTICLE ( AUTEUR )* e= email | SELECT PAGE ( PARLER )+ ps= params );
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Token r=null;
		Arbre d =null;
		Arbre ps =null;
		Arbre ps1 =null;
		Arbre ps2 =null;
		Arbre d1 =null;
		Arbre d2 =null;
		Arbre e =null;

		Arbre ps_arbre, d_arbre, e_arbre;
		try {
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:37:44: ( ARTICLE d= dat ( PARLER )+ ps= params | ARTICLE ( PARLER )+ ps= params | COMBIEN ARTICLE ( PARLER )+ ps= params | COMBIEN ARTICLE ps1= params ( PARLER )+ ps2= params | COMBIEN ARTICLE ( PARLER )+ ps1= params PARLER ps2= params | COMBIEN ARTICLE ( PARLER )+ ps= params d= dat | COMBIEN ARTICLE d= dat | COMBIEN AUTEUR ARTICLE ENTRE d1= dat ET d2= dat | COMBIEN AUTEUR d= dat | COMBIEN AUTEUR ARTICLE ( PARLER )+ ps= params | COMBIEN AUTEUR e= email | COMBIEN AUTEUR e= email ( PARLER )+ ps= params | COMBIEN JOURS ( PARLER )+ ps= params | COMBIEN MOT ps= params ET SELECT ARTICLE | COMBIEN MOT ps= params r= RUBRIQUE | COMBIEN PAGE ( PARLER )+ ps= params | COMBIEN PAGE ( PARLER )+ ps= params d= dat | COMBIEN r= RUBRIQUE ( PARLER )+ ps= params ENTRE d1= dat ET d2= dat | COMBIEN r= RUBRIQUE ( PARLER )+ ps= params | COMBIEN r= RUBRIQUE ENTRE d1= dat ET d2= dat ( PARLER )+ ps= params | COMBIEN r= RUBRIQUE ps= params | EMAIL AUTEUR ps= params | SELECT ARTICLE ( PARLER )+ ps= params ENTRE d1= dat ET d2= dat | SELECT ARTICLE ( PARLER )+ ps= params ( DATE )? d= dat | SELECT ARTICLE ( DATE )? d= dat | SELECT ARTICLE ps1= params ( PARLER )+ ps2= params | SELECT ARTICLE ( PARLER )+ ps= params | SELECT ARTICLE d= dat AUTEUR e= email | SELECT ARTICLE AUTEUR e= email ET ( PARLER )+ r= RUBRIQUE | SELECT ARTICLE AUTEUR ps= params | SELECT ARTICLE AUTEUR e= email | SELECT ARTICLE ps1= params AUTEUR ps2= params | SELECT ARTICLE d= dat ET ( PARLER )+ ps= params | SELECT AUTEUR ARTICLE ( PARLER )+ ps= params | SELECT AUTEUR ARTICLE ps= params | SELECT COMBIEN r= RUBRIQUE ( PARLER )+ ps= params | SELECT DATE ( ARTICLE )? ( PARLER )+ ps= params | SELECT EMAIL AUTEUR ps= params | SELECT PAGE ARTICLE ( AUTEUR )* e= email | SELECT PAGE ( PARLER )+ ps= params )
			int alt29=40;
			alt29 = dfa29.predict(input);
			switch (alt29) {
				case 1 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:43:4: ARTICLE d= dat ( PARLER )+ ps= params
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete332); 
					pushFollow(FOLLOW_dat_in_requete338);
					d=dat();
					state._fsp--;

					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:43:20: ( PARLER )+
					int cnt1=0;
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==PARLER) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:43:20: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete340); 
							}
							break;

						default :
							if ( cnt1 >= 1 ) break loop1;
							EarlyExitException eee = new EarlyExitException(1, input);
							throw eee;
						}
						cnt1++;
					}

					pushFollow(FOLLOW_params_in_requete345);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct"));
								req_arbre.ajouteFils(new Arbre("", "m.page "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m, datearticle d"));
								req_arbre.ajouteFils(new Arbre("", "where m.article = d.article "));
								req_arbre.ajouteFils(new Arbre("", "AND "));
								d_arbre = d;
								req_arbre.ajouteFils(d_arbre);
								req_arbre.ajouteFils(new Arbre("", "AND "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 2 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:56:5: ARTICLE ( PARLER )+ ps= params
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete356); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:56:13: ( PARLER )+
					int cnt2=0;
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==PARLER) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:56:13: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete358); 
							}
							break;

						default :
							if ( cnt2 >= 1 ) break loop2;
							EarlyExitException eee = new EarlyExitException(2, input);
							throw eee;
						}
						cnt2++;
					}

					pushFollow(FOLLOW_params_in_requete363);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct m.page"));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m"));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 3 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:78:5: COMBIEN ARTICLE ( PARLER )+ ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete409); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete411); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:78:21: ( PARLER )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==PARLER) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:78:21: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete413); 
							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					pushFollow(FOLLOW_params_in_requete420);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(distinct m.article) "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 4 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:87:5: COMBIEN ARTICLE ps1= params ( PARLER )+ ps2= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete434); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete436); 
					pushFollow(FOLLOW_params_in_requete442);
					ps1=params();
					state._fsp--;

					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:87:34: ( PARLER )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==PARLER) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:87:34: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete444); 
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					pushFollow(FOLLOW_params_in_requete451);
					ps2=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(distinct m.article) "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = ps1;
								req_arbre.ajouteFils(ps_arbre);
								req_arbre.ajouteFils(new Arbre("", " AND "));
								ps_arbre = ps2;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 5 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:99:5: COMBIEN ARTICLE ( PARLER )+ ps1= params PARLER ps2= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete465); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete467); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:99:21: ( PARLER )+
					int cnt5=0;
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==PARLER) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:99:21: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete469); 
							}
							break;

						default :
							if ( cnt5 >= 1 ) break loop5;
							EarlyExitException eee = new EarlyExitException(5, input);
							throw eee;
						}
						cnt5++;
					}

					pushFollow(FOLLOW_params_in_requete476);
					ps1=params();
					state._fsp--;

					match(input,PARLER,FOLLOW_PARLER_in_requete478); 
					pushFollow(FOLLOW_params_in_requete484);
					ps2=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct count(m.article) "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = ps1;
								req_arbre.ajouteFils(ps_arbre);
								req_arbre.ajouteFils(new Arbre("", " AND "));
								ps_arbre = ps2;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 6 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:112:5: COMBIEN ARTICLE ( PARLER )+ ps= params d= dat
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete501); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete503); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:112:21: ( PARLER )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==PARLER) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:112:21: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete505); 
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					pushFollow(FOLLOW_params_in_requete512);
					ps=params();
					state._fsp--;

					pushFollow(FOLLOW_dat_in_requete518);
					d=dat();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(distinct m.article) "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m, datearticle d "));
								req_arbre.ajouteFils(new Arbre("", "where m.article = d.article "));
								req_arbre.ajouteFils(new Arbre("", " AND "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
								req_arbre.ajouteFils(new Arbre("", " AND "));
								d_arbre = d;
								req_arbre.ajouteFils(d_arbre);
							
					}
					break;
				case 7 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:124:5: COMBIEN ARTICLE d= dat
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete529); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete531); 
					pushFollow(FOLLOW_dat_in_requete537);
					d=dat();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(distinct m.article) "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m, datearticle d "));
								req_arbre.ajouteFils(new Arbre("", "where m.article = d.article "));
								req_arbre.ajouteFils(new Arbre("", " AND "));
								d_arbre = d;
								req_arbre.ajouteFils(d_arbre);
							
					}
					break;
				case 8 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:135:5: COMBIEN AUTEUR ARTICLE ENTRE d1= dat ET d2= dat
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete553); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete555); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete557); 
					match(input,ENTRE,FOLLOW_ENTRE_in_requete559); 
					pushFollow(FOLLOW_dat_in_requete565);
					d1=dat();
					state._fsp--;

					match(input,ET,FOLLOW_ET_in_requete567); 
					pushFollow(FOLLOW_dat_in_requete573);
					d2=dat();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(distinct e.email)"));
								req_arbre.ajouteFils(new Arbre("", "from datearticle m, email e"));
								req_arbre.ajouteFils(new Arbre("", "where d.article = e.article "));
								req_arbre.ajouteFils(new Arbre("", " AND "));
								d_arbre = d1;
								req_arbre.ajouteFils(d_arbre);
								req_arbre.ajouteFils(new Arbre("", " AND "));
								d_arbre = d2;
								req_arbre.ajouteFils(d_arbre);
							
					}
					break;
				case 9 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:148:5: COMBIEN AUTEUR d= dat
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete587); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete589); 
					pushFollow(FOLLOW_dat_in_requete596);
					d=dat();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(distinct e.email) "));
								req_arbre.ajouteFils(new Arbre("", "from datearticle d, email e"));
								req_arbre.ajouteFils(new Arbre("", "where d.article = e.article"));
								req_arbre.ajouteFils(new Arbre("", " AND "));
								d_arbre = d;
								req_arbre.ajouteFils(d_arbre);
							
					}
					break;
				case 10 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:158:5: COMBIEN AUTEUR ARTICLE ( PARLER )+ ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete610); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete612); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete615); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:158:29: ( PARLER )+
					int cnt7=0;
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==PARLER) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:158:29: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete617); 
							}
							break;

						default :
							if ( cnt7 >= 1 ) break loop7;
							EarlyExitException eee = new EarlyExitException(7, input);
							throw eee;
						}
						cnt7++;
					}

					pushFollow(FOLLOW_params_in_requete624);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(distinct e.email) "));
								req_arbre.ajouteFils(new Arbre("", "from datearticle d, email e, titreresume m"));
								req_arbre.ajouteFils(new Arbre("", "where d.article = e.article AND e.article = m.article "));
								req_arbre.ajouteFils(new Arbre("", " AND "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 11 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:167:5: COMBIEN AUTEUR e= email
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete633); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete635); 
					pushFollow(FOLLOW_email_in_requete641);
					e=email();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct count(e.email) "));
								req_arbre.ajouteFils(new Arbre("", "from email e "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = e;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 12 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:176:5: COMBIEN AUTEUR e= email ( PARLER )+ ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete655); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete657); 
					pushFollow(FOLLOW_email_in_requete663);
					e=email();
					state._fsp--;

					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:176:30: ( PARLER )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==PARLER) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:176:30: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete665); 
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					pushFollow(FOLLOW_params_in_requete672);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(distinct e.email) "));
								req_arbre.ajouteFils(new Arbre("", "from email e, titreresume m"));
								req_arbre.ajouteFils(new Arbre("", "where e.article = m.article "));
								req_arbre.ajouteFils(new Arbre("", "' AND "));
								ps_arbre = e;
								req_arbre.ajouteFils(ps_arbre);
								req_arbre.ajouteFils(new Arbre("", "' AND "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 13 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:190:5: COMBIEN JOURS ( PARLER )+ ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete686); 
					match(input,JOURS,FOLLOW_JOURS_in_requete688); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:190:19: ( PARLER )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==PARLER) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:190:19: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete690); 
							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					pushFollow(FOLLOW_params_in_requete697);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(distinct datearticle.jj) "));
								req_arbre.ajouteFils(new Arbre("", "from datearticle, titreresume "));
								req_arbre.ajouteFils(new Arbre("", "where datearticle.article = titreresume.article "));
								req_arbre.ajouteFils(new Arbre("", " AND "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 14 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:201:5: COMBIEN MOT ps= params ET SELECT ARTICLE
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete713); 
					match(input,MOT,FOLLOW_MOT_in_requete715); 
					pushFollow(FOLLOW_params_in_requete721);
					ps=params();
					state._fsp--;

					match(input,ET,FOLLOW_ET_in_requete723); 
					match(input,SELECT,FOLLOW_SELECT_in_requete725); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete727); 

								req_arbre.ajouteFils(new Arbre("", "select count(distinct m.mot), m.page"));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 15 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:210:5: COMBIEN MOT ps= params r= RUBRIQUE
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete741); 
					match(input,MOT,FOLLOW_MOT_in_requete743); 
					pushFollow(FOLLOW_params_in_requete749);
					ps=params();
					state._fsp--;

					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete755); 

								req_arbre.ajouteFils(new Arbre("", "select count(m.mot) "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
								req_arbre.ajouteFils(new Arbre("", "where m.rubrique = '" + r.getText() + "' "));
								req_arbre.ajouteFils(new Arbre("", " AND "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 16 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:220:5: COMBIEN PAGE ( PARLER )+ ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete766); 
					match(input,PAGE,FOLLOW_PAGE_in_requete768); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:220:18: ( PARLER )+
					int cnt10=0;
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==PARLER) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:220:18: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete770); 
							}
							break;

						default :
							if ( cnt10 >= 1 ) break loop10;
							EarlyExitException eee = new EarlyExitException(10, input);
							throw eee;
						}
						cnt10++;
					}

					pushFollow(FOLLOW_params_in_requete777);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(distinct m.page) "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 17 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:229:5: COMBIEN PAGE ( PARLER )+ ps= params d= dat
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete791); 
					match(input,PAGE,FOLLOW_PAGE_in_requete793); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:229:18: ( PARLER )+
					int cnt11=0;
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==PARLER) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:229:18: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete795); 
							}
							break;

						default :
							if ( cnt11 >= 1 ) break loop11;
							EarlyExitException eee = new EarlyExitException(11, input);
							throw eee;
						}
						cnt11++;
					}

					pushFollow(FOLLOW_params_in_requete802);
					ps=params();
					state._fsp--;

					pushFollow(FOLLOW_dat_in_requete808);
					d=dat();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(distinct m.page) "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m, datepage d "));
								req_arbre.ajouteFils(new Arbre("", "where m.page = d.page "));
								req_arbre.ajouteFils(new Arbre("", "AND "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
								req_arbre.ajouteFils(new Arbre("", " AND "));
								d_arbre = d;
								req_arbre.ajouteFils(d_arbre);
							
					}
					break;
				case 18 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:243:5: COMBIEN r= RUBRIQUE ( PARLER )+ ps= params ENTRE d1= dat ET d2= dat
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete824); 
					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete830); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:243:26: ( PARLER )+
					int cnt12=0;
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==PARLER) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:243:26: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete832); 
							}
							break;

						default :
							if ( cnt12 >= 1 ) break loop12;
							EarlyExitException eee = new EarlyExitException(12, input);
							throw eee;
						}
						cnt12++;
					}

					pushFollow(FOLLOW_params_in_requete839);
					ps=params();
					state._fsp--;

					match(input,ENTRE,FOLLOW_ENTRE_in_requete841); 
					pushFollow(FOLLOW_dat_in_requete847);
					d1=dat();
					state._fsp--;

					match(input,ET,FOLLOW_ET_in_requete849); 
					pushFollow(FOLLOW_dat_in_requete855);
					d2=dat();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(distinct m.rubrique) "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m, datearticle d "));
								req_arbre.ajouteFils(new Arbre("", "where m.article = d.article "));
								req_arbre.ajouteFils(new Arbre("", "AND m.rubrique = '" + r.getText() + "' "));
								req_arbre.ajouteFils(new Arbre("", "AND  "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
								req_arbre.ajouteFils(new Arbre("", " AND "));
								d_arbre = d1;
								req_arbre.ajouteFils(d_arbre);
								req_arbre.ajouteFils(new Arbre("", " AND "));
								d_arbre = d2;
								req_arbre.ajouteFils(d_arbre);
							
					}
					break;
				case 19 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:266:5: COMBIEN r= RUBRIQUE ( PARLER )+ ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete885); 
					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete891); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:266:26: ( PARLER )+
					int cnt13=0;
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==PARLER) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:266:26: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete893); 
							}
							break;

						default :
							if ( cnt13 >= 1 ) break loop13;
							EarlyExitException eee = new EarlyExitException(13, input);
							throw eee;
						}
						cnt13++;
					}

					pushFollow(FOLLOW_params_in_requete900);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(distinct m.rubrique) "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
								req_arbre.ajouteFils(new Arbre("", "where m.rubrique = '" + r.getText() + "' "));
								req_arbre.ajouteFils(new Arbre("", " AND "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 20 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:276:5: COMBIEN r= RUBRIQUE ENTRE d1= dat ET d2= dat ( PARLER )+ ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete914); 
					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete920); 
					match(input,ENTRE,FOLLOW_ENTRE_in_requete922); 
					pushFollow(FOLLOW_dat_in_requete928);
					d1=dat();
					state._fsp--;

					match(input,ET,FOLLOW_ET_in_requete930); 
					pushFollow(FOLLOW_dat_in_requete936);
					d2=dat();
					state._fsp--;

					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:276:53: ( PARLER )+
					int cnt14=0;
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==PARLER) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:276:53: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete938); 
							}
							break;

						default :
							if ( cnt14 >= 1 ) break loop14;
							EarlyExitException eee = new EarlyExitException(14, input);
							throw eee;
						}
						cnt14++;
					}

					pushFollow(FOLLOW_params_in_requete946);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(m.rubrique) "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m, datearticle d"));
								req_arbre.ajouteFils(new Arbre("", "where m.article = d.article"));
								req_arbre.ajouteFils(new Arbre("", "AND m.rubrique = '" + r.getText() + "' "));
								req_arbre.ajouteFils(new Arbre("", "AND "));
								d_arbre = d1;
								req_arbre.ajouteFils(d_arbre);
								req_arbre.ajouteFils(new Arbre("", " AND "));
								d_arbre = d2;
								req_arbre.ajouteFils(d_arbre);
								req_arbre.ajouteFils(new Arbre("", " AND "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 21 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:292:5: COMBIEN r= RUBRIQUE ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete957); 
					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete963); 
					pushFollow(FOLLOW_params_in_requete969);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(m.rubrique) "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
								req_arbre.ajouteFils(new Arbre("", "where m.rubrique = '" + r.getText() + "' "));
								req_arbre.ajouteFils(new Arbre("", " AND "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 22 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:304:5: EMAIL AUTEUR ps= params
					{
					match(input,EMAIL,FOLLOW_EMAIL_in_requete985); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete987); 
					pushFollow(FOLLOW_params_in_requete993);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct e.email "));
								req_arbre.ajouteFils(new Arbre("", "from email e"));
								req_arbre.ajouteFils(new Arbre("", "where "));;
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 23 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:317:5: SELECT ARTICLE ( PARLER )+ ps= params ENTRE d1= dat ET d2= dat
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1012); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1014); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:317:20: ( PARLER )+
					int cnt15=0;
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==PARLER) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:317:20: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete1016); 
							}
							break;

						default :
							if ( cnt15 >= 1 ) break loop15;
							EarlyExitException eee = new EarlyExitException(15, input);
							throw eee;
						}
						cnt15++;
					}

					pushFollow(FOLLOW_params_in_requete1024);
					ps=params();
					state._fsp--;

					match(input,ENTRE,FOLLOW_ENTRE_in_requete1026); 
					pushFollow(FOLLOW_dat_in_requete1032);
					d1=dat();
					state._fsp--;

					match(input,ET,FOLLOW_ET_in_requete1034); 
					pushFollow(FOLLOW_dat_in_requete1040);
					d2=dat();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct m.page "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m, datearticle d"));
								req_arbre.ajouteFils(new Arbre("", "where m.article = d.article"));
								req_arbre.ajouteFils(new Arbre("", "AND "));
								d_arbre = d1;
								req_arbre.ajouteFils(d_arbre);
								req_arbre.ajouteFils(new Arbre("", " AND "));
								d_arbre = d2;
								req_arbre.ajouteFils(d_arbre);
								req_arbre.ajouteFils(new Arbre("", "AND '"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 24 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:332:5: SELECT ARTICLE ( PARLER )+ ps= params ( DATE )? d= dat
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1056); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1058); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:332:20: ( PARLER )+
					int cnt16=0;
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==PARLER) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:332:20: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete1060); 
							}
							break;

						default :
							if ( cnt16 >= 1 ) break loop16;
							EarlyExitException eee = new EarlyExitException(16, input);
							throw eee;
						}
						cnt16++;
					}

					pushFollow(FOLLOW_params_in_requete1067);
					ps=params();
					state._fsp--;

					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:332:40: ( DATE )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==DATE) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:332:40: DATE
							{
							match(input,DATE,FOLLOW_DATE_in_requete1069); 
							}
							break;

					}

					pushFollow(FOLLOW_dat_in_requete1076);
					d=dat();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct m.page "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m, datearticle d "));
								req_arbre.ajouteFils(new Arbre("", "where d.article = m.article"));
								req_arbre.ajouteFils(new Arbre("", "AND "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
								req_arbre.ajouteFils(new Arbre("", "AND "));
								ps_arbre = d;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 25 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:344:5: SELECT ARTICLE ( DATE )? d= dat
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1086); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1088); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:344:20: ( DATE )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==DATE) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:344:20: DATE
							{
							match(input,DATE,FOLLOW_DATE_in_requete1090); 
							}
							break;

					}

					pushFollow(FOLLOW_dat_in_requete1097);
					d=dat();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct m.page "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m, datearticle d "));
								req_arbre.ajouteFils(new Arbre("", "where d.article = m.article"));
								req_arbre.ajouteFils(new Arbre("", "AND "));
								ps_arbre = d;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 26 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:354:5: SELECT ARTICLE ps1= params ( PARLER )+ ps2= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1110); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1112); 
					pushFollow(FOLLOW_params_in_requete1118);
					ps1=params();
					state._fsp--;

					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:354:33: ( PARLER )+
					int cnt19=0;
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==PARLER) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:354:33: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete1120); 
							}
							break;

						default :
							if ( cnt19 >= 1 ) break loop19;
							EarlyExitException eee = new EarlyExitException(19, input);
							throw eee;
						}
						cnt19++;
					}

					pushFollow(FOLLOW_params_in_requete1127);
					ps2=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct "));
								req_arbre.ajouteFils(new Arbre("", "article "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = ps1;
								req_arbre.ajouteFils(ps_arbre);
								ps_arbre = ps2;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 27 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:369:5: SELECT ARTICLE ( PARLER )+ ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1150); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1152); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:369:20: ( PARLER )+
					int cnt20=0;
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==PARLER) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:369:20: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete1154); 
							}
							break;

						default :
							if ( cnt20 >= 1 ) break loop20;
							EarlyExitException eee = new EarlyExitException(20, input);
							throw eee;
						}
						cnt20++;
					}

					pushFollow(FOLLOW_params_in_requete1161);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct m.page "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 28 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:378:5: SELECT ARTICLE d= dat AUTEUR e= email
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1173); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1175); 
					pushFollow(FOLLOW_dat_in_requete1181);
					d=dat();
					state._fsp--;

					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1183); 
					pushFollow(FOLLOW_email_in_requete1189);
					e=email();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct m.page "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m, datearticle d, email e"));
								req_arbre.ajouteFils(new Arbre("", "where m.article = d.article AND d.article = e.article "));
								req_arbre.ajouteFils(new Arbre("", "AND "));
								d_arbre = d;
								req_arbre.ajouteFils(d_arbre);
								req_arbre.ajouteFils(new Arbre("", "AND "));
								e_arbre = e;
								req_arbre.ajouteFils(e_arbre);
							
					}
					break;
				case 29 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:390:5: SELECT ARTICLE AUTEUR e= email ET ( PARLER )+ r= RUBRIQUE
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1198); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1200); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1202); 
					pushFollow(FOLLOW_email_in_requete1208);
					e=email();
					state._fsp--;

					match(input,ET,FOLLOW_ET_in_requete1210); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:390:40: ( PARLER )+
					int cnt21=0;
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==PARLER) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:390:40: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete1212); 
							}
							break;

						default :
							if ( cnt21 >= 1 ) break loop21;
							EarlyExitException eee = new EarlyExitException(21, input);
							throw eee;
						}
						cnt21++;
					}

					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete1219); 

								req_arbre.ajouteFils(new Arbre("", "select distinct m.page"));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m, email e "));
								req_arbre.ajouteFils(new Arbre("", "where m.article = e.article "));
								req_arbre.ajouteFils(new Arbre("", "AND "));
								ps_arbre = e;
								req_arbre.ajouteFils(ps_arbre);
								req_arbre.ajouteFils(new Arbre("", "AND m.rubrique = '" + r.getText() + "' "));
							
					}
					break;
				case 30 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:401:5: SELECT ARTICLE AUTEUR ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1231); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1233); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1235); 
					pushFollow(FOLLOW_params_in_requete1241);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct m.page"));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 31 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:409:5: SELECT ARTICLE AUTEUR e= email
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1250); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1252); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1254); 
					pushFollow(FOLLOW_email_in_requete1260);
					e=email();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct m.page"));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m, email e "));
								req_arbre.ajouteFils(new Arbre("", "where m.article = e.article "));
								req_arbre.ajouteFils(new Arbre("", "AND "));
								ps_arbre = e;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 32 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:418:5: SELECT ARTICLE ps1= params AUTEUR ps2= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1269); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1271); 
					pushFollow(FOLLOW_params_in_requete1277);
					ps1=params();
					state._fsp--;

					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1279); 
					pushFollow(FOLLOW_params_in_requete1285);
					ps2=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct m.page "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = ps1;
								req_arbre.ajouteFils(ps_arbre);
								req_arbre.ajouteFils(new Arbre("", "AND "));
								ps_arbre = ps2;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 33 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:429:5: SELECT ARTICLE d= dat ET ( PARLER )+ ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1296); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1298); 
					pushFollow(FOLLOW_dat_in_requete1304);
					d=dat();
					state._fsp--;

					match(input,ET,FOLLOW_ET_in_requete1306); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:429:31: ( PARLER )+
					int cnt22=0;
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( (LA22_0==PARLER) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:429:31: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete1308); 
							}
							break;

						default :
							if ( cnt22 >= 1 ) break loop22;
							EarlyExitException eee = new EarlyExitException(22, input);
							throw eee;
						}
						cnt22++;
					}

					pushFollow(FOLLOW_params_in_requete1315);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct m.artiçle "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m, datearticle d"));
								req_arbre.ajouteFils(new Arbre("", "where d.article = m.article "));
								req_arbre.ajouteFils(new Arbre("", "AND "));
								d_arbre = d;
								req_arbre.ajouteFils(d_arbre);
								req_arbre.ajouteFils(new Arbre("", "AND "));
								e_arbre = d;
								req_arbre.ajouteFils(e_arbre);
							
					}
					break;
				case 34 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:442:5: SELECT AUTEUR ARTICLE ( PARLER )+ ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1326); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1328); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1330); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:442:27: ( PARLER )+
					int cnt23=0;
					loop23:
					while (true) {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( (LA23_0==PARLER) ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:442:27: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete1332); 
							}
							break;

						default :
							if ( cnt23 >= 1 ) break loop23;
							EarlyExitException eee = new EarlyExitException(23, input);
							throw eee;
						}
						cnt23++;
					}

					pushFollow(FOLLOW_params_in_requete1339);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct m.email, m.page "));
								req_arbre.ajouteFils(new Arbre("", "from emailarticle m "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 35 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:450:5: SELECT AUTEUR ARTICLE ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1348); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1350); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1352); 
					pushFollow(FOLLOW_params_in_requete1358);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct m.email, m.page "));
								req_arbre.ajouteFils(new Arbre("", "from emailarticle m "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 36 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:459:5: SELECT COMBIEN r= RUBRIQUE ( PARLER )+ ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1369); 
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete1371); 
					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete1377); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:459:33: ( PARLER )+
					int cnt24=0;
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0==PARLER) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:459:33: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete1379); 
							}
							break;

						default :
							if ( cnt24 >= 1 ) break loop24;
							EarlyExitException eee = new EarlyExitException(24, input);
							throw eee;
						}
						cnt24++;
					}

					pushFollow(FOLLOW_params_in_requete1386);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(m.rubrique) "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m, datearticle d"));
								req_arbre.ajouteFils(new Arbre("", "where m.article = d.article "));
								req_arbre.ajouteFils(new Arbre("", "AND m.rubrique = '" + r.getText() + "' "));
								req_arbre.ajouteFils(new Arbre("", "AND "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 37 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:471:5: SELECT DATE ( ARTICLE )? ( PARLER )+ ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1400); 
					match(input,DATE,FOLLOW_DATE_in_requete1402); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:471:17: ( ARTICLE )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==ARTICLE) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:471:17: ARTICLE
							{
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1404); 
							}
							break;

					}

					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:471:26: ( PARLER )+
					int cnt26=0;
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( (LA26_0==PARLER) ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:471:26: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete1407); 
							}
							break;

						default :
							if ( cnt26 >= 1 ) break loop26;
							EarlyExitException eee = new EarlyExitException(26, input);
							throw eee;
						}
						cnt26++;
					}

					pushFollow(FOLLOW_params_in_requete1412);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select d.jj, d.mois, d.annee "));
								req_arbre.ajouteFils(new Arbre("", "from datearticle d, titreresume m "));
								req_arbre.ajouteFils(new Arbre("", "where d.article = m.titreresume "));
								req_arbre.ajouteFils(new Arbre("", "AND "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 38 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:482:5: SELECT EMAIL AUTEUR ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1426); 
					match(input,EMAIL,FOLLOW_EMAIL_in_requete1428); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1430); 
					pushFollow(FOLLOW_params_in_requete1436);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct e.email "));
								req_arbre.ajouteFils(new Arbre("", "from email e, titreresume m "));
								req_arbre.ajouteFils(new Arbre("", "where e.article = m.article "));
								req_arbre.ajouteFils(new Arbre("", "AND "));		
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 39 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:493:5: SELECT PAGE ARTICLE ( AUTEUR )* e= email
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1450); 
					match(input,PAGE,FOLLOW_PAGE_in_requete1452); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1454); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:493:25: ( AUTEUR )*
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( (LA27_0==AUTEUR) ) {
							alt27=1;
						}

						switch (alt27) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:493:25: AUTEUR
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1456); 
							}
							break;

						default :
							break loop27;
						}
					}

					pushFollow(FOLLOW_email_in_requete1463);
					e=email();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct m.page "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume, email e"));
								req_arbre.ajouteFils(new Arbre("", "where m.article = e.article"));
								req_arbre.ajouteFils(new Arbre("", "AND "));
								ps_arbre = e;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 40 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:502:5: SELECT PAGE ( PARLER )+ ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1474); 
					match(input,PAGE,FOLLOW_PAGE_in_requete1476); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:502:17: ( PARLER )+
					int cnt28=0;
					loop28:
					while (true) {
						int alt28=2;
						int LA28_0 = input.LA(1);
						if ( (LA28_0==PARLER) ) {
							alt28=1;
						}

						switch (alt28) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:502:17: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete1478); 
							}
							break;

						default :
							if ( cnt28 >= 1 ) break loop28;
							EarlyExitException eee = new EarlyExitException(28, input);
							throw eee;
						}
						cnt28++;
					}

					pushFollow(FOLLOW_params_in_requete1485);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct m.page "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
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
		return req_arbre;
	}
	// $ANTLR end "requete"



	// $ANTLR start "conj"
	// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:511:1: conj returns [Arbre conj_arbre = new Arbre(\"\")] : ( ET | OU );
	public final Arbre conj() throws RecognitionException {
		Arbre conj_arbre =  new Arbre("");


		try {
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:511:49: ( ET | OU )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==ET) ) {
				alt30=1;
			}
			else if ( (LA30_0==OU) ) {
				alt30=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:512:2: ET
					{
					match(input,ET,FOLLOW_ET_in_conj1501); 

							conj_arbre.ajouteFils(new Arbre("", "AND "));
						
					}
					break;
				case 2 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:515:4: OU
					{
					match(input,OU,FOLLOW_OU_in_conj1508); 

							conj_arbre.ajouteFils(new Arbre("", "OR "));
						
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
		return conj_arbre;
	}
	// $ANTLR end "conj"



	// $ANTLR start "dat"
	// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:519:1: dat returns [Arbre les_pars_arbre = new Arbre(\"\")] : (a= NBR |m= MOIS |m= MOIS a= NBR |j= JOURS m= MOIS |j= NBR m= MOIS a= NBR );
	public final Arbre dat() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Token a=null;
		Token m=null;
		Token j=null;

		try {
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:519:52: (a= NBR |m= MOIS |m= MOIS a= NBR |j= JOURS m= MOIS |j= NBR m= MOIS a= NBR )
			int alt31=5;
			switch ( input.LA(1) ) {
			case NBR:
				{
				int LA31_1 = input.LA(2);
				if ( (LA31_1==MOIS) ) {
					alt31=5;
				}
				else if ( (LA31_1==AUTEUR||LA31_1==ET||(LA31_1 >= PARLER && LA31_1 <= POINT)) ) {
					alt31=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case MOIS:
				{
				int LA31_2 = input.LA(2);
				if ( (LA31_2==NBR) ) {
					alt31=3;
				}
				else if ( (LA31_2==AUTEUR||LA31_2==ET||(LA31_2 >= PARLER && LA31_2 <= POINT)) ) {
					alt31=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case JOURS:
				{
				alt31=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:520:2: a= NBR
					{
					a=(Token)match(input,NBR,FOLLOW_NBR_in_dat1527); 

							les_pars_arbre.ajouteFils(new Arbre("", "d.annee = '" + a.getText() + "' "));
						
					}
					break;
				case 2 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:523:4: m= MOIS
					{
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_dat1538); 

							les_pars_arbre.ajouteFils(new Arbre("", "d.mois = '" + m.getText() + "' "));
						
					}
					break;
				case 3 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:526:4: m= MOIS a= NBR
					{
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_dat1549); 
					a=(Token)match(input,NBR,FOLLOW_NBR_in_dat1555); 

							les_pars_arbre.ajouteFils(new Arbre("", "d.mois = '" + m.getText() + "' "));
							les_pars_arbre.ajouteFils(new Arbre("", "AND d.annee = '" + a.getText() + "' "));
						
					}
					break;
				case 4 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:530:4: j= JOURS m= MOIS
					{
					j=(Token)match(input,JOURS,FOLLOW_JOURS_in_dat1566); 
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_dat1572); 

							les_pars_arbre.ajouteFils(new Arbre("", "d.jour = '" + j.getText() + "' "));
							les_pars_arbre.ajouteFils(new Arbre("", "AND d.mois = '" + m.getText() + "' "));
							
					}
					break;
				case 5 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:534:4: j= NBR m= MOIS a= NBR
					{
					j=(Token)match(input,NBR,FOLLOW_NBR_in_dat1583); 
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_dat1589); 
					a=(Token)match(input,NBR,FOLLOW_NBR_in_dat1595); 

							les_pars_arbre.ajouteFils(new Arbre("", "d.jj = '" + j.getText() + "' "));
							les_pars_arbre.ajouteFils(new Arbre("", "AND d.mois = '" + m.getText() + "' "));
							les_pars_arbre.ajouteFils(new Arbre("", "AND d.annee = '" + a.getText() + "' "));
						
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
		return les_pars_arbre;
	}
	// $ANTLR end "dat"



	// $ANTLR start "email"
	// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:541:1: email returns [Arbre les_pars_arbre = new Arbre(\"\")] : (a1= VAR a= AT a2= VAR (n= NBR )? p= POINT a3= VAR | EMAIL a1= VAR a= AT a2= VAR p= POINT a3= VAR | EMAIL AUTEUR a1= VAR a= AT a2= VAR p= POINT a3= VAR | EMAIL a= AT a1= VAR p= POINT a2= VAR );
	public final Arbre email() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Token a1=null;
		Token a=null;
		Token a2=null;
		Token n=null;
		Token p=null;
		Token a3=null;

		try {
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:541:54: (a1= VAR a= AT a2= VAR (n= NBR )? p= POINT a3= VAR | EMAIL a1= VAR a= AT a2= VAR p= POINT a3= VAR | EMAIL AUTEUR a1= VAR a= AT a2= VAR p= POINT a3= VAR | EMAIL a= AT a1= VAR p= POINT a2= VAR )
			int alt33=4;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==VAR) ) {
				alt33=1;
			}
			else if ( (LA33_0==EMAIL) ) {
				switch ( input.LA(2) ) {
				case VAR:
					{
					alt33=2;
					}
					break;
				case AUTEUR:
					{
					alt33=3;
					}
					break;
				case AT:
					{
					alt33=4;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 33, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:542:2: a1= VAR a= AT a2= VAR (n= NBR )? p= POINT a3= VAR
					{
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_email1616); 
					a=(Token)match(input,AT,FOLLOW_AT_in_email1622); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_email1628); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:542:29: (n= NBR )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==NBR) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:542:29: n= NBR
							{
							n=(Token)match(input,NBR,FOLLOW_NBR_in_email1634); 
							}
							break;

					}

					p=(Token)match(input,POINT,FOLLOW_POINT_in_email1641); 
					a3=(Token)match(input,VAR,FOLLOW_VAR_in_email1647); 

							les_pars_arbre.ajouteFils(new Arbre("", "e.email = '" + a1.getText() + a.getText() + a2.getText() + n.getText() + p.getText() + a3.getText() + "' "));
						
					}
					break;
				case 2 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:546:4: EMAIL a1= VAR a= AT a2= VAR p= POINT a3= VAR
					{
					match(input,EMAIL,FOLLOW_EMAIL_in_email1655); 
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_email1661); 
					a=(Token)match(input,AT,FOLLOW_AT_in_email1667); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_email1673); 
					p=(Token)match(input,POINT,FOLLOW_POINT_in_email1679); 
					a3=(Token)match(input,VAR,FOLLOW_VAR_in_email1685); 

								les_pars_arbre.ajouteFils(new Arbre("", "e.email = '" + a1.getText() + a.getText() + a2.getText() + p.getText() + a3.getText() + "' "));
						
					}
					break;
				case 3 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:549:4: EMAIL AUTEUR a1= VAR a= AT a2= VAR p= POINT a3= VAR
					{
					match(input,EMAIL,FOLLOW_EMAIL_in_email1692); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_email1694); 
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_email1700); 
					a=(Token)match(input,AT,FOLLOW_AT_in_email1706); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_email1712); 
					p=(Token)match(input,POINT,FOLLOW_POINT_in_email1718); 
					a3=(Token)match(input,VAR,FOLLOW_VAR_in_email1724); 

							les_pars_arbre.ajouteFils(new Arbre("", "e.email = '" + a1.getText() + a.getText() + a2.getText() + p.getText() + a3.getText() + "' "));
						
					}
					break;
				case 4 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:552:4: EMAIL a= AT a1= VAR p= POINT a2= VAR
					{
					match(input,EMAIL,FOLLOW_EMAIL_in_email1731); 
					a=(Token)match(input,AT,FOLLOW_AT_in_email1737); 
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_email1743); 
					p=(Token)match(input,POINT,FOLLOW_POINT_in_email1749); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_email1755); 

							les_pars_arbre.ajouteFils(new Arbre("", "e.email = '" + a.getText() + a1.getText() + p.getText() + a2.getText() + "' "));
						
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
		return les_pars_arbre;
	}
	// $ANTLR end "email"



	// $ANTLR start "listerequetes"
	// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:556:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:557:26: (r= requete POINT )
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:558:3: r= requete POINT
			{
			pushFollow(FOLLOW_requete_in_listerequetes1781);
			r=requete();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_listerequetes1783); 

						lr_arbre = r;
						sql = lr_arbre.sortArbre();
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return sql;
	}
	// $ANTLR end "listerequetes"



	// $ANTLR start "param"
	// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:563:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : (a= VAR |a1= NBR a2= MOIS |a1= VAR a2= VAR |a1= VAR a2= VAR a3= VAR |a1= VAR a2= VAR a3= VAR a4= VAR );
	public final Arbre param() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;
		Token a1=null;
		Token a2=null;
		Token a3=null;
		Token a4=null;

		try {
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:563:51: (a= VAR |a1= NBR a2= MOIS |a1= VAR a2= VAR |a1= VAR a2= VAR a3= VAR |a1= VAR a2= VAR a3= VAR a4= VAR )
			int alt34=5;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==VAR) ) {
				int LA34_1 = input.LA(2);
				if ( (LA34_1==VAR) ) {
					int LA34_3 = input.LA(3);
					if ( (LA34_3==VAR) ) {
						int LA34_5 = input.LA(4);
						if ( (LA34_5==VAR) ) {
							alt34=5;
						}
						else if ( (LA34_5==AUTEUR||LA34_5==DATE||(LA34_5 >= ENTRE && LA34_5 <= MOIS)||(LA34_5 >= NBR && LA34_5 <= OU)||(LA34_5 >= PARLER && LA34_5 <= POINT)||LA34_5==RUBRIQUE) ) {
							alt34=4;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 34, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA34_3==AUTEUR||LA34_3==DATE||(LA34_3 >= ENTRE && LA34_3 <= MOIS)||(LA34_3 >= NBR && LA34_3 <= OU)||(LA34_3 >= PARLER && LA34_3 <= POINT)||LA34_3==RUBRIQUE) ) {
						alt34=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 34, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA34_1==AUTEUR||LA34_1==DATE||(LA34_1 >= ENTRE && LA34_1 <= MOIS)||(LA34_1 >= NBR && LA34_1 <= OU)||(LA34_1 >= PARLER && LA34_1 <= POINT)||LA34_1==RUBRIQUE) ) {
					alt34=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 34, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA34_0==NBR) ) {
				alt34=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:564:2: a= VAR
					{
					a=(Token)match(input,VAR,FOLLOW_VAR_in_param1802); 

							lepar_arbre.ajouteFils(new Arbre("", "m.mot = '" + a.getText() + "' "));
						
					}
					break;
				case 2 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:567:4: a1= NBR a2= MOIS
					{
					a1=(Token)match(input,NBR,FOLLOW_NBR_in_param1813); 
					a2=(Token)match(input,MOIS,FOLLOW_MOIS_in_param1819); 

						 	lepar_arbre.ajouteFils(new Arbre("", "m.mot = '" + a1.getText() + "' "));
						 	lepar_arbre.ajouteFils(new Arbre("", "OR m.mot = '" + a2.getText() + "' "));
						 
					}
					break;
				case 3 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:571:5: a1= VAR a2= VAR
					{
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_param1831); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_param1837); 

							lepar_arbre.ajouteFils(new Arbre("", "m.mot = '" +a1.getText() + "' "));
							lepar_arbre.ajouteFils(new Arbre("", "OR m.mot = '" + a2.getText() + "' "));
						
					}
					break;
				case 4 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:575:4: a1= VAR a2= VAR a3= VAR
					{
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_param1848); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_param1854); 
					a3=(Token)match(input,VAR,FOLLOW_VAR_in_param1860); 

							lepar_arbre.ajouteFils(new Arbre("", "m.mot = '" +a1.getText() + "' "));
							lepar_arbre.ajouteFils(new Arbre("", "OR m.mot = '" + a2.getText() + "' "));
							lepar_arbre.ajouteFils(new Arbre("", "OR m.mot = '" + a3.getText() + "' "));
						
					}
					break;
				case 5 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:580:4: a1= VAR a2= VAR a3= VAR a4= VAR
					{
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_param1871); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_param1877); 
					a3=(Token)match(input,VAR,FOLLOW_VAR_in_param1883); 
					a4=(Token)match(input,VAR,FOLLOW_VAR_in_param1889); 

							lepar_arbre.ajouteFils(new Arbre("", "m.mot = '" + a1.getText() + "' "));
							lepar_arbre.ajouteFils(new Arbre("", "OR m.mot = '" + a2.getText() + "' "));
							lepar_arbre.ajouteFils(new Arbre("", "OR m.mot = '" + a3.getText() + "' "));
							lepar_arbre.ajouteFils(new Arbre("", "OR m.mot = '" + a4.getText() + "' "));
						
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
		return lepar_arbre;
	}
	// $ANTLR end "param"



	// $ANTLR start "params"
	// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:587:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param (c= conj par2= param )* ;
	public final Arbre params() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre c =null;
		Arbre par2 =null;


				Arbre par1_arbre, par2_arbre, conj_arbre, dat_arbre;
			
		try {
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:590:4: (par1= param (c= conj par2= param )* )
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:591:3: par1= param (c= conj par2= param )*
			{
			pushFollow(FOLLOW_param_in_params1914);
			par1=param();
			state._fsp--;


						par1_arbre = par1;
						les_pars_arbre.ajouteFils(par1_arbre);
					
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:595:3: (c= conj par2= param )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==ET) ) {
					int LA35_2 = input.LA(2);
					if ( (LA35_2==NBR||LA35_2==VAR) ) {
						alt35=1;
					}

				}
				else if ( (LA35_0==OU) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:595:4: c= conj par2= param
					{
					pushFollow(FOLLOW_conj_in_params1925);
					c=conj();
					state._fsp--;

					pushFollow(FOLLOW_param_in_params1931);
					par2=param();
					state._fsp--;


								conj_arbre = c;
								par2_arbre = par2;
								les_pars_arbre.ajouteFils(conj_arbre);
								les_pars_arbre.ajouteFils(par2_arbre);
							
					}
					break;

				default :
					break loop35;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "params"

	// Delegated rules


	protected DFA29 dfa29 = new DFA29(this);
	static final String DFA29_eotS =
		"\u00c2\uffff";
	static final String DFA29_eofS =
		"\u00c2\uffff";
	static final String DFA29_minS =
		"\1\4\1\16\1\4\1\uffff\1\4\2\uffff\1\16\1\4\1\uffff\1\21\1\24\1\14\1\6"+
		"\1\4\3\uffff\1\4\1\21\1\uffff\1\17\1\uffff\1\14\1\uffff\2\5\1\15\1\17"+
		"\1\21\1\uffff\1\21\1\uffff\1\13\1\21\1\uffff\2\6\1\17\1\6\1\21\2\uffff"+
		"\1\15\1\17\1\15\2\uffff\1\35\1\5\2\35\1\15\2\21\1\uffff\2\15\1\17\1\14"+
		"\1\17\2\5\1\uffff\1\11\1\17\1\6\2\uffff\3\6\2\21\4\uffff\1\15\2\21\3\uffff"+
		"\1\15\1\21\1\35\1\5\1\25\1\15\1\uffff\1\15\1\17\1\15\2\21\2\uffff\1\15"+
		"\1\14\2\21\2\uffff\1\14\1\35\1\5\2\35\1\11\2\21\3\uffff\1\11\3\6\1\17"+
		"\2\15\1\17\1\25\1\35\1\25\2\35\5\15\1\17\2\14\1\17\1\21\1\35\1\5\1\25"+
		"\2\11\1\17\3\6\3\15\1\24\1\35\1\25\1\24\4\15\3\14\1\25\1\35\1\25\2\35"+
		"\3\11\1\6\1\15\2\uffff\1\24\1\35\2\15\1\14\1\15\1\35\1\25\1\15\1\11\1"+
		"\6\1\15\1\24\1\15\1\14\2\uffff\1\15\1\35\1\11\1\15";
	static final String DFA29_maxS =
		"\1\32\1\24\1\31\1\uffff\1\23\2\uffff\2\35\1\uffff\1\35\1\24\2\35\1\4\3"+
		"\uffff\1\24\1\35\1\uffff\1\25\1\uffff\1\24\1\uffff\1\5\2\35\1\17\1\35"+
		"\1\uffff\1\35\1\uffff\2\35\1\uffff\2\25\1\17\2\35\2\uffff\1\35\1\17\1"+
		"\24\2\uffff\1\35\1\5\5\35\1\uffff\1\31\1\35\1\17\1\35\1\17\2\35\1\uffff"+
		"\1\35\1\17\1\24\2\uffff\2\25\3\35\4\uffff\3\35\3\uffff\2\25\1\35\1\5\1"+
		"\25\1\35\1\uffff\1\35\1\17\3\35\2\uffff\1\25\3\35\2\uffff\1\25\1\35\1"+
		"\5\5\35\3\uffff\2\25\2\35\1\17\2\35\1\17\1\25\1\35\1\25\2\35\1\31\1\35"+
		"\1\31\2\35\1\17\2\35\1\17\1\25\1\35\1\5\1\25\2\35\1\17\1\24\1\35\1\24"+
		"\1\25\1\35\2\25\1\35\2\25\1\35\1\25\1\35\2\25\1\35\2\25\1\35\1\25\2\35"+
		"\1\25\1\35\1\25\2\35\2\uffff\1\25\1\35\1\31\2\35\1\25\1\35\2\25\1\35\1"+
		"\24\4\25\2\uffff\1\25\1\35\2\25";
	static final String DFA29_acceptS =
		"\3\uffff\1\26\1\uffff\1\1\1\2\2\uffff\1\15\5\uffff\1\44\1\45\1\46\2\uffff"+
		"\1\4\1\uffff\1\7\1\uffff\1\11\5\uffff\1\24\1\uffff\1\25\2\uffff\1\31\5"+
		"\uffff\1\47\1\50\3\uffff\1\10\1\12\7\uffff\1\17\7\uffff\1\36\3\uffff\1"+
		"\34\1\41\5\uffff\1\32\1\40\1\42\1\43\3\uffff\1\3\1\5\1\6\6\uffff\1\16"+
		"\5\uffff\1\20\1\21\4\uffff\1\22\1\23\10\uffff\1\27\1\30\1\33\70\uffff"+
		"\1\13\1\14\17\uffff\1\35\1\37\4\uffff";
	static final String DFA29_specialS =
		"\u00c2\uffff}>";
	static final String[] DFA29_transitionS = {
			"\1\1\2\uffff\1\2\3\uffff\1\3\16\uffff\1\4",
			"\2\5\1\uffff\1\5\2\uffff\1\6",
			"\1\7\1\uffff\1\10\7\uffff\1\11\1\uffff\1\12\2\uffff\1\13\5\uffff\1\14",
			"",
			"\1\15\1\uffff\1\16\1\17\1\uffff\1\20\1\uffff\1\21\7\uffff\1\22",
			"",
			"",
			"\2\26\1\uffff\1\25\2\uffff\1\23\10\uffff\1\24",
			"\1\27\6\uffff\1\32\2\uffff\2\30\1\uffff\1\30\13\uffff\1\31",
			"",
			"\1\34\13\uffff\1\33",
			"\1\35",
			"\1\36\4\uffff\1\40\2\uffff\1\37\10\uffff\1\40",
			"\1\41\2\uffff\1\43\4\uffff\1\46\1\45\1\uffff\1\44\2\uffff\1\42\10\uffff"+
			"\1\47",
			"\1\50",
			"",
			"",
			"",
			"\1\51\17\uffff\1\52",
			"\1\54\2\uffff\1\23\10\uffff\1\53",
			"",
			"\1\55\5\uffff\1\26",
			"",
			"\1\56\7\uffff\1\57",
			"",
			"\1\60",
			"\1\63\1\62\26\uffff\1\61",
			"\1\65\4\uffff\1\66\6\uffff\1\67\3\uffff\1\64",
			"\1\70",
			"\1\72\2\uffff\1\35\10\uffff\1\71",
			"",
			"\1\74\2\uffff\1\37\10\uffff\1\73",
			"",
			"\1\76\5\uffff\1\77\13\uffff\1\75",
			"\1\101\2\uffff\1\42\10\uffff\1\100",
			"",
			"\1\103\6\uffff\1\104\1\uffff\1\102\5\uffff\1\43",
			"\1\103\6\uffff\1\104\3\uffff\1\105\3\uffff\1\43",
			"\1\106",
			"\1\113\6\uffff\1\110\4\uffff\1\111\1\uffff\1\112\10\uffff\1\107",
			"\1\115\2\uffff\1\114\10\uffff\1\115",
			"",
			"",
			"\1\117\2\123\1\uffff\1\123\1\120\1\uffff\1\122\1\121\7\uffff\1\116",
			"\1\124",
			"\1\24\3\uffff\1\26\1\24\1\uffff\1\24",
			"",
			"",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\65\4\uffff\1\66\6\uffff\1\67\3\uffff\1\131",
			"\1\134\10\uffff\1\132\2\uffff\1\133",
			"\1\134\13\uffff\1\133",
			"",
			"\1\65\4\uffff\1\66\6\uffff\1\67",
			"\1\136\2\141\1\uffff\1\141\1\137\2\uffff\1\140\7\uffff\1\135",
			"\1\142",
			"\1\146\1\144\4\uffff\1\145\2\uffff\1\147\7\uffff\1\143",
			"\1\150",
			"\1\151\7\uffff\1\77\4\uffff\1\77\2\uffff\1\77\7\uffff\1\77",
			"\1\154\1\153\26\uffff\1\152",
			"",
			"\1\161\2\uffff\1\160\1\156\2\161\1\uffff\1\161\1\157\2\uffff\1\162\7"+
			"\uffff\1\155",
			"\1\163",
			"\1\113\6\uffff\1\110\3\uffff\1\164\1\111\1\uffff\1\112",
			"",
			"",
			"\1\103\6\uffff\1\104\7\uffff\1\43",
			"\1\103\6\uffff\1\104\7\uffff\1\43",
			"\1\113\6\uffff\1\110\4\uffff\1\111\1\uffff\1\112\10\uffff\1\165",
			"\1\167\13\uffff\1\166",
			"\1\167\13\uffff\1\166",
			"",
			"",
			"",
			"",
			"\1\117\2\123\1\uffff\1\123\1\120\1\uffff\1\122\1\121\7\uffff\1\170",
			"\1\172\13\uffff\1\171",
			"\1\172\13\uffff\1\171",
			"",
			"",
			"",
			"\1\117\2\123\1\uffff\1\123\1\120\1\uffff\1\122\1\121",
			"\1\173\3\uffff\1\174",
			"\1\175",
			"\1\176",
			"\1\177",
			"\1\65\4\uffff\1\66\6\uffff\1\67\3\uffff\1\u0080",
			"",
			"\1\65\4\uffff\1\66\6\uffff\1\67\3\uffff\1\u0081",
			"\1\u0082",
			"\1\136\2\141\1\uffff\1\141\1\137\2\uffff\1\140\7\uffff\1\u0083",
			"\1\u0085\13\uffff\1\u0084",
			"\1\u0085\13\uffff\1\u0084",
			"",
			"",
			"\1\136\2\141\1\uffff\1\141\1\137\2\uffff\1\140",
			"\1\146\1\144\4\uffff\1\145\2\uffff\1\147\7\uffff\1\u0086",
			"\1\u0088\13\uffff\1\u0087",
			"\1\u0088\13\uffff\1\u0087",
			"",
			"",
			"\1\146\1\144\4\uffff\1\145\2\uffff\1\147",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"\1\161\2\uffff\1\160\1\156\2\161\1\uffff\1\161\1\157\2\uffff\1\162\7"+
			"\uffff\1\u008d",
			"\1\u008f\13\uffff\1\u008e",
			"\1\u008f\13\uffff\1\u008e",
			"",
			"",
			"",
			"\1\161\2\uffff\1\160\1\156\2\161\1\uffff\1\161\1\157\2\uffff\1\162",
			"\1\103\6\uffff\1\104\7\uffff\1\43",
			"\1\113\6\uffff\1\110\4\uffff\1\111\1\uffff\1\112\10\uffff\1\u0090",
			"\1\113\6\uffff\1\110\4\uffff\1\111\1\uffff\1\112\10\uffff\1\u0091",
			"\1\u0092",
			"\1\117\2\123\1\uffff\1\123\1\120\1\uffff\1\122\1\121\7\uffff\1\u0093",
			"\1\117\2\123\1\uffff\1\123\1\120\1\uffff\1\122\1\121\7\uffff\1\u0094",
			"\1\u0095",
			"\1\174",
			"\1\u0096",
			"\1\u0097",
			"\1\u0098",
			"\1\u0099",
			"\1\65\4\uffff\1\66\6\uffff\1\67",
			"\1\65\4\uffff\1\66\6\uffff\1\67\3\uffff\1\u009a",
			"\1\65\4\uffff\1\66\6\uffff\1\67",
			"\1\136\2\141\1\uffff\1\141\1\137\2\uffff\1\140\7\uffff\1\u009b",
			"\1\136\2\141\1\uffff\1\141\1\137\2\uffff\1\140\7\uffff\1\u009c",
			"\1\u009d",
			"\1\146\1\144\4\uffff\1\145\2\uffff\1\147\7\uffff\1\u009e",
			"\1\146\1\144\4\uffff\1\145\2\uffff\1\147\7\uffff\1\u009f",
			"\1\u00a0",
			"\1\u00a1\3\uffff\1\u00a2",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"\1\161\2\uffff\1\160\1\156\2\161\1\uffff\1\161\1\157\2\uffff\1\162\7"+
			"\uffff\1\u00a6",
			"\1\161\2\uffff\1\160\1\156\2\161\1\uffff\1\161\1\157\2\uffff\1\162\7"+
			"\uffff\1\u00a7",
			"\1\u00a8",
			"\1\113\6\uffff\1\110\4\uffff\1\111\1\uffff\1\112",
			"\1\113\6\uffff\1\110\4\uffff\1\111\1\uffff\1\112\10\uffff\1\u00a9",
			"\1\113\6\uffff\1\110\4\uffff\1\111\1\uffff\1\112",
			"\1\117\2\123\1\uffff\1\123\1\120\1\uffff\1\122\1\121",
			"\1\117\2\123\1\uffff\1\123\1\120\1\uffff\1\122\1\121\7\uffff\1\u00aa",
			"\1\117\2\123\1\uffff\1\123\1\120\1\uffff\1\122\1\121",
			"\1\u00ac\1\u00ab",
			"\1\u00ad",
			"\1\u00ae",
			"\1\u00ac\1\u00ab",
			"\1\65\4\uffff\1\66\6\uffff\1\67\3\uffff\1\u00af",
			"\1\136\2\141\1\uffff\1\141\1\137\2\uffff\1\140",
			"\1\136\2\141\1\uffff\1\141\1\137\2\uffff\1\140\7\uffff\1\u00b0",
			"\1\136\2\141\1\uffff\1\141\1\137\2\uffff\1\140",
			"\1\146\1\144\4\uffff\1\145\2\uffff\1\147",
			"\1\146\1\144\4\uffff\1\145\2\uffff\1\147\7\uffff\1\u00b1",
			"\1\146\1\144\4\uffff\1\145\2\uffff\1\147",
			"\1\u00a2",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\1\u00b5",
			"\1\161\2\uffff\1\160\1\156\2\161\1\uffff\1\161\1\157\2\uffff\1\162",
			"\1\161\2\uffff\1\160\1\156\2\161\1\uffff\1\161\1\157\2\uffff\1\162\7"+
			"\uffff\1\u00b6",
			"\1\161\2\uffff\1\160\1\156\2\161\1\uffff\1\161\1\157\2\uffff\1\162",
			"\1\113\6\uffff\1\110\4\uffff\1\111\1\uffff\1\112\10\uffff\1\u00b7",
			"\1\117\2\123\1\uffff\1\123\1\120\1\uffff\1\122\1\121\7\uffff\1\u00b8",
			"",
			"",
			"\1\u00ac\1\u00ab",
			"\1\u00b9",
			"\1\65\4\uffff\1\66\6\uffff\1\67",
			"\1\136\2\141\1\uffff\1\141\1\137\2\uffff\1\140\7\uffff\1\u00ba",
			"\1\146\1\144\4\uffff\1\145\2\uffff\1\147\7\uffff\1\u00bb",
			"\1\u00bc\7\uffff\1\u00bd",
			"\1\u00be",
			"\1\u00bf",
			"\1\u00bc\7\uffff\1\u00bd",
			"\1\161\2\uffff\1\160\1\156\2\161\1\uffff\1\161\1\157\2\uffff\1\162\7"+
			"\uffff\1\u00c0",
			"\1\113\6\uffff\1\110\4\uffff\1\111\1\uffff\1\112",
			"\1\117\2\123\1\uffff\1\123\1\120\1\uffff\1\122\1\121",
			"\1\u00ac\1\u00ab",
			"\1\136\2\141\1\uffff\1\141\1\137\2\uffff\1\140",
			"\1\146\1\144\4\uffff\1\145\2\uffff\1\147",
			"",
			"",
			"\1\u00bc\7\uffff\1\u00bd",
			"\1\u00c1",
			"\1\161\2\uffff\1\160\1\156\2\161\1\uffff\1\161\1\157\2\uffff\1\162",
			"\1\u00bc\7\uffff\1\u00bd"
	};

	static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
	static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
	static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
	static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
	static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
	static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
	static final short[][] DFA29_transition;

	static {
		int numStates = DFA29_transitionS.length;
		DFA29_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
		}
	}

	protected class DFA29 extends DFA {

		public DFA29(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 29;
			this.eot = DFA29_eot;
			this.eof = DFA29_eof;
			this.min = DFA29_min;
			this.max = DFA29_max;
			this.accept = DFA29_accept;
			this.special = DFA29_special;
			this.transition = DFA29_transition;
		}
		@Override
		public String getDescription() {
			return "36:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( ARTICLE d= dat ( PARLER )+ ps= params | ARTICLE ( PARLER )+ ps= params | COMBIEN ARTICLE ( PARLER )+ ps= params | COMBIEN ARTICLE ps1= params ( PARLER )+ ps2= params | COMBIEN ARTICLE ( PARLER )+ ps1= params PARLER ps2= params | COMBIEN ARTICLE ( PARLER )+ ps= params d= dat | COMBIEN ARTICLE d= dat | COMBIEN AUTEUR ARTICLE ENTRE d1= dat ET d2= dat | COMBIEN AUTEUR d= dat | COMBIEN AUTEUR ARTICLE ( PARLER )+ ps= params | COMBIEN AUTEUR e= email | COMBIEN AUTEUR e= email ( PARLER )+ ps= params | COMBIEN JOURS ( PARLER )+ ps= params | COMBIEN MOT ps= params ET SELECT ARTICLE | COMBIEN MOT ps= params r= RUBRIQUE | COMBIEN PAGE ( PARLER )+ ps= params | COMBIEN PAGE ( PARLER )+ ps= params d= dat | COMBIEN r= RUBRIQUE ( PARLER )+ ps= params ENTRE d1= dat ET d2= dat | COMBIEN r= RUBRIQUE ( PARLER )+ ps= params | COMBIEN r= RUBRIQUE ENTRE d1= dat ET d2= dat ( PARLER )+ ps= params | COMBIEN r= RUBRIQUE ps= params | EMAIL AUTEUR ps= params | SELECT ARTICLE ( PARLER )+ ps= params ENTRE d1= dat ET d2= dat | SELECT ARTICLE ( PARLER )+ ps= params ( DATE )? d= dat | SELECT ARTICLE ( DATE )? d= dat | SELECT ARTICLE ps1= params ( PARLER )+ ps2= params | SELECT ARTICLE ( PARLER )+ ps= params | SELECT ARTICLE d= dat AUTEUR e= email | SELECT ARTICLE AUTEUR e= email ET ( PARLER )+ r= RUBRIQUE | SELECT ARTICLE AUTEUR ps= params | SELECT ARTICLE AUTEUR e= email | SELECT ARTICLE ps1= params AUTEUR ps2= params | SELECT ARTICLE d= dat ET ( PARLER )+ ps= params | SELECT AUTEUR ARTICLE ( PARLER )+ ps= params | SELECT AUTEUR ARTICLE ps= params | SELECT COMBIEN r= RUBRIQUE ( PARLER )+ ps= params | SELECT DATE ( ARTICLE )? ( PARLER )+ ps= params | SELECT EMAIL AUTEUR ps= params | SELECT PAGE ARTICLE ( AUTEUR )* e= email | SELECT PAGE ( PARLER )+ ps= params );";
		}
	}

	public static final BitSet FOLLOW_ARTICLE_in_requete332 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete338 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete340 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_requete356 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete358 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete409 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete411 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete413 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete434 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete436 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete442 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete444 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete465 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete467 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete469 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete476 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete478 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete501 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete503 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete505 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete512 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete529 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete531 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete553 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete555 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete557 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ENTRE_in_requete559 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete565 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ET_in_requete567 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete587 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete589 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete610 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete612 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete615 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete617 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete633 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete635 = new BitSet(new long[]{0x0000000020000800L});
	public static final BitSet FOLLOW_email_in_requete641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete655 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete657 = new BitSet(new long[]{0x0000000020000800L});
	public static final BitSet FOLLOW_email_in_requete663 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete665 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete686 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_JOURS_in_requete688 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete690 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete713 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_MOT_in_requete715 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete721 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ET_in_requete723 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_SELECT_in_requete725 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete741 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_MOT_in_requete743 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete749 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete766 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_PAGE_in_requete768 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete770 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete791 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_PAGE_in_requete793 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete795 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete802 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete824 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete830 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete832 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete839 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ENTRE_in_requete841 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete847 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ET_in_requete849 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete885 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete891 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete893 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete914 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete920 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ENTRE_in_requete922 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete928 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ET_in_requete930 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete936 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete938 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete957 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete963 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EMAIL_in_requete985 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete987 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1012 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1014 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1016 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete1024 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ENTRE_in_requete1026 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete1032 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ET_in_requete1034 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete1040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1056 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1058 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1060 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete1067 = new BitSet(new long[]{0x000000000002C200L});
	public static final BitSet FOLLOW_DATE_in_requete1069 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete1076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1086 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1088 = new BitSet(new long[]{0x000000000002C200L});
	public static final BitSet FOLLOW_DATE_in_requete1090 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete1097 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1110 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1112 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1118 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1120 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete1127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1150 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1152 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1154 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete1161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1173 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1175 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete1181 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1183 = new BitSet(new long[]{0x0000000020000800L});
	public static final BitSet FOLLOW_email_in_requete1189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1198 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1200 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1202 = new BitSet(new long[]{0x0000000020000800L});
	public static final BitSet FOLLOW_email_in_requete1208 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ET_in_requete1210 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1212 = new BitSet(new long[]{0x0000000002100000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete1219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1231 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1233 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1235 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1250 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1252 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1254 = new BitSet(new long[]{0x0000000020000800L});
	public static final BitSet FOLLOW_email_in_requete1260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1269 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1271 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1277 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1279 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1296 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1298 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete1304 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ET_in_requete1306 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1308 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete1315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1326 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1328 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1330 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1332 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete1339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1348 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1350 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1352 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1369 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COMBIEN_in_requete1371 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete1377 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1379 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete1386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1400 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_DATE_in_requete1402 = new BitSet(new long[]{0x0000000000100010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1404 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1407 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete1412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1426 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_EMAIL_in_requete1428 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1430 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1450 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_PAGE_in_requete1452 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1454 = new BitSet(new long[]{0x0000000020000840L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1456 = new BitSet(new long[]{0x0000000020000840L});
	public static final BitSet FOLLOW_email_in_requete1463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1474 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_PAGE_in_requete1476 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1478 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete1485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ET_in_conj1501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OU_in_conj1508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NBR_in_dat1527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOIS_in_dat1538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOIS_in_dat1549 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NBR_in_dat1555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOURS_in_dat1566 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOIS_in_dat1572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NBR_in_dat1583 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOIS_in_dat1589 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NBR_in_dat1595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_email1616 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AT_in_email1622 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1628 = new BitSet(new long[]{0x0000000000220000L});
	public static final BitSet FOLLOW_NBR_in_email1634 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_POINT_in_email1641 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EMAIL_in_email1655 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1661 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AT_in_email1667 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1673 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_POINT_in_email1679 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EMAIL_in_email1692 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_email1694 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1700 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AT_in_email1706 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1712 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_POINT_in_email1718 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EMAIL_in_email1731 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AT_in_email1737 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1743 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_POINT_in_email1749 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_requete_in_listerequetes1781 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_POINT_in_listerequetes1783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_param1802 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NBR_in_param1813 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOIS_in_param1819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_param1831 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_param1837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_param1848 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_param1854 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_param1860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_param1871 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_param1877 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_param1883 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_param1889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_params1914 = new BitSet(new long[]{0x0000000000042002L});
	public static final BitSet FOLLOW_conj_in_params1925 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_param_in_params1931 = new BitSet(new long[]{0x0000000000042002L});
}

// $ANTLR 3.5.1 C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g 2014-06-15 12:52:46
package com.lo17.projet;

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
	// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:36:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( ARTICLE d= dat ( PARLER )+ ps= params | ARTICLE ( PARLER )+ ps= params | COMBIEN ARTICLE ( PARLER )+ ps= params | COMBIEN ARTICLE ps1= params ( PARLER )+ ps2= params | COMBIEN ARTICLE ( PARLER )+ ps1= params PARLER ps2= params | COMBIEN ARTICLE ( PARLER )+ ps= params d= dat | COMBIEN ARTICLE d= dat | COMBIEN AUTEUR ARTICLE ENTRE d1= dat ET d2= dat | COMBIEN AUTEUR ( ARTICLE )? d= dat | COMBIEN AUTEUR ARTICLE ( PARLER )+ ps= params | COMBIEN AUTEUR e= email | COMBIEN AUTEUR e= email ( PARLER )+ ps= params | COMBIEN JOURS ( PARLER )+ ps= params | COMBIEN MOT ps= params ET SELECT ARTICLE | COMBIEN MOT ps= params r= RUBRIQUE | COMBIEN PAGE ( PARLER )+ ps= params | COMBIEN PAGE ( PARLER )+ ps= params d= dat | COMBIEN r= RUBRIQUE ( PARLER )+ ps= params ENTRE d1= dat ET d2= dat | COMBIEN r= RUBRIQUE ( PARLER )+ ps= params | COMBIEN ARTICLE ( PARLER )+ ps= params ENTRE d1= datinf ET d2= datsup | COMBIEN r= RUBRIQUE ps= params | EMAIL AUTEUR ps= params | SELECT ARTICLE ( PARLER )+ ps= params ENTRE d1= datinf ET d2= datsup | SELECT ARTICLE ( PARLER )+ ps= params ( DATE )? d= dat | SELECT ARTICLE ( DATE )? d= dat | SELECT ARTICLE ps1= params ( PARLER )+ ps2= params | SELECT ARTICLE ( PARLER )+ ps= params | SELECT ARTICLE d= dat AUTEUR e= email | SELECT ARTICLE AUTEUR e= email ET ( PARLER )+ r= RUBRIQUE | SELECT ARTICLE AUTEUR e= email | SELECT ARTICLE ps1= params AUTEUR ps2= params | SELECT ARTICLE d= dat ET ( PARLER )+ ps= params | SELECT AUTEUR ( ARTICLE )? d= dat | SELECT AUTEUR ARTICLE ( PARLER )+ ps= params | SELECT AUTEUR ARTICLE ps= params | SELECT COMBIEN r= RUBRIQUE ( PARLER )+ ps= params | SELECT r= RUBRIQUE ( PARLER )+ ps= params | SELECT r= RUBRIQUE d= dat | SELECT r= RUBRIQUE ( PARLER )+ ps= params d= dat | SELECT DATE ( ARTICLE )? ( PARLER )+ ps= params | SELECT EMAIL AUTEUR ps= params | SELECT PAGE ARTICLE ( AUTEUR )* e= email | SELECT PAGE ( PARLER )+ ps= params );
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
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:37:44: ( ARTICLE d= dat ( PARLER )+ ps= params | ARTICLE ( PARLER )+ ps= params | COMBIEN ARTICLE ( PARLER )+ ps= params | COMBIEN ARTICLE ps1= params ( PARLER )+ ps2= params | COMBIEN ARTICLE ( PARLER )+ ps1= params PARLER ps2= params | COMBIEN ARTICLE ( PARLER )+ ps= params d= dat | COMBIEN ARTICLE d= dat | COMBIEN AUTEUR ARTICLE ENTRE d1= dat ET d2= dat | COMBIEN AUTEUR ( ARTICLE )? d= dat | COMBIEN AUTEUR ARTICLE ( PARLER )+ ps= params | COMBIEN AUTEUR e= email | COMBIEN AUTEUR e= email ( PARLER )+ ps= params | COMBIEN JOURS ( PARLER )+ ps= params | COMBIEN MOT ps= params ET SELECT ARTICLE | COMBIEN MOT ps= params r= RUBRIQUE | COMBIEN PAGE ( PARLER )+ ps= params | COMBIEN PAGE ( PARLER )+ ps= params d= dat | COMBIEN r= RUBRIQUE ( PARLER )+ ps= params ENTRE d1= dat ET d2= dat | COMBIEN r= RUBRIQUE ( PARLER )+ ps= params | COMBIEN ARTICLE ( PARLER )+ ps= params ENTRE d1= datinf ET d2= datsup | COMBIEN r= RUBRIQUE ps= params | EMAIL AUTEUR ps= params | SELECT ARTICLE ( PARLER )+ ps= params ENTRE d1= datinf ET d2= datsup | SELECT ARTICLE ( PARLER )+ ps= params ( DATE )? d= dat | SELECT ARTICLE ( DATE )? d= dat | SELECT ARTICLE ps1= params ( PARLER )+ ps2= params | SELECT ARTICLE ( PARLER )+ ps= params | SELECT ARTICLE d= dat AUTEUR e= email | SELECT ARTICLE AUTEUR e= email ET ( PARLER )+ r= RUBRIQUE | SELECT ARTICLE AUTEUR e= email | SELECT ARTICLE ps1= params AUTEUR ps2= params | SELECT ARTICLE d= dat ET ( PARLER )+ ps= params | SELECT AUTEUR ( ARTICLE )? d= dat | SELECT AUTEUR ARTICLE ( PARLER )+ ps= params | SELECT AUTEUR ARTICLE ps= params | SELECT COMBIEN r= RUBRIQUE ( PARLER )+ ps= params | SELECT r= RUBRIQUE ( PARLER )+ ps= params | SELECT r= RUBRIQUE d= dat | SELECT r= RUBRIQUE ( PARLER )+ ps= params d= dat | SELECT DATE ( ARTICLE )? ( PARLER )+ ps= params | SELECT EMAIL AUTEUR ps= params | SELECT PAGE ARTICLE ( AUTEUR )* e= email | SELECT PAGE ( PARLER )+ ps= params )
			int alt33=43;
			alt33 = dfa33.predict(input);
			switch (alt33) {
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:88:5: COMBIEN ARTICLE ps1= params ( PARLER )+ ps2= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete437); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete439); 
					pushFollow(FOLLOW_params_in_requete445);
					ps1=params();
					state._fsp--;

					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:88:34: ( PARLER )+
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
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:88:34: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete447); 
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					pushFollow(FOLLOW_params_in_requete454);
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:100:5: COMBIEN ARTICLE ( PARLER )+ ps1= params PARLER ps2= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete468); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete470); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:100:21: ( PARLER )+
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
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:100:21: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete472); 
							}
							break;

						default :
							if ( cnt5 >= 1 ) break loop5;
							EarlyExitException eee = new EarlyExitException(5, input);
							throw eee;
						}
						cnt5++;
					}

					pushFollow(FOLLOW_params_in_requete479);
					ps1=params();
					state._fsp--;

					match(input,PARLER,FOLLOW_PARLER_in_requete481); 
					pushFollow(FOLLOW_params_in_requete487);
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:115:5: COMBIEN ARTICLE ( PARLER )+ ps= params d= dat
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete510); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete512); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:115:21: ( PARLER )+
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
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:115:21: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete514); 
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					pushFollow(FOLLOW_params_in_requete521);
					ps=params();
					state._fsp--;

					pushFollow(FOLLOW_dat_in_requete527);
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:127:5: COMBIEN ARTICLE d= dat
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete538); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete540); 
					pushFollow(FOLLOW_dat_in_requete546);
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:138:5: COMBIEN AUTEUR ARTICLE ENTRE d1= dat ET d2= dat
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete562); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete564); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete566); 
					match(input,ENTRE,FOLLOW_ENTRE_in_requete568); 
					pushFollow(FOLLOW_dat_in_requete574);
					d1=dat();
					state._fsp--;

					match(input,ET,FOLLOW_ET_in_requete576); 
					pushFollow(FOLLOW_dat_in_requete582);
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:151:5: COMBIEN AUTEUR ( ARTICLE )? d= dat
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete596); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete598); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:151:20: ( ARTICLE )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==ARTICLE) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:151:20: ARTICLE
							{
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete600); 
							}
							break;

					}

					pushFollow(FOLLOW_dat_in_requete607);
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:161:5: COMBIEN AUTEUR ARTICLE ( PARLER )+ ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete621); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete623); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete626); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:161:29: ( PARLER )+
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
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:161:29: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete628); 
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					pushFollow(FOLLOW_params_in_requete635);
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:170:5: COMBIEN AUTEUR e= email
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete644); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete646); 
					pushFollow(FOLLOW_email_in_requete652);
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:179:5: COMBIEN AUTEUR e= email ( PARLER )+ ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete666); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete668); 
					pushFollow(FOLLOW_email_in_requete674);
					e=email();
					state._fsp--;

					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:179:30: ( PARLER )+
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
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:179:30: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete676); 
							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					pushFollow(FOLLOW_params_in_requete683);
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:193:5: COMBIEN JOURS ( PARLER )+ ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete697); 
					match(input,JOURS,FOLLOW_JOURS_in_requete699); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:193:19: ( PARLER )+
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
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:193:19: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete701); 
							}
							break;

						default :
							if ( cnt10 >= 1 ) break loop10;
							EarlyExitException eee = new EarlyExitException(10, input);
							throw eee;
						}
						cnt10++;
					}

					pushFollow(FOLLOW_params_in_requete708);
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:204:5: COMBIEN MOT ps= params ET SELECT ARTICLE
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete724); 
					match(input,MOT,FOLLOW_MOT_in_requete726); 
					pushFollow(FOLLOW_params_in_requete732);
					ps=params();
					state._fsp--;

					match(input,ET,FOLLOW_ET_in_requete734); 
					match(input,SELECT,FOLLOW_SELECT_in_requete736); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete738); 

								req_arbre.ajouteFils(new Arbre("", "select count(m.mot), m.page"));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
								req_arbre.ajouteFils(new Arbre("", "group by m.page "));			
							
					}
					break;
				case 15 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:214:5: COMBIEN MOT ps= params r= RUBRIQUE
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete752); 
					match(input,MOT,FOLLOW_MOT_in_requete754); 
					pushFollow(FOLLOW_params_in_requete760);
					ps=params();
					state._fsp--;

					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete766); 

								req_arbre.ajouteFils(new Arbre("", "select count(m.mot) "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
								req_arbre.ajouteFils(new Arbre("", "where m.rubrique = '" + r.getText() + "' "));
								req_arbre.ajouteFils(new Arbre("", " AND "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 16 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:224:5: COMBIEN PAGE ( PARLER )+ ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete777); 
					match(input,PAGE,FOLLOW_PAGE_in_requete779); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:224:18: ( PARLER )+
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
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:224:18: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete781); 
							}
							break;

						default :
							if ( cnt11 >= 1 ) break loop11;
							EarlyExitException eee = new EarlyExitException(11, input);
							throw eee;
						}
						cnt11++;
					}

					pushFollow(FOLLOW_params_in_requete788);
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:233:5: COMBIEN PAGE ( PARLER )+ ps= params d= dat
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete802); 
					match(input,PAGE,FOLLOW_PAGE_in_requete804); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:233:18: ( PARLER )+
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
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:233:18: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete806); 
							}
							break;

						default :
							if ( cnt12 >= 1 ) break loop12;
							EarlyExitException eee = new EarlyExitException(12, input);
							throw eee;
						}
						cnt12++;
					}

					pushFollow(FOLLOW_params_in_requete813);
					ps=params();
					state._fsp--;

					pushFollow(FOLLOW_dat_in_requete819);
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:247:5: COMBIEN r= RUBRIQUE ( PARLER )+ ps= params ENTRE d1= dat ET d2= dat
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete835); 
					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete841); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:247:26: ( PARLER )+
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
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:247:26: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete843); 
							}
							break;

						default :
							if ( cnt13 >= 1 ) break loop13;
							EarlyExitException eee = new EarlyExitException(13, input);
							throw eee;
						}
						cnt13++;
					}

					pushFollow(FOLLOW_params_in_requete850);
					ps=params();
					state._fsp--;

					match(input,ENTRE,FOLLOW_ENTRE_in_requete852); 
					pushFollow(FOLLOW_dat_in_requete858);
					d1=dat();
					state._fsp--;

					match(input,ET,FOLLOW_ET_in_requete860); 
					pushFollow(FOLLOW_dat_in_requete866);
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:270:5: COMBIEN r= RUBRIQUE ( PARLER )+ ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete896); 
					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete902); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:270:26: ( PARLER )+
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
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:270:26: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete904); 
							}
							break;

						default :
							if ( cnt14 >= 1 ) break loop14;
							EarlyExitException eee = new EarlyExitException(14, input);
							throw eee;
						}
						cnt14++;
					}

					pushFollow(FOLLOW_params_in_requete911);
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:280:5: COMBIEN ARTICLE ( PARLER )+ ps= params ENTRE d1= datinf ET d2= datsup
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete925); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete927); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:280:21: ( PARLER )+
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
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:280:21: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete929); 
							}
							break;

						default :
							if ( cnt15 >= 1 ) break loop15;
							EarlyExitException eee = new EarlyExitException(15, input);
							throw eee;
						}
						cnt15++;
					}

					pushFollow(FOLLOW_params_in_requete937);
					ps=params();
					state._fsp--;

					match(input,ENTRE,FOLLOW_ENTRE_in_requete939); 
					pushFollow(FOLLOW_datinf_in_requete945);
					d1=datinf();
					state._fsp--;

					match(input,ET,FOLLOW_ET_in_requete947); 
					pushFollow(FOLLOW_datsup_in_requete953);
					d2=datsup();
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:296:5: COMBIEN r= RUBRIQUE ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete965); 
					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete971); 
					pushFollow(FOLLOW_params_in_requete977);
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:308:5: EMAIL AUTEUR ps= params
					{
					match(input,EMAIL,FOLLOW_EMAIL_in_requete993); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete995); 
					pushFollow(FOLLOW_params_in_requete1001);
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:321:5: SELECT ARTICLE ( PARLER )+ ps= params ENTRE d1= datinf ET d2= datsup
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1020); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1022); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:321:20: ( PARLER )+
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
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:321:20: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete1024); 
							}
							break;

						default :
							if ( cnt16 >= 1 ) break loop16;
							EarlyExitException eee = new EarlyExitException(16, input);
							throw eee;
						}
						cnt16++;
					}

					pushFollow(FOLLOW_params_in_requete1032);
					ps=params();
					state._fsp--;

					match(input,ENTRE,FOLLOW_ENTRE_in_requete1034); 
					pushFollow(FOLLOW_datinf_in_requete1040);
					d1=datinf();
					state._fsp--;

					match(input,ET,FOLLOW_ET_in_requete1042); 
					pushFollow(FOLLOW_datsup_in_requete1048);
					d2=datsup();
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
								req_arbre.ajouteFils(new Arbre("", "AND "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 24 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:336:5: SELECT ARTICLE ( PARLER )+ ps= params ( DATE )? d= dat
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1064); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1066); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:336:20: ( PARLER )+
					int cnt17=0;
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==PARLER) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:336:20: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete1068); 
							}
							break;

						default :
							if ( cnt17 >= 1 ) break loop17;
							EarlyExitException eee = new EarlyExitException(17, input);
							throw eee;
						}
						cnt17++;
					}

					pushFollow(FOLLOW_params_in_requete1075);
					ps=params();
					state._fsp--;

					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:336:40: ( DATE )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==DATE) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:336:40: DATE
							{
							match(input,DATE,FOLLOW_DATE_in_requete1077); 
							}
							break;

					}

					pushFollow(FOLLOW_dat_in_requete1084);
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:348:5: SELECT ARTICLE ( DATE )? d= dat
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1094); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1096); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:348:20: ( DATE )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==DATE) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:348:20: DATE
							{
							match(input,DATE,FOLLOW_DATE_in_requete1098); 
							}
							break;

					}

					pushFollow(FOLLOW_dat_in_requete1105);
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:358:5: SELECT ARTICLE ps1= params ( PARLER )+ ps2= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1118); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1120); 
					pushFollow(FOLLOW_params_in_requete1126);
					ps1=params();
					state._fsp--;

					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:358:33: ( PARLER )+
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
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:358:33: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete1128); 
							}
							break;

						default :
							if ( cnt20 >= 1 ) break loop20;
							EarlyExitException eee = new EarlyExitException(20, input);
							throw eee;
						}
						cnt20++;
					}

					pushFollow(FOLLOW_params_in_requete1135);
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:373:5: SELECT ARTICLE ( PARLER )+ ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1158); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1160); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:373:20: ( PARLER )+
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
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:373:20: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete1162); 
							}
							break;

						default :
							if ( cnt21 >= 1 ) break loop21;
							EarlyExitException eee = new EarlyExitException(21, input);
							throw eee;
						}
						cnt21++;
					}

					pushFollow(FOLLOW_params_in_requete1169);
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:382:5: SELECT ARTICLE d= dat AUTEUR e= email
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1181); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1183); 
					pushFollow(FOLLOW_dat_in_requete1189);
					d=dat();
					state._fsp--;

					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1191); 
					pushFollow(FOLLOW_email_in_requete1197);
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:394:5: SELECT ARTICLE AUTEUR e= email ET ( PARLER )+ r= RUBRIQUE
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1206); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1208); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1210); 
					pushFollow(FOLLOW_email_in_requete1216);
					e=email();
					state._fsp--;

					match(input,ET,FOLLOW_ET_in_requete1218); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:394:40: ( PARLER )+
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
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:394:40: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete1220); 
							}
							break;

						default :
							if ( cnt22 >= 1 ) break loop22;
							EarlyExitException eee = new EarlyExitException(22, input);
							throw eee;
						}
						cnt22++;
					}

					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete1227); 

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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:404:5: SELECT ARTICLE AUTEUR e= email
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1236); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1238); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1240); 
					pushFollow(FOLLOW_email_in_requete1246);
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
				case 31 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:413:5: SELECT ARTICLE ps1= params AUTEUR ps2= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1255); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1257); 
					pushFollow(FOLLOW_params_in_requete1263);
					ps1=params();
					state._fsp--;

					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1265); 
					pushFollow(FOLLOW_params_in_requete1271);
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
				case 32 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:424:5: SELECT ARTICLE d= dat ET ( PARLER )+ ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1282); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1284); 
					pushFollow(FOLLOW_dat_in_requete1290);
					d=dat();
					state._fsp--;

					match(input,ET,FOLLOW_ET_in_requete1292); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:424:31: ( PARLER )+
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
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:424:31: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete1294); 
							}
							break;

						default :
							if ( cnt23 >= 1 ) break loop23;
							EarlyExitException eee = new EarlyExitException(23, input);
							throw eee;
						}
						cnt23++;
					}

					pushFollow(FOLLOW_params_in_requete1301);
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
				case 33 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:438:5: SELECT AUTEUR ( ARTICLE )? d= dat
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1315); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1317); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:438:19: ( ARTICLE )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==ARTICLE) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:438:19: ARTICLE
							{
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1319); 
							}
							break;

					}

					pushFollow(FOLLOW_dat_in_requete1326);
					d=dat();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct e.email "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m, email e, datearticle d"));
								req_arbre.ajouteFils(new Arbre("", "where m.article = d.article AND d.article = e.article"));
								req_arbre.ajouteFils(new Arbre("", " AND "));
								d_arbre = d;
								req_arbre.ajouteFils(d_arbre);
							
					}
					break;
				case 34 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:447:5: SELECT AUTEUR ARTICLE ( PARLER )+ ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1337); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1339); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1341); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:447:27: ( PARLER )+
					int cnt25=0;
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( (LA25_0==PARLER) ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:447:27: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete1343); 
							}
							break;

						default :
							if ( cnt25 >= 1 ) break loop25;
							EarlyExitException eee = new EarlyExitException(25, input);
							throw eee;
						}
						cnt25++;
					}

					pushFollow(FOLLOW_params_in_requete1350);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct e.email "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m, email e"));
								req_arbre.ajouteFils(new Arbre("", "where m.article = e.article"));
								req_arbre.ajouteFils(new Arbre("", "AND "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 35 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:456:5: SELECT AUTEUR ARTICLE ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1359); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1361); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1363); 
					pushFollow(FOLLOW_params_in_requete1369);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct e.email "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m, email e"));
								req_arbre.ajouteFils(new Arbre("", "where m.article = e.article"));
								req_arbre.ajouteFils(new Arbre("", "AND "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 36 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:467:5: SELECT COMBIEN r= RUBRIQUE ( PARLER )+ ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1384); 
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete1386); 
					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete1392); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:467:33: ( PARLER )+
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
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:467:33: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete1394); 
							}
							break;

						default :
							if ( cnt26 >= 1 ) break loop26;
							EarlyExitException eee = new EarlyExitException(26, input);
							throw eee;
						}
						cnt26++;
					}

					pushFollow(FOLLOW_params_in_requete1401);
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:478:5: SELECT r= RUBRIQUE ( PARLER )+ ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1417); 
					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete1423); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:478:25: ( PARLER )+
					int cnt27=0;
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( (LA27_0==PARLER) ) {
							alt27=1;
						}

						switch (alt27) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:478:25: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete1425); 
							}
							break;

						default :
							if ( cnt27 >= 1 ) break loop27;
							EarlyExitException eee = new EarlyExitException(27, input);
							throw eee;
						}
						cnt27++;
					}

					pushFollow(FOLLOW_params_in_requete1432);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct m.page "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
								req_arbre.ajouteFils(new Arbre("", "where m.rubrique = '" + r.getText() + "' "));
								req_arbre.ajouteFils(new Arbre("", " AND "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 38 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:487:5: SELECT r= RUBRIQUE d= dat
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1443); 
					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete1449); 
					pushFollow(FOLLOW_dat_in_requete1456);
					d=dat();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct m.page "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m, datepage d "));
								req_arbre.ajouteFils(new Arbre("", "where m.rubrique = '" + r.getText() + "' "));
								req_arbre.ajouteFils(new Arbre("", "AND m.page = d.page "));
								req_arbre.ajouteFils(new Arbre("", "AND "));
								d_arbre = d;
								req_arbre.ajouteFils(d_arbre);
							
					}
					break;
				case 39 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:497:5: SELECT r= RUBRIQUE ( PARLER )+ ps= params d= dat
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1466); 
					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete1472); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:497:25: ( PARLER )+
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
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:497:25: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete1474); 
							}
							break;

						default :
							if ( cnt28 >= 1 ) break loop28;
							EarlyExitException eee = new EarlyExitException(28, input);
							throw eee;
						}
						cnt28++;
					}

					pushFollow(FOLLOW_params_in_requete1481);
					ps=params();
					state._fsp--;

					pushFollow(FOLLOW_dat_in_requete1488);
					d=dat();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct m.page "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m, datepage d "));
								req_arbre.ajouteFils(new Arbre("", "where m.rubrique = '" + r.getText() + "' "));
								req_arbre.ajouteFils(new Arbre("", "AND m.page = d.page "));
								req_arbre.ajouteFils(new Arbre("", " AND "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
								req_arbre.ajouteFils(new Arbre("", "AND "));
								d_arbre = d;
								req_arbre.ajouteFils(d_arbre);
							
					}
					break;
				case 40 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:511:5: SELECT DATE ( ARTICLE )? ( PARLER )+ ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1500); 
					match(input,DATE,FOLLOW_DATE_in_requete1502); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:511:17: ( ARTICLE )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==ARTICLE) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:511:17: ARTICLE
							{
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1504); 
							}
							break;

					}

					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:511:26: ( PARLER )+
					int cnt30=0;
					loop30:
					while (true) {
						int alt30=2;
						int LA30_0 = input.LA(1);
						if ( (LA30_0==PARLER) ) {
							alt30=1;
						}

						switch (alt30) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:511:26: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete1507); 
							}
							break;

						default :
							if ( cnt30 >= 1 ) break loop30;
							EarlyExitException eee = new EarlyExitException(30, input);
							throw eee;
						}
						cnt30++;
					}

					pushFollow(FOLLOW_params_in_requete1512);
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
				case 41 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:522:5: SELECT EMAIL AUTEUR ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1526); 
					match(input,EMAIL,FOLLOW_EMAIL_in_requete1528); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1530); 
					pushFollow(FOLLOW_params_in_requete1536);
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
				case 42 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:533:5: SELECT PAGE ARTICLE ( AUTEUR )* e= email
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1550); 
					match(input,PAGE,FOLLOW_PAGE_in_requete1552); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1554); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:533:25: ( AUTEUR )*
					loop31:
					while (true) {
						int alt31=2;
						int LA31_0 = input.LA(1);
						if ( (LA31_0==AUTEUR) ) {
							alt31=1;
						}

						switch (alt31) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:533:25: AUTEUR
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1556); 
							}
							break;

						default :
							break loop31;
						}
					}

					pushFollow(FOLLOW_email_in_requete1563);
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
				case 43 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:542:5: SELECT PAGE ( PARLER )+ ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1574); 
					match(input,PAGE,FOLLOW_PAGE_in_requete1576); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:542:17: ( PARLER )+
					int cnt32=0;
					loop32:
					while (true) {
						int alt32=2;
						int LA32_0 = input.LA(1);
						if ( (LA32_0==PARLER) ) {
							alt32=1;
						}

						switch (alt32) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:542:17: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete1578); 
							}
							break;

						default :
							if ( cnt32 >= 1 ) break loop32;
							EarlyExitException eee = new EarlyExitException(32, input);
							throw eee;
						}
						cnt32++;
					}

					pushFollow(FOLLOW_params_in_requete1585);
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
	// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:551:1: conj returns [Arbre conj_arbre = new Arbre(\"\")] : ( ET | OU );
	public final Arbre conj() throws RecognitionException {
		Arbre conj_arbre =  new Arbre("");


		try {
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:551:49: ( ET | OU )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==ET) ) {
				alt34=1;
			}
			else if ( (LA34_0==OU) ) {
				alt34=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:552:2: ET
					{
					match(input,ET,FOLLOW_ET_in_conj1601); 

							conj_arbre.ajouteFils(new Arbre("", "AND "));
						
					}
					break;
				case 2 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:555:4: OU
					{
					match(input,OU,FOLLOW_OU_in_conj1608); 

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
	// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:559:1: dat returns [Arbre les_pars_arbre = new Arbre(\"\")] : (a= NBR |m= MOIS |m= MOIS a= NBR |j= JOURS m= MOIS |j= NBR m= MOIS a= NBR );
	public final Arbre dat() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Token a=null;
		Token m=null;
		Token j=null;

		try {
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:559:52: (a= NBR |m= MOIS |m= MOIS a= NBR |j= JOURS m= MOIS |j= NBR m= MOIS a= NBR )
			int alt35=5;
			switch ( input.LA(1) ) {
			case NBR:
				{
				int LA35_1 = input.LA(2);
				if ( (LA35_1==MOIS) ) {
					alt35=5;
				}
				else if ( (LA35_1==AUTEUR||LA35_1==ET||(LA35_1 >= PARLER && LA35_1 <= POINT)) ) {
					alt35=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 35, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case MOIS:
				{
				int LA35_2 = input.LA(2);
				if ( (LA35_2==NBR) ) {
					alt35=3;
				}
				else if ( (LA35_2==AUTEUR||LA35_2==ET||(LA35_2 >= PARLER && LA35_2 <= POINT)) ) {
					alt35=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 35, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case JOURS:
				{
				alt35=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}
			switch (alt35) {
				case 1 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:560:2: a= NBR
					{
					a=(Token)match(input,NBR,FOLLOW_NBR_in_dat1627); 

							les_pars_arbre.ajouteFils(new Arbre("", "d.annee = '" + a.getText() + "' "));
						
					}
					break;
				case 2 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:563:4: m= MOIS
					{
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_dat1638); 

							les_pars_arbre.ajouteFils(new Arbre("", "d.mois = '" + m.getText() + "' "));
						
					}
					break;
				case 3 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:566:4: m= MOIS a= NBR
					{
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_dat1649); 
					a=(Token)match(input,NBR,FOLLOW_NBR_in_dat1655); 

							les_pars_arbre.ajouteFils(new Arbre("", "d.mois = '" + m.getText() + "' "));
							les_pars_arbre.ajouteFils(new Arbre("", "AND d.annee = '" + a.getText() + "' "));
						
					}
					break;
				case 4 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:570:4: j= JOURS m= MOIS
					{
					j=(Token)match(input,JOURS,FOLLOW_JOURS_in_dat1666); 
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_dat1672); 

							les_pars_arbre.ajouteFils(new Arbre("", "d.jour = '" + j.getText() + "' "));
							les_pars_arbre.ajouteFils(new Arbre("", "AND d.mois = '" + m.getText() + "' "));
							
					}
					break;
				case 5 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:574:4: j= NBR m= MOIS a= NBR
					{
					j=(Token)match(input,NBR,FOLLOW_NBR_in_dat1683); 
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_dat1689); 
					a=(Token)match(input,NBR,FOLLOW_NBR_in_dat1695); 

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



	// $ANTLR start "datinf"
	// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:580:1: datinf returns [Arbre les_pars_arbre = new Arbre(\"\")] : a= NBR ;
	public final Arbre datinf() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:580:55: (a= NBR )
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:581:2: a= NBR
			{
			a=(Token)match(input,NBR,FOLLOW_NBR_in_datinf1715); 

					les_pars_arbre.ajouteFils(new Arbre("", "to_number(d.annee, '9999') >= to_number('" + a.getText() + "', '9999') "));
				
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
	// $ANTLR end "datinf"



	// $ANTLR start "datsup"
	// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:585:1: datsup returns [Arbre les_pars_arbre = new Arbre(\"\")] : a= NBR ;
	public final Arbre datsup() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Token a=null;

		try {
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:585:55: (a= NBR )
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:586:2: a= NBR
			{
			a=(Token)match(input,NBR,FOLLOW_NBR_in_datsup1734); 

					les_pars_arbre.ajouteFils(new Arbre("", "to_number(d.annee, '9999') <= to_number('" + a.getText() + "', '9999') "));
				
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
	// $ANTLR end "datsup"



	// $ANTLR start "email"
	// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:590:1: email returns [Arbre les_pars_arbre = new Arbre(\"\")] : (a1= VAR a= AT a2= VAR (n= NBR )? p= POINT a3= VAR | EMAIL a1= VAR a= AT a2= VAR p= POINT a3= VAR | EMAIL AUTEUR a1= VAR a= AT a2= VAR p= POINT a3= VAR | EMAIL a= AT a1= VAR p= POINT a2= VAR |a= VAR );
	public final Arbre email() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Token a1=null;
		Token a=null;
		Token a2=null;
		Token n=null;
		Token p=null;
		Token a3=null;

		try {
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:590:54: (a1= VAR a= AT a2= VAR (n= NBR )? p= POINT a3= VAR | EMAIL a1= VAR a= AT a2= VAR p= POINT a3= VAR | EMAIL AUTEUR a1= VAR a= AT a2= VAR p= POINT a3= VAR | EMAIL a= AT a1= VAR p= POINT a2= VAR |a= VAR )
			int alt37=5;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==VAR) ) {
				int LA37_1 = input.LA(2);
				if ( (LA37_1==AT) ) {
					alt37=1;
				}
				else if ( (LA37_1==ET||(LA37_1 >= PARLER && LA37_1 <= POINT)) ) {
					alt37=5;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 37, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA37_0==EMAIL) ) {
				switch ( input.LA(2) ) {
				case VAR:
					{
					alt37=2;
					}
					break;
				case AUTEUR:
					{
					alt37=3;
					}
					break;
				case AT:
					{
					alt37=4;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 37, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}

			switch (alt37) {
				case 1 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:591:2: a1= VAR a= AT a2= VAR (n= NBR )? p= POINT a3= VAR
					{
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_email1753); 
					a=(Token)match(input,AT,FOLLOW_AT_in_email1759); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_email1765); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:591:29: (n= NBR )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==NBR) ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:591:29: n= NBR
							{
							n=(Token)match(input,NBR,FOLLOW_NBR_in_email1771); 
							}
							break;

					}

					p=(Token)match(input,POINT,FOLLOW_POINT_in_email1778); 
					a3=(Token)match(input,VAR,FOLLOW_VAR_in_email1784); 

							les_pars_arbre.ajouteFils(new Arbre("", "e.email = '" + a1.getText() + a.getText() + a2.getText() + n.getText() + p.getText() + a3.getText() + "' "));
						
					}
					break;
				case 2 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:595:4: EMAIL a1= VAR a= AT a2= VAR p= POINT a3= VAR
					{
					match(input,EMAIL,FOLLOW_EMAIL_in_email1792); 
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_email1798); 
					a=(Token)match(input,AT,FOLLOW_AT_in_email1804); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_email1810); 
					p=(Token)match(input,POINT,FOLLOW_POINT_in_email1816); 
					a3=(Token)match(input,VAR,FOLLOW_VAR_in_email1822); 

								les_pars_arbre.ajouteFils(new Arbre("", "e.email = '" + a1.getText() + a.getText() + a2.getText() + p.getText() + a3.getText() + "' "));
						
					}
					break;
				case 3 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:598:4: EMAIL AUTEUR a1= VAR a= AT a2= VAR p= POINT a3= VAR
					{
					match(input,EMAIL,FOLLOW_EMAIL_in_email1829); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_email1831); 
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_email1837); 
					a=(Token)match(input,AT,FOLLOW_AT_in_email1843); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_email1849); 
					p=(Token)match(input,POINT,FOLLOW_POINT_in_email1855); 
					a3=(Token)match(input,VAR,FOLLOW_VAR_in_email1861); 

							les_pars_arbre.ajouteFils(new Arbre("", "e.email = '" + a1.getText() + a.getText() + a2.getText() + p.getText() + a3.getText() + "' "));
						
					}
					break;
				case 4 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:601:4: EMAIL a= AT a1= VAR p= POINT a2= VAR
					{
					match(input,EMAIL,FOLLOW_EMAIL_in_email1868); 
					a=(Token)match(input,AT,FOLLOW_AT_in_email1874); 
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_email1880); 
					p=(Token)match(input,POINT,FOLLOW_POINT_in_email1886); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_email1892); 

							les_pars_arbre.ajouteFils(new Arbre("", "e.email = '" + a.getText() + a1.getText() + p.getText() + a2.getText() + "' "));
						
					}
					break;
				case 5 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:604:4: a= VAR
					{
					a=(Token)match(input,VAR,FOLLOW_VAR_in_email1903); 

							les_pars_arbre.ajouteFils(new Arbre("", "e.email LIKE '%" + a.getText() + "%' "));
						
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
	// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:609:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:610:26: (r= requete POINT )
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:611:3: r= requete POINT
			{
			pushFollow(FOLLOW_requete_in_listerequetes1931);
			r=requete();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_listerequetes1933); 

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
	// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:616:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : (a= VAR |a1= NBR a2= MOIS |a1= VAR a2= VAR |a1= VAR a2= VAR a3= VAR |a1= VAR a2= VAR a3= VAR a4= VAR );
	public final Arbre param() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;
		Token a1=null;
		Token a2=null;
		Token a3=null;
		Token a4=null;

		try {
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:616:51: (a= VAR |a1= NBR a2= MOIS |a1= VAR a2= VAR |a1= VAR a2= VAR a3= VAR |a1= VAR a2= VAR a3= VAR a4= VAR )
			int alt38=5;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==VAR) ) {
				int LA38_1 = input.LA(2);
				if ( (LA38_1==VAR) ) {
					int LA38_3 = input.LA(3);
					if ( (LA38_3==VAR) ) {
						int LA38_5 = input.LA(4);
						if ( (LA38_5==VAR) ) {
							alt38=5;
						}
						else if ( (LA38_5==AUTEUR||LA38_5==DATE||(LA38_5 >= ENTRE && LA38_5 <= MOIS)||(LA38_5 >= NBR && LA38_5 <= OU)||(LA38_5 >= PARLER && LA38_5 <= POINT)||LA38_5==RUBRIQUE) ) {
							alt38=4;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 38, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA38_3==AUTEUR||LA38_3==DATE||(LA38_3 >= ENTRE && LA38_3 <= MOIS)||(LA38_3 >= NBR && LA38_3 <= OU)||(LA38_3 >= PARLER && LA38_3 <= POINT)||LA38_3==RUBRIQUE) ) {
						alt38=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 38, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA38_1==AUTEUR||LA38_1==DATE||(LA38_1 >= ENTRE && LA38_1 <= MOIS)||(LA38_1 >= NBR && LA38_1 <= OU)||(LA38_1 >= PARLER && LA38_1 <= POINT)||LA38_1==RUBRIQUE) ) {
					alt38=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 38, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA38_0==NBR) ) {
				alt38=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}

			switch (alt38) {
				case 1 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:617:2: a= VAR
					{
					a=(Token)match(input,VAR,FOLLOW_VAR_in_param1952); 

							lepar_arbre.ajouteFils(new Arbre("", "m.mot = '" + a.getText() + "' "));
						
					}
					break;
				case 2 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:620:4: a1= NBR a2= MOIS
					{
					a1=(Token)match(input,NBR,FOLLOW_NBR_in_param1963); 
					a2=(Token)match(input,MOIS,FOLLOW_MOIS_in_param1969); 

						 	lepar_arbre.ajouteFils(new Arbre("", "m.mot = '" + a1.getText() + "' "));
						 	lepar_arbre.ajouteFils(new Arbre("", "OR m.mot = '" + a2.getText() + "' "));
						 
					}
					break;
				case 3 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:624:5: a1= VAR a2= VAR
					{
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_param1981); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_param1987); 

							lepar_arbre.ajouteFils(new Arbre("", "m.mot = '" +a1.getText() + "' "));
							lepar_arbre.ajouteFils(new Arbre("", "OR m.mot = '" + a2.getText() + "' "));
						
					}
					break;
				case 4 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:628:4: a1= VAR a2= VAR a3= VAR
					{
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_param1998); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_param2004); 
					a3=(Token)match(input,VAR,FOLLOW_VAR_in_param2010); 

							lepar_arbre.ajouteFils(new Arbre("", "m.mot = '" +a1.getText() + "' "));
							lepar_arbre.ajouteFils(new Arbre("", "OR m.mot = '" + a2.getText() + "' "));
							lepar_arbre.ajouteFils(new Arbre("", "OR m.mot = '" + a3.getText() + "' "));
						
					}
					break;
				case 5 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:633:4: a1= VAR a2= VAR a3= VAR a4= VAR
					{
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_param2021); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_param2027); 
					a3=(Token)match(input,VAR,FOLLOW_VAR_in_param2033); 
					a4=(Token)match(input,VAR,FOLLOW_VAR_in_param2039); 

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
	// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:640:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param (c= conj par2= param )* ;
	public final Arbre params() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre c =null;
		Arbre par2 =null;


				Arbre par1_arbre, par2_arbre, conj_arbre, dat_arbre;
			
		try {
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:643:4: (par1= param (c= conj par2= param )* )
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:644:3: par1= param (c= conj par2= param )*
			{
			pushFollow(FOLLOW_param_in_params2064);
			par1=param();
			state._fsp--;


						par1_arbre = par1;
						les_pars_arbre.ajouteFils(par1_arbre);
					
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:648:3: (c= conj par2= param )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==ET) ) {
					int LA39_2 = input.LA(2);
					if ( (LA39_2==NBR||LA39_2==VAR) ) {
						alt39=1;
					}

				}
				else if ( (LA39_0==OU) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\Tomcat\\lo17-servlet\\WebContent\\Tal_simple.g:648:4: c= conj par2= param
					{
					pushFollow(FOLLOW_conj_in_params2075);
					c=conj();
					state._fsp--;

					pushFollow(FOLLOW_param_in_params2081);
					par2=param();
					state._fsp--;


								conj_arbre = c;
								par2_arbre = par2;
								les_pars_arbre.ajouteFils(conj_arbre);
								les_pars_arbre.ajouteFils(par2_arbre);
							
					}
					break;

				default :
					break loop39;
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


	protected DFA33 dfa33 = new DFA33(this);
	static final String DFA33_eotS =
		"\u00d7\uffff";
	static final String DFA33_eofS =
		"\u00d7\uffff";
	static final String DFA33_minS =
		"\1\4\1\16\1\4\1\uffff\1\4\2\uffff\1\16\1\4\1\uffff\1\21\1\24\1\21\1\6"+
		"\1\4\1\uffff\1\16\2\uffff\1\4\1\21\1\uffff\1\17\1\uffff\1\14\1\uffff\2"+
		"\5\1\15\1\17\2\21\1\uffff\1\13\1\21\1\uffff\2\6\1\17\1\6\1\16\1\uffff"+
		"\1\21\3\uffff\1\14\1\17\1\15\2\uffff\1\35\2\uffff\1\5\2\35\1\15\2\21\1"+
		"\uffff\2\15\1\17\1\14\1\17\2\5\1\11\1\17\1\6\2\uffff\3\6\2\21\4\uffff"+
		"\1\17\1\15\1\17\1\14\2\21\4\uffff\1\14\1\21\1\35\1\5\1\25\1\15\1\uffff"+
		"\1\15\1\17\1\15\2\21\2\uffff\1\15\1\14\2\21\2\uffff\1\14\1\35\2\uffff"+
		"\1\5\2\35\1\11\2\21\3\uffff\1\11\3\6\1\17\2\15\2\21\2\uffff\1\15\2\14"+
		"\1\17\1\25\1\35\1\25\2\35\5\15\1\17\2\14\1\17\1\21\1\35\1\5\1\25\2\11"+
		"\1\17\3\6\2\15\1\17\3\14\1\24\1\35\1\25\1\24\4\15\3\14\1\25\1\35\1\25"+
		"\2\35\3\11\1\6\3\15\1\14\1\24\1\35\2\15\1\14\1\15\1\35\1\25\1\15\1\11"+
		"\1\6\1\15\1\14\1\24\1\15\1\14\1\15\1\35\1\11\2\15";
	static final String DFA33_maxS =
		"\1\32\1\24\1\31\1\uffff\1\31\2\uffff\2\35\1\uffff\1\35\1\24\2\35\1\21"+
		"\1\uffff\1\24\2\uffff\1\24\1\35\1\uffff\1\25\1\uffff\1\24\1\uffff\1\25"+
		"\2\35\1\17\2\35\1\uffff\2\35\1\uffff\2\25\1\17\2\35\1\uffff\1\35\3\uffff"+
		"\1\35\1\17\1\24\2\uffff\1\35\2\uffff\1\5\5\35\1\uffff\1\31\1\35\1\17\1"+
		"\35\1\17\1\25\2\35\1\17\1\24\2\uffff\2\25\3\35\4\uffff\1\25\1\35\1\17"+
		"\3\35\4\uffff\2\25\1\35\1\5\1\25\1\35\1\uffff\1\35\1\17\3\35\2\uffff\1"+
		"\25\3\35\2\uffff\1\25\1\35\2\uffff\1\5\5\35\3\uffff\2\25\2\35\1\17\1\25"+
		"\3\35\2\uffff\1\25\2\35\1\17\1\25\1\35\1\25\2\35\1\31\1\35\1\31\2\35\1"+
		"\17\2\35\1\17\1\25\1\35\1\5\1\25\2\35\1\17\1\24\1\35\1\24\2\35\1\17\1"+
		"\25\1\35\2\25\1\35\2\25\1\35\1\25\1\35\2\25\1\35\2\25\1\35\1\25\2\35\1"+
		"\25\1\35\1\25\1\35\1\25\1\35\1\25\1\35\1\25\1\35\1\31\2\35\1\25\1\35\2"+
		"\25\1\35\1\24\1\35\5\25\1\35\3\25";
	static final String DFA33_acceptS =
		"\3\uffff\1\26\1\uffff\1\1\1\2\2\uffff\1\15\5\uffff\1\44\1\uffff\1\50\1"+
		"\51\2\uffff\1\4\1\uffff\1\7\1\uffff\1\11\6\uffff\1\25\2\uffff\1\31\5\uffff"+
		"\1\41\1\uffff\1\46\1\52\1\53\3\uffff\1\10\1\12\1\uffff\1\13\1\14\6\uffff"+
		"\1\17\12\uffff\1\34\1\40\5\uffff\1\32\1\37\1\42\1\43\6\uffff\1\3\1\5\1"+
		"\6\1\24\6\uffff\1\16\5\uffff\1\20\1\21\4\uffff\1\22\1\23\2\uffff\1\35"+
		"\1\36\6\uffff\1\27\1\30\1\33\11\uffff\1\45\1\47\117\uffff";
	static final String DFA33_specialS =
		"\u00d7\uffff}>";
	static final String[] DFA33_transitionS = {
			"\1\1\2\uffff\1\2\3\uffff\1\3\16\uffff\1\4",
			"\2\5\1\uffff\1\5\2\uffff\1\6",
			"\1\7\1\uffff\1\10\7\uffff\1\11\1\uffff\1\12\2\uffff\1\13\5\uffff\1\14",
			"",
			"\1\15\1\uffff\1\16\1\17\1\uffff\1\21\1\uffff\1\22\7\uffff\1\23\5\uffff"+
			"\1\20",
			"",
			"",
			"\2\27\1\uffff\1\26\2\uffff\1\24\10\uffff\1\25",
			"\1\30\6\uffff\1\33\2\uffff\2\31\1\uffff\1\31\13\uffff\1\32",
			"",
			"\1\35\13\uffff\1\34",
			"\1\36",
			"\1\40\2\uffff\1\37\10\uffff\1\40",
			"\1\41\2\uffff\1\43\4\uffff\1\46\1\45\1\uffff\1\44\2\uffff\1\42\10\uffff"+
			"\1\47",
			"\1\50\11\uffff\2\51\1\uffff\1\51",
			"",
			"\2\53\1\uffff\1\53\2\uffff\1\52",
			"",
			"",
			"\1\54\17\uffff\1\55",
			"\1\57\2\uffff\1\24\10\uffff\1\56",
			"",
			"\1\60\5\uffff\1\27",
			"",
			"\1\61\1\uffff\2\31\1\uffff\1\31\2\uffff\1\62",
			"",
			"\1\63\16\uffff\1\65\1\64",
			"\1\70\1\67\26\uffff\1\66",
			"\1\72\4\uffff\1\73\6\uffff\1\74\3\uffff\1\71",
			"\1\75",
			"\1\77\2\uffff\1\36\10\uffff\1\76",
			"\1\101\2\uffff\1\37\10\uffff\1\100",
			"",
			"\1\103\21\uffff\1\102",
			"\1\105\2\uffff\1\42\10\uffff\1\104",
			"",
			"\1\107\6\uffff\1\110\1\uffff\1\106\5\uffff\1\43",
			"\1\107\6\uffff\1\110\3\uffff\1\111\3\uffff\1\43",
			"\1\112",
			"\1\117\6\uffff\1\114\4\uffff\1\115\1\uffff\1\116\10\uffff\1\113",
			"\2\51\1\uffff\1\122\2\uffff\1\120\10\uffff\1\121",
			"",
			"\1\124\2\uffff\1\52\10\uffff\1\123",
			"",
			"",
			"",
			"\1\133\1\126\2\132\1\uffff\1\132\1\127\1\uffff\1\131\1\130\7\uffff\1"+
			"\125",
			"\1\134",
			"\1\25\3\uffff\1\27\1\25\1\uffff\1\25",
			"",
			"",
			"\1\135",
			"",
			"",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\72\4\uffff\1\73\6\uffff\1\74\3\uffff\1\141",
			"\1\144\10\uffff\1\142\2\uffff\1\143",
			"\1\144\13\uffff\1\143",
			"",
			"\1\72\4\uffff\1\73\6\uffff\1\74",
			"\1\146\2\151\1\uffff\1\151\1\147\2\uffff\1\150\7\uffff\1\145",
			"\1\152",
			"\1\156\1\154\4\uffff\1\155\2\uffff\1\157\7\uffff\1\153",
			"\1\160",
			"\1\161\7\uffff\1\162\7\uffff\1\163",
			"\1\166\1\165\26\uffff\1\164",
			"\1\173\2\uffff\1\172\1\170\2\173\1\uffff\1\173\1\171\2\uffff\1\174\7"+
			"\uffff\1\167",
			"\1\175",
			"\1\117\6\uffff\1\114\3\uffff\1\176\1\115\1\uffff\1\116",
			"",
			"",
			"\1\107\6\uffff\1\110\7\uffff\1\43",
			"\1\107\6\uffff\1\110\7\uffff\1\43",
			"\1\117\6\uffff\1\114\4\uffff\1\115\1\uffff\1\116\10\uffff\1\177",
			"\1\u0081\13\uffff\1\u0080",
			"\1\u0081\13\uffff\1\u0080",
			"",
			"",
			"",
			"",
			"\1\u0082\5\uffff\1\51",
			"\1\u0084\2\u0087\1\uffff\1\u0087\1\u0085\2\uffff\1\u0086\7\uffff\1\u0083",
			"\1\u0088",
			"\1\133\1\126\2\132\1\uffff\1\132\1\127\1\uffff\1\131\1\130\7\uffff\1"+
			"\u0089",
			"\1\u008b\13\uffff\1\u008a",
			"\1\u008b\13\uffff\1\u008a",
			"",
			"",
			"",
			"",
			"\1\133\1\126\2\132\1\uffff\1\132\1\127\1\uffff\1\131\1\130",
			"\1\u008c\3\uffff\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"\1\72\4\uffff\1\73\6\uffff\1\74\3\uffff\1\u0091",
			"",
			"\1\72\4\uffff\1\73\6\uffff\1\74\3\uffff\1\u0092",
			"\1\u0093",
			"\1\146\2\151\1\uffff\1\151\1\147\2\uffff\1\150\7\uffff\1\u0094",
			"\1\u0096\13\uffff\1\u0095",
			"\1\u0096\13\uffff\1\u0095",
			"",
			"",
			"\1\146\2\151\1\uffff\1\151\1\147\2\uffff\1\150",
			"\1\156\1\154\4\uffff\1\155\2\uffff\1\157\7\uffff\1\u0097",
			"\1\u0099\13\uffff\1\u0098",
			"\1\u0099\13\uffff\1\u0098",
			"",
			"",
			"\1\156\1\154\4\uffff\1\155\2\uffff\1\157",
			"\1\u009a",
			"",
			"",
			"\1\u009b",
			"\1\u009c",
			"\1\u009d",
			"\1\173\2\uffff\1\172\1\170\2\173\1\uffff\1\173\1\171\2\uffff\1\174\7"+
			"\uffff\1\u009e",
			"\1\u00a0\13\uffff\1\u009f",
			"\1\u00a0\13\uffff\1\u009f",
			"",
			"",
			"",
			"\1\173\2\uffff\1\172\1\170\2\173\1\uffff\1\173\1\171\2\uffff\1\174",
			"\1\107\6\uffff\1\110\7\uffff\1\43",
			"\1\117\6\uffff\1\114\4\uffff\1\115\1\uffff\1\116\10\uffff\1\u00a1",
			"\1\117\6\uffff\1\114\4\uffff\1\115\1\uffff\1\116\10\uffff\1\u00a2",
			"\1\u00a3",
			"\1\121\3\uffff\1\51\1\121\2\uffff\1\121",
			"\1\u0084\2\u0087\1\uffff\1\u0087\1\u0085\2\uffff\1\u0086\7\uffff\1\u00a4",
			"\1\u00a6\13\uffff\1\u00a5",
			"\1\u00a6\13\uffff\1\u00a5",
			"",
			"",
			"\1\u0084\2\u0087\1\uffff\1\u0087\1\u0085\2\uffff\1\u0086",
			"\1\133\1\126\2\132\1\uffff\1\132\1\127\1\uffff\1\131\1\130\7\uffff\1"+
			"\u00a7",
			"\1\133\1\126\2\132\1\uffff\1\132\1\127\1\uffff\1\131\1\130\7\uffff\1"+
			"\u00a8",
			"\1\u00a9",
			"\1\u008d",
			"\1\u00aa",
			"\1\u00ab",
			"\1\u00ac",
			"\1\u00ad",
			"\1\72\4\uffff\1\73\6\uffff\1\74",
			"\1\72\4\uffff\1\73\6\uffff\1\74\3\uffff\1\u00ae",
			"\1\72\4\uffff\1\73\6\uffff\1\74",
			"\1\146\2\151\1\uffff\1\151\1\147\2\uffff\1\150\7\uffff\1\u00af",
			"\1\146\2\151\1\uffff\1\151\1\147\2\uffff\1\150\7\uffff\1\u00b0",
			"\1\u00b1",
			"\1\156\1\154\4\uffff\1\155\2\uffff\1\157\7\uffff\1\u00b2",
			"\1\156\1\154\4\uffff\1\155\2\uffff\1\157\7\uffff\1\u00b3",
			"\1\u00b4",
			"\1\u00b5\3\uffff\1\u00b6",
			"\1\u00b7",
			"\1\u00b8",
			"\1\u00b9",
			"\1\173\2\uffff\1\172\1\170\2\173\1\uffff\1\173\1\171\2\uffff\1\174\7"+
			"\uffff\1\u00ba",
			"\1\173\2\uffff\1\172\1\170\2\173\1\uffff\1\173\1\171\2\uffff\1\174\7"+
			"\uffff\1\u00bb",
			"\1\u00bc",
			"\1\117\6\uffff\1\114\4\uffff\1\115\1\uffff\1\116",
			"\1\117\6\uffff\1\114\4\uffff\1\115\1\uffff\1\116\10\uffff\1\u00bd",
			"\1\117\6\uffff\1\114\4\uffff\1\115\1\uffff\1\116",
			"\1\u0084\2\u0087\1\uffff\1\u0087\1\u0085\2\uffff\1\u0086\7\uffff\1\u00be",
			"\1\u0084\2\u0087\1\uffff\1\u0087\1\u0085\2\uffff\1\u0086\7\uffff\1\u00bf",
			"\1\u00c0",
			"\1\133\1\126\2\132\1\uffff\1\132\1\127\1\uffff\1\131\1\130",
			"\1\133\1\126\2\132\1\uffff\1\132\1\127\1\uffff\1\131\1\130\7\uffff\1"+
			"\u00c1",
			"\1\133\1\126\2\132\1\uffff\1\132\1\127\1\uffff\1\131\1\130",
			"\1\65\1\64",
			"\1\u00c2",
			"\1\u00c3",
			"\1\65\1\64",
			"\1\72\4\uffff\1\73\6\uffff\1\74\3\uffff\1\u00c4",
			"\1\146\2\151\1\uffff\1\151\1\147\2\uffff\1\150",
			"\1\146\2\151\1\uffff\1\151\1\147\2\uffff\1\150\7\uffff\1\u00c5",
			"\1\146\2\151\1\uffff\1\151\1\147\2\uffff\1\150",
			"\1\156\1\154\4\uffff\1\155\2\uffff\1\157",
			"\1\156\1\154\4\uffff\1\155\2\uffff\1\157\7\uffff\1\u00c6",
			"\1\156\1\154\4\uffff\1\155\2\uffff\1\157",
			"\1\u00b6",
			"\1\u00c7",
			"\1\u00c8",
			"\1\u00c9",
			"\1\u00ca",
			"\1\173\2\uffff\1\172\1\170\2\173\1\uffff\1\173\1\171\2\uffff\1\174",
			"\1\173\2\uffff\1\172\1\170\2\173\1\uffff\1\173\1\171\2\uffff\1\174\7"+
			"\uffff\1\u00cb",
			"\1\173\2\uffff\1\172\1\170\2\173\1\uffff\1\173\1\171\2\uffff\1\174",
			"\1\117\6\uffff\1\114\4\uffff\1\115\1\uffff\1\116\10\uffff\1\u00cc",
			"\1\u0084\2\u0087\1\uffff\1\u0087\1\u0085\2\uffff\1\u0086",
			"\1\u0084\2\u0087\1\uffff\1\u0087\1\u0085\2\uffff\1\u0086\7\uffff\1\u00cd",
			"\1\u0084\2\u0087\1\uffff\1\u0087\1\u0085\2\uffff\1\u0086",
			"\1\133\1\126\2\132\1\uffff\1\132\1\127\1\uffff\1\131\1\130\7\uffff\1"+
			"\u00ce",
			"\1\65\1\64",
			"\1\u00cf",
			"\1\72\4\uffff\1\73\6\uffff\1\74",
			"\1\146\2\151\1\uffff\1\151\1\147\2\uffff\1\150\7\uffff\1\u00d0",
			"\1\156\1\154\4\uffff\1\155\2\uffff\1\157\7\uffff\1\u00d1",
			"\1\162\7\uffff\1\163",
			"\1\u00d2",
			"\1\u00d3",
			"\1\162\7\uffff\1\163",
			"\1\173\2\uffff\1\172\1\170\2\173\1\uffff\1\173\1\171\2\uffff\1\174\7"+
			"\uffff\1\u00d4",
			"\1\117\6\uffff\1\114\4\uffff\1\115\1\uffff\1\116",
			"\1\u0084\2\u0087\1\uffff\1\u0087\1\u0085\2\uffff\1\u0086\7\uffff\1\u00d5",
			"\1\133\1\126\2\132\1\uffff\1\132\1\127\1\uffff\1\131\1\130",
			"\1\65\1\64",
			"\1\146\2\151\1\uffff\1\151\1\147\2\uffff\1\150",
			"\1\156\1\154\4\uffff\1\155\2\uffff\1\157",
			"\1\162\7\uffff\1\163",
			"\1\u00d6",
			"\1\173\2\uffff\1\172\1\170\2\173\1\uffff\1\173\1\171\2\uffff\1\174",
			"\1\u0084\2\u0087\1\uffff\1\u0087\1\u0085\2\uffff\1\u0086",
			"\1\162\7\uffff\1\163"
	};

	static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
	static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
	static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
	static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
	static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
	static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
	static final short[][] DFA33_transition;

	static {
		int numStates = DFA33_transitionS.length;
		DFA33_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
		}
	}

	protected class DFA33 extends DFA {

		public DFA33(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 33;
			this.eot = DFA33_eot;
			this.eof = DFA33_eof;
			this.min = DFA33_min;
			this.max = DFA33_max;
			this.accept = DFA33_accept;
			this.special = DFA33_special;
			this.transition = DFA33_transition;
		}
		@Override
		public String getDescription() {
			return "36:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( ARTICLE d= dat ( PARLER )+ ps= params | ARTICLE ( PARLER )+ ps= params | COMBIEN ARTICLE ( PARLER )+ ps= params | COMBIEN ARTICLE ps1= params ( PARLER )+ ps2= params | COMBIEN ARTICLE ( PARLER )+ ps1= params PARLER ps2= params | COMBIEN ARTICLE ( PARLER )+ ps= params d= dat | COMBIEN ARTICLE d= dat | COMBIEN AUTEUR ARTICLE ENTRE d1= dat ET d2= dat | COMBIEN AUTEUR ( ARTICLE )? d= dat | COMBIEN AUTEUR ARTICLE ( PARLER )+ ps= params | COMBIEN AUTEUR e= email | COMBIEN AUTEUR e= email ( PARLER )+ ps= params | COMBIEN JOURS ( PARLER )+ ps= params | COMBIEN MOT ps= params ET SELECT ARTICLE | COMBIEN MOT ps= params r= RUBRIQUE | COMBIEN PAGE ( PARLER )+ ps= params | COMBIEN PAGE ( PARLER )+ ps= params d= dat | COMBIEN r= RUBRIQUE ( PARLER )+ ps= params ENTRE d1= dat ET d2= dat | COMBIEN r= RUBRIQUE ( PARLER )+ ps= params | COMBIEN ARTICLE ( PARLER )+ ps= params ENTRE d1= datinf ET d2= datsup | COMBIEN r= RUBRIQUE ps= params | EMAIL AUTEUR ps= params | SELECT ARTICLE ( PARLER )+ ps= params ENTRE d1= datinf ET d2= datsup | SELECT ARTICLE ( PARLER )+ ps= params ( DATE )? d= dat | SELECT ARTICLE ( DATE )? d= dat | SELECT ARTICLE ps1= params ( PARLER )+ ps2= params | SELECT ARTICLE ( PARLER )+ ps= params | SELECT ARTICLE d= dat AUTEUR e= email | SELECT ARTICLE AUTEUR e= email ET ( PARLER )+ r= RUBRIQUE | SELECT ARTICLE AUTEUR e= email | SELECT ARTICLE ps1= params AUTEUR ps2= params | SELECT ARTICLE d= dat ET ( PARLER )+ ps= params | SELECT AUTEUR ( ARTICLE )? d= dat | SELECT AUTEUR ARTICLE ( PARLER )+ ps= params | SELECT AUTEUR ARTICLE ps= params | SELECT COMBIEN r= RUBRIQUE ( PARLER )+ ps= params | SELECT r= RUBRIQUE ( PARLER )+ ps= params | SELECT r= RUBRIQUE d= dat | SELECT r= RUBRIQUE ( PARLER )+ ps= params d= dat | SELECT DATE ( ARTICLE )? ( PARLER )+ ps= params | SELECT EMAIL AUTEUR ps= params | SELECT PAGE ARTICLE ( AUTEUR )* e= email | SELECT PAGE ( PARLER )+ ps= params );";
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
	public static final BitSet FOLLOW_COMBIEN_in_requete437 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete439 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete445 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete447 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete468 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete470 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete472 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete479 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete481 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete510 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete512 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete514 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete521 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete538 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete540 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete562 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete564 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete566 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ENTRE_in_requete568 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete574 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ET_in_requete576 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete596 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete598 = new BitSet(new long[]{0x000000000002C010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete600 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete621 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete623 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete626 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete628 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete644 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete646 = new BitSet(new long[]{0x0000000020000800L});
	public static final BitSet FOLLOW_email_in_requete652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete666 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete668 = new BitSet(new long[]{0x0000000020000800L});
	public static final BitSet FOLLOW_email_in_requete674 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete676 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete697 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_JOURS_in_requete699 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete701 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete724 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_MOT_in_requete726 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete732 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ET_in_requete734 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_SELECT_in_requete736 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete752 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_MOT_in_requete754 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete760 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete777 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_PAGE_in_requete779 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete781 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete802 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_PAGE_in_requete804 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete806 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete813 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete835 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete841 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete843 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete850 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ENTRE_in_requete852 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete858 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ET_in_requete860 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete896 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete902 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete904 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete925 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete927 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete929 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete937 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ENTRE_in_requete939 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_datinf_in_requete945 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ET_in_requete947 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_datsup_in_requete953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete965 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete971 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EMAIL_in_requete993 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete995 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1001 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1020 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1022 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1024 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete1032 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ENTRE_in_requete1034 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_datinf_in_requete1040 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ET_in_requete1042 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_datsup_in_requete1048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1064 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1066 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1068 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete1075 = new BitSet(new long[]{0x000000000002C200L});
	public static final BitSet FOLLOW_DATE_in_requete1077 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete1084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1094 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1096 = new BitSet(new long[]{0x000000000002C200L});
	public static final BitSet FOLLOW_DATE_in_requete1098 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete1105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1118 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1120 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1126 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1128 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete1135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1158 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1160 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1162 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete1169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1181 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1183 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete1189 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1191 = new BitSet(new long[]{0x0000000020000800L});
	public static final BitSet FOLLOW_email_in_requete1197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1206 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1208 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1210 = new BitSet(new long[]{0x0000000020000800L});
	public static final BitSet FOLLOW_email_in_requete1216 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ET_in_requete1218 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1220 = new BitSet(new long[]{0x0000000002100000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete1227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1236 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1238 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1240 = new BitSet(new long[]{0x0000000020000800L});
	public static final BitSet FOLLOW_email_in_requete1246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1255 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1257 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1263 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1265 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1282 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1284 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete1290 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ET_in_requete1292 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1294 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete1301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1315 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1317 = new BitSet(new long[]{0x000000000002C010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1319 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete1326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1337 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1339 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1341 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1343 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete1350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1359 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1361 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1363 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1384 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COMBIEN_in_requete1386 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete1392 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1394 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete1401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1417 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete1423 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1425 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete1432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1443 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete1449 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete1456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1466 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete1472 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1474 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete1481 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete1488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1500 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_DATE_in_requete1502 = new BitSet(new long[]{0x0000000000100010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1504 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1507 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete1512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1526 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_EMAIL_in_requete1528 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1530 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1550 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_PAGE_in_requete1552 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1554 = new BitSet(new long[]{0x0000000020000840L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1556 = new BitSet(new long[]{0x0000000020000840L});
	public static final BitSet FOLLOW_email_in_requete1563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1574 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_PAGE_in_requete1576 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1578 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_params_in_requete1585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ET_in_conj1601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OU_in_conj1608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NBR_in_dat1627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOIS_in_dat1638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOIS_in_dat1649 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NBR_in_dat1655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOURS_in_dat1666 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOIS_in_dat1672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NBR_in_dat1683 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOIS_in_dat1689 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NBR_in_dat1695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NBR_in_datinf1715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NBR_in_datsup1734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_email1753 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AT_in_email1759 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1765 = new BitSet(new long[]{0x0000000000220000L});
	public static final BitSet FOLLOW_NBR_in_email1771 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_POINT_in_email1778 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EMAIL_in_email1792 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1798 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AT_in_email1804 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1810 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_POINT_in_email1816 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EMAIL_in_email1829 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_email1831 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1837 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AT_in_email1843 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1849 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_POINT_in_email1855 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EMAIL_in_email1868 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AT_in_email1874 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1880 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_POINT_in_email1886 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_email1903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_requete_in_listerequetes1931 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_POINT_in_listerequetes1933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_param1952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NBR_in_param1963 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOIS_in_param1969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_param1981 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_param1987 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_param1998 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_param2004 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_param2010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_param2021 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_param2027 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_param2033 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_param2039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_params2064 = new BitSet(new long[]{0x0000000000042002L});
	public static final BitSet FOLLOW_conj_in_params2075 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_param_in_params2081 = new BitSet(new long[]{0x0000000000042002L});
}

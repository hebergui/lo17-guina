// $ANTLR 3.5.1 C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g 2014-06-09 17:00:08
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
	@Override public String getGrammarFileName() { return "C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g"; }



	// $ANTLR start "requete"
	// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:36:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( ARTICLE d= dat PARLER ps= params | ARTICLE PARLER ps= params | COMBIEN ARTICLE PARLER ps= params | COMBIEN ARTICLE ps1= params PARLER ps2= params | COMBIEN ARTICLE PARLER ps1= params PARLER ps2= params | COMBIEN ARTICLE ps= params | COMBIEN ARTICLE PARLER ps= params d= dat | COMBIEN AUTEUR ARTICLE ENTRE d1= dat ET d2= dat | COMBIEN AUTEUR d= dat | COMBIEN AUTEUR ARTICLE PARLER ps= params | COMBIEN AUTEUR e= email | COMBIEN AUTEUR e= email PARLER ps= params | COMBIEN JOURS PARLER ps= params | COMBIEN MOT ps= params ET SELECT ARTICLE | COMBIEN MOT ps= params r= RUBRIQUE | COMBIEN PAGE PARLER ps= params | COMBIEN PAGE PARLER ps= params d= dat | COMBIEN r= RUBRIQUE PARLER ps= params ENTRE d1= dat ET d2= dat | COMBIEN r= RUBRIQUE PARLER ps= params | COMBIEN r= RUBRIQUE ENTRE d1= dat ET d2= dat PARLER ps= params | COMBIEN r= RUBRIQUE ps= params | EMAIL AUTEUR ps= params | SELECT ARTICLE PARLER ps= params ENTRE d1= dat ET d2= dat | SELECT ARTICLE ps1= params PARLER ps2= params | SELECT ARTICLE ( PARLER )? ps= params | SELECT ARTICLE PARLER ps= params DATE d= dat | SELECT ARTICLE d= dat AUTEUR e= email | SELECT ARTICLE AUTEUR e= email ET PARLER r= RUBRIQUE | SELECT ARTICLE AUTEUR ps= params | SELECT ARTICLE AUTEUR e= email | SELECT ARTICLE ps1= params AUTEUR ps2= params | SELECT ARTICLE d= dat ET PARLER ps= params | SELECT AUTEUR ARTICLE PARLER ps= params | SELECT AUTEUR ARTICLE ps= params | SELECT COMBIEN r= RUBRIQUE PARLER ps= params | SELECT DATE ( ARTICLE )? PARLER ps= params | SELECT EMAIL AUTEUR ps= params | SELECT PAGE ARTICLE ( AUTEUR )* e= email | SELECT PAGE PARLER ps= params );
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
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:37:44: ( ARTICLE d= dat PARLER ps= params | ARTICLE PARLER ps= params | COMBIEN ARTICLE PARLER ps= params | COMBIEN ARTICLE ps1= params PARLER ps2= params | COMBIEN ARTICLE PARLER ps1= params PARLER ps2= params | COMBIEN ARTICLE ps= params | COMBIEN ARTICLE PARLER ps= params d= dat | COMBIEN AUTEUR ARTICLE ENTRE d1= dat ET d2= dat | COMBIEN AUTEUR d= dat | COMBIEN AUTEUR ARTICLE PARLER ps= params | COMBIEN AUTEUR e= email | COMBIEN AUTEUR e= email PARLER ps= params | COMBIEN JOURS PARLER ps= params | COMBIEN MOT ps= params ET SELECT ARTICLE | COMBIEN MOT ps= params r= RUBRIQUE | COMBIEN PAGE PARLER ps= params | COMBIEN PAGE PARLER ps= params d= dat | COMBIEN r= RUBRIQUE PARLER ps= params ENTRE d1= dat ET d2= dat | COMBIEN r= RUBRIQUE PARLER ps= params | COMBIEN r= RUBRIQUE ENTRE d1= dat ET d2= dat PARLER ps= params | COMBIEN r= RUBRIQUE ps= params | EMAIL AUTEUR ps= params | SELECT ARTICLE PARLER ps= params ENTRE d1= dat ET d2= dat | SELECT ARTICLE ps1= params PARLER ps2= params | SELECT ARTICLE ( PARLER )? ps= params | SELECT ARTICLE PARLER ps= params DATE d= dat | SELECT ARTICLE d= dat AUTEUR e= email | SELECT ARTICLE AUTEUR e= email ET PARLER r= RUBRIQUE | SELECT ARTICLE AUTEUR ps= params | SELECT ARTICLE AUTEUR e= email | SELECT ARTICLE ps1= params AUTEUR ps2= params | SELECT ARTICLE d= dat ET PARLER ps= params | SELECT AUTEUR ARTICLE PARLER ps= params | SELECT AUTEUR ARTICLE ps= params | SELECT COMBIEN r= RUBRIQUE PARLER ps= params | SELECT DATE ( ARTICLE )? PARLER ps= params | SELECT EMAIL AUTEUR ps= params | SELECT PAGE ARTICLE ( AUTEUR )* e= email | SELECT PAGE PARLER ps= params )
			int alt4=39;
			alt4 = dfa4.predict(input);
			switch (alt4) {
				case 1 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:43:4: ARTICLE d= dat PARLER ps= params
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete332); 
					pushFollow(FOLLOW_dat_in_requete338);
					d=dat();
					state._fsp--;

					match(input,PARLER,FOLLOW_PARLER_in_requete340); 
					pushFollow(FOLLOW_params_in_requete344);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct"));
								req_arbre.ajouteFils(new Arbre("", "m.article "));
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:56:5: ARTICLE PARLER ps= params
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete355); 
					match(input,PARLER,FOLLOW_PARLER_in_requete357); 
					pushFollow(FOLLOW_params_in_requete361);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct m.article ) "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m"));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 3 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:78:5: COMBIEN ARTICLE PARLER ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete407); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete409); 
					match(input,PARLER,FOLLOW_PARLER_in_requete411); 
					pushFollow(FOLLOW_params_in_requete417);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct count(m.article) "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 4 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:87:5: COMBIEN ARTICLE ps1= params PARLER ps2= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete431); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete433); 
					pushFollow(FOLLOW_params_in_requete439);
					ps1=params();
					state._fsp--;

					match(input,PARLER,FOLLOW_PARLER_in_requete441); 
					pushFollow(FOLLOW_params_in_requete447);
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
				case 5 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:99:5: COMBIEN ARTICLE PARLER ps1= params PARLER ps2= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete461); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete463); 
					match(input,PARLER,FOLLOW_PARLER_in_requete465); 
					pushFollow(FOLLOW_params_in_requete471);
					ps1=params();
					state._fsp--;

					match(input,PARLER,FOLLOW_PARLER_in_requete473); 
					pushFollow(FOLLOW_params_in_requete479);
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:111:5: COMBIEN ARTICLE ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete493); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete495); 
					pushFollow(FOLLOW_params_in_requete501);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct count(m.article) "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 7 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:121:5: COMBIEN ARTICLE PARLER ps= params d= dat
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete518); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete520); 
					match(input,PARLER,FOLLOW_PARLER_in_requete522); 
					pushFollow(FOLLOW_params_in_requete528);
					ps=params();
					state._fsp--;

					pushFollow(FOLLOW_dat_in_requete534);
					d=dat();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct count(m.article) "));
								req_arbre.ajouteFils(new Arbre("", "from titrearticle m, datearticle d "));
								req_arbre.ajouteFils(new Arbre("", "where m.article = d.article "));
								req_arbre.ajouteFils(new Arbre("", " AND "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
								req_arbre.ajouteFils(new Arbre("", " AND "));
								d_arbre = d;
								req_arbre.ajouteFils(d_arbre);
							
					}
					break;
				case 8 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:135:5: COMBIEN AUTEUR ARTICLE ENTRE d1= dat ET d2= dat
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete550); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete552); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete554); 
					match(input,ENTRE,FOLLOW_ENTRE_in_requete556); 
					pushFollow(FOLLOW_dat_in_requete562);
					d1=dat();
					state._fsp--;

					match(input,ET,FOLLOW_ET_in_requete564); 
					pushFollow(FOLLOW_dat_in_requete570);
					d2=dat();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct count(e.email)"));
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:148:5: COMBIEN AUTEUR d= dat
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete584); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete586); 
					pushFollow(FOLLOW_dat_in_requete593);
					d=dat();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct count(e.email) "));
								req_arbre.ajouteFils(new Arbre("", "from datearticle d, email e"));
								req_arbre.ajouteFils(new Arbre("", "where d.article = e.article"));
								req_arbre.ajouteFils(new Arbre("", " AND "));
								d_arbre = d;
								req_arbre.ajouteFils(d_arbre);
							
					}
					break;
				case 10 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:158:5: COMBIEN AUTEUR ARTICLE PARLER ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete607); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete609); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete612); 
					match(input,PARLER,FOLLOW_PARLER_in_requete614); 
					pushFollow(FOLLOW_params_in_requete620);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct count(e.email) "));
								req_arbre.ajouteFils(new Arbre("", "from datearticle d, email e, titreresume m"));
								req_arbre.ajouteFils(new Arbre("", "where d.article = e.article AND e.article = m.article "));
								req_arbre.ajouteFils(new Arbre("", " AND "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 11 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:167:5: COMBIEN AUTEUR e= email
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete629); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete631); 
					pushFollow(FOLLOW_email_in_requete637);
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:176:5: COMBIEN AUTEUR e= email PARLER ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete651); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete653); 
					pushFollow(FOLLOW_email_in_requete659);
					e=email();
					state._fsp--;

					match(input,PARLER,FOLLOW_PARLER_in_requete661); 
					pushFollow(FOLLOW_params_in_requete667);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct count(e.email) "));
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:190:5: COMBIEN JOURS PARLER ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete681); 
					match(input,JOURS,FOLLOW_JOURS_in_requete683); 
					match(input,PARLER,FOLLOW_PARLER_in_requete685); 
					pushFollow(FOLLOW_params_in_requete691);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct count(datearticle.jj) "));
								req_arbre.ajouteFils(new Arbre("", "from datearticle, titreresume "));
								req_arbre.ajouteFils(new Arbre("", "where datearticle.article = titreresume.article "));
								req_arbre.ajouteFils(new Arbre("", " AND "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 14 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:201:5: COMBIEN MOT ps= params ET SELECT ARTICLE
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete707); 
					match(input,MOT,FOLLOW_MOT_in_requete709); 
					pushFollow(FOLLOW_params_in_requete715);
					ps=params();
					state._fsp--;

					match(input,ET,FOLLOW_ET_in_requete717); 
					match(input,SELECT,FOLLOW_SELECT_in_requete719); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete721); 

								req_arbre.ajouteFils(new Arbre("", "select count(m.mot), m.article"));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 15 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:210:5: COMBIEN MOT ps= params r= RUBRIQUE
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete735); 
					match(input,MOT,FOLLOW_MOT_in_requete737); 
					pushFollow(FOLLOW_params_in_requete743);
					ps=params();
					state._fsp--;

					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete749); 

								req_arbre.ajouteFils(new Arbre("", "select count(m.mot) "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
								req_arbre.ajouteFils(new Arbre("", "where m.rubrique = '" + r.getText() + "' "));
								req_arbre.ajouteFils(new Arbre("", " AND "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 16 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:220:5: COMBIEN PAGE PARLER ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete760); 
					match(input,PAGE,FOLLOW_PAGE_in_requete762); 
					match(input,PARLER,FOLLOW_PARLER_in_requete764); 
					pushFollow(FOLLOW_params_in_requete770);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct count(m.page) "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 17 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:229:5: COMBIEN PAGE PARLER ps= params d= dat
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete784); 
					match(input,PAGE,FOLLOW_PAGE_in_requete786); 
					match(input,PARLER,FOLLOW_PARLER_in_requete788); 
					pushFollow(FOLLOW_params_in_requete794);
					ps=params();
					state._fsp--;

					pushFollow(FOLLOW_dat_in_requete800);
					d=dat();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct count(m.page) "));
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:243:5: COMBIEN r= RUBRIQUE PARLER ps= params ENTRE d1= dat ET d2= dat
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete816); 
					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete822); 
					match(input,PARLER,FOLLOW_PARLER_in_requete824); 
					pushFollow(FOLLOW_params_in_requete830);
					ps=params();
					state._fsp--;

					match(input,ENTRE,FOLLOW_ENTRE_in_requete832); 
					pushFollow(FOLLOW_dat_in_requete838);
					d1=dat();
					state._fsp--;

					match(input,ET,FOLLOW_ET_in_requete840); 
					pushFollow(FOLLOW_dat_in_requete846);
					d2=dat();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct count(m.rubrique) "));
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:266:5: COMBIEN r= RUBRIQUE PARLER ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete876); 
					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete882); 
					match(input,PARLER,FOLLOW_PARLER_in_requete884); 
					pushFollow(FOLLOW_params_in_requete890);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct count(m.rubrique) "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
								req_arbre.ajouteFils(new Arbre("", "where m.rubrique = '" + r.getText() + "' "));
								req_arbre.ajouteFils(new Arbre("", " AND "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 20 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:276:5: COMBIEN r= RUBRIQUE ENTRE d1= dat ET d2= dat PARLER ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete904); 
					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete910); 
					match(input,ENTRE,FOLLOW_ENTRE_in_requete912); 
					pushFollow(FOLLOW_dat_in_requete918);
					d1=dat();
					state._fsp--;

					match(input,ET,FOLLOW_ET_in_requete920); 
					pushFollow(FOLLOW_dat_in_requete926);
					d2=dat();
					state._fsp--;

					match(input,PARLER,FOLLOW_PARLER_in_requete928); 
					pushFollow(FOLLOW_params_in_requete935);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct count(m.rubrique) "));
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:292:5: COMBIEN r= RUBRIQUE ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete946); 
					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete952); 
					pushFollow(FOLLOW_params_in_requete958);
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:304:5: EMAIL AUTEUR ps= params
					{
					match(input,EMAIL,FOLLOW_EMAIL_in_requete974); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete976); 
					pushFollow(FOLLOW_params_in_requete982);
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:317:5: SELECT ARTICLE PARLER ps= params ENTRE d1= dat ET d2= dat
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1001); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1003); 
					match(input,PARLER,FOLLOW_PARLER_in_requete1005); 
					pushFollow(FOLLOW_params_in_requete1012);
					ps=params();
					state._fsp--;

					match(input,ENTRE,FOLLOW_ENTRE_in_requete1014); 
					pushFollow(FOLLOW_dat_in_requete1020);
					d1=dat();
					state._fsp--;

					match(input,ET,FOLLOW_ET_in_requete1022); 
					pushFollow(FOLLOW_dat_in_requete1028);
					d2=dat();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(m.rubrique) "));
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:333:5: SELECT ARTICLE ps1= params PARLER ps2= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1042); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1044); 
					pushFollow(FOLLOW_params_in_requete1050);
					ps1=params();
					state._fsp--;

					match(input,PARLER,FOLLOW_PARLER_in_requete1052); 
					pushFollow(FOLLOW_params_in_requete1058);
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
				case 25 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:347:5: SELECT ARTICLE ( PARLER )? ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1076); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1078); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:347:20: ( PARLER )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==PARLER) ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:347:20: PARLER
							{
							match(input,PARLER,FOLLOW_PARLER_in_requete1080); 
							}
							break;

					}

					pushFollow(FOLLOW_params_in_requete1087);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct m.article "));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 26 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:355:5: SELECT ARTICLE PARLER ps= params DATE d= dat
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1098); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1100); 
					match(input,PARLER,FOLLOW_PARLER_in_requete1102); 
					pushFollow(FOLLOW_params_in_requete1108);
					ps=params();
					state._fsp--;

					match(input,DATE,FOLLOW_DATE_in_requete1110); 
					pushFollow(FOLLOW_dat_in_requete1116);
					d=dat();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct m.article "));
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
				case 27 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:368:5: SELECT ARTICLE d= dat AUTEUR e= email
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1127); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1129); 
					pushFollow(FOLLOW_dat_in_requete1135);
					d=dat();
					state._fsp--;

					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1137); 
					pushFollow(FOLLOW_email_in_requete1143);
					e=email();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct m.article "));
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
				case 28 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:380:5: SELECT ARTICLE AUTEUR e= email ET PARLER r= RUBRIQUE
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1152); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1154); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1156); 
					pushFollow(FOLLOW_email_in_requete1162);
					e=email();
					state._fsp--;

					match(input,ET,FOLLOW_ET_in_requete1164); 
					match(input,PARLER,FOLLOW_PARLER_in_requete1166); 
					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete1172); 

								req_arbre.ajouteFils(new Arbre("", "select distinct m.article"));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m, email e "));
								req_arbre.ajouteFils(new Arbre("", "where m.article = e.article "));
								req_arbre.ajouteFils(new Arbre("", "AND "));
								ps_arbre = e;
								req_arbre.ajouteFils(ps_arbre);
								req_arbre.ajouteFils(new Arbre("", "AND m.rubrique = '" + r.getText() + "' "));
							
					}
					break;
				case 29 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:390:5: SELECT ARTICLE AUTEUR ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1181); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1183); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1185); 
					pushFollow(FOLLOW_params_in_requete1191);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct m.article"));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 30 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:398:5: SELECT ARTICLE AUTEUR e= email
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1200); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1202); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1204); 
					pushFollow(FOLLOW_email_in_requete1210);
					e=email();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct m.article"));
								req_arbre.ajouteFils(new Arbre("", "from titreresume m, email e "));
								req_arbre.ajouteFils(new Arbre("", "where m.article = e.article "));
								req_arbre.ajouteFils(new Arbre("", "AND "));
								ps_arbre = e;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 31 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:407:5: SELECT ARTICLE ps1= params AUTEUR ps2= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1219); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1221); 
					pushFollow(FOLLOW_params_in_requete1227);
					ps1=params();
					state._fsp--;

					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1229); 
					pushFollow(FOLLOW_params_in_requete1235);
					ps2=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct m.article "));
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:418:5: SELECT ARTICLE d= dat ET PARLER ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1246); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1248); 
					pushFollow(FOLLOW_dat_in_requete1254);
					d=dat();
					state._fsp--;

					match(input,ET,FOLLOW_ET_in_requete1256); 
					match(input,PARLER,FOLLOW_PARLER_in_requete1258); 
					pushFollow(FOLLOW_params_in_requete1264);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct m.artiçle "));
								req_arbre.ajouteFils(new Arbre("", "from titrearticle m, datearticle d"));
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
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:431:5: SELECT AUTEUR ARTICLE PARLER ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1275); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1277); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1279); 
					match(input,PARLER,FOLLOW_PARLER_in_requete1281); 
					pushFollow(FOLLOW_params_in_requete1287);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct m.email, m.article "));
								req_arbre.ajouteFils(new Arbre("", "from emailarticle m "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 34 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:439:5: SELECT AUTEUR ARTICLE ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1296); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1298); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1300); 
					pushFollow(FOLLOW_params_in_requete1306);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct m.email, m.article "));
								req_arbre.ajouteFils(new Arbre("", "from emailarticle m "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 35 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:448:5: SELECT COMBIEN r= RUBRIQUE PARLER ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1317); 
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete1319); 
					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete1325); 
					match(input,PARLER,FOLLOW_PARLER_in_requete1327); 
					pushFollow(FOLLOW_params_in_requete1333);
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
				case 36 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:460:5: SELECT DATE ( ARTICLE )? PARLER ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1347); 
					match(input,DATE,FOLLOW_DATE_in_requete1349); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:460:17: ( ARTICLE )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==ARTICLE) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:460:17: ARTICLE
							{
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1351); 
							}
							break;

					}

					match(input,PARLER,FOLLOW_PARLER_in_requete1354); 
					pushFollow(FOLLOW_params_in_requete1358);
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
				case 37 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:471:5: SELECT EMAIL AUTEUR ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1372); 
					match(input,EMAIL,FOLLOW_EMAIL_in_requete1374); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1376); 
					pushFollow(FOLLOW_params_in_requete1382);
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
				case 38 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:482:5: SELECT PAGE ARTICLE ( AUTEUR )* e= email
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1396); 
					match(input,PAGE,FOLLOW_PAGE_in_requete1398); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1400); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:482:25: ( AUTEUR )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==AUTEUR) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:482:25: AUTEUR
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1402); 
							}
							break;

						default :
							break loop3;
						}
					}

					pushFollow(FOLLOW_email_in_requete1409);
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
				case 39 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:491:5: SELECT PAGE PARLER ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1420); 
					match(input,PAGE,FOLLOW_PAGE_in_requete1422); 
					match(input,PARLER,FOLLOW_PARLER_in_requete1424); 
					pushFollow(FOLLOW_params_in_requete1430);
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
	// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:500:1: conj returns [Arbre conj_arbre = new Arbre(\"\")] : ( ET | OU );
	public final Arbre conj() throws RecognitionException {
		Arbre conj_arbre =  new Arbre("");


		try {
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:500:49: ( ET | OU )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ET) ) {
				alt5=1;
			}
			else if ( (LA5_0==OU) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:501:2: ET
					{
					match(input,ET,FOLLOW_ET_in_conj1446); 

							conj_arbre.ajouteFils(new Arbre("", "AND "));
						
					}
					break;
				case 2 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:504:4: OU
					{
					match(input,OU,FOLLOW_OU_in_conj1453); 

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
	// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:508:1: dat returns [Arbre les_pars_arbre = new Arbre(\"\")] : (a= NBR |m= MOIS |m= MOIS a= NBR |j= JOURS m= MOIS |j= NBR m= MOIS a= NBR );
	public final Arbre dat() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Token a=null;
		Token m=null;
		Token j=null;

		try {
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:508:52: (a= NBR |m= MOIS |m= MOIS a= NBR |j= JOURS m= MOIS |j= NBR m= MOIS a= NBR )
			int alt6=5;
			switch ( input.LA(1) ) {
			case NBR:
				{
				int LA6_1 = input.LA(2);
				if ( (LA6_1==MOIS) ) {
					alt6=5;
				}
				else if ( (LA6_1==AUTEUR||LA6_1==ET||(LA6_1 >= PARLER && LA6_1 <= POINT)) ) {
					alt6=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case MOIS:
				{
				int LA6_2 = input.LA(2);
				if ( (LA6_2==NBR) ) {
					alt6=3;
				}
				else if ( (LA6_2==AUTEUR||LA6_2==ET||(LA6_2 >= PARLER && LA6_2 <= POINT)) ) {
					alt6=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case JOURS:
				{
				alt6=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:509:2: a= NBR
					{
					a=(Token)match(input,NBR,FOLLOW_NBR_in_dat1472); 

							les_pars_arbre.ajouteFils(new Arbre("", "d.annee = '" + a.getText() + "' "));
						
					}
					break;
				case 2 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:512:4: m= MOIS
					{
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_dat1483); 

							les_pars_arbre.ajouteFils(new Arbre("", "d.mois = '" + m.getText() + "' "));
						
					}
					break;
				case 3 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:515:4: m= MOIS a= NBR
					{
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_dat1494); 
					a=(Token)match(input,NBR,FOLLOW_NBR_in_dat1500); 

							les_pars_arbre.ajouteFils(new Arbre("", "d.mois = '" + m.getText() + "' "));
							les_pars_arbre.ajouteFils(new Arbre("", "AND d.annee = '" + a.getText() + "' "));
						
					}
					break;
				case 4 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:519:4: j= JOURS m= MOIS
					{
					j=(Token)match(input,JOURS,FOLLOW_JOURS_in_dat1511); 
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_dat1517); 

							les_pars_arbre.ajouteFils(new Arbre("", "d.jour = '" + j.getText() + "' "));
							les_pars_arbre.ajouteFils(new Arbre("", "AND d.mois = '" + m.getText() + "' "));
							
					}
					break;
				case 5 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:523:4: j= NBR m= MOIS a= NBR
					{
					j=(Token)match(input,NBR,FOLLOW_NBR_in_dat1528); 
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_dat1534); 
					a=(Token)match(input,NBR,FOLLOW_NBR_in_dat1540); 

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
	// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:530:1: email returns [Arbre les_pars_arbre = new Arbre(\"\")] : (a1= VAR a= AT a2= VAR (n= NBR )? p= POINT a3= VAR | EMAIL a1= VAR a= AT a2= VAR p= POINT a3= VAR | EMAIL AUTEUR a1= VAR a= AT a2= VAR p= POINT a3= VAR | EMAIL a= AT a1= VAR p= POINT a2= VAR );
	public final Arbre email() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Token a1=null;
		Token a=null;
		Token a2=null;
		Token n=null;
		Token p=null;
		Token a3=null;

		try {
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:530:54: (a1= VAR a= AT a2= VAR (n= NBR )? p= POINT a3= VAR | EMAIL a1= VAR a= AT a2= VAR p= POINT a3= VAR | EMAIL AUTEUR a1= VAR a= AT a2= VAR p= POINT a3= VAR | EMAIL a= AT a1= VAR p= POINT a2= VAR )
			int alt8=4;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==VAR) ) {
				alt8=1;
			}
			else if ( (LA8_0==EMAIL) ) {
				switch ( input.LA(2) ) {
				case VAR:
					{
					alt8=2;
					}
					break;
				case AUTEUR:
					{
					alt8=3;
					}
					break;
				case AT:
					{
					alt8=4;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:531:2: a1= VAR a= AT a2= VAR (n= NBR )? p= POINT a3= VAR
					{
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_email1561); 
					a=(Token)match(input,AT,FOLLOW_AT_in_email1567); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_email1573); 
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:531:29: (n= NBR )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==NBR) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:531:29: n= NBR
							{
							n=(Token)match(input,NBR,FOLLOW_NBR_in_email1579); 
							}
							break;

					}

					p=(Token)match(input,POINT,FOLLOW_POINT_in_email1586); 
					a3=(Token)match(input,VAR,FOLLOW_VAR_in_email1592); 

							les_pars_arbre.ajouteFils(new Arbre("", "e.email = '" + a1.getText() + a.getText() + a2.getText() + n.getText() + p.getText() + a3.getText() + "' "));
						
					}
					break;
				case 2 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:535:4: EMAIL a1= VAR a= AT a2= VAR p= POINT a3= VAR
					{
					match(input,EMAIL,FOLLOW_EMAIL_in_email1600); 
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_email1606); 
					a=(Token)match(input,AT,FOLLOW_AT_in_email1612); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_email1618); 
					p=(Token)match(input,POINT,FOLLOW_POINT_in_email1624); 
					a3=(Token)match(input,VAR,FOLLOW_VAR_in_email1630); 

								les_pars_arbre.ajouteFils(new Arbre("", "e.email = '" + a1.getText() + a.getText() + a2.getText() + p.getText() + a3.getText() + "' "));
						
					}
					break;
				case 3 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:538:4: EMAIL AUTEUR a1= VAR a= AT a2= VAR p= POINT a3= VAR
					{
					match(input,EMAIL,FOLLOW_EMAIL_in_email1637); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_email1639); 
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_email1645); 
					a=(Token)match(input,AT,FOLLOW_AT_in_email1651); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_email1657); 
					p=(Token)match(input,POINT,FOLLOW_POINT_in_email1663); 
					a3=(Token)match(input,VAR,FOLLOW_VAR_in_email1669); 

							les_pars_arbre.ajouteFils(new Arbre("", "e.email = '" + a1.getText() + a.getText() + a2.getText() + p.getText() + a3.getText() + "' "));
						
					}
					break;
				case 4 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:541:4: EMAIL a= AT a1= VAR p= POINT a2= VAR
					{
					match(input,EMAIL,FOLLOW_EMAIL_in_email1676); 
					a=(Token)match(input,AT,FOLLOW_AT_in_email1682); 
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_email1688); 
					p=(Token)match(input,POINT,FOLLOW_POINT_in_email1694); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_email1700); 

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
	// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:545:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:546:26: (r= requete POINT )
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:547:3: r= requete POINT
			{
			pushFollow(FOLLOW_requete_in_listerequetes1726);
			r=requete();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_listerequetes1728); 

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
	// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:552:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : (a= VAR |a1= NBR a2= MOIS |a1= VAR a2= VAR |a1= VAR a2= VAR a3= VAR |a1= VAR a2= VAR a3= VAR a4= VAR );
	public final Arbre param() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;
		Token a1=null;
		Token a2=null;
		Token a3=null;
		Token a4=null;

		try {
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:552:51: (a= VAR |a1= NBR a2= MOIS |a1= VAR a2= VAR |a1= VAR a2= VAR a3= VAR |a1= VAR a2= VAR a3= VAR a4= VAR )
			int alt9=5;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==VAR) ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1==VAR) ) {
					int LA9_3 = input.LA(3);
					if ( (LA9_3==VAR) ) {
						int LA9_5 = input.LA(4);
						if ( (LA9_5==VAR) ) {
							alt9=5;
						}
						else if ( (LA9_5==AUTEUR||LA9_5==DATE||(LA9_5 >= ENTRE && LA9_5 <= MOIS)||(LA9_5 >= NBR && LA9_5 <= OU)||(LA9_5 >= PARLER && LA9_5 <= POINT)||LA9_5==RUBRIQUE) ) {
							alt9=4;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 9, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA9_3==AUTEUR||LA9_3==DATE||(LA9_3 >= ENTRE && LA9_3 <= MOIS)||(LA9_3 >= NBR && LA9_3 <= OU)||(LA9_3 >= PARLER && LA9_3 <= POINT)||LA9_3==RUBRIQUE) ) {
						alt9=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 9, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA9_1==AUTEUR||LA9_1==DATE||(LA9_1 >= ENTRE && LA9_1 <= MOIS)||(LA9_1 >= NBR && LA9_1 <= OU)||(LA9_1 >= PARLER && LA9_1 <= POINT)||LA9_1==RUBRIQUE) ) {
					alt9=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA9_0==NBR) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:553:2: a= VAR
					{
					a=(Token)match(input,VAR,FOLLOW_VAR_in_param1747); 

							lepar_arbre.ajouteFils(new Arbre("", "m.mot LIKE '%" + a.getText() + "%' "));
						
					}
					break;
				case 2 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:556:4: a1= NBR a2= MOIS
					{
					a1=(Token)match(input,NBR,FOLLOW_NBR_in_param1758); 
					a2=(Token)match(input,MOIS,FOLLOW_MOIS_in_param1764); 

						 	lepar_arbre.ajouteFils(new Arbre("", "m.mot LIKE '%" + a1.getText() + "%' "));
						 	lepar_arbre.ajouteFils(new Arbre("", "OR m.mot LIKE '%" + a2.getText() + "%' "));
						 
					}
					break;
				case 3 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:560:5: a1= VAR a2= VAR
					{
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_param1776); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_param1782); 

							lepar_arbre.ajouteFils(new Arbre("", "m.mot LIKE '%" +a1.getText() + "%' "));
							lepar_arbre.ajouteFils(new Arbre("", "OR m.mot LIKE '%" + a2.getText() + "%' "));
						
					}
					break;
				case 4 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:564:4: a1= VAR a2= VAR a3= VAR
					{
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_param1793); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_param1799); 
					a3=(Token)match(input,VAR,FOLLOW_VAR_in_param1805); 

							lepar_arbre.ajouteFils(new Arbre("", "m.mot LIKE '%" +a1.getText() + "%' "));
							lepar_arbre.ajouteFils(new Arbre("", "OR m.mot LIKE '%" + a2.getText() + "%' "));
							lepar_arbre.ajouteFils(new Arbre("", "OR m.mot LIKE '%" + a3.getText() + "%' "));
						
					}
					break;
				case 5 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:569:4: a1= VAR a2= VAR a3= VAR a4= VAR
					{
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_param1816); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_param1822); 
					a3=(Token)match(input,VAR,FOLLOW_VAR_in_param1828); 
					a4=(Token)match(input,VAR,FOLLOW_VAR_in_param1834); 

							lepar_arbre.ajouteFils(new Arbre("", "m.mot LIKE '%" + a1.getText() + "%' "));
							lepar_arbre.ajouteFils(new Arbre("", "OR m.mot LIKE '%" + a2.getText() + "%' "));
							lepar_arbre.ajouteFils(new Arbre("", "OR m.mot LIKE '%" + a3.getText() + "%' "));
							lepar_arbre.ajouteFils(new Arbre("", "OR m.mot LIKE '%" + a4.getText() + "%' "));
						
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
	// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:576:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param (c= conj par2= param )* ;
	public final Arbre params() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre c =null;
		Arbre par2 =null;


				Arbre par1_arbre, par2_arbre, conj_arbre, dat_arbre;
			
		try {
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:579:4: (par1= param (c= conj par2= param )* )
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:580:3: par1= param (c= conj par2= param )*
			{
			pushFollow(FOLLOW_param_in_params1859);
			par1=param();
			state._fsp--;


						par1_arbre = par1;
						les_pars_arbre.ajouteFils(par1_arbre);
					
			// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:584:3: (c= conj par2= param )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==ET) ) {
					int LA10_2 = input.LA(2);
					if ( (LA10_2==NBR||LA10_2==VAR) ) {
						alt10=1;
					}

				}
				else if ( (LA10_0==OU) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\Guillaume\\Documents\\GitHub\\lo17-guina\\TD4\\antlr_guix\\Tal_simple.g:584:4: c= conj par2= param
					{
					pushFollow(FOLLOW_conj_in_params1870);
					c=conj();
					state._fsp--;

					pushFollow(FOLLOW_param_in_params1876);
					par2=param();
					state._fsp--;


								conj_arbre = c;
								par2_arbre = par2;
								les_pars_arbre.ajouteFils(conj_arbre);
								les_pars_arbre.ajouteFils(par2_arbre);
							
					}
					break;

				default :
					break loop10;
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


	protected DFA4 dfa4 = new DFA4(this);
	static final String DFA4_eotS =
		"\u00cd\uffff";
	static final String DFA4_eofS =
		"\u00cd\uffff";
	static final String DFA4_minS =
		"\1\4\1\16\1\4\1\uffff\1\4\2\uffff\1\21\1\4\1\uffff\1\21\1\24\1\14\1\6"+
		"\1\4\3\uffff\1\4\1\21\1\15\1\17\1\14\1\uffff\2\5\1\15\1\17\2\21\2\uffff"+
		"\1\21\1\13\3\6\1\17\1\21\2\uffff\1\15\1\17\1\15\2\21\2\uffff\1\15\2\uffff"+
		"\1\35\1\5\2\35\1\15\2\21\1\uffff\2\15\1\17\1\14\1\17\1\11\1\17\2\5\1\uffff"+
		"\1\6\2\21\3\uffff\1\6\2\uffff\2\6\2\uffff\1\15\2\21\3\uffff\3\15\1\17"+
		"\1\21\1\35\1\5\1\25\1\15\1\uffff\1\15\1\17\1\15\2\21\2\uffff\1\15\1\14"+
		"\2\21\2\uffff\1\14\1\11\2\21\2\uffff\1\11\1\35\1\5\2\35\2\6\1\17\1\6\2"+
		"\15\1\17\3\15\1\25\1\35\1\25\2\35\5\15\1\17\2\14\1\17\2\11\1\17\1\21\1"+
		"\35\1\5\1\25\3\6\4\15\1\24\1\35\1\25\1\24\4\15\3\14\3\11\1\25\1\35\1\25"+
		"\2\35\1\6\2\15\2\uffff\1\24\1\35\2\15\1\14\1\11\1\15\1\35\1\25\1\15\1"+
		"\6\1\15\1\24\1\15\1\14\1\11\2\uffff\1\15\1\35\1\15";
	static final String DFA4_maxS =
		"\1\32\1\24\1\31\1\uffff\1\23\2\uffff\2\35\1\uffff\1\35\1\24\2\35\1\4\3"+
		"\uffff\1\24\2\35\1\17\1\24\1\uffff\1\5\2\35\1\17\2\35\2\uffff\3\35\1\17"+
		"\1\21\1\17\1\35\2\uffff\1\35\1\17\3\35\2\uffff\1\25\2\uffff\1\35\1\5\5"+
		"\35\1\uffff\1\31\1\35\1\17\1\35\1\17\1\35\1\17\2\35\1\uffff\3\35\3\uffff"+
		"\1\25\2\uffff\2\15\2\uffff\3\35\3\uffff\1\25\2\35\1\17\1\25\1\35\1\5\1"+
		"\25\1\35\1\uffff\1\35\1\17\3\35\2\uffff\1\25\3\35\2\uffff\1\25\3\35\2"+
		"\uffff\1\25\1\35\1\5\4\35\1\17\1\15\2\35\1\17\1\25\1\35\2\25\1\35\1\25"+
		"\2\35\1\31\1\35\1\31\2\35\1\17\2\35\1\17\2\35\1\17\1\25\1\35\1\5\2\25"+
		"\1\35\2\25\1\35\1\25\1\35\1\25\1\35\2\25\1\35\1\25\1\35\2\25\1\35\2\25"+
		"\1\35\2\25\1\35\1\25\4\35\1\25\2\uffff\1\25\1\35\1\31\3\35\1\25\1\35\10"+
		"\25\2\uffff\1\25\1\35\1\25";
	static final String DFA4_acceptS =
		"\3\uffff\1\26\1\uffff\1\2\1\1\2\uffff\1\15\5\uffff\1\43\1\44\1\45\5\uffff"+
		"\1\11\6\uffff\1\24\1\25\7\uffff\1\46\1\47\5\uffff\1\4\1\6\1\uffff\1\10"+
		"\1\12\7\uffff\1\17\11\uffff\1\35\3\uffff\1\30\1\31\1\37\1\uffff\1\33\1"+
		"\40\2\uffff\1\41\1\42\3\uffff\1\3\1\5\1\7\11\uffff\1\16\5\uffff\1\20\1"+
		"\21\4\uffff\1\22\1\23\4\uffff\1\27\1\32\101\uffff\1\13\1\14\20\uffff\1"+
		"\34\1\36\3\uffff";
	static final String DFA4_specialS =
		"\u00cd\uffff}>";
	static final String[] DFA4_transitionS = {
			"\1\1\2\uffff\1\2\3\uffff\1\3\16\uffff\1\4",
			"\2\6\1\uffff\1\6\2\uffff\1\5",
			"\1\7\1\uffff\1\10\7\uffff\1\11\1\uffff\1\12\2\uffff\1\13\5\uffff\1\14",
			"",
			"\1\15\1\uffff\1\16\1\17\1\uffff\1\20\1\uffff\1\21\7\uffff\1\22",
			"",
			"",
			"\1\25\2\uffff\1\23\10\uffff\1\24",
			"\1\26\6\uffff\1\31\2\uffff\2\27\1\uffff\1\27\13\uffff\1\30",
			"",
			"\1\33\13\uffff\1\32",
			"\1\34",
			"\1\36\4\uffff\1\37\2\uffff\1\35\10\uffff\1\37",
			"\1\41\7\uffff\1\45\1\44\1\uffff\1\43\2\uffff\1\40\10\uffff\1\42",
			"\1\46",
			"",
			"",
			"",
			"\1\47\17\uffff\1\50",
			"\1\52\13\uffff\1\51",
			"\1\54\4\uffff\1\55\1\uffff\1\56\1\57\7\uffff\1\53",
			"\1\60",
			"\1\61\7\uffff\1\62",
			"",
			"\1\63",
			"\1\66\1\65\26\uffff\1\64",
			"\1\70\4\uffff\1\71\6\uffff\1\72\3\uffff\1\67",
			"\1\73",
			"\1\75\13\uffff\1\74",
			"\1\77\13\uffff\1\76",
			"",
			"",
			"\1\101\13\uffff\1\100",
			"\1\103\5\uffff\1\104\13\uffff\1\102",
			"\1\112\6\uffff\1\106\4\uffff\1\107\1\uffff\1\110\1\111\7\uffff\1\105",
			"\1\114\6\uffff\1\115\1\uffff\1\113",
			"\1\114\6\uffff\1\115\3\uffff\1\116",
			"\1\117",
			"\1\121\2\uffff\1\120\10\uffff\1\121",
			"",
			"",
			"\1\123\2\127\1\uffff\1\127\1\124\1\uffff\1\126\1\125\7\uffff\1\122",
			"\1\130",
			"\1\54\4\uffff\1\55\1\uffff\1\56\1\57\7\uffff\1\131",
			"\1\133\13\uffff\1\132",
			"\1\133\13\uffff\1\132",
			"",
			"",
			"\1\54\4\uffff\1\55\1\uffff\1\56\1\57",
			"",
			"",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\70\4\uffff\1\71\6\uffff\1\72\3\uffff\1\140",
			"\1\143\10\uffff\1\141\2\uffff\1\142",
			"\1\143\13\uffff\1\142",
			"",
			"\1\70\4\uffff\1\71\6\uffff\1\72",
			"\1\145\2\150\1\uffff\1\150\1\146\2\uffff\1\147\7\uffff\1\144",
			"\1\151",
			"\1\155\1\153\4\uffff\1\154\2\uffff\1\156\7\uffff\1\152",
			"\1\157",
			"\1\164\2\uffff\1\163\1\161\4\uffff\1\162\2\uffff\1\111\7\uffff\1\160",
			"\1\165",
			"\1\166\7\uffff\1\104\4\uffff\1\104\2\uffff\1\104\7\uffff\1\104",
			"\1\171\1\170\26\uffff\1\167",
			"",
			"\1\112\6\uffff\1\106\4\uffff\1\107\1\uffff\1\110\1\111\7\uffff\1\172",
			"\1\174\13\uffff\1\173",
			"\1\174\13\uffff\1\173",
			"",
			"",
			"",
			"\1\112\6\uffff\1\106\3\uffff\1\175\1\107\1\uffff\1\110\1\111",
			"",
			"",
			"\1\114\6\uffff\1\115",
			"\1\114\6\uffff\1\115",
			"",
			"",
			"\1\123\2\127\1\uffff\1\127\1\124\1\uffff\1\126\1\125\7\uffff\1\176",
			"\1\u0080\13\uffff\1\177",
			"\1\u0080\13\uffff\1\177",
			"",
			"",
			"",
			"\1\123\2\127\1\uffff\1\127\1\124\1\uffff\1\126\1\125",
			"\1\54\4\uffff\1\55\1\uffff\1\56\1\57\7\uffff\1\u0081",
			"\1\54\4\uffff\1\55\1\uffff\1\56\1\57\7\uffff\1\u0082",
			"\1\u0083",
			"\1\u0084\3\uffff\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\1\70\4\uffff\1\71\6\uffff\1\72\3\uffff\1\u0089",
			"",
			"\1\70\4\uffff\1\71\6\uffff\1\72\3\uffff\1\u008a",
			"\1\u008b",
			"\1\145\2\150\1\uffff\1\150\1\146\2\uffff\1\147\7\uffff\1\u008c",
			"\1\u008e\13\uffff\1\u008d",
			"\1\u008e\13\uffff\1\u008d",
			"",
			"",
			"\1\145\2\150\1\uffff\1\150\1\146\2\uffff\1\147",
			"\1\155\1\153\4\uffff\1\154\2\uffff\1\156\7\uffff\1\u008f",
			"\1\u0091\13\uffff\1\u0090",
			"\1\u0091\13\uffff\1\u0090",
			"",
			"",
			"\1\155\1\153\4\uffff\1\154\2\uffff\1\156",
			"\1\164\2\uffff\1\163\1\161\4\uffff\1\162\2\uffff\1\111\7\uffff\1\u0092",
			"\1\u0094\13\uffff\1\u0093",
			"\1\u0094\13\uffff\1\u0093",
			"",
			"",
			"\1\164\2\uffff\1\163\1\161\4\uffff\1\162\2\uffff\1\111",
			"\1\u0095",
			"\1\u0096",
			"\1\u0097",
			"\1\u0098",
			"\1\112\6\uffff\1\106\4\uffff\1\107\1\uffff\1\110\1\111\7\uffff\1\u0099",
			"\1\112\6\uffff\1\106\4\uffff\1\107\1\uffff\1\110\1\111\7\uffff\1\u009a",
			"\1\u009b",
			"\1\114\6\uffff\1\115",
			"\1\123\2\127\1\uffff\1\127\1\124\1\uffff\1\126\1\125\7\uffff\1\u009c",
			"\1\123\2\127\1\uffff\1\127\1\124\1\uffff\1\126\1\125\7\uffff\1\u009d",
			"\1\u009e",
			"\1\54\4\uffff\1\55\1\uffff\1\56\1\57",
			"\1\54\4\uffff\1\55\1\uffff\1\56\1\57\7\uffff\1\u009f",
			"\1\54\4\uffff\1\55\1\uffff\1\56\1\57",
			"\1\u0085",
			"\1\u00a0",
			"\1\u00a1",
			"\1\u00a2",
			"\1\u00a3",
			"\1\70\4\uffff\1\71\6\uffff\1\72",
			"\1\70\4\uffff\1\71\6\uffff\1\72\3\uffff\1\u00a4",
			"\1\70\4\uffff\1\71\6\uffff\1\72",
			"\1\145\2\150\1\uffff\1\150\1\146\2\uffff\1\147\7\uffff\1\u00a5",
			"\1\145\2\150\1\uffff\1\150\1\146\2\uffff\1\147\7\uffff\1\u00a6",
			"\1\u00a7",
			"\1\155\1\153\4\uffff\1\154\2\uffff\1\156\7\uffff\1\u00a8",
			"\1\155\1\153\4\uffff\1\154\2\uffff\1\156\7\uffff\1\u00a9",
			"\1\u00aa",
			"\1\164\2\uffff\1\163\1\161\4\uffff\1\162\2\uffff\1\111\7\uffff\1\u00ab",
			"\1\164\2\uffff\1\163\1\161\4\uffff\1\162\2\uffff\1\111\7\uffff\1\u00ac",
			"\1\u00ad",
			"\1\u00ae\3\uffff\1\u00af",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b2",
			"\1\112\6\uffff\1\106\4\uffff\1\107\1\uffff\1\110\1\111",
			"\1\112\6\uffff\1\106\4\uffff\1\107\1\uffff\1\110\1\111\7\uffff\1\u00b3",
			"\1\112\6\uffff\1\106\4\uffff\1\107\1\uffff\1\110\1\111",
			"\1\123\2\127\1\uffff\1\127\1\124\1\uffff\1\126\1\125",
			"\1\123\2\127\1\uffff\1\127\1\124\1\uffff\1\126\1\125\7\uffff\1\u00b4",
			"\1\123\2\127\1\uffff\1\127\1\124\1\uffff\1\126\1\125",
			"\1\54\4\uffff\1\55\1\uffff\1\56\1\57\7\uffff\1\u00b5",
			"\1\u00b7\1\u00b6",
			"\1\u00b8",
			"\1\u00b9",
			"\1\u00b7\1\u00b6",
			"\1\70\4\uffff\1\71\6\uffff\1\72\3\uffff\1\u00ba",
			"\1\145\2\150\1\uffff\1\150\1\146\2\uffff\1\147",
			"\1\145\2\150\1\uffff\1\150\1\146\2\uffff\1\147\7\uffff\1\u00bb",
			"\1\145\2\150\1\uffff\1\150\1\146\2\uffff\1\147",
			"\1\155\1\153\4\uffff\1\154\2\uffff\1\156",
			"\1\155\1\153\4\uffff\1\154\2\uffff\1\156\7\uffff\1\u00bc",
			"\1\155\1\153\4\uffff\1\154\2\uffff\1\156",
			"\1\164\2\uffff\1\163\1\161\4\uffff\1\162\2\uffff\1\111",
			"\1\164\2\uffff\1\163\1\161\4\uffff\1\162\2\uffff\1\111\7\uffff\1\u00bd",
			"\1\164\2\uffff\1\163\1\161\4\uffff\1\162\2\uffff\1\111",
			"\1\u00af",
			"\1\u00be",
			"\1\u00bf",
			"\1\u00c0",
			"\1\u00c1",
			"\1\112\6\uffff\1\106\4\uffff\1\107\1\uffff\1\110\1\111\7\uffff\1\u00c2",
			"\1\123\2\127\1\uffff\1\127\1\124\1\uffff\1\126\1\125\7\uffff\1\u00c3",
			"\1\54\4\uffff\1\55\1\uffff\1\56\1\57",
			"",
			"",
			"\1\u00b7\1\u00b6",
			"\1\u00c4",
			"\1\70\4\uffff\1\71\6\uffff\1\72",
			"\1\145\2\150\1\uffff\1\150\1\146\2\uffff\1\147\7\uffff\1\u00c5",
			"\1\155\1\153\4\uffff\1\154\2\uffff\1\156\7\uffff\1\u00c6",
			"\1\164\2\uffff\1\163\1\161\4\uffff\1\162\2\uffff\1\111\7\uffff\1\u00c7",
			"\1\u00c8\7\uffff\1\u00c9",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00c8\7\uffff\1\u00c9",
			"\1\112\6\uffff\1\106\4\uffff\1\107\1\uffff\1\110\1\111",
			"\1\123\2\127\1\uffff\1\127\1\124\1\uffff\1\126\1\125",
			"\1\u00b7\1\u00b6",
			"\1\145\2\150\1\uffff\1\150\1\146\2\uffff\1\147",
			"\1\155\1\153\4\uffff\1\154\2\uffff\1\156",
			"\1\164\2\uffff\1\163\1\161\4\uffff\1\162\2\uffff\1\111",
			"",
			"",
			"\1\u00c8\7\uffff\1\u00c9",
			"\1\u00cc",
			"\1\u00c8\7\uffff\1\u00c9"
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

	protected class DFA4 extends DFA {

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
		@Override
		public String getDescription() {
			return "36:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( ARTICLE d= dat PARLER ps= params | ARTICLE PARLER ps= params | COMBIEN ARTICLE PARLER ps= params | COMBIEN ARTICLE ps1= params PARLER ps2= params | COMBIEN ARTICLE PARLER ps1= params PARLER ps2= params | COMBIEN ARTICLE ps= params | COMBIEN ARTICLE PARLER ps= params d= dat | COMBIEN AUTEUR ARTICLE ENTRE d1= dat ET d2= dat | COMBIEN AUTEUR d= dat | COMBIEN AUTEUR ARTICLE PARLER ps= params | COMBIEN AUTEUR e= email | COMBIEN AUTEUR e= email PARLER ps= params | COMBIEN JOURS PARLER ps= params | COMBIEN MOT ps= params ET SELECT ARTICLE | COMBIEN MOT ps= params r= RUBRIQUE | COMBIEN PAGE PARLER ps= params | COMBIEN PAGE PARLER ps= params d= dat | COMBIEN r= RUBRIQUE PARLER ps= params ENTRE d1= dat ET d2= dat | COMBIEN r= RUBRIQUE PARLER ps= params | COMBIEN r= RUBRIQUE ENTRE d1= dat ET d2= dat PARLER ps= params | COMBIEN r= RUBRIQUE ps= params | EMAIL AUTEUR ps= params | SELECT ARTICLE PARLER ps= params ENTRE d1= dat ET d2= dat | SELECT ARTICLE ps1= params PARLER ps2= params | SELECT ARTICLE ( PARLER )? ps= params | SELECT ARTICLE PARLER ps= params DATE d= dat | SELECT ARTICLE d= dat AUTEUR e= email | SELECT ARTICLE AUTEUR e= email ET PARLER r= RUBRIQUE | SELECT ARTICLE AUTEUR ps= params | SELECT ARTICLE AUTEUR e= email | SELECT ARTICLE ps1= params AUTEUR ps2= params | SELECT ARTICLE d= dat ET PARLER ps= params | SELECT AUTEUR ARTICLE PARLER ps= params | SELECT AUTEUR ARTICLE ps= params | SELECT COMBIEN r= RUBRIQUE PARLER ps= params | SELECT DATE ( ARTICLE )? PARLER ps= params | SELECT EMAIL AUTEUR ps= params | SELECT PAGE ARTICLE ( AUTEUR )* e= email | SELECT PAGE PARLER ps= params );";
		}
	}

	public static final BitSet FOLLOW_ARTICLE_in_requete332 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete338 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete340 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_requete355 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete357 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete407 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete409 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete411 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete431 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete433 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete439 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete441 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete461 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete463 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete465 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete471 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete473 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete493 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete495 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete518 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete520 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete522 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete528 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete550 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete552 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete554 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ENTRE_in_requete556 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete562 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ET_in_requete564 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete584 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete586 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete607 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete609 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete612 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete614 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete629 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete631 = new BitSet(new long[]{0x0000000020000800L});
	public static final BitSet FOLLOW_email_in_requete637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete651 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete653 = new BitSet(new long[]{0x0000000020000800L});
	public static final BitSet FOLLOW_email_in_requete659 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete661 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete681 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_JOURS_in_requete683 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete685 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete707 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_MOT_in_requete709 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete715 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ET_in_requete717 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_SELECT_in_requete719 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete735 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_MOT_in_requete737 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete743 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete760 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_PAGE_in_requete762 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete764 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete770 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete784 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_PAGE_in_requete786 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete788 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete794 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete816 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete822 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete824 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete830 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ENTRE_in_requete832 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete838 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ET_in_requete840 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete846 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete876 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete882 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete884 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete904 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete910 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ENTRE_in_requete912 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete918 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ET_in_requete920 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete926 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete928 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete946 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete952 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EMAIL_in_requete974 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete976 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1001 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1003 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1005 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1012 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ENTRE_in_requete1014 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete1020 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ET_in_requete1022 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete1028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1042 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1044 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1050 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1052 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1076 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1078 = new BitSet(new long[]{0x0000000020120000L});
	public static final BitSet FOLLOW_PARLER_in_requete1080 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1098 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1100 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1102 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1108 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_DATE_in_requete1110 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete1116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1127 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1129 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete1135 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1137 = new BitSet(new long[]{0x0000000020000800L});
	public static final BitSet FOLLOW_email_in_requete1143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1152 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1154 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1156 = new BitSet(new long[]{0x0000000020000800L});
	public static final BitSet FOLLOW_email_in_requete1162 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ET_in_requete1164 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1166 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete1172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1181 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1183 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1185 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1200 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1202 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1204 = new BitSet(new long[]{0x0000000020000800L});
	public static final BitSet FOLLOW_email_in_requete1210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1219 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1221 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1227 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1229 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1246 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1248 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete1254 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ET_in_requete1256 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1258 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1275 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1277 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1279 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1281 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1296 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1298 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1300 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1317 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COMBIEN_in_requete1319 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete1325 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1327 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1347 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_DATE_in_requete1349 = new BitSet(new long[]{0x0000000000100010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1351 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1354 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1372 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_EMAIL_in_requete1374 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1376 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1396 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_PAGE_in_requete1398 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1400 = new BitSet(new long[]{0x0000000020000840L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1402 = new BitSet(new long[]{0x0000000020000840L});
	public static final BitSet FOLLOW_email_in_requete1409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1420 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_PAGE_in_requete1422 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1424 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ET_in_conj1446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OU_in_conj1453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NBR_in_dat1472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOIS_in_dat1483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOIS_in_dat1494 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NBR_in_dat1500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOURS_in_dat1511 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOIS_in_dat1517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NBR_in_dat1528 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOIS_in_dat1534 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NBR_in_dat1540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_email1561 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AT_in_email1567 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1573 = new BitSet(new long[]{0x0000000000220000L});
	public static final BitSet FOLLOW_NBR_in_email1579 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_POINT_in_email1586 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EMAIL_in_email1600 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1606 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AT_in_email1612 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1618 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_POINT_in_email1624 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EMAIL_in_email1637 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_email1639 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1645 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AT_in_email1651 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1657 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_POINT_in_email1663 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EMAIL_in_email1676 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AT_in_email1682 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1688 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_POINT_in_email1694 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_requete_in_listerequetes1726 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_POINT_in_listerequetes1728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_param1747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NBR_in_param1758 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOIS_in_param1764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_param1776 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_param1782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_param1793 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_param1799 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_param1805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_param1816 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_param1822 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_param1828 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_param1834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_params1859 = new BitSet(new long[]{0x0000000000042002L});
	public static final BitSet FOLLOW_conj_in_params1870 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_param_in_params1876 = new BitSet(new long[]{0x0000000000042002L});
}

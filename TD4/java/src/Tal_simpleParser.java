// $ANTLR 3.5 /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g 2014-05-12 15:43:10


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
	@Override public String getGrammarFileName() { return "/home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g"; }



	// $ANTLR start "requete"
	// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:36:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( ARTICLE d= dat PARLER ps= params | ARTICLE PARLER ps= params | COMBIEN ARTICLE PARLER ps= params | COMBIEN ARTICLE ps1= params PARLER ps2= params | COMBIEN ARTICLE PARLER ps1= params PARLER ps2= params | COMBIEN ARTICLE ps= params | COMBIEN ARTICLE PARLER ps= params d= dat | COMBIEN AUTEUR PARLER ARTICLE ENTRE d1= dat ET d2= dat | COMBIEN AUTEUR PARLER d= dat | COMBIEN AUTEUR PARLER ARTICLE PARLER ps= params | COMBIEN AUTEUR e= email | COMBIEN AUTEUR e= email PARLER ps= params | COMBIEN JOURS PARLER ps= params | COMBIEN MOT ps= params ET SELECT ARTICLE | COMBIEN MOT ps= params r= RUBRIQUE | COMBIEN PAGE PARLER ps= params | COMBIEN PAGE PARLER ps= params d= dat | COMBIEN r= RUBRIQUE PARLER ps= params ENTRE d1= dat ET d2= dat | COMBIEN r= RUBRIQUE PARLER ps= params | COMBIEN r= RUBRIQUE ENTRE d1= dat ET d2= dat PARLER ps= params | COMBIEN r= RUBRIQUE ps= params | EMAIL AUTEUR ps= params | SELECT ARTICLE PARLER ps= params ENTRE d1= dat ET d2= dat | SELECT ARTICLE ps1= params PARLER ps2= params | SELECT ARTICLE PARLER ps= params | SELECT ARTICLE PARLER ps= params DATE d= dat | SELECT ARTICLE d= dat AUTEUR e= email | SELECT ARTICLE AUTEUR e= email ET PARLER r= RUBRIQUE | SELECT ARTICLE AUTEUR ps= params | SELECT ARTICLE AUTEUR e= email | SELECT ARTICLE ps1= params AUTEUR ps2= params | SELECT ARTICLE d= dat ET PARLER ps= params | SELECT AUTEUR ARTICLE PARLER ps= params | SELECT AUTEUR ARTICLE ps= params | SELECT AUTEUR ET EMAIL ARTICLE TODAY | SELECT COMBIEN r= RUBRIQUE ps= params AUTEUR DATE | SELECT COMBIEN r= RUBRIQUE PARLER ps= params | SELECT DATE ARTICLE AUTEUR ps= params | SELECT DATE ARTICLE r= RUBRIQUE e= email | SELECT DATE ARTICLE PARLER ps= params | SELECT DATE PARLER ps= params | SELECT EMAIL AUTEUR ps= params | SELECT PAGE ARTICLE AUTEUR AUTEUR e= email | SELECT PAGE PARLER ps= params | SELECT r= RUBRIQUE ENTRE d1= dat ET d2= dat | SELECT r= RUBRIQUE PARLER ps= params | SELECT r= RUBRIQUE d= dat | SELECT r1= RUBRIQUE ET r2= RUBRIQUE PARLER ps= params | SELECT TITRE ET DATE ARTICLE PARLER ps= params | SELECT TITRE PARLER ps= params );
	public final Arbre requete()  {
		Arbre req_arbre =  new Arbre("");


		Token r=null;
		Token r1=null;
		Token r2=null;
		Arbre d =null;
		Arbre ps =null;
		Arbre ps1 =null;
		Arbre ps2 =null;
		Arbre d1 =null;
		Arbre d2 =null;
		Arbre e =null;

		Arbre ps_arbre, d_arbre, e_arbre;
		try {
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:37:35: ( ARTICLE d= dat PARLER ps= params | ARTICLE PARLER ps= params | COMBIEN ARTICLE PARLER ps= params | COMBIEN ARTICLE ps1= params PARLER ps2= params | COMBIEN ARTICLE PARLER ps1= params PARLER ps2= params | COMBIEN ARTICLE ps= params | COMBIEN ARTICLE PARLER ps= params d= dat | COMBIEN AUTEUR PARLER ARTICLE ENTRE d1= dat ET d2= dat | COMBIEN AUTEUR PARLER d= dat | COMBIEN AUTEUR PARLER ARTICLE PARLER ps= params | COMBIEN AUTEUR e= email | COMBIEN AUTEUR e= email PARLER ps= params | COMBIEN JOURS PARLER ps= params | COMBIEN MOT ps= params ET SELECT ARTICLE | COMBIEN MOT ps= params r= RUBRIQUE | COMBIEN PAGE PARLER ps= params | COMBIEN PAGE PARLER ps= params d= dat | COMBIEN r= RUBRIQUE PARLER ps= params ENTRE d1= dat ET d2= dat | COMBIEN r= RUBRIQUE PARLER ps= params | COMBIEN r= RUBRIQUE ENTRE d1= dat ET d2= dat PARLER ps= params | COMBIEN r= RUBRIQUE ps= params | EMAIL AUTEUR ps= params | SELECT ARTICLE PARLER ps= params ENTRE d1= dat ET d2= dat | SELECT ARTICLE ps1= params PARLER ps2= params | SELECT ARTICLE PARLER ps= params | SELECT ARTICLE PARLER ps= params DATE d= dat | SELECT ARTICLE d= dat AUTEUR e= email | SELECT ARTICLE AUTEUR e= email ET PARLER r= RUBRIQUE | SELECT ARTICLE AUTEUR ps= params | SELECT ARTICLE AUTEUR e= email | SELECT ARTICLE ps1= params AUTEUR ps2= params | SELECT ARTICLE d= dat ET PARLER ps= params | SELECT AUTEUR ARTICLE PARLER ps= params | SELECT AUTEUR ARTICLE ps= params | SELECT AUTEUR ET EMAIL ARTICLE TODAY | SELECT COMBIEN r= RUBRIQUE ps= params AUTEUR DATE | SELECT COMBIEN r= RUBRIQUE PARLER ps= params | SELECT DATE ARTICLE AUTEUR ps= params | SELECT DATE ARTICLE r= RUBRIQUE e= email | SELECT DATE ARTICLE PARLER ps= params | SELECT DATE PARLER ps= params | SELECT EMAIL AUTEUR ps= params | SELECT PAGE ARTICLE AUTEUR AUTEUR e= email | SELECT PAGE PARLER ps= params | SELECT r= RUBRIQUE ENTRE d1= dat ET d2= dat | SELECT r= RUBRIQUE PARLER ps= params | SELECT r= RUBRIQUE d= dat | SELECT r1= RUBRIQUE ET r2= RUBRIQUE PARLER ps= params | SELECT TITRE ET DATE ARTICLE PARLER ps= params | SELECT TITRE PARLER ps= params )
			int alt1=50;
			alt1 = dfa1.predict(input);
			switch (alt1) {
				case 1 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:43:4: ARTICLE d= dat PARLER ps= params
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete332); 
					pushFollow(FOLLOW_dat_in_requete338);
					d=dat();
					state._fsp--;

					match(input,PARLER,FOLLOW_PARLER_in_requete340); 
					pushFollow(FOLLOW_params_in_requete344);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct "));
								req_arbre.ajouteFils(new Arbre("", "article "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 2 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:52:5: ARTICLE PARLER ps= params
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete355); 
					match(input,PARLER,FOLLOW_PARLER_in_requete357); 
					pushFollow(FOLLOW_params_in_requete361);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct "));
								req_arbre.ajouteFils(new Arbre("", "article "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 3 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:75:5: COMBIEN ARTICLE PARLER ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete407); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete409); 
					match(input,PARLER,FOLLOW_PARLER_in_requete411); 
					pushFollow(FOLLOW_params_in_requete417);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(article) "));
								req_arbre.ajouteFils(new Arbre("", "from ... "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 4 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:84:5: COMBIEN ARTICLE ps1= params PARLER ps2= params
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


								req_arbre.ajouteFils(new Arbre("", "select count(article) "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where'"));
								ps_arbre = ps1;
								req_arbre.ajouteFils(ps_arbre);
								req_arbre.ajouteFils(new Arbre("", " AND mot = '"));
								ps_arbre = ps2;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 5 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:96:5: COMBIEN ARTICLE PARLER ps1= params PARLER ps2= params
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


								req_arbre.ajouteFils(new Arbre("", "select count(article) "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where'"));
								ps_arbre = ps1;
								req_arbre.ajouteFils(ps_arbre);
								req_arbre.ajouteFils(new Arbre("", " AND mot = '"));
								ps_arbre = ps2;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 6 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:108:5: COMBIEN ARTICLE ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete493); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete495); 
					pushFollow(FOLLOW_params_in_requete501);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(article) "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where '"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 7 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:118:5: COMBIEN ARTICLE PARLER ps= params d= dat
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


								req_arbre.ajouteFils(new Arbre("", "select count(article) "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
								req_arbre.ajouteFils(new Arbre("", "AND "));
								d_arbre = d;
								req_arbre.ajouteFils(d_arbre);
							
					}
					break;
				case 8 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:131:5: COMBIEN AUTEUR PARLER ARTICLE ENTRE d1= dat ET d2= dat
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete550); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete552); 
					match(input,PARLER,FOLLOW_PARLER_in_requete554); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete556); 
					match(input,ENTRE,FOLLOW_ENTRE_in_requete558); 
					pushFollow(FOLLOW_dat_in_requete564);
					d1=dat();
					state._fsp--;

					match(input,ET,FOLLOW_ET_in_requete566); 
					pushFollow(FOLLOW_dat_in_requete572);
					d2=dat();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(auteur)"));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								req_arbre.ajouteFils(new Arbre("", " AND date >= "));
								d_arbre = d1;
								req_arbre.ajouteFils(d_arbre);
								req_arbre.ajouteFils(new Arbre("", " AND date <= "));
								d_arbre = d2;
								req_arbre.ajouteFils(d_arbre);
							
					}
					break;
				case 9 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:144:5: COMBIEN AUTEUR PARLER d= dat
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete586); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete588); 
					match(input,PARLER,FOLLOW_PARLER_in_requete590); 
					pushFollow(FOLLOW_dat_in_requete597);
					d=dat();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(auteur) "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								d_arbre = d;
								req_arbre.ajouteFils(d_arbre);
							
					}
					break;
				case 10 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:153:5: COMBIEN AUTEUR PARLER ARTICLE PARLER ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete611); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete613); 
					match(input,PARLER,FOLLOW_PARLER_in_requete615); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete618); 
					match(input,PARLER,FOLLOW_PARLER_in_requete620); 
					pushFollow(FOLLOW_params_in_requete626);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(auteur) "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 11 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:161:5: COMBIEN AUTEUR e= email
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete635); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete637); 
					pushFollow(FOLLOW_email_in_requete643);
					e=email();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(auteur) "));
								req_arbre.ajouteFils(new Arbre("", "from"));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = e;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 12 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:170:5: COMBIEN AUTEUR e= email PARLER ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete657); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete659); 
					pushFollow(FOLLOW_email_in_requete665);
					e=email();
					state._fsp--;

					match(input,PARLER,FOLLOW_PARLER_in_requete667); 
					pushFollow(FOLLOW_params_in_requete673);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(auteur) "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = e;
								req_arbre.ajouteFils(ps_arbre);
								req_arbre.ajouteFils(new Arbre("", "' AND mot = '"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 13 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:183:5: COMBIEN JOURS PARLER ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete687); 
					match(input,JOURS,FOLLOW_JOURS_in_requete689); 
					match(input,PARLER,FOLLOW_PARLER_in_requete691); 
					pushFollow(FOLLOW_params_in_requete697);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(jour) "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 14 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:194:5: COMBIEN MOT ps= params ET SELECT ARTICLE
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete713); 
					match(input,MOT,FOLLOW_MOT_in_requete715); 
					pushFollow(FOLLOW_params_in_requete721);
					ps=params();
					state._fsp--;

					match(input,ET,FOLLOW_ET_in_requete723); 
					match(input,SELECT,FOLLOW_SELECT_in_requete725); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete727); 

								req_arbre.ajouteFils(new Arbre("", "select count(mot)"));
								req_arbre.ajouteFils(new Arbre("", ", article "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where mot = '"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 15 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:204:5: COMBIEN MOT ps= params r= RUBRIQUE
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete741); 
					match(input,MOT,FOLLOW_MOT_in_requete743); 
					pushFollow(FOLLOW_params_in_requete749);
					ps=params();
					state._fsp--;

					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete755); 

								req_arbre.ajouteFils(new Arbre("", "select count(mot) "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where rubrique = '" + r.getText() + "' "));
								req_arbre.ajouteFils(new Arbre("", " AND mot = '"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 16 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:214:5: COMBIEN PAGE PARLER ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete766); 
					match(input,PAGE,FOLLOW_PAGE_in_requete768); 
					match(input,PARLER,FOLLOW_PARLER_in_requete770); 
					pushFollow(FOLLOW_params_in_requete776);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(page) "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where mot = '"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 17 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:223:5: COMBIEN PAGE PARLER ps= params d= dat
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete790); 
					match(input,PAGE,FOLLOW_PAGE_in_requete792); 
					match(input,PARLER,FOLLOW_PARLER_in_requete794); 
					pushFollow(FOLLOW_params_in_requete800);
					ps=params();
					state._fsp--;

					pushFollow(FOLLOW_dat_in_requete806);
					d=dat();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(page) "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
								req_arbre.ajouteFils(new Arbre("", " AND "));
								d_arbre = d;
								req_arbre.ajouteFils(d_arbre);
							
					}
					break;
				case 18 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:237:5: COMBIEN r= RUBRIQUE PARLER ps= params ENTRE d1= dat ET d2= dat
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete822); 
					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete828); 
					match(input,PARLER,FOLLOW_PARLER_in_requete830); 
					pushFollow(FOLLOW_params_in_requete836);
					ps=params();
					state._fsp--;

					match(input,ENTRE,FOLLOW_ENTRE_in_requete838); 
					pushFollow(FOLLOW_dat_in_requete844);
					d1=dat();
					state._fsp--;

					match(input,ET,FOLLOW_ET_in_requete846); 
					pushFollow(FOLLOW_dat_in_requete852);
					d2=dat();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(rubrique) "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								req_arbre.ajouteFils(new Arbre("", "AND rubrique = '" + r.getText() + "' "));
								req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
								req_arbre.ajouteFils(new Arbre("", " AND date >= "));
								d_arbre = d1;
								req_arbre.ajouteFils(d_arbre);
								req_arbre.ajouteFils(new Arbre("", " AND date <= "));
								d_arbre = d2;
								req_arbre.ajouteFils(d_arbre);
							
					}
					break;
				case 19 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:260:5: COMBIEN r= RUBRIQUE PARLER ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete882); 
					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete888); 
					match(input,PARLER,FOLLOW_PARLER_in_requete890); 
					pushFollow(FOLLOW_params_in_requete896);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(rubrique) "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where rubrique = '" + r.getText() + "' "));
								req_arbre.ajouteFils(new Arbre("", "AND"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 20 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:270:5: COMBIEN r= RUBRIQUE ENTRE d1= dat ET d2= dat PARLER ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete910); 
					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete916); 
					match(input,ENTRE,FOLLOW_ENTRE_in_requete918); 
					pushFollow(FOLLOW_dat_in_requete924);
					d1=dat();
					state._fsp--;

					match(input,ET,FOLLOW_ET_in_requete926); 
					pushFollow(FOLLOW_dat_in_requete932);
					d2=dat();
					state._fsp--;

					match(input,PARLER,FOLLOW_PARLER_in_requete934); 
					pushFollow(FOLLOW_params_in_requete941);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(rubrique) "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								req_arbre.ajouteFils(new Arbre("", "AND rubrique = '" + r.getText() + "' "));
								req_arbre.ajouteFils(new Arbre("", "AND jour >= "));
								d_arbre = d1;
								req_arbre.ajouteFils(d_arbre);
								req_arbre.ajouteFils(new Arbre("", " AND jour <= "));
								d_arbre = d2;
								req_arbre.ajouteFils(d_arbre);
								req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 21 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:286:5: COMBIEN r= RUBRIQUE ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete952); 
					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete958); 
					pushFollow(FOLLOW_params_in_requete964);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(rubrique) "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where rubrique = '" + r.getText() + "' "));
								req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 22 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:298:5: EMAIL AUTEUR ps= params
					{
					match(input,EMAIL,FOLLOW_EMAIL_in_requete980); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete982); 
					pushFollow(FOLLOW_params_in_requete988);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct email "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								req_arbre.ajouteFils(new Arbre("", "auteur = '"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 23 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:312:5: SELECT ARTICLE PARLER ps= params ENTRE d1= dat ET d2= dat
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1007); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1009); 
					match(input,PARLER,FOLLOW_PARLER_in_requete1011); 
					pushFollow(FOLLOW_params_in_requete1018);
					ps=params();
					state._fsp--;

					match(input,ENTRE,FOLLOW_ENTRE_in_requete1020); 
					pushFollow(FOLLOW_dat_in_requete1026);
					d1=dat();
					state._fsp--;

					match(input,ET,FOLLOW_ET_in_requete1028); 
					pushFollow(FOLLOW_dat_in_requete1034);
					d2=dat();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(rubrique) "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								req_arbre.ajouteFils(new Arbre("", "AND jour >= "));
								d_arbre = d1;
								req_arbre.ajouteFils(d_arbre);
								req_arbre.ajouteFils(new Arbre("", " AND jour <= "));
								d_arbre = d2;
								req_arbre.ajouteFils(d_arbre);
								req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 24 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:328:5: SELECT ARTICLE ps1= params PARLER ps2= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1048); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1050); 
					pushFollow(FOLLOW_params_in_requete1056);
					ps1=params();
					state._fsp--;

					match(input,PARLER,FOLLOW_PARLER_in_requete1058); 
					pushFollow(FOLLOW_params_in_requete1064);
					ps2=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct "));
								req_arbre.ajouteFils(new Arbre("", "article "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
								ps_arbre = ps1;
								req_arbre.ajouteFils(ps_arbre);
								ps_arbre = ps2;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 25 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:343:5: SELECT ARTICLE PARLER ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1082); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1084); 
					match(input,PARLER,FOLLOW_PARLER_in_requete1086); 
					pushFollow(FOLLOW_params_in_requete1092);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct "));
								req_arbre.ajouteFils(new Arbre("", "article "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 26 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:353:5: SELECT ARTICLE PARLER ps= params DATE d= dat
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1103); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1105); 
					match(input,PARLER,FOLLOW_PARLER_in_requete1107); 
					pushFollow(FOLLOW_params_in_requete1113);
					ps=params();
					state._fsp--;

					match(input,DATE,FOLLOW_DATE_in_requete1115); 
					pushFollow(FOLLOW_dat_in_requete1121);
					d=dat();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct article "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
								req_arbre.ajouteFils(new Arbre("", "AND "));
								ps_arbre = d;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 27 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:365:5: SELECT ARTICLE d= dat AUTEUR e= email
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1132); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1134); 
					pushFollow(FOLLOW_dat_in_requete1140);
					d=dat();
					state._fsp--;

					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1142); 
					pushFollow(FOLLOW_email_in_requete1148);
					e=email();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct article "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where = "));
								d_arbre = d;
								req_arbre.ajouteFils(d_arbre);
								req_arbre.ajouteFils(new Arbre("", "AND email = "));
								e_arbre = d;
								req_arbre.ajouteFils(e_arbre);
							
					}
					break;
				case 28 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:376:5: SELECT ARTICLE AUTEUR e= email ET PARLER r= RUBRIQUE
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1157); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1159); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1161); 
					pushFollow(FOLLOW_email_in_requete1167);
					e=email();
					state._fsp--;

					match(input,ET,FOLLOW_ET_in_requete1169); 
					match(input,PARLER,FOLLOW_PARLER_in_requete1171); 
					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete1177); 

								req_arbre.ajouteFils(new Arbre("", "select distinct article"));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = e;
								req_arbre.ajouteFils(ps_arbre);
								req_arbre.ajouteFils(new Arbre("", "AND rubrique = '" + r.getText() + "' "));
							
					}
					break;
				case 29 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:385:5: SELECT ARTICLE AUTEUR ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1186); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1188); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1190); 
					pushFollow(FOLLOW_params_in_requete1196);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct article"));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where '"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 30 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:393:5: SELECT ARTICLE AUTEUR e= email
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1205); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1207); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1209); 
					pushFollow(FOLLOW_email_in_requete1215);
					e=email();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct article"));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = e;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 31 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:401:5: SELECT ARTICLE ps1= params AUTEUR ps2= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1224); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1226); 
					pushFollow(FOLLOW_params_in_requete1232);
					ps1=params();
					state._fsp--;

					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1234); 
					pushFollow(FOLLOW_params_in_requete1240);
					ps2=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct article "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								req_arbre.ajouteFils(new Arbre("", "mot = '"));
								ps_arbre = ps1;
								req_arbre.ajouteFils(ps_arbre);
								req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
								ps_arbre = ps2;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 32 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:413:5: SELECT ARTICLE d= dat ET PARLER ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1251); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1253); 
					pushFollow(FOLLOW_dat_in_requete1259);
					d=dat();
					state._fsp--;

					match(input,ET,FOLLOW_ET_in_requete1261); 
					match(input,PARLER,FOLLOW_PARLER_in_requete1263); 
					pushFollow(FOLLOW_params_in_requete1269);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct artiçle "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								d_arbre = d;
								req_arbre.ajouteFils(d_arbre);
								req_arbre.ajouteFils(new Arbre("", "AND mot = "));
								e_arbre = d;
								req_arbre.ajouteFils(e_arbre);
							
					}
					break;
				case 33 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:425:5: SELECT AUTEUR ARTICLE PARLER ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1280); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1282); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1284); 
					match(input,PARLER,FOLLOW_PARLER_in_requete1286); 
					pushFollow(FOLLOW_params_in_requete1292);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct auteur, article "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								req_arbre.ajouteFils(new Arbre("", "mot = '"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 34 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:434:5: SELECT AUTEUR ARTICLE ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1301); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1303); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1305); 
					pushFollow(FOLLOW_params_in_requete1311);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct auteur, article "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								req_arbre.ajouteFils(new Arbre("", "mot = '"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 35 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:443:5: SELECT AUTEUR ET EMAIL ARTICLE TODAY
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1320); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1322); 
					match(input,ET,FOLLOW_ET_in_requete1324); 
					match(input,EMAIL,FOLLOW_EMAIL_in_requete1326); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1328); 
					match(input,TODAY,FOLLOW_TODAY_in_requete1330); 

								req_arbre.ajouteFils(new Arbre("", "select auteur, email "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								req_arbre.ajouteFils(new Arbre("", "date = CURRENT DATE "));
							
					}
					break;
				case 36 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:451:5: SELECT COMBIEN r= RUBRIQUE ps= params AUTEUR DATE
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1343); 
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete1345); 
					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete1351); 
					pushFollow(FOLLOW_params_in_requete1357);
					ps=params();
					state._fsp--;

					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1359); 
					match(input,DATE,FOLLOW_DATE_in_requete1361); 

								req_arbre.ajouteFils(new Arbre("", "select count(rubrique), date"));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								req_arbre.ajouteFils(new Arbre("", "rubrique = '" + r.getText() + "' "));
								req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 37 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:461:5: SELECT COMBIEN r= RUBRIQUE PARLER ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1372); 
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete1374); 
					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete1380); 
					match(input,PARLER,FOLLOW_PARLER_in_requete1382); 
					pushFollow(FOLLOW_params_in_requete1388);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(rubrique)"));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								req_arbre.ajouteFils(new Arbre("", "rubrique = '" + r.getText() + "' "));
								req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 38 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:472:5: SELECT DATE ARTICLE AUTEUR ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1399); 
					match(input,DATE,FOLLOW_DATE_in_requete1401); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1403); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1405); 
					pushFollow(FOLLOW_params_in_requete1411);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct annee, article"));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								req_arbre.ajouteFils(new Arbre("", "AND mot ='"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 39 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:481:5: SELECT DATE ARTICLE r= RUBRIQUE e= email
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1420); 
					match(input,DATE,FOLLOW_DATE_in_requete1422); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1424); 
					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete1430); 
					pushFollow(FOLLOW_email_in_requete1436);
					e=email();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct annee article "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								req_arbre.ajouteFils(new Arbre("", "rubrique = '" + r.getText() + "' "));
								ps_arbre = e;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 40 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:490:5: SELECT DATE ARTICLE PARLER ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1445); 
					match(input,DATE,FOLLOW_DATE_in_requete1447); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1449); 
					match(input,PARLER,FOLLOW_PARLER_in_requete1451); 
					pushFollow(FOLLOW_params_in_requete1457);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct date"));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								req_arbre.ajouteFils(new Arbre("", "AND mot = "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 41 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:500:5: SELECT DATE PARLER ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1469); 
					match(input,DATE,FOLLOW_DATE_in_requete1471); 
					match(input,PARLER,FOLLOW_PARLER_in_requete1473); 
					pushFollow(FOLLOW_params_in_requete1477);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select date "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 42 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:511:5: SELECT EMAIL AUTEUR ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1491); 
					match(input,EMAIL,FOLLOW_EMAIL_in_requete1493); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1495); 
					pushFollow(FOLLOW_params_in_requete1501);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct email "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where auteur = "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 43 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:521:5: SELECT PAGE ARTICLE AUTEUR AUTEUR e= email
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1515); 
					match(input,PAGE,FOLLOW_PAGE_in_requete1517); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1519); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1521); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete1523); 
					pushFollow(FOLLOW_email_in_requete1529);
					e=email();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct page "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								req_arbre.ajouteFils(new Arbre("", "AND "));
								ps_arbre = e;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 44 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:530:5: SELECT PAGE PARLER ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1540); 
					match(input,PAGE,FOLLOW_PAGE_in_requete1542); 
					match(input,PARLER,FOLLOW_PARLER_in_requete1544); 
					pushFollow(FOLLOW_params_in_requete1550);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct page "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								req_arbre.ajouteFils(new Arbre("", "AND "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 45 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:540:5: SELECT r= RUBRIQUE ENTRE d1= dat ET d2= dat
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1561); 
					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete1567); 
					match(input,ENTRE,FOLLOW_ENTRE_in_requete1569); 
					pushFollow(FOLLOW_dat_in_requete1575);
					d1=dat();
					state._fsp--;

					match(input,ET,FOLLOW_ET_in_requete1577); 
					pushFollow(FOLLOW_dat_in_requete1583);
					d2=dat();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct rubrique "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where rubrique = '" + r.getText() + "' "));
								req_arbre.ajouteFils(new Arbre("", "AND date >= "));
								d_arbre = d1;
								req_arbre.ajouteFils(d_arbre);
								req_arbre.ajouteFils(new Arbre("", " AND date <= "));
								d_arbre = d2;
								req_arbre.ajouteFils(d_arbre);
							
					}
					break;
				case 46 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:552:5: SELECT r= RUBRIQUE PARLER ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1592); 
					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete1598); 
					match(input,PARLER,FOLLOW_PARLER_in_requete1600); 
					pushFollow(FOLLOW_params_in_requete1606);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct rubrique "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where rubrique = '" + r.getText() + "' "));
								req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 47 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:561:5: SELECT r= RUBRIQUE d= dat
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1617); 
					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete1623); 
					pushFollow(FOLLOW_dat_in_requete1629);
					d=dat();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct rubrique "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where rubrique = '" + r.getText() + "' "));
								req_arbre.ajouteFils(new Arbre("", "AND date = '"));
								ps_arbre = d;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 48 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:570:5: SELECT r1= RUBRIQUE ET r2= RUBRIQUE PARLER ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1640); 
					r1=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete1646); 
					match(input,ET,FOLLOW_ET_in_requete1648); 
					r2=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete1654); 
					match(input,PARLER,FOLLOW_PARLER_in_requete1656); 
					pushFollow(FOLLOW_params_in_requete1662);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select distinct rubrique "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where rubrique = '" + r1.getText() + "' "));
								req_arbre.ajouteFils(new Arbre("", "OR rubrique = '" + r2.getText() + "' "));
								req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 49 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:583:5: SELECT TITRE ET DATE ARTICLE PARLER ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1680); 
					match(input,TITRE,FOLLOW_TITRE_in_requete1682); 
					match(input,ET,FOLLOW_ET_in_requete1684); 
					match(input,DATE,FOLLOW_DATE_in_requete1686); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1688); 
					match(input,PARLER,FOLLOW_PARLER_in_requete1690); 
					pushFollow(FOLLOW_params_in_requete1694);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select titre, date "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where"));
								req_arbre.ajouteFils(new Arbre("", "mot = '"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 50 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:593:5: SELECT TITRE PARLER ps= params
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete1706); 
					match(input,TITRE,FOLLOW_TITRE_in_requete1708); 
					match(input,PARLER,FOLLOW_PARLER_in_requete1710); 
					pushFollow(FOLLOW_params_in_requete1714);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select titre "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where"));
								req_arbre.ajouteFils(new Arbre("", "mot = '"));
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
	// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:603:1: conj returns [Arbre conj_arbre = new Arbre(\"\")] : ( ET | OU );
	public final Arbre conj() {
		Arbre conj_arbre =  new Arbre("");


		try {
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:603:49: ( ET | OU )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==ET) ) {
				alt2=1;
			}
			else if ( (LA2_0==OU) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:604:2: ET
					{
					match(input,ET,FOLLOW_ET_in_conj1730); 

							conj_arbre.ajouteFils(new Arbre("", "AND "));
						
					}
					break;
				case 2 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:607:4: OU
					{
					match(input,OU,FOLLOW_OU_in_conj1737); 

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
	// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:611:1: dat returns [Arbre les_pars_arbre = new Arbre(\"\")] : (a= NBR |m= MOIS |m= MOIS a= NBR |j= JOURS m= MOIS |j= NBR m= MOIS a= NBR );
	public final Arbre dat() {
		Arbre les_pars_arbre =  new Arbre("");


		Token a=null;
		Token m=null;
		Token j=null;

		try {
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:611:52: (a= NBR |m= MOIS |m= MOIS a= NBR |j= JOURS m= MOIS |j= NBR m= MOIS a= NBR )
			int alt3=5;
			switch ( input.LA(1) ) {
			case NBR:
				{
				int LA3_1 = input.LA(2);
				if ( (LA3_1==MOIS) ) {
					alt3=5;
				}
				else if ( (LA3_1==AUTEUR||LA3_1==ET||(LA3_1 >= PARLER && LA3_1 <= POINT)) ) {
					alt3=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case MOIS:
				{
				int LA3_2 = input.LA(2);
				if ( (LA3_2==NBR) ) {
					alt3=3;
				}
				else if ( (LA3_2==AUTEUR||LA3_2==ET||(LA3_2 >= PARLER && LA3_2 <= POINT)) ) {
					alt3=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case JOURS:
				{
				alt3=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:612:2: a= NBR
					{
					a=(Token)match(input,NBR,FOLLOW_NBR_in_dat1756); 

							les_pars_arbre.ajouteFils(new Arbre("", "annee = '" + a.getText() + "' "));
						
					}
					break;
				case 2 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:615:4: m= MOIS
					{
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_dat1767); 

							les_pars_arbre.ajouteFils(new Arbre("", "mois = '" + m.getText() + "' "));
						
					}
					break;
				case 3 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:618:4: m= MOIS a= NBR
					{
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_dat1778); 
					a=(Token)match(input,NBR,FOLLOW_NBR_in_dat1784); 

							les_pars_arbre.ajouteFils(new Arbre("", "mois = '" + m.getText() + "' "));
							les_pars_arbre.ajouteFils(new Arbre("", "AND annee = '" + a.getText() + "' "));
						
					}
					break;
				case 4 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:622:4: j= JOURS m= MOIS
					{
					j=(Token)match(input,JOURS,FOLLOW_JOURS_in_dat1795); 
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_dat1801); 

							les_pars_arbre.ajouteFils(new Arbre("", "jour = '" + j.getText() + "' "));
							les_pars_arbre.ajouteFils(new Arbre("", "AND mois = '" + m.getText() + "' "));
							
					}
					break;
				case 5 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:626:4: j= NBR m= MOIS a= NBR
					{
					j=(Token)match(input,NBR,FOLLOW_NBR_in_dat1812); 
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_dat1818); 
					a=(Token)match(input,NBR,FOLLOW_NBR_in_dat1824); 

							les_pars_arbre.ajouteFils(new Arbre("", "jj = '" + j.getText() + "' "));
							les_pars_arbre.ajouteFils(new Arbre("", "AND mois = '" + m.getText() + "' "));
							les_pars_arbre.ajouteFils(new Arbre("", "AND annee = '" + a.getText() + "' "));
						
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
	// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:632:1: email returns [Arbre les_pars_arbre = new Arbre(\"\")] : (a1= VAR a= AT a2= VAR (n= NBR )? p= POINT a3= VAR | EMAIL a1= VAR a= AT a2= VAR p= POINT a3= VAR | EMAIL AUTEUR a1= VAR a= AT a2= VAR p= POINT a3= VAR | EMAIL a= AT a1= VAR p= POINT a2= VAR );
	public final Arbre email() {
		Arbre les_pars_arbre =  new Arbre("");


		Token a1=null;
		Token a=null;
		Token a2=null;
		Token n=null;
		Token p=null;
		Token a3=null;

		try {
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:632:54: (a1= VAR a= AT a2= VAR (n= NBR )? p= POINT a3= VAR | EMAIL a1= VAR a= AT a2= VAR p= POINT a3= VAR | EMAIL AUTEUR a1= VAR a= AT a2= VAR p= POINT a3= VAR | EMAIL a= AT a1= VAR p= POINT a2= VAR )
			int alt5=4;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==VAR) ) {
				alt5=1;
			}
			else if ( (LA5_0==EMAIL) ) {
				switch ( input.LA(2) ) {
				case VAR:
					{
					alt5=2;
					}
					break;
				case AUTEUR:
					{
					alt5=3;
					}
					break;
				case AT:
					{
					alt5=4;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:633:2: a1= VAR a= AT a2= VAR (n= NBR )? p= POINT a3= VAR
					{
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_email1843); 
					a=(Token)match(input,AT,FOLLOW_AT_in_email1849); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_email1855); 
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:633:29: (n= NBR )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==NBR) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:633:29: n= NBR
							{
							n=(Token)match(input,NBR,FOLLOW_NBR_in_email1861); 
							}
							break;

					}

					p=(Token)match(input,POINT,FOLLOW_POINT_in_email1868); 
					a3=(Token)match(input,VAR,FOLLOW_VAR_in_email1874); 

							les_pars_arbre.ajouteFils(new Arbre("", "email = '" + a1.getText() + a.getText() + a2.getText() + n.getText() + p.getText() + a3.getText() + "' "));
						
					}
					break;
				case 2 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:637:4: EMAIL a1= VAR a= AT a2= VAR p= POINT a3= VAR
					{
					match(input,EMAIL,FOLLOW_EMAIL_in_email1882); 
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_email1888); 
					a=(Token)match(input,AT,FOLLOW_AT_in_email1894); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_email1900); 
					p=(Token)match(input,POINT,FOLLOW_POINT_in_email1906); 
					a3=(Token)match(input,VAR,FOLLOW_VAR_in_email1912); 

								les_pars_arbre.ajouteFils(new Arbre("", "email = '" + a1.getText() + a.getText() + a2.getText() + p.getText() + a3.getText() + "' "));
						
					}
					break;
				case 3 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:640:4: EMAIL AUTEUR a1= VAR a= AT a2= VAR p= POINT a3= VAR
					{
					match(input,EMAIL,FOLLOW_EMAIL_in_email1919); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_email1921); 
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_email1927); 
					a=(Token)match(input,AT,FOLLOW_AT_in_email1933); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_email1939); 
					p=(Token)match(input,POINT,FOLLOW_POINT_in_email1945); 
					a3=(Token)match(input,VAR,FOLLOW_VAR_in_email1951); 

							les_pars_arbre.ajouteFils(new Arbre("", "email = '" + a1.getText() + a.getText() + a2.getText() + p.getText() + a3.getText() + "' "));
						
					}
					break;
				case 4 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:643:4: EMAIL a= AT a1= VAR p= POINT a2= VAR
					{
					match(input,EMAIL,FOLLOW_EMAIL_in_email1958); 
					a=(Token)match(input,AT,FOLLOW_AT_in_email1964); 
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_email1970); 
					p=(Token)match(input,POINT,FOLLOW_POINT_in_email1976); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_email1982); 

							les_pars_arbre.ajouteFils(new Arbre("", "email = '" + a.getText() + a1.getText() + p.getText() + a2.getText() + "' "));
						
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
	// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:647:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
	public final String listerequetes() {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:648:26: (r= requete POINT )
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:649:3: r= requete POINT
			{
			pushFollow(FOLLOW_requete_in_listerequetes2008);
			r=requete();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_listerequetes2010); 

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
	// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:654:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : (a= VAR |a1= NBR a2= MOIS |a1= VAR a2= VAR |a1= VAR a2= VAR a3= VAR |a1= VAR a2= VAR a3= VAR a4= VAR );
	public final Arbre param() {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;
		Token a1=null;
		Token a2=null;
		Token a3=null;
		Token a4=null;

		try {
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:654:51: (a= VAR |a1= NBR a2= MOIS |a1= VAR a2= VAR |a1= VAR a2= VAR a3= VAR |a1= VAR a2= VAR a3= VAR a4= VAR )
			int alt6=5;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==VAR) ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1==VAR) ) {
					int LA6_3 = input.LA(3);
					if ( (LA6_3==VAR) ) {
						int LA6_5 = input.LA(4);
						if ( (LA6_5==VAR) ) {
							alt6=5;
						}
						else if ( (LA6_5==AUTEUR||LA6_5==DATE||(LA6_5 >= ENTRE && LA6_5 <= MOIS)||(LA6_5 >= NBR && LA6_5 <= OU)||(LA6_5 >= PARLER && LA6_5 <= POINT)||LA6_5==RUBRIQUE) ) {
							alt6=4;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 6, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA6_3==AUTEUR||LA6_3==DATE||(LA6_3 >= ENTRE && LA6_3 <= MOIS)||(LA6_3 >= NBR && LA6_3 <= OU)||(LA6_3 >= PARLER && LA6_3 <= POINT)||LA6_3==RUBRIQUE) ) {
						alt6=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA6_1==AUTEUR||LA6_1==DATE||(LA6_1 >= ENTRE && LA6_1 <= MOIS)||(LA6_1 >= NBR && LA6_1 <= OU)||(LA6_1 >= PARLER && LA6_1 <= POINT)||LA6_1==RUBRIQUE) ) {
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
			else if ( (LA6_0==NBR) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:655:2: a= VAR
					{
					a=(Token)match(input,VAR,FOLLOW_VAR_in_param2029); 

							lepar_arbre.ajouteFils(new Arbre("", a.getText() + "' "));
						
					}
					break;
				case 2 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:658:4: a1= NBR a2= MOIS
					{
					a1=(Token)match(input,NBR,FOLLOW_NBR_in_param2040); 
					a2=(Token)match(input,MOIS,FOLLOW_MOIS_in_param2046); 

						 	lepar_arbre.ajouteFils(new Arbre("", a1.getText() + "' "));
						 	lepar_arbre.ajouteFils(new Arbre("", "AND mot = '" + a2.getText() + "' "));
						 
					}
					break;
				case 3 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:662:5: a1= VAR a2= VAR
					{
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_param2058); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_param2064); 

							lepar_arbre.ajouteFils(new Arbre("", a1.getText() + "' "));
							lepar_arbre.ajouteFils(new Arbre("", "AND mot = '" + a2.getText() + "' "));
						
					}
					break;
				case 4 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:666:4: a1= VAR a2= VAR a3= VAR
					{
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_param2075); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_param2081); 
					a3=(Token)match(input,VAR,FOLLOW_VAR_in_param2087); 

							lepar_arbre.ajouteFils(new Arbre("", a1.getText() + "' "));
							lepar_arbre.ajouteFils(new Arbre("", "AND mot = '" + a2.getText() + "' "));
							lepar_arbre.ajouteFils(new Arbre("", "AND mot = '" + a3.getText() + "' "));
						
					}
					break;
				case 5 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:671:4: a1= VAR a2= VAR a3= VAR a4= VAR
					{
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_param2098); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_param2104); 
					a3=(Token)match(input,VAR,FOLLOW_VAR_in_param2110); 
					a4=(Token)match(input,VAR,FOLLOW_VAR_in_param2116); 

							lepar_arbre.ajouteFils(new Arbre("", a1.getText() + "' "));
							lepar_arbre.ajouteFils(new Arbre("", "AND mot = '" + a2.getText() + "' "));
							lepar_arbre.ajouteFils(new Arbre("", "AND mot = '" + a3.getText() + "' "));
							lepar_arbre.ajouteFils(new Arbre("", "AND mot = '" + a4.getText() + "' "));
						
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
	// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:678:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param (c= conj par2= param )* ;
	public final Arbre params() {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre c =null;
		Arbre par2 =null;


				Arbre par1_arbre, par2_arbre, conj_arbre, dat_arbre;
			
		try {
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:681:4: (par1= param (c= conj par2= param )* )
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:682:3: par1= param (c= conj par2= param )*
			{
			pushFollow(FOLLOW_param_in_params2141);
			par1=param();
			state._fsp--;


						par1_arbre = par1;
						les_pars_arbre.ajouteFils(par1_arbre);
					
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:686:3: (c= conj par2= param )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==ET) ) {
					int LA7_2 = input.LA(2);
					if ( (LA7_2==NBR||LA7_2==VAR) ) {
						alt7=1;
					}

				}
				else if ( (LA7_0==OU) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:686:4: c= conj par2= param
					{
					pushFollow(FOLLOW_conj_in_params2152);
					c=conj();
					state._fsp--;

					pushFollow(FOLLOW_param_in_params2158);
					par2=param();
					state._fsp--;


								conj_arbre = c;
								par2_arbre = par2;
								les_pars_arbre.ajouteFils(conj_arbre);
								les_pars_arbre.ajouteFils(new Arbre("", "mot = '"));
								les_pars_arbre.ajouteFils(par2_arbre);
							
					}
					break;

				default :
					break loop7;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "params"

	// Delegated rules


	protected DFA1 dfa1 = new DFA1(this);
	static final String DFA1_eotS =
		"\u00df\uffff";
	static final String DFA1_eofS =
		"\u00df\uffff";
	static final String DFA1_minS =
		"\1\4\1\16\1\4\1\uffff\1\4\2\uffff\1\21\1\13\1\uffff\1\21\1\24\1\14\1\6"+
		"\1\4\1\31\1\4\1\uffff\1\4\1\14\1\15\1\21\1\15\1\17\1\4\2\5\1\15\1\17\2"+
		"\21\2\uffff\1\21\1\13\3\6\1\17\1\21\1\uffff\1\21\1\6\11\uffff\1\15\1\17"+
		"\1\15\2\21\2\uffff\1\15\1\14\1\uffff\1\35\1\5\2\35\1\15\2\21\1\uffff\2"+
		"\15\1\17\1\14\1\17\1\11\1\17\2\5\1\uffff\1\6\2\21\2\uffff\1\6\2\uffff"+
		"\2\6\7\uffff\1\15\2\21\3\uffff\3\15\1\17\2\uffff\1\21\1\35\1\5\1\25\1"+
		"\15\1\uffff\1\15\1\17\1\15\2\21\2\uffff\1\15\1\14\2\21\2\uffff\1\14\1"+
		"\11\2\21\3\uffff\1\11\1\35\1\5\2\35\2\6\1\17\1\6\2\15\1\17\3\15\1\25\1"+
		"\35\1\25\2\35\5\15\1\17\2\14\1\17\2\11\1\17\1\21\1\35\1\5\1\25\3\6\4\15"+
		"\1\24\1\35\1\25\1\24\4\15\3\14\3\11\1\25\1\35\1\25\2\35\1\6\2\15\2\uffff"+
		"\1\24\1\35\2\15\1\14\1\11\1\15\1\35\1\25\1\15\1\6\1\15\1\24\1\15\1\14"+
		"\1\11\2\uffff\1\15\1\35\1\15";
	static final String DFA1_maxS =
		"\1\32\1\24\1\31\1\uffff\1\33\2\uffff\2\35\1\uffff\1\35\1\24\2\35\1\15"+
		"\1\31\1\24\1\uffff\3\24\2\35\1\17\1\21\1\5\2\35\1\17\2\35\2\uffff\3\35"+
		"\1\17\1\21\1\17\1\35\1\uffff\1\35\1\31\11\uffff\1\35\1\17\3\35\2\uffff"+
		"\1\25\1\24\1\uffff\1\35\1\5\5\35\1\uffff\1\31\1\35\1\17\1\35\1\17\1\35"+
		"\1\17\2\35\1\uffff\3\35\2\uffff\1\24\2\uffff\2\15\7\uffff\3\35\3\uffff"+
		"\1\25\2\35\1\17\2\uffff\1\25\1\35\1\5\1\25\1\35\1\uffff\1\35\1\17\3\35"+
		"\2\uffff\1\25\3\35\2\uffff\1\25\3\35\3\uffff\1\25\1\35\1\5\4\35\1\17\1"+
		"\15\2\35\1\17\1\25\1\35\2\25\1\35\1\25\2\35\1\31\1\35\1\31\2\35\1\17\2"+
		"\35\1\17\2\35\1\17\1\25\1\35\1\5\1\25\1\24\1\35\1\24\1\25\1\35\1\25\1"+
		"\35\1\25\1\35\2\25\1\35\1\25\1\35\2\25\1\35\2\25\1\35\2\25\1\35\1\25\4"+
		"\35\1\25\2\uffff\1\25\1\35\1\31\3\35\1\25\1\35\2\25\1\24\5\25\2\uffff"+
		"\1\25\1\35\1\25";
	static final String DFA1_acceptS =
		"\3\uffff\1\26\1\uffff\1\2\1\1\2\uffff\1\15\7\uffff\1\52\15\uffff\1\24"+
		"\1\25\7\uffff\1\43\2\uffff\1\51\1\53\1\54\1\55\1\56\1\60\1\57\1\61\1\62"+
		"\5\uffff\1\4\1\6\2\uffff\1\11\7\uffff\1\17\11\uffff\1\35\3\uffff\1\30"+
		"\1\37\1\uffff\1\33\1\40\2\uffff\1\41\1\42\1\45\1\44\1\46\1\47\1\50\3\uffff"+
		"\1\3\1\5\1\7\4\uffff\1\10\1\12\5\uffff\1\16\5\uffff\1\20\1\21\4\uffff"+
		"\1\22\1\23\4\uffff\1\27\1\31\1\32\101\uffff\1\13\1\14\20\uffff\1\34\1"+
		"\36\3\uffff";
	static final String DFA1_specialS =
		"\u00df\uffff}>";
	static final String[] DFA1_transitionS = {
			"\1\1\2\uffff\1\2\3\uffff\1\3\16\uffff\1\4",
			"\2\6\1\uffff\1\6\2\uffff\1\5",
			"\1\7\1\uffff\1\10\7\uffff\1\11\1\uffff\1\12\2\uffff\1\13\5\uffff\1\14",
			"",
			"\1\15\1\uffff\1\16\1\17\1\uffff\1\20\1\uffff\1\21\7\uffff\1\22\5\uffff"+
			"\1\23\1\uffff\1\24",
			"",
			"",
			"\1\27\2\uffff\1\25\10\uffff\1\26",
			"\1\32\10\uffff\1\30\10\uffff\1\31",
			"",
			"\1\34\13\uffff\1\33",
			"\1\35",
			"\1\37\4\uffff\1\40\2\uffff\1\36\10\uffff\1\40",
			"\1\42\7\uffff\1\46\1\45\1\uffff\1\44\2\uffff\1\41\10\uffff\1\43",
			"\1\47\10\uffff\1\50",
			"\1\51",
			"\1\52\17\uffff\1\53",
			"",
			"\1\54\17\uffff\1\55",
			"\1\56\1\60\2\61\1\uffff\1\61\2\uffff\1\57",
			"\1\62\6\uffff\1\63",
			"\1\65\13\uffff\1\64",
			"\1\67\4\uffff\1\70\1\uffff\1\71\1\72\7\uffff\1\66",
			"\1\73",
			"\1\74\11\uffff\2\75\1\uffff\1\75",
			"\1\76",
			"\1\101\1\100\26\uffff\1\77",
			"\1\103\4\uffff\1\104\6\uffff\1\105\3\uffff\1\102",
			"\1\106",
			"\1\110\13\uffff\1\107",
			"\1\112\13\uffff\1\111",
			"",
			"",
			"\1\114\13\uffff\1\113",
			"\1\116\5\uffff\1\117\13\uffff\1\115",
			"\1\124\6\uffff\1\121\4\uffff\1\122\1\uffff\1\123\10\uffff\1\120",
			"\1\126\6\uffff\1\127\1\uffff\1\125",
			"\1\126\6\uffff\1\127\3\uffff\1\130",
			"\1\131",
			"\1\133\2\uffff\1\132\10\uffff\1\133",
			"",
			"\1\135\2\uffff\1\134\10\uffff\1\135",
			"\1\136\15\uffff\1\140\4\uffff\1\137",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\142\2\146\1\uffff\1\146\1\143\1\uffff\1\145\1\144\7\uffff\1\141",
			"\1\147",
			"\1\67\4\uffff\1\70\1\uffff\1\71\1\72\7\uffff\1\150",
			"\1\152\13\uffff\1\151",
			"\1\152\13\uffff\1\151",
			"",
			"",
			"\1\67\4\uffff\1\70\1\uffff\1\71\1\72",
			"\1\153\7\uffff\1\154",
			"",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\103\4\uffff\1\104\6\uffff\1\105\3\uffff\1\161",
			"\1\164\10\uffff\1\162\2\uffff\1\163",
			"\1\164\13\uffff\1\163",
			"",
			"\1\103\4\uffff\1\104\6\uffff\1\105",
			"\1\166\2\171\1\uffff\1\171\1\167\2\uffff\1\170\7\uffff\1\165",
			"\1\172",
			"\1\176\1\174\4\uffff\1\175\2\uffff\1\177\7\uffff\1\173",
			"\1\u0080",
			"\1\u0086\2\uffff\1\u0084\1\u0082\4\uffff\1\u0083\2\uffff\1\u0085\7\uffff"+
			"\1\u0081",
			"\1\u0087",
			"\1\u0088\7\uffff\1\117\4\uffff\1\117\2\uffff\1\117\7\uffff\1\117",
			"\1\u008b\1\u008a\26\uffff\1\u0089",
			"",
			"\1\124\6\uffff\1\121\4\uffff\1\122\1\uffff\1\123\10\uffff\1\u008c",
			"\1\u008e\13\uffff\1\u008d",
			"\1\u008e\13\uffff\1\u008d",
			"",
			"",
			"\1\124\6\uffff\1\121\3\uffff\1\u008f\1\122\1\uffff\1\123",
			"",
			"",
			"\1\126\6\uffff\1\127",
			"\1\126\6\uffff\1\127",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\142\2\146\1\uffff\1\146\1\143\1\uffff\1\145\1\144\7\uffff\1\u0090",
			"\1\u0092\13\uffff\1\u0091",
			"\1\u0092\13\uffff\1\u0091",
			"",
			"",
			"",
			"\1\142\2\146\1\uffff\1\146\1\143\1\uffff\1\145\1\144",
			"\1\67\4\uffff\1\70\1\uffff\1\71\1\72\7\uffff\1\u0093",
			"\1\67\4\uffff\1\70\1\uffff\1\71\1\72\7\uffff\1\u0094",
			"\1\u0095",
			"",
			"",
			"\1\u0096\3\uffff\1\u0097",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a",
			"\1\103\4\uffff\1\104\6\uffff\1\105\3\uffff\1\u009b",
			"",
			"\1\103\4\uffff\1\104\6\uffff\1\105\3\uffff\1\u009c",
			"\1\u009d",
			"\1\166\2\171\1\uffff\1\171\1\167\2\uffff\1\170\7\uffff\1\u009e",
			"\1\u00a0\13\uffff\1\u009f",
			"\1\u00a0\13\uffff\1\u009f",
			"",
			"",
			"\1\166\2\171\1\uffff\1\171\1\167\2\uffff\1\170",
			"\1\176\1\174\4\uffff\1\175\2\uffff\1\177\7\uffff\1\u00a1",
			"\1\u00a3\13\uffff\1\u00a2",
			"\1\u00a3\13\uffff\1\u00a2",
			"",
			"",
			"\1\176\1\174\4\uffff\1\175\2\uffff\1\177",
			"\1\u0086\2\uffff\1\u0084\1\u0082\4\uffff\1\u0083\2\uffff\1\u0085\7\uffff"+
			"\1\u00a4",
			"\1\u00a6\13\uffff\1\u00a5",
			"\1\u00a6\13\uffff\1\u00a5",
			"",
			"",
			"",
			"\1\u0086\2\uffff\1\u0084\1\u0082\4\uffff\1\u0083\2\uffff\1\u0085",
			"\1\u00a7",
			"\1\u00a8",
			"\1\u00a9",
			"\1\u00aa",
			"\1\124\6\uffff\1\121\4\uffff\1\122\1\uffff\1\123\10\uffff\1\u00ab",
			"\1\124\6\uffff\1\121\4\uffff\1\122\1\uffff\1\123\10\uffff\1\u00ac",
			"\1\u00ad",
			"\1\126\6\uffff\1\127",
			"\1\142\2\146\1\uffff\1\146\1\143\1\uffff\1\145\1\144\7\uffff\1\u00ae",
			"\1\142\2\146\1\uffff\1\146\1\143\1\uffff\1\145\1\144\7\uffff\1\u00af",
			"\1\u00b0",
			"\1\67\4\uffff\1\70\1\uffff\1\71\1\72",
			"\1\67\4\uffff\1\70\1\uffff\1\71\1\72\7\uffff\1\u00b1",
			"\1\67\4\uffff\1\70\1\uffff\1\71\1\72",
			"\1\u0097",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\1\u00b5",
			"\1\103\4\uffff\1\104\6\uffff\1\105",
			"\1\103\4\uffff\1\104\6\uffff\1\105\3\uffff\1\u00b6",
			"\1\103\4\uffff\1\104\6\uffff\1\105",
			"\1\166\2\171\1\uffff\1\171\1\167\2\uffff\1\170\7\uffff\1\u00b7",
			"\1\166\2\171\1\uffff\1\171\1\167\2\uffff\1\170\7\uffff\1\u00b8",
			"\1\u00b9",
			"\1\176\1\174\4\uffff\1\175\2\uffff\1\177\7\uffff\1\u00ba",
			"\1\176\1\174\4\uffff\1\175\2\uffff\1\177\7\uffff\1\u00bb",
			"\1\u00bc",
			"\1\u0086\2\uffff\1\u0084\1\u0082\4\uffff\1\u0083\2\uffff\1\u0085\7\uffff"+
			"\1\u00bd",
			"\1\u0086\2\uffff\1\u0084\1\u0082\4\uffff\1\u0083\2\uffff\1\u0085\7\uffff"+
			"\1\u00be",
			"\1\u00bf",
			"\1\u00c0\3\uffff\1\u00c1",
			"\1\u00c2",
			"\1\u00c3",
			"\1\u00c4",
			"\1\124\6\uffff\1\121\4\uffff\1\122\1\uffff\1\123",
			"\1\124\6\uffff\1\121\4\uffff\1\122\1\uffff\1\123\10\uffff\1\u00c5",
			"\1\124\6\uffff\1\121\4\uffff\1\122\1\uffff\1\123",
			"\1\142\2\146\1\uffff\1\146\1\143\1\uffff\1\145\1\144",
			"\1\142\2\146\1\uffff\1\146\1\143\1\uffff\1\145\1\144\7\uffff\1\u00c6",
			"\1\142\2\146\1\uffff\1\146\1\143\1\uffff\1\145\1\144",
			"\1\67\4\uffff\1\70\1\uffff\1\71\1\72\7\uffff\1\u00c7",
			"\1\u00c9\1\u00c8",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00c9\1\u00c8",
			"\1\103\4\uffff\1\104\6\uffff\1\105\3\uffff\1\u00cc",
			"\1\166\2\171\1\uffff\1\171\1\167\2\uffff\1\170",
			"\1\166\2\171\1\uffff\1\171\1\167\2\uffff\1\170\7\uffff\1\u00cd",
			"\1\166\2\171\1\uffff\1\171\1\167\2\uffff\1\170",
			"\1\176\1\174\4\uffff\1\175\2\uffff\1\177",
			"\1\176\1\174\4\uffff\1\175\2\uffff\1\177\7\uffff\1\u00ce",
			"\1\176\1\174\4\uffff\1\175\2\uffff\1\177",
			"\1\u0086\2\uffff\1\u0084\1\u0082\4\uffff\1\u0083\2\uffff\1\u0085",
			"\1\u0086\2\uffff\1\u0084\1\u0082\4\uffff\1\u0083\2\uffff\1\u0085\7\uffff"+
			"\1\u00cf",
			"\1\u0086\2\uffff\1\u0084\1\u0082\4\uffff\1\u0083\2\uffff\1\u0085",
			"\1\u00c1",
			"\1\u00d0",
			"\1\u00d1",
			"\1\u00d2",
			"\1\u00d3",
			"\1\124\6\uffff\1\121\4\uffff\1\122\1\uffff\1\123\10\uffff\1\u00d4",
			"\1\142\2\146\1\uffff\1\146\1\143\1\uffff\1\145\1\144\7\uffff\1\u00d5",
			"\1\67\4\uffff\1\70\1\uffff\1\71\1\72",
			"",
			"",
			"\1\u00c9\1\u00c8",
			"\1\u00d6",
			"\1\103\4\uffff\1\104\6\uffff\1\105",
			"\1\166\2\171\1\uffff\1\171\1\167\2\uffff\1\170\7\uffff\1\u00d7",
			"\1\176\1\174\4\uffff\1\175\2\uffff\1\177\7\uffff\1\u00d8",
			"\1\u0086\2\uffff\1\u0084\1\u0082\4\uffff\1\u0083\2\uffff\1\u0085\7\uffff"+
			"\1\u00d9",
			"\1\u00da\7\uffff\1\u00db",
			"\1\u00dc",
			"\1\u00dd",
			"\1\u00da\7\uffff\1\u00db",
			"\1\124\6\uffff\1\121\4\uffff\1\122\1\uffff\1\123",
			"\1\142\2\146\1\uffff\1\146\1\143\1\uffff\1\145\1\144",
			"\1\u00c9\1\u00c8",
			"\1\166\2\171\1\uffff\1\171\1\167\2\uffff\1\170",
			"\1\176\1\174\4\uffff\1\175\2\uffff\1\177",
			"\1\u0086\2\uffff\1\u0084\1\u0082\4\uffff\1\u0083\2\uffff\1\u0085",
			"",
			"",
			"\1\u00da\7\uffff\1\u00db",
			"\1\u00de",
			"\1\u00da\7\uffff\1\u00db"
	};

	static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
	static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
	static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
	static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
	static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
	static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
	static final short[][] DFA1_transition;

	static {
		int numStates = DFA1_transitionS.length;
		DFA1_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
		}
	}

	protected class DFA1 extends DFA {

		public DFA1(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 1;
			this.eot = DFA1_eot;
			this.eof = DFA1_eof;
			this.min = DFA1_min;
			this.max = DFA1_max;
			this.accept = DFA1_accept;
			this.special = DFA1_special;
			this.transition = DFA1_transition;
		}
		@Override
		public String getDescription() {
			return "36:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( ARTICLE d= dat PARLER ps= params | ARTICLE PARLER ps= params | COMBIEN ARTICLE PARLER ps= params | COMBIEN ARTICLE ps1= params PARLER ps2= params | COMBIEN ARTICLE PARLER ps1= params PARLER ps2= params | COMBIEN ARTICLE ps= params | COMBIEN ARTICLE PARLER ps= params d= dat | COMBIEN AUTEUR PARLER ARTICLE ENTRE d1= dat ET d2= dat | COMBIEN AUTEUR PARLER d= dat | COMBIEN AUTEUR PARLER ARTICLE PARLER ps= params | COMBIEN AUTEUR e= email | COMBIEN AUTEUR e= email PARLER ps= params | COMBIEN JOURS PARLER ps= params | COMBIEN MOT ps= params ET SELECT ARTICLE | COMBIEN MOT ps= params r= RUBRIQUE | COMBIEN PAGE PARLER ps= params | COMBIEN PAGE PARLER ps= params d= dat | COMBIEN r= RUBRIQUE PARLER ps= params ENTRE d1= dat ET d2= dat | COMBIEN r= RUBRIQUE PARLER ps= params | COMBIEN r= RUBRIQUE ENTRE d1= dat ET d2= dat PARLER ps= params | COMBIEN r= RUBRIQUE ps= params | EMAIL AUTEUR ps= params | SELECT ARTICLE PARLER ps= params ENTRE d1= dat ET d2= dat | SELECT ARTICLE ps1= params PARLER ps2= params | SELECT ARTICLE PARLER ps= params | SELECT ARTICLE PARLER ps= params DATE d= dat | SELECT ARTICLE d= dat AUTEUR e= email | SELECT ARTICLE AUTEUR e= email ET PARLER r= RUBRIQUE | SELECT ARTICLE AUTEUR ps= params | SELECT ARTICLE AUTEUR e= email | SELECT ARTICLE ps1= params AUTEUR ps2= params | SELECT ARTICLE d= dat ET PARLER ps= params | SELECT AUTEUR ARTICLE PARLER ps= params | SELECT AUTEUR ARTICLE ps= params | SELECT AUTEUR ET EMAIL ARTICLE TODAY | SELECT COMBIEN r= RUBRIQUE ps= params AUTEUR DATE | SELECT COMBIEN r= RUBRIQUE PARLER ps= params | SELECT DATE ARTICLE AUTEUR ps= params | SELECT DATE ARTICLE r= RUBRIQUE e= email | SELECT DATE ARTICLE PARLER ps= params | SELECT DATE PARLER ps= params | SELECT EMAIL AUTEUR ps= params | SELECT PAGE ARTICLE AUTEUR AUTEUR e= email | SELECT PAGE PARLER ps= params | SELECT r= RUBRIQUE ENTRE d1= dat ET d2= dat | SELECT r= RUBRIQUE PARLER ps= params | SELECT r= RUBRIQUE d= dat | SELECT r1= RUBRIQUE ET r2= RUBRIQUE PARLER ps= params | SELECT TITRE ET DATE ARTICLE PARLER ps= params | SELECT TITRE PARLER ps= params );";
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
	public static final BitSet FOLLOW_AUTEUR_in_requete552 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete554 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete556 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ENTRE_in_requete558 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete564 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ET_in_requete566 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete586 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete588 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete590 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete611 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete613 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete615 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete618 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete620 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete635 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete637 = new BitSet(new long[]{0x0000000020000800L});
	public static final BitSet FOLLOW_email_in_requete643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete657 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete659 = new BitSet(new long[]{0x0000000020000800L});
	public static final BitSet FOLLOW_email_in_requete665 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete667 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete687 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_JOURS_in_requete689 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete691 = new BitSet(new long[]{0x0000000020020000L});
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
	public static final BitSet FOLLOW_PARLER_in_requete770 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete790 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_PAGE_in_requete792 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete794 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete800 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete822 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete828 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete830 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete836 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ENTRE_in_requete838 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete844 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ET_in_requete846 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete882 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete888 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete890 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete910 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete916 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ENTRE_in_requete918 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete924 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ET_in_requete926 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete932 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete934 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete952 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete958 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EMAIL_in_requete980 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete982 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1007 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1009 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1011 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1018 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ENTRE_in_requete1020 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete1026 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ET_in_requete1028 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete1034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1048 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1050 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1056 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1058 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1082 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1084 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1086 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1103 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1105 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1107 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1113 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_DATE_in_requete1115 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete1121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1132 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1134 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete1140 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1142 = new BitSet(new long[]{0x0000000020000800L});
	public static final BitSet FOLLOW_email_in_requete1148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1157 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1159 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1161 = new BitSet(new long[]{0x0000000020000800L});
	public static final BitSet FOLLOW_email_in_requete1167 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ET_in_requete1169 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1171 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete1177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1186 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1188 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1190 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1205 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1207 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1209 = new BitSet(new long[]{0x0000000020000800L});
	public static final BitSet FOLLOW_email_in_requete1215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1224 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1226 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1232 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1234 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1251 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1253 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete1259 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ET_in_requete1261 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1263 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1280 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1282 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1284 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1286 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1301 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1303 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1305 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1320 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1322 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ET_in_requete1324 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_EMAIL_in_requete1326 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1328 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_TODAY_in_requete1330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1343 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COMBIEN_in_requete1345 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete1351 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1357 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1359 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_DATE_in_requete1361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1372 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COMBIEN_in_requete1374 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete1380 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1382 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1399 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_DATE_in_requete1401 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1403 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1405 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1420 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_DATE_in_requete1422 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1424 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete1430 = new BitSet(new long[]{0x0000000020000800L});
	public static final BitSet FOLLOW_email_in_requete1436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1445 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_DATE_in_requete1447 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1449 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1451 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1469 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_DATE_in_requete1471 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1473 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1491 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_EMAIL_in_requete1493 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1495 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1515 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_PAGE_in_requete1517 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1519 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1521 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete1523 = new BitSet(new long[]{0x0000000020000800L});
	public static final BitSet FOLLOW_email_in_requete1529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1540 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_PAGE_in_requete1542 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1544 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1561 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete1567 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ENTRE_in_requete1569 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete1575 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ET_in_requete1577 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete1583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1592 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete1598 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1600 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1606 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1617 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete1623 = new BitSet(new long[]{0x000000000002C000L});
	public static final BitSet FOLLOW_dat_in_requete1629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1640 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete1646 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ET_in_requete1648 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete1654 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1656 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1680 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_TITRE_in_requete1682 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ET_in_requete1684 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_DATE_in_requete1686 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1688 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1690 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete1706 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_TITRE_in_requete1708 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_PARLER_in_requete1710 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_params_in_requete1714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ET_in_conj1730 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OU_in_conj1737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NBR_in_dat1756 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOIS_in_dat1767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOIS_in_dat1778 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NBR_in_dat1784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JOURS_in_dat1795 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOIS_in_dat1801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NBR_in_dat1812 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOIS_in_dat1818 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_NBR_in_dat1824 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_email1843 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AT_in_email1849 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1855 = new BitSet(new long[]{0x0000000000220000L});
	public static final BitSet FOLLOW_NBR_in_email1861 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_POINT_in_email1868 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1874 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EMAIL_in_email1882 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1888 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AT_in_email1894 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1900 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_POINT_in_email1906 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EMAIL_in_email1919 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_email1921 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1927 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AT_in_email1933 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1939 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_POINT_in_email1945 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1951 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EMAIL_in_email1958 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AT_in_email1964 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1970 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_POINT_in_email1976 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_email1982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_requete_in_listerequetes2008 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_POINT_in_listerequetes2010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_param2029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NBR_in_param2040 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_MOIS_in_param2046 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_param2058 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_param2064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_param2075 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_param2081 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_param2087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_param2098 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_param2104 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_param2110 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAR_in_param2116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_params2141 = new BitSet(new long[]{0x0000000000042002L});
	public static final BitSet FOLLOW_conj_in_params2152 = new BitSet(new long[]{0x0000000020020000L});
	public static final BitSet FOLLOW_param_in_params2158 = new BitSet(new long[]{0x0000000000042002L});
}

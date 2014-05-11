// $ANTLR 3.5 /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g 2014-05-11 14:46:39
package antlr.output;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Tal_simpleParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARTICLE", "AT", "AUTEUR", "COMBIEN", 
		"DATE", "EMAIL", "ENTRE", "ET", "JOURS", "MOIS", "MOT", "NBR", "OU", "PAGE", 
		"PARLER", "POINT", "PUBLIE", "RESUME", "RUBRIQUE", "SELECT", "TITRE", 
		"VAR", "WS"
	};
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
	// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:32:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( ARTICLE d= dat PARLER ps= params | COMBIEN ARTICLE PARLER ps= params | COMBIEN ARTICLE ps1= params PARLER ps2= params | COMBIEN ARTICLE PARLER ps1= params PARLER ps2= params | COMBIEN ARTICLE ps= params | COMBIEN ARTICLE PARLER ps= params d= dat | COMBIEN AUTEUR PARLER ARTICLE ENTRE d1= dat ET d2= dat | COMBIEN AUTEUR PARLER d= dat | COMBIEN AUTEUR PARLER ARTICLE PARLER ps= params | COMBIEN r= RUBRIQUE PARLER ps= params | COMBIEN r= RUBRIQUE ENTRE d1= dat ET d2= dat PARLER ps= params | COMBIEN MOT ps= params ET SELECT ARTICLE | COMBIEN AUTEUR e= email | COMBIEN AUTEUR e= email PARLER ps= params | COMBIEN MOT ps= params r= RUBRIQUE | COMBIEN r= RUBRIQUE PARLER ps= params ENTRE d1= jour ET d2= jour | COMBIEN JOURS PARLER ps= params | COMBIEN PAGE PARLER ps= params | COMBIEN PAGE PARLER ps= params d= dat | COMBIEN r= RUBRIQUE ps= params );
	public final Arbre requete() throws  {
		Arbre req_arbre =  new Arbre("");


		Token r=null;
		Arbre d =null;
		Arbre ps =null;
		Arbre ps1 =null;
		Arbre ps2 =null;
		Arbre d1 =null;
		Arbre d2 =null;
		Arbre e =null;

		Arbre ps_arbre, d_arbre;
		try {
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:33:35: ( ARTICLE d= dat PARLER ps= params | COMBIEN ARTICLE PARLER ps= params | COMBIEN ARTICLE ps1= params PARLER ps2= params | COMBIEN ARTICLE PARLER ps1= params PARLER ps2= params | COMBIEN ARTICLE ps= params | COMBIEN ARTICLE PARLER ps= params d= dat | COMBIEN AUTEUR PARLER ARTICLE ENTRE d1= dat ET d2= dat | COMBIEN AUTEUR PARLER d= dat | COMBIEN AUTEUR PARLER ARTICLE PARLER ps= params | COMBIEN r= RUBRIQUE PARLER ps= params | COMBIEN r= RUBRIQUE ENTRE d1= dat ET d2= dat PARLER ps= params | COMBIEN MOT ps= params ET SELECT ARTICLE | COMBIEN AUTEUR e= email | COMBIEN AUTEUR e= email PARLER ps= params | COMBIEN MOT ps= params r= RUBRIQUE | COMBIEN r= RUBRIQUE PARLER ps= params ENTRE d1= jour ET d2= jour | COMBIEN JOURS PARLER ps= params | COMBIEN PAGE PARLER ps= params | COMBIEN PAGE PARLER ps= params d= dat | COMBIEN r= RUBRIQUE ps= params )
			int alt1=20;
			alt1 = dfa1.predict(input);
			switch (alt1) {
				case 1 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:35:4: ARTICLE d= dat PARLER ps= params
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete286); 
					pushFollow(FOLLOW_dat_in_requete292);
					d=dat();
					state._fsp--;

					match(input,PARLER,FOLLOW_PARLER_in_requete294); 
					pushFollow(FOLLOW_params_in_requete298);
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
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:53:5: COMBIEN ARTICLE PARLER ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete336); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete338); 
					match(input,PARLER,FOLLOW_PARLER_in_requete340); 
					pushFollow(FOLLOW_params_in_requete346);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(article) "));
								req_arbre.ajouteFils(new Arbre("", "from ... "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 3 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:62:5: COMBIEN ARTICLE ps1= params PARLER ps2= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete360); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete362); 
					pushFollow(FOLLOW_params_in_requete368);
					ps1=params();
					state._fsp--;

					match(input,PARLER,FOLLOW_PARLER_in_requete370); 
					pushFollow(FOLLOW_params_in_requete376);
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
				case 4 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:74:5: COMBIEN ARTICLE PARLER ps1= params PARLER ps2= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete390); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete392); 
					match(input,PARLER,FOLLOW_PARLER_in_requete394); 
					pushFollow(FOLLOW_params_in_requete400);
					ps1=params();
					state._fsp--;

					match(input,PARLER,FOLLOW_PARLER_in_requete402); 
					pushFollow(FOLLOW_params_in_requete408);
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
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:86:5: COMBIEN ARTICLE ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete422); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete424); 
					pushFollow(FOLLOW_params_in_requete430);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(article) "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where '"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 6 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:96:5: COMBIEN ARTICLE PARLER ps= params d= dat
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete447); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete449); 
					match(input,PARLER,FOLLOW_PARLER_in_requete451); 
					pushFollow(FOLLOW_params_in_requete457);
					ps=params();
					state._fsp--;

					pushFollow(FOLLOW_dat_in_requete463);
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
				case 7 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:108:5: COMBIEN AUTEUR PARLER ARTICLE ENTRE d1= dat ET d2= dat
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete477); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete479); 
					match(input,PARLER,FOLLOW_PARLER_in_requete481); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete483); 
					match(input,ENTRE,FOLLOW_ENTRE_in_requete485); 
					pushFollow(FOLLOW_dat_in_requete491);
					d1=dat();
					state._fsp--;

					match(input,ET,FOLLOW_ET_in_requete493); 
					pushFollow(FOLLOW_dat_in_requete499);
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
				case 8 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:121:5: COMBIEN AUTEUR PARLER d= dat
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete513); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete515); 
					match(input,PARLER,FOLLOW_PARLER_in_requete517); 
					pushFollow(FOLLOW_dat_in_requete524);
					d=dat();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(auteur) "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								d_arbre = d;
								req_arbre.ajouteFils(d_arbre);
							
					}
					break;
				case 9 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:130:5: COMBIEN AUTEUR PARLER ARTICLE PARLER ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete538); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete540); 
					match(input,PARLER,FOLLOW_PARLER_in_requete542); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete545); 
					match(input,PARLER,FOLLOW_PARLER_in_requete547); 
					pushFollow(FOLLOW_params_in_requete553);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(auteur) "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 10 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:145:5: COMBIEN r= RUBRIQUE PARLER ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete585); 
					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete591); 
					match(input,PARLER,FOLLOW_PARLER_in_requete593); 
					pushFollow(FOLLOW_params_in_requete599);
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
				case 11 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:155:5: COMBIEN r= RUBRIQUE ENTRE d1= dat ET d2= dat PARLER ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete613); 
					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete619); 
					match(input,ENTRE,FOLLOW_ENTRE_in_requete621); 
					pushFollow(FOLLOW_dat_in_requete627);
					d1=dat();
					state._fsp--;

					match(input,ET,FOLLOW_ET_in_requete629); 
					pushFollow(FOLLOW_dat_in_requete635);
					d2=dat();
					state._fsp--;

					match(input,PARLER,FOLLOW_PARLER_in_requete637); 
					pushFollow(FOLLOW_params_in_requete644);
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
				case 12 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:172:5: COMBIEN MOT ps= params ET SELECT ARTICLE
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete658); 
					match(input,MOT,FOLLOW_MOT_in_requete660); 
					pushFollow(FOLLOW_params_in_requete666);
					ps=params();
					state._fsp--;

					match(input,ET,FOLLOW_ET_in_requete668); 
					match(input,SELECT,FOLLOW_SELECT_in_requete670); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete672); 

								req_arbre.ajouteFils(new Arbre("", "select count(mot)"));
								req_arbre.ajouteFils(new Arbre("", ", article "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where mot = '"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 13 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:182:5: COMBIEN AUTEUR e= email
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete686); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete688); 
					pushFollow(FOLLOW_email_in_requete694);
					e=email();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(auteur) "));
								req_arbre.ajouteFils(new Arbre("", "from"));
								req_arbre.ajouteFils(new Arbre("", "where "));
								ps_arbre = e;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 14 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:191:5: COMBIEN AUTEUR e= email PARLER ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete708); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete710); 
					pushFollow(FOLLOW_email_in_requete716);
					e=email();
					state._fsp--;

					match(input,PARLER,FOLLOW_PARLER_in_requete718); 
					pushFollow(FOLLOW_params_in_requete724);
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
				case 15 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:203:5: COMBIEN MOT ps= params r= RUBRIQUE
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete738); 
					match(input,MOT,FOLLOW_MOT_in_requete740); 
					pushFollow(FOLLOW_params_in_requete746);
					ps=params();
					state._fsp--;

					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete752); 

								req_arbre.ajouteFils(new Arbre("", "select count(mot) "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where rubrique = '" + r.getText() + "' "));
								req_arbre.ajouteFils(new Arbre("", " AND mot = '"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 16 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:213:5: COMBIEN r= RUBRIQUE PARLER ps= params ENTRE d1= jour ET d2= jour
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete766); 
					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete772); 
					match(input,PARLER,FOLLOW_PARLER_in_requete774); 
					pushFollow(FOLLOW_params_in_requete780);
					ps=params();
					state._fsp--;

					match(input,ENTRE,FOLLOW_ENTRE_in_requete782); 
					pushFollow(FOLLOW_jour_in_requete788);
					d1=jour();
					state._fsp--;

					match(input,ET,FOLLOW_ET_in_requete790); 
					pushFollow(FOLLOW_jour_in_requete796);
					d2=jour();
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
				case 17 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:230:5: COMBIEN JOURS PARLER ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete810); 
					match(input,JOURS,FOLLOW_JOURS_in_requete812); 
					match(input,PARLER,FOLLOW_PARLER_in_requete814); 
					pushFollow(FOLLOW_params_in_requete820);
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
				case 18 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:240:5: COMBIEN PAGE PARLER ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete834); 
					match(input,PAGE,FOLLOW_PAGE_in_requete836); 
					match(input,PARLER,FOLLOW_PARLER_in_requete838); 
					pushFollow(FOLLOW_params_in_requete844);
					ps=params();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("", "select count(page) "));
								req_arbre.ajouteFils(new Arbre("", "from "));
								req_arbre.ajouteFils(new Arbre("", "where mot = '"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					}
					break;
				case 19 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:249:5: COMBIEN PAGE PARLER ps= params d= dat
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete858); 
					match(input,PAGE,FOLLOW_PAGE_in_requete860); 
					match(input,PARLER,FOLLOW_PARLER_in_requete862); 
					pushFollow(FOLLOW_params_in_requete868);
					ps=params();
					state._fsp--;

					pushFollow(FOLLOW_dat_in_requete874);
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
				case 20 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:262:5: COMBIEN r= RUBRIQUE ps= params
					{
					match(input,COMBIEN,FOLLOW_COMBIEN_in_requete888); 
					r=(Token)match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete894); 
					pushFollow(FOLLOW_params_in_requete900);
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
	// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:272:1: conj returns [Arbre conj_arbre = new Arbre(\"\")] : ( ET | OU );
	public final Arbre conj() throws  {
		Arbre conj_arbre =  new Arbre("");


		try {
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:272:49: ( ET | OU )
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
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:273:2: ET
					{
					match(input,ET,FOLLOW_ET_in_conj918); 

							conj_arbre.ajouteFils(new Arbre("", "AND "));
						
					}
					break;
				case 2 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:276:4: OU
					{
					match(input,OU,FOLLOW_OU_in_conj925); 

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
	// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:280:1: dat returns [Arbre les_pars_arbre = new Arbre(\"\")] : (a= NBR |m= MOIS a= NBR |j= NBR m= MOIS a= NBR );
	public final Arbre dat() throws  {
		Arbre les_pars_arbre =  new Arbre("");


		Token a=null;
		Token m=null;
		Token j=null;

		try {
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:280:52: (a= NBR |m= MOIS a= NBR |j= NBR m= MOIS a= NBR )
			int alt3=3;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==NBR) ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1==MOIS) ) {
					alt3=3;
				}
				else if ( (LA3_1==ET||(LA3_1 >= PARLER && LA3_1 <= POINT)) ) {
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
			else if ( (LA3_0==MOIS) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:281:2: a= NBR
					{
					a=(Token)match(input,NBR,FOLLOW_NBR_in_dat944); 

							les_pars_arbre.ajouteFils(new Arbre("", "annee = '" + a.getText() + "' "));
						
					}
					break;
				case 2 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:284:4: m= MOIS a= NBR
					{
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_dat955); 
					a=(Token)match(input,NBR,FOLLOW_NBR_in_dat961); 

							les_pars_arbre.ajouteFils(new Arbre("", "mois = '" + m.getText() + "' "));
							les_pars_arbre.ajouteFils(new Arbre("", "AND annee = '" + a.getText() + "' "));
						
					}
					break;
				case 3 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:288:4: j= NBR m= MOIS a= NBR
					{
					j=(Token)match(input,NBR,FOLLOW_NBR_in_dat972); 
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_dat978); 
					a=(Token)match(input,NBR,FOLLOW_NBR_in_dat984); 

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
	// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:294:1: email returns [Arbre les_pars_arbre = new Arbre(\"\")] : (a1= VAR a= AT a2= VAR p= POINT a3= VAR | EMAIL a1= VAR a= AT a2= VAR p= POINT a3= VAR | EMAIL AUTEUR a1= VAR a= AT a2= VAR p= POINT a3= VAR | EMAIL a= AT a1= VAR p= POINT a2= VAR );
	public final Arbre email() throws  {
		Arbre les_pars_arbre =  new Arbre("");


		Token a1=null;
		Token a=null;
		Token a2=null;
		Token p=null;
		Token a3=null;

		try {
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:294:54: (a1= VAR a= AT a2= VAR p= POINT a3= VAR | EMAIL a1= VAR a= AT a2= VAR p= POINT a3= VAR | EMAIL AUTEUR a1= VAR a= AT a2= VAR p= POINT a3= VAR | EMAIL a= AT a1= VAR p= POINT a2= VAR )
			int alt4=4;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==VAR) ) {
				alt4=1;
			}
			else if ( (LA4_0==EMAIL) ) {
				switch ( input.LA(2) ) {
				case VAR:
					{
					alt4=2;
					}
					break;
				case AUTEUR:
					{
					alt4=3;
					}
					break;
				case AT:
					{
					alt4=4;
					}
					break;
				default:
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

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:295:2: a1= VAR a= AT a2= VAR p= POINT a3= VAR
					{
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_email1003); 
					a=(Token)match(input,AT,FOLLOW_AT_in_email1009); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_email1015); 
					p=(Token)match(input,POINT,FOLLOW_POINT_in_email1021); 
					a3=(Token)match(input,VAR,FOLLOW_VAR_in_email1027); 

							les_pars_arbre.ajouteFils(new Arbre("", "email = '" + a1.getText() + a.getText() + a2.getText() + p.getText() + a3.getText() + "' "));
						
					}
					break;
				case 2 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:298:4: EMAIL a1= VAR a= AT a2= VAR p= POINT a3= VAR
					{
					match(input,EMAIL,FOLLOW_EMAIL_in_email1034); 
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_email1040); 
					a=(Token)match(input,AT,FOLLOW_AT_in_email1046); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_email1052); 
					p=(Token)match(input,POINT,FOLLOW_POINT_in_email1058); 
					a3=(Token)match(input,VAR,FOLLOW_VAR_in_email1064); 

							les_pars_arbre.ajouteFils(new Arbre("", "email = '" + a1.getText() + a.getText() + a2.getText() + p.getText() + a3.getText() + "' "));
						
					}
					break;
				case 3 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:301:4: EMAIL AUTEUR a1= VAR a= AT a2= VAR p= POINT a3= VAR
					{
					match(input,EMAIL,FOLLOW_EMAIL_in_email1071); 
					match(input,AUTEUR,FOLLOW_AUTEUR_in_email1073); 
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_email1079); 
					a=(Token)match(input,AT,FOLLOW_AT_in_email1085); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_email1091); 
					p=(Token)match(input,POINT,FOLLOW_POINT_in_email1097); 
					a3=(Token)match(input,VAR,FOLLOW_VAR_in_email1103); 

							les_pars_arbre.ajouteFils(new Arbre("", "email = '" + a1.getText() + a.getText() + a2.getText() + p.getText() + a3.getText() + "' "));
						
					}
					break;
				case 4 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:304:4: EMAIL a= AT a1= VAR p= POINT a2= VAR
					{
					match(input,EMAIL,FOLLOW_EMAIL_in_email1110); 
					a=(Token)match(input,AT,FOLLOW_AT_in_email1116); 
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_email1122); 
					p=(Token)match(input,POINT,FOLLOW_POINT_in_email1128); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_email1134); 

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



	// $ANTLR start "jour"
	// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:308:1: jour returns [Arbre les_pars_arbre = new Arbre(\"\")] : (j= NBR m= MOIS a= NBR |j= NBR m= MOIS );
	public final Arbre jour() throws  {
		Arbre les_pars_arbre =  new Arbre("");


		Token j=null;
		Token m=null;
		Token a=null;

		try {
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:308:53: (j= NBR m= MOIS a= NBR |j= NBR m= MOIS )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==NBR) ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1==MOIS) ) {
					int LA5_2 = input.LA(3);
					if ( (LA5_2==NBR) ) {
						alt5=1;
					}
					else if ( (LA5_2==ET||LA5_2==POINT) ) {
						alt5=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 2, input);
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
							new NoViableAltException("", 5, 1, input);
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
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:309:3: j= NBR m= MOIS a= NBR
					{
					j=(Token)match(input,NBR,FOLLOW_NBR_in_jour1154); 
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_jour1160); 
					a=(Token)match(input,NBR,FOLLOW_NBR_in_jour1166); 

							les_pars_arbre.ajouteFils(new Arbre("", "'" + j.getText() + m.getText() + a.getText() + "' "));
						
					}
					break;
				case 2 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:312:5: j= NBR m= MOIS
					{
					j=(Token)match(input,NBR,FOLLOW_NBR_in_jour1178); 
					m=(Token)match(input,MOIS,FOLLOW_MOIS_in_jour1184); 

							les_pars_arbre.ajouteFils(new Arbre("", "'" + j.getText() + m.getText() + "' "));
						
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
	// $ANTLR end "jour"



	// $ANTLR start "listerequetes"
	// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:316:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
	public final String listerequetes() throws  {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:317:26: (r= requete POINT )
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:318:3: r= requete POINT
			{
			pushFollow(FOLLOW_requete_in_listerequetes1210);
			r=requete();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_listerequetes1212); 

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
	// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:323:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : (a= VAR |a1= VAR a2= VAR |a1= VAR a2= VAR a3= VAR );
	public final Arbre param() throws  {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;
		Token a1=null;
		Token a2=null;
		Token a3=null;

		try {
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:323:51: (a= VAR |a1= VAR a2= VAR |a1= VAR a2= VAR a3= VAR )
			int alt6=3;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==VAR) ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1==VAR) ) {
					int LA6_2 = input.LA(3);
					if ( (LA6_2==VAR) ) {
						alt6=3;
					}
					else if ( ((LA6_2 >= ENTRE && LA6_2 <= ET)||LA6_2==MOIS||(LA6_2 >= NBR && LA6_2 <= OU)||(LA6_2 >= PARLER && LA6_2 <= POINT)||LA6_2==RUBRIQUE) ) {
						alt6=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( ((LA6_1 >= ENTRE && LA6_1 <= ET)||LA6_1==MOIS||(LA6_1 >= NBR && LA6_1 <= OU)||(LA6_1 >= PARLER && LA6_1 <= POINT)||LA6_1==RUBRIQUE) ) {
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

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:324:2: a= VAR
					{
					a=(Token)match(input,VAR,FOLLOW_VAR_in_param1231); 

							lepar_arbre.ajouteFils(new Arbre("", a.getText() + "' "));
						
					}
					break;
				case 2 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:327:4: a1= VAR a2= VAR
					{
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_param1242); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_param1248); 

							lepar_arbre.ajouteFils(new Arbre("", a1.getText() + "' "));
							lepar_arbre.ajouteFils(new Arbre("", "AND mot = '" + a2.getText() + "' "));
						
					}
					break;
				case 3 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:331:4: a1= VAR a2= VAR a3= VAR
					{
					a1=(Token)match(input,VAR,FOLLOW_VAR_in_param1259); 
					a2=(Token)match(input,VAR,FOLLOW_VAR_in_param1265); 
					a3=(Token)match(input,VAR,FOLLOW_VAR_in_param1271); 

							lepar_arbre.ajouteFils(new Arbre("", a1.getText() + "' "));
							lepar_arbre.ajouteFils(new Arbre("", "AND mot = '" + a2.getText() + "' "));
							lepar_arbre.ajouteFils(new Arbre("", "AND mot = '" + a3.getText() + "' "));
						
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
	// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:337:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param (c= conj par2= param )* ;
	public final Arbre params() throws  {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre c =null;
		Arbre par2 =null;


				Arbre par1_arbre, par2_arbre, conj_arbre, dat_arbre;
			
		try {
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:340:4: (par1= param (c= conj par2= param )* )
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:341:3: par1= param (c= conj par2= param )*
			{
			pushFollow(FOLLOW_param_in_params1297);
			par1=param();
			state._fsp--;


						par1_arbre = par1;
						les_pars_arbre.ajouteFils(par1_arbre);
					
			// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:345:3: (c= conj par2= param )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==ET) ) {
					int LA7_2 = input.LA(2);
					if ( (LA7_2==VAR) ) {
						alt7=1;
					}

				}
				else if ( (LA7_0==OU) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /home/guix/Documents/LO17-Project/lo17-guina/TD4/antlr_guix/Tal_simple.g:345:4: c= conj par2= param
					{
					pushFollow(FOLLOW_conj_in_params1308);
					c=conj();
					state._fsp--;

					pushFollow(FOLLOW_param_in_params1314);
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


	protected DFA1 dfa1 = new DFA1(this);
	static final String DFA1_eotS =
		"\135\uffff";
	static final String DFA1_eofS =
		"\135\uffff";
	static final String DFA1_minS =
		"\1\4\1\uffff\1\4\1\22\1\11\1\12\1\31\1\uffff\1\22\1\31\1\13\1\4\2\5\1"+
		"\31\2\uffff\1\13\1\31\2\13\2\31\2\uffff\1\12\1\uffff\1\31\1\5\2\31\1\12"+
		"\1\13\1\27\1\31\1\uffff\2\13\2\31\3\uffff\2\13\2\uffff\1\23\1\31\1\5\1"+
		"\23\1\12\2\31\2\uffff\1\13\1\uffff\2\13\2\31\2\uffff\3\13\1\31\1\23\2"+
		"\31\2\12\5\13\1\22\1\31\1\23\1\22\1\12\3\13\2\uffff\1\22\1\31\1\12\1\13"+
		"\1\22";
	static final String DFA1_maxS =
		"\1\7\1\uffff\1\26\4\31\1\uffff\1\22\2\31\1\17\1\5\2\31\2\uffff\6\31\2"+
		"\uffff\1\22\1\uffff\1\31\1\5\6\31\1\uffff\4\31\3\uffff\1\23\1\31\2\uffff"+
		"\1\23\1\31\1\5\1\23\3\31\2\uffff\1\26\1\uffff\4\31\2\uffff\1\23\3\31\1"+
		"\23\2\31\1\23\2\31\1\23\2\31\2\23\1\31\2\23\1\31\1\26\1\31\1\23\2\uffff"+
		"\1\23\1\31\3\23";
	static final String DFA1_acceptS =
		"\1\uffff\1\1\5\uffff\1\21\7\uffff\1\13\1\24\6\uffff\1\3\1\5\1\uffff\1"+
		"\10\10\uffff\1\17\4\uffff\1\2\1\4\1\6\2\uffff\1\7\1\11\7\uffff\1\12\1"+
		"\20\1\uffff\1\14\4\uffff\1\22\1\23\26\uffff\1\15\1\16\5\uffff";
	static final String DFA1_specialS =
		"\135\uffff}>";
	static final String[] DFA1_transitionS = {
			"\1\1\2\uffff\1\2",
			"",
			"\1\3\1\uffff\1\4\5\uffff\1\7\1\uffff\1\6\2\uffff\1\10\4\uffff\1\5",
			"\1\11\6\uffff\1\12",
			"\1\15\10\uffff\1\13\6\uffff\1\14",
			"\1\17\7\uffff\1\16\6\uffff\1\20",
			"\1\21",
			"",
			"\1\22",
			"\1\23",
			"\1\25\4\uffff\1\26\1\uffff\1\27\1\30\5\uffff\1\24",
			"\1\31\10\uffff\1\32\1\uffff\1\32",
			"\1\33",
			"\1\36\1\35\22\uffff\1\34",
			"\1\37",
			"",
			"",
			"\1\41\4\uffff\1\42\5\uffff\1\43\2\uffff\1\40",
			"\1\44",
			"\1\46\1\uffff\1\52\1\uffff\1\52\1\47\1\uffff\1\51\1\50\5\uffff\1\45",
			"\1\25\4\uffff\1\26\1\uffff\1\27\1\30\5\uffff\1\53",
			"\1\54",
			"\1\54",
			"",
			"",
			"\1\55\7\uffff\1\56",
			"",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\67\1\64\4\uffff\1\65\2\uffff\1\66\5\uffff\1\63",
			"\1\41\4\uffff\1\42\5\uffff\1\43\2\uffff\1\70",
			"\1\71\1\uffff\1\72",
			"\1\72",
			"",
			"\1\74\1\uffff\1\77\1\uffff\1\77\1\75\2\uffff\1\76\5\uffff\1\73",
			"\1\46\1\uffff\1\52\1\uffff\1\52\1\47\1\uffff\1\51\1\50\5\uffff\1\100",
			"\1\101",
			"\1\101",
			"",
			"",
			"",
			"\1\25\4\uffff\1\26\1\uffff\1\27\1\30",
			"\1\25\4\uffff\1\26\1\uffff\1\27\1\30\5\uffff\1\102",
			"",
			"",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\67\1\64\4\uffff\1\65\2\uffff\1\66\5\uffff\1\107",
			"\1\110",
			"\1\110",
			"",
			"",
			"\1\41\4\uffff\1\42\5\uffff\1\43",
			"",
			"\1\41\4\uffff\1\42\5\uffff\1\43\2\uffff\1\111",
			"\1\74\1\uffff\1\77\1\uffff\1\77\1\75\2\uffff\1\76\5\uffff\1\112",
			"\1\113",
			"\1\113",
			"",
			"",
			"\1\46\1\uffff\1\52\1\uffff\1\52\1\47\1\uffff\1\51\1\50",
			"\1\46\1\uffff\1\52\1\uffff\1\52\1\47\1\uffff\1\51\1\50\5\uffff\1\114",
			"\1\25\4\uffff\1\26\1\uffff\1\27\1\30\5\uffff\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\67\1\64\4\uffff\1\65\2\uffff\1\66",
			"\1\67\1\64\4\uffff\1\65\2\uffff\1\66\5\uffff\1\122",
			"\1\41\4\uffff\1\42\5\uffff\1\43\2\uffff\1\123",
			"\1\74\1\uffff\1\77\1\uffff\1\77\1\75\2\uffff\1\76",
			"\1\74\1\uffff\1\77\1\uffff\1\77\1\75\2\uffff\1\76\5\uffff\1\124",
			"\1\46\1\uffff\1\52\1\uffff\1\52\1\47\1\uffff\1\51\1\50\5\uffff\1\125",
			"\1\25\4\uffff\1\26\1\uffff\1\27\1\30",
			"\1\127\1\126",
			"\1\130",
			"\1\131",
			"\1\127\1\126",
			"\1\67\1\64\4\uffff\1\65\2\uffff\1\66\5\uffff\1\132",
			"\1\41\4\uffff\1\42\5\uffff\1\43",
			"\1\74\1\uffff\1\77\1\uffff\1\77\1\75\2\uffff\1\76\5\uffff\1\133",
			"\1\46\1\uffff\1\52\1\uffff\1\52\1\47\1\uffff\1\51\1\50",
			"",
			"",
			"\1\127\1\126",
			"\1\134",
			"\1\67\1\64\4\uffff\1\65\2\uffff\1\66",
			"\1\74\1\uffff\1\77\1\uffff\1\77\1\75\2\uffff\1\76",
			"\1\127\1\126"
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
			return "32:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( ARTICLE d= dat PARLER ps= params | COMBIEN ARTICLE PARLER ps= params | COMBIEN ARTICLE ps1= params PARLER ps2= params | COMBIEN ARTICLE PARLER ps1= params PARLER ps2= params | COMBIEN ARTICLE ps= params | COMBIEN ARTICLE PARLER ps= params d= dat | COMBIEN AUTEUR PARLER ARTICLE ENTRE d1= dat ET d2= dat | COMBIEN AUTEUR PARLER d= dat | COMBIEN AUTEUR PARLER ARTICLE PARLER ps= params | COMBIEN r= RUBRIQUE PARLER ps= params | COMBIEN r= RUBRIQUE ENTRE d1= dat ET d2= dat PARLER ps= params | COMBIEN MOT ps= params ET SELECT ARTICLE | COMBIEN AUTEUR e= email | COMBIEN AUTEUR e= email PARLER ps= params | COMBIEN MOT ps= params r= RUBRIQUE | COMBIEN r= RUBRIQUE PARLER ps= params ENTRE d1= jour ET d2= jour | COMBIEN JOURS PARLER ps= params | COMBIEN PAGE PARLER ps= params | COMBIEN PAGE PARLER ps= params d= dat | COMBIEN r= RUBRIQUE ps= params );";
		}
	}

	public static final BitSet FOLLOW_ARTICLE_in_requete286 = new BitSet(new long[]{0x000000000000A000L});
	public static final BitSet FOLLOW_dat_in_requete292 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_PARLER_in_requete294 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_params_in_requete298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete336 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete338 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_PARLER_in_requete340 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_params_in_requete346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete360 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete362 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_params_in_requete368 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_PARLER_in_requete370 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_params_in_requete376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete390 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete392 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_PARLER_in_requete394 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_params_in_requete400 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_PARLER_in_requete402 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_params_in_requete408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete422 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete424 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_params_in_requete430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete447 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete449 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_PARLER_in_requete451 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_params_in_requete457 = new BitSet(new long[]{0x000000000000A000L});
	public static final BitSet FOLLOW_dat_in_requete463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete477 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete479 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_PARLER_in_requete481 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete483 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ENTRE_in_requete485 = new BitSet(new long[]{0x000000000000A000L});
	public static final BitSet FOLLOW_dat_in_requete491 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ET_in_requete493 = new BitSet(new long[]{0x000000000000A000L});
	public static final BitSet FOLLOW_dat_in_requete499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete513 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete515 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_PARLER_in_requete517 = new BitSet(new long[]{0x000000000000A000L});
	public static final BitSet FOLLOW_dat_in_requete524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete538 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete540 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_PARLER_in_requete542 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete545 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_PARLER_in_requete547 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_params_in_requete553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete585 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete591 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_PARLER_in_requete593 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_params_in_requete599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete613 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete619 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ENTRE_in_requete621 = new BitSet(new long[]{0x000000000000A000L});
	public static final BitSet FOLLOW_dat_in_requete627 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ET_in_requete629 = new BitSet(new long[]{0x000000000000A000L});
	public static final BitSet FOLLOW_dat_in_requete635 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_PARLER_in_requete637 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_params_in_requete644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete658 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_MOT_in_requete660 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_params_in_requete666 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ET_in_requete668 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_SELECT_in_requete670 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete686 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete688 = new BitSet(new long[]{0x0000000002000200L});
	public static final BitSet FOLLOW_email_in_requete694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete708 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete710 = new BitSet(new long[]{0x0000000002000200L});
	public static final BitSet FOLLOW_email_in_requete716 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_PARLER_in_requete718 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_params_in_requete724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete738 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_MOT_in_requete740 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_params_in_requete746 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete766 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete772 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_PARLER_in_requete774 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_params_in_requete780 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ENTRE_in_requete782 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_jour_in_requete788 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ET_in_requete790 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_jour_in_requete796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete810 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_JOURS_in_requete812 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_PARLER_in_requete814 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_params_in_requete820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete834 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_PAGE_in_requete836 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_PARLER_in_requete838 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_params_in_requete844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete858 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_PAGE_in_requete860 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_PARLER_in_requete862 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_params_in_requete868 = new BitSet(new long[]{0x000000000000A000L});
	public static final BitSet FOLLOW_dat_in_requete874 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMBIEN_in_requete888 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete894 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_params_in_requete900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ET_in_conj918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OU_in_conj925 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NBR_in_dat944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOIS_in_dat955 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NBR_in_dat961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NBR_in_dat972 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_MOIS_in_dat978 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NBR_in_dat984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_email1003 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AT_in_email1009 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_VAR_in_email1015 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_POINT_in_email1021 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_VAR_in_email1027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EMAIL_in_email1034 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_VAR_in_email1040 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AT_in_email1046 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_VAR_in_email1052 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_POINT_in_email1058 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_VAR_in_email1064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EMAIL_in_email1071 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_email1073 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_VAR_in_email1079 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AT_in_email1085 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_VAR_in_email1091 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_POINT_in_email1097 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_VAR_in_email1103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EMAIL_in_email1110 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AT_in_email1116 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_VAR_in_email1122 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_POINT_in_email1128 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_VAR_in_email1134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NBR_in_jour1154 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_MOIS_in_jour1160 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_NBR_in_jour1166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NBR_in_jour1178 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_MOIS_in_jour1184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_requete_in_listerequetes1210 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_POINT_in_listerequetes1212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_param1231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_param1242 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_VAR_in_param1248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_param1259 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_VAR_in_param1265 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_VAR_in_param1271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_params1297 = new BitSet(new long[]{0x0000000000010802L});
	public static final BitSet FOLLOW_conj_in_params1308 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_param_in_params1314 = new BitSet(new long[]{0x0000000000010802L});
}

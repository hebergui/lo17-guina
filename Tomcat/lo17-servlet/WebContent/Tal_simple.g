grammar Tal_simple;
@lexer::header {package antlr.output;}
@parser::header {package antlr.output;}

SELECT : 'vouloir';
COMBIEN : 'combien';
ET : 'et';
OU : 'ou';
PARLER : 'parler'+; //pour la phrase "...traite des sujets concernant..."
ENTRE :'entre';
WS : (' ' | '\t' | '\r' | 'stop') { skip(); } | '\n';
MOIS : 'janvier'|'fevrier'|'février'|'mars'|'avril'|'mai'|'juin'|'juillet'|'aout'|'aot'|'sept'|'octobre'|'novembre'|'decembre'|'décembre';
MOT : 'mot';
TODAY : 'aujourd';
PREMIER : 'premier';
DERNIER : 'dernier';
CONTACTER : 'contacter';	

RUBRIQUE : 'rubriqueune'|'gros titre'|'focus'|'rappels'|'voiraussi';

ARTICLE : 'article';
AUTEUR : 'auteur';
DATE : 'date';
EMAIL : 'email';
JOURS : 'jours';
PAGE : 'page';
PUBLIE : 'publie';
RESUME : 'resume';
TITRE : 'titre';

NBR : ('0'..'9')+;
POINT : '.';
AT :'@';
VAR : ('A'..'Z' | 'a'..'z') ('a'..'z'|'-'|'A'..'Z'|'\u00a0'..'\u00ff')+; //aussi les accents

requete returns [Arbre req_arbre = new Arbre("")]
	@init {Arbre ps_arbre, d_arbre, e_arbre;} :
	//******************//
//////* REQUETES ARTICLE */
	//******************//
	//********* DATE **********//
		//Articles ??crits en septembre 2005 qui parlent du 11 septembre ? == ARTICLE date(septembre, 2005) PARLER params(11, septembre)
		 ARTICLE d = dat PARLER ps=params {
			req_arbre.ajouteFils(new Arbre("", "select distinct"));
			req_arbre.ajouteFils(new Arbre("", "m.article "));
			req_arbre.ajouteFils(new Arbre("", "from titreresume m, datearticle d"));
			req_arbre.ajouteFils(new Arbre("", "where m.article = d.article "));
			req_arbre.ajouteFils(new Arbre("", "AND "));
			d_arbre = $d.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
			req_arbre.ajouteFils(new Arbre("", "AND "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		
		| ARTICLE PARLER ps=params {
			req_arbre.ajouteFils(new Arbre("", "select distinct m.article ) "));
			req_arbre.ajouteFils(new Arbre("", "from titreresume m"));
			req_arbre.ajouteFils(new Arbre("", "where "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}

	//******************//
//////* REQUETES COMBIEN */
	//******************//
	//********* ARTICLE **********//
		//Combien d'articlent traitent d'un r??f??rendum aux Pays-Bas. == COMBIEN ARTICLE PARLER params(r??f??rendum, Pays-Bas)
		//Combien d'articles font r??f??rence ?? des attentats en Irak? == COMBIEN ARTICLE PARLER params(attentats, Irak)
		//Combien d'articles porte sur les USA et sur l'Irak en m??me temps ? === COMBIEN ARTICLE PARLER params(USA, Irak)
		//Combien d'articles traitent d'accidents a??riens ? == COMBIEN ARTICLE PARLER params(accidents, a??riens)
		//Combien d'articles traitent de l'Irak? == COMBIEN ARTICLE PARLER params(Irak)
		//Combien d'articles traitent les fusillades aux ??tats-unis? == COMBIEN ARTICLE PARLER params(fusillades, Etats-Unis)
		//Combien d'articles traitent ?? la fois de l'Irak et de Bush? == COMBIEN ARTICLE PARLER params(Irak ET Bush)
		//Combien d'articles ??voque Berlusconi et le fascisme ? == COMBIEN ARTICLE PARLER params(Berlusconi ET fascisme)
		//Combien il y t-il d'articles traitants du Pape? == COMBIEN ARTICLE PARLER params(pape)
		//Dans combien d'article parle-t-on du Pape ? == COMBIEN ARTICLE parler params(pape)
		| COMBIEN ARTICLE PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct count(m.article) "));
			req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
			req_arbre.ajouteFils(new Arbre("", "where "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		
		//Combien d'articles de l'AFP traitent de Florence Aubenas? == COMBIEN ARTICLE params(AFP) PARLER params(Florence, Aubenas)
		| COMBIEN ARTICLE ps1 = params PARLER ps2 = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct count(m.article) "));
			req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
			req_arbre.ajouteFils(new Arbre("", "where "));
			ps_arbre = $ps1.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", " AND "));
			ps_arbre = $ps2.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		
		// y a-t-il d'articles sur le th??me des Etats-Unis traitant de Bush ? == COMBIEN ARTICLE PARLER params(Etats-Unis) PARLER Bush
		| COMBIEN ARTICLE PARLER ps1 = params PARLER ps2 = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct count(m.article) "));
			req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
			req_arbre.ajouteFils(new Arbre("", "where "));
			ps_arbre = $ps1.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", " AND "));
			ps_arbre = $ps2.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		
		//Combien d'articles proviennent de l'AFP? == COMBIEN ARTICLE param(AFP)
		| COMBIEN ARTICLE ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct count(m.article) "));
			req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
			req_arbre.ajouteFils(new Arbre("", "where "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		
		//Combien d'articles traitent de la politique ??trang??re des Etats-Unis en 2005 ? == COMBIEN ARTICLE PARLER params(politique, ??trang??re, Etats_Unis) date(2005)
		//Combien d'articles traitent du Royaume-Uni en 2005 ? == COMBIEN ARTICLE PARLER params(Royaume-Uni) date(2005)
		| COMBIEN ARTICLE PARLER ps = params d = dat {
			req_arbre.ajouteFils(new Arbre("", "select distinct count(m.article) "));
			req_arbre.ajouteFils(new Arbre("", "from titrearticle m, datearticle d "));
			req_arbre.ajouteFils(new Arbre("", "where m.article = d.article "));
			req_arbre.ajouteFils(new Arbre("", " AND "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", " AND "));
			d_arbre = $d.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
		}
		
	//********* AUTEUR **********//
		//NE MARCHE PAS
		| COMBIEN AUTEUR ARTICLE ENTRE d1 = dat ET d2 = dat {
			req_arbre.ajouteFils(new Arbre("", "select distinct count(e.email)"));
			req_arbre.ajouteFils(new Arbre("", "from datearticle m, email e"));
			req_arbre.ajouteFils(new Arbre("", "where d.article = e.article "));
			req_arbre.ajouteFils(new Arbre("", " AND "));
			d_arbre = $d1.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
			req_arbre.ajouteFils(new Arbre("", " AND "));
			d_arbre = $d2.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
		}
		
		//Combien d'auteurs diff??rents ont ??crit des articles le 24 octobre 2005 ? == COMBIEN AUTEUR PARLER date(24 octobre 2005)
		| COMBIEN AUTEUR  d = dat {
			req_arbre.ajouteFils(new Arbre("", "select distinct count(e.email) "));
			req_arbre.ajouteFils(new Arbre("", "from datearticle d, email e"));
			req_arbre.ajouteFils(new Arbre("", "where d.article = e.article"));
			req_arbre.ajouteFils(new Arbre("", " AND "));
			d_arbre = $d.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
		}
		
		//Combien d'auteurs ont ??crit un article parlant d'attentats ? == COMBIEN AUTEUR PARLER ARTICLE PARLER params(attentat)
		| COMBIEN AUTEUR  ARTICLE PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct count(e.email) "));
			req_arbre.ajouteFils(new Arbre("", "from datearticle d, email e, titreresume m"));
			req_arbre.ajouteFils(new Arbre("", "where d.article = e.article AND e.article = m.article "));
			req_arbre.ajouteFils(new Arbre("", " AND "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}

		| COMBIEN AUTEUR e = email {
			req_arbre.ajouteFils(new Arbre("", "select distinct count(e.email) "));
			req_arbre.ajouteFils(new Arbre("", "from email e "));
			req_arbre.ajouteFils(new Arbre("", "where "));
			ps_arbre = $e.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		
		//Combien de fois l'auteur dont l'adresse mail est dstraus@tf1.fr parle t-il de Florence Aubenas ? == COMBIEN AUTEUR email(dstraus@tf1.fr) PARLER params(Florence, Aubenas)
		| COMBIEN AUTEUR e = email PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct count(e.email) "));
			req_arbre.ajouteFils(new Arbre("", "from email e, titreresume m"));
			req_arbre.ajouteFils(new Arbre("", "where e.article = m.article "));
			req_arbre.ajouteFils(new Arbre("", "' AND "));
			ps_arbre = $e.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", "' AND "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}

	//********* JOUR **********//
		//Combien de jours successifs parle-t-on du pape? == COMBIEN JOURS PARLER params(pape)
		| COMBIEN JOURS PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct count(datearticle.jj) "));
			req_arbre.ajouteFils(new Arbre("", "from datearticle, titreresume "));
			req_arbre.ajouteFils(new Arbre("", "where datearticle.article = titreresume.article "));
			req_arbre.ajouteFils(new Arbre("", " AND "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		
	//********* MOT **********//
		//Combien de fois est cit??s le mot "mort" et dans quels articles? == COMBIEN MOT params(mort) ET SELECT ARTICLE
		| COMBIEN MOT ps = params ET SELECT ARTICLE {
			req_arbre.ajouteFils(new Arbre("", "select count(m.mot), m.article"));
			req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
			req_arbre.ajouteFils(new Arbre("", "where "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		
		//Combien de fois le mot Vatican est apparu dans les rappels ? == COMBIEN mot(vatican) rubrique(rappels)
		| COMBIEN MOT ps = params r = RUBRIQUE {
			req_arbre.ajouteFils(new Arbre("", "select count(m.mot) "));
			req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
			req_arbre.ajouteFils(new Arbre("", "where m.rubrique = '" + r.getText() + "' "));
			req_arbre.ajouteFils(new Arbre("", " AND "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}

	//********* PAGE **********//
		| COMBIEN PAGE PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct count(m.page) "));
			req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
			req_arbre.ajouteFils(new Arbre("", "where "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		
		//Combien de pqges traitent du proc??s de Mickael Jackson pour le mois d'avril 2005 ? == COMBIEN PAGE PARLER params(proc??s, Mickael, Jackson) date(avril 2005)
		| COMBIEN PAGE PARLER ps = params d = dat {
			req_arbre.ajouteFils(new Arbre("", "select distinct count(m.page) "));
			req_arbre.ajouteFils(new Arbre("", "from titreresume m, datepage d "));
			req_arbre.ajouteFils(new Arbre("", "where m.page = d.page "));
			req_arbre.ajouteFils(new Arbre("", "AND "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", " AND "));
			d_arbre = $d.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
		}
		
	//********* RUBRIQUE **********//
		//NE MARCHE PAS
		| COMBIEN r = RUBRIQUE PARLER ps = params ENTRE d1 = dat ET d2 = dat {
			req_arbre.ajouteFils(new Arbre("", "select distinct count(m.rubrique) "));
			req_arbre.ajouteFils(new Arbre("", "from titreresume m, datearticle d "));
			req_arbre.ajouteFils(new Arbre("", "where m.article = d.article "));
			req_arbre.ajouteFils(new Arbre("", "AND m.rubrique = '" + r.getText() + "' "));
			req_arbre.ajouteFils(new Arbre("", "AND  "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", " AND "));
			d_arbre = $d1.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
			req_arbre.ajouteFils(new Arbre("", " AND "));
			d_arbre = $d2.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
		}

		//Combien de FOCUS parlent de Bush? == COMBIEN rubrique(focus) PARLER params(Bush)
		//Combien de Focus porte sur l'Italie ? == COMBIEN rubrique(focus) PARLER params(Italie)
		//Combien de Focus porte sur les USA  ? == COMBIEN rubrique(focus) PARLER params(USA)
		//Combien de UNE concernent l'Irak? == COMBIEN rubrique(une) PARLER params(Irak)
		//Combien de Une parle du Pape ? == COMBIEN rubrique(une) PARLER params(pape)
		//Combien de gros titres font r??f??rence ?? Al-Qa??da ? == COMBIEN rubrique(gros titre) PARLER params(Al-Qa??da)
		//Combien de rappels traitent de Silvio Berlusconi? == COMBIEN rubrique(rappels) PARLER params(Silvio Berlusconi)
		| COMBIEN r = RUBRIQUE PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct count(m.rubrique) "));
			req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
			req_arbre.ajouteFils(new Arbre("", "where m.rubrique = '" + r.getText() + "' "));
			req_arbre.ajouteFils(new Arbre("", " AND "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		
		//Combien de Une parue entre le 25 Janvier et le 17 Avril 2006 traite des sujets concernant l'Afrique ? == COMBIEN rubrique(une) ENTRE date(25 janvier) ET date(17 avril) PARLER PARLER params(Afrique)
		| COMBIEN r = RUBRIQUE ENTRE d1 = dat ET d2 = dat PARLER  ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct count(m.rubrique) "));
			req_arbre.ajouteFils(new Arbre("", "from titreresume m, datearticle d"));
			req_arbre.ajouteFils(new Arbre("", "where m.article = d.article"));
			req_arbre.ajouteFils(new Arbre("", "AND m.rubrique = '" + r.getText() + "' "));
			req_arbre.ajouteFils(new Arbre("", "AND "));
			d_arbre = $d1.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
			req_arbre.ajouteFils(new Arbre("", " AND "));
			d_arbre = $d2.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
			req_arbre.ajouteFils(new Arbre("", " AND "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		
		| COMBIEN r = RUBRIQUE ps = params {
			req_arbre.ajouteFils(new Arbre("", "select count(m.rubrique) "));
			req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
			req_arbre.ajouteFils(new Arbre("", "where m.rubrique = '" + r.getText() + "' "));
			req_arbre.ajouteFils(new Arbre("", " AND "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		
	//******************//
//////* REQUETES EMAIL */
	//******************//
		| EMAIL AUTEUR ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct e.email "));
			req_arbre.ajouteFils(new Arbre("", "from email e"));
			req_arbre.ajouteFils(new Arbre("", "where "));;
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}

	//******************//
//////* REQUETES SELECT */
	//******************//
	//********* ARTICLE **********//
		//Donne moi tous les articles sur le th?me de la guerre paru entre le 23 avril 2005 et le 1er Juillet 2005 == SELECT ARTICLE PARLER params(guerre) ENTRE date(23 janvier 2005) ET date(1er juillet 2005)
		| SELECT ARTICLE PARLER  ps = params ENTRE d1 = dat ET d2 = dat  {
			req_arbre.ajouteFils(new Arbre("", "select count(m.rubrique) "));
			req_arbre.ajouteFils(new Arbre("", "from titreresume m, datearticle d"));
			req_arbre.ajouteFils(new Arbre("", "where m.article = d.article"));
			req_arbre.ajouteFils(new Arbre("", "AND "));
			d_arbre = $d1.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
			req_arbre.ajouteFils(new Arbre("", " AND "));
			d_arbre = $d2.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
			req_arbre.ajouteFils(new Arbre("", "AND '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
	
		//Dans quels articles est intervenu Nicolas Sarkozy sur le th??me de la d??fense ? == SELECT ARTICLE params(Nicolas Sarkozy) PARLER params(d??fense)
		| SELECT ARTICLE ps1 = params PARLER ps2 = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "article "));
			req_arbre.ajouteFils(new Arbre("", "from "));
			req_arbre.ajouteFils(new Arbre("", "where "));
			ps_arbre = $ps1.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			ps_arbre = $ps2.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}

		//Dans quels articles parlent-t-on de Nicolas Sarkozy ? == SELECT ARTICLE PARLER params(Nicolas Sarkozy)
		//Donne moi tous les article concernant le procès de Mickael Jackson == vouloir article parler proc�s mich jackson
		//Donne moi tous les articles traitant de la menace terroriste Al-Qaïda == vouloir article parler menace terroris al-qaïda 
		| SELECT ARTICLE PARLER? ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct m.article "));
			req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
			req_arbre.ajouteFils(new Arbre("", "where "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		
		| SELECT ARTICLE PARLER ps = params DATE d = dat{
			req_arbre.ajouteFils(new Arbre("", "select distinct m.article "));
			req_arbre.ajouteFils(new Arbre("", "from titreresume m, datearticle d "));
			req_arbre.ajouteFils(new Arbre("", "where d.article = m.article"));
			req_arbre.ajouteFils(new Arbre("", "AND "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", "AND "));
			ps_arbre = $d.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}

		//Donne moi les articles de 2005 dont l'auteur a pour adresse e-mail fauvert@tf1.fr == SELECT ARTICLE date(2005) AUTEUR email(fauvert@tf1.fr)
		| SELECT ARTICLE d = dat AUTEUR e = email {
			req_arbre.ajouteFils(new Arbre("", "select distinct m.article "));
			req_arbre.ajouteFils(new Arbre("", "from titreresume m, datearticle d, email e"));
			req_arbre.ajouteFils(new Arbre("", "where m.article = d.article AND d.article = e.article "));
			req_arbre.ajouteFils(new Arbre("", "AND "));
			d_arbre = $d.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
			req_arbre.ajouteFils(new Arbre("", "AND "));
			e_arbre = $e.les_pars_arbre;
			req_arbre.ajouteFils(e_arbre);
		}

		| SELECT ARTICLE AUTEUR e = email ET PARLER r = RUBRIQUE {
			req_arbre.ajouteFils(new Arbre("", "select distinct m.article"));
			req_arbre.ajouteFils(new Arbre("", "from titreresume m, email e "));
			req_arbre.ajouteFils(new Arbre("", "where m.article = e.article "));
			req_arbre.ajouteFils(new Arbre("", "AND "));
			ps_arbre = $e.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", "AND m.rubrique = '" + r.getText() + "' "));
		}

		| SELECT ARTICLE AUTEUR ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct m.article"));
			req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
			req_arbre.ajouteFils(new Arbre("", "where "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}

		| SELECT ARTICLE AUTEUR e = email {
			req_arbre.ajouteFils(new Arbre("", "select distinct m.article"));
			req_arbre.ajouteFils(new Arbre("", "from titreresume m, email e "));
			req_arbre.ajouteFils(new Arbre("", "where m.article = e.article "));
			req_arbre.ajouteFils(new Arbre("", "AND "));
			ps_arbre = $e.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}

		| SELECT ARTICLE ps1 = params AUTEUR ps2 = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct m.article "));
			req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
			req_arbre.ajouteFils(new Arbre("", "where "));
			ps_arbre = $ps1.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", "AND "));
			ps_arbre = $ps2.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		
		| SELECT ARTICLE d = dat ET PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct m.artiçle "));
			req_arbre.ajouteFils(new Arbre("", "from titrearticle m, datearticle d"));
			req_arbre.ajouteFils(new Arbre("", "where d.article = m.article "));
			req_arbre.ajouteFils(new Arbre("", "AND "));
			d_arbre = $d.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
			req_arbre.ajouteFils(new Arbre("", "AND "));
			e_arbre = $d.les_pars_arbre;
			req_arbre.ajouteFils(e_arbre);
		}

	//********* AUTEUR **********//
		| SELECT AUTEUR ARTICLE PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct m.email, m.article "));
			req_arbre.ajouteFils(new Arbre("", "from emailarticle m "));
			req_arbre.ajouteFils(new Arbre("", "where "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}

		| SELECT AUTEUR ARTICLE ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct m.email, m.article "));
			req_arbre.ajouteFils(new Arbre("", "from emailarticle m "));
			req_arbre.ajouteFils(new Arbre("", "where "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}

	//********* COMBIEN **********//		
		| SELECT COMBIEN r = RUBRIQUE PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select count(m.rubrique) "));
			req_arbre.ajouteFils(new Arbre("", "from titreresume m, datearticle d"));
			req_arbre.ajouteFils(new Arbre("", "where m.article = d.article "));
			req_arbre.ajouteFils(new Arbre("", "AND m.rubrique = '" + r.getText() + "' "));
			req_arbre.ajouteFils(new Arbre("", "AND "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}

	//********* DATE **********//
		//Donne moi la liste des dates des articles traitant du Pape. == SELECT DATE PARLER(pape)
		| SELECT DATE ARTICLE? PARLER ps=params {
			req_arbre.ajouteFils(new Arbre("", "select d.jj, d.mois, d.annee "));
			req_arbre.ajouteFils(new Arbre("", "from datearticle d, titreresume m "));
			req_arbre.ajouteFils(new Arbre("", "where d.article = m.titreresume "));
			req_arbre.ajouteFils(new Arbre("", "AND "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}

	//********* EMAIL **********//
		//Comment puis-je contacter l'auteur Herv?? Moustache ? == SELECT EMAIL AUTEUR params(Herv?? Moustache)
		| SELECT EMAIL AUTEUR ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct e.email "));
			req_arbre.ajouteFils(new Arbre("", "from email e, titreresume m "));
			req_arbre.ajouteFils(new Arbre("", "where e.article = m.article "));
			req_arbre.ajouteFils(new Arbre("", "AND "));		
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}

	//********* PAGE **********//
		//Dans quelles pages trouvent-on des articles ??crits par un auteur dont l'adresse mail est agautier@tf1.fr ? == SELECT PAGE ARTICLE PARLER AUTEUR EMAIL email
		| SELECT PAGE ARTICLE AUTEUR* e = email {
			req_arbre.ajouteFils(new Arbre("", "select distinct m.page "));
			req_arbre.ajouteFils(new Arbre("", "from titreresume, email e"));
			req_arbre.ajouteFils(new Arbre("", "where m.article = e.article"));
			req_arbre.ajouteFils(new Arbre("", "AND "));
			ps_arbre = $e.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		
		| SELECT PAGE PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select distinct m.page "));
			req_arbre.ajouteFils(new Arbre("", "from titreresume m "));
			req_arbre.ajouteFils(new Arbre("", "where "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
;

conj returns [Arbre conj_arbre = new Arbre("")] :
	ET {
		conj_arbre.ajouteFils(new Arbre("", "AND "));
	}
	| OU {
		conj_arbre.ajouteFils(new Arbre("", "OR "));
	};

dat returns [Arbre les_pars_arbre = new Arbre("")] :
	a = NBR {
		les_pars_arbre.ajouteFils(new Arbre("", "d.annee = '" + a.getText() + "' "));
	}
	| m = MOIS {
		les_pars_arbre.ajouteFils(new Arbre("", "d.mois = '" + m.getText() + "' "));
	}
	| m = MOIS a = NBR {
		les_pars_arbre.ajouteFils(new Arbre("", "d.mois = '" + m.getText() + "' "));
		les_pars_arbre.ajouteFils(new Arbre("", "AND d.annee = '" + a.getText() + "' "));
	}
	| j = JOURS m = MOIS {
		les_pars_arbre.ajouteFils(new Arbre("", "d.jour = '" + j.getText() + "' "));
		les_pars_arbre.ajouteFils(new Arbre("", "AND d.mois = '" + m.getText() + "' "));
		}
	| j = NBR m = MOIS a = NBR {
		les_pars_arbre.ajouteFils(new Arbre("", "d.jj = '" + j.getText() + "' "));
		les_pars_arbre.ajouteFils(new Arbre("", "AND d.mois = '" + m.getText() + "' "));
		les_pars_arbre.ajouteFils(new Arbre("", "AND d.annee = '" + a.getText() + "' "));
	};
	

email returns [Arbre les_pars_arbre = new Arbre("")] :
	a1 = VAR a = AT a2 = VAR n = NBR? p = POINT a3 = VAR {
		les_pars_arbre.ajouteFils(new Arbre("", "e.email = '" + a1.getText() + a.getText() + a2.getText() + n.getText() + p.getText() + a3.getText() + "' "));
	}

	| EMAIL a1 = VAR a = AT a2 = VAR p = POINT a3 = VAR {
			les_pars_arbre.ajouteFils(new Arbre("", "e.email = '" + a1.getText() + a.getText() + a2.getText() + p.getText() + a3.getText() + "' "));
	}
	| EMAIL AUTEUR a1 = VAR a = AT a2 = VAR p = POINT a3 = VAR {
		les_pars_arbre.ajouteFils(new Arbre("", "e.email = '" + a1.getText() + a.getText() + a2.getText() + p.getText() + a3.getText() + "' "));
	}
	| EMAIL a = AT a1 = VAR p = POINT a2 = VAR {
		les_pars_arbre.ajouteFils(new Arbre("", "e.email = '" + a.getText() + a1.getText() + p.getText() + a2.getText() + "' "));
	};

listerequetes returns [String sql = ""]
	@init {Arbre lr_arbre;} :
		r = requete POINT {
			lr_arbre = $r.req_arbre;
			sql = lr_arbre.sortArbre();
		};

param returns [Arbre lepar_arbre = new Arbre("")] :
	a = VAR {
		lepar_arbre.ajouteFils(new Arbre("", "m.mot LIKE '\%" + a.getText() + "\%' "));
	}
	| a1 = NBR a2 = MOIS {
	 	lepar_arbre.ajouteFils(new Arbre("", "m.mot LIKE '\%" + a1.getText() + "\%' "));
	 	lepar_arbre.ajouteFils(new Arbre("", "OR m.mot LIKE '\%" + a2.getText() + "\%' "));
	 }
	 | a1 = VAR a2 = VAR {
		lepar_arbre.ajouteFils(new Arbre("", "m.mot LIKE '\%" +a1.getText() + "\%' "));
		lepar_arbre.ajouteFils(new Arbre("", "OR m.mot LIKE '\%" + a2.getText() + "\%' "));
	}
	| a1 = VAR a2 = VAR a3 = VAR {
		lepar_arbre.ajouteFils(new Arbre("", "m.mot LIKE '\%" +a1.getText() + "\%' "));
		lepar_arbre.ajouteFils(new Arbre("", "OR m.mot LIKE '\%" + a2.getText() + "\%' "));
		lepar_arbre.ajouteFils(new Arbre("", "OR m.mot LIKE '\%" + a3.getText() + "\%' "));
	}
	| a1 = VAR a2 = VAR a3 = VAR a4 = VAR{
		lepar_arbre.ajouteFils(new Arbre("", "m.mot LIKE '\%" + a1.getText() + "\%' "));
		lepar_arbre.ajouteFils(new Arbre("", "OR m.mot LIKE '\%" + a2.getText() + "\%' "));
		lepar_arbre.ajouteFils(new Arbre("", "OR m.mot LIKE '\%" + a3.getText() + "\%' "));
		lepar_arbre.ajouteFils(new Arbre("", "OR m.mot LIKE '\%" + a4.getText() + "\%' "));
	};

params returns [Arbre les_pars_arbre = new Arbre("")]
	@init {
		Arbre par1_arbre, par2_arbre, conj_arbre, dat_arbre;
	} :
		par1 = param {
			par1_arbre = $par1.lepar_arbre;
			les_pars_arbre.ajouteFils(par1_arbre);
		}
		(c = conj par2 = param {
			conj_arbre = $c.conj_arbre;
			par2_arbre = $par2.lepar_arbre;
			les_pars_arbre.ajouteFils(conj_arbre);
			les_pars_arbre.ajouteFils(par2_arbre);
		})*;
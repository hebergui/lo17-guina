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
MOIS : 'janvier'|'fevrier'|'mars'|'avril'|'mai'|'juin'|'juillet'|'aout'|'septembre'|'octobre'|'novembre'|'décembre';
MOT : 'mot';

RUBRIQUE : 'une'|'gros titre'|'focus'|'rappels'|'voiraussi';

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
VAR : ('A'..'Z' | 'a'..'z') ('a'..'z'|'-'|'A'..'Z')+; //rajouter aussi les accens

requete returns [Arbre req_arbre = new Arbre("")]
	@init {Arbre ps_arbre, d_arbre;} :
		//Articles écrits en septembre 2005 qui parlent du 11 septembre ? == ARTICLE date(septembre, 2005) PARLER params(11, septembre)
		 ARTICLE d = dat PARLER ps=params {
			req_arbre.ajouteFils(new Arbre("", "select distinct "));
			req_arbre.ajouteFils(new Arbre("", "article "));
			req_arbre.ajouteFils(new Arbre("", "from "));
			req_arbre.ajouteFils(new Arbre("", "where "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		
		//Combien d'articlent traitent d'un référendum aux Pays-Bas. == COMBIEN ARTICLE PARLER params(référendum, Pays-Bas)
		//Combien d'articles font référence à des attentats en Irak? == COMBIEN ARTICLE PARLER params(attentats, Irak)
		//Combien d'articles porte sur les USA et sur l'Irak en même temps ? === COMBIEN ARTICLE PARLER params(USA, Irak)
		//Combien d'articles traitent d'accidents aériens ? == COMBIEN ARTICLE PARLER params(accidents, aériens)
		//Combien d'articles traitent de l'Irak? == COMBIEN ARTICLE PARLER params(Irak)
		//Combien d'articles traitent les fusillades aux états-unis? == COMBIEN ARTICLE PARLER params(fusillades, Etats-Unis)
		//Combien d'articles traitent à la fois de l'Irak et de Bush? == COMBIEN ARTICLE PARLER params(Irak ET Bush)
		//Combien d'articles évoque Berlusconi et le fascisme ? == COMBIEN ARTICLE PARLER params(Berlusconi ET fascisme)
		//Combien il y t-il d'articles traitants du Pape? == COMBIEN ARTICLE PARLER params(pape)
		| COMBIEN ARTICLE PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select count(article) "));
			req_arbre.ajouteFils(new Arbre("", "from ... "));
			req_arbre.ajouteFils(new Arbre("", "where "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		
		//Combien d'articles de l'AFP traitent de Florence Aubenas? == COMBIEN ARTICLE params(AFP) PARLER params(Florence, Aubenas)
		| COMBIEN ARTICLE ps1 = params PARLER ps2 = params {
			req_arbre.ajouteFils(new Arbre("", "select count(article) "));
			req_arbre.ajouteFils(new Arbre("", "from "));
			req_arbre.ajouteFils(new Arbre("", "where'"));
			ps_arbre = $ps1.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", " AND mot = '"));
			ps_arbre = $ps2.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		
		// y a-t-il d'articles sur le théme des Etats-Unis traitant de Bush ? == COMBIEN ARTICLE PARLER params(Etats-Unis) PARLER Bush
		| COMBIEN ARTICLE PARLER ps1 = params PARLER ps2 = params {
			req_arbre.ajouteFils(new Arbre("", "select count(article) "));
			req_arbre.ajouteFils(new Arbre("", "from "));
			req_arbre.ajouteFils(new Arbre("", "where'"));
			ps_arbre = $ps1.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", " AND mot = '"));
			ps_arbre = $ps2.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		
		//Combien d'articles proviennent de l'AFP? == COMBIEN ARTICLE param(AFP)
		| COMBIEN ARTICLE ps = params {
			req_arbre.ajouteFils(new Arbre("", "select count(article) "));
			req_arbre.ajouteFils(new Arbre("", "from "));
			req_arbre.ajouteFils(new Arbre("", "where '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		
		//Combien d'articles traitent de la politique étrangére des Etats-Unis en 2005 ? == COMBIEN ARTICLE PARLER params(politique, étrangère, Etats_Unis) date(2005)
		//Combien d'articles traitent du Royaume-Uni en 2005 ? == COMBIEN ARTICLE PARLER params(Royaume-Uni) date(2005)
		| COMBIEN ARTICLE PARLER ps = params d = dat {
			req_arbre.ajouteFils(new Arbre("", "select count(article) "));
			req_arbre.ajouteFils(new Arbre("", "from "));
			req_arbre.ajouteFils(new Arbre("", "where "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", "AND "));
			d_arbre = $d.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
		}
		
		//Combien d'auteurs différents on écrit des articles entre  le 10 janvier 2005 et le 10 juillet 2005? == COMBIEN AUTEUR PARLER ARTICLE ENTRE date(10 janvier 2005) ET date(10 juillet 2005)
		| COMBIEN AUTEUR PARLER ARTICLE ENTRE d1 = dat ET d2 = dat {
			req_arbre.ajouteFils(new Arbre("", "select count(auteur)"));
			req_arbre.ajouteFils(new Arbre("", "from "));
			req_arbre.ajouteFils(new Arbre("", "where "));
			req_arbre.ajouteFils(new Arbre("", " AND date >= "));
			d_arbre = $d1.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
			req_arbre.ajouteFils(new Arbre("", " AND date <= "));
			d_arbre = $d2.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
		}
		
		//Combien d'auteurs différents ont écrit des articles le 24 octobre 2005 ? == COMBIEN AUTEUR PARLER date(24 octobre 2005)
		| COMBIEN AUTEUR PARLER  d = dat {
			req_arbre.ajouteFils(new Arbre("", "select count(auteur) "));
			req_arbre.ajouteFils(new Arbre("", "from "));
			req_arbre.ajouteFils(new Arbre("", "where "));
			d_arbre = $d.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
		}
		
		//Combien d'auteurs ont écrit un article parlant d'attentats ? == COMBIEN AUTEUR PARLER ARTICLE PARLER params(attentat)
		| COMBIEN AUTEUR PARLER  ARTICLE PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select count(auteur) "));
			req_arbre.ajouteFils(new Arbre("", "from "));
			req_arbre.ajouteFils(new Arbre("", "where "));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		
		//Combien de FOCUS parlent de Bush? == COMBIEN rubrique(focus) PARLER params(Bush)
		//Combien de Focus porte sur l'Italie ? == COMBIEN rubrique(focus) PARLER params(Italie)
		//Combien de Focus porte sur les USA  ? == COMBIEN rubrique(focus) PARLER params(USA)
		//Combien de UNE concernent l'Irak? == COMBIEN rubrique(une) PARLER params(Irak)
		//Combien de Une parle du Pape ? == COMBIEN rubrique(une) PARLER params(pape)
		//Combien de gros titres font référence à Al-Qaïda ? == COMBIEN rubrique(gros titre) PARLER params(Al-Qaïda)
		//Combien de rappels traitent de Silvio Berlusconi? == COMBIEN rubrique(rappels) PARLER params(Silvio Berlusconi)
		| COMBIEN r = RUBRIQUE PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select count(rubrique) "));
			req_arbre.ajouteFils(new Arbre("", "from "));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = '" + r.getText() + "' "));
			req_arbre.ajouteFils(new Arbre("", "AND"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		
		//Combien de Une parue entre le 25 Janvier et le 17 Avril 2006 traite des sujets concernant l'Afrique ? == COMBIEN rubrique(une) ENTRE date(25 janvier) ET date(17 avril) PARLER PARLER params(Afrique)
		| COMBIEN r = RUBRIQUE ENTRE d1 = dat ET d2 = dat PARLER  ps = params {
			req_arbre.ajouteFils(new Arbre("", "select count(rubrique) "));
			req_arbre.ajouteFils(new Arbre("", "from "));
			req_arbre.ajouteFils(new Arbre("", "where "));
			req_arbre.ajouteFils(new Arbre("", "AND rubrique = '" + r.getText() + "' "));
			req_arbre.ajouteFils(new Arbre("", "AND jour >= "));
			d_arbre = $d1.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
			req_arbre.ajouteFils(new Arbre("", " AND jour <= "));
			d_arbre = $d2.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		
		//Combien de fois est cités le mot "mort" et dans quels articles? == COMBIEN MOT params(mort) ET SELECT ARTICLE
		| COMBIEN MOT ps = params ET SELECT ARTICLE {
			req_arbre.ajouteFils(new Arbre("", "select count(mot)"));
			req_arbre.ajouteFils(new Arbre("", ", article "));
			req_arbre.ajouteFils(new Arbre("", "from "));
			req_arbre.ajouteFils(new Arbre("", "where mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		
		//Général
		| COMBIEN AUTEUR e = email {
			req_arbre.ajouteFils(new Arbre("", "select count(auteur) "));
			req_arbre.ajouteFils(new Arbre("", "from"));
			req_arbre.ajouteFils(new Arbre("", "where "));
			ps_arbre = $e.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		
		//Combien de fois l'auteur dont l'adresse mail est dstraus@tf1.fr parle t-il de Florence Aubenas ? == COMBIEN AUTEUR email(dstraus@tf1.fr) PARLER params(Florence, Aubenas)
		| COMBIEN AUTEUR e = email PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select count(auteur) "));
			req_arbre.ajouteFils(new Arbre("", "from "));
			req_arbre.ajouteFils(new Arbre("", "where "));
			ps_arbre = $e.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", "' AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		
		//Combien de fois le mot Vatican est apparu dans les rappels ? == COMBIEN mot(vatican) rubrique(rappels)
		| COMBIEN MOT ps = params r = RUBRIQUE {
			req_arbre.ajouteFils(new Arbre("", "select count(mot) "));
			req_arbre.ajouteFils(new Arbre("", "from "));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = '" + r.getText() + "' "));
			req_arbre.ajouteFils(new Arbre("", " AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		
		//Combien de gros titres traitant de l'Afghanistan sont parus entre le 21 Mars 2005 et le 31 JUIN 2005 == COMBIEN rubrique(gros titre) PARLER params(afghanistan) ENTRE date(21 mars 2005) ET date(31 juin 2005)
		| COMBIEN r = RUBRIQUE PARLER ps = params ENTRE d1 = jour ET d2 = jour {
			req_arbre.ajouteFils(new Arbre("", "select count(rubrique) "));
			req_arbre.ajouteFils(new Arbre("", "from "));
			req_arbre.ajouteFils(new Arbre("", "where "));
			req_arbre.ajouteFils(new Arbre("", "AND rubrique = '" + r.getText() + "' "));
			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", " AND date >= "));
			d_arbre = $d1.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
			req_arbre.ajouteFils(new Arbre("", " AND date <= "));
			d_arbre = $d2.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
		}
		
		//Combien de jours successifs parle-t-on du pape? == COMBIEN JOURS PARLER params(pape)
		| COMBIEN JOURS PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select count(jour) "));
			req_arbre.ajouteFils(new Arbre("", "from "));
			req_arbre.ajouteFils(new Arbre("", "where "));
			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		
		//Général
		| COMBIEN PAGE PARLER ps = params {
			req_arbre.ajouteFils(new Arbre("", "select count(page) "));
			req_arbre.ajouteFils(new Arbre("", "from "));
			req_arbre.ajouteFils(new Arbre("", "where mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
		}
		
		//Combien de pqges traitent du procs de Mickael Jackson pour le mois d'avril 2005 ? == COMBIEN PAGE PARLER params(procès, Mickael, Jackson) date(avril 2005)
		| COMBIEN PAGE PARLER ps = params d = dat {
			req_arbre.ajouteFils(new Arbre("", "select count(page) "));
			req_arbre.ajouteFils(new Arbre("", "from "));
			req_arbre.ajouteFils(new Arbre("", "where "));
			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
			ps_arbre = $ps.les_pars_arbre;
			req_arbre.ajouteFils(ps_arbre);
			req_arbre.ajouteFils(new Arbre("", " AND "));
			d_arbre = $d.les_pars_arbre;
			req_arbre.ajouteFils(d_arbre);
		}
		
		//Général
		| COMBIEN r = RUBRIQUE ps = params {
			req_arbre.ajouteFils(new Arbre("", "select count(rubrique) "));
			req_arbre.ajouteFils(new Arbre("", "from "));
			req_arbre.ajouteFils(new Arbre("", "where rubrique = '" + r.getText() + "' "));
			req_arbre.ajouteFils(new Arbre("", "AND mot = '"));
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
		les_pars_arbre.ajouteFils(new Arbre("", "annee = '" + a.getText() + "' "));
	}
	| m = MOIS a = NBR {
		les_pars_arbre.ajouteFils(new Arbre("", "mois = '" + m.getText() + "' "));
		les_pars_arbre.ajouteFils(new Arbre("", "AND annee = '" + a.getText() + "' "));
	}
	| j = NBR m = MOIS a = NBR {
		les_pars_arbre.ajouteFils(new Arbre("", "jj = '" + j.getText() + "' "));
		les_pars_arbre.ajouteFils(new Arbre("", "AND mois = '" + m.getText() + "' "));
		les_pars_arbre.ajouteFils(new Arbre("", "AND annee = '" + a.getText() + "' "));
	};

email returns [Arbre les_pars_arbre = new Arbre("")] :
	a1 = VAR a = AT a2 = VAR p = POINT a3 = VAR {
		les_pars_arbre.ajouteFils(new Arbre("", "email = '" + a1.getText() + a.getText() + a2.getText() + p.getText() + a3.getText() + "' "));
	}
	| EMAIL a1 = VAR a = AT a2 = VAR p = POINT a3 = VAR {
		les_pars_arbre.ajouteFils(new Arbre("", "email = '" + a1.getText() + a.getText() + a2.getText() + p.getText() + a3.getText() + "' "));
	}
	| EMAIL AUTEUR a1 = VAR a = AT a2 = VAR p = POINT a3 = VAR {
		les_pars_arbre.ajouteFils(new Arbre("", "email = '" + a1.getText() + a.getText() + a2.getText() + p.getText() + a3.getText() + "' "));
	}
	| EMAIL a = AT a1 = VAR p = POINT a2 = VAR {
		les_pars_arbre.ajouteFils(new Arbre("", "email = '" + a.getText() + a1.getText() + p.getText() + a2.getText() + "' "));
	};

jour returns [Arbre les_pars_arbre = new Arbre("")] :
	 j = NBR m = MOIS a = NBR {
		les_pars_arbre.ajouteFils(new Arbre("", "'" + j.getText() + m.getText() + a.getText() + "' "));
	}
	|  j = NBR m = MOIS {
		les_pars_arbre.ajouteFils(new Arbre("", "'" + j.getText() + m.getText() + "' "));
	};

listerequetes returns [String sql = ""]
	@init {Arbre lr_arbre;} :
		r = requete POINT {
			lr_arbre = $r.req_arbre;
			sql = lr_arbre.sortArbre();
		};

param returns [Arbre lepar_arbre = new Arbre("")] :
	a = VAR {
		lepar_arbre.ajouteFils(new Arbre("", a.getText() + "' "));
	}
	| a1 = VAR a2 = VAR {
		lepar_arbre.ajouteFils(new Arbre("", a1.getText() + "' "));
		lepar_arbre.ajouteFils(new Arbre("", "AND mot = '" + a2.getText() + "' "));
	}
	| a1 = VAR a2 = VAR a3 = VAR {
		lepar_arbre.ajouteFils(new Arbre("", a1.getText() + "' "));
		lepar_arbre.ajouteFils(new Arbre("", "AND mot = '" + a2.getText() + "' "));
		lepar_arbre.ajouteFils(new Arbre("", "AND mot = '" + a3.getText() + "' "));
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
			les_pars_arbre.ajouteFils(new Arbre("", "mot = '"));
			les_pars_arbre.ajouteFils(par2_arbre);
		})*;
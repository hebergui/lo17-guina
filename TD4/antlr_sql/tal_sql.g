grammar tal_sql;

SELECT : 'vouloir' | 'veux'
;

VERBE 	: ('savoir' | 'consulter') {skip();}
;

COUNT 	: ('nombre')*
;

QUANTIF	:	( 'les' | 'tous les' | 'la liste de') {skip();}
;

ARTICLE : 'article' | 'articles'
;

PAGE : 'page'
;

CONJ : 'et' | 'ou'
;

POINT : '.'
;

ABOUT : 'mot' | 'contenir' | 'parler' | 'sur'
;
 
WS  : (' ' | '\'' |'\t' | '\r' | 'je' | 'Je'| 'qui' | 'dont' | 'le' | 'd' | '?crits' | 'ecrits' | '?crit' | 'ecrit') {skip();} | '\n' 
;

WHEN 	:	'en'
;

NUMBER	: 	('0'..'9')+
;

BY	:	'par'
;
	
VAR 	: ('A'..'Z' | 'a'..'z') ('a'..'z')+
;

listerequetes returns [String sql = ""]
	@init	{Arbre lr_arbre;}: 
		r = requete POINT
			{
				lr_arbre = $r.req_arbre;
				sql = lr_arbre.sortArbre();
			}
;

requete returns [Arbre req_arbre = new Arbre("")]
	@init {Arbre ps_arbre;} : 
		(
		(SELECT 
			{
				req_arbre.ajouteFils(new Arbre("","select distinct"));
			} 
		COUNT 
			{
				req_arbre.ajouteFils(new Arbre("","count(*)"));
			})
		| //OU
		(
		SELECT 
			{
				req_arbre.ajouteFils(new Arbre("","select distinct"));
			})
		)
		(ARTICLE
			{
			req_arbre.ajouteFils(new Arbre("","article"));
			}
		 | //OU
		 PAGE
			{
			req_arbre.ajouteFils(new Arbre("","page"));
			})
		ABOUT
			{
				req_arbre.ajouteFils(new Arbre("","from titreresume"));
				req_arbre.ajouteFils(new Arbre("","where"));
			}
		ps = params 
			{
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);
			}
;

params returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;} : 
		par1 = mot 
			{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
			}
		(CONJ par2 = mot
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "OR"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		)*
		(WHEN par3 = annee
			{
				par3_arbre = $par3.lepar_arbre;
				les_pars_arbre.ajouteFils(par3_arbre);
			}		
		)*
		(BY par3 = mot
			{
				par4_arbre = $par4.lepar_arbre;
				les_pars_arbre.ajouteFils(par4_arbre);
			}		
		)*
;

annee returns [Arbre abr = new Arbre("")] :
	a = NUMBER
		{ abr.ajouteFils(new Arbre("annee = ", "'"+a.getText()+"'"));}
;

mot returns [Arbre lepar_arbre = new Arbre("")] :
	a = VAR
		{ lepar_arbre.ajouteFils(new Arbre("mot =", "'"+a.getText()+"'"));}
;


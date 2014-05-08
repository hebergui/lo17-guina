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
 
WS  : (' ' | '\'' |'\t' | '\r' | 'stop') {skip();} | '\n' 
;

WHEN 	:	'en'
;

MOIS	:	'janvier' | 'fevrier' | 'mars' | 'avril' | 'mai' | 'juin' | 'juillet' | 'aout' | 'septembre' | 'octobre' | 'novembre' | 'decembre'
;

NUMBER	: 	('0'..'9')+
;

BY	:	'par'
;

VAR 	: ('A'..'Z' | 'a'..'z') ('a'..'z'|'-'|'A'..'Z')+
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
				req_arbre.ajouteFils(new Arbre("","select"));
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
			}
		 )
		ps = params 
			{
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);
			}
;

params returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{par1_arbre, par2_arbre, par3_arbre, par4_arbre;} : 
		(ABOUT par1 = mot 
			{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
			}
		)*
		(CONJ par2 = mot
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "OR"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		)*
		(WHEN par3 = date
			{
				par3_arbre = $par3.lepar_arbre;
				les_pars_arbre.ajouteFils(par3_arbre);
			}		
		)*
		(BY par4 = auteur
			{
				par4_arbre = $par4.lepar_arbre;
				les_pars_arbre.ajouteFils(par4_arbre);
			}		
		)*
;

date returns [Arbre date_arbre = new Arbre("")]
	@init	{mois_arbre, annee_arbre;} : 
		(jour = NUMBER 
			{
				jour_arbre = $jour.lepar_arbre;
				date_arbre.ajouteFils(jour_arbre);
			}
		)?
		(mois = MOIS 
			{
				mois_arbre = $mois.lepar_arbre;
				date_arbre.ajouteFils(mois_arbre);
			}
		)?
		(annee = NUMBER
			{
				annee_arbre = $annee.lepar_arbre;
				date_arbre.ajouteFils(annee_arbre);
			}
		)?
	;


auteur returns [Arbre abr = new Arbre("")] :
	a = VAR+
		{ abr.ajouteFils(new Arbre("auteur = ", "'"+a.getText()+"'"));}
;

mot returns [Arbre lepar_arbre = new Arbre("")] :
	a = VAR+
		{ lepar_arbre.ajouteFils(new Arbre("mot =", "'"+a.getText()+"'"));}
;


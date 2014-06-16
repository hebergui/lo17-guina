package com.lo17.projet;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class LexiqueMain {
	String phrase;
	String path;
	
	public LexiqueMain(String phrase, String path)
	{
		this.path = path;
		this.phrase = conversion(phrase);
	}
	
	public String getPhrase() {
		return this.phrase;
	}
	
	public String conversion(String chaine){
		String chaineRetour = "";
         /*chaine = chaine.replaceAll("Une", "rubriqueune"); //gère le pb de Une la rubrique et une l'article
         chaine = chaine.replaceAll("UNE", "rubriqueune"); //idem
         chaine = chaine.replaceAll("Unes", "rubriqueune"); //gère le pb de Une la rubrique et une l'article
         chaine = chaine.replaceAll("UNES", "rubriqueune"); //idem*/
         chaine = chaine.replaceAll("\\?", "");
         chaine = chaine.replaceAll("\\,", "");
         chaine = chaine.replaceAll("\"", "");
         chaine = chaine.toLowerCase();

         String mot="", lemme = "";
         Hashtable meilleurs_candidats = new Hashtable();
         Hashtable corrections_mots = new Hashtable();
         Enumeration enum_mots;

         LexiqueG lex = new LexiqueG(this.path + "lexique_revert.txt");
         lex.lireFichier();

         StringTokenizer st = new StringTokenizer(chaine);
         while (st.hasMoreTokens()) {
       	  String mot_courant = st.nextToken();

             //System.out.println("\n" + mot_courant + "\n");

        	  if(lex.hasCorrection(mot_courant)!="")
        	  {
       		  lemme = lex.hasCorrection(mot_courant);
       		  chaineRetour += lemme + " ";
       		  //System.out.println("lemme = " + lemme);
        	  }
        	  else
        	  {
	                Lexique l = new Lexique(this.path + "lexicA12.txt");
	      			l.lireFichier();

	      			lemme = l.retournerLemme(mot_courant);
	      			if(lemme!="")
	      				chaineRetour += lemme + " ";
	      				//System.out.println("mot existe, lemme = " + lemme + "\n");
	      			else
	      			{
	      				//System.out.println("***Lemmes retourn�s par l'algorithme de proximit�***");
	      				meilleurs_candidats = l.getLemmeByPrefixe(mot_courant);
	      				enum_mots = meilleurs_candidats.keys();
	      				if(enum_mots.hasMoreElements())
	      				{
	      					mot = (String)enum_mots.nextElement();
	      					lemme = (String) meilleurs_candidats.get(mot);

	      					chaineRetour += lemme + " ";
	      					//System.out.println("lemme : " + lemme + " mot : " + mot);
	      				}

	      				if(meilleurs_candidats.isEmpty())
	      				{
	      					//System.out.println("***Lemmes retourn�s par l'algorithme de Levenshtein***");
	      					meilleurs_candidats = l.getLemmeByLevenshtein(mot_courant);
	      					enum_mots = meilleurs_candidats.keys();
		      				if(enum_mots.hasMoreElements())
		      				{
		      					mot = (String)enum_mots.nextElement();
		      					lemme = (String) meilleurs_candidats.get(mot);

		      					chaineRetour += lemme + " ";
		      					//System.out.println("lemme : " + lemme + " mot : " + mot);
		      				}
	      				}
	      				if(meilleurs_candidats.isEmpty())
	      				{
                                               chaineRetour += mot_courant + " ";
	      					//System.out.println("Aucun mot trouve");
	      				}
	      			}
        	  }
          }
         //System.out.println(chaineRetour.replaceAll("rubriqueune", "UNE") + ".");
         System.out.println(chaineRetour + ".");
		
		
		//return chaineRetour.replaceAll("rubriqueune", "une") + ".";
         return chaineRetour + ".";
	}
}

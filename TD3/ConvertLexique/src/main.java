import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;


class main{
     public static void main(String[] args) {
     BufferedReader br=null;
     String chaine;
     String chaineRetour="";

     try {
          try {
              br = new BufferedReader(new InputStreamReader(System.in));
              System.out.print("saisissez une phrase : ");
              chaine=br.readLine();
              chaine = chaine.replaceAll("Une", "rubriqueune"); //gère le pb de Une la rubrique et une l'article
              chaine = chaine.replaceAll("UNE", "rubriqueune"); //idem
              chaine = chaine.replaceAll("Unes", "rubriqueune"); //gère le pb de Une la rubrique et une l'article
              chaine = chaine.replaceAll("UNES", "rubriqueune"); //idem
              chaine = chaine.replaceAll("\\?", "");
              chaine = chaine.replaceAll("\\,", "");
              chaine = chaine.replaceAll("\"", "");
              chaine = chaine.toLowerCase();

              String mot="", lemme = "";
              Hashtable meilleurs_candidats = new Hashtable();
              Hashtable corrections_mots = new Hashtable();
              Enumeration enum_mots;

              LexiqueG lex = new LexiqueG("lexique_revert.txt");
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
		                Lexique l = new Lexique("lexicA12.txt");
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
              System.out.println(chaineRetour.replaceAll("rubriqueune", "une") + ".");
              //System.out.println(chaineRetour);
          }
          catch(EOFException e) {
               br.close();
               }
          }
     catch(IOException e) {
          System.out.println("IO Exception");
          }
     }
}



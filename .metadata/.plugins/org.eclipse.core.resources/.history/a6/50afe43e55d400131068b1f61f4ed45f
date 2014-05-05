import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.StringTokenizer;

class main{
     public static void main(String[] args) {
     BufferedReader br=null;
     String chaine;
     try {
          try {
              br = new BufferedReader(new InputStreamReader(System.in));
              System.out.print("saisissez une phrase : ");
              chaine=br.readLine(); 
              String mot="", lemme = "";
              Hashtable meilleurs_candidats = new Hashtable();
              Enumeration enum_mots;
              
              StringTokenizer st = new StringTokenizer(chaine);
              while (st.hasMoreTokens()) {
            	  	String mot_courant = st.nextToken();
                   System.out.println("\n" + mot_courant + "\n");           
             
	                Lexique l = new Lexique("lexicA12.txt");		
	      			l.lireFichier();		
	      			
	      			lemme = l.retournerLemme(mot_courant);
	      			if(lemme!="")
	      				System.out.println("mot existe, lemme = " + lemme + "\n");
	      			else
	      			{
	      				System.out.println("***Lemmes retournés par l'algorithme de proximité***");
	      				meilleurs_candidats = l.getLemmeByPrefixe(mot_courant);
	      				enum_mots = meilleurs_candidats.keys();
	      				while(enum_mots.hasMoreElements())
	      				{		
	      					mot = (String)enum_mots.nextElement();
	      					lemme = (String) meilleurs_candidats.get(mot);
	      					
	      					System.out.println("lemme : " + lemme + " mot : " + mot);	
	      				}
	      				
	      				if(meilleurs_candidats.isEmpty())
	      				{
	      					System.out.println("***Lemmes retournés par l'algorithme de Levenshtein***");
	      					meilleurs_candidats = l.getLemmeByLevenshtein(mot_courant);
	      					enum_mots = meilleurs_candidats.keys();
		      				while(enum_mots.hasMoreElements())
		      				{		
		      					mot = (String)enum_mots.nextElement();
		      					lemme = (String) meilleurs_candidats.get(mot);
		      					
		      					System.out.println("lemme : " + lemme + " mot : " + mot);	
		      				}
	      				}
	      				if(meilleurs_candidats.isEmpty())
	      					System.out.println("Aucun mot trouve");
	      			}
               } 
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



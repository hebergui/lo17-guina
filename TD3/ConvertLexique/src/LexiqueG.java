import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;



public class LexiqueG {
	String fichier;
	Hashtable corrections;
	
	public LexiqueG(String nomFichier)
	  {
	    fichier = nomFichier;
	    corrections = new Hashtable();
	  }
	
	public String hasCorrection(String mot)
	{
		String cor = "";
				
		if(corrections.containsKey(mot))
			cor = (String) corrections.get(mot);	
	
		return cor;
	}
	
	public void lireFichier()
	{
		BufferedReader br=null;
		String chaine;
		String[] tokens = new String[2];
		try {
	          try {
	              br = new BufferedReader(new FileReader(fichier));
	               while ((chaine=br.readLine())!=null)
	               {
	            	    tokens = chaine.split("\\s+");
	            	    corrections.put(tokens[0], tokens[1]);
	               }
	           } 
	          catch(EOFException e) {
	               br.close();
	               }
	          } 
	     catch(FileNotFoundException e) {
	          System.out.println("fichier inconnu : " + fichier);
	          } 
	     catch(IOException e) {
	          System.out.println("IO Exception");
	          }
	     }

}

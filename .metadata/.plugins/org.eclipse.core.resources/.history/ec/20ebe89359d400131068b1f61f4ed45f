import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;


public class Lexique {
	String fichier;
	Hashtable lemmes;
	int seuilMin = 3;
	int seuilMax = 4;
	
	public Lexique(String nomFichier)
	  {
	    fichier = nomFichier;
	    lemmes = new Hashtable();
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
	               		lemmes.put(tokens[0], tokens[1]);
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
	
	
	public String retournerLemme(String mot)
	{
		String lemme = "";
		
		mot = mot.toLowerCase();
		
		if(lemmes.containsKey(mot))
			lemme = (String) lemmes.get(mot);
		
		return lemme;
	}
	
	public Hashtable getLemmeByPrefixe(String mot)
	{
		double prox;
		double prox_max=60;
		
		Enumeration enum_keys=lemmes.keys();
		String mot_candidat="";
		ArrayList<String> meilleurs_candidats = new ArrayList<String>();
		Hashtable mot_lemme = new Hashtable();
		
		while(enum_keys.hasMoreElements())
		{
			mot_candidat = (String)enum_keys.nextElement();
			prox = prefixe(mot, mot_candidat);
			
			if(prox==prox_max)
				meilleurs_candidats.add(mot_candidat);
				
			if (prox>prox_max)
			{
				prox_max = prox;
				meilleurs_candidats.clear();
				meilleurs_candidats.add(mot_candidat);
			}
		}
		
		Iterator<String> it = meilleurs_candidats.iterator();
		while (it.hasNext()) {			
				String meilleur_mot = it.next();
				String meilleur_lemme = (String) lemmes.get(meilleur_mot);
				
				mot_lemme.put(meilleur_mot, meilleur_lemme);
			}
		
		return mot_lemme;
	}
	
	public Hashtable getLemmeByLevenshtein(String mot)
	{
		int distance;
		int distance_min = mot.length()/2;
		
		Enumeration enum_keys=lemmes.keys();
		String mot_candidat="";
		ArrayList<String> meilleurs_candidats = new ArrayList<String>();
		
		Hashtable mot_lemme = new Hashtable();
		
		while(enum_keys.hasMoreElements())
		{
			mot_candidat = (String)enum_keys.nextElement();
			distance = levenshtein(mot, mot_candidat);
			
			if(distance==distance_min)
			{
				System.out.println("mot : " + mot_candidat + " distance : " + distance);
				meilleurs_candidats.add(mot_candidat);
			}
				
			if (distance<distance_min)
			{
				System.out.println("mot : " + mot_candidat + " distance : " + distance);
				distance_min = distance;
				meilleurs_candidats.clear();
				meilleurs_candidats.add(mot_candidat);
			}
		}
		
		Iterator<String> it = meilleurs_candidats.iterator();
		while (it.hasNext()) {			
				String meilleur_mot = it.next();
				String meilleur_lemme = (String) lemmes.get(meilleur_mot);
				
				mot_lemme.put(meilleur_mot, meilleur_lemme);
			}
		
		return mot_lemme;
	}
	
	double prefixe(String mot1, String mot2)
	{			
		int i=0, l1 = mot1.length(), l2 = mot2.length();
		double prox = 0;
		
		if(l1>seuilMin && l2>seuilMin && Math.abs(l1-l2) < seuilMax)
		{
			i=0;
			while(i<Math.min(l1,l2) && mot1.charAt(i)==mot2.charAt(i))
			{
				i++;
			}
			prox = ((double)(i)/(double)(Math.max(l1,l2)))*100;
		}
		
		return prox;
	}
	
	private int minimum(int a, int b, int c) {
		return Math.min(Math.min(a, b), c);
	}
	
	public int levenshtein(String str1,String str2) {
			int[][] distance = new int[str1.length() + 1][str2.length() + 1];
	 
			for (int i = 0; i <= str1.length(); i++)
				distance[i][0] = i;
			for (int j = 1; j <= str2.length(); j++)
				distance[0][j] = j;
	 
			for (int i = 1; i <= str1.length(); i++)
				for (int j = 1; j <= str2.length(); j++)
					distance[i][j] = minimum(
							distance[i - 1][j] + 1,
							distance[i][j - 1] + 1,
							distance[i - 1][j - 1]+ ((str1.charAt(i - 1) == str2.charAt(j - 1)) ? 0 : 1));
	 
			return distance[str1.length()][str2.length()];    
		}
}

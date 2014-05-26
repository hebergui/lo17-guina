package main;

import java.io.FileInputStream;

import org.apache.jena.larq.IndexBuilderString;
import org.apache.jena.larq.IndexLARQ;
import org.apache.jena.larq.LARQ;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.query.ResultSetFormatter;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Property;

public class tplo17main {
	public static String ontoFilename = "documents/lo17.owl";
	public static String ontoFilenameN3 = "documents/lo17.n3";
	public static String kbUTF8Filename = "documents/kblo17-utf8.owl";
	public static String LO17_PREFIX = "lo17";
	public static Logger logger = Logger.getLogger("com.hp");

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BasicConfigurator.configure();
		logger.setLevel(Level.INFO);
		q2();
		q3();

	}

	public static void q2() {
		Model model = null;
		model = ModelFactory.createDefaultModel();
		try {
			// Crée un model
			model.read(new FileInputStream("documents/lo17.owl"), "RDF/XML");
			query2_a(model);
			query2_b(model);
			query2_c(model);
			query2_d(model);
			// à continuer
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Exemple de requête à partir d'un fichier
	 * @param model
	 */
	public static void query2_a(Model model) {
		Query q = readFileQuery("queries/query_concept.sparql");
		// Remplacer les ???? dans le fichier requête
		System.out.println("===== Concepts =====");
		runQuery(q, model);
	}
	
	/**
	 * Exemple de requête à partir d'un fichier
	 * @param model
	 */
	public static void query2_b(Model model) {
		Query q = readFileQuery("queries/query_relation.sparql");
		// Remplacer les ???? dans le fichier requête
		System.out.println("===== Relations =====");
		runQuery(q, model);
	}
	
	/**
	 * Exemple de requête à partir d'un fichier
	 * @param model
	 */
	public static void query2_c(Model model) {
		Query q = readFileQuery("queries/query_attribut.sparql");
		// Remplacer les ???? dans le fichier requête
		System.out.println("===== Attributs =====");
		runQuery(q, model);
	}
	
	/**
	 * Exemple de requête à partir d'un fichier
	 * @param model
	 */
	public static void query2_d(Model model) {
		Query q = readFileQuery("queries/query_domainetitreauteur.sparql");
		// Remplacer les ???? dans le fichier requête
		System.out.println("===== Concepts domaines de � hasTitreArticle � et de � hasAuteur �  =====");
		runQuery(q, model);
	}
	
	public static void q3() {
		Model model = null;
		model = ModelFactory.createDefaultModel();
		try {
			// Crée un model
			model.read(new FileInputStream("documents/kblo17-utf8.owl"), "RDF/XML");
			query3_a(model);
			query3_b(model);
			query3_c(model);
			query3_d(model);
			// à continuer
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	/**
	 * Exemple de requête à partir d'un fichier
	 * @param model
	 */
	public static void query3_a(Model model) {
		Query q = readFileQuery("queries/query_auteurune.sparql");
		// Remplacer les ???? dans le fichier requête
		System.out.println("===== Auteurs des unes  =====");
		runQuery(q, model);
	}
	
	/**
	 * Exemple de requête à partir d'un fichier
	 * @param model
	 */
	public static void query3_b(Model model) {
		Query q = readFileQuery("queries/query_themegrostitre.sparql");
		// Remplacer les ???? dans le fichier requête
		System.out.println("===== Th�mes des gros titres  =====");
		runQuery(q, model);
	}
	
	/**
	 * Exemple de requête à partir d'un fichier
	 * @param model
	 */
	public static void query3_c(Model model) {
		Query q = readFileQuery("queries/query_resumecanada.sparql");
		// Remplacer les ???? dans le fichier requête
		System.out.println("===== R�sum�s contenant le mot Canada =====");
		runQuery(q, model);
	}
	
	/**
	 * Exemple de requête à partir d'un fichier
	 * @param model
	 */
	public static void query3_d(Model model) {
		Query q = readFileQuery("queries/query_resumedate20032009.sparql");
		// Remplacer les ???? dans le fichier requête
		System.out.println("===== R�sum�s contenant une date comprise entre 2003 et 2009 =====");
		runQuery(q, model);
	}

	/**
	 * Retourne une query à partir d'un nom de fichier
	 * @param filename
	 * @return
	 */
	public static Query readFileQuery(String filename) {
		return QueryFactory.read(filename);
	}

	/**
	 * Retourne une query à partir de la chaîne de la query
	 * @param queryString
	 * @return
	 */
	public static Query readStringQuery(String queryString) {
		return QueryFactory.create(queryString);
	}

	/**
	 * Exécute une query sur un model. L'affichage se fait dans la console
	 * @param q
	 * @param model
	 */
	public static void runQuery(Query q, Model model) {
		QueryExecution queryExecution = QueryExecutionFactory.create(q, model);
		ResultSet r = queryExecution.execSelect();
		ResultSetFormatter.out(System.out, r);
		queryExecution.close();
	}

	
	/**
	 * Exécute une query nécessitant un index LARQ.
	 * La sortie se fait dans la console
	 * @param q
	 * @param index
	 * @param model
	 */
	public static void queryIndex(Query q, IndexLARQ index, Model model) {
		QueryExecution queryExecution = QueryExecutionFactory.create(q, model);
		LARQ.setDefaultIndex(queryExecution.getContext(), index);
		ResultSet r = queryExecution.execSelect();
		ResultSetFormatter.out(System.out, r);
		queryExecution.close();
	}
	
	/**
	 * Retourne l'index des noeuds littéraux de toute la base
	 * @param model
	 * @return
	 */
	public static IndexLARQ getWholeStringIndex(Model model) {
		IndexBuilderString larqBuilder = new IndexBuilderString();
		larqBuilder.indexStatements(model.listStatements());
		larqBuilder.closeWriter();
		model.unregister(larqBuilder);
		return larqBuilder.getIndex();
	}
	/**
	 * Crée un index à partir du nom local d'une propriété
	 * usage : IndexLARQ titreIndex = getPropertyIndex(model, "hasTitreArticle");
	 * @param model
	 * @param propertyLocalName
	 * @return
	 */
	public static IndexLARQ getPropertyIndex(Model model,String propertyLocalName) {
		Property p = getProperty(model, propertyLocalName);
		IndexBuilderString larqBuilder = new IndexBuilderString(p);
		larqBuilder.indexStatements(model.listStatements());
		larqBuilder.closeWriter();
		model.unregister(larqBuilder);
		return larqBuilder.getIndex();
    }
	/**
	 * Méthode privée utile pour la méthode précédente.
	 * @param model
	 * @param localName
	 * @return
	 */
	private static Property getProperty(Model model, String localName) {
		String nslo17 = model.getNsPrefixURI(LO17_PREFIX);
		Property p = model.getProperty(nslo17 + localName);
		return p;
	}
}

package com.lo17.projet;

import java.io.*;
//import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

public class TalMain {
	public String phrase;
	public String path;
	
	public TalMain(String phrase, String path)
	{
		this.path = path;
		this.phrase = conversion(phrase);
	}
	
	public String getPhrase() {
		return this.phrase;
	}
	
	public String conversion(String s) {
		Tal_simpleLexer lexer;
		String arbre= "";
		try {
			lexer = new Tal_simpleLexer(new ANTLRReaderStream(new StringReader(s)));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			Tal_simpleParser parser = new Tal_simpleParser(tokens);
			arbre = parser.listerequetes();
			System.out.println(arbre);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arbre;
	}
}

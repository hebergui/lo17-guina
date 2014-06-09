package com.lo17.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import com.lo17.projet.LexiqueMain;
import com.lo17.projet.TalMain;

import java.sql.*;

public class LanceRequete extends HttpServlet {

private static final long serialVersionUID = 1L;
	String username;
	String password;
	String url;
	String requete ="";
	String nom;
	int nbre;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String path = getServletContext().getRealPath("/");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
        out.println("<head>");
        //out.println("<link rel='stylesheet' type='text/css' href='"+path+"style.css'>");
        out.println("<link rel='stylesheet' type='text/css' href='style.css'>");
        out.println("<title>Lance requete!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='results'>");
		
		username = "lo17xxx";
		password = "dblo17";
		url = "jdbc:postgresql://tuxa.sme.utc/dblo17"; //url = "jdbc:postgresql://tuxa/dblo17";
		
		String requete;
		requete = request.getParameter("requete");
		
		if (requete != null) {
			
			
			LexiqueMain lexiqueMain = new LexiqueMain(requete, path);
			TalMain talMain = new TalMain(lexiqueMain.getPhrase(), path);
			
			out.println("<div class='info'>");
			if (requete.length() < 3) {
		        out.println("<span class='error'> La requete a retourne 0 resultat </span>");
			}

			out.println("<table id='info-table'><tr><td class='table-th'>Requete NL : </td><td>"+requete+"</td></tr>");
			out.println("<tr><td class='table-th'>Normalisation : </td><td>"+lexiqueMain.getPhrase()+"</td></tr>");
			out.println("<tr><td class='table-th'>Requete SQL : </td><td>"+talMain.getPhrase()+"</td></tr></table>");
	        out.println("</div>");
	        
	        requete = talMain.getPhrase();
			
			// INSTALL/load the Driver
			try {
				Class.forName("org.postgresql.Driver");
			} catch(java.lang.ClassNotFoundException e) {
				System.err.print("ClassNotFoundException: ");
				System.err.println(e.getMessage());
			}
			try {
				Connection con;
				Statement stmt;
				// Establish Connection to the database at URL with username and password
				con = DriverManager.getConnection(url, username, password);
				stmt = con.createStatement();
				// Send the query and bind to the result set
				ResultSet rs = stmt.executeQuery(requete);
				ResultSetMetaData rsmd=rs.getMetaData();
				nbre=rsmd.getColumnCount();
				
				int rowcount = 0;
				/*if (rs.last()) {
				  rowcount = rs.getRow();
				  rs.beforeFirst();
				}*/
				
				out.println("<div class='info'>");
				out.println("<span class='no-error'> La requete a retourne "+nbre+" resultats</span>");
				out.println("</div>");				
				
				while (rs.next()) {
					for (int i=1; i<=nbre;i++){
						nom = rsmd.getColumnName(i);
						String s = rs.getString(nom);
						out.print("<div class='div-link'><a class='link' href='"+path+"LCI/"+s+"'>"+s+"</a></div>");
					}
				}
				
				out.println("</div>");
				out.println("</body>");
				out.println("</html>");
				// Close resources
				stmt.close();
				con.close();
			} catch(SQLException ex) {
				System.err.println("==> SQLException: ");
				
				while (ex != null) {
					System.out.println("Message:   " + ex.getMessage ());
					System.out.println("SQLState:  " + ex.getSQLState ());
					System.out.println("ErrorCode: " + ex.getErrorCode ());
					ex = ex.getNextException();
					System.out.println("");
				}
			}
		}
	}
}
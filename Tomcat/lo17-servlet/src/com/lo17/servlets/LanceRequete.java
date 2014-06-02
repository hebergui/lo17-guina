package com.lo17.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import com.lo17.projet.LexiqueMain;
import com.lo17.projet.TalMain;

import java.sql.*;

public class LanceRequete extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String username;
	String password;
	String url;
	String requete ="";
	String nom;
	int nbre;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
    	response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Lance requete</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Lance requete!</h1>");

	// ---- configure START
	username = "lo17xxx";
	password = "dblo17";
	// The URL that will connect to TECFA's MySQL server
        // Syntax: jdbc:TYPE:machine:port/DB_NAME
    //url = "jdbc:postgresql://tuxa/dblo17";
	// dans certaines configurations locales il faut définir l'url par :
	 url = "jdbc:postgresql://tuxa.sme.utc/dblo17";
	// ---- configure END

	String requete;
        requete = request.getParameter("requete");
	if (requete != null) {
		out.println("REQUETE : " + requete + "<br>");
		
		String path = getServletContext().getRealPath("/");
		
		LexiqueMain lexiqueMain = new LexiqueMain(requete, path);
		requete = lexiqueMain.getPhrase();
		out.println("REQUETE : " + requete + "<br>");
		
		TalMain talMain = new TalMain(requete, path);
		requete = talMain.getPhrase();
		out.println("REQUETE : " + requete + "<br>");
		
		// INSTALL/load the Driver (Vendor specific Code)
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
			while (rs.next()) {
				for (int i=1; i<=nbre;i++){
				nom = rsmd.getColumnName(i);
				String s = rs.getString(nom);
				out.print("<a href=\"\">"+ s +"</a>");
				}
			out.print("<p>");
			}
		out.println("</body>");
		out.println("</html>");
		// Close resources
		stmt.close();
		con.close();
		}
		// print out decent erreur messages
		catch(SQLException ex) {
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
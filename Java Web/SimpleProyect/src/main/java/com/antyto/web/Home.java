package com.antyto.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String lengFav = request.getParameter("lengFav");
		String ciudad = request.getParameter("ciudad");
		
//If any of the queries above is missing, we will put Unknown:
		if (nombre == null) {
			nombre = "Unknown";
		}
		if (apellido == null) {
			apellido = "Unknown";
		}
		if (lengFav == null) {
			lengFav = "Unknown";
		}
		if (ciudad == null) {
			ciudad = "Unknown";
		}

// TODO Auto-generated method stub
		response.setContentType("text/html");
        // writes the response on the webpage:
		//Example URL: http://localhost:8080/SimpleProject/Home?lastName=Brown&firstName=Bobby&favoriteLanguage=Java&homeTown=Brooklyn
        PrintWriter out = response.getWriter();
        out.write("<h1>Welcome, " + nombre + " " + apellido + "</h1>");
        out.write("<h3>Your favour language is: " + lengFav + "</h3>");
        out.write("<h3>Your hometown is: " + ciudad + "</h3>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

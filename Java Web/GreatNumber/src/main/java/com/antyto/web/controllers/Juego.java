package com.antyto.web.controllers;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Juego
 */
@WebServlet("/Juego")
public class Juego extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Juego() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sesion = request.getSession();
		Integer numRand = (int)(Math.random() * 99) + 1;
		if(sesion.getAttribute("gameOver") == null) {
			sesion.setAttribute("gameOver", false);
			sesion.setAttribute("randomNumber", numRand);
			sesion.setAttribute("hasGuessed", false);
			sesion.setAttribute("tooHigh", false);
		}
		
		request.getRequestDispatcher("/WEB-INF/juego.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession sesion = request.getSession();

		Integer numero = Integer.parseInt(request.getParameter("numero"));
		Random numRand = new Random();
		
		if(sesion.getAttribute("num") == null) {
			sesion.setAttribute("num", numRand.nextInt(100));
		}
		else {
			Integer num = (Integer) sesion.getAttribute("num");
			System.out.println(num);
			if(numero.equals(num)) {
				sesion.setAttribute("num", numRand.nextInt(100));
				sesion.setAttribute("response", "correct");
				
			}
			else if((int)numero > (int)num) {
				sesion.setAttribute("response", "high");	
			}
			else {
				sesion.setAttribute("response", "low");		
			}
			
			response.sendRedirect("/GreatNumber/Juego");
//			doGet(request, response);
		}
	}

}

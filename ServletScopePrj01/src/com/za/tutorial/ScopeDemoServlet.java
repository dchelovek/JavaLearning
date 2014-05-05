package com.za.tutorial;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ScopeDemoServlet
 */
@WebServlet("/ScopeDemoServlet")
public class ScopeDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Person requestPerson = new Person();
		requestPerson.setName("request person name");
		request.setAttribute("requestPerson", requestPerson);
		
		
		Person sessionPerson = new Person();
		sessionPerson.setName("session person name");
		request.getSession(true).setAttribute("sessionPerson", sessionPerson);
		
		Person servletPerson = new Person();
		servletPerson.setName("servletPerson");
		getServletContext().setAttribute("servletPerson", servletPerson);
		
		getServletContext().getRequestDispatcher("/ScopeDemoForwardServlet").forward(request, response);
	}

}

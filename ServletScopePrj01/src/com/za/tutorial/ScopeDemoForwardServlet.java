package com.za.tutorial;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ScopeDemoForwardServlet
 */
@WebServlet("/ScopeDemoForwardServlet")
public class ScopeDemoForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Object requestPersonAttributeValue = request.getAttribute("requestPerson");
		
		if(requestPersonAttributeValue != null){
			Person requPerson = (Person)requestPersonAttributeValue;
			response.getWriter().print(requPerson.getName());
			
		}
		
		Object sessionPerson = request.getSession().getAttribute("sessionPerson");
		if(sessionPerson != null){
			Person sessPerson = (Person)sessionPerson;
			response.getWriter().print(sessPerson.getName());
			
		}
		
		Object servletPersonAttributeValue = getServletContext().getAttribute("servletPerson");
		if(servletPersonAttributeValue != null){
			Person servletPerson = (Person)servletPersonAttributeValue;
			response.getWriter().print(servletPerson.getName());
		}
		
	}

}

package com.za.tutorial;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AttributeScopeDemoServlet
 */
@WebServlet("/AttributeScopeDemoServlet")
public class AttributeScopeDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Person servletContextPerson = new Person();
		servletContextPerson.setName("servlet_context_name");
		getServletContext().setAttribute("servletContextPerson", servletContextPerson);
		
		Person sessionPerson = new Person();
		sessionPerson.setName("sessionPerson_name");
		request.getSession(true).setAttribute("sessionPerson", sessionPerson);
		
		Person requestPerson = new Person();
		requestPerson.setName("requestPerson_Name");
		request.setAttribute("requestPerson", requestPerson);
		
		getServletContext().getRequestDispatcher("/attrScopesDemo.jsp").forward(request, response);
	}

}

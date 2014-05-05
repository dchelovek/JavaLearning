package com.za.tutorial.mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletController
 */
@WebServlet("/ServletController")
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletController() {
        super();
        
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PersonBeanModel person = new PersonBeanModel();
		String name = request.getParameter("name");
		person.setName(name);
		
		String email = request.getParameter("email");
		person.setEmail(email);
		person.doSmth();
		request.setAttribute("person", person);
		if((name!=null) && (email!=null)){
			getServletContext().getRequestDispatcher("/View.jsp").forward(request, response);
		}
		else{
			getServletContext().getRequestDispatcher("/ViewInitial.jsp").forward(request, response);
		}
	}

}

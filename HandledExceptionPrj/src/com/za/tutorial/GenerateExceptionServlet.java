package com.za.tutorial;

import java.io.EOFException;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GenerateExceptionServlet
 */
@WebServlet("/GenerateExceptionServlet")
public class GenerateExceptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = null;
		Object actionObject = request.getParameter("action");
		if(actionObject != null){
			action = (String)actionObject;
			if(action.equals("ServletException")) throw new ServletException("ServletException in GenarateExceptionServlet...");
			else if(action.equals("IOException")) throw new IOException("IOException in GenarateExceptionServlet...");
			else if(action.equals("EOFException")) throw new EOFException("EOFException in GenarateExceptionServlet...");
		}
		 
				
	}

}

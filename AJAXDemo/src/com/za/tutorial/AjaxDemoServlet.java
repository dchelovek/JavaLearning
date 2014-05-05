package com.za.tutorial;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AjaxDemoServlet
 */
@WebServlet("/AjaxDemoServlet")
public class AjaxDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AjaxDemoServlet() {
        super();
     }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("server received the message from client: "+ request.getParameter("name"));
		response.setContentType("text/xml");
		response.getWriter().println("<responseFromServer>hi "+request.getParameter("name")+"</responseFromServer>");
		System.out.println("server replied with the message to client: hi "+ request.getParameter("name"));
	}

}

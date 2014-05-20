package com.za.tutorial;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HandleErrorServlet
 */
@WebServlet("/HandleErrorServlet")
public class HandleErrorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
		String errorMessage = (String) request.getAttribute("javax.servlet.error.message");
		String request_URI = (String) request.getAttribute("javax.servlet.error.request_uri");
		String servletName = (String)request.getAttribute("javax.servlet.error.servlet_name");
//		Throwable errorException = (Throwable)request.getAttribute("javax.servlet.error.exception");
//		Class<?> exceptionType = (Class<?>)request.getAttribute("javax.servlet.error.exception_type");
		
		pw.println("<html>");
		pw.println("<head><title>Handle Errors</title></head>");
		pw.println("<body>");
		pw.println("status code: "+ statusCode + "<br>");
		pw.println("error message: "+ errorMessage + "<br>");
		pw.println("request uri: " +request_URI + "<br>");
		pw.println("servlet: " +servletName + "<br>");
//		pw.println("exception: " +errorException.getMessage() + "<br>");
//		pw.println("exception type: " +exceptionType.toString() + "<br>");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();

	}

}

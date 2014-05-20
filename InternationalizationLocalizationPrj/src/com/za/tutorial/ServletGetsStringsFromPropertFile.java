package com.za.tutorial;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletGetsStringsFromPropertFile")
public class ServletGetsStringsFromPropertFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ResourceBundle resourceBundle = ResourceBundle.getBundle("i18n.DemoBundle", request.getLocale());
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		
		pw.println("<html>");
		pw.println("<head><title>Internationalization & Localization</title></head>");
		pw.println("<body>");
		pw.println(resourceBundle.getString("SIGN_IN"));
		pw.print("<img src=\"");
		pw.print(resourceBundle.getString("FLAG"));
		pw.println("\" width=\"22\" height=\"14\">");
		
		pw.println("<br>");
		pw.println(resourceBundle.getString("USERNAME"));
		pw.println("<br>");
		pw.println("<input type=\"text\" name=\"username\">");
		pw.println("<br>");
		pw.println(resourceBundle.getString("PASSWORD"));
		pw.println("<br>");
		pw.println("<input type=\"text\" name=\"password\">");
		pw.println("<br>");
		pw.println("<input type=\"submit\" name=\"action\" value=\""+resourceBundle.getString("SIGN_IN")+"\">");

		pw.println("</body>");
		pw.println("</html>");
		pw.close();

	}

}

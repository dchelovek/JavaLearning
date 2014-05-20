package com.za.tutorial;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * Servlet implementation class Log4jServlet01
 */
@WebServlet("/Log4jServlet_with_props")
public class Log4jServlet_with_props extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Logger logger = null;
	public void init(ServletConfig config)throws ServletException{
		logger = Logger.getRootLogger();
//		PropertyConfigurator.configure("d:\\JAVA\\Projects\\Learning\\workspace\\JavaLearning\\Log4JPrj\\src\\log4j.properties");
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		logger.setLevel(Level.DEBUG);
		
		logger.debug("Debug level message");
		logger.info("Info level message");
		logger.warn("Warn level message");
		logger.error("Error level message");
		logger.fatal("Fatal level message");

		logger.info(getServletContext().getResource("log4j.properties").toString());
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		
		pw.println("<html>");
		pw.println("<head><title>Log4J web applications</title></head>");
		pw.println("<body>");
		pw.println("log4j with conf file<br>");
		pw.println("logger name: " +logger.getName());
		pw.println("</body>");
		pw.println("</html>");

		pw.close();
	}

}

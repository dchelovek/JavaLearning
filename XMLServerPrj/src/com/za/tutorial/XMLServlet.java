package com.za.tutorial;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class XMLServlet
 */
@WebServlet("/XMLServlet")
public class XMLServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	final String FILE_LOCATION = "/xmlfiles";
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Object reqObject = request.getParameter("filename");
		if(reqObject != null){
			String filename = (String)reqObject;
			URL url = getServletContext().getResource(FILE_LOCATION + "/" + filename);
			response.setContentType("text/xml");
			
			PrintWriter pw = response.getWriter();
			URLConnection urlConnection = url.openConnection();
			urlConnection.connect();
			BufferedInputStream bufferedInputStream = new BufferedInputStream(urlConnection.getInputStream());
			int bytesOfDataRead = bufferedInputStream.read();
			while(bytesOfDataRead != -1){
				pw.write(bytesOfDataRead);
				bytesOfDataRead = bufferedInputStream.read();
			}
			if(pw != null) pw.close();
			if(bufferedInputStream != null) bufferedInputStream.close();
			
		}
	}

}

package com.za.tutorial;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GenerateErrorServlet")
public class GenerateErrorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = null;
		Object actionObject = request.getParameter("action");
		if(actionObject != null){
			action = (String)actionObject;
			if(action.equals("404"))response.sendError(404,"Not Found");
			else if(action.equals("401")) response.sendError(401,"Unathor333ized");
			else if(action.equals("403")) response.sendError(403,"Forbidden");
		}

	}

	

}

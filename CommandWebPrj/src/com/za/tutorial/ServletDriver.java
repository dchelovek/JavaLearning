package com.za.tutorial;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.za.tutorial.patterns.command.CommandInvoker;
import com.za.tutorial.patterns.command.CommandMgr;

@WebServlet("/ServletDriver")
public class ServletDriver extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletDriver() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		CommandMgr mgr = null;
		CommandInvoker inv = null;
		
		if(session.getAttribute("invoker")==null){
			mgr = new CommandMgr();
			inv = new CommandInvoker(mgr);
			session.setAttribute("invoker", inv);
		}else{
			inv = (CommandInvoker)session.getAttribute("invoker");
			mgr = inv.getMgr();
		}
		String command = request.getParameter("command");
		if(command!= null){
			inv.invoke(command);
			CommandMgr.printHistory(mgr);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.za.tutorial.Person" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>jspScopes - Initial</title>
</head>
<body>
<%
	Person servletContextPerson = new Person("a_ServletContextPerson_Name");
	getServletContext().setAttribute("servletContextPerson", servletContextPerson);

	Person sessionPerson = new Person("a_sessionPerson_Name");
	request.getSession(true).setAttribute("sessionPerson", sessionPerson);
	
	Person requestPerson = new Person("a_requestPerson_Name");
	request.setAttribute("requestPerson", requestPerson);
	
	Person pageContextPerson = new Person("a_pageContextPerson_Name");
	pageContext.setAttribute("pageContextPerson", pageContextPerson);
	
	getServletContext().getRequestDispatcher("/jspViewForwrd.jsp").forward(request, response);
%>
</body>
</html>
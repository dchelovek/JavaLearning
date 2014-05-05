<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.za.tutorial.Person" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

Object servletContextPersonAttribute = getServletContext().getAttribute("servletContextPerson");
Object sessionPersonAttribute = session.getAttribute("sessionPerson");
Object requestPersonAttribute = request.getAttribute("requestPerson");
Object pageContextPersonAttribute = pageContext.getAttribute("pageContextPerson");

if(servletContextPersonAttribute != null){
	out.println(((Person)servletContextPersonAttribute).getName());
}

if(sessionPersonAttribute != null){
	out.println(((Person)sessionPersonAttribute).getName());	
	
}

if(requestPersonAttribute != null){
	out.println(((Person)requestPersonAttribute).getName());	
}

if(pageContextPersonAttribute != null){
	out.println(((Person)pageContextPersonAttribute).getName());	
}

%>
</body>
</html>
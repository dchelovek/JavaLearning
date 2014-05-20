<%@page import="java.util.ResourceBundle"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% ResourceBundle resBundle = ResourceBundle.getBundle("i18n.DemoBundle", request.getLocale()); %>
<%=resBundle.getString("SIGN_IN") %><br>
<img src="<%= resBundle.getString("FLAG")%>" width="22" height="14">

<%=resBundle.getString("USERNAME") %><br>
<%=resBundle.getString("PASSWORD") %><br>


</body>
</html>
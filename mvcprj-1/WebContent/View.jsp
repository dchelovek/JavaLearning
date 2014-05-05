<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="person" scope="request" class="com.za.tutorial.mvc.PersonBeanModel"></jsp:useBean>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MVC Tutorial 01</title>
</head>
<body>
Name: <jsp:getProperty property="name" name="person"/>
<br>
Mail: <jsp:getProperty property="email" name="person"/>
</body>
</html>
<%@page import="action.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>
Welcome
<%
	User u = new User();
	HttpSession hs = request.getSession(false);
	u = (User)hs.getAttribute("object");
	out.println("Username : "+u.getUsername()+" Password : "+u.getPassword());
%>
</h2>
</body>
</html>
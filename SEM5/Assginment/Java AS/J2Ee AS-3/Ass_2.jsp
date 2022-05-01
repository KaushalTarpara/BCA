<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page errorPage="Error.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Scripting Elements</title>
</head>
<body>
<form action="">
Enter Name : <input type="text" name="tname"><br>
<input type="submit" name="sub">
</form>
<%! String name; %>
<%-- JSP Scripting Elements --%>
<%
	name = request.getParameter("tname");
%>
<h2><%= name %></h2>
</body>
</html>
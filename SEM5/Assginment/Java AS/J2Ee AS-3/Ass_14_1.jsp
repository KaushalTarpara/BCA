<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Table</title>
</head>
<body>
<%
	response.setContentType("text/html");
	Class.forName(application.getInitParameter("ClassLoad"));
	Connection cnn = DriverManager.getConnection(application.getInitParameter("URL"),application.getInitParameter("Username"),application.getInitParameter("Password"));
	
	String QRY = "CREATE TABLE student(no number(3), name varchar2(30), city varchar2(40))";
	Statement st = cnn.createStatement();
	st.execute(QRY);
	out.print("Table Created Successfully");
%>
<form action="Ass_14_2.jsp">
	<input type="submit" value="Insert">
</form>
</body>
</html>
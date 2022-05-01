<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Records</title>
</head>
<body>
<%
response.setContentType("text/html");
Class.forName(application.getInitParameter("ClassLoad"));
Connection cnn = DriverManager.getConnection(application.getInitParameter("URL"),application.getInitParameter("Username"),application.getInitParameter("Password"));

String no = request.getParameter("no");

	Statement st = cnn.createStatement();	

	String QRY = "DELETE student where no="+no;
	st.executeUpdate(QRY);
	
	RequestDispatcher rd=request.getRequestDispatcher("Ass_14_2.jsp");
	rd.forward(request, response);
%>
</body>
</html>
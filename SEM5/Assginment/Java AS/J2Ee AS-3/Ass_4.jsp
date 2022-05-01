<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dynamic Login</title>
</head>
<body>
<form action="Ass_4.jsp">
	Enter UserName : <input type="text" name="txtuser"><br>
	Enter Password : <input type="password" name="txtpass"><br>
	<input type="submit" value="Login">
</form>
<%
	String user = request.getParameter("txtuser");
 	if(user!=null)
 	{
		String pass = request.getParameter("txtpass");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection cnn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "hjd");
		String QRY = "select * from tbluser where username='"+user+"' AND password='"+pass+"'";
	
		ResultSet rs = cnn.createStatement().executeQuery(QRY);
		if(rs.next())
		{
			out.println("Welcome : "+user);
		}
		else out.println("Invalid Username or Password");
 	}
%>
</body>
</html>
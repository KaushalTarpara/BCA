<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Records</title>
</head>
<body>
<form action="Ass_14_2.jsp">
Enter Student Number : <input type="text" name="txtno"><br>
Enter Student Name : <input type="text" name="txtname"><br>
Enter Student City : <input type="text" name="txtcity"><br>
<input type="submit" value="Add" name="btnAdd">
</form>
<%
	response.setContentType("text/html");
	Class.forName(application.getInitParameter("ClassLoad"));
	Connection cnn = DriverManager.getConnection(application.getInitParameter("URL"),application.getInitParameter("Username"),application.getInitParameter("Password"));
	
	if(request.getParameter("btnAdd")!=null)
	{
		String no = request.getParameter("txtno"),
		name = request.getParameter("txtname"),
		city = request.getParameter("txtcity");
		
		Statement st = cnn.createStatement();	
		
		String QRY = "INSERT INTO student VALUES("+no+",'"+name+"','"+city+"')";
		st.executeUpdate(QRY);
		
		QRY = "SELECT * FROM student";
		
		ResultSet rs = cnn.createStatement().executeQuery(QRY);

		out.println("<table border=3 align=center>");
		out.println("<th>Number</th><th>Name</th><th>City</th><th>Edit</th><th>Delete</th>");
		while(rs.next())
		{
			out.println("<tr>");
			out.println("<td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td>");
			out.println("<td><a href=Ass_14_3.jsp?no="+rs.getInt(1)+"&name="+rs.getString(2)+"&city="+rs.getString(3)+">Edit</a></td>");
 			out.println("<td><a href=Ass_14_4.jsp?no="+rs.getInt(1)+">Delete</a></td>");
			out.println("</tr>");
		}
		out.println("</table>");
	}
	else
	{
		String QRY = "SELECT * FROM student";
		
		ResultSet rs = cnn.createStatement().executeQuery(QRY);

		out.println("<table border=3 align=center>");
		out.println("<th>Number</th><th>Name</th><th>City</th><th>Edit</th><th>Delete</th>");
		while(rs.next())
		{
			out.println("<tr>");
			out.println("<td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td>");
			out.println("<td><a href=Ass_14_3.jsp?no="+rs.getInt(1)+"&name="+rs.getString(2)+"&city="+rs.getString(3)+">Edit</a></td>");
 			out.println("<td><a href=Ass_14_4.jsp?no="+rs.getInt(1)+">Delete</a></td>");
			out.println("</tr>");
		}
		out.println("</table>");
	}
%>
</body>
</html>
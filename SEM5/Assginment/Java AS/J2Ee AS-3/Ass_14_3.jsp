<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Records</title>
</head>
<body>
<form action="Ass_14_3.jsp">
<%
	String pno = request.getParameter("no");
	String pname = request.getParameter("name");
	String pcity = request.getParameter("city");
%>
Enter Student Number : <input type="text" name="txtno" value=<%= pno %>><br>
Enter Student Name : <input type="text" name="txtname" value=<%= pname %>><br>
Enter Student City : <input type="text" name="txtcity" value=<%= pcity %>><br>
<input type="submit" value="Update" name="btnsub">
<%
	response.setContentType("text/html");
	Class.forName(application.getInitParameter("ClassLoad"));
	Connection cnn = DriverManager.getConnection(application.getInitParameter("URL"),application.getInitParameter("Username"),application.getInitParameter("Password"));

	if(request.getParameter("btnsub")!=null)
	{
		String no = request.getParameter("txtno"),
		name = request.getParameter("txtname"),
		city = request.getParameter("txtcity");
	
		Statement st = cnn.createStatement();	
	
		String QRY = "UPDATE student SET name='"+name+"', city='"+city+"' WHERE no="+no;
		st.executeUpdate(QRY);
		
		RequestDispatcher rd=request.getRequestDispatcher("Ass_14_2.jsp");
		rd.forward(request, response);
	}
%>
</form>
</body>
</html>
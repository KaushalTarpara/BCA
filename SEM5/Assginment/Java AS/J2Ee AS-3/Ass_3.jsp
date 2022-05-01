<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Static Login</title>
</head>
<body>
<form action="Ass_3.jsp">
	Enter UserName : <input type="text" name="txtuser"><br>
	Enter Password : <input type="password" name="txtpass"><br>
	<input type="submit" value="Login">
</form>
<%
	String user = request.getParameter("txtuser");
	if(user!=null)
	{
		String pass = request.getParameter("txtpass");
	
		if(user.equals("dd") && pass.equals("dd"))
		{
			out.println("Welcome : "+user);
		}
		else
			out.println("Incorrect Username or Password");
	}
%>
</body>
</html>
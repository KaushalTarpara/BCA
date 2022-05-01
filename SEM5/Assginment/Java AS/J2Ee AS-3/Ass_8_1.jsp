<%@page import="org.apache.tomcat.util.http.Cookies"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="">
	Enter User Name : <input type="text" name="txtuser"><br>
	Enter Password : <input type="text" name="txtpass"><br>
	<input type="submit" value="Login">
</form>
<%
	String user = request.getParameter("txtuser");
	if(user!=null)
	{
		String pass = request.getParameter("txtpass");
		
		if(user.equals("dd") && pass.equals("dd"))
		{
			Cookie ck = new Cookie("UName",user);
			response.addCookie(ck);
			HttpSession HS = request.getSession();
			HS.setAttribute("Pass", pass);
			out.println("<a href=Ass_8_2.jsp>Print</a>");
		}
	}
%>
</body>
</html>
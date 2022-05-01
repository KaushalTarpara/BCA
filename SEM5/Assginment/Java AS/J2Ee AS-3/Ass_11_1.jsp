<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="/Error.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Implicit Objects</title>
</head>
<body>
<form action="Ass_11">
Enter Name : <input type="text" name="txtname"><br>
<input type="submit" name="sub">
</form>
<%
	response.setContentType("text/html");
	if(request.getParameter("sub")!=null)
	{
		String name= request.getParameter("txtname");
		session.setAttribute("uname", name);
		out.println("<br>Welcome : "+name);
		application.getInitParameter("fname");
		config.getInitParameter("lname");
		pageContext.removeAttribute("pg",pageContext.APPLICATION_SCOPE);
		out.println("<br><a href=Ass_11_2.jsp>Visit</a><br>");
		//out.println(5/0);
		out.println(page.toString());
}
%>
</body>
</html>
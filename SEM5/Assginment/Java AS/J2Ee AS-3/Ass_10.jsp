<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="/Error.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculations</title>
</head>
<body>
<form action="Ass_10.jsp">
	Enter First Number : <input type="text" name="txtn1"><br>
	<input type="submit" value="Calculate" name="calc">
</form>
<%
	if(request.getParameter("calc")!=null)
	{
		int n1 = Integer.parseInt(request.getParameter("txtn1"));
		int n2 = 0;
		out.println(n1/n2);
	}
%>
</body>
</html>
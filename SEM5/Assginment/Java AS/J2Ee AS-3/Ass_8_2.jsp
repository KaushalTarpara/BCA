<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Log Out</title>
</head>
<body>
<%
	Cookie CK[] = request.getCookies();
	HttpSession HS = request.getSession(false);
	
	if(request.getParameter("txtsub")==null)
	{
		out.println("UserName : "+CK[1].getValue());
		out.println("Password : "+(String)HS.getAttribute("Pass"));
	}
	
%>
	<form action="">
		<input type="submit" name="txtsub" value="Destroy">
	</form>
<%
	if(request.getParameter("txtsub")!=null)
	{
		CK[1].setMaxAge(0);
		response.addCookie(CK[1]);
		HS.invalidate();
	}
%>
</body>
</html>
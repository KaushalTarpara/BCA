package p;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;



public class S1 extends GenericServlet 
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = res.getWriter();
		pw.println("<h3><center>Init Parameter Demo</center></h3>");
		pw.println("<hr>");
		
		String s = getServletContext().getInitParameter("Cont1");
		pw.println("<p style='color:red'>Context Parameter :"+s+"</p>");
		
		pw.println("<hr>");
		String s1 = getServletConfig().getInitParameter("Conf1");
		pw.println("<p style='color:blue'>Config Parameter :"+s1+"</p>");
		pw.println("<hr>");
	}	
}

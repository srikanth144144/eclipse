package com.Demoserv;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class Srv implements Servlet {
	@Override
	public void destroy() {	
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {	
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Im in Service");//server console
		PrintWriter out =res.getWriter();
		Date d = new Date();
		out.print("Hello Im from Server...my Frist Srv : Date "+d);//on browser
		
	}
}





package com.Demoserv;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.xml.crypto.Data;

public class Mysrv implements Servlet {
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
		System.out.println(" I am in init");	
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println(" i am in service");
		PrintWriter out = res.getWriter();
		String uname = req.getParameter("name");
		String pass = req.getParameter("pwd");
		if(uname.equals("Sree") && uname != null && pass.equals("Sree123") && pass != null) {
			out.print("Sucess");
		}else {
			out.print("try again");
		}		
	}
}

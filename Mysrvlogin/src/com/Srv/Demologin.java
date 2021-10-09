package com.Srv;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Demologin  implements Servlet{

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
	public void init(ServletConfig config) throws ServletException {	
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
		String pwd = req.getParameter("Admin123");
		PrintWriter out =res.getWriter();
		if(pwd!=null&&pwd.equals("Admin123")) {
			out.print("login scucces");
		}else {
			out.print("invalide name and pwd");
		}	
	}
}

package com.Demoserv;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class Impcls  extends GenericServlet  {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		System.out.println("Im in Service1");//server console
//		PrintWriter out =res.getWriter();
//		Date d = new Date();
//		out.print("Hello Im from GenericServlet...my Frist Srv : Date "+d);//on browser	
		String name ="Connected";
		String name1="Not Connected";
		PrintWriter out =res.getWriter();
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());		
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SRIKANTH","shobha144144#");
			if(con==null) {
				out.print(name);
			}else {
				out.print(name1);
			}
		}catch (Exception e) {
			out.print("Error Occured....");
		}
	}
	
	
}

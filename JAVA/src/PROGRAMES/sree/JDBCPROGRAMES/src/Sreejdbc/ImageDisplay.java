package Sreejdbc;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class ImageDisplay {
	public static void main(String[] args) { 
		try{  
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());		
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SRIKANTH","shobha144144#");		
			Statement stmt= con.createStatement();
		      
		PreparedStatement ps=con.prepareStatement("select * from Image");  
		ResultSet rs=ps.executeQuery();  
		if(rs.next()){//now on 1st row  
		              
		Blob b=rs.getBlob(2);//2 means 2nd column data  
		byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
		              
		FileOutputStream fout=new FileOutputStream("E:\\sriram.jpg");  
		fout.write(barr);  
		              
		fout.close();  
		}//end of if  
		System.out.println("ok");  
		              
		con.close();  
		}catch (Exception e) {e.printStackTrace();  }  
		}  
		}  

	



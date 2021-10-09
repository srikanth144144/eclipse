package Sreejdbc;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
public class ImageInsert {
	public static void main(String[] args) throws SQLException {
		
//		String sql ="create table Image(sree varchar(10),image BLOB)" ;
//		int rs = stmt.executeUpdate(sql);
//		System.out.println("image created"+rs);
//		con.close();

		try{  
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());		
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SRIKANTH","shobha144144#");		
			Statement stmt= con.createStatement();
			
		PreparedStatement ps=con.prepareStatement("insert into Image values(?,?)");  
		ps.setString(1,"sriram");  
		  
		FileInputStream fin=new FileInputStream("D:\\2.hanuman.jpg");  
		ps.setBinaryStream(2,fin,fin.available());  
		int i=ps.executeUpdate();  
		System.out.println(i+" records affected");  
		          
		con.close();  
		}catch (Exception e) {e.printStackTrace();}  
		}  
		}  


package Com.collections;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class Sqldataret {
	public static void main(String[] args) throws Exception {
	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());		
    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SRIKANTH","shobha144144#");
	  System.out.println("Connection established......");
	Statement stmt= con.createStatement();
	 ResultSet rs = stmt.executeQuery("select * from slist");
	 ArrayList<Mystlist> al = new ArrayList<>();
		 		 
	 while(rs.next()) {
		 Mystlist st = new Mystlist();
	         st.setSno(rs.getInt(1));
	         st.setName(rs.getString(2));
	         st.setAge(rs.getInt(3));
	         al.add(st);
	      }
	      for (Mystlist obj :  al) {
	         System.out.print("ID: "+obj.sno+" ,");
	         System.out.print("Name: "+obj.name+" ,");
	         System.out.print("Age: "+obj.age+","); 
	         System.out.println();
	      }      
	}
}
class Mystlist{
	int sno;
	String name;
	int age;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	} 		
}

package Com.collections;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
public class Vec {
	public static void main(String[] args) throws Exception {
		Scanner sc= new Scanner(System.in);
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());		
	     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SRIKANTH","shobha144144#");		
			Statement stmt= con.createStatement();				
			String sql ="select * from REGBATCH";
			ResultSet rs = stmt.executeQuery(sql);
			
		ArrayList<Data> o = new ArrayList<> ();		
		System.out.print("Enter Id: ");
		int id = sc.nextInt();
		int sree = 0;
		while(rs.next()) {
			Data d = new Data(0);
			o.add(d);
			int n = o.size();
			for(int i=0; i<n; i++) {
				if(id==rs.getInt(1)) {
					sree++;
					System.out.println(rs.getString(1)+"\t"+rs.getString(2)+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
					break;
				}
			}
			}
		if(sree==0) {
			System.out.println("No data");
		}
		con.close();
	}
}
class Data{
    int num;
    Data(int num){  	
    }
}

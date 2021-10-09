package Com.collections;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
public class Propertiesoffile {
	public static void main(String[] args) throws IOException {
		  FileReader fi = new FileReader("D:\\Application.txt");
		  	Properties pro =new Properties();
		  	pro.load(fi);
		  	
		  	String st = pro.getProperty("db_Password");
		  	System.out.println(st);
	}
}

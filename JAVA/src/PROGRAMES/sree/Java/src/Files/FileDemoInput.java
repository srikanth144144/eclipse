package Files;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class FileDemoInput {

	public static void main(String[] args) throws IOException {
				
		FileInputStream fin = new FileInputStream ("E:\\sree.txt");
		
		BufferedInputStream bin = new BufferedInputStream(fin);
		
		int  ch;
		
		while((ch=bin.read())!=-1){	
		System.out.print((char)ch);
		}
		bin.close();
		System.out.println("end of the program");
	}
}

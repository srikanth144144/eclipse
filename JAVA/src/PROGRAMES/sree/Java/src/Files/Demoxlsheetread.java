package Files;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Demoxlsheetread {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fin = new FileInputStream ("E:\\sree45.xls");
		
		BufferedInputStream bin = new BufferedInputStream(fin);
	
		int  ch;
		
		while((ch=bin.read())!=-1){	
			System.out.print((char)ch);
		}
		bin.close();
		System.out.println("end of the program");
	}

}

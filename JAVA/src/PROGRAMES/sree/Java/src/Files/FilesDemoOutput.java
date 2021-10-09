package Files;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FilesDemoOutput {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		FileOutputStream fout = new FileOutputStream ("E:\\sree.txt");
		
		BufferedOutputStream bout = new BufferedOutputStream(fout,1024);
		
		System.out.println("enter the data.....");
		char ch;
		
		while((ch=(char)br.read())!='#'){	
		bout.write(ch);
		}
		bout.close();
		System.out.println("end of the program");
	}

}

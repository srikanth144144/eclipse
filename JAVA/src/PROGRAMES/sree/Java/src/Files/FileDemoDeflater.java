package Files;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.DeflaterOutputStream;

public class FileDemoDeflater {
public static void main(String[] args) throws IOException {
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		FileOutputStream fout = new FileOutputStream ("E:\\zipit.txt");
		
		BufferedOutputStream bout = new BufferedOutputStream(fout,1024);
		
		DeflaterOutputStream dout = new DeflaterOutputStream(bout);
		
		System.out.println("enter the data.....");
		char ch;
		
		while((ch=(char)br.read())!='$'){	
		dout.write(ch);
		}
		dout.close();
		System.out.println("end of the program");
	}

}

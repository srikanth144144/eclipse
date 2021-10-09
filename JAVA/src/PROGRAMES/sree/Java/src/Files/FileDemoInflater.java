package Files;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.DeflaterInputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;
public class FileDemoInflater {
	public static void main(String[] args) throws IOException {
		
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
	FileInputStream fin = new FileInputStream ("E:\\zipit.txt");
	InflaterInputStream inf = new InflaterInputStream(fin);	
	FileOutputStream fout = new FileOutputStream("E:\\unzipit.txt");   	
		int ch;
		
		while((ch=inf.read())!=-1){	
		fout.write((char)ch);
		}
		fin.close();
		System.out.println("end of the program");
	}
}

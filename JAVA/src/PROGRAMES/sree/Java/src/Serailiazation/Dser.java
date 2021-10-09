package Serailiazation;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class Dser {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		System.out.println("========== De serialization==========");	
		FileInputStream fin = new FileInputStream("sree.ser");
	   BufferedInputStream bin = new  BufferedInputStream(fin,1024);
		ObjectInputStream oin = new  ObjectInputStream(bin);
		sri obj_serialization = (sri)oin.readObject();
		 obj_serialization.display();
		oin.close();
	}
}

package Serailiazation;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class Ser {
		BufferedOutputStream bout =null;
		ObjectOutputStream oou =null;
		ObjectInputStream oiu =null;
	public static void main(String[] args) throws IOException {
		//try {
			System.out.println("==========serialization==========");
			sri obj = new sri("sreekanth","1234");
			FileOutputStream fout =      new FileOutputStream("sree.ser");
			BufferedOutputStream bout =  new BufferedOutputStream(fout,1024);
			ObjectOutputStream oou =     new ObjectOutputStream(bout);
			oou.writeObject(obj);
			oou.close();
			
			
			
//			System.out.println("========== De serialization==========");
//			
//			FileInputStream fin = new FileInputStream("sri.ser");
//			BufferedInputStream bin = new  BufferedInputStream(fin,1024);
//			ObjectInputStream oin = new  ObjectInputStream(bin);
//			sri obj_serialization = (sri)oin.readObject();
//			 obj_serialization.display();
//			oin.close();
//		}catch (ClassNotFoundException|IOException e) {
//			System.out.println("Exception detailes"+e);
		//}
			
			
	}
}
class sri implements Serializable{
	private String name;
	 transient String pin;
	sri(String name,String pin ){
		this.name=name;
		this.pin=pin;

	}
	void display() {
		System.out.println(name);
		System.out.println(pin);
	}
}

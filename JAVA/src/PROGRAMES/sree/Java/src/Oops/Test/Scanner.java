package Oops.Test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Persion{
	String name;
	int Age;
	public void accept() throws   IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name");
		name = br.readLine();
		System.out.println("Enter Age");
			Age = Integer.parseInt( br.readLine());		
	}
	public void Check() {
		if (Age <=30) {
			System.out.println(name+"is young");
		}else if(Age<=50) {
			System.out.println(name+"is middle aged");
		}else {
			System.out.println(name+"is old");
		}
	}
}
public class Scanner {
	public static void main(String[] args) throws IOException {
		Persion p =new Persion();
		p.accept();
		p.Check();
	}
}

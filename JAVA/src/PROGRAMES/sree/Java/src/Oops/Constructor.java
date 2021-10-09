package Oops;
import java.util.Scanner;	
public class Constructor {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter String ");
		String s = sc.nextLine();
		System.out.println("enter id");
		int n = sc.nextInt();
	EmpDemo srikanth = new EmpDemo();	
	EmpDemo hari = new EmpDemo(n);	
	EmpDemo madhu = new EmpDemo( s);	
	srikanth.display();
	hari.display();
	madhu.display();
	}
}
class EmpDemo{
	private int id;
	private String name;
	
	public  EmpDemo(int Empid) {
		 id =Empid;
	}
	public  EmpDemo(String s ) {
		 name = s;		
	}
	public  EmpDemo() {
	}
	public void display() {
		System.out.println(id);
		System.out.println(name);
	}
}

package Oops;
import java.util.Scanner;

public class Addtwonum {

	public static void main(String[] args) {
		
	Scanner sy = new Scanner(System.in);
	System.out.println("enter two numbers");
	
	int a = sy.nextInt();
	int b = sy.nextInt();
	Add c = new Add(a,b);
	c.display();

	}

}

class Add{
       private int x;
       private int y;
       public Add(int e ,int f) {
    	   x=e;
    	   y=f;
       }
	public void display() {
		System.out.println("Addition of two numbers: "+(x+y));
	}
}
package Oops;
import java.util.Scanner;
public class Addtwonum {
	public static void main(String[] args) {
	Scanner sy = new Scanner(System.in);
	
	//addition
	System.out.println("enter two numbers for addition");
	int a = sy.nextInt();
	int b = sy.nextInt();
	Add c = new Add(a,b);
	c.display();
	
	//mltiplication
	System.out.println("enter two numbers for multiplication");
	int d = sy.nextInt();
	int e = sy.nextInt();
	Add g = new Add(d,e);
	g.display1();
	
	// division
	System.out.println("enter two numbers for division");
	float a1 = sy.nextFloat();
	float a2 = sy.nextFloat();
	Add g1 = new Add(a1,a2);
	g1.display2();
	
	
	//sum of n natural numbers
	System.out.println("enter value");
	int b1 = sy.nextInt();
	Add g2= new Add(b1);
      g2.display3();
      
      //sum of n natural numbers from starting choice
      System.out.println("enter starting value");
  	int c1 = sy.nextInt();
  	System.out.println("enter second value");
  	int c2 = sy.nextInt();
  	Add c3 = new Add(c1,c2);
  	c3.display4(); 	
	}
}
class Add{
       private int x;
       private int y;
       private float x1;
       private float x2;
       public Add(int e ,int f) {
    	   x=e;
    	   y=f;
       }
       public Add(float e1,float f1) {
    	   x1=e1;
    	   x2=f1;
       }
       public Add( int e2) {
    	   x=e2;
       }
	public void display() {
		System.out.println("Addition of two numbers: "+(x+y));
	}
	public void display1() {
		System.out.println("mul: " + (x*y));
	}
	public void display2() {
		System.out.println("division "+ (x1/x2));
	}
	public void display3() {
		int n =x*(x+1)/2;
		System.out.println(n);
	}
	public void display4() {
		int count =0;
		for(int i=x; i<=y;i++) {
			count = count+i;
		}
		System.out.println(count);
	}	
}
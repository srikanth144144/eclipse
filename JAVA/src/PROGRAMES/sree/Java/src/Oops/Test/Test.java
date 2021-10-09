package Oops.Test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the first value");
		int a1=sc.nextInt();
		System.out.println("enter the second value");
		int a2=sc.nextInt();
		Ab1 c =new Ab1(a1,a2);
		c.display();
	}
}
class Ab1{
	int x;
	int y;	
	public Ab1(int a, int b) {
		x=a;
		y=b;		
	}
	public void display() {
		System.out.println(x+y);
	}
}


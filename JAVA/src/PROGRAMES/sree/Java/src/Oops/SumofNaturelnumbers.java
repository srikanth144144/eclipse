package Oops;
import java.util.Scanner;
public class SumofNaturelnumbers {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the first value");
		int a1=sc.nextInt();
		System.out.println("enter the second value");
		int a2=sc.nextInt();
		Ab12 c =new Ab12(a1,a2);
		c.display();
	}
}
class Ab12{
	private int x;
	private int y;
	public Ab12(int a,int b) {
		x=a;
		y=b;		
	}
	public void display() {
		int count = 0;
		for(int i=x;i<=y;i++) {
			count = count+i;
		}
		System.out.println(count);
	}
}

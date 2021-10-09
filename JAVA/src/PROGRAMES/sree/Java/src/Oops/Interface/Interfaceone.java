package Oops.Interface;

interface maths1{
	void add(int a,int b,int c);
	void mult(int a,int b);
}
interface maths2 extends maths1{
	void div(int a,int b);
	void mod(int a,int b);
}
class answer implements maths2{
	
	 public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	 public void mult(int a,int b) {
	System.out.println(a*b);
	}
	 public void div(int a,int b) {
		System.out.println(a/b);
	}
	 public void mod(int a,int b) {
		System.out.println(a%b);
	}		
}
public class Interfaceone {
	public static void main(String[] args) {
		answer a= new answer();
		a.add(12, 13, 14);
		a.mult(5, 6);
		a.div(15, 3);
		a.mod(47, 3);
	}
}

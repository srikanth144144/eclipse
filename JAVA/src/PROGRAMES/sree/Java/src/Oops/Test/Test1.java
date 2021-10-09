package Oops.Test;
public class Test1 {
	int a;
	String name;
	Test1(int a, String name){
		this.a=a;//this key word is used convertion of local varabiles to instance variables
		this.name=name;
	}		
	void m1() {
		System.out.println(a);
		System.out.println(name);
	}
	public static void main(String[] args) {
	Test1 t = new Test1(10,"sree");
	t.m1();
	}
}

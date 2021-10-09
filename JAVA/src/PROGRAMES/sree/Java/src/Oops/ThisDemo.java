package Oops;
public class ThisDemo {
	public static void main(String[] args) {
			Demo1 d= new Demo1();
			d.show();
	}
}
class Demo1{
	private int n;
	private  String name;
	public Demo1(String name) {
		this(1456);
		this.name=name;	
	}
	public Demo1 (int n) {
		this.n=n;
	}	
	public Demo1() {
		this("srikanth");	
	}
	void show() {
		System.out.println(name);
		display();
	}
	void display() {
	System.out.println(n);
	}
}

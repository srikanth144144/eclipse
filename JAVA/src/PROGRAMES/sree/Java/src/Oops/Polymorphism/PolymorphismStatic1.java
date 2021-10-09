package Oops.Polymorphism;
public class PolymorphismStatic1 {
	public static void main(String[] args) {
	poly.show1(12, 6);
	poly12.show1(25, 5);
	}
}
class poly{
	static void show1(int a,int b) {
		System.out.println(a*b);
		System.out.println(a+b);
	}
}
class poly12 extends poly{	
	static void show1(int a, int b) {
		System.out.println(a/b);
		System.out.println(a%b);
	}
}
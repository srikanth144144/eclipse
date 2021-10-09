package Oops.Polymorphism;
public class PolymorphismOverloading1 {
	public static void main(String[] args) {
		ad p=  new ad ();
		 p.over(12, 123);
		 p.over(10, 5, 15);
	}
}
	class ad{
	void over(int a , int b) {
		System.out.println(a+b);
	}
	void over(int x , int y,int z) {
		System.out.println(x+y+z);
	}
	
}

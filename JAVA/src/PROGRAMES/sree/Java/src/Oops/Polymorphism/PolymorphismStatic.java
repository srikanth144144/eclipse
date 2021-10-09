package Oops.Polymorphism;

public class PolymorphismStatic {
    public static void main(String args[]) {
    	Poly2 p=new Poly2();
    	p.display(2,2.2f,"static");
    	p.sree(5, 5);
    	poly1.sree(10, 45);
    }
}
class poly1{
	void display(int a,float b,String name) {
     System.out.println(a+b);
     System.out.println(name);	
	}
	static void sree(int x,int y) {
	System.out.println(x*y);
	System.out.println(x);
	}
}
class Poly2 extends poly1{
	@Override
	void display(int a,float b,String name) {
		super.display(12, 15f, "poly1");
     System.out.println(a);
     System.out.println(name);	
		}
	static void sree(int x,int y) {
	//poly1.sree(2,5);
		System.out.println(x*y);
	}
}

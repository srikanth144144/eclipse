package Oops.Polymorphism;
public class PolymorphismOverLoading {
	public static void main(String[] args) {
		Demopoly1 d = new Demopoly1();
		d.dis(20, "override", 10);
		d.dis(10, 12);		
	}
}
class DemoPoly{
	void dis(int a,String name,int b) {
		System.out.println(name);
		System.out.println(a+b);
	}
		void dis(int c, int d) {
			System.out.println(c+d);	
		}	
}
class Demopoly1 extends DemoPoly{
	@Override
	void dis(int a,String name,int b) {
		System.out.println(name);
		System.out.println(a+b);
		System.out.println(a);
	}	
}
	


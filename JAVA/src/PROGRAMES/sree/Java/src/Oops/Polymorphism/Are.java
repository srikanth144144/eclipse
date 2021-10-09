package Oops.Polymorphism;

public class Are {

	public static void main(String[] args) {
		Are1 a= new Are1();
		a.Cal(2);
		a.Cal(05, 06);
		a.Cal(5, 0, 0);

	}

}
class Are1{
	void Cal(int a) {
		System.out.println("Are of square"+a*a);
	}
		void Cal(int a,int b) {
			System.out.println("Are of rectangaler"+a*b);
		}
		void Cal(int a,int b,int c) {
			System.out.println("Are of circle"+(22/7)*a*a);
		}
	}

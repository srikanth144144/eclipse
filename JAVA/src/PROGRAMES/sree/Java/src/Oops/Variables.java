package Oops;
public class Variables {
	public static void main(String[] args) {
//			Var v = new Var();
//			v.display();
		
			Var s = new Var();
			s.display();
			System.out.println(s.a);
			System.out.println(Var.b);
			System.out.println(s.c);
	}
}
class Var{
	int a=10;
	static int b=15;
	int c=30;
	  void display() {
		int c =20;
		System.out.println(a+b);
		System.out.println(b+c);
		System.out.println(this.c );
	}
}

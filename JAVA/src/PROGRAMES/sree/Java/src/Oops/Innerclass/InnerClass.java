package Oops.Innerclass;
public class InnerClass {
	public static void main(String[] args) {
	A a = new A();
	a.showdata();
	}
}
class A{
	private String name = "srikanth";
	private int id = 12345;
	void showdata() {
		B b = new B();
		b.show();
	}
	 private class B{
		 void show() {
			 System.out.println(name);
			 System.out.println(id);
		 }		
	}	
}
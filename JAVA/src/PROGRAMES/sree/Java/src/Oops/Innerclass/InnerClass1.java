package Oops.Innerclass;
public class InnerClass1 {
	public static void main(String[] args) {
		A23 a = new A23();
		a.showdata("12365");
	}
}
class A23{
	private String name = "srikanth";
	private int id = 12345;
	void showdata(String pwd ) {
		if (pwd.equals("123654")) {
			System.out.println("login succes");				
		}else {
			System.out.println("hey you not access the inner class");
		}
		B b = new B();
		b.show();
	}
	 private class B{
		 String lastname = "bodas"; 
		 void show() {
			 System.out.println(name);
			 System.out.println(lastname);
			 System.out.println(id);
		 }		
	}	
}
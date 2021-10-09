package TypeCasting;
public class Test {
	public static void main(String[] args) {
//	    int a = 10;
//	    short s=(short)a;
//	    System.out.println(a);
//	    System.out.println(s);
//	
//	    short s1 = 22;
//	    int b = s1;
//	    System.out.println(b);
//	    
	    
		super1 s = new sub1();
		s.m();	
		
		
	}
}
class super1{
	String name = "srikanth";
	void m() {
		System.out.println(name);
	}
}
class sub1 extends super1{
	String name = "sreekanth";
	void m1() {
		System.out.println(name);
	}
}
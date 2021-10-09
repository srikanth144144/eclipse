package Exceptions;
public class ExceptionsTest {
	public static void main(String[] args) {
		One  o =new One();
		try {
			o.m2();
		} catch (Two e) {
			System.out.println(e.getMessage());
		}
	}
}
class One {
	String name="srikanth";
	void m2()  throws Two{
		Two w= new Two();
		throw w;
	}
	void ms()throws Three {
		try {
			Two w= new Two();	
			w.m();
		}catch (Three r) {
			System.out.println(r.getMessage());
		}	
	}
}
class Two extends Exception{
	void m()  throws Three{
		Three t= new Three("three");
		throw t;		
	}	
}
class Three extends Exception{
	 Three(String msg){
		 super(msg);
	 }
}
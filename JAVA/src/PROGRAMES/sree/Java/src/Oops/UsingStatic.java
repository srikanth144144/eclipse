package Oops;
public class UsingStatic {
	static {
		System.out.println("two");
	}
	public static void main(String[] args) {
	Sy s= new Sy();
	Sy y= new Sy();
	++s.id;
	++s.maxvalue;
	s.dis();
	y.dis();
	Sy.display();
	}
}
class Sy{
	int id =5;
	static int maxvalue =10;	
	Sy(){
		id = 12;
	}
	static {
		maxvalue = 22;
	}
	static {
		System.out.println("one");
		maxvalue =65;
	}
void dis() {
	System.out.println(id);
	System.out.println(maxvalue);	
}
   static void display() {
	   System.out.println(maxvalue);
	  // System.out.println(id);
   }
}





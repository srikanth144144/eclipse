package TypeCasting;
public class Widdining {
	public static void main(String[] args) {
		
Super obj = new Sub();
//	obj.dis();
	
	Super obj1 = new Sub();
	Sub obj2 = (Sub)obj1;
	obj2.dis();
	obj2.dis1();
		
		
	}
}
//		//widdinig casting 
//	  byte b =10;
//	  int a = b;
//	  //narrowing casting
//	  int  d = 22;
//	  short s = (short)d;
//	  System.out.println(a+s);
//	}
//
//}  
// class Fg{
//	 int x =10;
//	 byte b = (byte)x;
//	 
//	 int y =86;
//	 long l = y;
//	 
 //}
 class Super{
	 void dis() {
		 System.out.println("im super");
	 }
 }
 class Sub extends Super{
	 void dis1() {
		 System.out.println("im in sub");
	 }
 }
 
 

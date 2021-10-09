package Oops.Abstract;
abstract class car1{
	int rego;
	int wheels_mech;
	public car1(int rego, int wheels_mech) {
		this.rego = rego;
		this.wheels_mech =wheels_mech;		
	}
	void m1() {
		System.out.println("fueal tank");
	}
	abstract void m2();
    abstract void m3();  
    abstract void m4(); 
}
  class benz extends car1{
	 benz(int a,int b){
	 super(a,b);	 
	 }
	 void m() {
	 System.out.println(rego);
		System.out.println(wheels_mech);
	 }
	@Override
	 void m2() {
		System.out.println("bracking system is ABS");
	 }
	 void m3() {
		 System.out.println("streering type is power"); 
	 }	
	 void m4() {
		 System.out.println("lights LED"); 
	 }		 
	}
class I10 extends benz{
	 I10(){
		 super(3256,2);
	 }
	 void m() {
		 System.out.println(rego);
			System.out.println(wheels_mech);
		 }	
	 void m2() {
		 System.out.println("bracking system is normal"); 
	 }
	 void m3() {
		 System.out.println("streering type is manual");
	 }	
} 
public class Abstractone {
	public static void main(String[] args) {	
		 benz i = new benz( 8802,2);
		     i.m();
		    i.m1();
			i.m2();
		    i.m3();	    
		    i.m4();
		    
		I10 d = new I10();
		d.m();
		d.m1();
	    d.m2();
	    d.m3();    
	}
}





package Oops.Abstract;
public class Abstract {
	public static void main(String[] args) {
		bmw b = new bmw(8805,4);
	    b.m();
		b.m1();
		b.m2();
		b.m3();
		
		I20 i = new I20();
		i.m();
	    i.m1();
		i.m2();
	    i.m3();
	}
}
 abstract class car{
	int rego;
	int wheels_mech;
	public car(int rego, int wheels_mech) {
		this.rego = rego;
		this.wheels_mech =wheels_mech;		
	}
	void m1() {
		System.out.println("fueal tank");
	}
	abstract void m2();
    abstract void m3();
}
 class bmw extends car{
	 bmw(int a,int b){
	 super(a,b);	 
	 }
	 void m() {
	 System.out.println(rego);
		System.out.println(wheels_mech);
	 }
	@Override
	 void m2() {
		System.out.println("bracking system is ABS"); //cl logic
	 }
	 void m3() {
		 System.out.println("streering type is power"); //cl logic
	 }
 }
 class I20 extends car{
	 I20(){
		 super(3256,2);
	 }
	 void m() {
		 System.out.println(rego);
			System.out.println(wheels_mech);
		 }
	@Override
	 void m2() {
		 System.out.println("bracking system is normal"); 
	 }
	 void m3() {
		 System.out.println("streering type is manual");
	 }
 } 
	 
 
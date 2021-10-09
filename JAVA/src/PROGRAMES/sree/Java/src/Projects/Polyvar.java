package Projects;
public class Polyvar {

	public static void main(String[] args) {
	A1 obj = new A1();
    obj.m2();
   // System.out.println(obj.name);
   // obj.m1();
	}
}
class  A1 extends A2{
	private int num = 25;
	A1(){
		super("gani",12345);
		System.out.println(num);
	}
void m1(){
	System.out.println(num);
}
}
class A2{
	private String name = "BAtch";
	private int id = 143;
	A2(String x,int y){
		this.name=x;
		this.id=y;
	
		System.out.println(name);
		System.out.println(id);
	}
	public void m2() {
	}
}
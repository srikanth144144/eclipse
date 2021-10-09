package Oops.Hasrelationship;
public class HasRelationship {
	public static void main(String[] args) {
	 A3 a =new A3();
	 A2 b= new A2();
	 A1 c = new A1(a,b);
	 c.show();
	}
}
class A1{
	String name = "sree";
	int  x = 50;
	A2 z;
	A3 i;
	A1(A3 i,A2 z){
		this.z= z;
		this.i=i;
	}	
	void show() {
		System.out.println(this.name+"\t"+this.x+"\t"+z.y+"\t"+i.lastname);
	}
}
class A2{
	int y = 22;	
}
class A3{
String lastname="Bodas";
}
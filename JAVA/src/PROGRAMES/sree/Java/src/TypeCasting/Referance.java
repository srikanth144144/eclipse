package TypeCasting;
public class Referance {
	public static void main(String[] args) {
	reg g =new bng ("sree",54);
	g.display();
		//g.display1();
		
//		reg r = new reg("sri",789);
//		r.display();
//		bng b = (bng)r;
//		b.display();
//		b.display1();	
//		bng j = new bng ("srk",4562);
//		j.display();
//		j.display1();
		
//		reg e = new bng ("dfd",6565);
//        e.display();
//		e.display1();
	
//		reg r = new bng ("jhkj",544);
//		bng n =(bng)r;
//		n.display();
//		n.display1();
//		
		
	}
}

class reg{
	String name;
	int num;
	public reg(String name, int num) {	
		this.name = name;
		this.num = num;
	}
	void display() {
		System.out.println(name);
		System.out.println(num);		
	}	
}
class bng extends reg {	
	bng (String name, int num){
	super(name,num);
	}
void display1() {
	System.out.println("reg");
	
}
}

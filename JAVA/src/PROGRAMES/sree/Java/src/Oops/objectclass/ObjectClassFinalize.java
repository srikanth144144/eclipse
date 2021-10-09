package Oops.objectclass;
public class ObjectClassFinalize {
	public static void main(String[] args) {
		Ij o =new Ij();
		Ij p = new Ij();
		o.finalize();
		p.finalize();
	}
}
class Ij{
	protected void finalize() {
		System.out.println("im in reg");		
	}
}

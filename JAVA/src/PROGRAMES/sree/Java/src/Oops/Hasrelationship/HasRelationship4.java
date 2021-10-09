package Oops.Hasrelationship;
public class HasRelationship4 {
	public static void main(String[] args) {
		Laptops l =new Laptops();
		Model m = new Model();
		m.setGen10(l);
		m.showdata();
		
		Model1 n=new Model1();
		n.setGen8(l);
		n.showdata1();
	}
}
class Laptops{
	public void Laptopapple() {
		System.out.println("IOS");
	}
	public void LaptopDell() {
		System.out.println("intel");
	}
}
class Model{
	private Laptops gen10;

	public Laptops getGen10() {
		return gen10;
	}

	public void setGen10(Laptops gen10) {
		this.gen10 = gen10;
	}
	public void showdata() {
		gen10.Laptopapple();
	}	
}
class Model1{
	private Laptops gen8;

	public Laptops getGen8() {
		return gen8;
	}

	public void setGen8(Laptops gen8) {
		this.gen8 = gen8;
	}
	public void showdata1() {
		gen8.LaptopDell();
	}
	
}

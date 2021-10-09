package Oops.Hasrelationship;
public class HasRelationship3 {
	public static void main(String[] args) {
		Bike classic = new Bike();
		Re r =  new Re();
		r.setClassic(classic);
		r.price();
		Bike pro = new Bike();
		Ha s = new Ha();
		s.setPro(pro);
		s.price1();
	}
}
class Bike{
	public void Royal() {
		System.out.println("Royalenfied 350,500");
	}
	public void Honda() {
		System.out.println("Honda 120,200");
	}
}
class Re{
	private Bike classic;
	public Bike getClassic() {
		return classic;
	}
	public void setClassic(Bike classic) {
		this.classic = classic;
	}
	public void price() {
		classic.Royal();
	}
}
class Ha{
	private Bike pro;
	public Bike getPro() {
		return pro;
	}
	public void setPro(Bike pro) {
		this.pro = pro;
	}
	public void price1() {
		pro.Honda();
	}
}
package Oops.inheritance;
public class IsRelationship {
	public static void main(String[] args) {
	dl d = new dl("srikanth",123456,"tl",50000);
	d.display();
	}
}
 class cl{
	  String name ;
	  int id ;
	 public void dis(){
		System.out.println("name: " + name);
		System.out.println(id);
	 }
 }
 class dl extends cl{
	String jobrole ;
	int salary ;
	public dl(String name , int id ,String jobrole, int salary) {
		super.name=name;
		super.id = id;
		this.jobrole = jobrole;
		this.salary = salary;
	}
	void display() {
		super.dis();
		System.out.println(jobrole);
		System.out.println(salary);
		this.display2();
	}	
	void display2() {
	System.out.println("ashfaaq");
	}
 }
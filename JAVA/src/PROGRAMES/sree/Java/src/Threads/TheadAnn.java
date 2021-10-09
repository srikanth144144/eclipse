package Threads;
public class TheadAnn {
	public static void main(String[] args) {
		Emp e = new Emp("sree", 121);
		Emp1 e1 = new Emp1("ash", 122);
		Thread t= new Thread() {
		public  void run() {
			System.out.println("I am in thread one");
			e.m1();
		}	
		};
		t.start();
		Thread t1= new Thread() {
			public void run() {
				System.out.println("I am in thread two");
				e1.m2();
			}
			};
			t1.start();
		}
	}
class Emp{
	String name;
	int id ;
	public Emp(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public void m1() {
		System.out.println(name);
		System.out.println(id );
	}	
}
class Emp1{
	String name;
	int id ;
public Emp1(String name, int id) {
	this.name = name;
	this.id = id;
	}
	public void m2() {
		System.out.println(name);
		System.out.println(id );
	}
}


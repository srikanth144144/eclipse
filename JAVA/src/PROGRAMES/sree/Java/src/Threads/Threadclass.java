package Threads;
public class Threadclass {
	public static void main(String[] args) {
		mech m = new mech("sri",321);
		Thread t = new Thread(m);	
		t.setName("dummy");
		t.getName();
		t.setPriority(5);
		t.start();
		
		Demo1 d= new Demo1("srikanth");
		Thread r = new Thread(d);
		r.setPriority(10);
		r.getName();
		r.setName("runn");
		r.start();		
	}
}
class mech extends Thread{
	String name;
	int id;
	public mech(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public void run() {
		System.out.println(name);
		System.out.println(Thread.currentThread().getName());
		System.out.println(id);
		System.out.println("I am in method");
	}	
}
class Demo1 implements Runnable {
	String name;
	public Demo1(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		System.out.println(name);
		Thread e =Thread.currentThread();
		System.out.println(e.getName());
		System.out.println("I am in run method");
	}	
}

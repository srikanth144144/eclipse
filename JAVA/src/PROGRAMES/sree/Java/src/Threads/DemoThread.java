package Threads;
public class DemoThread {
	public static void main(String[] args) {
		System.out.println("I am in main method");
		Thread t1=  Thread.currentThread();
		System.out.println(t1.getName());
		
		System.out.println("================");
		Demothred d = new Demothred ("sree");
		Thread t= new Thread(d);
		t.setName("krmr");
		System.out.println(t.getName());
		t.start();		
	}
}
class Demothred implements Runnable {
	String name;
	public Demothred(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		System.out.println(name);
	}	
}
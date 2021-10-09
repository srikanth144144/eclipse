package Threads;
public class ThreadDemo {
	public static void main(String[] args) {
			Book b = new Book("ticket giving person");
			Book b1 = new Book("ticket checking person");
			Thread t1 = new Thread(b);
			t1.setPriority(10);
			Thread t2 = new Thread(b1);
			t2.setPriority(1);
			t1.setName("boxOffice guy");
			t2.setName("ticket guy");
			t1.start();
			t2.start();		
	}
}
class Book implements Runnable{
	String name;
	int seats;
	public Book(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for ( int i=0;i<5;i++) {
			System.out.println("name"+name+"seats"+i);	
			System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(2000);		
		} catch (InterruptedException e) {
		e.printStackTrace();	
		}
	}	
  }
}
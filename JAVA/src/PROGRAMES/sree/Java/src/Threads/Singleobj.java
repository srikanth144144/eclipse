package Threads;
public class Singleobj {
	public static void main(String[] args) {
		Bookseats s = new Bookseats(1);
		Thread t1 = new Thread(s);
		t1.setName("ashfaaq");
		t1.setPriority(10);
		Thread t2 = new Thread(s);
		t2.setName("srikanth");
		t2.setPriority(1);
		t1.start();
		t2.start();		
      }
  }
   class Bookseats implements Runnable{
     int available_seats =1;
      int booked_seats;  
       public  Bookseats (int booked_seats) {
	this.booked_seats = booked_seats;
      }
         @Override
     synchronized public void run() {
        	 synchronized(this) {
       System.out.println("Total seats :"+available_seats);
		if(available_seats>=booked_seats) {
			try {
			System.out.println("seats are booked for  :"+Thread.currentThread().getName());
		    Thread.sleep(2000);	
		    available_seats = available_seats-booked_seats;  
	} catch (InterruptedException e) {
	e.printStackTrace();	
	}
		}else{
		System.out.println("sorry no ticketsare available you will try next show.......");
	    }
	  }
     }
   }

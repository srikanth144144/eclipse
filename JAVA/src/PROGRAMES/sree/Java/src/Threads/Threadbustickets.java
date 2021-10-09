package Threads;
import java.util.Scanner;
public class Threadbustickets {
 public static void main(String[] args) {  
	   Bus b = new Bus("madhu",1);
	   Bus b1 = new Bus("ashfaaq", 2);
	   Bus b2 = new Bus("kalyan", 3);
      Thread t = new Thread(b);
      Thread t1 = new Thread(b1);
      Thread t2 = new Thread(b2);
      t.start();
      t1.start();
      t2.start();
 }
}
class Bus implements Runnable{
      String person_name;
      int available_seats = 5;
      int booked_seatsnumber;
	  public Bus(String person_name, int booked_seatsnumber) {
		this.person_name = person_name;
		this.booked_seatsnumber = booked_seatsnumber;
	}
		@Override
	     synchronized public void run() {
	       System.out.println("Total seats :"+available_seats);		
			if(available_seats>=booked_seatsnumber) {
				try {
				System.out.println("seats are booked for  :"+booked_seatsnumber+ "for "+person_name);
				available_seats = available_seats-booked_seatsnumber; 
				System.out.println( "available  seats  :"+ available_seats);
				Thread.sleep(2000);	
			     
			    
		} catch (InterruptedException e) {
		e.printStackTrace();	
		}
			}else{
			System.out.println("sorry no ticketsare available you will try next Bus.......");
		    }
		}	
	}	

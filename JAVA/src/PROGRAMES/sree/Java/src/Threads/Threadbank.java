package Threads;
public class Threadbank {
	public static void main(String[] args) {
	   SBIbank sb = new SBIbank();
	   Thread t = new Thread() {
		   public void  run() {
			   sb.withdraw(1000);
		   }
	   };
	   t.start();	   
	   Thread t1 = new Thread() {
		   public void run() {
			  sb.deposite(252000);
		   }
	   };
	   t1.start();
	}
}
class SBIbank {
	int Total_amount = 10000 ;
	void withdraw( int amount) {
		synchronized(this) { 
		System.out.println("withdraw in progress....");
		if(this.Total_amount<amount) {
			System.out.println("sorry you have less amount in you are account .....");
		}
		try {
			wait();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		Total_amount=Total_amount-amount;
		System.out.println("withdraw is completed.....");
		}
	}
	  public void deposite(int amount) {
		  synchronized(this) {
		System.out.println("deposit in progress.....");
		this.Total_amount=Total_amount+amount;
		System.out.println("deposit completed.....");
		notify();
	 }
	}	
}


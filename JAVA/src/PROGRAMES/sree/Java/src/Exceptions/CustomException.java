package Exceptions;
public class CustomException {
	public static void main(String[] args)throws InsufficientBalanceException {
		Account  sbi = new Account ();
		try{
			sbi.deposit(5000);
		sbi.withdraw(20000);
		}catch( InsufficientBalanceException e ) {
			System.out.println(e.getMessage());
		}
	}
}
class Account {
	int balance =5000;
	void deposit(int amt) {
		balance+=amt;
		System.out.println(balance);
	}
		void withdraw(int amt)throws InsufficientBalanceException{
         if(balance>=amt) {
        	 balance-=amt;
        	 System.out.println(balance);
         }else {
        	 InsufficientBalanceException br = new InsufficientBalanceException("enter worng");
        	 throw br;
              }
		 }	
     }
class InsufficientBalanceException extends Exception{
	InsufficientBalanceException(String msg){
		super(msg);
	}
}

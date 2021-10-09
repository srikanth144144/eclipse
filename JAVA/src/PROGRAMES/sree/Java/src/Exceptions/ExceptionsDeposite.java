package Exceptions;
public class ExceptionsDeposite {
	public static void main(String[] args) {
		Deposite d = new Deposite();
		d.Dep(2000);
		try {
			d.withdraw(3000);
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
class Deposite{
	int amount =2000;
	void Dep( int dep) {
		amount+=dep;
		System.out.println(amount);
	}
	void withdraw( int dep) throws InsufficientBalanceException {
		if(amount>=dep) {
			amount-=dep;
			System.out.println(amount);
		}else {
			InsufficientBalanceException br = new InsufficientBalanceException("Insufficient Balance in you are account....");
			throw br;
		}
		
	}
}
class InsufficientBalanceException1 extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InsufficientBalanceException1(String msg){
		super(msg);
	}
}

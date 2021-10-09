package Arrays;
import java.util.Scanner;

public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner fg= new Scanner(System.in);
		System.out.println("please enter how many elements to store");
		int j= fg.nextInt();
		
		int ids[] =new int[j];
		System.out.println("please enter elements");
		
		for(int i=0;i<ids.length;i++) {
			ids[i]=fg.nextInt();
			
		}
    
     System.out.println("you entered below elements");
     for(int i=0;i<ids.length;i++) {
    	 System.out.println(ids[i]);
     }
	}

}

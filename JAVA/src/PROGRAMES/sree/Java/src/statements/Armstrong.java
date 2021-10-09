package statements;
import java.util.Scanner;
public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num =sc.nextInt();
		int org =num;
		int rem=0;
		int total =0;
		while(org!=0) {
		rem = org%10;	
		total = total+(rem*rem*rem);
		org=org/10;
		}
		if(total==num) {
			System.out.println(num+"give number is armostrong");
		}else {
			System.out.println(num+"give number is not armostrong");
		}
	}
}

package Projects;
import java.util.Scanner;
public class Ifstmt {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
		int num = sc.nextInt();                  
		if(num>=18) {
			System.out.println("you eligable to voting");
		}else {
			System.out.println("you not eligable to vote");
			}
	}
}

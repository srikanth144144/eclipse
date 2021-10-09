package Strings;
import java.util.Scanner;

public class Jeevan {

	public static void main(String[] args) {
	
		String s ="srikanth";
		String  n = "123";
		
		Scanner sc = new Scanner(System.in);
		String j,p;
		do {
		System.out.println("enter the user name");
		 j= sc.nextLine();
		
		System.out.println("enter password");
	      p =sc.nextLine();
		
		if(!(s.equals(j) && n.equals(p))) {
			System.out.println("enter correct detailes");
		}else {
			System.out.println("login scussesfull");                     
		}

		}while(!(s.equals(j) && n.equals(p))) ;
		
	}
	}


                    package Strings;
import java.util.Scanner;

public class Stringter {
		public static void main(String args[]){

			Scanner ed= new Scanner(System.in);
			System.out.println("please enter number one");
			  int a  = ed.nextInt();
			  
			  System.out.println("please enter number two");
			  int b= ed.nextInt();
		int c =a+b;
		System.out.println(a+b);
		String max_vlue =(a>b)? "max number is " +a:"max number is "+b;

		System.out.println(max_vlue);
		
		
		}
}

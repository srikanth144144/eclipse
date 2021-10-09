package Strings;
import java.lang.String;
import java.util.Scanner;
public class StringMethodes {
	public static void main(String args[]){

		Scanner ed= new Scanner(System.in);
		System.out.println("please enter you are string ");
		  String sy= ed.nextLine();
		  
		   for(int i=0; i<=sy.length()-1;i++) {
			   char ch = sy.charAt(i);
		  int d = sy.indexOf(ch);
		  System.out.println("the index of   "  +ch+" "+"is: " +d);
		   }
		  
	}
}

package Strings;
import java.util.Scanner;
public class String5 {
	public static void main(String args[]){

		Scanner ed= new Scanner(System.in);
		System.out.println("please enter you are string details");
		  String str = ed.nextLine();
		  System.out.println("repeated wold");
		  char ch1= ed.next().charAt(0);
		  int count =0;
		  char[] ch = str.toCharArray();
		  for(int i=0;i<=ch.length-1;i++) {
			  
		  
		  if(ch[i]==ch1) {
			  count++;
		  }
		  }
		  System.out.println( count);
		  }
		  

}

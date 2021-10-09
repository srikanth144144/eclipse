package statements;
import java.lang.String;
import java.util.Scanner;
public class palindrom {
	public static void main(String args[]){
		 
		 String sr ,rev ="";
		 Scanner ed= new Scanner(System.in);
		 
		  
		  
		
		System.out.println("please enter you are string");
		      String  sr1 =ed.nextLine();
		  
		  
		  int length = sr1.length();
		  
		  for(int i = length-1; i>=0; i--) 
		  rev = rev +sr1.charAt(i);
		  
		  if(sr1.equals(rev)) 
		  System.out.println(sr1+" "+"is a palindrome");
		  else 
			  System.out.println(sr1+" "+"is not a palindrome");
		  }

	
}



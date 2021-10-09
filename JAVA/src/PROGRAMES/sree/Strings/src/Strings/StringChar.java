package Strings;
import java.util.Scanner;

public class StringChar {
		public static void main(String args[]){

			Scanner ed= new Scanner(System.in);
			System.out.println("please enter you are string details");
			  String str = ed.nextLine();
			  
			  char[] ch = str.toCharArray();
			  for(int i=0;i<=str.length()-1;i++) {
				   
 if(ch[i]>33 &&ch[i]<=47  || ch[i]>58&&ch[i]<=63 || ch[i]>91&&ch[i]<=96  || ch[i]>123&&ch[i]<=126) {
	 System.out.println(ch[i]);	  
				  }
			  
			  }
			  
}
}
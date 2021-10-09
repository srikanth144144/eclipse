package Strings;

import java.util.Scanner;

public class StringStarting {
		public static void main(String args[]){

			Scanner ed= new Scanner(System.in);
			System.out.println("please enter you are string details");
			  String str = ed.nextLine();
			  
			  System.out.println("Starting word");
			  String str1=ed.next();
			  int count = 0;
			  String[] Names = str.split(" ");
			  for(int i=0; i<=Names.length-1;i++) {
				boolean  y =Names[i].startsWith(str1);
				if(y) {
					count++;
				}
			  }
			  System.out.println(count);
			  
			  
				}
			  }
			  
			  
			  

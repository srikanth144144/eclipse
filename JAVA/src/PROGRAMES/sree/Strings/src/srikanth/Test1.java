package srikanth;

import java.io.*;
public class Test1 
	{
	public static void main(String args[]) throws IOException{
	BufferedReader a =new BufferedReader(new InputStreamReader(System.in));


	System.out.println("please enter number one");
	String n1=a.readLine();
	int m =Integer.parseInt(n1);
	 
	System.out.println("please enter number two");
	String  n2=a.readLine();
	int n = Integer.parseInt(n2);
	
	System.out.println((m+n));
	
	
	
	 




	}
	}	
	



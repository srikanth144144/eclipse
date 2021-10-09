package Strings;
import java.util.Scanner;
public class StringRevers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner df=new Scanner(System.in);
		System.out.println("please enter the string");
		String s1=df.nextLine();
		
		StringBuilder s2 =new StringBuilder(s1);
		s2.reverse();
		String  s=s2.toString();
	System.out.println(s);
	
		if(s1.equals(s)) {
			System.out.println("palindrom");	
		}else {
			System.out.println(" not palindrom");	
		}
	}

}

package Strings;
import java.util.Scanner;

public class StringInsert {
public static void main(String args[]) {
	Scanner df=new Scanner(System.in);
	System.out.println("please enter the string");
	String dg=df.nextLine();
	
	StringBuilder bg =new StringBuilder(dg);
	bg.append("to bangalore");
	bg.insert(8, "from krmr");
	System.out.println(bg);
}
}

package Strings;
import java.lang.String;

public class String1 {
public static void main(String args[]) {
	String name = "Sree";
	String s1= new String("Sreekanth");
	char[]  ch = {'S','r','e','e','k','a','n','t','h'};
	String s2= new String(ch);
	System.out.println(name);
	System.out.println(s1);
	System.out.println(s2);
if (s1.equals(s2)) {
	System.out.println("both are same");
}else {
	System.out.println("not same");
}
}

}




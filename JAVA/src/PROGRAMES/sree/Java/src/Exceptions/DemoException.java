package Exceptions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class DemoException {
	public static void main(String[] args) {
		try { 
		int n =10;
		int x =n/0;
		System.out.println(x);
		}catch(ArithmeticException  a){
			System.out.println(  "ArithmeticException==>"+a.getMessage() );
		}
	try {
			String name =null;
			System.out.println(name.length());
		}catch(NullPointerException b ) {
			System.out.println("NullPointerException"+b.getMessage());
		}
	try {
		String name ="srikanth from krmr";
		System.out.println(name.charAt(20));
				
	}catch (StringIndexOutOfBoundsException c) {
		System.out.println("StringIndexOutOfBoundsException"+c.getMessage());
	}
	try {
		int d[] = {12,56,89};
	
		d[6]=98;
	System.out.println(d);		
	}catch(ArrayIndexOutOfBoundsException f) {
	System.out.println("ArrayIndexOutOfBoundsException "+f.getMessage());	
	}				
}
}
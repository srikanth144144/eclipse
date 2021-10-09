package Oops;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Person one details");
		System.out.println("enter the name");
		 String name =sc.next();
		 System.out.println("enter the lastName");
		 String lastname=sc.next();
		 System.out.println("enter the age");
		int age=sc.nextInt();
		 System.out.println("enter the gender");
		String  gender = sc.next();
		 Sree x = new Sree(name, lastname, age ,gender);
		 
		 System.out.println("Person second details");
		 System.out.println("\nenter the name");
		 String name1 =sc.next();
		 System.out.println("enter the lastName");
		 String lastname1=sc.next();
		 System.out.println("enter the age");
		int age1=sc.nextInt();
		 System.out.println("enter the gender");
		String  gender1 = sc.next();
		 Sree x1 = new Sree(name1, lastname1, age1 ,gender1);
		 x.display();
		 x1.display();	
	}	
	}
	class Sree{
		String a;
		String b;
		int  c;
		String d;
		public Sree(String i,String  j ,int  k  ,String l) {
			a=i;
			b=j;
			c=k;
			d=l;		
		}
		void display() {
			System.out.println("\nname: "+a +" "+b+"\nage: "+c+"\ngender: "+d);			
		}
	}
	


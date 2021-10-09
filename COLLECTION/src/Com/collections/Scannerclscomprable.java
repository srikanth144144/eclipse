package Com.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
public class Scannerclscomprable {
	public static void main(String[] args) {
		
		ArrayList<Emp5> em = new ArrayList<Emp5>();
		
		Scanner sc = new   Scanner(System.in);
		System.out.println("enter how may emp");
		int h = sc.nextInt();
		
		  for( int i=0; i<h;i++) {
		System.out.println(" enter id");
		int n = sc.nextInt();
		System.out.println(" enter name");
		String st = sc.next();
		System.out.println(" enter age");
		int m = sc.nextInt();
		 Emp5 e1 = new Emp5(n, st, m);
         em.add(e1);
		  }
		  Collections.sort(em);
		  for (Emp5 ep : em) {
			  System.out.println(ep.id+" "+ep.name+" "+ep.age);	
		}
	}
}
class Emp5  implements Comparable<Emp5>{
	int id ;
	String name;
	int age;
	public Emp5(int id,	String name, int age) {
          this.id = id;
          this.name = name;
          this.age = age;
	}
	@Override
	public int compareTo(Emp5 e) {
		return this.name.compareTo(e.name);
	}
}

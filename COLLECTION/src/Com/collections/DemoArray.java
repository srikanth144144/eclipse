package Com.collections;
import java.util.ArrayList;
import java.util.Scanner;
public class DemoArray {
	public static void main(String[] args) {
		
		System.out.println("enter the how many values you want");
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		
		ArrayList<String> s = new ArrayList<String>();
		for(int i=0;i<num ; i++) {
			System.out.println("enter name");
			String st = sc.next();
	     s.add(st);
		}
		System.out.println(s);
		System.out.println(s.get(1));
		System.out.println(s.isEmpty());
		System.out.println(s.iterator());
		
		for (String str : s) {
			System.out.print(str+ " ");
		}
		
	}
}

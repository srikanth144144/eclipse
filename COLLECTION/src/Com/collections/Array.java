package Com.collections;
import java.util.ArrayList;
import java.util.Scanner;
public class Array {
	public static void main(String[] args) {	
		ArrayList<Student> st = new ArrayList<>();	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many data you want");
		int n =sc.nextInt();
		
		for(int i=0; i<n;i++) {
		System.out.println("enter id");
		int id =sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter Age");
		int age = sc.nextInt();
		Student obj = new Student(id, name, age);
		st.add(obj);
	}
		for (Student stud : st) {
		System.out.println(stud.id+" "+stud.name+" "+stud.Age);	
		}
	}
}
class Student{
	int id;
	String name;
	int Age;
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		Age = age;
	}
}

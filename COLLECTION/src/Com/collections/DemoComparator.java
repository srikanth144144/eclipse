package Com.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;
public class DemoComparator {
	public static void main(String[] args) {
		ArrayList<StudentOne> l1 = new  ArrayList<StudentOne>();
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the how many data you want");
    int num =sc.nextInt();
    
    for(int i = 0;i<num;i++) {
    	System.out.println("enter the id");
    	int k = sc.nextInt();
    	System.out.println("enter the name");
    	String s = sc.next();
    	System.out.println("enter the age");
    	int l = sc.nextInt();
    
    	StudentOne so= new StudentOne(k, s, l);
    	l1.add(so);
    }
        Collections.sort(l1,new AgeComparator());
          for (StudentOne st : l1) {
			System.out.println(st.id+" "+st.name+" "+st.age);
		}
	}
	}

class StudentOne{
	int id;
	String name;
	int age;
	public StudentOne(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}	
}
  class AgeComparator implements Comparator{  
  public int compare(Object obj1,Object obj2){  
	  StudentOne s1=(StudentOne)obj1;  
	  StudentOne s2=(StudentOne)obj2;  
  
//         if(s1.age==s2.age)  
//                return 0;  
//        else if(s1.age>s2.age)  
//                return 1;  
//                else  
//             return -1;  
	  return s1.name.compareTo(s2.name);  
          }  
    }  

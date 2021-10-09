package Com.collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArraytoList {
public static void main(String[] args) {
	//Array
	 String[] s1 = {"java","c","c++","php"};
	System.out.println(Arrays.toString(s1));
  
	 //Array to List
	 List<String> s2 = new ArrayList<>();
	for (String s3 : s1) {
		s2.add(s3);
	}
	System.out.println("This is the list");
	System.out.println(s2);
	
	List<String> fl = new ArrayList<>();
	fl.add("Mango");
	fl.add("banana");
	fl.add("apple");
	fl.add("strabarry");
	fl.add("grapes");
	System.out.println(fl);
	
	System.out.println("list to Array");
	String[] as = fl.toArray(new String[fl.size()]);    
	System.out.println(Arrays.toString(as));	
	}
}

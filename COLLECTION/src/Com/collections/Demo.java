
package Com.collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Demo {
	public static void main(String[] args) {
//		
//		Collection<Object> v = new ArrayList<>();
//		v.add("hai");
//	     v.add(56);
//		v.add("hiii");
//		v.add(58);
//	    System.out.println(v);
//		for (Object obj : v) {
//			System.out.println(obj);	
//		}
//  	v.forEach(System.out::println);
		
	Collection<Integer> i = new ArrayList<>();//in between 0and 1 index no elements add
		i.add(5);
		i.add(3);
        i.add(6);
		i.add(5);
		//i.add("sree");
		System.out.println(i);
		
		Set<Integer> j = new TreeSet<>(i);
		
		System.out.println(j);
//		
//		List<Integer> l = new ArrayList<>();//elements are add and sorting in list
//		l.add(56);
//		l.add(88);
//		l.add(25);
//		l.add(45);
//		l.add(88);
//		l.add(35);
//       l.add(1, 65);
//      Collections.sort(l);
//	l.forEach(System.out::println);
//	System.out.println(l.size());
//	System.out.println(l.remove(l));
//	
	
//	    Vector<Integer> u = new Vector<Integer>();
//	    u.add(8);
//	    u.add(5);
//	    u.add(3);
//	    System.out.println(u.capacity());
//	System.out.println( u.size());
//    //System.out.println(u.lastIndexOf(1, 9));
//    for (Integer i : u) {
//		System.out.println(i);
		
		
	}
	
}

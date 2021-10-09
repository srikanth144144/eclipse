package Com.collections;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class Listiterator {
	public static void main(String[] args) {
		Stack<String> str = new Stack<>();
		str.add("sree");
		str.add("ash");
		str.add("gani");
		str.add("suri");
		
//		Stack<Integer> str = new Stack<>();
//		str.add(523);
//		str.add(52);
//		str.add(12);
//		str.add(889);
		
//		ListIterator<String> Li = str.listIterator(str.size());  
//		System.out.println("Iteration over the Stack from top to bottom:");  
//		while (Li.hasPrevious())   
//		{  
//		String avg = Li.previous();  
//		System.out.println(avg);  
//	} 
		
		Iterator<String> st = str.iterator();
		while (st.hasNext()) {
			String avg = st.next();  
			System.out.println(avg);  
		}
	}
}

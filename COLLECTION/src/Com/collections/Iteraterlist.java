package Com.collections;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;
public class Iteraterlist {
	public static void main(String[] args) {
//	 Vector<String>	 ve = new Vector<String>();
//	 ve.add("Srikanth");
//	 ve.add("Ashfaaq");
//	 ve.add("sureash");
//	 ve.add("jeevan");
//	 ve.add("ganesh");
//	 
//	 Iterator itr=ve.iterator();  
//	  while(itr.hasNext()){  
//	  
		Stack stk = new Stack();  
		//pushing elements into stack  
		stk.push("BMW");  
		stk.push("Audi");  
		stk.push("Ferrari");  
		stk.push("Bugatti");  
		stk.push("Jaguar");  
		
		//iteration over the stack  
		Iterator iterator = stk.iterator();  
		while(iterator.hasNext())  
		{  
		Object values = iterator.next();  
		System.out.println(values);   
		}     
		}  
		}  
	  

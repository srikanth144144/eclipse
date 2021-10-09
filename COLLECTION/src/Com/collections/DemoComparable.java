package Com.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class DemoComparable {
	public static void main(String[] args) {
	  ArrayList<StudOne > s = new ArrayList<StudOne>();
	  s.add(new StudOne(101,"Srikanth",23) );
	  s.add(new StudOne(105,"Hari",27) );
	  s.add(new StudOne(103,"Madhu",26) );
	  s.add(new StudOne(102,"kalyan",24) );
	  s.add(new StudOne(104,"jeevan",25) );
	  
	 // Iterator<StudOne> it =  new Iterator<StudOne>();
	  System.out.println(s);
	  Collections.sort(s);
	  for (StudOne so : s) {
		  System.out.println(so.id+" "+so.name+" "+so.Age);	
	}
	}
}
class StudOne implements Comparable<StudOne >{
	int id;
	String name;
	int Age;
	public StudOne(int id, String name, int Age) {
		this.id = id;
		this.name = name;
		this.Age = Age;
	}	
	@Override
	public int compareTo(StudOne obj) {
		if(Age==obj.Age) {
			return 0;	
		} else if(Age<obj.Age){
			return 1;
		}else {
			return -1;
		}
	}		
}



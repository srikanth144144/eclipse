package Com.collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
public class ListArray {
	public static void main(String[] args) {
	 List<String> l = new ArrayList<>();
	 l.add("Ashfaaq");
	 l.add("srikanth");
	 l.add("Ashfaaq");
	 l.add("madhu");
	 l.add("Hari");
	 l.add("gani");
	 l.set(1, "suresh");
	 l.add("srikanth");
	 
	 l.sort(String.CASE_INSENSITIVE_ORDER);
	 //l.sort(Comparator<>);
	// System.out.println(l.remove(2));
	 //System.out.println(l.remove("Ashfaaq"));
	 System.out.println(l);
     System.out.println(l.lastIndexOf("Ashfaaq"));
	}
}

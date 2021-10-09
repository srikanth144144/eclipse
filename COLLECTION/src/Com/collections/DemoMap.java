package Com.collections;
import java.util.HashMap;
import java.util.Map;
public class DemoMap {
	public static void main(String[] args) {
		 Map<Integer,String> m = new HashMap<>();
		 m.put(101, "Sree");
		 m.put(102, "Ash");
		 m.put(105, "Ash");
		 m.put(103, "madhu");
		 m.put(101, "gani");
		 m.put(103, "Hari");
		 m.put(101, "G1");
		System.out.println(m);
		 //System.out.println(m.get(102));
		// System.out.println(m.get("Sree"));

	}

}

package Com.collections;
import java.util.Stack;
public class Stacklist {
	public static void main(String[] args) {
			Stack <Integer> s = new Stack<>();
			s.push(5);
			s.push(8);
			s.push(4);
			s.push(5);
			s.push(3);
			s.pop();
			System.out.println(s.peek());
			System.out.println(s);
			System.out.println(s.empty());
			System.out.println(s.search(4));
			System.out.println(s.capacity());
	}
}

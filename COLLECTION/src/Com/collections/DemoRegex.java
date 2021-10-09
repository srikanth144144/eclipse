package Com.collections;
import java.util.regex.Pattern;
public class DemoRegex {		
	public static void main(String[] args) {
		String name="Raj123";
		boolean matched= Pattern.matches("^[a-zA-Z]*$", name);
		if(matched) {
			System.out.println(name);
		}else {
			System.out.println("Please ente valid name..");
		}
		//System.out.println(Pattern.matches("[a-zA-Z]", "Raj123")); 
	}
}

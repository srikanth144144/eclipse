package Wrapper;
public class Wrapperclass {
	public static void main(String[] args) {		
		String name ="1234";
		int num =Integer.parseInt(name);
		System.out.println(name);
		
		Integer i = new Integer(num);
		String str = i.toString();
		System.out.println(str);
		
		Integer  obj = Integer.valueOf(num);
		System.out.println(obj);				
	}
}





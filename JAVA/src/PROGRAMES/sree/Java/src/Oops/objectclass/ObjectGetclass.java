package Oops.objectclass;
public class ObjectGetclass {
	public static void main(String[] args) {
		//ObjectGetclass c1 = new ObjectGetclass();
		displayClassName(new ObjectGetclass());
	}
	static void displayClassName(Object o) {
	   Class c=o.getClass();
		String className=c.getName();
		System.out.println(className);
	}
}
				
package Oops.objectclass;
public class ObjectclassClone {
	public static void main(String[] args)throws CloneNotSupportedException {	
		 Demo_persionone o = new  Demo_persionone("ashfaaq",4569,23);
		 System.out.println(o.toString());
		 System.out.println("orignale object "+o);
		 
	 Demo_persionone p = o.clone();
		 System.out.println("duplicate object "+p);
	}
}
class Demo_persionone implements Cloneable{
	String name;
	int id ;
	@Override
	public String toString() {
		return "Demo_persionone [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	int age;
	public Demo_persionone(String name, int id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}
	@Override
	protected Demo_persionone clone() throws CloneNotSupportedException {
		return (Demo_persionone) super.clone();
	}	
}
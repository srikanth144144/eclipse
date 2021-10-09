package Oops.objectclass;
public class ObjectclasstoString {
	public static void main(String[] args) {
		 Demo_one d  = new  Demo_one("srikanth",5624);
		 System.out.println(d.toString());
	}     
}
class Demo_one{
	String name;
	int id;
	public Demo_one(String name, int id) {
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Demo_one [name=" + name + ", id=" + id + "]";
	}	
}
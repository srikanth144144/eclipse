package Oops.objectclass;
public class Objectclassequales {

	public static void main(String[] args) {
		Demo_persion p = new Demo_persion("madhu",24);
		Demo_persion q= new Demo_persion("madhu",24);
		if (p.equals(q)) {
			System.out.println("same");
		}else {
			System.out.println("Not same");
		}
	}
}
class Demo_persion{
	String name;
	int age;
	public Demo_persion(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Demo_persion other = (Demo_persion) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}		
}

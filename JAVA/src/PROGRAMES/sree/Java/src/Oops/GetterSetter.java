package Oops;
public class GetterSetter {
	public static void main(String[] args) {
	student sr =new student();
	sr.setName("srikanth");
	sr.setId(9542);
	sr.setAge(22);
	sr.sy();
	}
}
class student{
	private int id;
	private String name;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}                                  
	void sy() {
		System.out.println(getName());
		System.out.println(getId());
		System.out.println(getAge());
	}
}
package Oops.Test;
class Bank{
	 String name;
	 String Employee_name;
	 
	 Bank(String name, String Employee_name){
		 this.name=name;
		 this.Employee_name=Employee_name;
	 }
	 
////	public String getName() {
////		return name;
////	}
////	public void setName(String name) {
////		this.name = name;
////	}
//	public void display() {
//		System.out.println(name);
//	}
}
class Employee extends Bank{
	
Employee(String name, String Employee_name) {
		super(name, Employee_name);
		System.out.println(name);
		System.out.println(Employee_name);
		// TODO Auto-generated constructor stub
	}

//	public String getEmployee_name() {
//		return Employee_name;
//	}
//	public void setEmployee_name(String employee_name) {
//		Employee_name = employee_name;
//	}
	public void display1() {
		System.out.println(name+" Employee of "+Employee_name);
	}

	
	 }
public class Has {
	public static void main(String[] args) {
	
		Employee e =new Employee("madhu","SBI");
		e.display1();
		
	}
}

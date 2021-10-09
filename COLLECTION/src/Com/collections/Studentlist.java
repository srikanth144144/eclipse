package Com.collections;
import java.util.ArrayList;
import java.util.List;
public class Studentlist {
	public static void main(String[] args) {
	 List<Emp> list= new ArrayList<Emp>();
	 Emp e1 = new Emp(101, "Sai", 25000);
	 Emp e2 = new Emp(102, "madhu", 25500);
	 Emp e3 = new Emp(103, "Hari", 25001);
	 Emp e4 = new Emp(104, "Srikanth", 25000);
	 Emp e5 = new Emp(105, "kalyan", 25000);
	 
	 list.add(e1);
	 list.add(e2);
	 list.add(e3);
	 list.add(e4);
	 list.add(e5);
	 
	 for (Emp em : list) {
	 System.out.println(em.id+" "+em.name+" "+em.Salary);
	 }
	}
}
class Emp {
	int id;
	String name;
        int	Salary;
   public Emp(int id, String name, int salary) {
			this.id = id;
			this.name = name;
			this.Salary = salary;
		}       
}

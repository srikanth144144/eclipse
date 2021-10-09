package Oops.Interface;

interface DemoInterone{
	 public void main(int id ,int s,String name);
	  void main(int a,int b);
}
interface DemointerTwo{
	public void main(String add);
	public void main(int a);
}
class inter implements DemoInterone,DemointerTwo{	
	 public void main (int id ,int s,String name) {
	   System.out.println(id);
	   System.out.println(s);
	  System.out.println(name);
}
    public void main(int a,int b) {
	System.out.println(a+b);
}
    public void main(String add) {
    	System.out.println(add);
    }
    public void main(int a) {
    	System.out.println(a);
    }
}
public class Interface {	
	public static void main(String[] args) {
		inter i = new inter();
		i.main(2563, 20000, "srikanth");
		i.main(20, 10);
		i.main("bng");
		i.main(5);
	}
}

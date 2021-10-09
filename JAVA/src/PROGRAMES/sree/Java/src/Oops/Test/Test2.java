package Oops.Test;
public class Test2 {
	public static void main(String[] args) {
		sr r= new sr(10,20,30,"ghg");
		r.dis1();
	}
}
class sr{
	 private int a,b;
	static int c;
	private String name;
	sr(int a,int b,int c,String name){
		this.a=a;
		this.b=b;
		this.c=c;
		this.name= name;		
	}
	void dis1() {
		System.out.println(a+b+c);
		System.out.println(name);
	}
	
}

package Oops;
public class PassByvalue {
	public static void main(String[] args) {
	int a=10;
	int b=15;
	System.out.println("before swaping :"+a+"\t"+b);
	new Change().doSwap(a,b);
	System.out.println("after swaping :"+a+"\t"+b);
}
}
class Emp{
	int num;
	public Emp(int num) {
		this.num=num;
	}
}
class Change{
	void doSwap(int a,int b) {
		 int temp;
		 temp = a;
		 a=b;
		 b= temp;
	}
}	

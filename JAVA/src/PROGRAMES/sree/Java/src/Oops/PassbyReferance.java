package Oops;
public class PassbyReferance {
	public static void main(String[] args) {
		Emp a1 = new Emp(30);
		Emp a2 = new Emp (20);
	    System.out.println("before swapping  : "+a1.num+"\t"+a2.num);
		new Ef().doSwap(a1,a2);
		System.out.println("after swaping :"+a1.num+"\t"+a2.num);

		new Ef().doChangeone(a2);
		System.out.println(a2.num);
		new Ef().doChangetwo(a1);
		System.out.println(a1.num);
		}
	}
class Ef{
	int num;
public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
   void doSwap(Emp a1,Emp a2) {
	int temp ;
	temp =a1.num;
	a1.num=a2.num;
	a2.num=temp;
}
void doChange(Emp a) {
	a.num =a.num*2;
}
void doChangeone(Emp a) {
	a.num =a.num*2;
}
void doChangetwo(Emp a) {
	a.num =a.num*2;
}
} 
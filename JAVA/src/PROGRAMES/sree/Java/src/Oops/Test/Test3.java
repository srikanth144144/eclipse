package Oops.Test;
class df{
	int x=10;
	void m12() {
		System.out.println(x);
	}	
}
class gh{
	int y=23;
	int m23() {
		//System.out.println(y);
		return y;
	}
}
public class Test3 {
	Test c;
	public static void main(String[] args) {
		df d =new df();
		d.m12();
		//System.out.println(d.m12());
		gh f = new gh();
		System.out.println(f.m23());
		int b=f.m23();
      System.out.println(b);
	}

}

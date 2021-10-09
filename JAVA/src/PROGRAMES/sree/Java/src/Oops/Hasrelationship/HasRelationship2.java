package Oops.Hasrelationship;
public class HasRelationship2 {
	public static void main(String[] args) {
		mn g = new mn();
		ab y= new ab();
		xy w= new xy(y,g);
		w.showdata();	
}
}
class xy{
	int a =10;
	int b=15 ;
	int c = a+b;
	ab l;
	mn q;
	xy(ab l, mn q){
		this.l=l;
		this.q=q;
	}
	void showdata() {
		System.out.println(this.c+" "+l.k+" "+q.g);
	}
}
class ab{
	int i =5;
	int j =5;
	int k =i*j;
}
class mn{
	int e=25;
	int f =5;
	int g=e/f;
}
package Projects;
public class Inter {
	public static void main(String[] args) {
		System.out.println(SRR.age);
		
		SRR s = new SRR() {
		public 	void m1() {
 System.out.println("madhu");				
			}
		};
		s.m1();
	}
}
interface SRR{
	 int age = 24;
	 public void m1() ;
}



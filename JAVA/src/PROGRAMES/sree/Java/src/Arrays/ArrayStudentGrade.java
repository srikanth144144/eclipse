package Arrays;
import java.util.Scanner;
public class ArrayStudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner jk =new Scanner(System.in);
		System.out.println(" enter student subjects");
		int o =jk.nextInt();
		
		int[] n =new int[o];
		System.out.println("subjects markes");
		for(int i=0;i<n.length;i++) {
			n[i]=jk.nextInt();	
		}
        float count = 0;
        for(int j=0;j<n.length;j++) {
        	count=count+n[j];
        }
        System.out.println("student all subjects total markes: "+count);
    float f =(count/o*100)*1/100;
        System.out.println(f);
        
        if(f>=90&&f<=100) {
        	System.out.println("student grade is A" );
        }else if(f>=70&&f<=89) {
        		System.out.println("student grade is B" );
        }else if(f>=50&&f<=69) {
        		System.out.println("student grade is C" );
        }else if(f>=35&&f<=49) {
        		System.out.println("student grade is D" );
        		}else {
        			System.out.println("student is faile" );	
        		}
      
        		
        	}
}
        		



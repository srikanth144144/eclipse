package Arrays;
import java.util.Scanner;

public class ArrayelementSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner jk =new Scanner(System.in);
		System.out.println("please enter the array elements");
		int o =jk.nextInt();
		
		int[] n =new int[o];
		System.out.println("please enter element");
		for(int i=0;i<n.length;i++) {
			n[i]=jk.nextInt();	
		}
        int count = 0;
        for(int j=0;j<n.length;j++) {
        	count=count+n[j];
        }
        System.out.println("Sum of given elements: "+count);
	}

}

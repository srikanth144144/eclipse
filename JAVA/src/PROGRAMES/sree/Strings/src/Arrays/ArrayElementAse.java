package Arrays;
import java.util.Scanner;
public class ArrayElementAse {

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
			
		int temp =0;
			for(int k=0;k<n.length;k++) {
				
				for(int j=k+1;j<n.length;j++) {
					if(n[k]>n[j]) {
						temp =n[k];
						n[k]=n[j];
						n[j]=temp;
					}
				}
			}
		System.out.println("sorted elements");
		for(int m=0;m<n.length;m++) {
			System.out.println(n[m]);
			}
		}
		}
		
		
	



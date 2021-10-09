package Arrays;
import java.util.Scanner;

public class ArrayMultiplcation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner u= new Scanner (System.in);
		System.out.println("enter the rows and columns");
		int r= u.nextInt();
		int c =u.nextInt();
		
		int x[][] = new int[r][c];
		int y[][] = new int [r][c];
		int z[][] = new int [r][c];
		
		System.out.println("enter the elements of first matrix");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				x[i][j]=u.nextInt();
			}
		}
		System.out.println("enter the elements of second matrix");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				y[i][j]=u.nextInt();
			}
		}
		for( int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				z[i][j]=x[i][j]+y[i][j];
			
			}
			}
		System.out.println("matrix sum");
		for(int i=0;i<r ;i++) {
			for(int j=0;j<c; j++) {
				System.out.print(z[i][j]+" ");
			
			}
			System.out.println();
		}
		
		
	}
	}
	
	



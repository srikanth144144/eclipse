package Arrays;
import java.util.Scanner;
public class Array2D{
 public static void main(String args[]) {
	 Scanner nm = new Scanner(System.in);	 
	 System.out.println("enter the number of rows and columns of matrix");
	  int s = nm.nextInt();
	  int r = nm.nextInt();
	  
	int a[][] = new int[s][r];
	  int b[][] =new int[s][r];
	  int c[][]=new int [s][r];
	  
	  System.out.println("enter the elements of first  matrix");	  
	  for(int i=0;i<s;i++) {
	  for(int j=0;j<r;j++) {
		 a[i][j]=nm.nextInt();
	  }
	  }
		  System.out.println("enter the elements of second matix");
		  for(int i=0;i<s;i++) {
			  for(int j=0;j<r;j++) {
				  b[i][j]=nm.nextInt();
			  }
		  }
		  for(int i=0;i<s;i++) {
			  for(int j=0;  j<r;j++){
				  int total=0;
				  for(int e=0; e<s;e++) {
				  total+=a[i][e]*b[e][j];
				  }
				  c[i][j]=total;
			  }				  
			  }
		  System.out.println("Mult of matrix:");		  
 for (int i=0;i<s;i++) {
	 for(int j=0;j<r;j++) {
		 System.out.print(c[i][j]+" ");
	 }
	 System.out.println();
 }	
        float g =c[0][0]*c[1][1]-c[0][1]*c[1][0];
         float f =1/g ;
         System.out.println(f);
 }
}

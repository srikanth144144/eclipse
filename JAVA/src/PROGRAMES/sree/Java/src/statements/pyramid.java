package statements;

public class pyramid {
public static void main(String args[]) {
	int w = 5 , l=0;
	for(int i=1; i<=w ;++i,l=0) {
		for(int space = 1; space<=w-i; ++space) {
			System.out.print(" ");
		}
		while (l!=2*i-1) {
			System.out.print("*");
			++l;
		}
		System.out.println();
	}
}
}

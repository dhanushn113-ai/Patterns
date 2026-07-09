package patternsjava;
import java.util.Scanner;

public class ReverseLeftHalfPyramid {
	/*
	 *  *****
	 *   ****
	 *    ***
	 *     **
	 *      *
	 *      
	 *      
	 *  i=1, stars=5, space=0,n=5,   j=n-i+1= 5-1+1=5
	 *  i=2, stars=4, space=1,n=5,
	 *  i=3, stars=3, space=2,n=5,
	 *  i=4, stars=2, space=3,n=5,
	 *  i=5, stars=1, space=4,n=5,
	 *  
	 *      
	 *      
	 *      
	 * */
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int space = 1; space<=i; space++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= n-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

}

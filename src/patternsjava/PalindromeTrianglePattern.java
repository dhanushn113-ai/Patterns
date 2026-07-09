package patternsjava;
import java.util.Scanner;

public class PalindromeTrianglePattern {
	/*
	 *              1
	 *            2 1 2 
	 *          3 2 1 2 3
	 *        4 3 2 1 2 3 4
	 *      5 4 3 2 1 2 3 4 5
	 *      
	 *      
	 *  i=1;j=1;n=5; space=4
	 *  i=2;j=2;n=5; space=3
	 *  i=3;j=3;n=5; space=2
	 *  i=4;j=4;n=5; space=1
	 *  i=5;j=5;n=5; space=0
	 * 
	 * 
	 * */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1;i <= n;i++) {
			for(int space = 1; space<=n-i;space++) {
				System.out.print("  ");
			}
			//print decresing numbers
			for(int j = i;j >=1;j--) {
				System.out.print(j + " ");
			}
			//print incresing numbers
			for(int j = 2; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		

	}

}

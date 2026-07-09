package patternsjava;
import java.util.Scanner;

public class ReverseNumberTriangle {
	/*   1 2 3 4 5
	 *    2 3 4 5
	 *     3 4 5
	 *      4 5
	 *       5
	 * 
	 * 
	 * i=1; j=5; n=5;space=0; 
	 * i=2; j=4; n=5;space=1;
	 * i=3; j=3; n=5;space=2;
	 * i=4; j=2; n=5;space=3;
	 * i=5; j=1; n=5;space=4;
	 * */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1;i <= n;i++) {
			for(int space=1; space<=i-1;space++) {
				System.out.print(" ");
			}
			for(int j = i; j <= n; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}

	}

}

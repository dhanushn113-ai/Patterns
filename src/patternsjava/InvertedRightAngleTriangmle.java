package patternsjava;
import java.util.Scanner;

public class InvertedRightAngleTriangmle {
	
	/*      *****
	 *      ****
	 *      ***
	 *      **
	 *      *
	 *      
	 *      i = 1; stars = 5; n=5; stars=n-i-1;
	 *      i = 2; stars = 4; n=5; stars= n-i-1;
	 * */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= n-i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}

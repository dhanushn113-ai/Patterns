package patternsjava;
import java.util.Scanner;

public class NumberIncresingJ {
	/*    1
	 *    12
	 *    123
	 *    1234
	 *    12345
	 * 
	 *   n = 5; num=1; i = 1; j = 1;
	 *   n = 5; num=2; i = 2; j = 1,2;
	 *   n = 5; num=3; i = 3; j = 1,2,3;
	 *   n = 5; num=4; i = 4; j = 1,2,3,4;
	 *   n = 5; num=5; i = 5; j = 1,2,3,4,5;
	 * */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		

	}

}

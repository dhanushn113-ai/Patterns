package patternsjava;
import java.util.Scanner;

public class Paralleogram {
	/*     *****
	 *    *****
	 *   ***** 
	 *  ***** 
	 * ***** 
	 * 
	 * i=1; j=5; space=4
	 * i=2; j=5; space=3
	 * i=3; j=5; space=2
	 * i=4; j=5; space=1
	 * i=5; j=5; space=0
	 * */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n-1;i++) {
			for(int space=1;space<=n-i;space++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}

package patternsjava;
import java.util.Scanner;

public class TriangleStarPattern {
	/*      *
	 *     ***
	 *    *****
	 *   *******
	 *  *********   
	 * 
	 * i = 1;space=4; star=1; 2*i-1;
	 * i = 2;space=3; star=3;
	 * i = 3;space=2; star=5;
	 * i = 4;space=1; star=7;
	 * i = 5;space=0; star=9;
	 * 
	 * */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int space = 1; space<=n-i;space++) {
				System.out.print("  ");
				
			}
			for(int j = 1; j <= 2*i-1;j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
			}
}

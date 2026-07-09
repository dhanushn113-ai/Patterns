package patternsjava;
import java.util.Scanner;

public class NumberTrianglej {
	/*     1
	 *    2 2
	 *   3 3 3
	 *  4 4 4 4 
	 * 5 5 5 5 5
	 * 
	 * i=1;num=1;n=5; spaces=4
	 * i=2;num=2;n=5; spaces=3
	 * i=3;num=3;n=5; spaces=2
	 * i=4;num=4;n=5; spaces=1
	 * i=5;num=4;n=5; spaces=0
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int space=1;space<=n-i;space++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print(i + " ");;
			}
			System.out.println();
		}

	}

}

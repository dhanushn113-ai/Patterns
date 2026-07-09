package patternsjava;
import java.util.Scanner;

public class NumberPatternJ {
	/*   12345
	     12345
	     12345
	     12345
	     12345   */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i <= n-1; i++) {
			for(int j = 0; j <=n-1; j++) {
				System.out.print(j+1 +" ");
			}
			System.out.println();
		}

	}

}

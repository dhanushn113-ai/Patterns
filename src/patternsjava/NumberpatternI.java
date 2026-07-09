package patternsjava;
import java.util.Scanner;

public class NumberpatternI {
	/*   1 1 1 1 1
	     2 2 2 2 2
	     3 3 3 3 3
	     4 4 4 4 4
	     5 5 5 5 5        */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i <= n-1; i++) {
			for(int j = 0; j <= n-1; j++) {
				System.out.print(i+1 +" ");
			}
			System.out.println();
		}
		

	}

}

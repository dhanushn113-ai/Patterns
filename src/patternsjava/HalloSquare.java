package patternsjava;
import java.util.Scanner;

public class HalloSquare {
	
	/* *****
	   *   *
	   *   *
	   *   *
	   *****
	          */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i <= n-1; i++) {
			for(int j = 0; j <= n-1; j++) {
				if(i == 0 || i == 4 || j == 0 || j== 4) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		

	}

}

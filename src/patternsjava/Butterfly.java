package patternsjava;
import java.util.Scanner;

public class Butterfly {
	
	/*   *        *
	 *   **      **
	 *   ***    ***
	 *   ****  ****
	 *   **********
	 *   **********
	 *   ****  ****
	 *   ***    ***
	 *   **      **
	 *   *        *
	 * 
	 *  i=1;j=2;n=5;  space=8; 
	 *  i=2;j=4;n=5;  space=6;
	 *  i=3;j=6;n=5;  space=4;
	 *  i=4;j=8;n=5;  space=2;
	 *  i=5;j=10;n=5; space=0;
	 *  
	 *  
	 * 
	 * 
	 * 
	 * */

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j = 1; j<=i;j++) {
				System.out.print("*");
				for(int space=1; space<=(n-i)*2;space++) {
					System.out.print(" ");
				}
				for(int space=1;space<=i;space++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}

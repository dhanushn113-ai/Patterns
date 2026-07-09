package patternsjava;
import java.util.Scanner;

public class Rhombus {
	/*
	 *          *
	 *         ***
	 *        *****
	 *       *******
	 *      *********
	 *       *******
	 *        *****
	 *         ***
	 *          *
	 * 
	 * 
	 * i=1; j=1;n=5; space=4; 2*i-1->2*1-1=1,
	 * i=2; j=3;n=5; space=3; 2*2-1=3
	 * i=3; j=5;n=5; space=2;
	 * i=4; j=7;n=5; space=1;
	 * i=5; j=9;n=5; space=0;
	 * 
	 * */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n;i++) {
			for(int space = 1; space<=n-i;space++) {
				System.out.print(" ");
			}
			for(int j = 1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//lower case
		for(int i = 1; i <=n; i++) {
			for(int space = 1; space<=i;space++) {
				System.out.print(" ");
			}
			for(int j = 1; j <=(n-i)*2-1;j++) { //(n-i)*2-1=7
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

package patternsjava;
import java.util.Scanner;

public class NumberRhombus {
	/*
	 *        1
	 *       222
	 *      33333
	 *     4444444
	 *      55555
	 *       666
	 *        7
	 * 
	 * i=1;space=3;n=4;j=1
	 * i=2;space=2;n=4;j=3
	 * i=3;space=1;n=4;j=5
	 * i=4;space=0;n=4;j=7
	 * 
	 * */

	public static void main(String[] args) {
		int n =5;
		for(int i=1; i <n;i++) {
			for(int space=1; space<=n-i;space++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i+i-1;j++) {
				System.out.print(i);
			}
			System.out.println();
			
		}
		int k=5;
		int s=2;
		for(int i=5;i>=1;i=i-2) {
			System.out.print(" ".repeat(s++));
			for(int j=1;j<=i;j++) {
				System.out.print(k);
			}
			k++;
			System.out.println();
		}

	}

}

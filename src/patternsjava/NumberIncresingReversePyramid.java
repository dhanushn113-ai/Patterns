package patternsjava;
import java.util.Scanner;

public class NumberIncresingReversePyramid {
	/*  12345
	 *  1234
	 *  123
	 *  12
	 *  1
	 *  i = number of values in row1
	 *  j = number of values in column 1
	 *  i starts from 1;
	 * i = 5; j = 5; n= 5 num = 12345, j = n-i+1 == 5-i+1=5;
	 * i =
	 * 
	 * 
	 * 
	 * */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 1;j <= n-i+1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}

package patternsjava;
import java.util.Scanner;

public class NumberSeries2 {

	 /*  1 2 3 4 5
	  *  2 3 4 5 6
	  *  3 4 5 6 7
	  *  4 5 6 7 8
	  *  5 6 7 8 9 
	  * */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count;
		for(int i = 0; i < n; i++) {
			count = i + 1;
			for(int j = 0; j < n; j++) {
				System.out.print(count++ + " ");			
			}
			System.out.println();
		}
	}
}

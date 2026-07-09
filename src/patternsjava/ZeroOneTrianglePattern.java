package patternsjava;
import java.util.Scanner;

public class ZeroOneTrianglePattern {
	
	/*  1
	 *  0 1
	 *  1 0 1
	 *  0 1 0 1
	 *  1 0 1 0 1
	 *
	 *  i=1, num = 1; n=5   (i+j) % 2 == 0 --> 1+1 % 2 == 0
	 *  i=2, num = 2; n=5   (i+j) % 2 == 0 --> 2+1 % 2 == 1
	 *  i=3, num = 3; n=5
	 *  i=4, num = 4; n=5
	 *  i=5, num = 5; n=5
	 * 
	 *  coordinates
	 *  
	 *  11       --->1+1=2
	 *  21 22    ---->2+1=3    2+2=4
	 *  31 32 33
	 *  41 42 43 44
	 *  51 52 53 54 55
	 * 
	 * 
	 * 
	 * */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				if((i+j) % 2 == 0) {
					System.out.print("1" +" ");
				}
				else {
					System.out.print("0" + " ");
				}
			}
			System.out.println();
		}
		

	}

}

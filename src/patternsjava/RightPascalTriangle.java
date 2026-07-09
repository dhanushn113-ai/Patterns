package patternsjava;
import java.util.Scanner;
public class RightPascalTriangle {
	
	/*   *
	 *   * *
	 *   * * *
	 *   * * * *
	 *   * * * * *
	 *   * * * *
	 *   * * *
	 *   * *
	 *   *
	 *           
	 * upperhalf
	 * 
	 * i=1; n=5; star=1
	 * i=2; n=5; star=2
	 * i=3; n=5; star=3
	 * i=4; n=5; star=4
	 * i=5; n=5; star=5
	 * 
	 * lowerhalf    
	 * 
	 * i=1; n=5; star = 4  j = n-i==5-1=4
	 * i=2; n=5; star = 3  j = n-i==5-2=3 
	 * i=3; n=5; star = 2  j = n-i==5-3=2    
	 * i=4; n=5; star = 1  j = n-i==5-4=1   
	 *                    */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//upperhalf
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		//lowerhalf
		for(int i = 1; i <n; i++) {
			for(int j = 1; j <= n-i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
		
		
	}

}

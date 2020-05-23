package TimeComplexcityAndRecursion;

import java.util.Scanner;

public class SumOfDigits {

	public static int sum(int n) {
		if(n == 0) {
			return 0;
		}else {
			return n%10 + sum(n/10);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			int n = sc.nextInt();
			
			System.out.println(sum(n));
		}

	}

}

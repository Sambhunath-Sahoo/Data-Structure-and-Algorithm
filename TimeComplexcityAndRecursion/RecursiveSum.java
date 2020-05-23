package TimeComplexcityAndRecursion;

import java.util.Scanner;

public class RecursiveSum {

	public static int sum(int n) {
		if(n != 0) {
			return n + sum(n-1);
		}else {
			return n;
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

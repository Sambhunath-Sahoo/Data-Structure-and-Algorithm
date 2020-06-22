package Sorting;

import java.util.Scanner;

public class PrepbuddyANDrobo {

	static void ans(int n) {
		int min = Integer.MIN_VALUE, max = Integer.MAX_VALUE;
		int i = 0;
		int count = 0; 
		while(n > 0) {
			
			i = n % 10;
			
			if(min > i)
				min = i;
				
			if(max < i)
				max = i;
			
			count += 1;
		}
		
		if(min+(count-1) == max) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
			
		
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		
//		while(t-->0) {
			int n = sc.nextInt();
			
			ans(n);
//		}
	}

}

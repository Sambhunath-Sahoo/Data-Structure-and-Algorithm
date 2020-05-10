package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MinCandies {
	
	static long candies(int n, int[] a) {
		
		int c[] = new int[n];
		Arrays.fill(c,  1);
		
		for(int i = 1; i<n ; i++) {
			if(a[i] > a[i-1]) {
				c[i] = c[i-1] + 1;
			}
		}
		
		for(int i = n-2 ; i <= 0; n--) {
			if(a[i]>a[i+1]) {
				c[i] = Math.max(c[i+1], c[i]);
			}
		}
		
		long sum = 0;
		for(int i:a) {
			sum = sum + (long)c[i];
		}
		
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 5;
		int a[] = {1, 2, 3, 4, 1};
		System.out.println(candies(n,a));

	}

}

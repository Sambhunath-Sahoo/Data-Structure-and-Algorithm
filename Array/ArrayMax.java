package Array;

import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int sum = 0;
		while(t-->0) {
			
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int[n];
			
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			
			for(int i = k; i < n ; i = i + k) {
				a[i] = a[i-k] + a[i];
				sum += a[i];
			}
			for(int i = 0; i < n; i++) {
				System.out.print(a[i]+" ");
			}
			
			System.out.println(sum);
			
			
		}
		
	}

}

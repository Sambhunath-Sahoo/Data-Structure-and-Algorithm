package Array;

import java.util.Scanner;

public class KSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int b[][] = new int[10][2];
			for(int i = 0;i < n;i++) {
				a[i] = sc.nextInt();
			}
			int k = sc.nextInt();
			int max = 0, min = 0;
			for(int i = 0;i < n; i++) {
				int temp = a[i];
				int num = k - temp;
				for(int j = i+1; j < n; j++) {
					if (num == a[j]) {
						min = i;
						max = j;
					}
				}
			}
			
			System.out.println(min+" "+ max);
			
			
		}
	}

}

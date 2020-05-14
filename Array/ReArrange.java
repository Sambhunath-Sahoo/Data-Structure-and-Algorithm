package Array;

import java.util.Scanner;

public class ReArrange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			int n = sc.nextInt();
			int a[] = new int[n];
						
			for(int i = 0;i < n; i++) {
				a[i]=sc.nextInt();
			}
			int b[] = new int[n];

			int k = 0;
			for(int i = n - 1; i >= n/2; i--) {
				b[k] = a[i];
				k += 2;
			}
			
			k = 1;
			for(int i = 0; i <= n/2 - 1; i++) {
				b[k] = a[i];
				k += 2;
			}

			for(int i = 0;i < n; i++) {
				System.out.print(b[i]+" ");
			}
			
		}

	}

}

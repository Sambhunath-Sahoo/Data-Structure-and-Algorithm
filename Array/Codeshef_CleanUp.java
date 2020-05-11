package Array;

import java.util.Scanner;

public class Codeshef_CleanUp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		int k; 
		
		while(test--!=0) {
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arr[] = new int[n+1];
			int complet[] = new int[n-m];
			
			for(int i = 0; i < m; i++) {
				k = sc.nextInt();
				arr[k] = 1;
			}
			
			k = 0;
			
			for(int i = 1; i < n+1; i++) {
				if(arr[i] == 0) {
					complet[k++]=i;
				}
			}
			
			for(int i =0; i < n-m; i += 2) {
				System.out.print(complet[i]+" ");
			}System.out.println();

			for(int i =1; i < n-m; i += 2) {
				System.out.print(complet[i]+ " ");
			}System.out.println();
		}
	}

}

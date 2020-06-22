package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class CopyingHero {


	static int copy(int a[], int n) {
		Arrays.parallelSort(a);
		int sum = 0;
		for(int i = 0; i < n; i++) {
			if(a[i] > i+1) {
				sum += a[i] - (i+1);
			}else if (a[i] < i+1) {
				sum += (i+1) - a[i];
			}else {
				continue;
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) {

			
		Scanner sc = new Scanner(System.in);
		int t =  sc.nextInt();
		
		while(t-->0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			
			for(int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			
			System.out.println(copy(a,n));
			
		}
		
	}

}

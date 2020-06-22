package Sorting;

import java.util.Scanner;

public class selectionSort {

	static void selection(int a[], int n) {
		for (int i = 0; i < n- 1; i++) {
			int min = i;
			for(int j = i+ 1; j < n; i++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
		
		for(int i = 0; i < n; i++) {
			 System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
	

	 Scanner sc = new Scanner(System.in);
//	 int n = sc.nextInt();
	 
	 int a[] = {64,25,12,22,11};
	 
//	 for(int i = 0; i < n; i++) {
//		 a[i] = sc.nextInt();
//	 }
//	 
	 selection(a, a.length);
	 
	 
	}
}



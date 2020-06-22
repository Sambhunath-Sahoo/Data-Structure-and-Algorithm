package Sorting;

import java.util.Scanner;

public class BubbleSort {

	static void Bubble(int arr[], int n) {

		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i -1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
//		for(int i = n - 1; i >= 0; i--) {
//		for(int j = 0; j < i - 1; j++) {
//			if (arr[j] > arr[j+1]) {
//				int temp = arr[j];
//				arr[j] = arr[j+1];
//				arr[j+1] = temp;
//			}
//		}
//	}
//		
		
		for(int i = 0 ; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		for(int i = 0 ; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		Bubble(a,n);
	}

}

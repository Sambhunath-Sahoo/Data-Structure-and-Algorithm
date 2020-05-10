package Array;

import java.util.Scanner;

public class RainWaterProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {0,1,2,0,0,3,1,0,3}; 
		int n = arr.length;
		
//Bruthforce approach:===============
		
//		int water=0, lmax = arr[0], rmax = arr[n-1];
//		
//		for(int i = 1; i<n-1; i++) {
//			for(int j = i; j >=0; j--) {
//				if(arr[j] > lmax) {
//					lmax = arr[j];
//				}
//			}
//			for(int j = 0; j<n; j++) {
//				if(arr[j]>rmax) {
//					rmax = arr[j];
//				}
//			}
//			
//			water += Math.min(lmax,rmax) - arr[i];
//		}
		
		
		
		
//Optimised approach:===========================
		
		int water=0;
		int left[]= new int [n];
		int right[] = new int[n];
		
		left[0]=arr[0];
		for(int i=1;i < n;i++) {
			left[i] = Math.max(left[i-1],arr[i]);
		}
		
		right[n-1]=arr[n-1];
		for(int i = n-2;i >= 0;i--) {
			right[i] = Math.max(arr[i],right[i+1]);
		}
		
		
		for(int i = 0 ; i < n ; i++) {
			water += Math.min(left[i], right[i]) - arr[i];
		}
		
		System.out.println("the amount water stored in buildings : " + water);

	}

}

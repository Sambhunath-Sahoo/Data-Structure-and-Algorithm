package TimeComplexcityAndRecursion;

import java.util.Scanner;
import java.util.HashMap; 
import java.util.Map; 

	public class SumQualsK{ 
		
		// Function to find number of subarrays 
		// with sum exactly equal to k. 
		static int findSubarraySum(int arr[], int n, int sum) 
		{ 
			// HashMap to store number of subarrays 
			// starting from index zero having 
			// particular value of sum. 
			HashMap <Integer, Integer> prevSum = new HashMap<>(); 
			
			int res = 0; 
			
			// Sum of elements so far. 
			int currsum = 0; 
			
			for (int i = 0; i < n; i++) { 
			
				// Add current element to sum so far. 
				currsum += arr[i]; 
			
				// If currsum is equal to desired sum, 
				// then a new subarray is found. So 
				// increase count of subarrays. 
				if (currsum == sum) 
					res++;		 
			
				// currsum exceeds given sum by currsum 
				// - sum. Find number of subarrays having 
				// this sum and exclude those subarrays 
				// from currsum by increasing count by 
				// same amount. 
				if (prevSum.containsKey(currsum - sum)) 
					res += prevSum.get(currsum - sum); 
					
			
				// Add currsum value to count of 
				// different values of sum. 
				Integer count = prevSum.get(currsum); 
				if (count == null) 
					prevSum.put(currsum, 1); 
				else
					prevSum.put(currsum, count+1); 
			} 
			
			return res; 
		} 
		
		public static void main(String []args){ 
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();

			while(t-->0) {
				int n = sc.nextInt();
				int k = sc.nextInt();
				int a[] = new int[n];
				for(int i = 0 ; i < n; i++) {
					a[i] = sc.nextInt();
				}
				System.out.println(findSubarraySum(a, n, k)); 
			}
			
	
		} 
	} 
		
	// This code is contributed by Rituraj Jain 


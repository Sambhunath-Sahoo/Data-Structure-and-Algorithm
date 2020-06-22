package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SearchTriplate {

	 static void findTriplet(int arr[], int n) 
	    { 
	        Arrays.sort(arr); 

	        for (int i = n - 1; i >= 0; i--) { 
	            int j = 0; 
	            int k = i - 1; 
	            while (j < k) { 
	                if (arr[i] == arr[j] + arr[k]) { 
	  
	                    System.out.println(arr[i] + " "
	                                       + arr[j] + " " + arr[k]); 
	  
	                    return; 
	                } 
	                else if (arr[i] > arr[j] + arr[k]) 
	                    j += 1; 
	                else
	                    k -= 1; 
	            } 
	        } 
	  
	        System.out.println("-1"); 
	    } 
	 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		byte t = sc.nextByte();
		while(t-->0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			
	        findTriplet(a, n); 

		}
	}

}

package Sorting;

import java.util.Scanner;

public class mergeSort {
	
	
	void merge(int arr[], int l, int m, int r) 
	{ 
	    int i, j, k; 
	    int n1 = m - l + 1; 
	    int n2 = r - m; 
	  
	    int L[] = new int[n1]; 
        int R[] = new int[n2];
		
	    for (i = 0; i < n1; i++) 
	        L[i] = arr[l + i]; 
	    for (j = 0; j < n2; j++) 
	        R[j] = arr[m + 1 + j]; 
	    
	    
	    i = 0;  
	    j = 0;  
	    k = l; 
	    while (i < n1 && j < n2) { 
	        if (L[i] <= R[j]) { 
	            arr[k] = L[i]; 
	            i++; 
	        } 
	        else { 
	            arr[k] = R[j]; 
	            j++; 
	        } 
	        k++; 
	    } 
	    
	    while (i < n1) { 
	        arr[k] = L[i]; 
	        i++; 
	        k++; 
	    } 
	  
	    while (j < n2) { 
	        arr[k] = R[j]; 
	        j++; 
	        k++; 
	    } 
	}

	void sort(int arr[], int l, int r) 
    { 
        if (l < r) { 
            int m = (l + r) / 2; 
  
            sort(arr, l, m); 
            sort(arr, m + 1, r); 
  
            merge(arr, l, m, r); 
        } 
    } 
	
	   static void printArray(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i = 0; i < n; ++i) 
	            System.out.print(arr[i] + " "); 
	        System.out.println(); 
	    } 
	
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			int n = sc.nextInt();
			int a[] = new int[n]; 
			
			for(int i = 0; i < n ; i++)
				a[i] = sc.nextInt();
			
			mergeSort ob = new mergeSort(); 
	        ob.sort(a, 0, a.length-1); 

			printArray(a);
			
		}
	}

}

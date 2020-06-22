package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class pythagorianTriplate {

    static boolean isTriplet(int arr[], int n) 
    { 

        for (int i = 0; i < n; i++) 
            arr[i] = arr[i] * arr[i]; 
  
        Arrays.sort(arr); 
  

        for (int i = n - 1; i >= 2; i--) { 

            int l = 0; 
            int r = i - 1; 
            while (l < r) { 
                if (arr[l] + arr[r] == arr[i]) 
                    return true; 
  
                if (arr[l] + arr[r] < arr[i]) 
                    l++; 
                else
                    r--; 
            } 
        } 
  
        return false; 
    } 
	  
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		byte t = sc.nextByte();
		while(t-->0) {
			int n = sc.nextInt();
			int ar[] = new int[n];
			
			for(int i = 0; i < n; i++) {
				ar[i] = sc.nextInt();
			}
			
		    if (isTriplet(ar, n) == true) 
		        System.out.print("Yes"); 
		    else
		        System.out.print("No"); 
		} 
	}
}

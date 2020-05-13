package Array;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayEficientRotation {
	
	
	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
	    byte t = scan.nextByte();
	    while(t-- > 0) {
	      int n = scan.nextInt(), k = scan.nextInt()%n;
	      int[] arr = new int[n];
	      for(int j=0; j<n; j++)
	        arr[(j+k)%n] = scan.nextInt();
	      for(int j=0; j<n; j++)
	        System.out.print(arr[j]+" ");
	      System.out.println();
	      }
    }

}

package Array;

import java.io.IOException;
import java.util.Scanner;

public class peakElement {
	  public static void main(String args[]) throws IOException {

		   Scanner sc = new Scanner(System.in);
		    int no = sc.nextInt();
		    
		    while(no > 0){
		      
		      int n = sc.nextInt();
		      int a[] = new int[n];
		      
		      for (int i = 0; i < n; i++){
		        a[i] = sc.nextInt();
		      }
		      int j = 0;
		      if(a[j]>a[j+1]){
		        System.out.print(j+ " ");
		      }
		      for (int i = 1; i < n-1; i++){
		        if((a[i-1]<a[i]) && (a[i+1]<a[i])){
		          System.out.print(i + " ");
		        }
		      }
		      
		      int k = n-1;
		      if(a[k]>a[k-1]){
		        System.out.print(k + " ");
		      }
		      
		      System.out.println("");
		      no--;
		    }
		    
		  }
		}
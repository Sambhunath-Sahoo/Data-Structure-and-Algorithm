package Array;
import java.util.*;
import java.io.*;

public class ArrSum {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    while(n>0){
       int x=sc.nextInt();
       int a[] = new int[x];
       int sum = 0;
       for(int i = 0; i< a.length; i++){
    	  a[i] = sc.nextInt();
          sum += a[i];         
       }
      
      System.out.println(sum);
      n--;
      
    }
    }
  
  }

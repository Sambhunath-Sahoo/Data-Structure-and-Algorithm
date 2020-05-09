package introduction;

import java.util.*;
import java.io.*;

public class Main {
      public static int firstDigit(int n) 
    { 
        while (n >= 10)  
            n /= 10;  
        return n; 
    }  
   
  public static void main(String args[]) throws IOException {
    
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    
    while(x >0){
      int n = sc.nextInt();
       System.out.println(firstDigit(n));
    x--;
    }
  }
}
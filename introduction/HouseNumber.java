package introduction;

import java.util.*;
import java.io.*;

public class HouseNumber {
  public static void main(String args[]) throws IOException {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i=0,x,count=0;
    while(n>0){
      x = sc.nextInt();
      if(x >= 10){
        count = 9;
        for(i = 10;i <= x; i++){
          count += 2;
        }
      }
      if(x<10){
        count = 1;
        for(i=1; i <= x; i++){
          count += 1;
        }
      }
      System.out.println(count);
      n--;
    }
    
  }
}
package introduction;

import java.util.Scanner;

public class Leap {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	    //write your code here
	    int x = sc.nextInt();
	    while(x<3){
	    int a = sc.nextInt();
	    if (a%4==0){
	      System.out.println("Yes");
	    }else{
	      System.out.println("No");
	    }
	    }
	}

}

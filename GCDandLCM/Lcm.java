package GCDandLCM;

import java.util.Scanner;

public class Lcm {
	
	  static long gcd(long a, long b) 
	    { 
	    if (a == 0) 
	        return b;  
	    return gcd(b % a, a);  
	    } 
	    
	    static long lcm(long a, long b) 
	    { 
	        return (a*b)/gcd(a, b); 
	    } 


	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			long x = sc.nextInt();
			long y = sc.nextInt();
			
			System.out.println(lcm(x,y));
		}
	}
	
	

}

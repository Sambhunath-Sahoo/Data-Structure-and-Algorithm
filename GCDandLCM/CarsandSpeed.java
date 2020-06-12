package GCDandLCM;

import java.util.Scanner;

public class CarsandSpeed {

	static long gcd(long a,long b) {
		if(b==0)
			return a;
		return gcd(b, a%b);
	}
	
	static long lcm(long x, long y) {
		return (x*y)/gcd(x,y);
	}
	
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			long x = sc.nextLong();
			long y = sc.nextLong();
			long k = sc.nextLong();
			
			System.out.println(k/lcm(x,y));
		}
	

	}

}

package GCDandLCM;

import java.util.Scanner;

public class gcd2 {
	
	public static int gcd(int a, int b) {
		if(b==0)
			return a;
		return gcd(b,a%b);
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			System.out.println(gcd(x,y));
		}
	}

}

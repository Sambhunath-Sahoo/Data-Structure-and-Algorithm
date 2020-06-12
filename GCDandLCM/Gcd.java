package GCDandLCM;

import java.util.Scanner;

public class Gcd {
	
	public static int gcdr(int a, int b) {
		int d = 0;
		if(a==0){
			return b;
		}
		if(b==0){
			return a;
		}
		if(a==b) {
			return a;
		}
		
		if(a>b) {
			return gcdr(a-b,b);
		}else{
			return gcdr(a,b-a);
		}

	}	

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			System.out.println(gcdr(x,y));
		}
	}

}

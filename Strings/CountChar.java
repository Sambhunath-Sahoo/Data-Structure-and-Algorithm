package Strings;

import java.util.Scanner;

public class CountChar {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();

	while(t-->0) {
		int n = sc.nextInt();
		String str = sc.next();
		int d = 0, a = 0;
		for(int i =0; i < n;i++) {
			if(str.charAt(i) == 'A') {
				a +=1;
			}
			if(str.charAt(i) == 'D') {
				d +=1;
			}
		}
		if(a>d) {
			System.out.println("Aditya");
		}else if(d > a) {
			System.out.println("Danish");
		}else {
			System.out.println("AdiDan");
		}
		
	}
	
	}

}

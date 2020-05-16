package staticmethod;

import java.util.Scanner;

public class staticEx {
	static int sum(int x, int y) {
		return (x + y) ;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int r = staticEx.sum(n, m);
		System.out.println("the sum is : "+r);
	}

}

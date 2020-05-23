package TimeComplexcityAndRecursion;

import java.util.Scanner;

public class GCD {

	 public static int hcf(int n1, int n2)
	    {
	        if (n2 != 0)
	            return hcf(n2, n1 % n2);
	        else
	            return n1;
	    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		
		while(t-->0) {
			int n = sc.nextInt();
			int p = sc.nextInt();
			
			System.out.println(hcf(n,p));
		}
	}

}

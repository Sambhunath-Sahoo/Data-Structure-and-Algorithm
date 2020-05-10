package Array;

import java.util.Scanner;

public class missingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		while(n>0) {
			int no = sc.nextInt();
			int a[] = new int [no-1];
			
			for(int i = 0; i <a.length; i++) {
				a[i] = sc.nextInt();
			}
			
			int total=0;
			total = (no * (no+1)) / 2 ;
			for(int i = 0; i <a.length; i++) {
				total -= a[i];
			}
			System.out.println(total);
		n--;
		}
	}

}

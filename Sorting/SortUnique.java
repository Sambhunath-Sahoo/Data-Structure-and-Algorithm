package Sorting;

import java.util.Scanner;

public class SortUnique {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		byte t = sc.nextByte();
		while(t-->0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			
			int count = 1;
			int count2 = 1;
			for(int i = 0; i < n-1; i++) {
				if(a[i]<=a[i+1]) {
					count += 1;
				}else {
					break;
				}
			}
			
			
			for(int i = n -1; i > 0; i--) {
				if(a[i]>=a[i-1])
					count2 += 1;
				else {
					break;
				}
			}
			
			if(count == count2)
				System.out.println(count);
			else if(count > count2)
				System.out.println(count);
			else
				System.out.println(count2);
		}
	}

}

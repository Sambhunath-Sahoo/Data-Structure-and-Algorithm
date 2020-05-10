package Array;

import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n > 0) {
			int x = sc.nextInt();
			int arr[] = new int[x];
			
			for(int i=0;i<arr.length ;i++) {
				arr[i]=sc.nextInt();
			}
			
			for(int i=0;i<arr.length ;i++) {
				System.out.print(arr[i] + " ");
			}
			
			
			n--;
		}

	}

}

package Array;

import java.util.Scanner;

public class Mahasena {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, lucky = 0, unlucky = 0;
		n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0;i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			if(arr[i]%2==0) {
				lucky +=1;
			}else {
				unlucky +=1;
			}
		}
		if(lucky>unlucky) {
			System.out.println("READY FOR THE BATTLE");
		}else {
			System.out.println("NOT READY");
		}
		
	}

}

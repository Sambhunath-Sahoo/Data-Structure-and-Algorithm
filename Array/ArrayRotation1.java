package Array;

import java.util.Scanner;

public class ArrayRotation1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int temp[] = new int[d];
		int arr[] = {3,4,5,6,7,8};
		
		for(int i=0; i < d;i++) {
			temp[i] = arr[i];
		}
		for(int i=0; i < arr.length-d-1;i++) {
			arr[i] = arr[i+d];
		}
		int j=0;
		for(int i=arr.length - d - 1; i < arr.length;i++) {
			arr[i] = temp[j++];
		}
		
		System.out.println(arr);
	}

}

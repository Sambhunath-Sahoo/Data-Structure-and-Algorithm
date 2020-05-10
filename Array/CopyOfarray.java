package Array;

import java.util.Arrays;
import java.util.Scanner;

public class CopyOfarray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<arr.length ;i++) {
			arr[i]=sc.nextInt();
		}
		
		int arr2[] = arr;
		System.out.print("copied(assigned(same space in the memory) array is :\n");
		for(int i=0;i<arr2.length ;i++) {
			System.out.print(arr2[i] + " ");
		}
		
		int arr3[] = Arrays.copyOf(arr, arr.length);
		System.out.print("\ncopied(different space in the memory) array is :\n");
		for(int i=0;i<arr2.length ;i++) {
			System.out.print(arr2[i] + " ");
		}
		
		

	}

}

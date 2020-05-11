package Array;

import java.util.Arrays;

public class MajorityElement {

	public static void main(String[] args) {
		
		int arr[] = {7,2,7,3,7,2,7,7};
		int n = arr.length;
		
		Arrays.sort(arr);
		
		int major = arr[n/2];
		int count = 0;
		for(int i = 0;i < n; i++) {
			if (arr[i] == major) {
				count +=1;
			}
		}
		if(count > n/2) {
			System.out.println(major);
		}else {
			System.out.println("don't exist.");
		}
	}

}

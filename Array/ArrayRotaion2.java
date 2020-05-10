package Array;

public class ArrayRotaion2 {

	static int[] Rotate(int  arr[]) {
		int temp= arr[0];
		for(int i = 0; i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length - 1] = temp;
	return arr;	
	}
	
	public static void main(String[] args) {
		
		int d = 2;
		int arr[] = {3,4,5,6,7};
		
		for(int i:arr) {
			System.out.println(arr[i]);
		}

		for(int i = 0;i<d;i++) {
			Rotate(arr);
		}
		
		for(int i=0;i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
	}

}

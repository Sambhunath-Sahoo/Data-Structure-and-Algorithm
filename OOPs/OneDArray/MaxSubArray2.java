package OneDArray;

public class MaxSubArray2 {

	public static void main(String[] args) {
		int a[] = {1, 4, -2, 4, -1, 3, 5, -6};
		int n = a.length;
		int sum[] = new int[n];
		sum[0] = a[0];
		for(int i = 0 ; i < n ; i++) {
			sum[i] = sum[i+1] + a[i];
		}
		int max = Integer.MIN_VALUE;
		for(int i = 0 ; i < n ; i++) {
			for(int j = i ; j < n; j ++) {
				int cursum = sum[j] - sum[i] + a[i];
				if(cursum > max) {
					max = cursum;
				}
			}
		}
		 System.out.println("the maximum sum is " + max);

		

	}

}

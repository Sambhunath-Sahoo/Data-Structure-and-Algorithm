package OneDArray;

public class MaximumSumSubarray {

	public static void main(String[] args) {
		int a[] = {1, 4, -2, 4, -1, 3, 5, -6};
		int n = a.length;
		int max = Integer.MIN_VALUE;
		int i,j,k;
		for(i = 0; i < n ; i++);{
			for(j = i; j < n ; j++);{
				 int curSum = 0;
				 for(k = i; k <= j ; k++);{
					 curSum = curSum +  a[k];
				 }
				 if (curSum > max) {
					 max = curSum ;
				 }
			 }
		 }
		 System.out.println("the maximum sum is " + max);

	}

}

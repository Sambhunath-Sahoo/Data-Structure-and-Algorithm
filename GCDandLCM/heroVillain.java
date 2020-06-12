package GCDandLCM;

import java.util.Scanner;

public class heroVillain {

	static int min_element(int a[]) 
    { 
        int min = Integer.MAX_VALUE, i; 
        for (i = 0; i < a.length; i++)  
        { 
            if (a[i] < min) 
                min = a[i]; 
        }   
        return min; 
    } 
	
    static int findSmallest(int a[], int n)  
    { 
        int smallest = min_element(a); 
        int count = 1;
        int l = a.length;
        for (int i = 2; i <= smallest; i++)
        	if (a[i]%i==0)
        		count++; 
      
        return smallest; 
    }
	
	static long findGCD(long arr[], long n)
	{
		 long result = arr[0];
		 for (int i = 1; i < n; i++)
		 result = gcd(arr[i], result);
		 return result;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			
			int x = sc.nextInt();
			long a[]= new long[x];
			for(int i = 0; i < x; i++) {
				a[i] = sc.nextInt();
			}
			
			System.out.println(findGCD(a,x));
		}

	}

}

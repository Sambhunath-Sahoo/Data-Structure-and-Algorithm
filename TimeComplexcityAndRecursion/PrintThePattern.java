package TimeComplexcityAndRecursion;

import java.util.Scanner;

public class PrintThePattern {

	public static void pattern(int n) {        
		if (n == 0 || n < 0) { 
			System.out.print(n + " "); 
        return; 
		}
		
		System.out.print(n + " "); 
    
		pattern(n - 5); 

   
		System.out.print(n + " "); 
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			int n = sc.nextInt();
			
		pattern(n);
			
		}

	}

}

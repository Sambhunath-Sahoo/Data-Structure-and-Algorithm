package GCDandLCM;

import java.util.Scanner;

public class LargeGCD {
	
	private static int gcd(int reduceNum, int b) 
    { 
        return b == 0 ? reduceNum : gcd(b, reduceNum % b); 
    } 
    
    private static int reduceB(int a, String b)  
    { 
        int result = 0; 
        for (int i = 0; i < b.length(); i++)  
        { 
            result = (result * 10 + 
                      b.charAt(i) - '0') % a; 
        } 
        return result; 
    }
    
    private static int gcdLarge(int a, String b)  
    {  
        int num = reduceB(a, b);  
        return gcd(num, a); 
    }
    
    
	public static void main(String args) {

		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			int x = sc.nextInt();
			String s = sc.nextLine();
			if (x == 0) 
	            System.out.println(s); 
	        else
	            System.out.println(gcdLarge(x, s)); 
		}
	

	}

}

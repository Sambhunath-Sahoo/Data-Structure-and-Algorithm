package TimeComplexcityAndRecursion;

import java.util.Scanner;

public class Palindrome {

static boolean isPalindrome(String str) 
    { 
        int i = 0, j = str.length() - 1; 
        while (i < j) { 
  
            if (str.charAt(i) != str.charAt(j)) 
                return false; 
  
            i++; 
            j--; 
        } 
        return true; 
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String str = sc.next();
			if(isPalindrome(str)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}

	}

}

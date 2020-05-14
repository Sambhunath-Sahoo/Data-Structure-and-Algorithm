package Strings;

import java.util.Scanner;

public class SubSequence {
//	private static boolean isSubSequenceFound(String str1, String str2){
//        int j = 0;
//        for(int i = 0; i < str2.length(); i++){
//            if(str1.charAt(j) == str2.charAt(i)){
//                ++j;
//            }
//            if(){
//                return true;
//            }
//        }
//        return false;
//    }

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int count = 0;
		while(t-->0) {
			String str2 = sc.next();
			String str1 = sc.next();
			
			int j = 0;
	        for(int i = 0; i < str2.length(); i++){
	            if(str1.charAt(j) == str2.charAt(i)){
	                ++j;
	            }
	            if(j == str1.length()) {
					System.out.print("YES");
				}else {
					System.out.print("NO");
				}
	        }
				
			}
	    
	}

}

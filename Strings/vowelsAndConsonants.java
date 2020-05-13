package Strings;

import java.util.Scanner;

public class vowelsAndConsonants {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();

	while(t-->0) {
		String str= sc.next();
		int vow = 0, cons = 0;
		for(int i =0; i< str.length(); i++) {
			char ch = str.charAt(i);
			if (ch== 'A'||ch== 'E'||ch== 'I'||ch== 'O'||ch== 'U') {
				vow += 1;
			}else {
				cons +=1;
			}
		}
		
		System.out.println(vow+" "+cons);
		
		
	}
	
	}

}

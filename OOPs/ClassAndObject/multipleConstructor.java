package ClassAndObject;

import java.util.Scanner;

public class multipleConstructor {
	int a;
	int b;
	multipleConstructor(){
		a = 5;
		b = 2;
		System.out.println("the sum is : "+(a+b));
	}
	multipleConstructor(int x, int y){
		a = x;
		b = y;
		int z = x + y;
		System.out.println("the sum is : "+z);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int q = sc.nextInt();
		multipleConstructor m = new multipleConstructor(p,q);
		multipleConstructor n = new multipleConstructor();
	}

}

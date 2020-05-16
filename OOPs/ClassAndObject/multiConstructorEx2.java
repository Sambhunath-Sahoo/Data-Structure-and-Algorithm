package ClassAndObject;

import java.util.Scanner;

public class multiConstructorEx2 {
	int radius;
	int height;
	int width;
	multiConstructorEx2(int rad) {
		radius = rad;
		System.out.println("the area of the circle is : "+ 3.14*radius*radius);
	}
	multiConstructorEx2 (int h, int w){
		height = h;
		width = w;
		System.out.println("the area of the reactangle is : "+ height*width);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		multiConstructorEx2 rd = new multiConstructorEx2(r);
		int hi = sc.nextInt();
		int wi = sc.nextInt();
		multiConstructorEx2 ar = new multiConstructorEx2(hi, wi);
	}

}

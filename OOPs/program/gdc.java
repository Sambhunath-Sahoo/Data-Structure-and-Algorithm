package program;

import java.util.*;

public class gdc {
	static int gdc(int x, int y){
		if(x == 0 ) {
			return y;
		}
		if(y == 0 ) {
			return x;
		}
		if(x > y) {
			return gdc(x-y,y);
		}
		else {
			return gdc(x,y-x);
		}
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
	
	System.out.println("the GDC of "+x+" and "+y+" is "+ gdc(x,y));
	}

}

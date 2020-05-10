package polymorphism;

public class sample {
	int x, y, z;
	void add(int a,int b) {
		x = a;
		y = b;
		System.out.println(x*y);
	}
	void add(int a,int b,int c) {
		x = a;
		y = b;
		z = c;
		System.out.println(x + y + y);
	}

	public static void main(String[] args) {

		sample s = new sample();
		s.add(2,5);
		s.add(2, 5, 6);
		
	}

}

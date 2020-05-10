package polymorphism;
class poli{
	void calculate(double x) {
		System.out.println("square is " + x*x);
	}
}

class mac extends poli{
	void calculate(double y) {
		super.calculate(y);
		System.out.println("root is " + Math.sqrt(y));
	}
}
public class methodOveriding {

	public static void main(String[] args) {
		
		mac m = new mac();
		m.calculate(5.0);

	}

}

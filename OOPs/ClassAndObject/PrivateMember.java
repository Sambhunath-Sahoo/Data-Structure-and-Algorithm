package ClassAndObject;

public class PrivateMember{
	private int rollno = 101;
	private int age =19;

		void show() {
			System.out.println(rollno);
			System.out.println(age);
		}
		
public static void main(String[] args) {
		
	PrivateMember pm = new PrivateMember();
	pm.show();

}



}

package ClassAndObject;

class person{
	String name = "vicky";
	int age = 28;
	
		void get() {
			System.out.println("the name is "+ name +" and the age is "+ age);
		}
}

public class PersonClass {

	public static void main(String[] args) {
		
		person p = new person();
		p.get();
		
	}

}
 
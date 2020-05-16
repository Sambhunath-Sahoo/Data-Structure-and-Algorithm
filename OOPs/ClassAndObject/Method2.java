package ClassAndObject;
import java.util.*;
public class Method2 {
	String name = "sambhu" ;
	int rollno = 46;
	int age = 18;
	
	void set() {
		System.out.println("name : "+ name + "\nage : " +age  + "\n rollno : " + rollno);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int rollno = sc.nextInt();
		int age = sc.nextInt();
		Method2 st = new Method2();
		st.set();
		

	}

}

package inheritance;
import java.util.*;
class A{
	int rollno; 
	int age;
}
public class inherit  extends A{
	int total;
	
	void get() {
		Scanner sc = new Scanner(System.in);
		rollno = sc.nextInt();
		age = sc.nextInt();
		total = sc.nextInt();
	}
	
	void show() {
		System.out.println(rollno+" "+age+" "+total);
	}

	public static void main(String[] args) {
		Ex1 obj = new Ex1();
		obj.get();
		obj.show();
	

	}

}

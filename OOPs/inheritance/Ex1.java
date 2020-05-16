package inheritance;

class B{
	int rollno; 
	int age;
}
public class Ex1  extends B{
	int total;
	
	void get() {
		rollno = 10;
		age = 18;
		total = 34;
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

package ClassAndObject;

import java.util.Scanner;

public class ConstructorEx1 {
	 int empId = 50;
	 String empName = "vishal";
	
	ConstructorEx1(String N,int id){
		empId = id;
		empName = N;
	}
	void set() {
		System.out.println("the name of the employe is "+ empName +" and id is "+ empId);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String empName = sc.nextLine();
		int empId = sc.nextInt();
		ConstructorEx1 Ex = new ConstructorEx1(empName, empId);
		Ex.set();

	}

}

package ClassAndObject;

public class Constructor {
	int rollno=46 ;
	int age = 19;
	Constructor(){
		
	}
	void show() {
		System.out.println(rollno +" " + age);
	}



	public static void main(String[] args) {
		
		Constructor st = new Constructor();
		st.show();
		
	}

}

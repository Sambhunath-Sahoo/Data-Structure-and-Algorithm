package staticK;

public class StaticMethod {
	int x;
	static String y="hello";
	public void show() {
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		StaticMethod obj = new StaticMethod();
		obj.show();
	}

}

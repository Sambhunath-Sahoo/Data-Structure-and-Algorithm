package inheritance;
class One{
	int i = 10;
	void show() {
		System.out.println(i);
	}
}

class Two extends One{
	int i = 20;
	void show() {
		System.out.println(i);
		System.out.println(super.i);
	}
}
public class superclass {

	public void main(String[] args) {
		Two obj = new Two();
		obj.show();
	}

}


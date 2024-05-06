package inheritance;

public class child extends parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent obj = new child();
		obj.walk();

	}
	public void walk() {
		super.walk();
		System.out.println("dont walk");
	}
	

}

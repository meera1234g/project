package inheritance;

public class superhi extends samplenewone {
	public void print() {
		displayAge();
		super.displayAge();
	}
	
	public void displayAge() {
		System.out.println("hello meera");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
superhi obj = new superhi();
obj.print();
	}

}

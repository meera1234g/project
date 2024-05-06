package Interface;

public class Interphasechild implements Interfaceparent,Interpace2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interphasechild obj = new Interphasechild();
		obj.display();
		obj.jump();
		
	}

	public void display() {
		System.out.println("hello");
	}
 public void jump() {
	 System.out.println("hai");
 }
}

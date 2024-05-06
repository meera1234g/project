package Interface;

public class Sampleint implements Interface1{
	 public void bark() {
		System.out.println("Bark"); 
	 }
	 public void kick() {
		 System.out.println("kick");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sampleint obj = new Sampleint();
		obj.bark();
		obj.kick();

	}

}

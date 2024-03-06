package inheritance;

public class Dog extends Animal {
	public void bark() {
		System.out.println("Hello");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog obj = new Dog();
		obj.sound();
		System.out.println(obj.color);
		obj.bark();

	}

}

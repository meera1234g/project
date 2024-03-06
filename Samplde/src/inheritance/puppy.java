package inheritance;

public class puppy extends Dog{
	public void food() {
		System.out.println("Food");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		puppy obj = new puppy();
		System.out.println(obj.s);
		System.out.println(obj.color);
		obj.bark();
		obj.food();

	}

}

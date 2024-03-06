package inheritance;

public class Cat extends Animal {
	public void Sample() {
		System.out.println("Hey");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Cat obj = new Cat();
	obj.Sample();
	System.out.println(obj.color);
	System.out.println(obj.s);
	}

}

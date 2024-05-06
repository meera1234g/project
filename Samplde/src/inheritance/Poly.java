package inheritance;

public class Poly {
	
	public void display(int a) {
		System.out.println("Hello");
	}
	 
	public void display() {
		System.out.println("hai");
	}
	
	public void display( int a, int b) {
		System.out.println("thengakola");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Poly obj =  new Poly();
		obj.display(4);
		obj.display();
		obj.display(6);
		obj.display(5,6);

		
	}

}
// In this polymorphism with overloading is done it is runtime polymorphism
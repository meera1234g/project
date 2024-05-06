package Abstraction;

public class Learn extends Study{
	
	public  void book() {
		System.out.println(" I am fed up");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Learn obj = new Learn();
		obj.book();
        obj.comic();
	}

}

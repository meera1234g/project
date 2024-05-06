package inheritance;

public class Childc extends Parentc {
	
	public void jump() {
		System.out.println( "jump ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Childc obj = new Childc();
		obj.jump();
		obj.thenga();
		obj.manga(8);
	}

}

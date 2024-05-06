package inheritance;

public class Jump extends Walking {
	
	public static void jump() {
		System.out.println( "please jump");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jump obj = new Jump();
		
obj.walk();
System.out.println(obj.s);
	}

}

package inheritance;

public class Son extends Father{
	public void sonlove() {
		System.out.println("Sons love ");
	}
	
	String two = "i m son";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String two = "i m son";
		Son obj = new Son();
		System.out.println(obj.colour);
		System.out.println(obj.two);
	
		System.out.println(obj.one);
		obj.sonlove();

	}

}

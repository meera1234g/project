package inheritance;

public class Grandson  extends Son {
	public void dark() {
		System.out.println("GRreat");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grandson obj = new Grandson();
		System.out.println(obj.colour);
		System.out.println(obj.one);
		 System.out.println(obj.two);
		obj.dark();
		obj.sonlove();

	}

}

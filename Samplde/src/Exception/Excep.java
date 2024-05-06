package Exception;

public class Excep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 3;
		int b = 0;
		
		try {
		int c = a/b;
		System.out.println(c);
		}
		
/*catch(ArithmeticException c) { // class inbuild
	System.out.println("Error");
}*/
		
		finally {
			System.out.println(" executed once");
			
		}
	}

}

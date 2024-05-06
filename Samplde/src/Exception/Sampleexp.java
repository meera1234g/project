package Exception;

public class Sampleexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		int b = 6;
		int c = 0;
		int d = a+b;
		
		try {
		int e = d/c;
		System.out.println( e);

	}
 finally {
	System.out.println(" Once executed");
}
}}

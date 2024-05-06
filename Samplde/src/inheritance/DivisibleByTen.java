package inheritance;


	public class DivisibleByTen extends Addition {
	    boolean isDivisibleByTen(int a, int b) {
	        int sum = super.add(a, b); // using super keyword to call the method from the superclass
	        return sum % 10 == 0;
	    }
	}



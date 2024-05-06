package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 
		        int num1 = 25;
		        int num2 = 15;
		        
		        DivisibleByTen obj = new DivisibleByTen();
		        int result = obj.add(num1, num2);
		        boolean isDivisible = obj.isDivisibleByTen(num1, num2);
		        
		        System.out.println("Addition result: " + result);
		        if (isDivisible)
		            System.out.println("The addition result is divisible by 10.");
		        else
		            System.out.println("The addition result is not divisible by 10.");
		    }
	

	}


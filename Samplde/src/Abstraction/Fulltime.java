package Abstraction;

public class Fulltime extends Contract {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fulltime obj = new Fulltime();
		obj.calculateSalary();
	
	}
	

public void calculateSalary() {
	super.calculateSalary();
	int salary = 8000;
	int hours = 8;
	int total = salary * hours;
	System.out.println("The Salary of fulltime employee is " +total);
	
}



}

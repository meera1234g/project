package inheritance;

import java.util.Scanner;

public class hra extends Salary{

		
		 public double calculateHRA(double basicPay) {
		        return 0.05 * basicPay;
		    }

		    public double calculatePF(double basicPay) {
		        return 0.20 * basicPay;
		    }

		    public double calculateTotalSalary(double basicPay, double deduction, double bonus) {
		        double hra = calculateHRA(basicPay);
		        double pf = calculatePF(basicPay);
		        return basicPay + hra - pf - deduction + bonus;
		    

	

}}

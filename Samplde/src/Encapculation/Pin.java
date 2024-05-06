package Encapculation;

import java.util.Scanner;

class Bank {
	private int pin;
	 
	 public void setPin (int pin) {
		 this.pin = pin;
		 }
	public boolean getPin() 
	{
		if (pin == 1001|| pin == 1234 || pin == 1212) 
			{
			System.out.println("valid pin");
			return true;
			}
	   else { 
			 System.out.println("Invalid pin");
			 return false;
	        }
     }
            }
 
 
 public class Pin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank obj = new Bank();
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your PIN: ");
        int pinuser = scanner.nextInt();
		obj.setPin(pinuser);
		obj.getPin();
		}}

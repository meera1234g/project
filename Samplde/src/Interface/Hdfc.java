package Interface;

public  class Hdfc implements Rbi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hdfc obj = new Hdfc();
		obj.recuriingDeposit(1000,3);
		

	}

	

	
@Override
public void recuriingDeposit(int amount, int duration) {
	// TODO Auto-generated method stub
	int si =((amount *  duration  * interest)/ (12*100) ) ;
	int newamout = amount + si;
	
	System.out.println("The new amount is "  + newamout);
}
}

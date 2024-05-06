package Exception;

public class Eceptionnew {

int age;
	
	public static void main(String[] args) throws VotingExcep {
        Eceptionnew obj = new Eceptionnew();
        obj.hellovoting(2);
	}
	public void hellovoting(int age) throws VotingExcep {
		if (age > 18) {
			System.out.println("Eligible");
		}
		else {
			throw new VotingExcep("Error");
	}
	

	}}



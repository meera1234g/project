package Exception;

public class Throwsexep {
	


		public static void main(String[] args) throws VotingExcep {
			// TODO Auto-generated method stub
			Throwsexep  obj = new Throwsexep ();
			obj.display(19);
		}
public void display(int age) throws VotingExcep {
	if ( age<18) {
		throw new VotingExcep("There is an error");
	}
		else{
			System.out.println("Eligible");
		}
	}
		}





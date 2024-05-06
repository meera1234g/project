package Collections;


		
		import java.util.ArrayList;
		
import java.util.List;

		public class List2 {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
					List<String> s = new ArrayList<String>();
					{
					s.add("meera");
					s.add("Raj");
					s.add("meera");
					int firstoccurance = s.indexOf("meera");
					System.out.println(firstoccurance);
					int lastoccurance = s.lastIndexOf("meera");
					System.out.println(lastoccurance);
					
				

	}

}}

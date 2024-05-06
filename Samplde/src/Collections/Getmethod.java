package Collections;

import java.util.ArrayList;
import java.util.List;

public class Getmethod {


	    public static void main(String[] args) {
	     
	        List<String> obj = new ArrayList<String>();
	        obj.add("Meera");
	        obj.add("Boby");
	        obj.add("Cst");

	      
	        String s = obj.get(1);


	        System.out.println("The element at index 1 is: " + s);
	    }
	}




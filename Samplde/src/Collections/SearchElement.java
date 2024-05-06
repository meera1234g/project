package Collections;

import java.util.ArrayList;
public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

		   
		        ArrayList<String> arrayList = new ArrayList<>();
		        
		        // Add elements to the ArrayList
		        arrayList.add("Apple");
		        arrayList.add("Banana");
		        arrayList.add("Orange");
		        arrayList.add("Grapes");
		        
		        // Element to search
		        String searchElement = "Orange";
		        
		        // Search for the element in the ArrayList
		        if (arrayList.contains(searchElement)) {
		            System.out.println(searchElement + " found at index " + arrayList.indexOf(searchElement));
		        } else {
		            System.out.println(searchElement + " not found in the ArrayList.");
		        }
		    }
	


	}



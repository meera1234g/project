package Collections;
import java.util.ArrayList;
public class RetrieveElement {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
	
		        ArrayList<Integer> myList = new ArrayList<>();
		        myList.add(1);
		        myList.add(2);
		        myList.add(3);
		        myList.add(4);
		        myList.add(5);
		        
		        int index = 2;
		        Integer result = retrieveElement(myList, index);
		        if (result != null) {
		            System.out.println("Element at index " + index + ": " + result);
		        }
		    }

		    public static Integer retrieveElement(ArrayList<Integer> arrayList, int index) {
		        // Check if index is within the bounds of the array list
		        if (index < 0 || index >= arrayList.size()) {
		            System.out.println("Index out of bounds");
		            return null;
		        } else {
		            return arrayList.get(index);
		        }
		    }
	

	}



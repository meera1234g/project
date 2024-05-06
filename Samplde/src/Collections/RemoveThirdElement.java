package Collections;
import java.util.ArrayList;
public class RemoveThirdElement {




	
		    public static void main(String[] args) {
		        // Create an ArrayList
		        ArrayList<String> arrayList = new ArrayList<>();
		        
		        // Add elements to the ArrayList
		        arrayList.add("Apple");
		        arrayList.add("Banana");
		        arrayList.add("Orange");
		        arrayList.add("Grapes");
		        
		        // Remove the third element from the ArrayList
		        if (arrayList.size() >= 3) {
		            arrayList.remove(2);
		            System.out.println("Third element removed successfully.");
		        } else {
		            System.out.println("ArrayList does not contain a third element.");
		        }
		        
		        // Print the ArrayList after removal
		        System.out.println("ArrayList after removing the third element:");
		        for (String element : arrayList) {
		            System.out.println(element);
		        }
		    }
	


	
}

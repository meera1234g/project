package Collections;
import java.util.HashSet;
import java.util.Set;
public class Setnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	
		        Set<String> set = new HashSet<>();

		        // Adding elements to the set
		        set.add("Apple");
		        set.add("Banana");
		        set.add("Orange");
		        set.add("Apple"); // Adding a duplicate element

		        System.out.println(set);
		        System.out.println("Contains 'Banana': " + set.contains("Banana"));
		        System.out.println("Contains 'Grapes': " + set.contains("Grapes"));

		        // Removing an element from the set
		        set.remove("Banana");
		        System.out.println("Set after removing 'Banana': " + set);

		        // Iterating over the set
		        System.out.println("Iterating over the set:");
		        for (String element : set) {
		            System.out.println(element);
		        }

		        // Checking if the set is empty
		        System.out.println("Is the set empty? " + set.isEmpty());

		        // Getting the size of the set
		        System.out.println("Size of the set: " + set.size());

		        // Clearing the set
		        set.clear();
		        System.out.println("Set after clearing: " + set);
		    }
		
}

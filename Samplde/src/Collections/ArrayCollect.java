package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> Y = new ArrayList<String>();{
        Y.add("Apple");
        Y.add("Orange");
        Y.add("plum");
		}
		
		 ArrayList<String> obj = new ArrayList<String>();{
	        obj.add("Meera");
	        obj.add("Boby");
	        obj.add("Cst");

	      boolean a = obj.contains("Meera");// To check if it contains a specified string
	      System.out.println(a);
	      boolean b = obj.isEmpty();
	      System.out.println(b);
	      String p = obj.get(1);
	      System.out.println(p);
	      String n1 = obj.remove(1);
	      System.out.println(n1);
	      
	      Iterator<String> it = obj.iterator();
	      while(it.hasNext()) 
	      {
	    	  System.out.println(it.next());
	    	  //System.out.println(it.remove());
	      }
	    		 
	}
Y.addAll(obj);
System.out.println(Y);
//System.out.println(it.remove(h));
System.out.println(obj.size());
}
}
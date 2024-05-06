package Collections;

import java.util.ArrayList;

public class ArraylistSam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> obj = new ArrayList<String>();{
	obj.add("Meera");
	obj.add("Jeena");
	obj.add("Meera");

System.out.println(obj.contains("Meera"));
System.out.println(obj.isEmpty());
System.out.println(obj.get(1));
//System.out.println(obj.remove(0));
System.out.println(obj.get(0));
System.out.println(obj.size());
System.out.println(obj);	}


ArrayList <String> y = new ArrayList<String>();{
	y.add("Simi");
y.addAll(obj);
System.out.println(y);
}}}
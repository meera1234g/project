package inheritance;

public class TestCircle {
	


	    public static void main(String[] args) {
	        // Create a Circle object with a radius of 5
	        Circle myCircle = new Circle(5);

	        // Print the area of the circle
	        System.out.println("Area of the circle: " + myCircle.getArea());

	        // Attempt to set a new radius
	        myCircle.setRadius(10);

	        // Print the new area of the circle
	        System.out.println("New area of the circle: " + myCircle.getArea());
	    }
	}






package inheritance;

public class Circle {
	

	    // Private field to prevent direct access
	    private double radius;

	    // Constructor to initialize the radius of the circle
	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    // Setter method for radius
	    public void setRadius(double radius) {
	        if (radius > 0) {
	            this.radius = radius;
	        } else {
	            System.out.println("Radius must be positive");
	        }
	    }

	    // Method to calculate and return the area of the circle
	    public double getArea() {
	        return Math.PI * radius * radius;
	    }
	}


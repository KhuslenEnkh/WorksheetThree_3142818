//Khuslen Enkh-Amgalan, ID:3142818, 19/03/2025
package griffith;

public class Circle extends Shape {

	private double radius;

    //Constructor
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    //Getter and Setter for radius.
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
    	return Math.PI * radius * radius;  //Implemented area method.
    }

    @Override
    public double perimeter() {
    	return 2 * Math.PI * radius; //Implemented perimeter method.
    }

    // Override toString
    @Override
    public String toString() {
        return super.toString() + ", Radius: " + radius;
    }
}

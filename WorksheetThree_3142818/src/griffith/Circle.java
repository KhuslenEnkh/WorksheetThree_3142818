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

    //Calculates the area of the circle.
    @Override
    public double area() {
    	return Math.PI * radius * radius;  //Implemented area method.
    }

    //Calculates the perimeter of the circle.
    @Override
    public double perimeter() {
    	return 2 * Math.PI * radius; //Implemented perimeter method.
    }

    //Calculates the area of the circle.
    @Override
    public String toString() {
        return super.toString() + ", Radius: " + radius;
    }
}

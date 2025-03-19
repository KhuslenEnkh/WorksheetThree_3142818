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
        return 0; 
    }

    @Override
    public double perimeter() {
        return 0; 
    }

    // Override toString
    @Override
    public String toString() {
        return super.toString() + ", Radius: " + radius;
    }
}

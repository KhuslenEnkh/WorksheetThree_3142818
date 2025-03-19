//Khuslen Enkh-Amgalan, ID:3142818, 19/03/2025
package griffith;

public class RightAngledTriangle extends Shape {

	private double base;
    private double height;

    //Constructor
    public RightAngledTriangle(double base, double height) {
        super("Right-Angled Triangle");
        this.base = base;
        this.height = height;
    }

    //Getters and Setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
    	return (base * height) / 2;
    }

    @Override
    public double perimeter() {
    	double hypotenuse = Math.sqrt(base * base + height * height);
        return base + height + hypotenuse;
    }

    // Override toString
    @Override
    public String toString() {
        return super.toString() + ", Base: " + base + ", Height: " + height;
    }
}

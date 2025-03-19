//Khuslen Enkh-Amgalan, ID:3142818, 19/03/2025
package griffith;

public class Rhombus extends Shape {
	
    private double diagonal1;
    private double diagonal2;
    private double side;

    //Constructor
    public Rhombus(double diagonal1, double diagonal2, double side) {
        super("Rhombus");
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.side = side;
    }

    //Getters and Setters
    public double getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    //Calculates the area of the rhombus.
    @Override
    public double area() {
    	return (diagonal1 * diagonal2) / 2;
    }

    //Calculates the perimeter of the rhombus.
    @Override
    public double perimeter() {
    	return 4 * side;
    }

    //Returns a string representation of the rhombus.
    @Override
    public String toString() {
        return super.toString() + ", Diagonals: " + diagonal1 + " & " + diagonal2 + ", Side: " + side;
    }
}

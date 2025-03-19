//Khuslen Enkh-Amgalan, ID:3142818, 19/03/2025
package griffith;

public abstract class Shape {
	
    private String name;
	
    //Constructor
    public Shape(String name) {
        this.name = name;
    }

    //Getter and Setter for name.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Abstract method to calculate area.
    public abstract double area();
    //Abstract method to calculate perimeter.
    public abstract double perimeter();

    //Returns a string representation of the shape.
    @Override
    public String toString() {
        return "Shape: " + name;
    }
}

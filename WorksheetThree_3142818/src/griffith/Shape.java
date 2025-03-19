//Khuslen Enkh-Amgalan, ID:3142818, 19/03/2025
package griffith;

public abstract class Shape {
	
	private String name;

    //Constructor
    public Shape(String name) {
        this.name = name;
    }

    //Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Abstract methods
    public abstract double area();
    public abstract double perimeter();

    //toString method
    @Override
    public String toString() {
        return "Shape: " + name;
    }
}

//Khuslen Enkh-Amgalan, ID:3142818, 19/03/2025
package griffith;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ShapeTest {

    private static final double EPSILON = 0.0;
	
    @Test
    void testCircle() {
        Circle circle = new Circle(3.5);

        assertEquals(3.5, circle.getRadius(), EPSILON);
        assertEquals(Math.PI * 3.5 * 3.5, circle.area(), EPSILON);
        assertEquals(2 * Math.PI * 3.5, circle.perimeter(), EPSILON);
        assertEquals("Shape: Circle, Radius: 3.5", circle.toString());
    }
    
    @Test
    void testRhombus() {
        Rhombus rhombus = new Rhombus(6, 8, 5);

        assertEquals(6, rhombus.getDiagonal1(), EPSILON);
        assertEquals(8, rhombus.getDiagonal2(), EPSILON);
        assertEquals(5, rhombus.getSide(), EPSILON);
        assertEquals((6 * 8) / 2, rhombus.area(), EPSILON);
        assertEquals(4 * 5, rhombus.perimeter(), EPSILON);
        assertEquals("Shape: Rhombus, Diagonals: 6.0 & 8.0, Side: 5.0", rhombus.toString());
    }
    
    @Test
    void testRightAngledTriangle() {
        RightAngledTriangle triangle = new RightAngledTriangle(3, 4);

        assertEquals(3, triangle.getBase(), EPSILON);
        assertEquals(4, triangle.getHeight(), EPSILON);
        assertEquals((3 * 4) / 2, triangle.area(), EPSILON);
        assertEquals(3 + 4 + Math.sqrt(3 * 3 + 4 * 4), triangle.perimeter(), EPSILON);
        assertEquals("Shape: Right-Angled Triangle, Base: 3.0, Height: 4.0", triangle.toString());
    }
    
    //Integration Test with ArrayList<Shape> shapes
    @Test
    void testShapeList() {
        ArrayList<Shape> shapes = new ArrayList<>();

        // Add two of each shape
        shapes.add(new Circle(2.5));
        shapes.add(new Circle(4.0));

        shapes.add(new Rhombus(5, 7, 4));
        shapes.add(new Rhombus(8, 10, 6));

        shapes.add(new RightAngledTriangle(5, 12));
        shapes.add(new RightAngledTriangle(6, 8));

        // Loop through and test area and perimeter
        for (Shape shape : shapes) {
            assertTrue(shape.area() > 0, "Area should be positive");
            assertTrue(shape.perimeter() > 0, "Perimeter should be positive");
        }
    }
}

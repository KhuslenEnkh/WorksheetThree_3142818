//Khuslen Enkh-Amgalan, ID:3142818, 19/03/2025
package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapeTest {

	private static final double EPSILON = 0.0;

    // Unit Test for Circle
    @Test
    void testCircle() {
        Circle circle = new Circle(3.5);

        assertEquals(3.5, circle.getRadius(), EPSILON);
        assertEquals(Math.PI * 3.5 * 3.5, circle.area(), EPSILON);
        assertEquals(2 * Math.PI * 3.5, circle.perimeter(), EPSILON);
        assertEquals("Shape: Circle, Radius: 3.5", circle.toString());
    }
}

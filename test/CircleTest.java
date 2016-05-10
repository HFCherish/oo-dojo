import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {
    @Test
    public void shouldReturnCorrectArea () {
        Circle circle = new Circle(2);
        double area = circle.area();
        assertEquals( area, Math.PI * 4, 0.001 );
    }

    @Test
    public void shouldReturnCorrectPerimeter() {
        Circle circle = new Circle(2);
        double perimeter = circle.perimeter();
        assertEquals(perimeter, 2 * Math.PI * 2, 0.001);
    }
}

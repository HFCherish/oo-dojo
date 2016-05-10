import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class RectangleTest {

    @Test
    public void shouldReturnCorrectArea() {
        Rectangle rectangle = new Rectangle(2, 2);
        int area = rectangle.area();
        assertEquals(area, 4);
    }

    @Test
    public void shouldReturnCorrectPerimeter() {
        Rectangle rectangle = new Rectangle(1, 5);
        int perimeter = rectangle.perimeter();
        assertEquals(perimeter, 12);
    }

    @Test
    public void shouldReturnCorrectPerimeterWhenCreateSquareUsed() {
        Rectangle square = Rectangle.createSquare(2);
        assertEquals( square.perimeter(), 8 );
    }

    @Test
    public void shouldReturnTrueWhenIsSquareIsCalledOnASquare() {
        Rectangle square = Rectangle.createSquare(2);
        assertThat(square.isSquare(), is(true));
    }


}

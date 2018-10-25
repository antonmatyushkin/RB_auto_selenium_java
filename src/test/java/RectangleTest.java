import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    Rectangle rectangle = new Rectangle();

    @Test
    public void testRectangleArea(){
        assertEquals(25.0, rectangle.rectangleArea(5.0, 5.0));
    }

    @Test
    public void testRectanglePerimeter() {
        assertEquals(10.0, rectangle.rectanglePerimeter(2.0, 3.0));
    }
}

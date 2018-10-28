import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TriangleTest {

    Triangle triangle = new Triangle();

    @Test
    public void testTriangleArea() {
        assertEquals(6.0, triangle.triangleArea(3.0, 2.0, 7.0), 0.0);
    }

    @Test
    public void testTrianglePerimeter() {
        assertEquals(9.0, triangle.trianglePerimetr(2.0, 3.0, 4.0), 0.0);
    }


}

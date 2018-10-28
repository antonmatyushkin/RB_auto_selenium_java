import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class RectangleTest {

    Rectangle rectangle = new Rectangle();

    @Test
    public void testRectangleArea() {
        assertEquals(25.0, rectangle.rectangleArea(5.0, 5.0), 0.0);
    }

    @Test
    public void testRectanglePerimeter() {
        assertEquals(10.0, rectangle.rectanglePerimeter(2.0, 3.0), 0.0);
    }

    @Test(expected = MyException.class)
    public void rectangleAreaFirstArgumentIsNegativeTest() {
        new Rectangle().rectangleArea(-5.0, 2.0);
    }

    @Test(expected = MyException.class)
    public void rectangleAreaSecondArgumentIsNegativeTest() {
        new Rectangle().rectangleArea(3.0, -2.0);
    }

    @Test(expected = MyException.class)
    public void rectangleAreaFirstArgumentIsNullTest() {
        new Rectangle().rectangleArea(0.0, 2.0);
    }

    @Test(expected = MyException.class)
    public void rectangleAreaSecondArgumentIsNullTest() {
        new Rectangle().rectangleArea(4.0, 0.0);
    }

    @Test(expected = MyException.class)
    public void rectanglePerimeterFirstArgumentIsNegativeTest() {
        new Rectangle().rectanglePerimeter(-5.0, 2.0);
    }

    @Test(expected = MyException.class)
    public void rectanglePerimeterSecondArgumentIsNegativeTest() {
        new Rectangle().rectanglePerimeter(3.0, -2.0);
    }

    @Test(expected = MyException.class)
    public void rectanglePerimeterFirstArgumentIsNullTest() {
        new Rectangle().rectanglePerimeter(0.0, 2.0);
    }

    @Test(expected = MyException.class)
    public void rectanglePerimeterSecondArgumentIsNullTest() {
        new Rectangle().rectanglePerimeter(4.0, 0.0);
    }

    @Test
    public void testExceptionMessage() {
        try {
            new Rectangle().rectangleArea(-5.0, 2.0);
            fail("Expected an MyException to be thrown");
        } catch ( MyException e ) {
            assertThat(e.getMessage(), is("Стороны прямоугольника не могут быть отрицательными!"));
        }
    }
}

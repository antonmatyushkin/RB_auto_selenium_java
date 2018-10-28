import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CircleTest {

    Circle circle = new Circle();

    @Test
    public void testCircleArea() {
        assertEquals(78.54, circle.circleleArea(5.0), 0.05);
    }

    @Test(expected = MyException.class)
    public void circleAreaRadiusIsNegativeTest() {
        new Circle().circleleArea(-5.0);
    }

    @Test
    public void testExceptionMessage() {
        try {
            new Circle().circleleArea(-5.0);
            fail("Expected an MyException to be thrown");
        } catch ( MyException e ) {
            assertThat(e.getMessage(), is("Радиус круга не может быть отрицательными!"));
        }
    }
}

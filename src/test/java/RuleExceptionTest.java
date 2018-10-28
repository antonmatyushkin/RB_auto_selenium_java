import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RuleExceptionTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldTestExceptionMessage(){
        Rectangle rectangle = new Rectangle();
        thrown.expect(MyException.class);
        thrown.expectMessage("Стороны прямоугольника не могут быть отрицательными!");
        rectangle.rectangleArea(-1.0, 4.5);
        rectangle.rectanglePerimeter(2.5, 3.9);
    }
}

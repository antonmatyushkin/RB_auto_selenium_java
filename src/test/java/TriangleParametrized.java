import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class TriangleParametrized {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 3, 2, 7, 6 },
                { 2, 1, 4, 3.5 },
                { 3, 2, 6, 5.5 },
                { 4, 3, 3, 5 },
                { 5, 5, 10, 10 },
                { 7, 8, 9, 12 }
        });
    }

    @Parameterized.Parameter
    public double value1;

    @Parameterized.Parameter(1)
    public double value2;

    @Parameterized.Parameter(2)
    public double value3;

    @Parameterized.Parameter(3)
    public double areaResult;

    @Test
    public void test() {
        assertEquals(areaResult, (value1 + value2 + value3) / 2.0, 0.0);
    }
}

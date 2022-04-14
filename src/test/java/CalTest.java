import org.junit.Assert;
import org.junit.Test;
import todayis.Cal;

// red, green, refactor
public class CalTest {

    @Test
    public void addTest() {
        // given
        Cal calc = new Cal(); // object
        double x = 3.0;
        double y = 13.0;
        double expected = 16.0;
        // When
        double actual = calc.add(x, y); // calling

        // then
        Assert.assertEquals(expected, actual, 0.1);

    }

    @Test
    public void subtractTest() {
        // given
        Cal calc = new Cal(); // object
        double x = 3.0;
        double y = 13.0;
        double expected = 10.0;
        // When
        double actual = calc.subtract(x, y); // calling

        // then
        Assert.assertEquals(expected, actual, 0.1);

    }

    @Test
    public void MultiplyTest() {
        // given
        Cal calc = new Cal(); // object
        double x = 3.0;
        double y = 10.0;
        double expected = 30.0;
        // When
        double actual = calc.multiply(x, y); // calling

        // then
        Assert.assertEquals(expected, actual, 0.1);

    }
    @Test
    public void divideTest() {
        // given
        Cal calc = new Cal(); // object
        double x = 2.0;
        double y = 10.0;
        double expected = 5.0;
        // When
        double actual = calc.divide(x, y); // calling

        // then
        Assert.assertEquals(expected, actual, 0.1);

    }

    @Test
    public void ExponentTest() {
        // given
        Cal calc = new Cal(); // object
        double x = 2.0;
        double expected = 4.0;
        // When
        double actual = calc.exponent(x); // calling

        // then
        Assert.assertEquals(expected, actual, 0.1);

    }




}



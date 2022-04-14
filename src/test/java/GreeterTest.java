import org.junit.Assert;
import org.junit.Test;
import todayis.Cal;
import todayis.Greeter;

public class GreeterTest {
    @Test
    public void greetTest() {
        // given
        Greeter greetUser = new Greeter(); // object
        String expected = "Hello Emoni";
        // When
        String actual = greetUser.greet(" Emoni"); // calling

        // then
        Assert.assertEquals(expected, actual);

    }
}

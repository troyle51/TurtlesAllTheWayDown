import PACKAGE_NAME.Turtles;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kristofer on 7/14/20.
 */
public class TurtlesTest {

    @Test
    public void testFactorial(){
        long expected = Turtles.factorial(3);
        long actual = 6;

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testFactorial2(){
        long expected = Turtles.factorial(6);
        long actual = 720;

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGCD(){
        int expected = Turtles.gcd(102, 68);
        int actual = 34;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGCD2(){
        int expected = Turtles.gcd(10, 6);
        int actual = 2;

        Assert.assertEquals(expected, actual);

    }

}
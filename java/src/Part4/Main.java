package Part4;

import org.junit.Assert;
import org.junit.Test;

public class Main {
    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        // assert statements
        Assert.assertEquals(0, tester.multiply(10, 0), "10 x 0 must be 0");
        Assert.assertEquals(0, tester.multiply(0, 10), "0 x 10 must be 0");
        Assert.assertEquals(0, tester.multiply(0, 0), "0 x 0 must be 0");
    }
}

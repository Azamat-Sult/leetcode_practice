package easy;

import org.junit.Assert;
import org.junit.Test;

public class RomanToIntegerTest {

    @Test
    public void test1() {
        RomanToInteger rti = new RomanToInteger();
        int current = rti.romanToInt("III");
        int expected = 3;
        Assert.assertEquals(expected, current);
    }

    @Test
    public void test2() {
        RomanToInteger rti = new RomanToInteger();
        int current = rti.romanToInt("LVIII");
        int expected = 58;
        Assert.assertEquals(expected, current);
    }

    @Test
    public void test3() {
        RomanToInteger rti = new RomanToInteger();
        int current = rti.romanToInt("MCMXCIV");
        int expected = 1994;
        Assert.assertEquals(expected, current);
    }

}
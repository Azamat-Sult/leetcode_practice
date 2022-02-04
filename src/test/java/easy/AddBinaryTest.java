package easy;

import org.junit.Assert;
import org.junit.Test;

public class AddBinaryTest {

    @Test
    public void test1() {
        AddBinary ab = new AddBinary();
        String a = "111";
        String b = "1";
        String expected = "1000";
        Assert.assertEquals(expected, ab.addBinary(a, b));
    }

    @Test
    public void test2() {
        AddBinary ab = new AddBinary();
        String a = "1010";
        String b = "1011";
        String expected = "10101";
        Assert.assertEquals(expected, ab.addBinary(a, b));
    }

}
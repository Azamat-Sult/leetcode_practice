package easy;

import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {

    @Test
    public void reverseString1() {
        ReverseString reverseString = new ReverseString();
        char[] current = new char[] {'h', 'e', 'l', 'l', 'o'};
        char[] expected = new char[] {'o', 'l', 'l', 'e', 'h'};
        reverseString.reverseString(current);
        Assert.assertArrayEquals(expected, current);
    }

    @Test
    public void reverseString2() {
        ReverseString reverseString = new ReverseString();
        char[] current = new char[] {'H', 'a', 'n', 'n', 'a', 'h'};
        char[] expected = new char[] {'h', 'a', 'n', 'n', 'a', 'H'};
        reverseString.reverseString(current);
        Assert.assertArrayEquals(expected, current);
    }

}
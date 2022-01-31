package easy;

import org.junit.Assert;
import org.junit.Test;

public class LengthOfLastWordTest {

    @Test
    public void test1() {
        LengthOfLastWord lolw = new LengthOfLastWord();
        String s = "Hello World";
        int expected = 5;
        Assert.assertEquals(expected, lolw.lengthOfLastWord(s));
    }

    @Test
    public void test2() {
        LengthOfLastWord lolw = new LengthOfLastWord();
        String s = "   fly me   to   the moon  ";
        int expected = 4;
        Assert.assertEquals(expected, lolw.lengthOfLastWord(s));
    }

    @Test
    public void test3() {
        LengthOfLastWord lolw = new LengthOfLastWord();
        String s = "luffy is still joyboy";
        int expected = 6;
        Assert.assertEquals(expected, lolw.lengthOfLastWord(s));
    }

    @Test
    public void test4() {
        LengthOfLastWord lolw = new LengthOfLastWord();
        String s = "l";
        int expected = 1;
        Assert.assertEquals(expected, lolw.lengthOfLastWord(s));
    }

    @Test
    public void test5() {
        LengthOfLastWord lolw = new LengthOfLastWord();
        String s = " l";
        int expected = 1;
        Assert.assertEquals(expected, lolw.lengthOfLastWord(s));
    }

    @Test
    public void test6() {
        LengthOfLastWord lolw = new LengthOfLastWord();
        String s = "l ";
        int expected = 1;
        Assert.assertEquals(expected, lolw.lengthOfLastWord(s));
    }

}
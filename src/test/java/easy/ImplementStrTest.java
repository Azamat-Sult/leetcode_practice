package easy;

import org.junit.Assert;
import org.junit.Test;

public class ImplementStrTest {

    @Test
    public void test1() {
        ImplementStr str = new ImplementStr();
        String haystack = "hello";
        String needle = "ll";
        Assert.assertEquals(2, str.strStr(haystack, needle));
    }

    @Test
    public void test2() {
        ImplementStr str = new ImplementStr();
        String haystack = "aaaaa";
        String needle = "bba";
        Assert.assertEquals(-1, str.strStr(haystack, needle));
    }

    @Test
    public void test3() {
        ImplementStr str = new ImplementStr();
        String haystack = "";
        String needle = "";
        Assert.assertEquals(0, str.strStr(haystack, needle));
    }

}
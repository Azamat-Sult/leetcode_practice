package easy;

import org.junit.Assert;
import org.junit.Test;


public class LongestCommonPrefixTest {

    @Test
    public void test1() {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] strs = {"flower","flow","flight"};
        String current = lcp.longestCommonPrefix(strs);
        String expected = "fl";
        Assert.assertEquals(expected, current);
    }

    @Test
    public void test2() {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] strs = {"dog","racecar","car"};
        String current = lcp.longestCommonPrefix(strs);
        String expected = "";
        Assert.assertEquals(expected, current);
    }

}
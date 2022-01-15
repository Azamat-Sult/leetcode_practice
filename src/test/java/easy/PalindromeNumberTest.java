package easy;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest {

    @Test
    public void test1() {
        PalindromeNumber pn = new PalindromeNumber();
        Assert.assertTrue(pn.isPalindrome(121));
    }

    @Test
    public void test2() {
        PalindromeNumber pn = new PalindromeNumber();
        Assert.assertFalse(pn.isPalindrome(-121));
    }

    @Test
    public void test3() {
        PalindromeNumber pn = new PalindromeNumber();
        Assert.assertFalse(pn.isPalindrome(10));
    }

}
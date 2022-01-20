package easy;

import org.junit.Assert;
import org.junit.Test;


public class ValidParenthesesTest {

    @Test
    public void test1() {
        ValidParentheses vp = new ValidParentheses();
        String input = "()";
        Assert.assertTrue(vp.isValid(input));
    }

    @Test
    public void test2() {
        ValidParentheses vp = new ValidParentheses();
        String input = "()[]{}";
        Assert.assertTrue(vp.isValid(input));
    }

    @Test
    public void test3() {
        ValidParentheses vp = new ValidParentheses();
        String input = "(]";
        Assert.assertFalse(vp.isValid(input));
    }

}
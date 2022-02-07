package easy;

import org.junit.Assert;
import org.junit.Test;

public class SqrtTest {

    @Test
    public void test1() {
        Sqrt sqrt = new Sqrt();
        Assert.assertEquals(2, sqrt.mySqrt(4));
    }

    @Test
    public void test2() {
        Sqrt sqrt = new Sqrt();
        Assert.assertEquals(2, sqrt.mySqrt(8));
    }

    @Test
    public void test3() {
        Sqrt sqrt = new Sqrt();
        Assert.assertEquals(46339, sqrt.mySqrt(2147395599));
    }

}
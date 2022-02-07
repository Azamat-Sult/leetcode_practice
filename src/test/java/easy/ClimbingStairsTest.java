package easy;

import org.junit.Assert;
import org.junit.Test;

public class ClimbingStairsTest {

    @Test
    public void test1() {
        ClimbingStairs cs = new ClimbingStairs();
        Assert.assertEquals(2, cs.climbStairs(2));
    }

    @Test
    public void test2() {
        ClimbingStairs cs = new ClimbingStairs();
        Assert.assertEquals(3, cs.climbStairs(3));
    }

    @Test
    public void test3() {
        ClimbingStairs cs = new ClimbingStairs();
        Assert.assertEquals(5, cs.climbStairs(4));
    }

    @Test
    public void test4() {
        ClimbingStairs cs = new ClimbingStairs();
        Assert.assertEquals(8, cs.climbStairs(5));
    }

}
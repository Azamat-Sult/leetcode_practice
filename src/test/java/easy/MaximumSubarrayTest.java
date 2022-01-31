package easy;

import org.junit.Assert;
import org.junit.Test;

public class MaximumSubarrayTest {

    @Test
    public void test1() {
        MaximumSubarray ms = new MaximumSubarray();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expected = 6;
        Assert.assertEquals(expected, ms.maxSubArray(nums));
    }

    @Test
    public void test2() {
        MaximumSubarray ms = new MaximumSubarray();
        int[] nums = {1};
        int expected = 1;
        Assert.assertEquals(expected, ms.maxSubArray(nums));
    }

    @Test
    public void test3() {
        MaximumSubarray ms = new MaximumSubarray();
        int[] nums = {5, 4, -1, 7, 8};
        int expected = 23;
        Assert.assertEquals(expected, ms.maxSubArray(nums));
    }

}
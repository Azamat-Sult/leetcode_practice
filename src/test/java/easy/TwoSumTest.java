package easy;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void test1() {
        TwoSum twoSum = new TwoSum();
        int[] current = twoSum.twoSum(new int[] {2, 7, 11, 15}, 9);
        int[] expected = new int[] {0, 1};
        Assert.assertArrayEquals(expected, current);
    }

    @Test
    public void test2() {
        TwoSum twoSum = new TwoSum();
        int[] current = twoSum.twoSum(new int[] {3, 2, 4}, 6);
        int[] expected = new int[] {1, 2};
        Assert.assertArrayEquals(expected, current);
    }

    @Test
    public void test3() {
        TwoSum twoSum = new TwoSum();
        int[] current = twoSum.twoSum(new int[] {3, 3}, 6);
        int[] expected = new int[] {0, 1};
        Assert.assertArrayEquals(expected, current);
    }

}
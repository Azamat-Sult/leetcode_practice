package easy;

import org.junit.Assert;
import org.junit.Test;

public class PlusOneTest {

    @Test
    public void test1() {
        PlusOne po = new PlusOne();
        int[] current = po.plusOne(new int[] {1, 2, 3});
        int[] expected = new int[] {1, 2, 4};
        Assert.assertArrayEquals(expected, current);
    }

    @Test
    public void test2() {
        PlusOne po = new PlusOne();
        int[] current = po.plusOne(new int[] {4, 3, 2, 1});
        int[] expected = new int[] {4, 3, 2, 2};
        Assert.assertArrayEquals(expected, current);
    }

    @Test
    public void test3() {
        PlusOne po = new PlusOne();
        int[] current = po.plusOne(new int[] {9});
        int[] expected = new int[] {1, 0};
        Assert.assertArrayEquals(expected, current);
    }

    @Test
    public void test4() {
        PlusOne po = new PlusOne();
        int[] current = po.plusOne(new int[] {9, 9});
        int[] expected = new int[] {1, 0, 0};
        Assert.assertArrayEquals(expected, current);
    }

    @Test
    public void test5() {
        PlusOne po = new PlusOne();
        int[] current = po.plusOne(new int[] {7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 6});
        int[] expected = new int[] {7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 7};
        Assert.assertArrayEquals(expected, current);
    }

}
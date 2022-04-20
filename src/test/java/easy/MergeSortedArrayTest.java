package easy;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortedArrayTest {

    @Test
    public void test1() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        int[] expected = {1};
        int[] rsl = MergeSortedArray.merge(nums1, m, nums2, n);
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void test2() {
        int[] nums1 = {};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        int[] expected = {1};
        int[] rsl = MergeSortedArray.merge(nums1, m, nums2, n);
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void test3() {
        int[] nums1 = {};
        int m = 0;
        int[] nums2 = {};
        int n = 0;
        int[] expected = {};
        int[] rsl = MergeSortedArray.merge(nums1, m, nums2, n);
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void test4() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        int[] expected = {1, 2, 2, 3, 5, 6};
        int[] rsl = MergeSortedArray.merge(nums1, m, nums2, n);
        Assert.assertArrayEquals(expected, rsl);
    }

}
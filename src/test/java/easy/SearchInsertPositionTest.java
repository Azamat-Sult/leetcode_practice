package easy;

import org.junit.Assert;
import org.junit.Test;

public class SearchInsertPositionTest {

    @Test
    public void test1() {
        SearchInsertPosition sip = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        Assert.assertEquals(2, sip.searchInsert(nums, target));
    }

    @Test
    public void test2() {
        SearchInsertPosition sip = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        Assert.assertEquals(1, sip.searchInsert(nums, target));
    }

    @Test
    public void test3() {
        SearchInsertPosition sip = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        Assert.assertEquals(4, sip.searchInsert(nums, target));
    }

    @Test
    public void test4() {
        SearchInsertPosition sip = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        int target = 0;
        Assert.assertEquals(0, sip.searchInsert(nums, target));
    }

    @Test
    public void test5() {
        SearchInsertPosition sip = new SearchInsertPosition();
        int[] nums = {1, 3};
        int target = 2;
        Assert.assertEquals(1, sip.searchInsert(nums, target));
    }

}
package easy;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        if (nums.length == 2 && nums[0] != nums[1]) {
            return 2;
        }
        int left = 0;
        int right = 1;
        int rsl = 1;
        while (right < nums.length) {
            if (nums[left] != nums[right]) {
                nums[rsl] = nums[right];
                left++;
                right++;
                rsl++;
                continue;
            }
            right++;
        }
        return rsl;
    }

}

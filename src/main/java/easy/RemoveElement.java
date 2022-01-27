package easy;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1 && nums[0] != val) {
            return 1;
        }
        int left = 0;
        int right = nums.length - 1;
        int rsl = 0;
        while (left <= right) {
            if (nums[left] != val) {
                left++;
                rsl++;
                continue;
            }
            if (nums[left] == val && nums[right] != val) {
                nums[left] = nums[right];
                left++;
                right--;
                rsl++;
                continue;
            }
            right--;
        }
        return rsl;
    }

}

package easy;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        if (nums.length == 1) {
            if (nums[0] < target) {
                return 1;
            } else {
                return 0;
            }
        }
        int left = 0;
        int right = nums.length - 1;
        int rsl = (right + left) / 2;
        while (right > left) {
            if (nums[rsl] == target) {
                return rsl;
            }
            if (nums[rsl] < target) {
                left = rsl + 1;
                rsl = (right + left) / 2;
                continue;
            }
            if (nums[rsl] > target) {
                right = rsl - 1;
                rsl = (right + left) / 2;
                continue;
            }
        }
        if (nums[rsl] < target) {
            rsl++;
        }
        return rsl;
    }

}
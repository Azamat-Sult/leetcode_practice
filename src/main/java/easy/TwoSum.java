package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Azamat Sultangareev
 * @version 1.0
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such
 * that they add up to target. You may assume that each input would have exactly one solution,
 * and you may not use the same element twice. You can return the answer in any order.
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsInMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numsInMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int delta = target - nums[i];
            if (numsInMap.containsKey(delta) && numsInMap.get(delta) != i) {
                return new int[] {i, numsInMap.get(target - nums[i])};
            }
        }
        return new int[] {};
    }

}
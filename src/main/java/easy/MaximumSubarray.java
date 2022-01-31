package easy;

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int currentSum = 0;
        int minSumFromStart = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            maxSum = Math.max(maxSum, currentSum - minSumFromStart);
            minSumFromStart = Math.min(minSumFromStart, currentSum);
        }

        return maxSum;
    }

}
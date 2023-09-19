package leetcode.Arrays;

public class RunningSumOf1dArray {
    /**
     * Leetcode 1480
     * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
     * Return the running sum of nums.
     */
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            result[i] = currSum;
        }
        return result;
    }
}

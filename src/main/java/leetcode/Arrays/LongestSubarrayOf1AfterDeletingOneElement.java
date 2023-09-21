package leetcode.Arrays;

public class LongestSubarrayOf1AfterDeletingOneElement {
    /**
     * Leetcode 1493
     * Given a binary array nums, you should delete one element from it.
     * Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there
     * is no such subarray.
     */
    static int longestSubarray(int[] nums) {
        int max = 0;
        int currSum = 0;
        int prevSum = 0;
        for (int value : nums) {
            if (value == 0) {
                prevSum = currSum;
                currSum = 0;
            } else {
                currSum++;
                max = Math.max(max, prevSum + currSum);
            }
        }
        return max == nums.length ? max - 1 : max;
    }
}

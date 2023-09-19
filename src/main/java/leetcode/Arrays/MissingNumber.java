package leetcode.Arrays;

public class MissingNumber {
    /**
     * Leetcode 268
     * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that
     * is missing from the array.
     */
    static int missingNumber(int[] nums) {
        int sum = nums.length * (nums.length + 1) / 2;
        for (int i : nums) {
            sum -= i;
        }
        return sum;
    }
}

package leetcode;

public class MaxConsecutiveOnesII {
    /**
     * Leetcode 487
     * Given a binary array, find the maximum number of consecutive 1s in this array if you can flip at most one 0.
     */
    static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int left = 0;
        int right = 0;
        int amountOfZeros = 0;
        while (right < nums.length) {
            if (nums[right] == 0) {
                amountOfZeros++;
            }
            while (amountOfZeros >= 2) {
                if (nums[left] == 0) {
                    amountOfZeros--;
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }
}

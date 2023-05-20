package leetcode;

public class RotateArray {
    /**
    * Leetcode 189
     * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
    */
    static void rotate(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }
        for (int i = 0; i < k; i++) {
            rotateArray(nums);
        }
    }

    private static void rotateArray(int[] array) {
        int last = array[array.length - 1];
        for (int k = array.length - 1; k > 0; k--) {
            array[k] = array[k - 1];
        }
        array[0] = last;
    }

    /**
     * Another solution
     */
    public void rotate2(int[] nums, int k) {
        k %= nums.length;
        reverse(0, nums.length-1, nums);
        reverse(0, k-1, nums);
        reverse(k, nums.length-1, nums);

    }
    private void reverse(int start, int end, int[] nums){
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

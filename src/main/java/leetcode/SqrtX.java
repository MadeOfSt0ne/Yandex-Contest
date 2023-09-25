package leetcode;

public class SqrtX {
    /**
     * Leetcode 69
     * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned
     * integer should be non-negative as well.
     * You must not use any built-in exponent function or operator.
     */
    static int mySqrt(int x) {
        if (x == 0) {
            return x;
        }
        int left = 1;
        int right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid > x / mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
}

package leetcode.Arrays;

public class MedianOfTwoSortedArrays {
    /**
     * Leetcode 4
     * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
     * The overall run time complexity should be O(log (m+n)).
     */
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans;
        int one = 0;
        int two = 0;
        int i = 0;
        int totalLength = nums1.length + nums2.length;
        int[] result = new int[totalLength];

        while (one <= nums1.length && two <= nums2.length) {
            if (one == nums1.length) {
                while (two < nums2.length) {
                    result[i++] = nums2[two++];
                }
                break;
            } else if (two == nums2.length) {
                while (one < nums1.length) {
                    result[i++] = nums1[one++];
                }
                break;
            }

            if (nums1[one] <= nums2[two]) {
                result[i] = nums1[one];
                one++;
            } else {
                result[i] = nums2[two];
                two++;
            }
            i++;
        }

        if (totalLength % 2 == 0) {
            ans = (double) (result[result.length / 2 - 1] + result[result.length / 2]) / 2;
        } else {
            ans = result[result.length / 2];
        }
        return ans;
    }
}

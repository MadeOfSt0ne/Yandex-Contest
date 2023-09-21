package leetcode.Arrays;

import leetcode.Arrays.SubarraySumEqualsK;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubarraySumEqualsKTest {

    @Test
    void subarraySum1() {
        int[] nums = {1, 2, 2, -10, 10, 2, 3, 2};
        int k = 5;
        assertEquals(5, SubarraySumEqualsK.subarraySum(nums, k));
    }

    @Test
    void subarraySum2() {
        int[] nums = {1, 2, 3};
        int k = 3;
        assertEquals(2, SubarraySumEqualsK.subarraySum(nums, k));
    }
}
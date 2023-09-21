package leetcode.Arrays;

import leetcode.Arrays.LongestSubarrayOf1AfterDeletingOneElement;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestSubarrayOf1AfterDeletingOneElementTest {

    @Test
    void longestSubarray1() {
        int[] nums = {1, 1, 0, 1};
        assertThat(LongestSubarrayOf1AfterDeletingOneElement.longestSubarray(nums)).isEqualTo(3);
    }

    @Test
    void longestSubarray2() {
        int[] nums = {0, 1, 1, 1, 0, 1, 1, 0, 1};
        assertThat(LongestSubarrayOf1AfterDeletingOneElement.longestSubarray(nums)).isEqualTo(5);
    }

    @Test
    void longestSubarray3() {
        int[] nums = {1, 1, 1};
        assertThat(LongestSubarrayOf1AfterDeletingOneElement.longestSubarray(nums)).isEqualTo(2);
    }
}
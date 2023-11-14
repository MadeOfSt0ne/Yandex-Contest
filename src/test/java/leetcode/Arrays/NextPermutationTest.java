package leetcode.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextPermutationTest {

    @Test
    void nextPermutation1() {
        int[] nums = {1, 2, 3};
        int[] ans = {1, 3, 2};
        assertArrayEquals(ans, NextPermutation.nextPermutation(nums));
    }

    @Test
    void nextPermutation2() {
        int[] nums = {3, 2, 1};
        int[] ans = {1, 2, 3};
        assertArrayEquals(ans, NextPermutation.nextPermutation(nums));
    }

    @Test
    void nextPermutation3() {
        int[] nums = {1, 1, 5};
        int[] ans = {1, 5, 1};
        assertArrayEquals(ans, NextPermutation.nextPermutation(nums));
    }
}
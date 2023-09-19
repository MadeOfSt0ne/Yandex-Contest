package leetcode.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {

    @Test
    void missingNumber1() {
        int[] nums = {3, 0, 1};
        assertEquals(2, MissingNumber.missingNumber(nums));
    }

    @Test
    void missingNumber2() {
        int[] nums = {3, 0, 1, 4, 2, 5, 7};
        assertEquals(6, MissingNumber.missingNumber(nums));
    }
}
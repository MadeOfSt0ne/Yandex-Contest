package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveOnesIITest {

    @Test
    void findMaxConsecutiveOnes() {
        int[] nums = {1, 1, 0, 1, 1, 0, 1, 0};
        assertEquals(5, MaxConsecutiveOnesII.findMaxConsecutiveOnes(nums));
    }
}
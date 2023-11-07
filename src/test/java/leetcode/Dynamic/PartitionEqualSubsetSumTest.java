package leetcode.Dynamic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PartitionEqualSubsetSumTest {

    @Test
    void canPartition1() {
        int[] nums = {1, 5, 11, 5};
        assertTrue(PartitionEqualSubsetSum.canPartition(nums));
    }
}
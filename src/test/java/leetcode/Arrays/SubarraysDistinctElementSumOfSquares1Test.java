package leetcode.Arrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubarraysDistinctElementSumOfSquares1Test {

    @Test
    void sumCounts1() {
        List<Integer> list = List.of(1, 2, 1);
        assertEquals(15, SubarraysDistinctElementSumOfSquares1.sumCounts(list));
    }

    @Test
    void sumCounts2() {
        List<Integer> list = List.of(1, 1);
        assertEquals(3, SubarraysDistinctElementSumOfSquares1.sumCounts(list));
    }
}
package leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SummaryRangesTest {

    @Test
    void summaryRanges1() {
        int[] nums = {0, 1, 2, 4, 5, 7};
        List<String> ans = List.of("0->2","4->5","7");
        assertEquals(ans, SummaryRanges.summaryRanges(nums));
    }

    @Test
    void summaryRanges2() {
        int[] nums = {0, 2, 3, 4, 6, 8, 9};
        List<String> ans = List.of("0","2->4","6", "8->9");
        assertEquals(ans, SummaryRanges.summaryRanges(nums));
    }
}
package leetcode.Arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsTest {

    @Test
    void permute1() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(List.of(1, 2, 3));
        ans.add(List.of(1, 3, 2));
        ans.add(List.of(2, 1, 3));
        ans.add(List.of(2, 3, 1));
        ans.add(List.of(3, 1, 2));
        ans.add(List.of(3, 2, 1));
        assertEquals(ans, Permutations.permute(nums));
    }
}
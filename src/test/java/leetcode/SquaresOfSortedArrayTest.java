package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SquaresOfSortedArrayTest {

    @Test
    void sortedSquares1() {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] ans = {0, 1, 9, 16, 100};
        assertThat(SquaresOfSortedArray.sortedSquares2(nums)).isEqualTo(ans);
    }
}
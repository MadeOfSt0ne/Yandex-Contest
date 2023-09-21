package leetcode.Matrix;

import leetcode.Matrix.IntervalListIntersections;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IntervalListIntersectionsTest {

    @Test
    void intervalIntersection1() {
        int[][] first = {{0, 2}, {5, 10}, {13, 23}, {24, 25}};
        int[][] second = {{1, 5}, {8, 12}, {15, 24}, {25, 26}};
        int[][] ans = {{1, 2}, {5, 5}, {8, 10}, {15, 23}, {24, 24}, {25, 25}};
        assertThat(IntervalListIntersections.intervalIntersection2(first, second)).isEqualTo(ans);
    }

    @Test
    void intervalIntersection2() {
        int[][] first = {{14, 16}};
        int[][] second = {{7, 13}, {16, 20}};
        int[][] ans = {{16, 16}};
        assertThat(IntervalListIntersections.intervalIntersection2(first, second)).isEqualTo(ans);
    }

    @Test
    void intervalIntersection3() {
        int[][] first = {{3, 5}, {9, 20}};
        int[][] second = {{4, 5}, {7, 10}, {11, 12}, {14, 15}, {16, 20}};
        int[][] ans = {{4, 5}, {9, 10}, {11, 12}, {14, 15}, {16, 20}};
        assertThat(IntervalListIntersections.intervalIntersection2(first, second)).isEqualTo(ans);
    }
}
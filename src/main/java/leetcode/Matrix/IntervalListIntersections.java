package leetcode.Matrix;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersections {
    /**
     * Leetcode 986
     * You are given two lists of closed intervals, firstList and secondList, where firstList[i] = [starti, endi] and
     * secondList[j] = [startj, endj]. Each list of intervals is pairwise disjoint and in sorted order.
     * Return the intersection of these two interval lists.
     * A closed interval [a, b] (with a <= b) denotes the set of real numbers x with a <= x <= b.
     * The intersection of two closed intervals is a set of real numbers that are either empty or represented as a
     * closed interval. For example, the intersection of [1, 3] and [2, 4] is [2, 3].
     */
    static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> ans = new ArrayList<>();
        for (int[] first : firstList) {
            for (int[] second : secondList) {
                if (!intersects(first, second)) {
                    if (first[1] < second[0]) {
                        break;
                    }
                } else {
                    ans.add(new int[]{Math.max(first[0], second[0]),
                            Math.min(first[1], second[1])});
                }
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }

    private static boolean intersects(int[] one, int[] two) {
        return (two[0] <= one[0] && one[0] <= two[1]) || (two[0] <= one[1] && one[1] <= two[1])
                || (one[0] <= two[0] && two[0] <= one[1]) || (one[0] <= two[1] && two[1] <= one[1]);
    }

    static int[][] intervalIntersection2(int[][] firstList, int[][] secondList) {
        List<int[]> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < firstList.length && j < secondList.length) {
            int lo = Math.max(firstList[i][0], secondList[j][0]);
            int hi = Math.min(firstList[i][1], secondList[j][1]);
            if (lo <= hi) {
                ans.add(new int[]{lo, hi});
            }
            if (firstList[i][1] < secondList[j][1]) {
                i++;
            } else {
                j++;
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}

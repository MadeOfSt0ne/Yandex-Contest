package leetcode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
    /**
     * Leetcode 119
     * Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
     * In Pascal's triangle, each number is the sum of the two numbers directly above it.
     */
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> all = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        if (rowIndex == 0) {
            return List.of(1);
        }
        all.add(firstRow);
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> prev = all.get(i - 1);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);

            for (int k = 1; k < i; k++) {
                int elem = prev.get(k - 1) + prev.get(k);
                curr.add(elem);
            }

            curr.add(1);
            all.add(curr);
        }
        return all.get(rowIndex);
    }
}

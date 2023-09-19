package leetcode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    /**
     * Leetcode 118
     * Given an integer numRows, return the first numRows of Pascal's triangle.
     * In Pascal's triangle, each number is the sum of the two numbers directly above it.
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev = result.get(i - 1);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);

            for (int j = 1; j < i; j++) {
                int elem = prev.get(j - 1) + prev.get(j);
                curr.add(elem);
            }

            curr.add(1);
            result.add(curr);
        }
        return result;
    }
}

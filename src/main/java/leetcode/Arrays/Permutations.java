package leetcode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    /**
     * Leetcode 46
     * Given an array 'nums' of distinct integers, return all the possible permutations. You can return the answer in
     * any order.
     */
    static List<List<Integer>> list;
    static List<List<Integer>> permute(int[] nums) {
        list = new ArrayList<>();
        backtrack(new ArrayList<>(), nums);
        return list;
    }

    private static void backtrack(List<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) {
            list.add(new ArrayList<>(temp));
            return;
        }
        for (int num : nums) {
            if (!temp.contains(num)) {
                temp.add(num);
                backtrack(temp, nums);
                temp.remove(temp.size() - 1);
            }
        }
    }
}

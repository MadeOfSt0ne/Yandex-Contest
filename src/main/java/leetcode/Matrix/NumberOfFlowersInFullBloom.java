package leetcode.Matrix;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberOfFlowersInFullBloom {
    /**
     * Leetcode 2251
     * You are given a 0-indexed 2D integer array flowers, where flowers[i] = [starti, endi] means the ith flower will
     * be in full bloom from starti to endi (inclusive). You are also given a 0-indexed integer array people of size n,
     * where people[i] is the time that the ith person will arrive to see the flowers.
     * Return an integer array answer of size n, where answer[i] is the number of flowers that are in full bloom when
     * the ith person arrives.
     */
    static int[] fullBloomFlowers(int[][] flowers, int[] people) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[people.length];
        for (int[] arr : flowers) {
            for (int i = arr[0]; i <= arr[1]; i++) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }
        for (int i = 0; i < people.length; i++) {
            ans[i] = map.getOrDefault(people[i], 0);
        }
        return ans;
    }

    static int[] fullBloom(int[][] flowers, int[] people) {
        int[] start = new int[flowers.length];
        int[] end = new int[flowers.length];

        for (int i = 0; i < flowers.length; i++) {
            start[i] = flowers[i][0];
            end[i] = flowers[i][1] + 1;
        }
        Arrays.sort(start);
        Arrays.sort(end);

        int[] ans = new int[people.length];
        for (int i = 0; i < people.length; i++) {
            int before = check(start, people[i]);
            int after = check(end, people[i]);
            ans[i] = before - after;
        }
        return ans;
    }

    private static int check(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] <= target) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }
}

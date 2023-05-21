package leetcode;

import java.util.*;

public class IntersectionOfTwoArraysII {
    /**
     * Leetcode 350
     * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must
     * appear as many times as it shows in both arrays, and you may return the result in any order.
     */
    public int[] intersect(int[] big, int[] small) {
        List<Integer> ans = new ArrayList<>();
        if (big.length < small.length) {
            intersect(small, big);
        }
        Map<Integer, Integer> sm = new HashMap<>();
        for (int i : small) {
            sm.put(i, sm.getOrDefault(i, 0) + 1);
        }
        for (int j : big) {
            if (sm.containsKey(j) && sm.get(j) > 0) {
                ans.add(j);
                sm.put(j, sm.get(j) - 1);
            }
            if (ans.size() == small.length) {
                return ans.stream().mapToInt(Integer::intValue).toArray();
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] intersect2(int[] one, int[] two) {
        int i = 0;
        int j = 0;
        int k = 0;
        Arrays.sort(one);
        Arrays.sort(two);
        while (i < one.length && j < two.length) {
            if (one[i] > two[j]) {
                j++;
            } else if (one[i] < two[j]) {
                i++;
            } else {
                one[k] = one[i];
                k++;
                i++;
                j++;
            }
        }
        return Arrays.copyOfRange(one, 0, k);
    }
}

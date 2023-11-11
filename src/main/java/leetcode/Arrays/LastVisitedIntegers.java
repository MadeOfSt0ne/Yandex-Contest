package leetcode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class LastVisitedIntegers {
    /**
     * Leetcode 2899
     * Given a 0-indexed array of strings words where words[i] is either a positive integer represented as a string or
     * the string "prev".
     * Start iterating from the beginning of the array; for every "prev" string seen in words, find the last visited
     * integer in words which is defined as follows:
     * Let k be the number of consecutive "prev" strings seen so far (containing the current string). Let nums be the
     * 0-indexed array of integers seen so far and nums_reverse be the reverse of nums, then the integer at (k - 1)th
     * index of nums_reverse will be the last visited integer for this "prev".
     * If k is greater than the total visited integers, then the last visited integer will be -1.
     * Return an integer array containing the last visited integers.
     */
    static List<Integer> lastVisited(List<String> words) {
        List<Integer> ans = new ArrayList<>();
        List<String> vals = new ArrayList<>();
        int ct = 0;
        for (String str : words) {
            if (str.equals("prev")) {
                ct++;
                if (ct > vals.size()) {
                    ans.add(-1);
                } else {
                    ans.add(Integer.valueOf(vals.get(ct - 1)));
                }
            } else {
                vals.add(0, str);
                ct = 0;
            }
        }
        return ans;
    }
}

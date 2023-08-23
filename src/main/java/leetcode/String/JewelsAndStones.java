package leetcode.String;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

    /**
     * Leetcode 771
     * You're given strings jewels representing the types of stones that are jewels, and stones representing the stones
     * you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have
     * are also jewels.
     */
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewel = new HashSet<>();
        for (Character c : jewels.toCharArray()) {
            jewel.add(c);
        }
        int ans = 0;
        for (Character ch : stones.toCharArray()) {
            if (jewel.contains(ch)) {
                ans++;
            }
        }
        return ans;
    }
}

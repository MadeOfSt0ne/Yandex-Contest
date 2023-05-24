package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void longestCommonPrefix1() {
        String[] str = {"flower", "flow", "flight"};
        assertEquals("fl", LongestCommonPrefix.longestCommonPrefix(str));
    }

    @Test
    void longestCommonPrefix2() {
        String[] str = {"dog", "racecar", "car"};
        assertEquals("", LongestCommonPrefix.longestCommonPrefix(str));
    }
}
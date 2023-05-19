package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {

    @Test
    void isSubsequence() {
        String s = "axc";
        String t = "ahbgdc";
        assertFalse(IsSubsequence.isSubsequence(s, t));
    }
}
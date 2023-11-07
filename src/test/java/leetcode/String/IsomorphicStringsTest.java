package leetcode.String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsomorphicStringsTest {

    @Test
    void isIsomorphic1() {
        String s = "badc";
        String t = "baba";
        assertFalse(IsomorphicStrings.isIsomorphic(s, t));
    }
}
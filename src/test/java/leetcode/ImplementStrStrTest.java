package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplementStrStrTest {

    @Test
    void strStr() {
        String haystack = "mississippi";
        String needle = "pi";
        assertEquals(9, ImplementStrStr.strStr(haystack, needle));
    }
}
package leetcode.Dynamic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestStringChainTest {

    @Test
    void longestStrChain1() {
        String[] words = {"a", "b", "ba", "bca", "bda", "bdca"};
        assertEquals(4, LongestStringChain.longestStrChain(words));
    }
}
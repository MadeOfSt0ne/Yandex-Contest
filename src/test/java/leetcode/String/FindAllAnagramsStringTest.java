package leetcode.String;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindAllAnagramsStringTest {

    @Test
    void findAnagrams() {
        String s = "cbaebabacopzcd";
        String p = "abc";
        List<Integer> list = List.of(0, 6);
        assertEquals(list, FindAllAnagramsString.findAnagrams(s, p));
    }
}
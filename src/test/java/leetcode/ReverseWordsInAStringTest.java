package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInAStringTest {

    @Test
    void reverseWords() {
        String s = "Let's take LeetCode contest";
        String d = "s'teL ekat edoCteeL tsetnoc";
        assertEquals(d, ReverseWordsInAString.reverseWords(s));
    }
}
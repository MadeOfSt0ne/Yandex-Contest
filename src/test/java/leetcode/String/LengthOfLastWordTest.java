package leetcode.String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {

    @Test
    void lengthOfLastWord1() {
        String s = "Hello World";
        assertEquals(5, LengthOfLastWord.lengthOfLastWord(s));
    }

    @Test
    void lengthOfLastWord2() {
        String s = "   fly me   to   the moon  ";
        assertEquals(4, LengthOfLastWord.lengthOfLastWord(s));
    }

    @Test
    void lengthOfLastWord3() {
        String s = "luffy is still joyboy";
        assertEquals(6, LengthOfLastWord.lengthOfLastWord(s));
    }

    @Test
    void lengthOfLastWord4() {
        String s = "a ";
        assertEquals(1, LengthOfLastWord.lengthOfLastWord(s));
    }
}
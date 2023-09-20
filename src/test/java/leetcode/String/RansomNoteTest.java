package leetcode.String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {

    @Test
    void canConstruct1() {
        String r = "leetcode";
        String m = "arraylist";
        assertFalse(RansomNote.canConstruct(r, m));
    }

    @Test
    void canConstruct2() {
        String r = "leet";
        String m = "erreylist";
        assertTrue(RansomNote.canConstruct(r, m));
    }
}
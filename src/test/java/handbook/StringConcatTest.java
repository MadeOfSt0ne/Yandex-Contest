package handbook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringConcatTest {

    @Test
    void concat1() {
        String s1 = "abc";
        String s2 = "def";
        assertEquals("adbecf", StringConcat.concat(s1, s2));
    }
}
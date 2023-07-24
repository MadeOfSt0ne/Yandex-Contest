package InternDaySummer23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameWithChangesTest {

    @Test
    void changeLetters() {
        String[] words = {"aabb", "ggtt", "abc", "zyc", "sssss", "ppppp", "xx", "ab"};
        assertEquals(0, GameWithChanges.changeLetters(words));
    }
}
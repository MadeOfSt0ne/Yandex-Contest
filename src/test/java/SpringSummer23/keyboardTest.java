package SpringSummer23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class keyboardTest {

    @Test
    void countRowMoves1() {
        int[] buttons = {1, 2, 3, 4};
        int[] rows = {1, 2, 1, 2};
        int[] text = {1, 2, 3, 1, 4};
        assertEquals(3, Keyboard.countTransitions(buttons, rows, text));
    }

    @Test
    void countRowMoves2() {
        int[] buttons = {42, 3, 14};
        int[] rows = {1, 3, 3};
        int[] text = {3, 14, 14, 3};
        assertEquals(0, Keyboard.countTransitions(buttons, rows, text));
    }
}
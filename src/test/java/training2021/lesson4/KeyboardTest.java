package training2021.lesson4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeyboardTest {

    @Test
    void findBroken() {
        Integer[] button = {1, 50, 3, 4, 3};
        Integer[] pressing = {1, 2, 3, 4, 5, 1, 3, 3, 4, 5, 5, 5, 5, 5, 4, 5};
        assertEquals(0, Keyboard.findBroken(button, pressing));
    }
}
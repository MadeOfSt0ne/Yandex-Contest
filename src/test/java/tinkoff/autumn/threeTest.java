package tinkoff.autumn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class threeTest {

    @Test
    void makeWinCombo1() {
        int[] joe = {5, 1, 2, 5, 3, 5};
        int[] win = {5, 1, 2, 3, 5, 5};
        assertEquals("YES", three.makeWinCombo(joe, win));
    }

    @Test
    void makeWinCombo2() {
        int[] joe = {4, 1, 2};
        int[] win = {1, 4, 7};
        assertEquals("NO", three.makeWinCombo(joe, win));
    }

    @Test
    void makeWinCombo3() {
        int[] joe = {7};
        int[] win = {7};
        assertEquals("YES", three.makeWinCombo(joe, win));
    }

    @Test
    void makeWinCombo4() {
        int[] joe = {4, 4, 1, 7, 5, 3, 8};
        int[] win = {4, 1, 4, 5, 7, 3, 8};
        assertEquals("YES", three.makeWinCombo(joe, win));
    }
}
package homework2023;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardGameTest {

    @Test
    void findWinner1() {
        String one = "1 3 5 7 9";
        String two = "2 4 6 8 0";
        assertEquals("second 5", CardGame.findWinner(one, two));
    }

    @Test
    void findWinner2() {
        String one = "2 4 6 8 0";
        String two = "1 3 5 7 9";
        assertEquals("first 5", CardGame.findWinner(one, two));
    }

    @Test
    void findWinner3() {
        String one = "1 7 3 9 4";
        String two = "5 8 0 2 6";
        assertEquals("second 23", CardGame.findWinner(one, two));
    }
}
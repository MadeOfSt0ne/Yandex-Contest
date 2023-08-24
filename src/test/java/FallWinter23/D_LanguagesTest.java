package FallWinter23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class D_LanguagesTest {

    @Test
    void calcBarrier1() {
        String[] langs = {"A", "B", "A", "A"};
        int[] workers = {0, 1, 2, 3, 3, 4, 4, 2, 1, 0};
        assertEquals(0, D_Languages.calcBarrier(langs, workers));
    }

    @Test
    void calcBarrier2() {
        String[] langs = {"A", "B", "B", "A", "B"};
        int[] workers = {0, 1, 1, 2, 3, 4, 4, 5, 5, 3, 2, 0};
        assertEquals(0, D_Languages.calcBarrier(langs, workers));
    }
}
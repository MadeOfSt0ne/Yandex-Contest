package handbook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxMultiplicationTest {

    @Test
    void findMax1() {
        long[] array = {20, 30, 40};
        assertEquals(1200, MaxMultiplication.findMax(array));
    }

    @Test
    void findMax2() {
        long[] array = {20, 0};
        assertEquals(0, MaxMultiplication.findMax(array));
    }
}
package training2021.lesson3;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OpenCalculatorTest {

    @Test
    void countButtons() {
        List<Integer> list = List.of(1, 2, 3);
        Integer number = 1001;
        assertEquals(1, OpenCalculator.countButtons(list, number));
    }

    @Test
    void countButtons1() {
        List<Integer> list = List.of(1, 2, 3);
        Integer number = 9;
        assertEquals(1, OpenCalculator.countButtons(list, number));
    }

    @Test
    void countButtons2() {
        List<Integer> list = List.of(1, 2, 3);
        Integer number = 35791;
        assertEquals(3, OpenCalculator.countButtons(list, number));
    }
}
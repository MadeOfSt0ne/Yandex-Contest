package training2021.lesson3;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DifferentNumbersTest {

    @Test
    void countNumbers() {
        List<Integer> list = List.of(1, 2, 3, 2, 1);
        assertEquals(3, DifferentNumbers.countNumbers(list));
    }

    @Test
    void countNumbers1() {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(10, DifferentNumbers.countNumbers(list));
    }

    @Test
    void countNumbers2() {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 1, 2, 1, 2, 7, 3);
        assertEquals(6, DifferentNumbers.countNumbers(list));
    }
}
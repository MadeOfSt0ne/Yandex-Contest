package training2021.lesson2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GreatestMultiplicationTest {

    @Test
    void findNumbers1() {
        List<Long> list = List.of(4L, 3L, 5L, 2L, 5L);
        assertEquals("5 5", GreatestMultiplication.findNumbers(list));
    }

    @Test
    void findNumbers2() {
        List<Long> list = List.of(4L, 3L, -5L, 2L, 5L, -5L);
        assertEquals("-5 -5", GreatestMultiplication.findNumbers(list));
    }

    @Test
    void findNumbers3() {
        List<Long> list = List.of(1L, 1L, 1L);
        assertEquals("1 1", GreatestMultiplication.findNumbers(list));
    }

    @Test
    void findNumbers4() {
        List<Long> list = List.of(1L, 1L, -1L, -1L);
        assertEquals("-1 -1", GreatestMultiplication.findNumbers(list));
    }

    @Test
    void findNumbers5() {
        List<Long> list = List.of(1L, 1L);
        assertEquals("1 1", GreatestMultiplication.findNumbers(list));
    }

    @Test
    void findNumbers6() {
        List<Long> list = List.of(-10L, 10L, 10L);
        assertEquals("10 10", GreatestMultiplication.findNumbers(list));
    }

    @Test
    void findNumbers7() {
        List<Long> list = List.of(10L, 1L);
        assertEquals("1 10", GreatestMultiplication.findNumbers(list));
    }

    @Test
    void findNumbers8() {
        List<Long> list = List.of(4L, 4L, 5L, 5L);
        assertEquals("5 5", GreatestMultiplication.findNumbers(list));
    }

    @Test
    void findNumbers9() {
        List<Long> list = List.of(-4L, 0L, 8L, 5L);
        assertEquals("5 8", GreatestMultiplication.findNumbers(list));
    }

    @Test
    void findNumbers10() {
        List<Long> list = List.of(0L, 0L, 0L, 0L);
        assertEquals("0 0", GreatestMultiplication.findNumbers(list));
    }
}
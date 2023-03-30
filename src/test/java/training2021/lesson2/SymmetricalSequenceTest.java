package training2021.lesson2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricalSequenceTest {

    @Test
    void make1() {
        List<Integer> list = List.of(1, 2, 3, 5, 3, 2, 1);
        assertEquals(0, SymmetricalSequence.makeSymmetrical(list, 7).size());
    }

    @Test
    void make2() {
        List<Integer> list = List.of(1, 2, 3, 5, 3);
        assertEquals(2, SymmetricalSequence.makeSymmetrical(list, 5).size());
    }

    @Test
    void make3() {
        List<Integer> list = List.of(1, 2, 3, 5);
        assertEquals(3, SymmetricalSequence.makeSymmetrical(list, 4).size());
    }

    @Test
    void symmetrical() {
        List<Integer> list = List.of(1, 2, 3, 5, 3, 2, 1);
        assertTrue(SymmetricalSequence.symmetrical(list));
    }

    @Test
    void symmetrical1() {
        List<Integer> list = List.of(1, 2, 3, 3, 2, 1);
        assertTrue(SymmetricalSequence.symmetrical(list));
    }

    @Test
    void symmetrical2() {
        List<Integer> list = List.of(1, 2, 3, 5, 2, 1);
        assertFalse(SymmetricalSequence.symmetrical(list));
    }

    @Test
    void symmetrical3() {
        List<Integer> list = List.of(2, 3, 3, 2, 1);
        assertFalse(SymmetricalSequence.symmetrical(list));
    }
}
package training2021.lesson2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindTypeOfSequenceTest {

    @Test
    void findType1() {
        List<Long> asc = List.of(1L, 3L, 8L, 222L, -2000000000L, -2L);
        assertEquals("ASCENDING", FindTypeOfSequence.findType(asc));
    }
    @Test
    void findType2() {
        List<Long> desc = List.of(11111L, 3333L, 800L, 222L);
        assertEquals("DESCENDING", FindTypeOfSequence.findType(desc));
    }
    @Test
    void findType3() {
        List<Long> rnd = List.of(11L, 3L, 8L, 222L);
        assertEquals("RANDOM", FindTypeOfSequence.findType(rnd));
    }
    @Test
    void findType4() {
        List<Long> cons = List.of(11L, 11L, 11L, 11L, -2000000000L, 12L);
        assertEquals("CONSTANT", FindTypeOfSequence.findType(cons));
    }
    @Test
    void findType5() {
        List<Long> wAsc = List.of(1L, 3L, 8L, 8L, 222L);
        assertEquals("WEAKLY ASCENDING", FindTypeOfSequence.findType(wAsc));
    }

    @Test
    void findType6() {
        List<Long> wDesc = List.of(11111L, 3333L, 3333L, 800L, 222L);
        assertEquals("WEAKLY DESCENDING", FindTypeOfSequence.findType(wDesc));
    }
}
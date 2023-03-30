package training2021.lesson1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AmbulanceTest {

    @Test
    void testLevels1() {
        List<Integer> list1 = List.of(89, 20, 41, 1, 11);
        assertEquals("2 3", Ambulance.findLevel(list1));
    }

    @Test
    void testLevels2() {
        List<Integer> list1 = List.of(11, 1, 1, 1, 1);
        assertEquals("0 1", Ambulance.findLevel(list1));
    }

    @Test
    void testLevels3() {
        List<Integer> list1 = List.of(3, 2, 2, 2, 1);
        assertEquals("-1 -1", Ambulance.findLevel(list1));
    }
}
package training2021.lesson3;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionTest {

    @Test
    void findIntersections() {
        List<Integer> one = List.of(1, 3, 2);
        List<Integer> two = List.of(4, 3, 2);
        assertEquals(List.of(2, 3), Intersection.findIntersections(one, two));
    }

    @Test
    void findIntersections1() {
        List<Integer> one = List.of(1, 2, 6, 4, 5, 7);
        List<Integer> two = List.of(10, 2, 3, 4, 8);
        assertEquals(List.of(2, 4), Intersection.findIntersections(one, two));
    }

    @Test
    void findIntersections2() {
        List<Integer> one = List.of(1, 3, 2, 9, 7, 5);
        List<Integer> two = List.of(4, 3, 2, 1, 9, 7, 5);
        assertEquals(List.of(1, 2, 3, 5, 7, 9), Intersection.findIntersections(one, two));
    }
}
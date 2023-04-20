package training2023;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CTest {

    @Test
    void solveTaskC1() {
        Integer[] wagons = new Integer[] {3, 2, 1};
        assertEquals("YES", WagonSorting.sortWagons(wagons));
    }

    @Test
    void solveTaskC2() {
        Integer[] wagons = new Integer[] {4, 1, 3, 2};
        assertEquals("YES", WagonSorting.sortWagons(wagons));
    }

    @Test
    void solveTaskC3() {
        Integer[] wagons = new Integer[] {2, 3, 1};
        assertEquals("NO", WagonSorting.sortWagons(wagons));
    }
}
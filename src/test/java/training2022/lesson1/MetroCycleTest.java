package training2022.lesson1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MetroCycleTest {

    @Test
    void findMinStations1() {
        assertEquals(0, MetroCycle.findMinStations(new Integer[]{100, 5, 6}));
    }

    @Test
    void findMinStations2() {
        assertEquals(1, MetroCycle.findMinStations(new Integer[]{10, 1, 9}));
    }

    @Test
    void findMinStations3() {
        assertEquals(3, MetroCycle.findMinStations(new Integer[]{10, 10, 6}));
    }

    @Test
    void findMinStations4() {
        assertEquals(3, MetroCycle.findMinStations(new Integer[]{10, 10, 4}));
    }
}
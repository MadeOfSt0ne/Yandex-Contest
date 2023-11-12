package leetcode.Matrix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BusRoutesTest {

    @Test
    void numBusesTest1() {
        int[][] routes = {{1, 2, 7}, {3, 6, 7}};
        int source = 1;
        int target = 6;
        Assertions.assertEquals(2, BusRoutes.numBusesToDestination(routes, source, target));
    }

    @Test
    void numBusesTest2() {
        int[][] routes = {{7, 12}, {4, 5, 15}, {6}, {15, 19}, {9, 12, 13}};
        int source = 15;
        int target = 12;
        Assertions.assertEquals(-1, BusRoutes.numBusesToDestination(routes, source, target));
    }
}
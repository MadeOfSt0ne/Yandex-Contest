package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximizeDistanceToClosestPersonTest {

    @Test
    void maxDistanceToClosest1() {
        int[] seats = {1, 0, 0, 0, 1, 0, 1, 0, 0, 0};
        assertEquals(3, MaximizeDistanceToClosestPerson.maxDistanceToClosest2(seats));
    }

    @Test
    void maxDistanceToClosest2() {
        int[] seats = {1, 0, 0, 0};
        assertEquals(3, MaximizeDistanceToClosestPerson.maxDistanceToClosest(seats));
    }

    @Test
    void maxDistanceToClosest3() {
        int[] seats = {1, 0};
        assertEquals(1, MaximizeDistanceToClosestPerson.maxDistanceToClosest(seats));
    }
}
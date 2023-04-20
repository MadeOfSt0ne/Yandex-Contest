package training2023;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DTest {

    //-1 4 3 4 -1 6 9 8 9 -1
    @Test
    void solveTaskD1() {
        String str = "1 2 3 2 1 4 2 5 3 1";
        assertEquals(0, GreatLinelandRelocation.findClosestSmallest(str));
    }

}
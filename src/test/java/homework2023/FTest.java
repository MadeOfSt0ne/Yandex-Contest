package homework2023;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FTest {

    @Test
    void solveTaskF1() {
        List<Integer[]> list = List.of(new Integer[]{1, 3}, new Integer[]{4, 7}, new Integer[]{3, 4});
        assertEquals(1, F.solveTaskF(3, list));
    }

    @Test
    void solveTaskF2() {
        List<Integer[]> list = List.of(new Integer[]{1, 3}, new Integer[]{4, 5}, new Integer[]{7, 8}, new Integer[]{4, 6});
        assertEquals(3, F.solveTaskF(4, list));
    }

    @Test
    void solveTaskF3() {
        List<Integer[]> list = List.of(new Integer[]{1, 1}, new Integer[]{1, 1}, new Integer[]{1, 1}, new Integer[]{1, 1});
        assertEquals(1, F.solveTaskF(4, list));
    }

    @Test
    void solveTaskF4() {
        List<Integer[]> list = List.of(new Integer[]{1, 4}, new Integer[]{4, 7}, new Integer[]{1, 3});
        assertEquals(2, F.solveTaskF(3, list));
    }
}
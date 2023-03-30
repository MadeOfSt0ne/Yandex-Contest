package homework2023;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumInRectangleTest {

    @Test
    void solveTaskJ1() {
        Integer[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer[]> list = new ArrayList<>();
        list.add(new Integer[]{2, 2, 3, 3});
        list.add(new Integer[]{1, 1, 2, 3});
        assertEquals(0, SumInRectangle.findSum(arr, list));
    }

}
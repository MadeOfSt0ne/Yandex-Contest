package homework2023;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MinRectangleTest {

    @Test
    void solveTaskI1() {
        List<Integer[]> list = new ArrayList<>();
        list.add(new Integer[] {1, 1});
        list.add(new Integer[] {1, 10});
        list.add(new Integer[] {5, 5});
        assertEquals(0, MinRectangle.findMinRectangle(list));
    }

}
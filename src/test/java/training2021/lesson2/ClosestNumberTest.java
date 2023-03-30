package training2021.lesson2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClosestNumberTest {

    @Test
    void findClosest() {
        List<Integer> list = List.of(1, 3, 10, 6);
        int target = 9;
        assertEquals(10, ClosestNumber.findClosest(list, target));

        List<Integer> list1 = List.of(1, 3, 10, 6, 8);
        int target1 = 9;
        assertEquals(10, ClosestNumber.findClosest(list1, target1));

        List<Integer> list2 = List.of(3, 3, 3, 3);
        int target2 = 9;
        assertEquals(3, ClosestNumber.findClosest(list2, target2));

        List<Integer> list3 = List.of(1, 3, 10, 6);
        int target3 = -9;
        assertEquals(1, ClosestNumber.findClosest(list3, target3));

        List<Integer> list4 = List.of(-11, -8, 3, 10, 6);
        int target4 = -9;
        assertEquals(-8, ClosestNumber.findClosest(list4, target4));

        List<Integer> list5 = List.of(-1, 5, 10, -6);
        int target5 = 1;
        assertEquals(-1, ClosestNumber.findClosest(list5, target5));
    }
}
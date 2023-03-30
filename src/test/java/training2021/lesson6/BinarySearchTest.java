package training2021.lesson6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {

    @Test
    void search1() {
        Integer[] nk = {1, 61, 126, 217, 2876, 6127, 39162, 98126, 712687, 1000000000};
        Integer[] distance = {100, 6127, 1, 61, 200, -10000, 1, 217, 10000, 1000000000};
        assertEquals(0, BinarySearch.search(nk, distance));
    }

    @Test
    void search2() {
        Integer[] nk = {-8, -6, -4, -4, -2, -1, 0, 2, 3, 3};
        Integer[] distance = {8, 3, -3, -2, 2, -1, 2, 9, -8, 0};
        assertEquals(0, BinarySearch.search(nk, distance));
    }


}
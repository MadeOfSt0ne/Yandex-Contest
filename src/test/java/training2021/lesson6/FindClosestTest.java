package training2021.lesson6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindClosestTest {

    @Test
    void search1() {
        Integer[] nk = {1, 61, 126, 217, 2876, 6127, 39162, 98126, 712687, 1000000000};
        Integer[] distance = {100, 6127, 1, 61, 200, -10000, 1, 217, 10000, 1000000000};
        assertEquals(0, FindClosest.search(nk, distance));
    }

    @Test
    void search2() {
        Integer[] nk = {1, 3, 5, 7, 9};
        Integer[] distance = {2, 4, 8, 1, 6};
        assertEquals(0, FindClosest.search(nk, distance));
    }

    @Test
    void search3() {
        Integer[] nk = {1, 1, 4, 4, 8, 120};
        Integer[] distance = {1, 2, 3, 4, 5, 6, 7, 8, 63, 64, 65};
        assertEquals(0, FindClosest.search(nk, distance));
    }

    @Test
    void search4() {
        Integer[] nk = {-5, 1, 1, 3, 5, 5, 8, 12, 13, 16};
        Integer[] distance = {0, 3, 7, -17, 23, 11, 0, 11, 15, 7};
        assertEquals(0, FindClosest.search(nk, distance));
    }
}
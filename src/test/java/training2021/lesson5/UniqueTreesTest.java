package training2021.lesson5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueTreesTest {

    @Test
    void countTrees1() {
        Integer[] nk = {5, 3};
        Integer[] distance = {1, 2, 1, 3, 2};
        assertEquals(0, UniqueTrees.countTrees(nk, distance));
    }

    @Test
    void countTrees2() {
        Integer[] nk = {6, 4};
        Integer[] distance = {2, 4, 2, 3, 3, 1};
        assertEquals(0, UniqueTrees.countTrees(nk, distance));
    }

    @Test
    void countTrees3() {
        Integer[] nk = {6, 6};
        Integer[] distance = {2, 4, 3, 5, 6, 1};
        assertEquals(0, UniqueTrees.countTrees(nk, distance));
    }

    @Test
    void countTrees4() {
        Integer[] nk = {10, 4};
        Integer[] distance = {2, 4, 2, 3, 3, 1, 2, 3, 4, 1};
        assertEquals(0, UniqueTrees.countTrees(nk, distance));
    }

    @Test
    void countTrees5() {
        Integer[] nk = {6, 1};
        Integer[] distance = {1, 1, 1, 1, 1, 1};
        assertEquals(0, UniqueTrees.countTrees(nk, distance));
    }

    @Test
    void countTrees6() {
        Integer[] nk = {7, 2};
        Integer[] distance = {1, 1, 1, 1, 2, 2, 1};
        assertEquals(0, UniqueTrees.countTrees(nk, distance));
    }
}
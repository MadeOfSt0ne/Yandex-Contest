package training2021.lesson3;

import org.junit.jupiter.api.Test;

import java.util.List;

class CubesTest {

    @Test
    void findIntersections1() {
        /*Integer[] one = {0, 1, 10, 9};
        Integer[] two = {1, 3, 0};*/
        List<Integer> one = List.of(0, 1, 10, 9);
        List<Integer> two = List.of(1, 3, 0);
        Cubes.findIntersections(one, two);
    }

    @Test
    void findIntersections2() {
        /*Integer[] one = {1, 2};
        Integer[] two = {2, 3};*/
        List<Integer> one = List.of(1, 2);
        List<Integer> two = List.of(2, 3);
        Cubes.findIntersections(one, two);
    }

    @Test
    void findIntersections3() {
        /*Integer[] one = {};
        Integer[] two = {};*/
        List<Integer> one = List.of();
        List<Integer> two = List.of();
        Cubes.findIntersections(one, two);
    }
}
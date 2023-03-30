package training2021.lesson5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StylishWearTest {

    @Test
    void findClosest1() {
        Integer[] arr1 = {3, 4};
        Integer[] arr2 = {1, 2, 3};
        assertEquals(0, StylishWear.findClosest(arr1, arr2));
    }

    @Test
    void findClosest2() {
        Integer[] arr1 = {4, 5};
        Integer[] arr2 = {1, 2, 3};
        assertEquals(0, StylishWear.findClosest(arr1, arr2));
    }

    @Test
    void findClosest3() {
        Integer[] arr1 = {1, 2, 3, 4, 5};
        Integer[] arr2 = {1, 2, 3, 4, 5};
        assertEquals(0, StylishWear.findClosest(arr1, arr2));
    }

    @Test
    void findClosest4() {
        Integer[] arr1 = {10, 20, 37, 403, 499};
        Integer[] arr2 = {15, 24, 35, 400, 500};
        assertEquals(0, StylishWear.findClosest(arr1, arr2));
    }
}
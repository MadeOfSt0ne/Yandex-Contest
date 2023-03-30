package training2021.lesson5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfNumbersTest {

    @Test
    void countSum1() {
        Integer[] arr1 = {5, 17};
        Integer[] arr2 = {17, 7, 10, 7, 10};
        assertEquals(4, SumOfNumbers.countSum(arr1, arr2));
    }

    @Test
    void countSum2() {
        Integer[] arr1 = {5, 10};
        Integer[] arr2 = {1, 2, 3, 4, 1};
        assertEquals(2, SumOfNumbers.countSum(arr1, arr2));
    }
}
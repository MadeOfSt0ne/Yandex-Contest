package handbook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PolynomialTest {

    @Test
    void findSum1() {
        int[] s1 = {1, 2, 3, 4};
        int[] s2 = {1, 0, 0};
        assertEquals(0, Polynomial.findSum(s1, s2));
    }

    @Test
    void findSum2() {
        int[] s1 = {1};
        int[] s2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        assertEquals(0, Polynomial.findSum(s1, s2));
    }

    @Test
    void findSum3() {
        int[] s1 = {1, 1};
        int[] s2 = {1, 1};
        assertEquals(0, Polynomial.findSum(s1, s2));
    }
}
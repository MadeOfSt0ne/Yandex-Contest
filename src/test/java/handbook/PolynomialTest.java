package handbook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PolynomialTest {

    @Test
    void findSum1() {
        int a = 3;
        int[] s1 = {1, -2, 3, 4};
        int b = 2;
        int[] s2 = {1, 0, 0};
        assertEquals(0, Polynomial.findSum(a, b, s1, s2));
    }
}
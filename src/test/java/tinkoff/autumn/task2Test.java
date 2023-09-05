package tinkoff.autumn;

import org.junit.jupiter.api.Test;
import tinkoff.task2;

import static org.junit.jupiter.api.Assertions.*;

class task2Test {

    @Test
    void buildMatrix1() {
        int n = 3;
        int m = 3;
        assertEquals(0, task2.buildMatrix(n, m));
    }

    @Test
    void buildMatrix2() {
        int n = 4;
        int m = 3;
        assertEquals(0, task2.buildMatrix(n, m));
    }

    @Test
    void buildMatrix3() {
        int n = 1;
        int m = 1;
        assertEquals(0, task2.buildMatrix(n, m));
    }
}
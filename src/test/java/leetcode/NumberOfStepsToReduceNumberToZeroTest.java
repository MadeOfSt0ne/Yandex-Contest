package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfStepsToReduceNumberToZeroTest {

    @Test
    void numberOfSteps1() {
        int num = 14;
        assertEquals(6, NumberOfStepsToReduceNumberToZero.numberOfSteps(num));
    }
}
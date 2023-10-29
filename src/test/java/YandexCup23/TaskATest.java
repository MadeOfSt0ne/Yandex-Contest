package YandexCup23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskATest {

    @Test
    void countSum1() {
        long[] nums = {1, 1, 1};
        assertEquals(5, TaskA.countSum(nums));
    }
}
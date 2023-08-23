package FallWinter23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class A_NewStoryTest {

    @Test
    void countDays1() {
        long[] start = {980, 2, 12, 10, 30, 1};
        long[] end = {980, 3, 1, 10, 31, 37};
        assertEquals(0, A_NewStory.countDays(start, end));
    }

    @Test
    void countDays2() {
        long[] start = {1001, 5, 20, 14, 15, 16};
        long[] end = {9009, 9, 11, 12, 21, 11};
        assertEquals(0, A_NewStory.countDays(start, end));
    }

    @Test
    void countDays3() {
        long[] start = {980, 2, 12, 10, 30, 1};
        long[] end = {980, 2, 12, 10, 30, 3};
        assertEquals(0, A_NewStory.countDays(start, end));
    }
}
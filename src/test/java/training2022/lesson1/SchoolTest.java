package training2022.lesson1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    @Test
    void findPlace1() {
        assertEquals(2, School.findPlace(new Long[]{-1L, 2L, 3L, 4L}));
    }

    @Test
    void findPlace2() {
        assertEquals(0, School.findPlace(new Long[]{-1L, 0L, 1L}));
    }

    @Test
    void findPlace3() {
        assertEquals(-20, School.findPlace(new Long[]{-20L, -10L}));
    }

    @Test
    void findPlace4() {
        assertEquals(-5, School.findPlace(new Long[]{-20L, -10L, 3L, 4L}));
    }

    @Test
    void findPlace5() {
        assertEquals(25, School.findPlace(new Long[]{10L, 20L, 30L, 40L}));
    }

    @Test
    void findPlace6() {
        assertEquals(8, School.findPlace(new Long[]{-9L, -1L, 8L, 9L, 10L}));
    }

    @Test
    void findPlace7() {
        assertEquals(27, School.findPlace(new Long[]{0L, 1L, 2L, 4L, 11L, 14L, 15L, 18L, 26L, 27L, 28L, 31L, 35L
        , 37L, 52L, 53L, 66L, 76L}));
    }
}

package training2022.lesson1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatesTest {

    @Test
    void defineDate1() {
        assertEquals(0, Dates.defineDate(new Integer[]{1, 2, 2003}));
    }

    @Test
    void defineDate2() {
        assertEquals(1, Dates.defineDate(new Integer[]{2, 29, 2008}));
    }

    @Test
    void defineDate3() {
        assertEquals(1, Dates.defineDate(new Integer[]{12, 12, 2000}));
    }

    @Test
    void defineDate4() {
        assertEquals(0, Dates.defineDate(new Integer[]{10, 12, 2000}));
    }
}
package InternDaySummer23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LogWithoutDatesTest {

    @Test
    void countDays1() {
        String[] time ={"00:00:00", "00:01:11", "02:15:59", "23:59:58", "23:59:59"};
        assertEquals(1, LogWithoutDates.countDays(time));
    }

    @Test
    void countDays2() {
        String[] time = {"12:00:00", "23:59:59", "00:00:00"};
        assertEquals(2, LogWithoutDates.countDays(time));
    }

    @Test
    void countDays3() {
        String[] time = {"00:00:00", "00:00:00", "00:00:00", "00:00:00"};
        assertEquals(4, LogWithoutDates.countDays(time));
    }
}
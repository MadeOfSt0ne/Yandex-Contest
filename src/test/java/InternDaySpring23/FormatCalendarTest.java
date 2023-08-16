package InternDaySpring23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FormatCalendarTest {

    @Test
    void format() {
        String str = "30 Saturday";
        assertEquals(0, FormatCalendar.format(str));
    }
}
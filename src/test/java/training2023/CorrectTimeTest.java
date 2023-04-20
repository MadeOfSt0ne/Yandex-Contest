package training2023;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CorrectTimeTest {

    @Test
    void solveTaskG1() {
        String one = "01:30:45";
        String two = "23:30:00";
        String three = "10:30:48";
        assertEquals(0, CorrectTime.solveTaskG(one, two, three));
    }

}
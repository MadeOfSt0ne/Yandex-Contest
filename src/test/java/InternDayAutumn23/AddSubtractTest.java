package InternDayAutumn23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddSubtractTest {

    @Test
    void addSubtract1() {
        String s = "2023";
        assertEquals(2023, AddSubtract.addSubtract(s));
    }

    @Test
    void addSubtract2() {
        String s = "11-22-33";
        assertEquals(-44, AddSubtract.addSubtract(s));
    }

    @Test
    void addSubtract3() {
        String s = "20+20-3";
        assertEquals(37, AddSubtract.addSubtract(s));
    }
}
package tinkoff.autumn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class twoTest {

    @Test
    void countSheriffs1() {
        String s = "fheriherffazfszkisrrs";
        assertEquals(2, two.countSheriffs(s));
    }

    @Test
    void countSheriffs2() {
        String s = "rifftratatashe";
        assertEquals(1, two.countSheriffs(s));
    }

    @Test
    void countSheriffs3() {
        String s = "thegorillaiswatching";
        assertEquals(0, two.countSheriffs(s));
    }
}
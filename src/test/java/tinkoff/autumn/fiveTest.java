package tinkoff.autumn;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class fiveTest {

    @Test
    void findLength1() {
        int n = 2;
        List<String> s = List.of("1 2 6", "2 1 9");
        assertEquals(8, five.findLength(n, s));
    }

    @Test
    void findLength2() {
        int n = 8;
        List<String> s = List.of("1 2 8", "2 3 6", "2 3 2", "3 1 4", "5 4 1", "4 5 8");
        assertEquals(5, five.findLength(n, s));
    }
}
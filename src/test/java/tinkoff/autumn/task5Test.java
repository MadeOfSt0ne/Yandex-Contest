package tinkoff.autumn;

import org.junit.jupiter.api.Test;
import tinkoff.task5;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class task5Test {

    @Test
    void findLevel1() {
        int n = 2;
        List<String> list = List.of("1 2 100");
        assertEquals(100, task5.findLevel(n, list));
    }

    @Test
    void findLevel2() {
        int n = 4;
        List<String> list = List.of("1 2 100", "1 3 400", "2 3 300", "2 4 200", "3 4 500");
        assertEquals(300, task5.findLevel(n, list));
    }
}
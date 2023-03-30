package training2021.lesson5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TownCheTest {

    @Test
    void countMonuments() {
        Integer[] nk = {5, 9};
        Integer[] distance = {1, 3, 5, 8, 10};
        assertEquals(0, TownChe.countMonuments(nk, distance));
    }
}
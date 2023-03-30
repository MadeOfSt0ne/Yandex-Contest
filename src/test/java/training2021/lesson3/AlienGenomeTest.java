package training2021.lesson3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlienGenomeTest {

    @Test
    void countCommon() {
        String a = "ABBACAB";
        String b = "BCABB";
        assertEquals(4, AlienGenome.countCommon(a, b));
    }
}
package FallWinter23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class B_DiversityTest {

    @Test
    void playGame1() {
        int[] a = {1, 2};
        int[] b = {1, 2, 3, 4, 5};
        String[] s = {"1 A 3", "1 A 4", "1 A 5", "1 A 6", "1 A 7", "-1 A 1", "1 B 7", "-1 A 6", "-1 B 1", "1 A 7"};
        assertEquals(0, B_Diversity.playGame(a, b, s));
    }

    @Test
    void playGame2() {
        int[] a = {1000, 2000, 1001};
        int[] b = {1001, 2001, 1000};
        String[] s = {"1 A 10000", "-1 B 2001", "1 B 2000", "1 B 100001", "1 A 1"};
        assertEquals(0, B_Diversity.playGame(a, b, s));
    }

    @Test
    void playGame3() {
        int[] a = {1, 6, 7};
        int[] b = {2, 4, 5};
        String[] s = {"1 A 2", "1 B 1", "1 B 8", "1 B 5", "1 A 3", "1 A 2", "1 B 10", "1 A 9", "1 A 8", "1 B 7",
                "-1 A 1", "-1 B 5", "-1 B 5", "-1 B 4", "-1 A 6", "-1 A 8", "-1 A 2", "-1 B 8", "-1 B 10", "-1 A 2"};
        assertEquals(0, B_Diversity.playGame(a, b, s));
    }
}
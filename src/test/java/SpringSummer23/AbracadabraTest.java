package SpringSummer23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbracadabraTest {

    @Test
    void countPower1() {
        int[] nk = {3, 7};
        String s = "abz";
        int[] pos = {3, 1, 2};
        int[] move = {4, 0, 3};
        assertEquals(74, Abracadabra.countPower(nk, s, pos, move));
    }

    @Test
    void countPower2() {
        int[] nk = {4, 6};
        String s = "abcd";
        int[] pos = {2, 3, 1, 4};
        int[] move = {1, 0, 2, 13};
        assertEquals(62, Abracadabra.countPower(nk, s, pos, move));
    }

    @Test
    void countPower3() {
        int[] nk = {10, 1000000000};
        String s = "qwertzxcvb";
        int[] pos = {2, 3, 4, 5, 3, 4, 8, 7, 10, 2};
        int[] move = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(259999995297L, Abracadabra.countPower(nk, s, pos, move));
    }
}
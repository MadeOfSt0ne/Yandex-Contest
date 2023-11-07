package leetcode.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EliminateMaxNumberOfMonstersTest {

    @Test
    void eliminateMax1() {
        int[] dist = {1, 3, 4};
        int[] speed = {1, 1, 1};
        assertEquals(3, EliminateMaxNumberOfMonsters.eliminateMax(dist, speed));
    }

    @Test
    void eliminateMax2() {
        int[] dist = {1, 1, 2, 3};
        int[] speed = {1, 1, 1, 1};
        assertEquals(1, EliminateMaxNumberOfMonsters.eliminateMax(dist, speed));
    }

    @Test
    void eliminateMax3() {
        int[] dist = {3, 2, 4};
        int[] speed = {5, 3, 2};
        assertEquals(1, EliminateMaxNumberOfMonsters.eliminateMax(dist, speed));
    }

    @Test
    void eliminateMax4() {
        int[] dist = {4, 3, 4};
        int[] speed = {1, 1, 2};
        assertEquals(3, EliminateMaxNumberOfMonsters.eliminateMax(dist, speed));
    }
}
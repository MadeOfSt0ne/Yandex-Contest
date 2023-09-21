package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest {

    @Test
    void isHappy1() {
        int n = 19;
        assertTrue(HappyNumber.isHappy(n));
    }
}
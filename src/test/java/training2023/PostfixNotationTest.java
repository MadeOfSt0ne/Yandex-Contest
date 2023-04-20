package training2023;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostfixNotationTest {

    @Test
    void solveTaskB1() {
        String str = "8 9 + 1 7 - *";
        assertEquals(-102, PostfixNotation.solveTaskB(str));
    }

    @Test
    void solveTaskB2() {
        String str = "8 9 +";
        assertEquals(17, PostfixNotation.solveTaskB(str));
    }
}
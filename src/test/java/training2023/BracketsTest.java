package training2023;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketsTest {

    @Test
    void solveTaskH1() {
        String str = "()[]";
        assertEquals("yes", Brackets.countBrackets(str));
    }

    @Test
    void solveTaskH2() {
        String str = "([)]";
        assertEquals("no", Brackets.countBrackets(str));
    }

    @Test
    void solveTaskH3() {
        String str = "(";
        assertEquals("no", Brackets.countBrackets(str));
    }

    @Test
    void solveTaskH4() {
        String str = "([]{})()[{}]";
        assertEquals("yes", Brackets.countBrackets(str));
    }
}
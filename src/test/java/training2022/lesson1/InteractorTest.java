package training2022.lesson1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InteractorTest {

    @Test
    void findVerdict1() {
        assertEquals(0, Interactor.findVerdict(0, 0, 0));
    }

    @Test
    void findVerdict2() {
        assertEquals(3, Interactor.findVerdict(-1, 0, 1));
    }

    @Test
    void findVerdict3() {
        assertEquals(6, Interactor.findVerdict(42, 1, 6));
    }

    @Test
    void findVerdict4() {
        assertEquals(1, Interactor.findVerdict(44, 7, 4));
    }

    @Test
    void findVerdict5() {
        assertEquals(3, Interactor.findVerdict(1, 4, 0));
    }

    @Test
    void findVerdict6() {
        assertEquals(2, Interactor.findVerdict(-3, 2, 4));
    }
}
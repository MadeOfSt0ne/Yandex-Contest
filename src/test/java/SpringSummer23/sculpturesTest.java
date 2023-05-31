package SpringSummer23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sculpturesTest {

    @Test
    void countSculptures1() {
        long[] nxt = {3, 5 , 2};
        long[] sculptures = {5, 10, 6};
        assertEquals(0, Sculptures.countS(nxt, sculptures));
    }

    @Test
    void countSculptures2() {
        long[] nxt = {5, 19, 32};
        long[] sculptures = {36, 10, 72, 4, 50};
        assertEquals(0, Sculptures.countS(nxt, sculptures));
    }

    @Test
    void countSculptures3() {
        long[] nxt = {4, 25, 10};
        long[] sculptures = {1, 10, 42, 9};
        assertEquals(0, Sculptures.countS(nxt, sculptures));
    }
}
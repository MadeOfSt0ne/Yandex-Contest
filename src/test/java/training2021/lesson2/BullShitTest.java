package training2021.lesson2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BullShitTest {

    @Test
    void findPosition() {
        Integer[] list = {1, 5, 5, 1};
        assertEquals(1, BullShit.findPosition(list));
    }

    @Test
    void findPosition2() {
        Integer[] list = {20, 15, 10, 20, 15, 17};
        assertEquals(4, BullShit.findPosition(list));
    }

    @Test
    void findPosition3() {
        Integer[] list = {23, 12, 8, 23, 15};
        assertEquals(0, BullShit.findPosition(list));
    }

    @Test
    void findPosition4() {
        Integer[] list = {10, 27, 15, 17, 11, 30, 25, 23};
        assertEquals(3, BullShit.findPosition(list));
    }

    @Test
    void findPosition5() {
        Integer[] list = {20, 15, 17};
        assertEquals(0, BullShit.findPosition(list));
    }

    @Test
    void findPosition6() {
        Integer[] list = {10, 20, 12, 7, 11, 30, 29, 23};
        assertEquals(0, BullShit.findPosition(list));
    }

    @Test
    void findPosition7() {
        Integer[] list = {10, 20, 12, 7, 15, 11, 29, 23};
        assertEquals(0, BullShit.findPosition(list));
    }

    @Test
    void findPosition8() {
        Integer[] list = {15, 15, 15};
        assertEquals(0, BullShit.findPosition(list));
    }

    @Test
    void findPosition9() {
        Integer[] list = {20, 15, 12, 20, 15, 11, 20, 15, 1};
        assertEquals(4, BullShit.findPosition(list));
    }

    @Test
    void findPosition10() {
        Integer[] list = {50, 45, 12, 51, 15, 11, 50, 35, 1, 25, 10};
        assertEquals(7, BullShit.findPosition(list));
    }

    @Test
    void findPosition11() {
        Integer[] list = {1000, 995, 990};
        assertEquals(2, BullShit.findPosition(list));
    }
}
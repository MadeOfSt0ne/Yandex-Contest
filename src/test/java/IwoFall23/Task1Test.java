package IwoFall23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void countMin1() {
        int ports = 1;
        int gadgets = 3;
        int usb2 = 1;
        int usb5 = 10;
        assertEquals(2, Task1.countMin(ports, gadgets, usb2, usb5));
    }

    @Test
    void countMin2() {
        int ports = 2;
        int gadgets = 4;
        int usb2 = 9;
        int usb5 = 10;
        assertEquals(10, Task1.countMin(ports, gadgets, usb2, usb5));
    }

    @Test
    void countMin3() {
        int ports = 3;
        int gadgets = 8;
        int usb2 = 9;
        int usb5 = 10;
        assertEquals(19, Task1.countMin(ports, gadgets, usb2, usb5));
    }
}
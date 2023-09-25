package IwoFall23;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void countMax1() {
        Task3.parents.put(1, 0);
        Task3.parents.put(2, 0);
        Task3.parents.put(3, 1);
        assertEquals(3, Task3.countMaxx());
    }

    @Test
    void countMax2() {
        Task3.parents.put(1, 0);
        Task3.parents.put(2, 1);
        Task3.parents.put(3, 2);
        Task3.parents.put(4, 0);
        Task3.parents.put(5, 4);
        Task3.parents.put(6, 5);
        Task3.parents.put(7, 6);
        Task3.parents.put(8, 4);
        assertEquals(7, Task3.countMaxx());
    }

    @Test
    void countMax3() {
        Task3.parents.put(1, 0);
        Task3.parents.put(2, 1);
        Task3.parents.put(3, 2);
        Task3.parents.put(4, 3);
        Task3.parents.put(5, 4);
        Task3.parents.put(6, 5);
        Task3.parents.put(7, 6);
        Task3.parents.put(8, 7);
        assertEquals(8, Task3.countMaxx());
    }
}
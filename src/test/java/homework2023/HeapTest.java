package homework2023;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HeapTest {

    @Test
    void makeHeap1() {
        List<String> list = List.of("0 10000", "1");
        assertEquals(0, Heap.makeHeap(list));
    }

    @Test
    void makeHeap2() {
        List<String> list = List.of("0 1", "0 345", "1", "0 2435", "1", "0 235", "0 5", "0 365", "1", "1", "1", "1");
        assertEquals(0, Heap.makeHeap(list));
    }

}
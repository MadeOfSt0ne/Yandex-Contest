package tinkoff.autumn;

import org.junit.jupiter.api.Test;
import tinkoff.task3;

import static org.junit.jupiter.api.Assertions.*;

class task3Test {

    @Test
    void printShelves1() {
        String[] events = {"+ 11", "+ 1", "- 11", "+ 2", "- 2", "+ 3", "+ 2", "- 1"};
        assertEquals(0, task3.printShelves(events));
    }
}
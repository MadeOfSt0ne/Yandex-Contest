package training2021.lesson1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoNotebooksTest {
//5 7 3 2
    @Test
    void findArea() {
        assertEquals("9 5", TwoNotebooks.findArea(List.of(5, 7, 3, 2)));
    }
}
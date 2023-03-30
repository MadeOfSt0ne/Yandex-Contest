package training2021.lesson4;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PyramidTest {

    @Test
    void findHeight() {
        Long[] list1 = {3L, 1L};
        Long[] list2 = {2L, 2L};
        Long[] list3 = {3L, 3L};
        assertEquals(5, Pyramid.findHeight(List.of(list1, list2, list3)));
    }
}
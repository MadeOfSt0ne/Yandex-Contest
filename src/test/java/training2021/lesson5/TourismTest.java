package training2021.lesson5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TourismTest {

    @Test
    void countHeight1() {
        List<Integer[]> peaks = List.of(new Integer[]{2, 1}, new Integer[]{4, 5}, new Integer[]{7, 4}, new Integer[]{8, 2},
                new Integer[]{9, 6}, new Integer[]{11, 3}, new Integer[]{15, 3});
        List<Integer[]> traces = new ArrayList<>();
        Integer[] arr = {2, 6};
        traces.add(arr);
        assertEquals(0, Tourism.countHeight(peaks, traces));
    }

    @Test
    void countHeight2() {
        List<Integer[]> peaks = List.of(new Integer[]{1, 1}, new Integer[]{3, 2}, new Integer[]{5, 6}, new Integer[]{7, 2},
                new Integer[]{10, 4}, new Integer[]{11, 1});
        List<Integer[]> traces = List.of(new Integer[]{5, 6}, new Integer[]{1, 4}, new Integer[]{4, 2});
        assertEquals(0, Tourism.countHeight(peaks, traces));
    }

    @Test
    void countHeight3() {
        Integer[] arr = {4, 8};
        List<Integer[]> peaks = new ArrayList<>();
        peaks.add(arr);
        List<Integer[]> traces = List.of(new Integer[]{1, 1}, new Integer[]{1, 1}, new Integer[]{1, 1});
        assertEquals(0, Tourism.countHeight(peaks, traces));
    }
}
package training2021.lesson1;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DetailsTest {

    @Test
    void countDetails() {
        LocalTime start = LocalTime.now();
        System.out.println("Start time: " + start);
        assertEquals(999999, Details.countDetails(List.of(2000000, 3, 2)));
        LocalTime end = LocalTime.now();
        System.out.println("End time: " + end);
    }
}
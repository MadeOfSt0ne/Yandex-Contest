package training2021.lesson2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MusicalTriangleTest {

    @Test
    void findRange1() {
        List<MusicalTriangle.Record> list = List.of(new MusicalTriangle.Record(440, null),
                new MusicalTriangle.Record(220, "closer"),
                new MusicalTriangle.Record(300, "further"));
        assertEquals("30.0 260.0", MusicalTriangle.findRange(list));
    }

    @Test
    void findRange2() {
        List<MusicalTriangle.Record> list = List.of(new MusicalTriangle.Record(554, null),
                new MusicalTriangle.Record(880, "further"),
                new MusicalTriangle.Record(440, "closer"),
                new MusicalTriangle.Record(622, "closer"));
        assertEquals("531.0 660.0", MusicalTriangle.findRange(list));
    }

    @Test
    void findRange3() {
        List<MusicalTriangle.Record> list = List.of(new MusicalTriangle.Record(3000, null),
                new MusicalTriangle.Record(1000, "further"),
                new MusicalTriangle.Record(2200, "closer"),
                new MusicalTriangle.Record(2400, "closer"));
        assertEquals("2300.0 4000.0", MusicalTriangle.findRange(list));
    }

    @Test
    void findRange4() {
        List<MusicalTriangle.Record> list = List.of(new MusicalTriangle.Record(3000, null),
                new MusicalTriangle.Record(2500, "closer"),
                new MusicalTriangle.Record(2400, "closer"),
                new MusicalTriangle.Record(2200, "closer"));
        assertEquals("30.0 2300.0", MusicalTriangle.findRange(list));
    }

    @Test
    void findRange5() {
        List<MusicalTriangle.Record> list = List.of(new MusicalTriangle.Record(3000, null),
                new MusicalTriangle.Record(2500, "closer"),
                new MusicalTriangle.Record(2400, "closer"),
                new MusicalTriangle.Record(1600, "further"));
        assertEquals("2000.0 2450.0", MusicalTriangle.findRange(list));
    }

    @Test
    void findRange6() {
        List<MusicalTriangle.Record> list = List.of(new MusicalTriangle.Record(3000, null),
                new MusicalTriangle.Record(2500, "closer"),
                new MusicalTriangle.Record(2000, "further"),
                new MusicalTriangle.Record(1600, "further"));
        assertEquals("2250.0 2750.0", MusicalTriangle.findRange(list));
    }
}
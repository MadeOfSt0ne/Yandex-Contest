package InternBackendMeetup2023.yandex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YandexMedianTest {

    @Test
    void findMedian1() {
        String str = "01001";
        assertEquals(0, YandexMedian.findIndexes(str));
    }

    @Test
    void findMedian2() {
        String str = "01011";
        assertEquals(0, YandexMedian.findIndexes(str));
    }

    @Test
    void findMedian3() {
        String str = "0010";
        assertEquals(0, YandexMedian.findIndexes(str));
    }
}
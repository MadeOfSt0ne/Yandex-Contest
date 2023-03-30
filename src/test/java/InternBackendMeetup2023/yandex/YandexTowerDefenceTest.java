package InternBackendMeetup2023.yandex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YandexTowerDefenceTest {

    @Test
    void guardians1() {
        Long[] arr1 = {5L, 4L};
        Long[] arr2 = {100L, 98L, 96L, 40L, 30L};
        Long[] arr3 = {2L, 4L, 60L, 3L};
        assertEquals(3, YandexTowerDefence.guardians(arr2, arr3));
    }

    @Test
    void guardians2() {
        Long[] arr1 = {5L, 3L};
        Long[] arr2 = {7L, 3L, 4L, 2L, 2L};
        Long[] arr3 = {3L, 2L, 1L};
        assertEquals(3, YandexTowerDefence.guardians(arr2, arr3));
    }

    @Test
    void guardians3() {
        Long[] arr1 = {2L, 1L};
        Long[] arr2 = {2L, 10L};
        Long[] arr3 = {11L};
        assertEquals(0, YandexTowerDefence.guardians(arr2, arr3));
    }
}
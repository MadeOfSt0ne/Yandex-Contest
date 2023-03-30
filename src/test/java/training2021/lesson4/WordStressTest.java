package training2021.lesson4;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordStressTest {

    @Test
    void countMistakes() {
        List<String> right = List.of("cAnnot", "cannOt", "fOund", "pAge");
        String target = "thE pAge cAnnot be fouNd";
        assertEquals(2, WordStress.countMistakes(right, target));
    }

    @Test
    void countMistakes1() {
        List<String> right = List.of("cAnnot", "cannOt", "fOund", "pAge");
        String target = "The PAGE cannot be found";
        assertEquals(4, WordStress.countMistakes(right, target));
    }

    @Test
    void countMistakes2() {
        List<String> right = List.of("cAnnot", "cannOt", "fOund", "pAge");
        String target = "";
        assertEquals(0, WordStress.countMistakes(right, target));
    }

    @Test
    void countMistakes3() {
        List<String> right = List.of("Xu", "xU");
        String target = "NJ xu xU xu";
        assertEquals(3, WordStress.countMistakes(right, target));
    }
}
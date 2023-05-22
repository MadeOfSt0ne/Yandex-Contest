package InternDay2023;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DiversityAssessmentTest {

    @Test
    void countDiversity1() {
        List<String> list = List.of("1 1", "2 1", "3 1", "4 2", "5 2");
        String order = "1 4 2 5 3";
        assertEquals(2, DiversityAssessment.countDiversity(list, order));
    }

    @Test
    void countDiversity2() {
        List<String> list = List.of("1 1", "2 2", "3 3", "4 4", "5 5");
        String order = "1 2 3 4 5";
        assertEquals(5, DiversityAssessment.countDiversity(list, order));
    }

    @Test
    void countDiversity3() {
        List<String> list = List.of("1 1", "2 2", "3 3", "4 4", "5 5");
        String order = "1";
        assertEquals(1, DiversityAssessment.countDiversity(list, order));
    }
}
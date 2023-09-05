package tinkoff.autumn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sixTest {

    @Test
    void answerQuestions() {
        int n = 7;
        String[] s = {"2 3 1", "3 3", "1 2 4", "2 1 1", "3 4", "2 3 4", "1 3 4", "3 4", "1 7 3", "1 1 3", "3 7", "3 1",
                "2 7 4"};
        assertEquals(0, six.answerQuestions(n, s));
    }
}
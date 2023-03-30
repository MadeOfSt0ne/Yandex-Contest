package training2021.lesson4;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppearanceNumberTest {

    @Test
    void countWords() {
        List<String> list = List.of(" She sells sea shells on the sea shore; \n", "The shells that she sells are sea shells I'm sure.",
                "So if she sells sea shells on the sea shore,", "I'm sure that the shells are sea shore shells.");
        assertEquals(0, AppearanceNumber.countWords(list));
    }
}
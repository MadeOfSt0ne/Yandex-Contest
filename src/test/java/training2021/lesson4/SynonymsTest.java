package training2021.lesson4;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SynonymsTest {

    @Test
    void findSynonym() {
        List<String> list1 = List.of("Hello", "Hi");
        List<String> list2 = List.of("Bye", "Goodbye");
        List<String> list3 = List.of("List", "Array");
        assertEquals("Bye", Synonyms.findSynonym(List.of(list1, list2, list3), "Goodbye"));
    }

    @Test
    void findSynonym1() {
        List<String> list1 = List.of("Ololo", "Ololo");
        List<String> list2 = List.of("Numbers", "1234567890");
        assertEquals("1234567890", Synonyms.findSynonym(List.of(list1, list2), "Numbers"));
    }
}
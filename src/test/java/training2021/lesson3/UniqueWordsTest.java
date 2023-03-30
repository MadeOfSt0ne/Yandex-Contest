package training2021.lesson3;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordsTest {

    // She sells sea shells on the sea shore;
    //The shells that she sells are sea shells I'm sure.
    //So if she sells sea shells on the sea shore,
    //I'm sure that the shells are sea shore shells.
    /*@Test
    void countWords() {
        List<String> list1 = List.of("She", "sells", "sea", "shells", "on", "the", "sea", "shore;");
        List<String> list2 = List.of("The", "shells", "that", "she", "sells", "are", "sea", "shells", "I'm", "sure.");
        List<String> list3 = List.of("So", "if", "she", "sells", "sea", "shells", "on", "the", "sea", "shore,");
        List<String> list4 = List.of("I'm", "sure", "that", "the", "shells", "are", "sea", "shore", "shells.");
        assertEquals(19, UniqueWords.countWords(List.of(list1, list2, list3, list4)));
    }*/

    /*@Test
    void countWords2() {
        List<String> list1 = List.of("She", "sells", "sea", "shells", "on", "the", "sea", "shore;", "The"
                , "shells", "that", "she", "sells", "are", "sea", "shells", "I'm", "sure."
                , "So", "if", "she", "sells", "sea", "shells", "on", "the", "sea", "shore,"
                , "I'm", "sure", "that", "the", "shells", "are", "sea", "shore", "shells.");
        assertEquals(19, UniqueWords.countWords(list1));
    }*/

    @Test
    void countWords3() {
        List<String> list = List.of(" She sells sea shells on the sea shore; \n", "The shells that she sells are sea shells I'm sure.",
                "So if she sells sea shells on the sea shore,", "I'm sure that the shells are sea shore shells.");
        assertEquals(19, UniqueWords.countWords(list));
    }
}
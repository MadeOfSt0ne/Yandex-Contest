package training2021.lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SalesTest {

    @Test
    void countGoods() {
        List<String> list = List.of("Ivanov paper 10", "Petrov pens 5", "Ivanov marker 3", "Ivanov paper 7",
                "Petrov envelope 20", "Ivanov envelope 5");
        Assertions.assertEquals(0, Sales.countGoods(list));
    }
}
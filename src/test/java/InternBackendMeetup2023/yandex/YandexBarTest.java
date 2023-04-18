package InternBackendMeetup2023.yandex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YandexBarTest {

    @Test
    void cocktail1() {
        String[] array = {"\\             /", ".|           |.", ".|           |.", "..\\         /..",
        "...|       |...", "...|       |...", "....\\     /....", ".....\\___/....."};
        String[] arr2 = {"gin 2 %", "tonic 4 *"};
        assertEquals(0, YandexBar.makeCocktail(array, arr2));
    }

    @Test
    void cocktail2() {
        String[] array = {".........\\   /.........", "........./   \\.........", "......../     \\........",
        "......./       \\.......", "....../         \\......", "...../           \\.....", "..../             \\....",
        ".../               \\...", "../                 \\..", "./___________________\\."};
        String[] arr2 = {"acid 5 X"};
        assertEquals(0, YandexBar.makeCocktail(array, arr2));
    }

    @Test
    void cocktail3() {
        String[] array = {"...|                    |...", "...|                    |...", "...|                    |...",
        "...|                    |...", "...|                    |...", "...|                    |...",
        "....|                  |....", "....|                  |....", "....|                  |....",
        "....|                  |....", "....|                  |....", ".....|                |.....",
        ".....|                |.....", ".....|                |.....", ".....|                |.....",
        "......|______________|......"};
        String[] arr2 = {"kahlua 4 k", "baileys 5 b", "cointreau 3 c", "fire 1 !"};
        assertEquals(0, YandexBar.makeCocktail(array, arr2));
    }

    @Test
    void cocktail4() {
        String[] array = {"...|     \\......", "...|      /.....", "../        /....", "...\\        /...",
        "....|        \\..", "...../      |...", "......\\     /...", ".......|   |....", "....../     \\...",
        ".......\\_____\\.."};
        String[] arr2 = {"some 1 (", "thing 2 ?", "really 3 )", "strange 1 ^"};
        assertEquals(0, YandexBar.makeCocktail(array, arr2));
    }

    // \" \\$
    @Test
    void cocktail5() {
        String[] array = {"...|     \\......", "...|      /.....", "../        /....", "...\\        /...",
                "....|        \\..", "...../      |...", "......\\     /...", ".......|   |....", "....../     \\...",
                ".......\\_____\\.."};
        String[] arr2 = new String[1];
        String s = "some 3 \"";
        arr2[0] = s;
        assertEquals(0, YandexBar.makeCocktail(array, arr2));
    }
}
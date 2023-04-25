package training2021.lesson2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SapperTest {

    @Test
    void makeField1() {
        Integer[] array = new Integer[]{2, 2, 1};
        List<Sapper.Mine> mines = new ArrayList<>();
        mines.add(new Sapper.Mine(1, 1));
        assertEquals(0, Sapper.makeField(array, mines));
    }

    @Test
    void makeField2() {
        Integer[] array = new Integer[]{3, 2, 2};
        List<Sapper.Mine> mines = new ArrayList<>();
        mines.add(new Sapper.Mine(1, 1));
        mines.add(new Sapper.Mine(2, 2));
        assertEquals(0, Sapper.makeField(array, mines));
    }

    @Test
    void makeField3() {
        Integer[] array = new Integer[]{4, 4, 4};
        List<Sapper.Mine> mines = new ArrayList<>();
        mines.add(new Sapper.Mine(1, 3));
        mines.add(new Sapper.Mine(2, 1));
        mines.add(new Sapper.Mine(4, 2));
        mines.add(new Sapper.Mine(4, 4));
        assertEquals(0, Sapper.makeField(array, mines));
    }
}
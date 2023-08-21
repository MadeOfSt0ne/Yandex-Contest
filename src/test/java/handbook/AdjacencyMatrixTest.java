package handbook;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AdjacencyMatrixTest {

    @Test
    void buildMatrix1() {
        int stops = 5;
        List<int[]> list = List.of(new int[]{3, 1, 2, 3}, new int[]{2, 1, 2}, new int[]{5, 5, 2, 4, 3, 1});
        assertEquals(0, AdjacencyMatrix.buildMatrix(stops, list));
    }

    @Test
    void buildMatrix2() {
        int stops = 5;
        List<int[]> list = List.of(new int[]{3, 1, 3, 5}, new int[]{2, 2, 4}, new int[]{5, 1, 2, 3, 4, 5});
        assertEquals(0, AdjacencyMatrix.buildMatrix(stops, list));
    }
}
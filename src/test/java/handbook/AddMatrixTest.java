package handbook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddMatrixTest {

    @Test
    void addMatrix1() {
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = {{1, 2, 3}, {4, 5, 6}};
        assertEquals(0, AddMatrix.addMatrix(a, b));
    }
}
package FallWinter22;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C_TreeTest {

    @Test
    void processTree1() {
        int[] nq = {10, 6};
        int[] v = {5, 7, 4, 7, 8, 7};
        assertEquals(0, C_Tree.processTree(nq, v));
    }
}
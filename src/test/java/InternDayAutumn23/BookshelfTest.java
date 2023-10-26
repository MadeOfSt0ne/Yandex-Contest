package InternDayAutumn23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookshelfTest {

    @Test
    void countBooks1() {
        int[] nums = {2, 5, 1, 3, 4};
        assertEquals(4, Bookshelf.countBooks(nums));
    }

    @Test
    void countBooks2() {
        int[] nums = {1, 8, 3, 6, 4, 7, 2};
        assertEquals(5, Bookshelf.countBooks(nums));
    }

    @Test
    void countBooks3() {
        int[] nums = {1, 6, 2, 7, 3, 8, 4, 9, 5, 10};
        assertEquals(6, Bookshelf.countBooks(nums));
    }
}
package InternDay2023;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DiscountCouponsTest {

    @Test
    void getBestCoupons1() {
        int[] nmk = {5, 3, 2};
        int[] prices = {100, 200, 300, 200, 300};
        List<int[]> list = List.of(new int[]{2, 1, 2}, new int[]{2, 2, 3}, new int[]{2, 1, 3}, new int[]{1, 1}, new int[]{1, 1});
        int[] discounts = {10, 20, 30};
        assertEquals(0, DiscountCoupons.getBestCoupons(nmk, prices, list, discounts));
    }
}
package leetcode.Dynamic;

public class AmountOfUniqueWays {
    /**
     * Динамическое программирование
     * Нужно найти количество уникальных путей из точки А в точку Б. Ходить можно только вверх или вправо на 1 клетку.
     */
    int paths(int n, int m) {
        return helper(n, m, new int[n + 1][m + 1]);
    }

    int helper(int n, int m, int[][] array) {
        if (n < 1 || m < 1) {
            return 0;
        }
        if (n == 1 && m == 1) {
            return 1;
        }
        if (array[n][m] != 0) {
            return array[n][m];
        }
        array[n][m] = helper(n - 1, m, array) + helper(n, m - 1, array);
        return array[n][m];
    }
}

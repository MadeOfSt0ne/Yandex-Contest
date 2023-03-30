package org.example;

public class ThreeDMatrix {

    /**
     * Поиск второго по величине элемента, расположенного на любой из четырех диагоналей трехмерного массива
     */
    public static int findSecondMax(int[][][] array) {
        int max;
        int secondMax;
        if (array[0][0][0] >= array[1][1][1]) {
            max = array[0][0][0];
            secondMax = array[1][1][1];
        } else {
            secondMax = array[0][0][0];
            max = array[1][1][1];
        }
        // [0][0][0] -> [N][N][N]
        for (int i = 2; i < array.length; i++) {
            if (array[i][i][i] >= max) {
                secondMax = max;
                max = array[i][i][i];
            } else if (array[i][i][i] > secondMax) {
                secondMax = array[i][i][i];
            }
        }
        // [N][0][0] -> [0][N][N]
        for (int i = 0; i < array.length; i++) {
            if (array[array.length - i - 1][i][i] >= max) {
                secondMax = max;
                max = array[array.length - i - 1][i][i];
            } else if (array[array.length - i - 1][i][i] > secondMax) {
                secondMax = array[array.length - i - 1][i][i];
            }
        }
        // [N][N][0] -> [0][0][N]
        for (int i = 0; i < array.length; i++) {
            if (array[array.length - i - 1][array.length - i - 1][i] >= max) {
                secondMax = max;
                max = array[array.length - i - 1][array.length - i - 1][i];
            } else if (array[array.length - i - 1][array.length - i - 1][i] > secondMax) {
                secondMax = array[array.length - i - 1][array.length - i - 1][i];
            }
        }
        // [0][N][0] -> [N][0][N]
        for (int i = 0; i < array.length; i++) {
            if (array[i][array.length - i - 1][i] >= max) {
                secondMax = max;
                max = array[i][array.length - i - 1][i];
            } else if (array[i][array.length - i - 1][i] > secondMax) {
                secondMax = array[i][array.length - i - 1][i];
            }
        }
        return secondMax;
    }
}

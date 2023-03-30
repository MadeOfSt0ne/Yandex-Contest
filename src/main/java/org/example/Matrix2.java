package org.example;

public class Matrix2 {

    public static void paintArray(int length) {
        int[][] array = new int[length][length];
        int midPosition1 = length / 2 - 1;
        int midPosition2 = length / 2;
        int element;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                // разбиваю массив на 4 сектора: левый верхний, левый нижний, правый верхний и правый нижний
                if (i <= midPosition1 && j <= midPosition1) {
                    element = midPosition1 - Math.min(i, j);
                } else if (i >= midPosition2 && j <= midPosition1) {
                    element = Math.max(i - midPosition2, midPosition1 - j);
                } else if (i <= midPosition1 && j >= midPosition2) {
                    element = Math.max(midPosition1 - i, j - midPosition2);
                } else {
                    element = Math.max(i, j) - midPosition2;
                }
                array[i][j] = element;
                // При длине массива больше 20 "едет" форматирование (однозначные + двузначные числа)
                System.out.print(" " + element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paintArray(20);
    }
}

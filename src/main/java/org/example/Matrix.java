package org.example;

public class Matrix {

    /**
     * Поиск минимального значения побочной диагонали двумерного массива, не учитывая элемент на пересечении диагоналей
     */
    public static int findMin(int[][] array) {
        int min = array[array.length - 1][0];
        int positionToIgnore = array.length / 2 + array.length % 2 - 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array.length % 2 == 1) {
                if (min > array[array.length - i - 1][i] && i != positionToIgnore) {
                    min = array[array.length - i - 1][i];
                }
            } else {
                if (min > array[array.length - i - 1][i]) {
                    min = array[array.length - i - 1][i];
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1, 5, 7, 9, 11}, {11, 5, 7, 9, 18}, {13, 5, 0, 9, 11}, {18, 13, 7, 9, 13}, {1, 3, 7, 3, 8}};
        int[][] arr2 = {{1, 5, 7, 9}, {5, 7, 9, 18}, {13, 5, 0, 11}, {13, 7, 9, 13}};
        for (int[] ints : arr1) {                       //идём по строкам
            for (int j = 0; j < arr1.length; j++) {     //идём по столбцам
                System.out.print(" " + ints[j] + " ");  //вывод элемента
            }
            System.out.println();                       //перенос строки ради визуального сохранения табличной формы
        }
        System.out.println("Min element = " + findMin(arr1));

        for (int[] ints : arr2) {                       //идём по строкам
            for (int j = 0; j < arr2.length; j++) {     //идём по столбцам
                System.out.print(" " + ints[j] + " ");  //вывод элемента
            }
            System.out.println();                       //перенос строки ради визуального сохранения табличной формы
        }
        System.out.println("Min element = " + findMin(arr2));
    }
}

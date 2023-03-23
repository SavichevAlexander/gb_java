package 1st_lesson;

import java.util.Arrays;

public class 1st_task {

/*
    1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [1, 1, 0, 0, 1, 0, 1, 1, 0, 0]. С помощью
    цикла и условия заменить 0 на 1, 1 на 0);
*/

    private static void invertArrayVar1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 1) ? 0 : 1;
        }
    }

/*
    2. Задать массив [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1], пройти по нему циклом и числа меньшие 6 умножить на 2;
*/

    private static void changeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }
package com.tuncode.algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] myArr = {10, 2, 1, 20, 44, 13, 33}; // 1,2,10,13,20,33,44 sorted
        insertionSort(myArr);

    }

    public static void insertionSort(int[] intArr) {
        for (int i = 1; i < intArr.length; i++) {
            int current = intArr[i]; // 2
            int j = i - 1;

            while (j >= 0 && current < intArr[j]) { // 2 < 10
                intArr[j + 1] = intArr[j]; // at first step --> 2 = 10
                j--;
            }
            intArr[j + 1] = current;
        }
        Arrays.stream(intArr).forEach(System.out::println);
    }
}

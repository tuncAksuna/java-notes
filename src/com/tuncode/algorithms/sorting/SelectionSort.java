package com.tuncode.algorithms.sorting;


import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] myArr = {10, 2, 1, 20, 44, 13, 33}; // 1,2,10,13,20,33,44 sorted
        selectionSort(myArr);

    }

    public static void selectionSort(int[] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            int min = intArr[i];    // 10,2,1..33 --> at first step = min = 10
            int minId = i;         // 0,1,2...6   --> at first step = minId = 0

            for (int j = i + 1; j < intArr.length; j++) {
                if (intArr[j] < min) { // 2 < min(10)
                    min = intArr[j];  // min = 2
                    minId = j;       // minId = 1
                }
            }
            // swapping
            int temp = intArr[i];
            intArr[i] = min;
            intArr[minId] = temp;
        }
        Arrays.stream(intArr).forEach(System.out::println);
    }
}

package com.tuncode.algorithms.sorting;


import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] myArr = {10, 2, 1, 20, 44, 13, 33}; // 1,2,10,13,20,33,44 sorted
        bubbleSort(myArr);
    }

    public static void bubbleSort(int[] intArr) {
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < intArr.length - 1; i++) {
                if (intArr[i] > intArr[i + 1]) {
                    int temp = intArr[i];
                    intArr[i] = intArr[i + 1];
                    intArr[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        //Arrays.stream(intArr).forEach(System.out::println);

    }

}

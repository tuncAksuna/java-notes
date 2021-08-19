package com.tuncode.algorithms.searching;

public class LinearSearch {

    public static void main(String[] args) {

        int[] myArr = {10, 2, 1, 20, 44, 13, 33};
        linearSearch(myArr, 33);

    }

    public static int linearSearch(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.printf("Element '%d' found in the array and index %d ", arr[i], i);
                return i; // index
            }
        }
        System.out.printf("Element '%d' not found in the array", element);
        return -1;
    }
}

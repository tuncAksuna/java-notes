package com.tuncode.algorithms.searching;


public class LinearSearch {

    public static void main(String[] args) {

        int[] myArr = {2, 3, 4, 10, 40};
        linearSearch(myArr, 2);

        int[][] myTwoDimensionalArr = {{32, 45, 35}, {53, 65, 67}, {43, 23, 76}};

        findElementInArr(myTwoDimensionalArr, 76);

    }

    public static int linearSearch(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.printf("Element '%d' found in the array and index %d ", arr[i], i);
                return arr[i];
            }
        }
        System.out.printf("Element '%d' not found in the array", element);
        return -1;
    }

    public static int findElementInArr(int arr[][], int element) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == element) {
                    System.out.printf("Element '%d' found in the two dimensional array and index is %d  ", arr[i][j], j);
                    return arr[i][j];
                }
            }
        }
        System.out.printf("Element not found in the array");
        return -1;
    }
}

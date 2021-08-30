package com.tuncode.algorithms.arrays;


import java.util.Arrays;

public class SearchAnElementInASortedAndRotatedArray {
    public static void main(String[] args) {

        // how to search an element in sorted and rotated array ?
        int[] arr = {16, 19, 21, 25, 3, 5, 8, 10, 12};

        searchInSortedArr(arr, 0, arr.length - 1, 12);

    }

    public static int searchInSortedArr(int[] arr, int left, int right, int element) {

        int middleOfArray = (left + right) / 2;
        int[] sortArrays = sortArray(arr);

        if (right >= left) {
            for (int i = 0; i < sortArrays.length; i++) {
                if (sortArrays[middleOfArray] == element) {
                    System.out.printf("%d is found middle of the array and index %d ", element, sortArrays[i]);
                    return middleOfArray;
                } else if (element < arr[middleOfArray]) {
                    System.out.printf("%d is found in the array and index %d \n: ", element, sortArrays[i]);
                    return searchInSortedArr(sortArrays, left, middleOfArray - 1, element);
                } else {
                    System.out.printf("%d is found in the array and index %d : ", element, sortArrays[i]);
                    return searchInSortedArr(sortArrays, middleOfArray + 1, right, element);
                }
            }
        }
        System.out.printf("%d is not found in the array", element);
        return -1;
    }

    public static int[] sortArray(int[] arr) {

        int temp;
        boolean swapped = false;

        while (!swapped) {
            swapped = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = false;
                }
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
        return arr;
    }

}



package com.tuncode.algorithms.searching;

public class BinarySearch {

    public static void main(String[] args) {

        int[] myArr = {2, 3, 5, 6, 9, 12, 32, 54, 74};

        BinarySearch ob = new BinarySearch();
        int result = ob.binarySearch(myArr, 0, myArr.length - 1, 2);


    }

    public static int binarySearch(int arr[], int left, int right, int element) {
        int middleOfArray = left + (right - 1) / 2;

        if (arr[middleOfArray] == element) {
            return middleOfArray;
        } else if (element < arr[middleOfArray]) {
            // left half
            System.out.println("Element found in left side ");
            return binarySearch(arr, left, middleOfArray - 1, element);
        } else {
            // right half
            System.out.println("Element found in right side ");
            return binarySearch(arr, middleOfArray + 1, right, element);
        }
    }
}

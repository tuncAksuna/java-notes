package com.tuncode.algorithms.searching;

public class BinarySearch {

    public static void main(String[] args) {

        int[] myArr = {2, 3, 4, 10, 40};

        BinarySearch searching = new BinarySearch();
        int result = searching.binarySearch(myArr, 0, myArr.length - 1,10 );

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found " + result);
        }
    }

    public static int binarySearch(int arr[], int left, int right, int element) {

        if (right >= left) {
            int middle = left + (right - 1) / 2;

            if (arr[middle] == element) {
                return middle;
            } else if (arr[middle] > element) {
                return binarySearch(arr, left, middle - 1, element);
            } else {
                return binarySearch(arr, middle + 1, right, element);
            }
        }
        return -1;
    }
}

package com.tuncode.algorithms.arrays;

public class FindSmallestAndLargestElementInAnArray {

    // Write Java Program to find smallest and largest element in an Array..

    public static void main(String[] args) {

        int[] myArr = {10, 0, 12, 9678, 51, 123, 14};
        smallestLargest(myArr);

    }

    public static void smallestLargest(int[] arr) {
        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            } else if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.format("largest number in your array : %d ", largest);
        System.out.format("smallest number in your array : %d ", smallest);
    }

}

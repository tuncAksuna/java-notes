package com.tuncode.algorithms.arrays;

public class FindSmallestAndLargestElementInAnArray {

    // Write Java Program to find smallest and largest element in an Array..

    public static void main(String[] args) {
        int[] arr = {12, 56, 0, 89, 100, 343, 21, 234};

        int small = arr[0];
        int large = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
            } else if (arr[i] > large) {
                large = arr[i];
            }
        }
        System.out.format("Largest value in array %d \n", large);
        System.out.format("Smallest value in array %d", small);

    }

}

package com.tuncode.algorithms.arrays;

public class FindSecondLargestNumber {

    // java program to find second largest number in an array

    public static void main(String[] args) {

        int[] arr = {13, 5, 15, 1, 4, 2};
        findSecondLargestNumber(arr);

    }

    public static int findSecondLargestNumber(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.format("second largest number is  : %d in your array \n", secondLargest);
        return secondLargest; // for now
    }
}

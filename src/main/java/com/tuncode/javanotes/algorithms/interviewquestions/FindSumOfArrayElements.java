package com.tuncode.javanotes.algorithms.interviewquestions;

/**
 * Given an array of integers. Write a Java Program to find the sum of the elements of the array.
 */
public class FindSumOfArrayElements {

    public static void main(String[] args) {
        int[] arr = {12, 3, 4, 15};
        int sumOfArrayElements = findSumOfArrayElements(arr);
        System.out.println("Sum of given array is: " + sumOfArrayElements);
    }

    public static int findSumOfArrayElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}

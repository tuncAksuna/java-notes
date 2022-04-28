package com.tuncode.algorithms.arrays;

/*
 * find duplicate elements in an array and return sum of duplicate elements and count
 */

import java.util.ArrayList;
import java.util.List;


public class FindDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {10, 1, 2, 3, 20, 10};
        findDuplicate(arr);

    }

    public static void findDuplicate(int[] arr) {
        List<Integer> duplicateElements = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicateElements.add(arr[j]);
                }
            }
        }
        System.out.println("Length of duplicate elements : " + duplicateElements.size());
    }
}
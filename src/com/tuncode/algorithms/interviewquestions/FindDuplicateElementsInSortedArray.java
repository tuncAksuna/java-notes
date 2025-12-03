package com.tuncode.algorithms.interviewquestions;

import java.util.LinkedList;
import java.util.List;

public class FindDuplicateElementsInSortedArray {

    public static void main(String[] args) {
        int[] arr = {10, 1, 2, 3, 20, 10};
        sortAndFindDuplicateElements(arr);
    }


    public static List<Integer> removeDuplicates(int[] sortedArr) {
        List<Integer> duplicateElements = new LinkedList<>();
        for (int i = 0; i < sortedArr.length; i++) {
            for (int j = i + 1; j < sortedArr.length; j++) {
                if (sortedArr[i] == sortedArr[j]) {
                    duplicateElements.add(sortedArr[i]);
                }
            }
        }
        return duplicateElements;
    }

    public static void sortAndFindDuplicateElements(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];  // 1
            int j = arr[i - 1];   // 10

            while (current < j) {
                // TODO: BURADA NE YAPACAĞIZ ?? EĞER GUNCEL DEGER KENDISINDEN BIR SONRAKI DEGERDEN KUCUKSE ???
                current = arr[i - 1];
            }
        }
    }
}

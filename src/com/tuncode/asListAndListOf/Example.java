package com.tuncode.asListAndListOf;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        // Arrays.asList and List.of differences between :
        List<Integer> asList = Arrays.asList(1, 2, 30, 111);
        List<Integer> listOf = List.of(100, 2, 123, 11);

        // 1) Arrays.asList is mutable . but List.of is immutable
        asList.set(0, 0); // no problem
        listOf.set(0, 0); //  Fails with UnsupportedOperationException

        // 2) Arrays.asList allows null elements while List.of doesn't:
        List<Integer> asList2 = Arrays.asList(1, 2, null); // no problem
        List<Integer> listOf2 = List.of(100, 2, 123, null); // Fails with NullPointerException

        // 3) contains behaves differently with nulls
        List<Integer> asList3 = Arrays.asList(1, 2, 3);
        List<Integer> listOf3 = List.of(100, 2, 123, 3);

        asList3.contains(null); // no problem
        listOf3.contains(null); // // Fails with NullPointerException

        // 4) Arrays.asList returns a view of the passed array, so the changes to the array will be reflected in the list too. For List.of this is not true:
        Integer[] array = {1, 2, 3};
        List<Integer> list = Arrays.asList(array);
        array[1] = 10;  // no problem
        System.out.println(list); // Prints [1, 10, 3]

        Integer[] myArr = {1, 2, 3};
        List<Integer> myList = List.of(myArr);
        myArr[1] = 10;  // Exception
        System.out.println(myList); // Prints [1, 2, 3]

        // SUMMARIZE
        // List.of can be best used when data set is less and unchanged, while Arrays.asList can be used best in case of large and dynamic data set.
        // List.of doesn't allow null elements while Arrays.asList allows null elements.
    }
}

package com.tuncode.kodluyoruz.statickeyword;


/**
 * @description : A class that have static function which don't needed creating object
 */
public class Calculate {

    public static void calculateAverage(int[] notes) {
        double total = 0;
        for (int el : notes) {
            total += el;
        }
        double average = total / notes.length;
        System.out.println("Average of  : " + average);

    }
}

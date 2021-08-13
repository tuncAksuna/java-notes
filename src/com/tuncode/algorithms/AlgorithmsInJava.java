package com.tuncode.algorithms;

public class AlgorithmsInJava {

    public static void main(String[] args) {

        findMaxMinInAnArray(new double[]{1.2, 1.3, 41.2, 12.1});

    }

    public static void findMaxMinInAnArray(double[] array) {

        double maxValue = array[0];
        double minValue = array[1];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            } else if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        System.out.format("Maximum element in your array %.2f ", maxValue);
        System.out.format("Minumum element in your array %.2f ", minValue);
    }

}

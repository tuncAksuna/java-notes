package com.tuncode.algorithms.interviewquestions;

public class ReverseString {

    public static void main(String[] args) {

        // JAVA program to reverse a string
        reverseStringWithForLoop("Cem tunç aksunA");

    }

    public static void reverseStringWithForLoop(String stringData) {
        String reversed = "";

        for (int i = stringData.length() - 1; i >= 0; i--) {
            if (!stringData.isEmpty() && stringData.length() > 1) {
                reversed = reversed + stringData.charAt(i);
            }
            System.out.println(reversed);
        }
    }
}

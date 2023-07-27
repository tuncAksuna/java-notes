package com.tuncode.algorithms.interviewquestions;

public class ReverseString {

    public static void main(String[] args) {

        // JAVA program to reverse a string
        reverseString("Cem tunç aksunA");

    }

    public static String reverseString(String stringData) {
        StringBuilder reversed = new StringBuilder();

        for (int i = stringData.length() - 1; i >= 0; i--) {
            if (!stringData.isEmpty() && stringData.length() > 1) {
                reversed.append(stringData.charAt(i));
            }
        }
        System.out.println(reversed);
        return reversed.toString();
    }
}

package com.tuncode.algorithms.interviewquestions;

public class FindStringLenghtWithoutInBuiltMethod {

    // How to find length of string in java without using length() method
    public static void main(String[] args) {

        String fullName = "Cem Tunç Aksuna";
        findLenghtOfString(fullName);

    }

    public static int findLenghtOfString(String template) {

        int lengthCount = 0;
        char[] toCharArr = template.toCharArray();

        for (int i = 0; i < toCharArr.length; i++) {
            lengthCount++;
        }

        System.out.println(lengthCount);
        return lengthCount;
    }
}

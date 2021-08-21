package com.tuncode.algorithms.interviewquestions;

import java.util.HashSet;


public class IfStringHasAllUniqueCharacters {

    public static void main(String[] args) {

        // How to check if String has all unique characters ?

        System.out.println(checkUniqueCharacterWithHashSet("Interact"));
        System.out.println(checkUniqueCharacterWithIndexOf("Interact"));
    }

    public static boolean checkUniqueCharacterWithHashSet(String incomingWord) {

        HashSet hashSet = new HashSet<>();

        for (int i = 0; i < incomingWord.length(); i++) {
            char stringToChar = incomingWord.charAt(i);

            if (!hashSet.add(stringToChar)) {
                System.out.println("There is/are same character(s)");
                return false;
            }
        }
        return true;
    }

    public static boolean checkUniqueCharacterWithIndexOf(String incomingWord) {

        for (int i = 0; i < incomingWord.length(); i++) {
            char stringToChar = incomingWord.charAt(i);
            incomingWord.lastIndexOf(stringToChar);

            if (incomingWord.indexOf(stringToChar) != incomingWord.lastIndexOf(stringToChar)) {
                return false;
            }
        }
        return true;
    }

}

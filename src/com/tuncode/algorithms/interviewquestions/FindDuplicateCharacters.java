package com.tuncode.algorithms.interviewquestions;

import java.util.HashMap;

public class FindDuplicateCharacters {

    public static void main(String[] args) {

        // If Hashamap already contains char,increase its count by 1, else put char in HashMap
        // If value of Char is more than 1, that means it is duplicate character in that String

        String myFullName = "AKSUNA";
        findDuplicateCharacterInAString(myFullName);
    }

    public static void findDuplicateCharacterInAString(String element) {

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < element.length(); i++) {
            char toChar = element.charAt(i);

            if (hashMap.containsKey(toChar)) {
                hashMap.put(toChar, hashMap.get(i) + 1);
            }
            hashMap.put(toChar, 1);
        }
        for (Character chrctr : hashMap.keySet()) {
            if (hashMap.get(chrctr) > 1) {
                System.out.println("Duplicated character is : " + chrctr + " and duplicate count : " + hashMap.get(chrctr));
            }
        }
    }
}

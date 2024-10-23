package com.tuncode.algorithms.interviewquestions;

public class SplitAddress {
    public static void main(String[] args) {

        String address = "Harbiye mah. Niðde Sokak Kardeþler Apartmaný Ankara/Çankaya";

        String sub = address.substring(address.indexOf("/"));
        String replaceSlash = sub.replace("/", "");

        System.out.println(replaceSlash);
    }

}

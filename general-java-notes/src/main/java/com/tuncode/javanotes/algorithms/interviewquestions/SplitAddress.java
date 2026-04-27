package com.tuncode.javanotes.algorithms.interviewquestions;

public class SplitAddress {
    public static void main(String[] args) {

        String address = "Harbiye mah. Ni�de Sokak Karde�ler Apartman� Ankara/�ankaya";

        String sub = address.substring(address.indexOf("/"));
        String replaceSlash = sub.replace("/", "");

        System.out.println(replaceSlash);
    }

}

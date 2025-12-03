package com.tuncode.strings;

import java.util.HashMap;
import java.util.Objects;

public class ImmutableString {

    public static void main(String[] args) {

        HashMap<String, String> person1 = new HashMap();
        HashMap<String, String> person2 = new HashMap();

        person1.put("Cem Tunç", "Aksuna");
        person2.put("Cem Tunç", "Aksuna");

        System.out.println(person1.equals(person2)); // Map içerikleri aynı oldugundan "true" return eder.
        System.out.println(Objects.equals(person1.get("Aksuna"), person2.get("Aksuna"))); // Degerler String Pool içerisinde toplandığından ve "Stringler IMMUTABLE" olduğundan Aksuna değeri 2 kere String Pool içerisinde depolanmayacak !

    }
}

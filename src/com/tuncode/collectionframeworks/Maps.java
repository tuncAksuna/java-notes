package com.tuncode.collectionframeworks;

import java.util.*;

public class Maps {
    public static void main(String[] args) {

        Map<String, Integer> duplicationAndOrderInHashMap = new HashMap<>();
        duplicationAndOrderInHashMap.put("Age1", 40);
        duplicationAndOrderInHashMap.put("Age2", 40);
        duplicationAndOrderInHashMap.put("Age3", 40);
        duplicationAndOrderInHashMap.put("Age4", null);
        // allows duplicate 'value' but doesn't allow duplicate 'keys' and stored elements in no order

        Map<Integer, String> duplicationAndNullableAndOrderInTreeMap = new TreeMap<>();
        duplicationAndNullableAndOrderInTreeMap.put(1, "ALİ");
        duplicationAndNullableAndOrderInTreeMap.put(10, "ALİ");
        duplicationAndNullableAndOrderInTreeMap.put(2, "VELİ");
        duplicationAndNullableAndOrderInTreeMap.put(3, null);
        duplicationAndNullableAndOrderInTreeMap.put(12, null);
        // allows null element's' and allows same values finally stored elements in ascending order

        Map<Integer, String> duplicationAndNullableAndOrderInLinkedHashMap = new LinkedHashMap<>();
        duplicationAndNullableAndOrderInLinkedHashMap.put(10, "Hİ");
        duplicationAndNullableAndOrderInLinkedHashMap.put(13, "Hİ");
        duplicationAndNullableAndOrderInLinkedHashMap.put(14, "GUYS");
        duplicationAndNullableAndOrderInLinkedHashMap.put(100, null);
        duplicationAndNullableAndOrderInLinkedHashMap.put(15, null);
        duplicationAndNullableAndOrderInLinkedHashMap.put(null, null);
        // stored elements in insertion order , allows duplicate values and null values

        // ITERATION
        Iterator<Map.Entry<String, Integer>> itr2 = duplicationAndOrderInHashMap.entrySet().iterator();

        while (itr2.hasNext()) {
            Map.Entry<String, Integer> entry = itr2.next();
            System.out.println("\nKey = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }

        Iterator<Map.Entry<Integer, String>> itr = duplicationAndNullableAndOrderInLinkedHashMap.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }


    }
}

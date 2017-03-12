package ru.tn.courses.ntseytlina.task1.v2.subtask4;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * На вход подается строка,
 * необходимо определить подстроку с наибольшей длиной,
 * которая встречается в исходной строке наибольшее количество раз.
 * Результат: вывод этой подстроки и количество вхождений
  */

public class Main {

    private static String string = "abyc" +
            "utmr" +
            "utmr" +
            "abyc" +
            "utmr" +
            "abyc";

    public static void main(String [] args) {
        System.out.println(findMostFrequentString());
    }

    private static Map findMostFrequentString () {
        Map<String, Integer> substrings = new LinkedHashMap<>();
        Set<String> mostFrequentKeys = new HashSet<>();
        Map<String, Integer> mostFrequentStrings = new LinkedHashMap<>();

        int numberOfSubstrings = 0;

        for (int i = 2; i < string.length(); i++) {
            for (int j = i; j < string.length() + 1; j++) {
                String key = string.substring(j - i, j);
                if (substrings.keySet().contains(key)) {
                    substrings.replace(key, substrings.get(key) + 1);
                } else {
                    substrings.put(key, 1);
                }
            }
        }

        int length = 0;
        for (String key : substrings.keySet()) {
            if (substrings.get(key) > numberOfSubstrings) {
                numberOfSubstrings = substrings.get(key);
                mostFrequentKeys.clear();
                mostFrequentKeys.add(key);
                mostFrequentStrings.clear();
                mostFrequentStrings.put(key, substrings.get(key));
                if (length < key.length()) {
                    length = key.length();
                }
            } else if (substrings.get(key) == numberOfSubstrings) {
                mostFrequentKeys.add(key);
                mostFrequentStrings.put(key, substrings.get(key));
                if (length < key.length()) {
                    length = key.length();
                }
            }
        }

        for (String key : mostFrequentKeys) {
            if (key.length() < length) {
                mostFrequentStrings.remove(key);
            }
        }

        return mostFrequentStrings;
    }

}

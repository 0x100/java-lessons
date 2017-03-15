package ru.tn.courses.ntseytlina.task1.v2.subtask4;

import java.util.*;

/**
 * На вход подается строка,
 * необходимо определить подстроку с наибольшей длиной,
 * которая встречается в исходной строке наибольшее количество раз.
 * Результат: вывод этой подстроки и количество вхождений
  */

public class Main {

    private static String string = "utmr" +
            "utmr" +
            "abyc" +
            "utmr" +
            "abyc" +
            "abyc";

    public static void main(String [] args) {
        System.out.println(findMostFrequentString());
    }

    private static List findMostFrequentString () {
        List<String> substringKeys = new ArrayList<>();
        List<Integer> substringFrequency = new ArrayList<>();

        List<String> mostFrequentStrings = new ArrayList<>();

        int numberOfSubstrings = 0;
        int length = 0;

        for (int i = 2; i < string.length(); i++) {
            for (int j = i; j < string.length() + 1; j++) {
                String key = string.substring(j - i, j);
                if (substringKeys.contains(key)) {
                    int index = substringKeys.indexOf(key);
                    substringKeys.set(index, key);
                    substringFrequency.set(index, substringFrequency.get(index) + 1);
                } else {
                    substringKeys.add(key);
                    substringFrequency.add(1);
                }
            }
        }

        for (String key : substringKeys) {
            int index = substringKeys.indexOf(key);
            if (substringFrequency.get(index) > numberOfSubstrings) {
                numberOfSubstrings = substringFrequency.get(index);
                mostFrequentStrings.clear();
                mostFrequentStrings.add(key);
                length = key.length();
            } else if (substringFrequency.get(index) == numberOfSubstrings) {
                mostFrequentStrings.add(key);
                if (length < key.length()) {
                    length = key.length();
                }
            }
        }

        List<String> keys = new ArrayList<>(mostFrequentStrings);

        for (String key : keys) {
            if (key.length() < length) {
                mostFrequentStrings.remove(key);
            }
        }

        mostFrequentStrings.add("Frequency = " + numberOfSubstrings);

        return mostFrequentStrings;
    }

}

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
        List<String> substrings = new ArrayList<>();

        int numberOfSubstrings = 0;
        int length = 0;

        for (int i = 2; i < string.length(); i++) {
            for (int j = i; j < string.length() + 1; j++) {
                String key = string.substring(j - i, j);
                int index = 0;
                int frequency = 0;
                while (index != -1) {
                    index = string.indexOf(key, index);
                    if (index != -1) {
                        frequency++;
                        index += key.length();
                    }
                }

                if (!substrings.contains(key)) {
                    if (numberOfSubstrings < frequency) {
                        numberOfSubstrings = frequency;
                        length = 0;
                        substrings.clear();
                        substrings.add(key);
                    } else if (numberOfSubstrings == frequency) {
                        if (key.length() > length) {
                            length = key.length();
                            substrings.clear();
                            substrings.add(key);
                        } else if (key.length() == length) {
                            substrings.add(key);
                        }
                    }
                }
            }
        }

        substrings.add("Frequency = " + numberOfSubstrings);

        return substrings;
    }

}

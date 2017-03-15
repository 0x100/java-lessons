package ru.tn.courses.ssirotenko.task1.v3.subtask4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
На вход подается строка, необходимо определить подстроку с наибольшей длиной,
которая встречается в исходной строке наибольшее количество раз.
Результат: вывод этой подстроки и количество вхождений
 */
public class Main {

    private static final String STR = "домкубдомкубкуб";

    private static void getWord(String s) {

        String word = "";
        int wordLength = 2;
        int count = 0;
        int maxCount = 0;
        int length = s.length();
        List<String> list = new ArrayList<>();
        System.out.println(STR);

        while (wordLength <= length) {
            for (int i = 0; i <= length - wordLength; i++) {
                list.add(s.substring(i, i + wordLength));
            }
            wordLength++;
        }

        for (String aList : list) {
            System.out.print(aList + " ");
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (Objects.equals(list.get(i), list.get(j))) {
                    count++;
                }
            }
            if (count >= maxCount) {
                maxCount = count;
                word = list.get(i);
            }
            count = 0;
        }

        System.out.println();
        System.out.println(word + " " + maxCount);
    }

    public static void main(String[] args) {

        getWord(STR);

    }


}

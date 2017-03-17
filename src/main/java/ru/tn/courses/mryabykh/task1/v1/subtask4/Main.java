package ru.tn.courses.mryabykh.task1.v1.subtask4;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: ryabykh_ms (upstrocker)
 * Email: upstrocker@gmail.com
 * GitHub: https://github.com/upstrocker
 */

public class Main {

    /**
     * Часто встречаемая подстрока
     */
    private static String frequentSubstring;

    /**
     * Число вхождений подстроки frequentSubstring в исходной строке
     */
    private static int frequencyOfSubstring;

    /**
     * Ищет наиболее часто встречаемую и длинную подстроку в строке
     *
     * @param string - строка, в которой нужно искать подстроку
     */
    private static void findFrequentSubstring(String string) {
        int offset = 2;
        String substring;
        String resultSubstring = "";
        int frequency;
        int resultFrequency = 0;
        int resultLength = 0;
        int index;

        // Пока количсетво символов искомой подстроки меньше длины самой строки
        while (offset <= string.length()) {
            // проходимся по всей строке и выбираем подстроку длиной offset
            for (int i = offset; i < string.length() + 1; i++) {
                substring = string.substring(i - offset, i);
                frequency = 0;

                // Ищем подстроку в строке, начиная с символа с индексом j
                for (int j = i - offset; j < string.length(); j = index + offset) {
                    index = string.indexOf(substring, j);
                    if (index != -1) {
                        frequency++;
                    } else {
                        break;
                    }
                }
                if ((frequency > resultFrequency) || (frequency == resultFrequency && offset > resultLength)) {
                    resultFrequency = frequency;
                    resultLength = offset;
                    resultSubstring = substring;
                }
            }
            offset++;
        }
        frequentSubstring = resultSubstring;
        frequencyOfSubstring = resultFrequency;
    }

    private static int getFrequencyOfSubstring() {
        return frequencyOfSubstring;
    }

    private static String getFrequentSubstring() {
        return frequentSubstring;
    }

    public static void main(String[] args) {
        List<String> testStrings = new ArrayList<>();
        testStrings.add("ababscscscsbabababscscsuiuiuibacscsui");
        testStrings.add("домкубдомкубдомкуб");
        testStrings.add("домкубдомкубдомкуб");
        testStrings.add("дом");
        testStrings.add("abaabcagagagaabcaua");
        testStrings.add("aaaabbbb");
        String substring;
        int frequency;
        for (String string : testStrings) {
            findFrequentSubstring(string);
            substring = getFrequentSubstring();
            frequency = getFrequencyOfSubstring();
            System.out.println("Исходная строка: " + string);
            System.out.println("Часто встречаемая подстрока: " + substring);
            System.out.println("Количество вхождений подстроки: " + frequency);
            System.out.println();
        }
    }
}

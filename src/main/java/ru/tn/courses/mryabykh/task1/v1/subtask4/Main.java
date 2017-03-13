package ru.tn.courses.mryabykh.task1.v1.subtask4;

/**
 * Author: ryabykh_ms (upstrocker)
 * Email: upstrocker@gmail.com
 * GitHub: https://github.com/upstrocker
 */

public class Main {

    /**
     * Ищет наиболее часто встречаемую и длинную подстроку в строке
     *
     * @param string - строка, в которой нужно искать подстроку
     * @return часто встречаемая и самая длинная подстрока
     */
    private static String findFrequentSubstring(String string) {
        int offset = 2;
        String substring;
        String resultSubstring = "";
        int frequency;
        int resultFrequency = 0;
        int resultLength = 0;
        int index;

        // Пока количсетво символов искомой подстроки меньше длины самой строки
        while (offset < string.length()) {
            // проходимся по всей строке и выбираем подстроку длиной offset
            for (int i = offset; i < string.length(); i++) {
                substring = string.substring(i - offset, i + 1);
                frequency = 0;

                // Ищем подстроку в строке, начиная с символа с индексом j
                for (int j = i - offset; j < string.length(); j = index + 1) {
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
        return resultSubstring;
    }

    /**
     * Возвращает частоту вхождений подстроки в исходной строке
     *
     * @param string    - исходная строка
     * @param substring - подстрока, для поиска в string
     * @return частота вхождений substring в string
     */
    private static int getSubstringFrequency(String string, String substring) {
        int frequency = 0;
        int index;
        for (int j = 0; j < string.length(); j = index + 1) {
            index = string.indexOf(substring, j);
            if (index != -1) {
                frequency++;
            } else {
                break;
            }
        }
        return frequency;
    }

    public static void main(String[] args) {
//        String string = "ababscscscsbabababscscsuiuiuibacscsui";
//        String string = "дом";
        String string = "домкубдомкубдомкуб";
        String substring = findFrequentSubstring(string);
        int frequency = getSubstringFrequency(string, substring);
        System.out.println("Исходная строка: " + string);
        System.out.println("Часто встречаеая подстрока: " + substring);
        System.out.println("Количество вхождений подстроки: " + frequency);
    }
}

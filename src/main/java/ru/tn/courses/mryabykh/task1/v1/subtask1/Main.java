package ru.tn.courses.mryabykh.task1.v1.subtask1;

import ru.tn.courses.mryabykh.utils.ArrayUtils;

/**
 * Author: ryabykh_ms (upstrocker)
 * Email: upstrocker@gmail.com
 * GitHub: https://github.com/upstrocker
 */

public class Main {

    /**
     * Суммирует элементы массива naturalNumbers, кратные multiplicity
     *
     * @param naturalNumbers - массив натуральных чисел
     * @param multiplicity   - число, которому должны быть кратны элементы массива
     * @return сумма элементов, кратных multiplicity, или -1, если массив содержит ненатуральные числа
     */
    private static int summarize(int[] naturalNumbers, int multiplicity) {
        int sum = -1;
        if (isNaturalNumbers(naturalNumbers)) {
            sum++;
            for (int number : naturalNumbers) {
                if (number % multiplicity == 0) {
                    sum += number;
                }
            }
        }
        return sum;
    }

    /**
     * Проверяет массив целых чисел на натуральность
     *
     * @param numbers - массив целых чисел
     * @return - все ли числа в массиве натуральные?
     */
    private static boolean isNaturalNumbers(int[] numbers) {
        for (int number : numbers) {
            if (number < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] naturalNumbers = ArrayUtils.fillRandomUintArray();
        ArrayUtils.printArray(naturalNumbers, "Исходный массив:");
        int multiplicity = 3;
        System.out.println("Сумма элементов, кратных " + multiplicity + ": " + summarize(naturalNumbers, multiplicity));
    }
}

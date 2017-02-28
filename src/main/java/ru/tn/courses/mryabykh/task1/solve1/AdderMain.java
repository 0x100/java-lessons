package ru.tn.courses.mryabykh.task1.solve1;

/**
 * Author: ryabykh_ms (upstrocker)
 * Email: upstrocker@gmail.com
 * GitHub: https://github.com/upstrocker
 * Variant: 1
 */

public class AdderMain {

    /**
     * Суммирует элементы массива naturalNumbers, кратные multiplicity
     * @param naturalNumbers - массив натуральных чисел
     * @param multiplicity - число, которому должны быть кратны элементы массива
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
        int[] naturalNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
        int multiplicity = 2;
        System.out.println(summarize(naturalNumbers, multiplicity));
    }
}

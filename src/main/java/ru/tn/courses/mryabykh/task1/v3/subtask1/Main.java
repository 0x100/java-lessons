package ru.tn.courses.mryabykh.task1.v3.subtask1;

import ru.tn.courses.mryabykh.utils.ArrayUtils;

/**
 * Author: ryabykh_ms (upstrocker)
 * Email: upstrocker@gmail.com
 * GitHub: https://github.com/upstrocker
 */

public class Main {

    /**
     * Проверяет, положителен ли первый элемент массива.
     *
     * @param array - массив для проверки
     * @return положителен ли первый элемент массива?
     * @throws IllegalArgumentException - если массив содержит только нули или вообще ничего не содержит
     */
    private static boolean isPositiveFirst(int[] array) throws IllegalArgumentException {
        if (array != null && array.length != 0 && !isZeros(array)) {
            return array[0] > 0;
        }
        throw new IllegalArgumentException("Массив содержит только нули или ничего!");
    }

    /**
     * Проверяет, является ли массив нулевым
     *
     * @param array - массив для проверки
     * @return массив нулевой?
     */
    private static boolean isZeros(int[] array) {
        for (int item : array) {
            if (item != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] sequence = ArrayUtils.fillRandomIntArray();
        ArrayUtils.printArray(sequence, "Исходный массив:");
        try {
            if (isPositiveFirst(sequence)) {
                System.out.println("Раньше встречается положительное число.");
            } else {
                System.out.println("Раньше встречается отрицательное число.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Массив содержит только нули или ничего!");
        }
    }
}

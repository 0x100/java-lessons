package ru.tn.courses.mryabykh.task1.v1.subtask3;

import ru.tn.courses.mryabykh.utils.ArrayUtils;

import java.util.Arrays;

/**
 * Author: ryabykh_ms (upstrocker)
 * Email: upstrocker@gmail.com
 * GitHub: https://github.com/upstrocker
 */

public class Main {

    /**
     * Образовывает неубывающую последовательность чисел из двух исходных
     *
     * @param sequenceA - первая последовательность
     * @param sequenceB - вторая последовательность
     * @return - неубывающая последовательность чисел
     */
    private static int[] sortDoubleSequences(int[] sequenceA, int[] sequenceB) {
        int[] result = new int[sequenceA.length + sequenceB.length];

        System.arraycopy(sequenceA, 0, result, 0, sequenceA.length);
        System.arraycopy(sequenceB, 0, result, sequenceA.length, sequenceB.length);
        Arrays.sort(result);

        return result;
    }

    public static void main(String[] args) {
        int[] a = ArrayUtils.fillRandomIntArray();
        int[] b = ArrayUtils.fillRandomIntArray();
        ArrayUtils.printArray(a, "Исходный массив A:");
        ArrayUtils.printArray(b, "Исходный массив B:");
        ArrayUtils.printArray(sortDoubleSequences(a, b), "Неубывающая последовательность из массивов A и B:");
    }
}

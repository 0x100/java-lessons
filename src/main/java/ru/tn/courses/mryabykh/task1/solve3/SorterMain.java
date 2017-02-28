package ru.tn.courses.mryabykh.task1.solve3;

import java.util.Arrays;

/**
 * Author: ryabykh_ms (upstrocker)
 * Email: upstrocker@gmail.com
 * GitHub: https://github.com/upstrocker
 * Variant: 1
 */

public class SorterMain {

    /**
     * Образовывает неубывающую последовательность чисел из двух исходных
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
        int[] a = {1, 3, 4, 6, 7, 8, 9, 10, 12, 13, 29};
        int[] b = {2, 5, 11, 23, 24, 25, 26, 27, 28, 30};
        System.out.println(Arrays.toString(sortDoubleSequences(a, b)));
    }
}

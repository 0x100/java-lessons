package ru.tn.courses.mryabykh.utils;

import java.util.Arrays;
import java.util.Random;

/**
 * Author: ryabykh_ms (upstrocker)
 * Email: upstrocker@gmail.com
 * GitHub: https://github.com/upstrocker
 */

public class ArrayUtils {

    private static final int DEFAULT_ARRAY_SIZE = 10;
    private static final int DEFAULT_ARRAY_LOW_BOUND = 0;
    private static final int DEFAULT_ARRAY_UPPER_BOUND = 100;
    private static final int DEFAULT_ARRAY_NEGATIVE_LOW_BOUND = -100;

    public static int[] fillRandomIntArray(int size, int lowBound, int upperBound) {
        return new Random().ints(size, lowBound, upperBound).toArray();
    }

    public static int[] fillRandomUintArray() {
        return new Random().ints(DEFAULT_ARRAY_SIZE, DEFAULT_ARRAY_LOW_BOUND, DEFAULT_ARRAY_UPPER_BOUND).toArray();
    }

    public static int[] fillRandomIntArray() {
        return new Random().ints(DEFAULT_ARRAY_SIZE, DEFAULT_ARRAY_NEGATIVE_LOW_BOUND, DEFAULT_ARRAY_UPPER_BOUND).toArray();
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void printArray(int[] array, String message) {
        System.out.println(message + " " + Arrays.toString(array));
    }
}

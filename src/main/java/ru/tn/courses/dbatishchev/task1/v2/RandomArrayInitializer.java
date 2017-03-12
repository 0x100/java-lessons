package ru.tn.courses.dbatishchev.task1.v2;

import java.util.Random;

/**
 * Created by crash on 12.03.2017.
 */
public class RandomArrayInitializer {
    public static int[] randomIntSequence(long size, int lowBound, int upperBound) {
        return new Random().ints(size, lowBound, upperBound).toArray();
    }
}

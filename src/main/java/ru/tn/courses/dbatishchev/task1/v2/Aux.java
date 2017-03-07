package ru.tn.courses.dbatishchev.task1.v2;

import java.util.Random;

/**
 * Created by ii343hbka on 01/03/2017.
 */
public class Aux {
    public static int[] randomIntSequence(long size, int lowBound, int upperBound) {
        return new Random().ints(size, lowBound, upperBound).toArray();
    }
}
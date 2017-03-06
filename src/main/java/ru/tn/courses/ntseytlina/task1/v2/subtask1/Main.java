package ru.tn.courses.ntseytlina.task1.v2.subtask1;


import java.util.Arrays;
import java.util.Random;

public class Main {
    private static int [] array;
    private static int [] zeroIndexes;
    private static final int size = 15;
    private static int zeroCounter;

    public static void main (String [] args) {
        init();
        findZeroIndexes();
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(zeroIndexes));
    }

    public static void init () {
        array = new int[size];
        zeroCounter = 0;
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size);
            if (array[i] == 0) {
                zeroCounter++;
            }
        }
    }

    public static void findZeroIndexes () {
        zeroIndexes = new int[zeroCounter];
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == 0) {
                zeroIndexes[counter] = i;
                counter++;
            }
        }
    }
}

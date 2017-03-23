package ru.tn.courses.mmaters.task1.v4.subtask2;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int number = 33;
        int[] arr = new int[number];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++ )
            arr[i] = random.nextInt(20);

        for (int i = 1; i < arr.length; i *= 2)
            System.out.println(i + " элемент = " + arr[i]);
        System.out.println("Массив:\n" + Arrays.toString(arr));

    }
}

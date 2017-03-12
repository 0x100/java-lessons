package ru.tn.courses.mmaters.task1.v4.subtask2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int n = 33;
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++ )
            arr[i] = (int) (Math.random() * n);

        for (int i = 1; i < arr.length; i *= 2)
            System.out.println(i + " элемент = " + arr[i]);
        System.out.println("Массив:\n" + Arrays.toString(arr));

    }
}

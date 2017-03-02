package ru.tn.courses.task1subtask2v4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int n = 33;
        int[] mas = new int[n];

        for (int i = 0; i < mas.length; i++ )
            mas[i] = (int) (Math.random() * n);

        for (int i = 1; i < mas.length; i *= 2)
            System.out.println(i + " элемент = " + mas[i]);
        System.out.println("Массив:\n" + Arrays.toString(mas));

    }
}

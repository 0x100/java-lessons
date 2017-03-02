package ru.tn.courses.task1subtask1v4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        boolean bool = true;
        int k = 7;
        int n = 37;
        int[] mas = new int[k];

        for (int i = 0; i < mas.length; i++)
            mas[i] = (int) (Math.random() * n);

        for (int i = 0; i < mas.length - 1; i++) {

            if (mas[i] > mas[i + 1]) {
                bool = false;
                break;
            }
        }
        System.out.println(Arrays.toString(mas));
        System.out.println("Массив возрастающий? " + bool);
    }
}

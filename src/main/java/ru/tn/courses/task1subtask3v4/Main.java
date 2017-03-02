package ru.tn.courses.task1subtask3v4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int n = 10;
        int k = 50;
        int [] mas = new int[n];
        for (int i = 0; i < mas.length; i++)
            mas[i] = (int) (Math.random() * k);
        System.out.println("Первоначальный массив: \n" + Arrays.toString(mas));

        int j , c;
        for (int i = 1; i < mas.length; i++){
            c = mas[i];
            for (j = i - 1; j >= 0 && mas[j] > c; j--) {
                mas[j + 1] = mas[j];

            }
            mas[j + 1] = c;
        }

        System.out.println("Отсортированный массив: \n" + Arrays.toString(mas));


    }
}

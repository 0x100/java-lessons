package ru.tn.courses.mmaters.task1.v4.subtask3;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int number = 10;
        Random random = new Random();
        int [] arr = new int[number];
        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(50);
        System.out.println("Первоначальный массив: \n" + Arrays.toString(arr));

        int j , c;
        for (int i = 1; i < arr.length; i++){
            c = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > c; j--) {
                arr[j + 1] = arr[j];

            }
            arr[j + 1] = c;
        }

        System.out.println("Отсортированный массив: \n" + Arrays.toString(arr));


    }
}

package ru.tn.courses.mmaters.task1.v4.subtask1;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int number = 5;
        Random random = new Random();
        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(20);

        System.out.println(Arrays.toString(arr));
        System.out.println("Массив возрастающий? " + check(arr));
    }

     private static boolean check(int[] arr){
        boolean bool = true;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                bool = false;
                break;
            }

        }
        return bool;

    }
}

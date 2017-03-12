package ru.tn.courses.mizvarin.task1.v5.subtask1;
/**
 * Created by Макс on 09.03.2017.
 *Задание №1
 *Дана последовательность натуральных чисел a1, a2, ..., an. Создать массив из четных чисел этой последовательности.
 *Если таких чисел нет, то вывести сообщение об этом факте.
 */
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        int[] a = new int[50];
        Random rand = new Random();
        System.out.println("Исходный массив:");
        for (int i = 0; i < a.length; i++){
            a[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(a));

        int quantity = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] % 2 == 0 & a[i] != 0){quantity++;}
        }
        if (quantity == 0){
            System.out.println("В данном массиве четных чисел нет");
        }else{

            int[] b = new int[quantity];
            int j = 0;
            for (int i = 0; i < a.length; i++){
                if (a[i] % 2 == 0 & a[i] != 0) {
                    b[j] = a[i];
                    j++;
                }
            }
            System.out.println("Результирующий массив:");
            System.out.println(Arrays.toString(b));
        }
    }
}

package ru.tn.courses.mizvarin.task1.v5.subtask2;

/**
 * Created by Макс on 09.03.2017.
 * Задание 2
 * Каждый солнечный день улитка, сидящая на дереве, поднимается вверх на 2 см, а каждый пасмурный день опускается вниз
 * на 1 см, В начале наблюдения улитка находится в A см от земли на B-метровом дереве. Имеется 30-элементный массив
 * содержащий сведения о том, был ли соответствующий день наблюдения пасмурным или солнечным. Написать программу
 * определяющую местоположение улитки к концу 30-го дня наблюдения.,
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Введите длину дерева в метрах");
        int c = enter.nextInt() * 100;
        System.out.println("Введите расстояние улитки от земли в см");
        int b = enter.nextInt();
        int[] a = new int[30];
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(2);

        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                b = b + 2;
            } else {
                b = b - 1;
            }
            if (b > c) {
                b = c;
                i++;
            }else{
                if (b < 0) {
                    b = 0;
                    i++;
                }
            }

        }
        System.out.println("Улитка находится на расстоянии " + b + " см от земли");
    }
}
package ru.tn.courses.ekarpenko.task1.v5.subtask1;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Eduard on 05.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        int a[] = new int[30];
        Random rand = new Random();
        int kol=0;
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(100);// произвольная числовая последовательность
        }
        for (int i=0; i<a.length; i++) {
            if (a[i]%2 == 0) kol++; //подсчитываем количество четных элементов в массиве а
        }
        int b[] = new int[kol];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if ((a[i]) % 2 == 0 & a[i]!=0) {
                b[j]=(a[i]);
                j++;
            }// записываем четное число в массив b
        }
        if (b.length == 0) {
            System.out.println("Четных чисел нет");//  проверяем массив b на пустоту
        } else {
            System.out.println("Исходный массив из четных и нечетных чисел");
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);// выводим элемменты массива a
            }
            System.out.println("Массив из четных чисел");
            for (int i = 0; i < b.length; i++) {
                System.out.println(b[i]);// выводим элемменты массива b
            }
        }
    }
}
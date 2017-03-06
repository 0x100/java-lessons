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

        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(100);// произвольная числовая последовательность
        }
        ArrayList<Integer> b = new ArrayList<Integer>();// создаем динамический массив для последующей записи в него четных чисел

        for (int i = 0; i < a.length; i++) {
            if ((a[i]) % 2 == 0 & a[i]!=0) {
                b.add(a[i]);
            }// записываем четное число в массив b
        }

        if (b.size() == 0) {
            System.out.println("Четных чисел нет");//  проверяем массив b на пустоту
        } else {
            for (int i = 0; i < b.size(); i++) {
                System.out.println(b.get(i));// выводим элемменты массива b
            }
        }
    }
}

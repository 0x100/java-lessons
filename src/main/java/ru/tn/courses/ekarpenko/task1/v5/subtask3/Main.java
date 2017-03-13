package ru.tn.courses.ekarpenko.task1.v5.subtask3;
import java.util.Random;
/**
 * Created by Eduard on 05.03.2017.
 */
public class Main {
    public static void main (String[] args) {
        int a[] = new int[30];
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(100);
        }
        System.out.println("Исходная числовая последовательность:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        int j = 0;
        //сортировка
        while (j<a.length-1) {
            if (a[j] <= a[j+1]) j++;
            else { int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                    if (j>0) j--;
            }
        }
        System.out.println("Отсортированная числовая последовательность:");
        for (int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
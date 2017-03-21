package ru.tn.courses.mizvarin.task1.v5.subtask3;

import java.util.Arrays;
import java.util.Random;
/**
 * Created by Макс on 12.03.2017.
 * Задание 3
 * Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию. Делается это следующим
 * образом: сравниваются два соседних элемента ai и аi+1. Если ai ≤ ai+1, то продвигаются на один элемент вперед.
 * Если ai > ai+1, то производится перестановка и сдвигаются на один элемент назад. Составить алгоритм этой сортировки.
 */
public class Main {
    public static void main(String[] args){
        int[] mass = new int[15];
        Random rand = new Random();
        System.out.println("Исходный массив:");
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(mass));
        Sorter sort = new Sorter(mass);
        mass = sort.ShellSort();
        System.out.println("Результирующий массив:");
        System.out.println(Arrays.toString(mass));

    }
}


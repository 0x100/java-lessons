package ru.tn.courses.ssirotenko.task1.v3.subtask3;


import java.util.Arrays;

/*
Сортировка обменами. Дана последовательность чисел а1, а2, ..., аn.
Требуется переставить числа в порядке возрастания.
Для этого сравниваются два соседних числа аi и ai+1.
Если аi > аi+1, то делается перестановка.
Так продолжается до тех пор, пока все элементы не станут
расположены в порядке возрастания. Составить алгоритм сортировки,
подсчитывая при этом количество перестановок.
 */
public class Main {
    private static final int SIZE = 10;

    public static void main(String[] args) {

        int[] array = new int[SIZE];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * SIZE);
            System.out.print(" " + array[i] + " ");
        }

        exchangeSort(array);

    }

    private static void exchangeSort(int[] ints) {

        int shift = 0;

        for (int i = 0; i < ints.length; i++) {
            for (int j = ints.length - 1; j > i; j--) {
                if (ints[j] < ints[j - 1]) {
                    int temp = ints[j];
                    ints[j] = ints[j - 1];
                    ints[j - 1] = temp;
                    shift += 1;
                }
            }
        }

        System.out.println();
        System.out.println("Перестановок: " + shift);
        System.out.println(Arrays.toString(ints));
    }

}

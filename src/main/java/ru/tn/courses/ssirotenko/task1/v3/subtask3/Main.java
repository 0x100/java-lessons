package ru.tn.courses.ssirotenko.task1.v3.subtask3;

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
            System.out.print("[" + array[i] + "]");
        }

        Sorting sorting = new Sorting(array);
        sorting.exchangeSort();

        for (int i = 0; i < SIZE; i++) {
            System.out.print("[" + array[i] + "]");
        }

    }
}

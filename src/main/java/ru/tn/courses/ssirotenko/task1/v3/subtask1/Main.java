package ru.tn.courses.ssirotenko.task1.v3.subtask1;

/*
Дана последовательность целых чисел a1, a2, ..., an.
Выяснить, какое число встречается раньше – положительное или отрицательное.
 */
public class Main {
    private static final int SIZE = 20;

    public static void main(String[] args) {

        int[] array = new int[SIZE];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * SIZE - SIZE/2) ;
            System.out.print("[" + array[i] + "]");
        }

        System.out.println();
        getFirstNumber(array);
    }

    private static void getFirstNumber(int[] ints) {
        for (int anArray : ints) {
            if (anArray > 0) {
                System.out.println("Раньше – положительное");
                break;
            } else if (anArray < 0) {
                System.out.println("Раньше - отрицательное");
                break;
            }

        }
    }
}

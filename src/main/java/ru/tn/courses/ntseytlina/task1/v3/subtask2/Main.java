package ru.tn.courses.ntseytlina.task1.v3.subtask2;

import java.util.Arrays;
import java.util.Random;

/**
 * Секретный замок для сейфа состоит из 10 расположенных в ряд ячеек,
 * в которые надо вставить игральные кубики.
 * Но дверь открывается только в том случае,
 * когда в любых трех соседних ячейках сумма точек на передних гранях кубиков равна 10.
 * (Игральный кубик имеет на каждой грани от 1 до 6 точек.)
 * Напишите программу, которая разгадывает код замка при условии,
 * что два кубика уже вставлены в ячейки.
 */

public class Main {

    private static final int size = 10;
    private static int [] array;
    private static int edgesSize = 6;
    private static int first, second;

    public static void main (String [] args) {
        init();

        System.out.println("array [" + first + "] = " + array[first]);
        System.out.println("array [" + second + "] = " + array[second]);
        System.out.println();

        generate();
    }

    private static void init () {
        array = new int[size];

        Random random = new Random();

        do {
            first = random.nextInt(edgesSize);
            second = random.nextInt(edgesSize);

            if (first > second) {
                int temp = first;
                first = second;
                second = temp;
            }
        } while (first == second);
        array[first] = random.nextInt(edgesSize) + 1;
        array[second] = random.nextInt(edgesSize) + 1;
    }

    private static void generate () {
        if (Math.abs(first - second) % 3 != 0 && (array[first] + array[second]) >= 4 && (array[first] + array[second]) <= 9) {

            if (first <= size - 3) {
                array[first + Math.abs(first - second) % 3] = array[second];
                if (Math.abs(first - second) % 3 == 1) {
                    array[first + 2] = 10 - array[first + 1] - array[first];
                }
                if (Math.abs(first - second) % 3 == 2) {
                    array[first + 1] = 10 - array[first + 2] - array[first];
                }
            }

            for (int i = first - 1; i >= 0; i--) {
                array[i] = 10 - array[i + 1] - array[i + 2];
            }

            for (int i = first + 3; i < size; i++) {
                array[i] = 10 - array[i - 1] - array[i - 2];
            }

            System.out.println(Arrays.toString(array));

        } else if (array[first] == array[second]) {
            array[first + 1] = (10 - array[first]) / 2;
            for (int i = first - 1; i >= 0; i--) {
                array[i] = 10 - array[i + 1] - array[i + 2];
            }

            for (int i = first + 2; i < size; i++) {
                array[i] = 10 - array[i - 1] - array[i - 2];
            }

            System.out.println(Arrays.toString(array));

        } else {
            System.out.println("No");
        }

    }
}

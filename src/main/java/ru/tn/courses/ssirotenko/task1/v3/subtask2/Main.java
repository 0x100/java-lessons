package ru.tn.courses.ssirotenko.task1.v3.subtask2;

import java.util.Arrays;

/*
Секретный замок для сейфа состоит из 10 расположенных в ряд ячеек,
в которые надо вставить игральные кубики.
Но дверь открывается только в том случае,
когда в любых трех соседних ячейках сумма точек на передних гранях
кубиков равна 10. (Игральный кубик имеет на каждой грани от 1 до 6 точек.)
Напишите программу, которая разгадывает код замка при условии,
что два кубика уже вставлены в ячейки.
 */
public class Main {
    private static final int DICE_MAX_VALUE = 6;
    private static final int SIZE = 10;
    private static final int MIN_SUM = 4;
    private static final int MAX_SUM = 9;

    public static void main(String[] args) {
        int[] array = getInitialRandomArray();
        System.out.println(Arrays.toString(array));

        getCode(array);
    }

    private static int[] getInitialRandomArray() {
        int[] initialArray = new int[SIZE];

        int dice1 = (int)(Math.random() * DICE_MAX_VALUE + 1);
        int dice2 = (int)(Math.random() * DICE_MAX_VALUE + 1);
        int indexDice1 = (int)(Math.random() * SIZE);
        int indexDice2 = (int)(Math.random() * SIZE);

        if (indexDice1 != indexDice2) {
            initialArray[indexDice1] = dice1;
            initialArray[indexDice2] = dice2;
        } else {
            getInitialRandomArray();
        }

        return initialArray;
    }

    private static void getCode(int[] array) {
        int indexDice1 = 0;
        int indexDice2 = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[indexDice1] == 0) {
                indexDice1 = i;
            } else if (array[indexDice1] > 0 && array[i] > 0) {
                indexDice2 = i;
            }
        }

        int sum = array[indexDice1] + array[indexDice2] ;

        int[] tmp = new int[3];
        tmp[0] = array[indexDice1];
        tmp[1] = array[indexDice2];
        tmp[2] = SIZE - sum;

        if (sum >= MIN_SUM && sum <= MAX_SUM) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) {
                    array[i] = tmp[i % 3];
                }
            }
            System.out.println(Arrays.toString(array));
        } else {
            System.out.println("Ошибка доступа, попробуйте еще раз.");
        }
    }

}

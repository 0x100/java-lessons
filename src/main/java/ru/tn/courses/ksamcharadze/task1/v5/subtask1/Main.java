/**
 * Created by Коба on 02.03.2017.
 * Вариант 5.
 * Дана последовательность натуральных чисел a1, a2, ..., an.
 * Создать массив из четных чисел этой последовательности.
 * Если таких чисел нет, то вывести сообщение об этом факте.
 */

public class Main {

    private int [] arrCurrent = {1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,17,17,20,22,4};
    private int [] arrNext;

    public void printEvenArr() {

        int j = 0;
        for (int i = 0; i < arrCurrent.length; i++)
            if (arrCurrent[i] % 2 == 0) j++;

        if (j == 0) System.out.println("Not of even elements");
        else {
            arrNext = new int[j]; j = 0;
            for (int i = 0; i < arrCurrent.length; i++)
                if (arrCurrent[i] % 2 == 0) arrNext[j++] = arrCurrent[i];

            for (int i = 0; i < arrNext.length; i++) System.out.print(arrNext[i] + " ");
            System.out.println("\nTotal " + j + " elements");
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.printEvenArr();
    }


}


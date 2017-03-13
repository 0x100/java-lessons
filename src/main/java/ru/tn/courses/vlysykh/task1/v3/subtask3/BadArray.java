package ru.tn.courses.vlysykh.task1.v3.subtask3;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by ElemenT87 on 04.03.2017.
 */
public class BadArray {
    public static final int SIZE = 4;
    public static final int BOUND = 100;
    private int [] numbers;

    public BadArray() {
        Random rnd = new Random();
        int[] array = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array[i] = rnd.nextInt(BOUND);
        }
        this.numbers = array;
    }

    public void showArray() {
        System.out.println(Arrays.toString(this.numbers));
    }

    public void bubbleSort(){
        int count = 0;
        for (int i=0; i<numbers.length-1; i++){
            for (int j=0; j<numbers.length-1; j++){
                if (numbers[j] > numbers[j+1]) {
                    int tmp = numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=tmp;
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println("Массив отсортирован методом перестановок.");
        System.out.println("Общее количество перестановок:  "+count);
        showArray();
    }
}

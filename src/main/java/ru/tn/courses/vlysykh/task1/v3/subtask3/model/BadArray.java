package ru.tn.courses.vlysykh.task1.v3.subtask3.model;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by ElemenT87 on 04.03.2017.
 */
public class BadArray {
    private int [] numbers;

    public BadArray(int[] numbers) {
        this.numbers = numbers;
    }

    public BadArray(int size, int bound) {
        Random rnd = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rnd.nextInt(bound * 2) - bound;
        }
        this.numbers = array;
    }

    public void showArray() {
        System.out.println(Arrays.toString(this.numbers));
    }

    public void bubbleSortArray(){
        int flag = 0;
        for (int i=0; i<numbers.length-1; i++){
            flag = flag + bubbleSort();
        }
        System.out.println();
        System.out.println("Массив отсортирован методом перестановок.");
        System.out.println("Общее количество перестановок: "+flag);
    }

    public int bubbleSort() {
        int flag = 0;
        for (int i=0; i<numbers.length-1; i++){
            if (numbers[i] > numbers[i+1]) {
                    int tmp = numbers[i];
                    numbers[i]=numbers[i+1];
                    numbers[i+1]=tmp;
                    flag++;
            }
        }
        return flag;
    }
}

package ru.tn.courses.vlysykh.task1.v3.subtask1;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by ElemenT87 on 02.03.2017.
 */
public class SuperArray {
    public static final int SIZE = 10;
    private int [] numbers;

    public SuperArray() {
        Random rnd = new Random();
        int [] array = new int [SIZE];
        for (int i = 0; i< SIZE; i++) {
                array[i] = rnd.nextInt();
        }
        this.numbers = array;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void showArray() {
        System.out.println(Arrays.toString(this.numbers));
    }

    public void whoFirst(){
        if (isFirstPositive()) {
            System.out.println("Первое число положительное");
        } else {
            System.out.println("Первое число отрицательное");
        }
    }

    public final boolean isFirstPositive() {
        for(int superArray: getNumbers()){
                 if (superArray == 0) {
                     continue;
                 }else if (superArray < 0) {
                     return false;
                } else {
                    return true;
                 }
            }
        throw new IllegalArgumentException("All elements are zeros or array length is zero");
    }
}

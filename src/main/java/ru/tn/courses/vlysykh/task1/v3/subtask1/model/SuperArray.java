package ru.tn.courses.vlysykh.task1.v3.subtask1.model;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by ElemenT87 on 02.03.2017.
 */
public class SuperArray {
    private int [] numbers;

    public SuperArray(int size, int bound) {
        Random rnd = new Random();
        int [] array = new int [size];
        for (int i = 0; i< size; i++) {
            array[i] = rnd.nextInt(bound*2)-bound;
        }
        this.numbers = array;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void showArray() {
        System.out.println(Arrays.toString(this.numbers));
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

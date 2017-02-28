package ru.tn.courses.ntseytlina.task1.v2.subtask3;

public class Array {
    private int [] array;
    private int size;

    public Array(int size) {
        this.size = size;
        array = new int[this.size];
        for (int i = 0; i < this.size; i++) {
            array [i] = (int) (Math.random() * 100);
        }
    }

    public void selectionSort () {
        for (int i = 0; i < size; i++) {
            int max = i;
            for (int j = i + 1; j < size; j++) {
                if (array[max] < array[j]) {
                    max = j;
                }
            }
            int temp = array[max];
            array[max] = array[i];
            array[i] = temp;
        }
    }

    @Override
    public String toString() {
        String str = "[ ";
        for (int i = 0; i < size; i++) {
            str += array[i] + " ";
        }
        str += "]";
        return str;
    }
}

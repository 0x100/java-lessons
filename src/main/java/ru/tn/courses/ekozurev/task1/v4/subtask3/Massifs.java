package ru.tn.courses.ekozurev.task1.v4.subtask3;

/**
 * Created by Egor on 31.05.2017.
 */
public class Massifs {
    public boolean checkArrayGrowth(double mass[]) {
        short i = 1;
        int massSize = mass.length;

        while (i <= massSize - 1) {
            if (mass[i - 1] > mass[i]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public int[] insertionSort(int arr[]) {
        int temp, j;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                j = i;
                while (j > 0 && temp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = temp;
            }
        }
        return arr;
    }
}

package ru.tn.courses.ksagradyan.task1.v4.subtask3;

/**
 * Created by Mangekyou on 13.03.2017.
 */
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int m, n;
        int arr[]={1,2,3,33,66,33,6,7,4,7,2,9,5,8,56,4,56,99,656,434};
        for (int i = 1; i < arr.length; i++)
        {
            n = arr[i];
            for (m = i - 1; m >= 0 && arr[m] > n; m--)
            {
                arr[m + 1] = arr[m];
            }
            arr[m + 1] = n;
        }
        System.out.println("Массив после сортировки вставками: \n" + Arrays.toString(arr));
    }
}

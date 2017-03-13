package ru.tn.courses.ksagradyan.task1.v4.subtask2;

/**
 * Created by Mangekyou on 13.03.2017.
 */
public class Main {
    public static void main(String[] args)
    {
        int arr[]= {1,3,5,6,10,16,24,32,64,55,33,66,77,33,43,1,56,9};
        for (int i = 1; i < arr.length; i=i*2)
        {
            System.out.println(arr[i]);
        }
    }
}
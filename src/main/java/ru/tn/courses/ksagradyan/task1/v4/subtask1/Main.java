package ru.tn.courses.ksagradyan.task1.v4.subtask1;

/**
 * Created by Mangekyou on 13.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        int g = 0;
        int arr[]= {1,2,3,6} ;
        for (int i = 0;i < arr.length-1;i++)
        {
            if (arr[i] > arr[i+1])
            {
                g++;
            }
        }
        if(g==0)
        {
            System.out.println("Последовательность  возрастающая");
        }
        else
            System.out.println("убывающая");
    }
}

package ru.tn.courses.dchernomorets.task1.v4.subtask2;
import java.util.Random;

/**
 * Created by ccc on 03.03.2017.
 */
public class Main {
    public static void main(String[] args){
        int[] Arr=new int[10];
        Random r=new Random();
        System.out.println("Массив: ");
        for(int j=0;j<Arr.length;j++)
        {
            Arr[j]=r.nextInt(100);
            System.out.print(Arr[j]+" ");
        }
        System.out.println();
        int i=1;
        while(i<Arr.length) {
            System.out.println("Индекс: " +i+", Элемент массива: "+ Arr[i]);
            i *= 2;
        }
    }
}

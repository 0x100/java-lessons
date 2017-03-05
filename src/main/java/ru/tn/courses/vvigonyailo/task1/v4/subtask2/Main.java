package ru.tn.courses.vvigonyailo.task1.v4.subtask2;
import java.util.Scanner;

/**
 * Created by Vitechechek on 04.03.2017.
 */
public class Main {
    public static void main(String[] args)
    {
        int arrayLenght;
        int index = 1;

        Scanner strIn = new Scanner(System.in);

        System.out.print("Enter lenght of your array: ");
        arrayLenght = strIn.nextInt();
        int array[] = new int[arrayLenght];

        for(int i =0; i < arrayLenght; i++)
        {
            array[i] = (int)(Math.random() * 100);
            System.out.print("["+ i + "] - " + array[i] + "   ");
        }

        System.out.println();

        while(index < arrayLenght)
        {
            System.out.println(" " + index + " element: " + array[index]);
            index *= 2;
        }
    }
}

package ru.tn.courses.vvigonyailo.task1.v4.subtask3;

/**
 * Created by Vitechechek on 04.03.2017.
 */
public class Main {
    public static void main(String[] args)
    {
        int temp, sortItetator;
        int[] array = new int[10];

        System.out.println("Unsort array:");

        for(int i = 0; i < array.length; i++)
        {
            array[i] = (int)(Math.random() * 100);
            System.out.print("[" + (i) + "] - " + array[i] + "  ");
        }

        for(int i = 0; i < array.length - 1; i++){
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                array[i + 1] = array[i];
                sortItetator = i;
                while (sortItetator > 0 && temp < array[sortItetator - 1]) {
                    array[sortItetator] = array[sortItetator - 1];
                    sortItetator--;
                }
                array[sortItetator] = temp;
            }
        }

        System.out.println("\nSort array:");

        for(int i = 0; i < array.length; i++)
        {
            System.out.print("[" + (i) + "] - " + array[i] + "  ");
        }
    }
}

package ru.tn.courses.vvigonyailo.task1.v4.subtask1;

import java.util.Scanner;

/**
 * Created by Vitechechek on 04.03.2017.
 */
public class Main {
    public static void main(String[] args)
    {
        int sequenceLenght;
        int isIncreasing = 0;

        Scanner strIn = new Scanner(System.in);

        System.out.print("Enter lenght of your sequence: ");
        sequenceLenght = strIn.nextInt();

        System.out.println("Now enter your sequence:");
        double sequence[] = new double[sequenceLenght];
        for (int i = 0; i < sequenceLenght; i++)
        {
            System.out.print("  " + (i+1) + " element: ");
            sequence[i] = strIn.nextDouble();
        }

        for(int i = 0; i < (sequenceLenght - 1); i++)
        {
            if(sequence[i] < sequence[i+1])
            {
                isIncreasing += 1;
            }
        }

        if(isIncreasing == (sequenceLenght - 1))
        {
            System.out.println("Sequensce is increasing.");
        }
        else
        {
            System.out.println("Sequensce is not increasing.");
        }

    }
}

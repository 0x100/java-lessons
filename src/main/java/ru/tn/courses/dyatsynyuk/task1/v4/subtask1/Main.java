package ru.tn.courses.dyatsynyuk.task1.v4.subtask1;

import java.util.Arrays;
import java.util.Random;

public class Main{

    private final int SIZE=10;
    private double[] data=new double[SIZE];

    private void insertData()
    {
        for(int i=0; i<SIZE; i++)
        {
            data[i]=randomFill();
        }
    }

    private double randomFill(){

        Random rand = new Random();
        double randomNum = rand.nextInt();
        return randomNum;
    }

    public boolean checkSequence()
    {
        boolean result=true;
        for(int i=0; i<SIZE-1; i++)
        {
            if(data[i]>=data[i+1])
            {
                result=false;
                break;
            }
        }
        return result;
    }

    public void printArray()
    {
        System.out.println(Arrays.toString(data));
    }

    public Main(){
        insertData();
        printArray();
    }

    public static void main(String [ ] args)
    {
        Main array=new Main();
        System.out.println(array.checkSequence()? "Yes":"No");
    }
}

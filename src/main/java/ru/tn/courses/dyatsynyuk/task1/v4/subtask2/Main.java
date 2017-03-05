package ru.tn.courses.dyatsynyuk.task1.v4.subtask2;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by dasha on 28.02.2017.
 */
public class Main{

    private final int SIZE=10;
    private int[] data=new int[SIZE];

    private void insertData()
    {
        for(int i=0; i<SIZE; i++)
        {
            data[i]=randomFill();
        }
    }

    private int randomFill(){

        Random rand = new Random();
        int randomNum = rand.nextInt();
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

    public void printIndexes(){
        int index=1;
        int step=0;
        while(index<SIZE)
        {
            System.out.println(data[index]);
            step++;
            index= (int) Math.pow(2,step);
        }
    }

    public static void main(String [ ] args)
    {
        Main array=new Main();
        array.printIndexes();
    }

}

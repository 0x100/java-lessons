package ru.tn.courses.dyatsynyuk.task1.v4.subtask3;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by dasha on 28.02.2017.
 */
public class Main {

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

    public void insertSort()
    {
        int temp, j;
        for(int i = 0; i < data.length - 1; i++){
            if (data[i] > data[i + 1]) {
                temp = data[i + 1];
                data[i + 1] = data[i];
                j = i;
                while (j > 0 && temp < data[j - 1]) {
                    data[j] = data[j - 1];
                    j--;
                }
                data[j] = temp;
            }
        }
    }

    public static void main(String [ ] args)
    {
        Main array=new Main();
        array.insertSort();
        array.printArray();
    }
}
